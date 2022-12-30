
package com.NFK.support;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
import com.NFK.version1.iOS.pages.DeviceSettingsPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.StringUtil;
import com.thoughtworks.selenium.SeleniumException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

import java.util.HashMap;
import java.util.Map;

public class LFSUtilsIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	static DeviceSettingsPageIOS devicesettingpage = new DeviceSettingsPageIOS();
	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	/**
	 *  Method to get driver instance
	 * @return
	 */
	public IOSDriver getDriver() {
		return iosDriver;
	}

	/**
	 *  Method to pause execution for certain time
	 * @return
	 */
	public static String getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("MMMMM").format(cal.getTime());
	}

	/**
	 * This Method returns Current Date
	 */
	public static String getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("d", Locale.ENGLISH).format(cal.getTime());
	}

	/**
	 * This Method returns Current Day of Week
	 */
	public static String getDayOfWeek() {
		String weekdays[] = new DateFormatSymbols(Locale.ENGLISH).getWeekdays();
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return weekdays[dayOfWeek];
	}

	/**
	 * Method is used to scroll screen till exact text
	 */
	@QAFTestStep(description = "scroll to {0}")
	public static void scrollToEleIOS(String exactText) {
		try {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			SignupPageIOS sgn = new SignupPageIOS();
			while (!LFSUtilsAndroid.tryDisplayMethod(sgn.getNFKiosSignuppageStaticlabel(exactText))) {
				TouchAction ta = new TouchAction(appiumDriver);
				ta.press(point(200, 300)).waitAction(waitOptions(Duration.ofMillis(1))).moveTo(point(200, 450))
						.release().perform();

			}
		} catch (SeleniumException e) {
			new WebDriverTestBase().getDriver().getTouchScreen().flick(0, (LFSUtilsIOS.getIntNum("400")));
		}
	}

	/**
	 * Used for scroll to methods return int value
	 */
	public static Integer getIntNum(String num) {
		try {
			if (StringUtil.isNumeric(num)) {
				return Integer.parseInt(num);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * method is used to hide the keyboard
	 */
	public static void hideKeyboard() {

		try {
			if (isElementPresent())
				((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver())
						.findElement(By.xpath("//*[text()='Done' or @label='Done']")).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method to verify done button is present in keyboard
	 */
	public static boolean isElementPresent() {
		try {
			((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver())
					.findElement(By.xpath("//*[text()='Done' or @label='Done']"));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	/**
	 *  Method to swipe with element
	 * @param firstEle
	 * @param secondEle
	 * @param duration
	 */

	public static void swipeWithElements(QAFExtendedWebElement firstEle, QAFExtendedWebElement secondEle,
			Integer duration) {

		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		TouchAction ta = new TouchAction(IOSDriver);
		if (LFSUtilsIOS.tryMethod(secondEle)) {
			ta.press(point(firstEle.getCoordinates().onPage().getX(), firstEle.getCoordinates().onPage().getY()))
					.waitAction(waitOptions(Duration.ofMillis(duration)))
					.moveTo(point(secondEle.getCoordinates().onPage().getX(),
							secondEle.getCoordinates().onPage().getY()))
					.release().perform();

		} else {
			while (!LFSUtilsIOS.tryMethod(secondEle)) {
				ta.press(point(firstEle.getCoordinates().onPage().getX(), firstEle.getCoordinates().onPage().getY()))
						.waitAction(waitOptions(Duration.ofMillis(duration)))
						.moveTo(point(firstEle.getCoordinates().onPage().getX(),
								firstEle.getCoordinates().onPage().getY() + 200))
						.release().perform();
			}
		}
	}

	/**
	 * Method is used to swipe by co-ordinates
	 */
	public static void swipeWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", "" + startx + "," + starty + "");
		params.put("end", "" + endx + "," + endy + "");
		params.put("duration", "3");
		Object res = IOSDriver.executeScript("mobile:touch:swipe", params);
	}
	/**
	 *  Method to click on co-ordinates
	 */ 
	public static void clickWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", "" + startx + "," + starty + "");
		params.put("end", "" + endx + "," + endy + "");
		params.put("duration", "3");
		Object res = IOSDriver.executeScript("mobile:touch:tap", params);
	}
	
	/**
	 *  Method to select text
	 */
	public static void selectText(String str) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();

		Map<String, Object> params = new HashMap<>();
		params.put("content", str);
		params.put("threshold", 80);
		Object select = IOSDriver.executeScript("mobile:text:select", params);
	}

	/**
	 * Method is used to swipe by percentage of screen start from percent of screen
	 * and in percent
	 */
	public static void swipeWithScreenPercent(int startxPer, int startyPer, int endxPer, int endyPer,
			Integer duration) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", "" + startxPer + "%," + startyPer + "%");
		params.put("end", "" + endxPer + "%," + endyPer + "%");
		params.put("duration", "3");
		Object res = IOSDriver.executeScript("mobile:touch:swipe", params);
	}

	/**
	 * Method is used to swipe by percentage of screen start from percent of screen
	 * and in percent
	 */
	public static void scrollDown() {
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}

	/**
	 * Method is used to swipe by percentage of screen start from percent of screen
	 * and in percent
	 */
	public static void scrollUp() {
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
	}

	/**
	 * method is used to return QAFWebElement appending text inside locator
	 */
	public static QAFWebElement getElement(String locKey, String eleText) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText));
		return buttonEle;
	}

	/**
	 * method is used to return QAFWebElement appending text inside locator
	 */
	public static QAFWebElement getElement(String locKey, String eleText, String eleText2) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText2));
		return buttonEle;
	}

	/**
	 *  Method to pause execution for certain time
	 * @param milisecond
	 */

	public static void pause(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

	/**
	 *  Method to check elements displayed or not
	 * @param element
	 * @return
	 */
	public static boolean tryMethod(QAFWebElement element) {
		boolean flag = false;
		try {
			if ((element.isDisplayed()))
				flag = true;
		} catch (Exception e) {
		}
		return flag;
	}

	/**
	 *  Method to scroll picker using tap for date time picker
	 * @param element
	 * @param value
	 */
	public static void selectTimePicker(WebElement element, int value) {
		Point p1 = element.getLocation();
		Dimension d1 = element.getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		int hr = Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", ""));
		if (hr >= value) {
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", "")) == value)) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver()
							.getUnderLayingDriver());
					TouchAction tch = new TouchAction(appiumDriver);
					System.out.println("###################");
					tch.tap(point(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 58)).perform();
				} catch (Exception e) {
				}
			}
		}

		if (hr < value) {
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", "")) == value)) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver()
							.getUnderLayingDriver());
					TouchAction tch = new TouchAction(appiumDriver);
					tch.tap(point(p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) + 50)).perform();
				} catch (Exception e) {
				}
			}
		}
	}
	/**
	 *  Method to get months value
	 * @param month
	 * @return
	 */

	public static String monthIntValue(String month) {

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "1");
		monthmap.put("1", "Jan");
		monthmap.put("Feb", "2");
		monthmap.put("2", "Feb");
		monthmap.put("Mar", "3");
		monthmap.put("3", "Mar");
		monthmap.put("Apr", "4");
		monthmap.put("4", "Apr");
		monthmap.put("May", "5");
		monthmap.put("5", "May");
		monthmap.put("Jun", "6");
		monthmap.put("6", "Jun");
		monthmap.put("Jul", "7");
		monthmap.put("7", "Jul");
		monthmap.put("Aug", "8");
		monthmap.put("8", "Aug");
		monthmap.put("Sep", "9");
		monthmap.put("9", "Sep");
		monthmap.put("Oct", "10");
		monthmap.put("10", "Oct");
		monthmap.put("Nov", "11");
		monthmap.put("11", "Nov");
		monthmap.put("Dec", "12");
		monthmap.put("12", "Dec");
		return monthmap.get(month);
	}
	/**
	 *  Method to get months number of days
	 * @param month
	 * @return
	 */

	public static String monthNoOFDay(String month) {

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "31");
		monthmap.put("Feb", "28");
		monthmap.put("Mar", "31");
		monthmap.put("Apr", "30");
		monthmap.put("May", "31");
		monthmap.put("Jun", "30");
		monthmap.put("Jul", "31");
		monthmap.put("Aug", "31");
		monthmap.put("Sep", "30");
		monthmap.put("Oct", "31");
		monthmap.put("Nov", "30");
		monthmap.put("Dec", "31");
		return monthmap.get(month);
	}

	/**
	 *  Method to get string from config file
	 * @param key
	 * @return
	 */
	public static String getPropString(String key) {
		return ConfigurationManager.getBundle().getProperty(key).toString();
	}

	/**
	 *  Method to wait for loading
	 */
	public static void waitforLoad() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  Method for implicit wait
	 * @param timeout
	 */
	public static void waitImplicitly(long timeout) {
		try {
			getQAFDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
			Reporter.logWithScreenShot("Wait for " + timeout, MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Not able to wait ", MessageTypes.Fail);
		}
	}

	/**
	 *  Method for explicit wait
	 * @param element
	 * @param timeout
	 */
	public static void waitExplicit(WebElement element, int timeout) {
		try {
			new WebDriverWait(getQAFDriver(), timeout).until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element found by Wait for " + timeout, MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Element Not found by Wait " + timeout, MessageTypes.Pass);
		}

	}

/**
 * Method to get location and size
 * @param element
 * @return
 */
	public static Map<String, Integer> getLocationAndSize(WebElement element) {
		Map<String, Integer> sizeOfElement = new java.util.HashMap<String, Integer>();
		try {
			Dimension value = element.getSize();
			Point points = element.getLocation();
			sizeOfElement.put("getX", points.getX());
			sizeOfElement.put("Width", value.getWidth());
			sizeOfElement.put("getY", points.getY());
			sizeOfElement.put("getHeight", value.getHeight());
		} catch (Exception e) {

		}
		return sizeOfElement;

	}

	/**
	 *  Method to switch between context
	 * @param driver
	 * @param context
	 */
	public static void switchToContext(RemoteWebDriver driver, String context) {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", context);
		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
	}

	/**
	 *  Method to get current Context
	 * @return
	 */
	private String getCurrentContextHandle() {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(iosDriver);
		String context = (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
		return context;
	}

	/**
	 *  Method to get all Context
	 * @return
	 */
	private List<String> getContextHandles() {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(iosDriver);
		List<String> contexts = (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
		return contexts;
	}

	/**
	 *  Method to lauch setting
	 */
	public static void launchSettings() {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		HashMap<String, Object> args = new HashMap<>();
		args.put("bundleId", "com.apple.Preferences");
		IOSDriver.executeScript("mobile: launchApp", args);
		Reporter.logWithScreenShot("Launch the Settings ", MessageTypes.Pass);
		LFSUtilsIOS.waitforLoad();
	}

	/**
	 *  Switch Turn Off WiFi
	 */

	public void turnOffWiFi() {
		launchSettings();		
		if (LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"Wi-Fi\"]").getAttribute("value").equals("Off")) {
			Reporter.logWithScreenShot("Wifi is already turned off", MessageTypes.Pass);
		} else {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"Wi-Fi\"]").click();
			LFSUtilsIOS.waitforLoad();
			driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").click();
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"Settings\"]").click();
			closeApp();
			new WebDriverWait(driver, 20);
		}
	}

	/**
	 *  Switch Turn on Wifi
	 */

	public void turnOnWiFi() {
		launchSettings();
		if (LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"Wi-Fi\"]").getAttribute("value").equals("Off")) {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"Wi-Fi\"]").click();
			LFSUtilsIOS.waitforLoad();
			driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").click();
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"Settings\"]").click();
			closeApp();
			new WebDriverWait(driver, 20);
		} else {
			Reporter.logWithScreenShot("Wifi is already turned on", MessageTypes.Pass);
		}
      }

	/**
	 *  verify unit of measure for the country
	 *  Return double value
	 * @param randomNumberGlucose
	 * @return
	 */
	public static double setValueUnitOfMeasure(double randomNumberGlucose) {
		double glucose = randomNumberGlucose;
		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				|| ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			System.out.println("##########   Inside mmol");
			glucose = randomNumberGlucose / 18;
			glucose = round(glucose);
		} else {

		}
		return glucose;
	}

	/**
	 *  Method to clear text field
	 * @param element
	 */
	public static void clearTextField(WebElement element) {
		int count = 0;
		while (!(element.getAttribute("value").toString().replaceAll("[^a-zA-Z0-9]", "").length() == 0)) {
			devicesettingpage.pressDeleteKey(element);

			if (count == 5)
				break;
			count++;
		}
	}

	/**
	 *  verify unit of measure for the country
	 *  Return int value
	 * @param randomNumberGlucose
	 * @return
	 */
	public static int setValueUnitOfMeasureInt(double randomNumberGlucose) {
		double glucose = randomNumberGlucose;
		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				|| ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			System.out.println("##########   Inside mmol");
			glucose = randomNumberGlucose / 18;
			glucose = round(glucose);
		}
		int gluco = (int) glucose;
		return gluco;
	}

	/**
	 *  Method to round figure value
	 * @param value
	 * @return
	 */

	private static double round(double value) {

		String s = "" + value;
		String s1[] = s.split("\\.");
		System.out.println(s1[0]);
		String s2 = s1[0] + "." + s1[1].charAt(0);
		double ans = Double.parseDouble(s2);
		return ans;
	}

	/**
	 *  Setting BG range from picker on setting page
	 * @param element
	 * @param value
	 */
	public static void selectBGRangePicker(WebElement element, double value) {
		Point p1 = element.getLocation();
		Dimension d1 = element.getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		double hr = Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9.]]", ""));
		if (hr >= value) {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			TouchAction tch = new TouchAction(appiumDriver);
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9.]", "")) == value)) {
				try {
					tch.tap(point(p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) - 70)).perform();
				} catch (Exception e) {
				}
			}
		}
		if (hr < value) {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			TouchAction tch = new TouchAction(appiumDriver);
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9.]", "")) == value)) {
				try {
					tch.tap(point(p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) + 70)).perform();
				} catch (Exception e) {
				}
			}
		}
	}
	/**
	 *  Method for Unit of measures
	 * @param randomNumberGlucose
	 * @return
	 */

	public static String mmolMGDL(double randomNumberGlucose) {
		String s = "";

		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				|| ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			double d = setValueUnitOfMeasure(randomNumberGlucose);
			s = "" + d;
			System.out.println(s);
			if (!s.contains(".")) {
				s = s + ".0";
			}
		} else {
			int i = (int) randomNumberGlucose;
			s = "" + i;
		}
		return s;
	}

	/**
	 *  Method to swipe with element
	 * @param element
	 * @param direction
	 */
	public void swipeElement(QAFWebElement element, String direction) {
		Map<String, Object> params = new HashMap<>();
		params.put("element", element);
		params.put("operation", direction);
		params.put("iteration", "2");
		Object result1 = driver.executeScript("mobile:touch:swipe", params);
	}

	/**
	 *  Method to get device information
	 * @param property
	 * @return
	 */
	public static String getDeviceInfo(String property) {
		Map<String, Object> params = new HashMap<>();
		params.put("property", property);
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		String popValue = (String) lfs.getDriver().executeScript("mobile:device:info", params);
		return popValue;
	}

	/**
	 *  Method to select date Before Current Date
	 * @param numberOfDays
	 * @return
	 */

	public String dateBeforeCurrentDate(int numberOfDays) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - numberOfDays);
		Date myDate = cal.getTime();
		System.out.println(myDate.toString().substring(4, 11).replace("0", ""));
		return myDate.toString().substring(4, 11).replace("0", "");
	}

   /**
    * Method to remove UTF Characters
    */
	public static String removeUTFCharacters(String data) {
		Pattern p = Pattern.compile("\\\\u(\\p{XDigit}{4})");
		Matcher m = p.matcher(data);
		StringBuffer buf = new StringBuffer(data.length());
		while (m.find()) {
			String ch = String.valueOf((char) Integer.parseInt(m.group(1), 16));
			m.appendReplacement(buf, Matcher.quoteReplacement(ch));
		}
		m.appendTail(buf);
		return buf.toString();
	}

	/**
	 *  Method to switch drivers
	 */
	public void switchWebDriver() {
		switchToContext(iosDriver, "NATIVE_APP");
		iosDriver.launchApp();
		Reporter.logWithScreenShot("app launch");

	}

	/**
	 *  Method to tap on co-ordinates
	 */
	public static void tapOnCordinates(String x, String y) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("location", x + "," + y);
		Object res = iOSDriver.executeScript("mobile:touch:tap", params);
	}

	/**
	 *  Method to eneter middle text
	 * @param ele
	 * @param str
	 */
	public static void entermiddleText(QAFWebElement ele, String str) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("text", str);
		Object res = iOSDriver.executeScript("mobile:typetext", params);
		iOSDriver.getKeyboard().sendKeys(Keys.ENTER);
	}

	/**
	 *  Method to get Element Information
	 * @param property
	 * @param value
	 * @param by
	 * @return
	 */
	public static Object getElementInfo(String property, String value, String by) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("property", property);
		params.put("value", value);
		params.put("by", by);
		Object res = iOSDriver.executeScript("mobile:application.element:info", params);
		return res;
	}

	/**
	 *  Method to find text
	 * @param str
	 * @return
	 */
	public static Object findText(String str) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("content", str);
		Object res = iOSDriver.executeScript("mobile:text:find", params);
		return res;
	}

	/**
	 *  method to clean text field
	 * @param element
	 */
	public static void clearText(WebElement element) {
		try {
			String areaText = element.getText();
			int lengthOfString = areaText.length();
			for (int i = 0; i < lengthOfString; i++) {
				element.sendKeys(Keys.BACK_SPACE);
			}
			Reporter.log("Successbully clear the Text field", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.log("Not able to clear the text field", MessageTypes.Fail);
		}
	}

	/**
	 *  Method to get text
	 * @param element
	 * @return
	 */
	public String getTexts(WebElement element) {
		String tex = element.getText().toString();
		if (tex == null || tex.equals("")) {
			Reporter.log("text field is empty", MessageTypes.Fail);
		} else {
			Reporter.log("text field text is " + tex, MessageTypes.Fail);
		}
		return tex;
	}

	/**
	 *  Method to keep app in the background
	 */
	public static void appBackground() {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		iOSDriver.runAppInBackground(Duration.ofSeconds(-1));

	}

	/**
	 *  Method to get QAF Driver
	 * @return
	 */
	public static QAFExtendedWebDriver getQAFDriver() {
		return new WebDriverTestBase().getDriver();
	}

	/**
	 *  Method to get MAP Parameters
	 * @param app
	 * @param by
	 * @return
	 */
	private static Map<String, String> getAppParams(String app, String by) {
		Map<String, String> params = new HashMap<String, String>();
		params.put(by, app);
		return params;
	}

	/**
	 *  Method to close app
	 */
	public void closeApp() {
		Map<String, Object> params = new HashMap<>();
		params.put("identifier", "com.apple.Preferences");
		Object result1 = driver.executeScript("mobile:application:close", params);
	}

	/**
	 *  Method to close app
	 * @param app
	 * @param by
	 */
	public static void closeApp(String app, String by) {
		closeApp(app, by, false);
	}

	/**
	 *  Method to close app
	 * @param app
	 * @param by
	 * @param ignoreExceptions
	 */
	public static void closeApp(String app, String by, boolean ignoreExceptions) {
		try {
			getQAFDriver().executeScript("mobile:application:close", getAppParams(app, by));
		} catch (Exception e) {
			Reporter.log("No Previous app session is opened", MessageTypes.Pass);
		}
	}

	/**
	 *  Method to start app
	 * @param app
	 * @param by
	 */
	public static void startApp(String app, String by) {
		getQAFDriver().executeScript("mobile:application:open", getAppParams(app, by));
	}

	/**
	 *  Method to trust app
	 * @param certificateName
	 */
	public static void trustiOSAppCertificate(String certificateName) {
		switchToContext("NATIVE_APP");
		try {
			LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
		} catch (Exception e) {
			Reporter.log("Fail to closed previously opened app", MessageTypes.Fail);
		}

		LFSUtilsIOS.startApp("com.apple.Preferences", "identifier");
		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,70%");
		params.put("end", "15%,25%");
		params.put("duration", "2");
		Object res = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='General']").click();
		Object res1 = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		try {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[contains(@name,'Device Management')]")
					.waitForPresent(5000);
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[contains(@name,'Device Management')]").click();

		} catch (Exception e) {
			Reporter.log("No device management setting found", MessageTypes.Fail);
		}
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=" + "'" + certificateName + "'" + "]").click();

		try {
			LFSUtilsIOS.getQAFDriver()
					.findElementByXPath("//*[starts-with(@label,'Trust') and contains(@label,'LifeScan, Inc.')]")
					.click();
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label='Trust']").click();
		} catch (Exception e) {
			Reporter.logWithScreenShot("Looks Like Certificate already trusted. Exiting");
		}
	}

	/**
	 *  Method to switch between context
	 * @param context
	 */
	public static void switchToContext(String context) {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(getQAFDriver());
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", context);
		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
	}

	/**
	 *  Method to tuen off bluetooth
	 * @throws InterruptedException
	 */
	public void turnOffBluetooth() throws InterruptedException {
		LFSUtilsIOS.appBackground();
		launchSettings();
		Thread.sleep(2000);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Bluetooth']").click();
		LFSUtilsIOS.waitforLoad();
		int bluetoothStatus = Integer
				.parseInt(driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").getAttribute("value"));
		if (bluetoothStatus == 1) {
			driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").click();
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='Settings']").click();
			closeApp();
			new WebDriverWait(driver, 20);
			iosDriver.launchApp();
		} else {
			System.out.println("Bluetooth is already off");
			iosDriver.launchApp();
		}
	}

	/**
	 *  Method to tuen on bluetooth
	 * @throws InterruptedException
	 */
	public void turnOnBluetooth() throws InterruptedException {
		launchSettings();
		Thread.sleep(2000);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Bluetooth']").click();
		LFSUtilsIOS.waitforLoad();
		int bluetoothStatus = Integer
				.parseInt(driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").getAttribute("value"));
		if (bluetoothStatus == 0) {
			driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").click();
			Thread.sleep(8000);
			closeApp();
			new WebDriverWait(driver, 20);
		} else {
			System.out.println("Bluetooth is already on");

		}
	}

	/**
	 *  Method to click on text
	 * @param str
	 */
	public static void clickWithText(String str) {
		try {
			IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();

			Map<String, Object> params = new HashMap<>();
			params.put("label", str);
			params.put("threshold", 80);
			params.put("ignorecase", "nocase");
			Object res = IOSDriver.executeScript("mobile:button-text:click", params);
		} catch (Exception e) {
			Reporter.log("Fail to click on text: " + str, MessageTypes.Fail);
		}

	}

	/**
	 *  Method to click on element
	 * @param element
	 */
	public static void click(QAFWebElement element) {
		try {
			element.waitForPresent();
			element.click();
			Reporter.log("Click on element ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.log("Fail to click on element ", MessageTypes.Fail);
		}
	}

	/**
	 *  Method to get attribute of element
	 * @param element
	 * @param Value
	 * @return
	 */
	public static String attributeGet(QAFWebElement element, String Value) {
		try {
			element.waitForPresent();
			element.getAttribute(Value);
			Reporter.log("Attribute on element ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.log("Fail to get Attribute of the element ", MessageTypes.Fail);
		}
		return Value;
	}

	/**
	 *  Method to enter value to element
	 * @param element
	 * @param text
	 */
	public static void enterText(QAFWebElement element, String text) {
		try {
			element.waitForPresent();
			element.click();
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			Reporter.log("Fail to enter text: " + text, MessageTypes.Fail);
		}
	}

	/**
	 *  Method to open app
	 */
	public void openNFKApp() {
		try {
			launchPage(null);
			iosDriver.closeApp();
			iosDriver.launchApp();
			Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to launch the app", MessageTypes.Fail);
		}

	}

	/**
	 *  Method to click on element if enabled
	 * @param element
	 */
	public static void clickIfEnabled(QAFWebElement element) {
		try {
			element.waitForEnabled();
			element.click();
			Reporter.logWithScreenShot("Click on element ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on element ", MessageTypes.Fail);
		}
	}

	/**
	 *  Method to swipe page
	 */
	public static void swipePage() {
		int fromX = 430;
		int fromY = 1750;
		int toX = 430;
		int toY = 990;
		AppiumDriver driver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(fromX, fromY))
				.waitAction(new WaitOptions().withDuration(Duration.ofMillis(2000))) // you can change wait durations as
																						// per your requirement
				.moveTo(PointOption.point(toX, toY)).release().perform();

	}

	/**
	 *  Method to open notification
	 */
	public static void openNotification() {
		try {
			LFSUtilsIOS.appBackground();
			LFSUtilsIOS.swipeWithCoordinates(324, 6, 324, 2181, 3);
			Reporter.logWithScreenShot("User opened notification", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to open notification", MessageTypes.Fail);
		}
	}

	/**
	 *  Method to open browser
	 * @param followEmail
	 * @param webURL
	 */
	public static void openBrowser(String followEmail, String webURL) {
		try {
			IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
			Map<String, Object> params = new HashMap<>();
			params.put("url", webURL + followEmail);
			Object res = IOSDriver.executeScript("mobile:browser:goto", params);
			Reporter.log("User opened Browser with email", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.log("Fail to open Browser with email", MessageTypes.Fail);
		}
	}

	/**
	 *  Method to turne off bluetooth at App Level
	 * @throws InterruptedException
	 */
	public void bluetoothTurnedoffAtAppLevel() throws InterruptedException {
		LFSUtilsIOS.appBackground();
		switchToContext("NATIVE_APP");
		try {
			LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
		} catch (Exception e) {
			Reporter.log("Fail to closed previously opened app", MessageTypes.Fail);
		}

		LFSUtilsIOS.startApp("com.apple.Preferences", "identifier");
		LFSUtilsIOS.swipeWithCoordinates(60, 2592, 60, 430, 3);
		LFSUtilsIOS.swipeWithCoordinates(60, 2592, 60, 430, 3);
		LFSUtilsIOS.swipeWithCoordinates(60, 2592, 60, 430, 3);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label='OneTouch 24/7 CGM']").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeCell[@label='Bluetooth']").click();
		new WebDriverWait(driver, 20);
		iosDriver.launchApp();
	}

	/**
	 *  Method to click Time Sensitive Notification in device settings
	 */
	public static void turnOffTimeSensitiveNotification() {
		launchSettings();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Notifications']").click();
		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,70%");
		params.put("end", "15%,25%");
		params.put("duration", "2");
		Object res = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='OneTouch 24/7 MaxVue™']").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='Time Sensitive Notifications']").click();
	}

/**
 * Method to clsoe app
 */
	public static void userCloseTheApp() {
		LFSUtilsIOS
				.closeApp(
						splitCapabilityString(ConfigurationManager.getBundle()
								.getProperty("appium.additional.capabilities").toString(), "bundleId':'"),
						"identifier");
		Reporter.logWithScreenShot("App is closed", MessageTypes.Pass);
	}

	/**
	 *  Method to split capability
	 * @param value
	 * @param splitValue
	 * @return
	 */
	public static String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

/**
 * Method to open curren screen
 */
	public static void opencurrentscreen() {
		LFSUtilsIOS.switchToContext("NATIVE_APP");
		LFSUtilsIOS.startApp("com.lifescan.norfolk.continuous.enterprise", "identifier");
	}

/**
 * Method to scroll down
 */
	public static void ScrollDownNotifications() {
		try {
			LFSUtilsIOS.swipeWithCoordinates(324, 6, 324, 2181, 3);
			Reporter.logWithScreenShot("User opened notification Bar", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to open notification Bar", MessageTypes.Fail);
		}
	}

	/**
	 *  Method to wait for action
	 * @param duration
	 */
	public static void WaitforAction(int duration) {
		try {
			Thread.sleep(TimeUnit.MINUTES.toMillis(duration));
			Reporter.log("User wait for" + duration + " minutes");
		} catch (InterruptedException e) {
			Reporter.log("User unable to wait for" + duration + " minutes");
		}
	}

//	public static void turnonDoNotDisturb() {
//		
//		try{
//			LFSUtilsIOS.appBackground();

	
	public static void navigateToSettingSceenFromTrustScreen() {
		try {
		launchSettings();
		DeviceSettingsPageIOS deviceSetting = new DeviceSettingsPageIOS();
		LFSUtilsIOS.click(deviceSetting.getNfkiosdevicesettingsDeviceManagement());
		LFSUtilsIOS.click(deviceSetting.getNFKiosdevicesettingsGeneralScreenBtn());
		LFSUtilsIOS.click(deviceSetting.getNFKiosDeviceSettingsSettingButton());
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to navigate from trust screen to setting screen", MessageTypes.Fail);
		}
	}
	public static void turnonDoNotDisturb() {
		try{LFSUtilsIOS.appBackground();

		launchSettings();
		Thread.sleep(2000);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Focus']").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Do Not Disturb']").click();
		LFSUtilsIOS.waitforLoad();
		int donotdisturbStatus = Integer
				.parseInt(LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[1]/XCUIElementTypeSwitch[1]").getAttribute("value"));
		if (donotdisturbStatus == 0) {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[1]/XCUIElementTypeSwitch[1]").click();
			
					} else {
						Reporter.log("Do not disturb is already ON");}
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[1]").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label=\"Settings\"]").click();
		}catch (InterruptedException e) {
			Reporter.log("User not able to select Do not disturb");
		}
	}
	public static void turnOFFDoNotDisturb() {
		try{LFSUtilsIOS.appBackground();
		launchSettings();
		Thread.sleep(2000);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Focus']").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Do Not Disturb']").click();
		LFSUtilsIOS.waitforLoad();
		int donotdisturbStatus = Integer
				.parseInt(LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[1]/XCUIElementTypeSwitch[1]").getAttribute("value"));
		if (donotdisturbStatus == 1) {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[1]/XCUIElementTypeSwitch[1]").click();
			
					} else {
						Reporter.log("Do not disturb is already off");}
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[1]").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label=\"Settings\"]").click();
		}catch (InterruptedException e) {
			Reporter.log("User not able to select Do not disturb");
		}
	}

}