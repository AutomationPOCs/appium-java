package com.NFK.version1.android.pages;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.MoremenuPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DeviceSettingsPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.device.settings.setdate.btn")
	private QAFWebElement NFKDeviceSettingsSetdateBtn;

	@FindBy(locator = "NFK.device.calender.popup.next.btn")
	private QAFWebElement NFKDeviceCalenderPopupNextBtn;

	@FindBy(locator = "NFK.device.calender.popup.back.btn")
	private QAFWebElement NFKDeviceCalenderPopupBackBtn;

	@FindBy(locator = "NFK.device.calender.year.btn")
	private QAFWebElement NFKDeviceCalenderYearBtn;

	@FindBy(locator = "NFK.device.calender.done.btn")
	private QAFWebElement NFKDeviceCalenderDoneBtn;

	@FindBy(locator = "NFK.device.settings.settime.btn")
	private QAFWebElement NFKDeviceSettingsSetTimeBtn;

	@FindBy(locator = "NFK.device.time.hour.txt")
	private QAFWebElement NFKDeviceTimeHourPicker;

	@FindBy(locator = "NFK.device.time.minute.txt")
	private QAFWebElement NFKDeviceTimeMinutePicker;

	@FindBy(locator = "NFK.device.time.meridian.txt")
	private QAFWebElement NFKDeviceTimeMeridianPicker;

	@FindBy(locator = "NFK.device.time.value.txt")
	private QAFWebElement NFKDeviceTimeValueTxt;

	@FindBy(locator = "NFK.device.calender.month.header.txt")
	private QAFWebElement NFKDeviceCalenderMonthHeaderTxt;

	@FindBy(locator = "NFK.device.calender.month.header.nxt.btn")
	private QAFWebElement NFKDeviceCalenderMonthHeaderNextBtn;

	@FindBy(locator = "NFK.device.calender.month.header.prev.btn")
	private QAFWebElement NFKDeviceCalenderMonthHeaderPrevBtn;

	@FindBy(locator = "NFK.device.calender.year.picker.btn")
	private QAFWebElement NFKDeviceCalenderYearPickerBtn;
	
	@FindBy(locator = "NFK.year.picker.btn")
	private QAFWebElement NFKDeviceCalenderYearPickerwheelBtn;
	
	@FindBy(locator = "NFK.device.time.autoupdate.switch")
	private QAFWebElement NFKDeviceTimeAutoupdateSwitch;
	
	
	public QAFWebElement getNFKDeviceTimeAutoupdateSwitch() {
		return NFKDeviceTimeAutoupdateSwitch;
	}

	public QAFWebElement getNFKDeviceCalenderYearPickerwheelBtn() {
		return NFKDeviceCalenderYearPickerwheelBtn;
	}

	public void setNFKDeviceCalenderYearPickerwheelBtn(QAFWebElement NFKDeviceCalenderYearPickerwheelBtn) {
		this.NFKDeviceCalenderYearPickerwheelBtn = NFKDeviceCalenderYearPickerwheelBtn;
	}

	public QAFWebElement getNFKDeviceCalenderYearTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.calender.year.txt", text);
	}

	public QAFWebElement getNFKDeviceCalenderMonthHeaderTxt() {
		return NFKDeviceCalenderMonthHeaderTxt;
	}

	public void setNFKDeviceCalenderMonthHeaderTxt(QAFWebElement NFKDeviceCalenderMonthHeaderTxt) {
		this.NFKDeviceCalenderMonthHeaderTxt = NFKDeviceCalenderMonthHeaderTxt;
	}

	public QAFWebElement getNFKDeviceCalenderMonthHeaderNextBtn() {
		return NFKDeviceCalenderMonthHeaderNextBtn;
	}

	public void setNFKDeviceCalenderMonthHeaderNextBtn(QAFWebElement NFKDeviceCalenderMonthHeaderNextBtn) {
		this.NFKDeviceCalenderMonthHeaderNextBtn = NFKDeviceCalenderMonthHeaderNextBtn;
	}

	public QAFWebElement getNFKDeviceCalenderMonthHeaderPrevBtn() {
		return NFKDeviceCalenderMonthHeaderPrevBtn;
	}

	public void setNFKDeviceCalenderMonthHeaderPrevBtn(QAFWebElement NFKDeviceCalenderMonthHeaderPrevBtn) {
		this.NFKDeviceCalenderMonthHeaderPrevBtn = NFKDeviceCalenderMonthHeaderPrevBtn;
	}

	public QAFWebElement getNFKDeviceCalenderYearPickerBtn() {
		return NFKDeviceCalenderYearPickerBtn;
	}

	public void setNFKDeviceCalenderYearPickerBtn(QAFWebElement NFKDeviceCalenderYearPickerBtn) {
		this.NFKDeviceCalenderYearPickerBtn = NFKDeviceCalenderYearPickerBtn;
	}

	public QAFWebElement getNFKDeviceTimeValueTxt() {
		return NFKDeviceTimeValueTxt;
	}

	public void setNFKDeviceTimeValueTxt(QAFWebElement NFKDeviceTimeValueTxt) {
		this.NFKDeviceTimeValueTxt = NFKDeviceTimeValueTxt;
	}

	public QAFWebElement getNFKDeviceTimeHourPicker() {
		return NFKDeviceTimeHourPicker;
	}

	public void setNFKDeviceTimeHourPicker(QAFWebElement NFKDeviceTimeHourPicker) {
		this.NFKDeviceTimeHourPicker = NFKDeviceTimeHourPicker;
	}

	public QAFWebElement getNFKDeviceTimeMinutePicker() {
		return NFKDeviceTimeMinutePicker;
	}

	public void setNFKDeviceTimeMinutePicker(QAFWebElement NFKDeviceTimeMinutePicker) {
		this.NFKDeviceTimeMinutePicker = NFKDeviceTimeMinutePicker;
	}

	public QAFWebElement getNFKDeviceTimeMeridianPicker() {
		return NFKDeviceTimeMeridianPicker;
	}

	public void setNFKDeviceTimeMeridianPicker(QAFWebElement NFKDeviceTimeMeridianPicker) {
		this.NFKDeviceTimeMeridianPicker = NFKDeviceTimeMeridianPicker;
	}

	public QAFWebElement getNFKDeviceSettingsSetTimeBtn() {
		return NFKDeviceSettingsSetTimeBtn;
	}

	public void setNFKDeviceSettingsSetTimeBtn(QAFWebElement NFKDeviceSettingsSetTimeBtn) {
		this.NFKDeviceSettingsSetTimeBtn = NFKDeviceSettingsSetTimeBtn;
	}

	public QAFWebElement getNFKDeviceCalenderDoneBtn() {
		return NFKDeviceCalenderDoneBtn;
	}

	public void setNFKDeviceCalenderDoneBtn(QAFWebElement NFKDeviceCalenderDoneBtn) {
		this.NFKDeviceCalenderDoneBtn = NFKDeviceCalenderDoneBtn;
	}

	public QAFWebElement getNFKDeviceSettingsSetdateBtn() {
		return NFKDeviceSettingsSetdateBtn;
	}

	public void setNFKDeviceSettingsSetdateBtn(QAFWebElement NFKDeviceSettingsSetdateBtn) {
		this.NFKDeviceSettingsSetdateBtn = NFKDeviceSettingsSetdateBtn;
	}

	public QAFWebElement getNFKDeviceCalenderPopupNextBtn() {
		return NFKDeviceCalenderPopupNextBtn;
	}

	public void setNFKDeviceCalenderPopupNextBtn(QAFWebElement NFKDeviceCalenderPopupNextBtn) {
		this.NFKDeviceCalenderPopupNextBtn = NFKDeviceCalenderPopupNextBtn;
	}

	public QAFWebElement getNFKDeviceCalenderPopupBackBtn() {
		return NFKDeviceCalenderPopupBackBtn;
	}

	public void setNFKDeviceCalenderPopupBackBtn(QAFWebElement NFKDeviceCalenderPopupBackBtn) {
		this.NFKDeviceCalenderPopupBackBtn = NFKDeviceCalenderPopupBackBtn;
	}

	public QAFWebElement getNFKDeviceCalenderYearBtn() {
		return NFKDeviceCalenderYearBtn;
	}

	public void setNFKDeviceCalenderYearBtn(QAFWebElement NFKDeviceCalenderYearBtn) {
		this.NFKDeviceCalenderYearBtn = NFKDeviceCalenderYearBtn;
	}

	public QAFWebElement getNFKDeviceCalenderDateTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.calender.date.txt", text);
	}

	public QAFWebElement getNFKDeviceTimeHoueTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.time.hour.txt", text);
	}

	public QAFWebElement getNFKDeviceTimeMinuteTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.time.minute.txt", text);
	}

	public QAFWebElement getNFKDeviceTimeMeridianTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.time.meridian.txt", text);
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	public void closeSettingActivity() {
		AppiumDriver<?> iosDriver = (AppiumDriver) driver.getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Settings");
		try {
			iosDriver.executeScript("mobile:application:close", params);
		}catch (Exception e) {
		}
		
		Reporter.logWithScreenShot("Device Settings launched" , MessageTypes.Pass);
		
	}

	public void changeDeviceDate(String date) {
		int dateValue = Integer.parseInt(date);
		LocalDate todaysDate = null;

		if (dateValue == 0) {
			todaysDate = LocalDate.now();
		} else  {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(dateValue);
	
		}

		String dayOfWeek = todaysDate.getDayOfWeek().toString();
		dayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();

		String currentmonthValue = todaysDate.getMonth().toString();
		currentmonthValue = currentmonthValue.substring(0, 1)
				+ currentmonthValue.substring(1, currentmonthValue.length()).toLowerCase();

		String tomorrowDate = dayOfWeek + ", " + currentmonthValue + " " + todaysDate.getDayOfMonth() + ", "
				+ todaysDate.getYear();
		
		checkMonthAndYearOnCalender(currentmonthValue, todaysDate.getYear());
		
		getNFKDeviceCalenderDateTxt(tomorrowDate).click();
		LFSUtilsAndroid.waitforLoad();

		getNFKDeviceCalenderDoneBtn().click();
		Reporter.logWithScreenShot("Date selected", MessageTypes.Pass);

	}

	public void checkMonthAndYearOnCalender(String month, int year) {

		String currentCalenderMonth = null, expMonth = null, sCurrentVal = null, sExpectedVal = null;
		int iCalYear = 0, iExpYear = 0, iCurrentVal = 0, iExpectedVal = 0;
		
		currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		String currenCalenderYear="";
		if(getNFKDeviceCalenderYearPickerBtn().isPresent()) {
			currenCalenderYear =  getNFKDeviceCalenderYearPickerBtn().getText();
		}else {
			String s[]=currentCalenderMonth.split(" ");
			currentCalenderMonth=s[0].substring(0, 1).toUpperCase() + s[0].substring(1,3).toLowerCase();
			Reporter.logWithScreenShot(currentCalenderMonth, MessageTypes.Pass);
			currenCalenderYear=s[1];
		}
		 
	
		iCalYear = Integer.parseInt(currenCalenderYear);
		iExpYear = year;
		expMonth = month.substring(0, 3);
			
		sCurrentVal = LFSUtilsAndroid.monthIntValue(currentCalenderMonth);
		sExpectedVal = LFSUtilsAndroid.monthIntValue(expMonth);
		iCurrentVal = Integer.parseInt(sCurrentVal);
		iExpectedVal = Integer.parseInt(sExpectedVal);
	
		if(iExpYear == iCalYear){
			Reporter.logWithScreenShot("Expected year and Calender year is same", MessageTypes.Pass);
		}else if(iExpYear > iCalYear){
			Reporter.logWithScreenShot("Expected year greater than Calender year");
			changeYear(iExpYear);
		}else if(iExpYear < iCalYear){
			Reporter.logWithScreenShot("Expected year less than Calender year");
			decreaseYear(iExpYear,iCalYear);
		}
		
		if(!getNFKDeviceCalenderYearPickerBtn().isPresent()) {
		
			currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
			String s[]=currentCalenderMonth.split(" ");
			currentCalenderMonth=s[0].substring(0, 1).toUpperCase() + s[0].substring(1,3).toLowerCase();
			Reporter.logWithScreenShot(currentCalenderMonth, MessageTypes.Pass);
			currenCalenderYear=s[1];
		}
		sCurrentVal = LFSUtilsAndroid.monthIntValue(currentCalenderMonth);
		iCurrentVal = Integer.parseInt(sCurrentVal);
			
		if(iExpectedVal == iCurrentVal){
			Reporter.logWithScreenShot("Expected month and current month matching", MessageTypes.Pass);
		}else if(iExpectedVal > iCurrentVal){
			Reporter.logWithScreenShot("Expected month greater than current month");
			increaseMonth(currentCalenderMonth, expMonth);
		}else if(iExpectedVal < iCurrentVal){
			Reporter.logWithScreenShot("Expected month less than current month");
			decreaseMonth(currentCalenderMonth, expMonth);
		}	
		
		Reporter.logWithScreenShot("Month and year value matched on Calender", MessageTypes.Pass);
	}
	
	public void increaseMonth(String currentCalenderMonth, String expMonth){
		currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		while(!currentCalenderMonth.equalsIgnoreCase(expMonth)){
			getNFKDeviceCalenderMonthHeaderNextBtn().click();
			LFSUtilsAndroid.waitforLoad();
			currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		}
	}
	
	public void decreaseMonth(String currentCalenderMonth, String expMonth){
		currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		while(!currentCalenderMonth.equalsIgnoreCase(expMonth)){
			getNFKDeviceCalenderMonthHeaderPrevBtn().click();
			LFSUtilsAndroid.waitforLoad();
			currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		}
	}
	
	public void decreaseYear(int iExpYear, int iCurrentYear){
		
		while(!(iExpYear == iCurrentYear)){
			getNFKDeviceCalenderMonthHeaderPrevBtn().click();
			LFSUtilsAndroid.waitforLoad();
			iCurrentYear = Integer.parseInt(getNFKDeviceCalenderYearPickerBtn().getText());
		}
		
	}
	
	public void changeYear(int iExpYear){
		String year = Integer.toString(iExpYear);
		getNFKDeviceCalenderYearPickerBtn().click();
		LFSUtilsAndroid.waitforLoad();

		if(getNFKDeviceCalenderYearTxt(year).isDisplayed()){
			getNFKDeviceCalenderYearTxt(year).click();
		}else{
			Reporter.logWithScreenShot("Year value not displayed", MessageTypes.Fail);			
		}
	}
	
	public void openSystemDate() {

		if (getNFKDeviceCalenderDoneBtn().isPresent()) {
			getNFKDeviceCalenderDoneBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Calender done button clicked", MessageTypes.Pass);
		}			   

		if (new DeviceSettingsPageAndroid().getNFKDeviceSettingsSetdateBtn().isPresent()) {
			new DeviceSettingsPageAndroid().getNFKDeviceSettingsSetdateBtn().click();
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Set date field not displayed", MessageTypes.Fail);
		}
	}
	public void switchOnAutomaticTimeUpdateSwitch() {
		getNFKDeviceTimeAutoupdateSwitch().waitForPresent(3000);
		if (getNFKDeviceTimeAutoupdateSwitch().getAttribute("checked").equals(false)) {
			getNFKDeviceTimeAutoupdateSwitch().click();
		}
	}
	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator="NFK.Devicesettingpage.device.btn")
	private QAFWebElement NFKDevicesettingpagedevicebtn;
	@FindBy(locator="NFK.Devicesettingpage.device.appnotification.btn")
	private QAFWebElement NFKDevicesettingpagedeviceappnotificationbtn;
	@FindBy(locator="NFK.Devicesettingpage.NFKapp.lbl")
	private QAFWebElement NFKDevicesettingpageNFKapplbl;
	@FindBy(locator="NFK.Devicesettingpage.noti1.btn")
	private QAFWebElement NFKDevicesettingpagenoti1btn;
	@FindBy(locator="NFK.Devicesettingpage.noti2.btn")
	private QAFWebElement NFKDevicesettingpagenoti2btn;
	@FindBy(locator="NFK.Devicesettingpage.noti3.btn")
	private QAFWebElement NFKDevicesettingpagenoti3btn;
	@FindBy(locator="NFK.Devicesettingpage.noti4.btn")
	private QAFWebElement NFKDevicesettingpagenoti4btn;
	@FindBy(locator="NFK.Devicesettingpage.noti5.btn")
	private QAFWebElement NFKDevicesettingpagenoti5btn;
	@FindBy(locator="NFK.Devicesettingpage.noti6.btn")
	private QAFWebElement NFKDevicesettingpagenoti6btn;
	@FindBy(locator="NFK.Devicesettingpage.noti7.btn")
	private QAFWebElement NFKDevicesettingpagenoti7btn;
	@FindBy(locator="NFK.Devicesettingpage.noti8.btn")
	private QAFWebElement NFKDevicesettingpagenoti8btn;
	@FindBy(locator="NFK.Devicesettingpage.noti9.btn")
	private QAFWebElement NFKDevicesettingpagenoti9btn;
	@FindBy(locator="NFK.Devicesettingpage.noti10.btn")
	private QAFWebElement NFKDevicesettingpagenoti10btn;
	@FindBy(locator="NFK.Devicesettingpage.noti11.btn")
	private QAFWebElement NFKDevicesettingpagenoti11btn;
	@FindBy(locator="NFK.Devicesettingpage.noti12.btn")
	private QAFWebElement NFKDevicesettingpagenoti12btn;
	@FindBy(locator="NFK.Devicesettingpage.noti13.btn")
	private QAFWebElement NFKDevicesettingpagenoti13btn;
	@FindBy(locator="NFK.Devicesettingpage.noti14.btn")
	private QAFWebElement NFKDevicesettingpagenoti14btn;
	@FindBy(locator="NFK.Devicesettingpage.noti15.btn")
	private QAFWebElement NFKDevicesettingpagenoti15btn;
	@FindBy(locator="NFK.Devicesettingpage.noti16.btn")
	private QAFWebElement NFKDevicesettingpagenoti16btn;
	@FindBy(locator="NFK.Devicesettingpage.noti17.btn")
	private QAFWebElement NFKDevicesettingpagenoti17btn;
	@FindBy(locator="NFK.Devicesettingpage.noti18.btn")
	private QAFWebElement NFKDevicesettingpagenoti18btn;
	@FindBy(locator="NFK.Devicesettingpage.noti19.btn")
	private QAFWebElement NFKDevicesettingpagenoti19btn;
	@FindBy(locator="NFK.Devicesettingpage.appandnoti.btn")
	private QAFWebElement NFKDevicesettingappandnotibtn;
	@FindBy(locator="NFK.Devicesettingpage.noti20.btn")
	private QAFWebElement NFKDevicesettingpagenoti20btn;
	@FindBy(locator="NFK.Devicesettingpage.noti21.btn")
	private QAFWebElement NFKDevicesettingpagenoti21btn;
	@FindBy(locator="NFK.Devicesettingpage.noti22.btn")
	private QAFWebElement NFKDevicesettingpagenoti22btn;
	@FindBy(locator="NFK.Devicesettingpage.noti23.btn")
	private QAFWebElement NFKDevicesettingpagenoti23btn;
	@FindBy(locator="NFK.Devicesettingpage.noti24.btn")
	private QAFWebElement NFKDevicesettingpagenoti24btn;
	@FindBy(locator="NFK.Devicesettingpage.noti25.btn")
	private QAFWebElement NFKDevicesettingpagenoti25btn;
	@FindBy(locator="NFK.Devicesettingpage.noti26.btn")
	private QAFWebElement NFKDevicesettingpagenoti26btn;
	
	
	public QAFWebElement getNFKDevicesettingpagedevicebtn(){
		return NFKDevicesettingpagedevicebtn;
	}
	
	public QAFWebElement getNFKDevicesettingpagenoti1btn(){
		return NFKDevicesettingpagenoti1btn;
	}
	
	public QAFWebElement getNFKDevicesettingpagenoti2btn(){
		return NFKDevicesettingpagenoti2btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti3btn(){
		return NFKDevicesettingpagenoti3btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti4btn(){
		return NFKDevicesettingpagenoti4btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti5btn(){
		return NFKDevicesettingpagenoti5btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti7btn(){
		return NFKDevicesettingpagenoti7btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti8btn(){
		return NFKDevicesettingpagenoti8btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti6btn(){
		return NFKDevicesettingpagenoti6btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti9btn(){
		return NFKDevicesettingpagenoti9btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti10btn(){
		return NFKDevicesettingpagenoti10btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti11btn(){
		return NFKDevicesettingpagenoti11btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti12btn(){
		return NFKDevicesettingpagenoti12btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti13btn(){
		return NFKDevicesettingpagenoti13btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti14btn(){
		return NFKDevicesettingpagenoti14btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti15btn(){
		return NFKDevicesettingpagenoti15btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti16btn(){
		return NFKDevicesettingpagenoti16btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti17btn(){
		return NFKDevicesettingpagenoti17btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti18btn(){
		return NFKDevicesettingpagenoti18btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti19btn(){
		return NFKDevicesettingpagenoti19btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti20btn(){
		return NFKDevicesettingpagenoti20btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti21btn(){
		return NFKDevicesettingpagenoti21btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti22btn(){
		return NFKDevicesettingpagenoti22btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti23btn(){
		return NFKDevicesettingpagenoti23btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti24btn(){
		return NFKDevicesettingpagenoti24btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti25btn(){
		return NFKDevicesettingpagenoti25btn;
	}
	public QAFWebElement getNFKDevicesettingpagenoti26btn(){
		return NFKDevicesettingpagenoti26btn;
	}
	
	public QAFWebElement getNFKDevicesettingpagedeviceappnotificationbtn(){
		return NFKDevicesettingpagedeviceappnotificationbtn;
	}
	
	public QAFWebElement getNFKDevicesettingpageNFKapplbl(){
		return NFKDevicesettingpageNFKapplbl;
	}
	
	public QAFWebElement getNFKDevicesettingappandnotibtn() {
		return NFKDevicesettingappandnotibtn;
	}
	public QAFWebElement getNFKDevicesettingpageStaticlabel(String text) {
		return LFSUtilsAndroid.getElement("NFK.Devicesettingpage.statictext.lbl", text);
	}
	public void findAppname(String text) {
		boolean flag = true;
		int count = 1;
		while (flag) {
			try {
				Map<String, Object> params = new HashMap<>();
				params.put("content", text);
				String res = (String) driver.executeScript("mobile:touch:swipe", params);
				if (res.equals("true")) {
					flag = false;
					break;
				} else
					throw new Exception();
			} catch (Exception NoSuchElementException) {
				count = count + 1;
				Map<String, Object> params = new HashMap<>();
				params.put("start", "40%,90%");
				params.put("end", "40%,20%");
				params.put("duration", "2");
				Object res = driver.executeScript("mobile:touch:swipe", params);
				if (count == 5) {
					break;
				}
			}
		}
	}
	
	//Roshani
	
			public void opensetting() {
				LFSUtilsAndroid.startApp("com.android.settings", "identifier");
				LFSUtilsAndroid.waitforLoad();
				if(getNFKDevicesettingpagedevicebtn().isPresent())
				{
				getNFKDevicesettingpagedevicebtn().click();
				getNFKDevicesettingpagedeviceappnotificationbtn().assertPresent("App settings");
				getNFKDevicesettingpagedeviceappnotificationbtn().isPresent();
				getNFKDevicesettingpagedeviceappnotificationbtn().click();
				}
				else {
					getNFKDevicesettingappandnotibtn().isPresent();
					getNFKDevicesettingappandnotibtn().click();
					getNFKDevicesettingpagedevicebtn().isPresent();
					getNFKDevicesettingpagedevicebtn().click();
				}
				findAppname("OneTouch� 24/7 CGM");
				LFSUtilsAndroid.clickWithText("OneTouch� 24/7 CGM");
				Reporter.logWithScreenShot("sucessfully open app notification and clicks on 24*7 CGM app",MessageTypes.Pass);
			}
			
			//ROshani
			public void verifynotifications() {
				try {
				getNFKDevicesettingpageStaticlabel(LFSUtilsAndroid.getPropString("device.notification1")).verifyPresent("GLUCOSE ALERTS AND ALARMS");
				getNFKDevicesettingpagenoti1btn().assertPresent("Urgent Low Glucose Alarm");
				getNFKDevicesettingpagenoti1btn().isEnabled();
				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpagenoti2btn().assertPresent("Urgent Low Glucose Soon Alert");
				getNFKDevicesettingpagenoti2btn().isEnabled();
				getNFKDevicesettingpagenoti3btn().assertPresent("Urgent Low Glucose Soon Alert, Schedule");
				getNFKDevicesettingpagenoti3btn().isEnabled();
				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpagenoti4btn().assertPresent("Low Glucose Alert");
				getNFKDevicesettingpagenoti4btn().isEnabled();
				getNFKDevicesettingpagenoti5btn().assertPresent("Low Glucose Alert, Schedule");
				getNFKDevicesettingpagenoti5btn().isEnabled();
				getNFKDevicesettingpagenoti6btn().assertPresent("High Glucose Alert");
				getNFKDevicesettingpagenoti6btn().isEnabled();
				getNFKDevicesettingpagenoti7btn().assertPresent("High Glucose Alert, Schedule");
				getNFKDevicesettingpagenoti7btn().isEnabled();
				getNFKDevicesettingpagenoti8btn().assertPresent("Fall Rate Alert");
				getNFKDevicesettingpagenoti8btn().isEnabled();
				getNFKDevicesettingpagenoti9btn().assertPresent("Fall Rate Alert, Schedule");
				getNFKDevicesettingpagenoti9btn().isEnabled();
				getNFKDevicesettingpagenoti10btn().assertPresent("Rise Rate Alert");
				getNFKDevicesettingpagenoti10btn().isEnabled();
				getNFKDevicesettingpagenoti11btn().assertPresent("Rise Rate Alert, Schedule");
				getNFKDevicesettingpagenoti11btn().isEnabled();
				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpageStaticlabel(LFSUtilsAndroid.getPropString("device.appandsystem")).assertPresent("APP AND SYSTEM NOTIFICATIONS");
				getNFKDevicesettingpagenoti12btn().assertPresent("Sensor Failed Alarm");
				getNFKDevicesettingpagenoti12btn().isEnabled();
				getNFKDevicesettingpagenoti13btn().assertPresent("No Readings Alert");
				getNFKDevicesettingpagenoti13btn().isEnabled();
				getNFKDevicesettingpagenoti14btn().assertPresent("Signal Loss Alert");
				getNFKDevicesettingpagenoti14btn().isEnabled();
				getNFKDevicesettingpagenoti15btn().assertPresent("Sensor Expiring");
				getNFKDevicesettingpagenoti15btn().isEnabled();
				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpagenoti16btn().assertPresent("Sensor Expired");
				getNFKDevicesettingpagenoti16btn().isEnabled();
//				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpagenoti17btn().assertPresent("App Closed Unexpectedly");
				getNFKDevicesettingpagenoti17btn().isEnabled();
				getNFKDevicesettingpagenoti18btn().assertPresent("No Storage");
				getNFKDevicesettingpagenoti18btn().isEnabled();
				getNFKDevicesettingpagenoti19btn().assertPresent("Low Storage");
				getNFKDevicesettingpagenoti19btn().isEnabled();
				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpagenoti20btn().assertPresent("Sensor Pair Status");
				getNFKDevicesettingpagenoti20btn().isEnabled();
				getNFKDevicesettingpagenoti21btn().assertPresent("OneTouch 24/7 CGM App is Open");
				getNFKDevicesettingpagenoti21btn().isEnabled();
				getNFKDevicesettingpagenoti22btn().assertPresent("Sensor Settings Update");
				getNFKDevicesettingpagenoti22btn().isEnabled();
				getNFKDevicesettingpagenoti23btn().assertPresent("Reminder");
				getNFKDevicesettingpagenoti23btn().isEnabled();
				LFSUtilsAndroid.swipePage();
				getNFKDevicesettingpagenoti24btn().assertPresent("App Use Suspended Alert");
				getNFKDevicesettingpagenoti24btn().isEnabled();
				getNFKDevicesettingpagenoti25btn().assertPresent("Bluetooth� Off Alert");
				getNFKDevicesettingpagenoti25btn().isEnabled();
				getNFKDevicesettingpagenoti26btn().assertPresent("Missed Notification");
				getNFKDevicesettingpagenoti26btn().isEnabled();
				Reporter.logWithScreenShot("Device Notifications sucessfully verified as enabled by default",MessageTypes.Pass);
				}catch (Exception e) {
				e.printStackTrace();
				Reporter.logWithScreenShot("Fail to verify device notifications",MessageTypes.Fail);
			}
				androidDriver.launchApp();
				Reporter.logWithScreenShot("sucessfully open app again with last open stage",MessageTypes.Pass);
			}
			
			//Method to turn off wifi
			public void turnOffWifi() {
				try {
				LFSUtilsAndroid.turnWifiOff();
				Reporter.log("Successfully turned off wifi", MessageTypes.Pass);
			}catch (Exception e) {
				Reporter.log("Failed to turned off wifi", MessageTypes.Fail);
			}
			}

			//Method to turn on wifi
			public void turnOnWifi() {
				try {
				LFSUtilsAndroid.turnWifiOn();
				Reporter.log("Successfully turned on wifi", MessageTypes.Pass);
			}catch (Exception e) {
				Reporter.log("Failed to turned on wifi", MessageTypes.Fail);
			}
			}
	}


