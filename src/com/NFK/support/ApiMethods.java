package com.NFK.support;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;

import com.NFK.version1.android.beans.UserDetailBeans;
import com.NFK.version1.android.pages.SignupPageAndroid;
import com.NFK.version1.iOS.pages.LoginPageIOS;
import com.NFK.web.common.pages.LoginPage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;


public class ApiMethods extends RestTestBase {
	private String baseURL = "https://test.lfsdigital.com/";
	private String contentType = "application/json";
	private String platform = "android";
	private String language = "en_US";
	private String country = "US";
	private String appName = "CGM_MOBILE_ANDROID";
	private String appOriginRT = "RealTime";
	private String appVersionRT = "1.0-adhoctest";
	private String connection = "Keep-Alive";
	String globalUserId;
	String password = "Testing@12345";
	String authToken;


	public String createAccountNFK(String fName, String lName, String email, String password) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("firstName", fName);
		data.put("lastName", lName);
		data.put("emailAddress", email);
		data.put("password", password);
		data.put("gender", "M");
		data.put("dateOfBirth", "19961104");
		data.put("diabetesType", "DIABETES_TYPE_2");

		String response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("optin", "false").header("cliniccode", "").header("appname", this.appName)
//				.header("requesttoken", encryptToSHA(encryptToSHA(email) + email)).header("apporigin", this.appOriginFA)
//				.header("appversion", this.appVersionFA).header("Connection", this.connection)
				.post(String.class, new Gson().toJson(data));

		return response;
	}

	public String loginNFK(String email, String password) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("login", email);
		data.put("password", password);

		String response = getWebResource(this.baseURL, "cgm/user/v1/login").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("appname", this.appName).header("apporigin", this.appOriginRT)
				.header("appversion", this.appVersionRT).header("Connection", this.connection)
				.post(String.class, new Gson().toJson(data));

		return response;
	}
	
	public String signupNFK(String userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}
		System.out.println(ConfigurationManager.getBundle().getProperty("register.email.key"));
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		Map<String, String> data = new HashMap<String, String>();
		data.put("emailsignup", email);
		data.put("confirmemail",email);
		data.put("password", userBean.getPassword());
		data.put("confirmpassword", userBean.getPassword());
		data.put("fname",userBean.getFirstName());
		data.put("lname",userBean.getLastName());
		

		String response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("appname", this.appName).header("apporigin", this.appOriginRT)
				.header("appversion", this.appVersionRT).header("Connection", this.connection)
				.post(String.class, new Gson().toJson(data));

		return response;
	}

	public String getAllFollowers(String token) {
		String response = getWebResource(this.baseURL, "cgm/follower/v1").header("Content-Type", this.contentType)
				.header("Content-Type", this.contentType).header("platform", this.platform)
				.header("language", this.language).header("country", this.country).header("appname", this.appName)
				.header("apporigin", this.appOriginRT).header("appversion", this.appVersionRT)
				.header("Connection", this.connection).header("authorization", token).get(String.class);

		return response;
	}

	public String updateAppOrigin(String token) {
		Map<String, Object> data2 = new LinkedHashMap<String, Object>();
		data2.put("key", "PATIENT_APP_ORIGIN");
		data2.put("lastUpdatedDate", System.currentTimeMillis());
		data2.put("value", "RealTime");

		Object ob[] = { data2 };
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("config", ob);
		data.put("uom", "mg/dL");

		Gson js = new Gson();

		MyClient my = new MyClient();
		my.createClient();
		String response = "";
		try {
			response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
					.header("platform", this.platform).header("language", this.language).header("country", this.country)
					.header("appname", this.appName).header("apporigin", this.appOriginRT)
					.header("appversion", this.appVersionRT).header("Connection", this.connection)
					.header("authorization", token).method("PATCH", String.class, js.toJson(data));
		} catch (Exception e) {
		}

		return response;
	}

	public String sendInvite(String token, String name, String followerEmail) {
		Map<String, String> data2 = new HashMap<String, String>();
		data2.put("allowNotification", "false");
		data2.put("allowTrendGraphView", "true");
		data2.put("sensorExpirationDateEnabled", "true");

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", name);
		data.put("email", followerEmail);
		data.put("settings", data2);

		Gson js = new Gson();

		String response = getWebResource(this.baseURL, "cgm/follower/v1").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("appname", this.appName).header("apporigin", this.appOriginRT)
				.header("appversion", this.appVersionRT).header("Connection", this.connection)
				.header("authorization", token).post(String.class, js.toJson(data));
		return response;
	}

	public String removeFollowerFromSharerApp(String token, String followerId) {
		String response = "";
		try {
			response = getWebResource(this.baseURL, "cgm/follower/v1/" + followerId)
					.header("Content-Type", this.contentType).header("platform", this.platform)
					.header("language", this.language).header("country", this.country).header("appname", this.appName)
					.header("apporigin", this.appOriginRT).header("appversion", this.appVersionRT)
					.header("Connection", this.connection).header("authorization", token).delete(String.class);
		} catch (Exception e) {
		}

		return response;
	}

	public String loginFA(String followerEmail, String password) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("username", followerEmail);
		data.put("password", password);

		String response = getWebResource(this.baseURL, "follow/user/v1/login").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
//				.header("appOrigin", this.appOriginFA).header("appVersion", this.appVersionFA)
				.header("Connection", this.connection).post(String.class, new Gson().toJson(data));

		return response;
	}

	public String acceptInvite(String token, String invitationToken) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("invitationToken", invitationToken);

		String response = getWebResource(this.baseURL, "follow/user/v1/accept").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
//				.header("appOrigin", this.appOriginFA).header("appVersion", this.appVersionFA)
				.header("Connection", this.connection).header("authorization", token)
				.post(String.class, new Gson().toJson(data));

		return response;
	}

	public String encryptToSHA(String input) {
		String sha1 = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sha1;
	}

	public void addLoginDetails(
			String NFKEmail, String NFKPassword, int noOfData, int noofdays, int[] cgmval) {
		// createAccountNFK(NFKFName, NFKLName, NFKEmail, NFKPassword);
		String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));
	   sendReadings(tokenNFK,noOfData,noofdays,cgmval);
	
	}
	public void addLoginDetailsReport(
			String NFKEmail, String NFKPassword, int noOfData, int noofdays, int[] cgmval) {
		// createAccountNFK(NFKFName, NFKLName, NFKEmail, NFKPassword);
		String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));
	   sendReadings(tokenNFK,noOfData,noofdays,cgmval);
	
	}
	public void addLoginDetailsLow(
			String NFKEmail, String NFKPassword, int noOfData, int noofdays, int[] cgmval) {
		// createAccountNFK(NFKFName, NFKLName, NFKEmail, NFKPassword);
		String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));  
		sendLowReadings(tokenNFK,noOfData,noofdays,cgmval);

	}
	public void addDetailsforDataSet(String NFKEmail, String NFKPassword,
			LocalDate startDate, int noOfData, int noofdays, int[] cgmval) {
		
		// createAccountNFK(NFKFName, NFKLName, NFKEmail, NFKPassword);
		String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));  
		sendCGMdata(tokenNFK,startDate,noOfData,noofdays,cgmval) ;

	}
	
	public void remove(String NFKEmail, String NFKPassword, String followerEmail, String followerPassword) {
		String token = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));
		String followerId = extractKey("\"followerId\":\"(.*?)\"", loginFA(followerEmail, followerPassword));
		removeFollowerFromSharerApp(token, followerId);
	}

	public String extractKey(String regex, String stringToExtractFrom) {
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(stringToExtractFrom);
		String result = "";
		if (matcher.find()) {
			result = matcher.group(1);
		}
		return result;
	}

	public String sendReadings(String tokenNFK,int noOfData,int noofdays, int[] cgmval ) {
		Object obj[] = new Object[noOfData*noofdays];//no of data and no of days
		
		int count=0;
		
		for(int j=0;j<noofdays;j++) {		
        for(int values:cgmval)
			{
        	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime myDateObj=LocalDateTime.now().minusDays(j);

			LocalDateTime minusHour = myDateObj.minusHours(1);
			String formattedDate = myFormatObj.format(minusHour.minusMinutes(count));

			TimeZone the_time_zone = TimeZone.getDefault();
			long mins = TimeUnit.MILLISECONDS.toMinutes(the_time_zone.getOffset(new Date().getTime() ));
			String formattedDateUTC = myFormatObj.format(minusHour.minusMinutes(mins+count));
			
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("readingDate", formattedDate.replace(" ", "T"));
				data.put("readingDateUtc", formattedDateUTC.replace(" ", "T"));
				data.put("value", values);
				data.put("trendArrow", "STEADY");
				data.put("onDemand", false);

				obj[count] = data;
				count++;
				System.out.println("Data "+data);
				}		
			
		}
	  
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("readings", obj);
		data2.put("deviceSerialNumber", "000111008");
		data2.put("deviceType", "METERTYPES_GENERICCGM");

		Object[] obj2 = {data2};

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("cgmReadings", obj2);

		Gson js = new Gson();
		String response = getWebResource(this.baseURL, "cgm/readings/v2/cgm").
				header("Content-Type", this.contentType)
		.header("platform", this.platform).header("language", this.language).header("country", this.country)
		.header("appname", this.appName).header("apporigin", this.appOriginRT)
		.header("appversion", this.appVersionRT).header("Connection", this.connection)
		.header("authorization", tokenNFK).post(String.class, js.toJson(data3));
		System.out.println("Response---"+response);
		return response;
		}
	
	public String sendLowReadings(String tokenNFK, int noOfLowData, int noofLowdays, int[] cgmlowval) {
		Reporter.logWithScreenShot("Low days and no. of days "+noOfLowData+" "+noofLowdays, MessageTypes.Pass);
	       Object obj[] = new Object[noOfLowData*noofLowdays];//no of data and no of days
	       int count=0;
			
			for(int j=0;j<noofLowdays;j++) {	
			int min=0;	
	        for(int values:cgmlowval)
				{   
	        		
	     	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	     	 LocalDateTime myDateObj=LocalDateTime.now().minusDays(1);
	       	LocalTime localTime =LocalTime.parse("04:30:02");
           String timesub=	localTime.minusMinutes(min).toString();
           min++;
	        String time="T".concat(timesub);
           
	     	String datecurr=formatter.format(Date.from(myDateObj.minusDays(j).atZone(ZoneId.systemDefault()).
	     			toInstant())).concat(time);
	    		   formatter.setTimeZone(TimeZone.getDefault());	
		    String dateutc=formatter.format(Date.from(myDateObj.minusDays(j).atZone(ZoneId.systemDefault()).
		    		toInstant())).concat(time);
		   
			Map<String, Object> data = new HashMap<String, Object>();
			    data.put("readingDate", datecurr);
				data.put("readingDateUtc", dateutc);
				data.put("value", values);
				data.put("trendArrow", "STEADY");
				data.put("onDemand", false);

				obj[count] = data;
				count++;
				System.out.println("Data "+data);
				}		
			
		}	  
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("readings", obj);
		data2.put("deviceSerialNumber", "000111008");
		data2.put("deviceType", "METERTYPES_GENERICCGM");

		Object[] obj2 = {data2};

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("cgmReadings", obj2);
        System.out.println("data 3 --"+data3);
		Gson js = new Gson();
		String response = getWebResource(this.baseURL, "cgm/readings/v2/cgm").
				header("Content-Type", this.contentType)
		.header("platform", this.platform).header("language", this.language).header("country", this.country)
		.header("appname", this.appName).header("apporigin", this.appOriginRT)
		.header("appversion", this.appVersionRT).header("Connection", this.connection)
		.header("authorization", tokenNFK).post(String.class, js.toJson(data3));
		System.out.println("Response---"+response);
		return response;
			
		}
	
	
	public String sendCGMdata(String tokenNFK,LocalDate startDate, int noOfData, int noofdays, int[] cgmval) {
		//Reporter.logWithScreenShot("Low days and no. of days "+noOfLowData+" "+noofLowdays, MessageTypes.Pass);
	       Object obj[] = new Object[noOfData*noofdays];//no of data and no of days
	       int count=0;
	       LocalTime startTime =LocalTime.parse("04:30:00");
			for(int j=0;j<noofdays;j++) {	
			int min=0;	
	        for(int values:cgmval)
				{   
	        		
	     	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	     	 LocalDateTime myDateObj=LocalDateTime.of(startDate, startTime);
	       	//LocalTime localTime =LocalTime.parse("04:30:02");
	     	 
           String timesub=	startTime.minusMinutes(min).toString();
           min++;
	        String time="T".concat(timesub);
//           
	     	String datecurr=formatter.format(Date.from(myDateObj.minusDays(j).atZone(ZoneId.systemDefault()).
	     			toInstant())).concat(time)
;
	     	System.out.println("DATE : " + datecurr + ", " + "VALUE :" + values);
//	    		   formatter.setTimeZone(TimeZone.getDefault());	
		    String dateutc=formatter.format(Date.from(myDateObj.minusDays(j).atZone(ZoneId.systemDefault()).
		    		toInstant())).concat(time);
	    	Map<String, Object> data = new HashMap<String, Object>();
		    data.put("readingDate", datecurr);
			data.put("readingDateUtc", dateutc);
			data.put("value", values);
			data.put("trendArrow", "STEADY");
			data.put("onDemand", false);

			obj[count] = data;
			count++;
			System.out.println("Data "+data);
			}		
		
	}	  
	Map<String, Object> data2 = new HashMap<String, Object>();
	data2.put("readings", obj);
	data2.put("deviceSerialNumber", "000111008");
	data2.put("deviceType", "METERTYPES_GENERICCGM");

	Object[] obj2 = {data2};

	Map<String, Object> data3 = new HashMap<String, Object>();
	data3.put("cgmReadings", obj2);
    System.out.println("data 3 --"+data3);
	Gson js = new Gson();
	String response = getWebResource(this.baseURL, "cgm/readings/v2/cgm").
			header("Content-Type", this.contentType)
	.header("platform", this.platform).header("language", this.language).header("country", this.country)
	.header("appname", this.appName).header("apporigin", this.appOriginRT)
	.header("appversion", this.appVersionRT).header("Connection", this.connection)
	.header("authorization", tokenNFK).post(String.class, js.toJson(data3));
	System.out.println("Response---"+response);
	return response;
		
          }

	public void addCGMforAGP(String NFKEmail, String NFKPassword, int noOfData, int noofdays) {
			String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));  
			sendReadingAGP(tokenNFK,noOfData,noofdays);
	}

	private String sendReadingAGP(String tokenNFK, int noOfData, int noofdays) {
	Object obj[] = new Object[noOfData*noofdays];//no of data and no of days	
		int count=0;
		int[] val = new int[1440];
		int min=50,max=260;
	      for (int i = 0; i < val.length; i++) {
	         val[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
	      }
		for(int j=0;j<noofdays;j++) {		
        for(int values:val)
			{
        	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime myDateObj=LocalDateTime.now().minusDays(j);

			LocalDateTime minusHour = myDateObj.minusHours(1);
			String formattedDate = myFormatObj.format(minusHour.minusMinutes(count));

			TimeZone the_time_zone = TimeZone.getDefault();
			long mins = TimeUnit.MILLISECONDS.toMinutes(the_time_zone.getOffset(new Date().getTime() ));
			String formattedDateUTC = myFormatObj.format(minusHour.minusMinutes(mins+count));
			
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("readingDate", formattedDate.replace(" ", "T"));
				data.put("readingDateUtc", formattedDateUTC.replace(" ", "T"));
				data.put("value", values);
				data.put("trendArrow", "STEADY");
				data.put("onDemand", false);

				obj[count] = data;
				count++;
				System.out.println("Data "+data);
				}		
			
		}
	  
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("readings", obj);
		data2.put("deviceSerialNumber", "000111008");
		data2.put("deviceType", "METERTYPES_GENERICCGM");

		Object[] obj2 = {data2};

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("cgmReadings", obj2);

		Gson js = new Gson();
		String response = getWebResource(this.baseURL, "cgm/readings/v2/cgm").
				header("Content-Type", this.contentType)
		.header("platform", this.platform).header("language", this.language).header("country", this.country)
		.header("appname", this.appName).header("apporigin", this.appOriginRT)
		.header("appversion", this.appVersionRT).header("Connection", this.connection)
		.header("authorization", tokenNFK).post(String.class, js.toJson(data3));
		System.out.println("Response---"+response);
		return response;
	}
	public static void fillCGMReadingsForDifferentForAndroidDays() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
		ApiMethods apiObj = new ApiMethods();
		int noOfData = 10;
		int noofdays = 180;
		int[] cgmval = new int[] { 66, 68, 100, 102, 108, 202, 204, 206, 208, 210 };
		apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
	}
//	Shubham
//	Method To Verify fill CGM readings for different days
	public static void fillCGMReadingsForDifferentAndroid200Days() {
		 String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		 String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
		 ApiMethods apiObj = new ApiMethods();
		 int noOfData = 10;
		 int noofdays=200;
		 int[] cgmval = new int[] { 66, 68, 100, 102, 108, 202, 204, 206, 208, 210 };
		 apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
		}


		
		// Method to fill the CGM reading with low , Inrange and high readings
		public void fillCGMReadingForLowInRangeHighDataForAndroid(int noofdays) {
			String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
			String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
			ApiMethods apiObj = new ApiMethods();
			int noOfData = 90;
			int[] cgmval = new int[] { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 86, 88, 100, 102, 108, 109, 111, 125,
					126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126,
					127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127,
					86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 211,
					212, 213, 214, 215, 216, 217, 218, 219, 220 };
			apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
		}

		
		// Method to Fill the CGM in range data
		public void fillCGMReadingsForInRangeDataForAndroid(int noofdays) {
			try {
				String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
				String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
				ApiMethods apiObj = new ApiMethods();
				int noOfData = 10;
				int[] cgmval = new int[] { 86, 88, 100, 102, 108, 110, 115, 125, 138, 145 };
				apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
				Reporter.logWithScreenShot("Successfully filled CGM In range data", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Failed to fill the CGM In range data", MessageTypes.Fail);
			}
		}

		
		// Method to Fill the CGM in range data
		public void fillCGMReadingsForInRangeDataForIOS(int noofdays) {
			try {
				String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
				String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
				ApiMethods apiObj = new ApiMethods();
				int noOfData = 10;
				int[] cgmval = new int[] { 86, 88, 100, 102, 108, 110, 115, 125, 138, 145 };
				apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
				Reporter.logWithScreenShot("Successfully filled CGM In range data", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Failed to fill the CGM In range data", MessageTypes.Fail);
			}
		}

		
		// Method to fill the CGM reading with low , Inrange and high readings
		public void fillCGMReadingForLowInRangeHighDataForIOS(int noofdays) {
			String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
			String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
			ApiMethods apiObj = new ApiMethods();
			int noOfData = 90;
			int[] cgmval = new int[] { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 86, 88, 100, 102, 108, 109, 111, 125,
					126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126,
					127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127,
					86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 86, 88, 100, 102, 108, 109, 111, 125, 126, 127, 211,
					212, 213, 214, 215, 216, 217, 218, 219, 220 };
			apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
		}

		
		// Method to generate low glucose event for android
		public void fillCGMReadingForLowGlucoseEventForAndroid(int noofdays) {
			String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
			String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
			int noOfData = 34;
			int[] cgmval = new int[] { 51, 53, 55, 52, 54, 57, 56, 59, 58, 60, 62, 61, 63, 65, 64, 67, 66, 90, 92, 91,
					94, 93, 95, 97, 96, 99, 100, 102, 101, 103, 102, 104, 105, 108 };
			addLoginDetails(email, password, noOfData, noofdays, cgmval);
		}

	
		// Method to generate low glucose event
		public void fillCGMReadingForLowGlucoseEventForIOS(int noofdays) {
			String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
			String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
			int noOfData = 34;
			int[] cgmval = new int[] { 51, 53, 55, 52, 54, 57, 56, 59, 58, 60, 62, 61, 63, 65, 64, 67, 66, 90, 92, 91,
					94, 93, 95, 97, 96, 99, 100, 102, 101, 103, 102, 104, 105, 108 };
			addLoginDetails(email, password, noOfData, noofdays, cgmval);
		}

		//Method to generate AGP report for diff days
		public void fillCGMReadingForAGPForAndroid(int noofdays) {
			String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
			String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
			ApiMethods apiObj = new ApiMethods();	
			int noOfData = 1440;
			addCGMforAGP(email, password, noOfData, noofdays);
		}

		//Method to generate AGP report for diff days
		public void fillCGMReadingForAGPForIOS(int noofdays) {
			String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
			String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
			ApiMethods apiObj = new ApiMethods();	
			int noOfData = 1440;
			addCGMforAGP(email, password, noOfData, noofdays);
		}	
		
	public void get_GuId() {
		SignupPageAndroid login = new SignupPageAndroid();
		String response = getWebResource(this.baseURL, "user/v1/list-dependents/" + login.email1).header("Content-Type", this.contentType)
				.header("Content-Type", this.contentType).header("platform", this.platform)
				.header("language", this.language).header("country", this.country).header("appname", this.appName)
				.header("apporigin", this.appOriginRT).header("appversion", this.appVersionRT)
				.header("Connection", this.connection).get(String.class);
		System.out.println("Response---\n"+response);
		JSONObject obj = new JSONObject(response);
		String globalUserId = obj.getJSONObject("response").getJSONArray("dependents").getJSONObject(0).getString("globalUserId");
		System.out.println(globalUserId);
		
		this.globalUserId = globalUserId;
		
    }

	public void getAuthenticationToken() {
		SignupPageAndroid login = new SignupPageAndroid();
		Map<String, String> data = new HashMap<String, String>();
		data.put("login", login.email1);
		data.put("password", password);
		data.put("globalUsersId", globalUserId);
		String response = getWebResource(this.baseURL, "cgm/pediatric/v1/login").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("optin", "false").header("cliniccode", "").header("appname", this.appName)
				.post(String.class, new Gson().toJson(data));
		System.out.println("Response---\n"+response);
		JSONObject obj = new JSONObject(response);
		String authenticationToken = obj.getJSONObject("response").getString("token");
		System.out.println(authenticationToken);
		
		this.authToken = authenticationToken;
	}
	
	
//	public String emancipateUser() {
//		SignupPageAndroid login = new SignupPageAndroid();
//		LocalDateTime Date = LocalDateTime.now().minusYears(18).minusDays(1);
//		String DateOfBirth = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(Date);
//		System.out.println("Future date of birth is:"+DateOfBirth);
//		try {
//            URL url = new URL(this.baseURL+"cgm/user/v1"); //Enter URL here
//            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
//            httpURLConnection.setDoOutput(true);
//            httpURLConnection.setRequestMethod("POST");
//            httpURLConnection.setRequestProperty("authorization", authToken);
//            httpURLConnection.setRequestProperty("requestorGlobalUserId",this.globalUserId);
//            httpURLConnection.setRequestProperty("Content-Type", this.contentType);
//            httpURLConnection.setRequestProperty("X-HTTP-Method-Override", "PATCH");
//            httpURLConnection.connect();
//            
//            String inputJson = "{\r\n"
//            		+ "  \"config\": [\r\n"
//            		+ "    {\r\n"
//            		+ "      \"key\": \"BUBBLE_ANIMATIONS_ENABLED\",\r\n"
//            		+ "      \"lastUpdatedDate\": 1569517479271,\r\n"
//            		+ "      \"value\": \"true\"\r\n"
//            		+ "    }\r\n"
//            		+ "  ],\r\n"
//            		+ "  \"consentDate\": 1621273612731,\r\n"
//            		+ "  \"contactInformation\": {\r\n"
//            		+ "    \"address1\": \"add1\",\r\n"
//            		+ "    \"address2\": \"add2\",\r\n"
//            		+ "    \"address3\": \"add3\",\r\n"
//            		+ "    \"city\": \"Wayne\",\r\n"
//            		+ "    \"primaryPhoneNumber\": \"1908985643\",\r\n"
//            		+ "    \"stateProvince\": \"PA\",\r\n"
//            		+ "    \"zipPostal\": \"19087\"\r\n"
//            		+ "  },\r\n"
//            		+ "  \"diabetes\": {\r\n"
//            		+ "    \"therapies\": [\r\n"
//            		+ "      {\r\n"
//            		+ "        \"active\": true,\r\n"
//            		+ "        \"selfAdjustInsulin\": true,\r\n"
//            		+ "        \"type\": \"THERAPY_TYPE_DIET_EXERCISE\"\r\n"
//            		+ "      }\r\n"
//            		+ "    ],\r\n"
//            		+ "    \"type\": \"DIABETES_TYPE_2\"\r\n"
//            		+ "  },\r\n"
//            		+ "  \"email\": "+ login.email1 +",\r\n"
//            		+ "  \"generalInformation\": {\r\n"
//            		+ "    \"clientTimestamp\": 1569517479271,\r\n"
//            		+ "    \"dateOfBirth\": "+ DateOfBirth +",\r\n"
//            		+ "    \"firstName\": \"John\",\r\n"
//            		+ "    \"firstUseComplete\": true,\r\n"
//            		+ "    \"gender\": \"MALE\",\r\n"
//            		+ "    \"lastName\": \"Doe\",\r\n"
//            		+ "    \"middleName\": \"Doo\",\r\n"
//            		+ "    \"suffix\": \"Sr\"\r\n"
//            		+ "  },\r\n"
//            		+ "  \"optIn\": false,\r\n"
//            		+ "  \"password\": \"n3wP4ssword!\",\r\n"
//            		+ "  \"targetRanges\": {\r\n"
//            		+ "    \"high\": 180,\r\n"
//            		+ "    \"lastUpdatedDate\": 1569517479271,\r\n"
//            		+ "    \"low\": 70\r\n"
//            		+ "  },\r\n"
//            		+ "  \"uom\": \"mg/dl\"\r\n"
//            		+ "}";
//
//            DataOutputStream wr = new DataOutputStream(httpURLConnection.getOutputStream());
//            wr.write(inputJson.getBytes());
//            wr.flush();
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (httpURLConnection.getInputStream())));
//
//
//            StringBuffer bfr = new StringBuffer();
//            String output = "";
//            String res = "";
//
//            while ((output = br.readLine()) != null) {
//                bfr.append(output);
//            }
//           int resCode = httpURLConnection.getResponseCode();
////            System.out.println("response code = "+resCode);
//            if (resCode != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + resCode +"\n"
//                        +bfr.toString());
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

		public String emancipateUser() {
			SignupPageAndroid login = new SignupPageAndroid();
			LocalDateTime Date = LocalDateTime.now().minusYears(18).minusDays(1);
			String DateOfBirth = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(Date);
			System.out.println("Future date of birth is:"+DateOfBirth);
			Map<String, Object> data2 = new LinkedHashMap<String, Object>();
			data2.put("Authorization", this.authToken);
			data2.put("requestorGlobalUserId",this.globalUserId);
			data2.put("dateOfBirth", DateOfBirth);
			data2.put("email", login.email1);

			Object ob[] = { data2 };
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			data.put("userSettings", ob);

			Gson js = new Gson();

			MyClient my = new MyClient();
			my.createClient();
			String response = "";
			try {
				response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
						.header("platform", this.platform).header("language", this.language).header("country", this.country)
						.header("appname", this.appName).header("apporigin", this.appOriginRT)
						.header("appversion", this.appVersionRT).header("Connection", this.connection).method("PATCH", String.class, js.toJson(data));
			} catch (Exception e) {
			}

	System.out.println("Response---"+response);
	return response;
}
	
}