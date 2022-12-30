package com.NFK.version1.iOS.pages;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.NFK.support.CallSMS;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumCommandInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AppiumCommandExecutor;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
public class DeviceSettingsPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	MoremenuPageIOS moreMenu = new MoremenuPageIOS();
	LFSUtilsIOS utilsIos = new LFSUtilsIOS();
	@FindBy(locator = "NFKios.devicesettings.calender.txt")
	private QAFWebElement NFKIosDeviceSettingsCalenderTxt;

	@FindBy(locator = "NFKios.devicesettings.time.txt")
	private QAFWebElement NFKIosDeviceSettingsTimeTxt;

	@FindBy(locator = "NFKios.devicesettings.search.txt")
	private QAFWebElement NFKIosDeviceSettingsSearchBoxtxt;

	@FindBy(locator = "NFKios.devicesettings.searched.option.txt")
	private QAFWebElement NFKIosDeviceSettingsSearchedOptionTxt;
	@FindBy(locator = "NFKios.devicesettings.switches")
	private QAFWebElement NFKIosDeviceSettingsSwitches;

	@FindBy(locator = "Nfkios.devicesettings.allowCriticalAlert")
	private QAFWebElement NFKIosDeviceSettingsAllowCritocalAlert;
	
	
	public QAFWebElement getNFKIosDeviceSettingsSwitches() {
		return NFKIosDeviceSettingsSwitches;
	}
	public QAFWebElement getNFKIosDeviceSettingsAllowCricticalAlert() {
		return NFKIosDeviceSettingsAllowCritocalAlert;
	}
	public QAFWebElement getNFKIosDeviceSettingsSearchBoxtxt() {
		return NFKIosDeviceSettingsSearchBoxtxt;
	}

	public void setNFKIosDeviceSettingsSearchBoxtxt(
			QAFWebElement NFKIosDeviceSettingsSearchBoxtxt) {
		this.NFKIosDeviceSettingsSearchBoxtxt = NFKIosDeviceSettingsSearchBoxtxt;
	}

	public QAFWebElement getNFKIosDeviceSettingsSearchedOptionTxt() {
		return NFKIosDeviceSettingsSearchedOptionTxt;
	}

	public void setNFKIosDeviceSettingsSearchedOptionTxt(
			QAFWebElement NFKIosDeviceSettingsSearchedOptionTxt) {
		this.NFKIosDeviceSettingsSearchedOptionTxt =
				NFKIosDeviceSettingsSearchedOptionTxt;
	}

	public QAFWebElement getNFKIosDeviceSettingsCalenderTxt() {
		return NFKIosDeviceSettingsCalenderTxt;
	}

	public void setNFKIosDeviceSettingsCalenderTxt(
			QAFWebElement NFKIosDeviceSettingsCalenderTxt) {
		this.NFKIosDeviceSettingsCalenderTxt = NFKIosDeviceSettingsCalenderTxt;
	}

	public QAFWebElement getNFKIosDeviceSettingsTimeTxt() {
		return NFKIosDeviceSettingsTimeTxt;
	}

	public void setNFKIosDeviceSettingsTimeTxt(
			QAFWebElement NFKIosDeviceSettingsTimeTxt) {
		this.NFKIosDeviceSettingsTimeTxt = NFKIosDeviceSettingsTimeTxt;
	}
	@FindBy(locator = "NFKios.setting.Appnotification")
	private QAFWebElement NFKiosSettingAppnotification;

	public QAFWebElement getNFKiosSettingAppnotification() {
		return NFKiosSettingAppnotification;
	}
	
	@FindBy(locator = "NFKios.devicesettings.GeneralScreenBTN")
	private QAFWebElement NFKiosdevicesettingsGeneralScreenBtn;

	public QAFWebElement getNFKiosdevicesettingsGeneralScreenBtn() {
		return NFKiosdevicesettingsGeneralScreenBtn;
	}
	@FindBy(locator = "Nfkios.devicesettings.DeviceManagementBTN")
	private QAFWebElement NfkiosdevicesettingsDeviceManagementBtn;

	public QAFWebElement getNfkiosdevicesettingsDeviceManagement() {
		return NfkiosdevicesettingsDeviceManagementBtn;
	}

	@FindBy(locator = "Nfkios.devicesettings.allowLifeScanTrustAlertLabel")
	private QAFWebElement NfkiosdevicesettingsallowLifeScanTrustAlertLabelBtn;

	public QAFWebElement getNfkiosdevicesettingsallowLifeScanTrustAlertLabel() {
		return NfkiosdevicesettingsallowLifeScanTrustAlertLabelBtn;
	}
	@FindBy(locator = "Nfkios.devicesettings.allowTrustAlertBTN")
	private QAFWebElement NfkiosdevicesettingsallowTrustAlertBtn;

	public QAFWebElement getNfkiosdevicesettingsallowTrustAlert() {
		return NfkiosdevicesettingsallowTrustAlertBtn;
	}
	@FindBy(locator = "NFKios.devicesettings.DateTimeBTN")
	private QAFWebElement NFKiosdevicesettingsDateTimeBTNBtn;

	public QAFWebElement getNFKiosdevicesettingsDateTimeBTN() {
		return NFKiosdevicesettingsDateTimeBTNBtn;
	}
	@FindBy(locator = "NFKios.devicesettings.SetAutomaticallyBTN")
	private QAFWebElement NFKiosdevicesettingsSetAutomaticallyBTN;

	public QAFWebElement getNFKiosdevicesettingsSetAutomaticallyBTN() {
		return NFKiosdevicesettingsSetAutomaticallyBTN;
	}
	
	@FindBy(locator = "NFKios.devicesettings.TimeZoneBTN")
	private QAFWebElement NFKiosdevicesettingsTimeZoneBTNBTN;

	public QAFWebElement getNFKiosdevicesettingsTimeZoneBTNBTN() {
		return NFKiosdevicesettingsTimeZoneBTNBTN;
	}
	@FindBy(locator = "NFKios.keyBoard.delete.btn")
	private QAFWebElement NFKiosKeyBoardDeleteBtn;

	public QAFWebElement getNFKiosKeyBoardDeleteBtn() {
		return NFKiosKeyBoardDeleteBtn;
	}
	
	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
@FindBy(locator = "NFKios.devicesettings.time1")
	private QAFWebElement NFKiosDevicesettingsTime1;

    public QAFWebElement getNFKiosDevicesettingsTime1() {
		return NFKiosDevicesettingsTime1;
	}


    @FindBy(locator = "NFKios.devicesettings.time2")
	private QAFWebElement NFKiosDevicesettingsTime2;

    public QAFWebElement getNFKiosDevicesettingsTime2() {
		return NFKiosDevicesettingsTime2;
	}

    @FindBy(locator = "NFKios.devicesettings.Hours")
	private QAFWebElement NFKiosDevicesettingHours;

    public QAFWebElement getNFKiosDevicesettingHours() {
		return NFKiosDevicesettingHours;
	}

    @FindBy(locator = "NFKios.devicesettings.minute")
	private QAFWebElement NFKiosDevicesettingMinute;

    public QAFWebElement getNFKiosDevicesettingMinute() {
		return NFKiosDevicesettingMinute;
	}

     @FindBy(locator = "NFKios.devicesettings.daytime")
	private QAFWebElement NFKiosDevicesettingDaytime;

    public QAFWebElement getNFKiosDevicesettingDaytime() {
		return NFKiosDevicesettingDaytime;
	}
    
    @FindBy(locator = "NFKios.deviceSettings.setting.button")
	private QAFWebElement NFKiosDeviceSettingsSettingButton;

   public QAFWebElement getNFKiosDeviceSettingsSettingButton() {
		return NFKiosDeviceSettingsSettingButton;
	}
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public void switchWiFiOnOff() {

		LFSUtilsAndroid.getwifi();

	}
	public void switchOnAutomaticTimeUpdateSwitch() {
		MoremenuPageIOS moreMenu=new MoremenuPageIOS();
		if (moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
				.getAttribute("value").equals("0")) {
			moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
					.click();
			LFSUtilsIOS.waitforLoad();
		}
	}

	public void ClickAllowCriticalAlertsButton() {
		if(getNFKIosDeviceSettingsAllowCricticalAlert().isPresent()) {
			getNFKIosDeviceSettingsAllowCricticalAlert().click();
			Reporter.logWithScreenShot("Allowed Critical Alert",MessageTypes.Pass);
		}
	}
	public void setDateAndTime() {

		if (getNFKIosDeviceSettingsSearchedOptionTxt().isPresent()) {
			Reporter.logWithScreenShot("Date & Time option found", MessageTypes.Pass);
			LFSUtilsIOS.click(moreMenu.getNFKiosMoremenuPageReminderNameTxt("Date & Time"));
			LFSUtilsIOS.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Date & Time option not found ",
					MessageTypes.Fail);
		}
		if (!moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
				.getAttribute("value").equals("0")) {
			moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
					.click();
			LFSUtilsIOS.waitforLoad();
		}
		}
	
	public void trustiOSAppCertificate(String certificateName) {
		LFSUtilsIOS.switchToContext("NATIVE_APP");
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
		LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
		Object res1 = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		try {
			LFSUtilsIOS.waitExplicit(getNfkiosdevicesettingsDeviceManagement(), 5000);
			LFSUtilsIOS.click(getNfkiosdevicesettingsDeviceManagement());

		} catch (Exception e) {
			Reporter.log("No device management setting found", MessageTypes.Fail);
		}
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=" + "'" + certificateName + "'" + "]").click();

		try {
			LFSUtilsIOS.click(getNfkiosdevicesettingsallowLifeScanTrustAlertLabel());
			LFSUtilsIOS.click(getNfkiosdevicesettingsallowTrustAlert());
		} catch (Exception e) {
			Reporter.logWithScreenShot("Looks Like Certificate already trusted. Exiting");
		}
	}
	
	public void closeSettingApp()  {

		LFSUtilsIOS.switchToContext("NATIVE_APP");
		try {
			LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
		} catch (Exception e) {
			Reporter.log("Fail to closed previously opened app", MessageTypes.Fail);
		}
	}
	
	public void updateTimezone(String timezone) {
		LFSUtilsIOS.startApp("com.apple.Preferences", "identifier");
		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,70%");
		params.put("end", "15%,25%");
		params.put("duration", "2");
		Object res = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
		Object res1 = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		LFSUtilsIOS.click(getNFKiosdevicesettingsDateTimeBTN());
		String status = LFSUtilsIOS.attributeGet(getNFKiosdevicesettingsSetAutomaticallyBTN(), "value");

		if (status.equals("0")) {
			LFSUtilsIOS.click(getNFKiosdevicesettingsTimeZoneBTNBTN());
		} else {
			LFSUtilsIOS.click(getNFKiosdevicesettingsSetAutomaticallyBTN());;
			LFSUtilsIOS.click(getNFKiosdevicesettingsTimeZoneBTNBTN());
		}

		switch (timezone) {
		case "PST":
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSearchField[1]").sendKeys("Los Angeles");
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label=\"Los Angeles, U.S.A.\"]").click();
			break;
		case "EST":
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSearchField[1]").sendKeys("New York");
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label=\"New York, U.S.A.\"]").click();
			break;

		default:
			break;
		}

		LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label=\"Settings\"]").click();

	}
	public void pressDeleteKey(WebElement element) {
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		try {
			if (LFSUtilsIOS.tryMethod(getNFKiosKeyBoardDeleteBtn())) {
				LFSUtilsIOS.click(getNFKiosKeyBoardDeleteBtn());
				LFSUtilsIOS.click(getNFKiosKeyBoardDeleteBtn());
				LFSUtilsIOS.click(getNFKiosKeyBoardDeleteBtn());
			} else {
				element.click();
				getNFKiosKeyBoardDeleteBtn().waitForPresent();
				LFSUtilsIOS.click(getNFKiosKeyBoardDeleteBtn());
				LFSUtilsIOS.click(getNFKiosKeyBoardDeleteBtn());
				LFSUtilsIOS.click(getNFKiosKeyBoardDeleteBtn());
			}
		} catch (Exception e) {

		}
		
	}
	/*
	 * To set device time according to test case requirement.
	 */
	public void UpdateTime(String time) {
		String[] time1 = time.split("\\s");
		String[] time2 = time1[0].split("\\:");
		LFSUtilsIOS.switchToContext("NATIVE_APP");
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
		LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
		Object res1 = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		LFSUtilsIOS.click(getNFKiosdevicesettingsDateTimeBTN());
		String status=getNFKiosdevicesettingsSetAutomaticallyBTN().getAttribute("value");
		if(status.equals("0")) {		
			LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
			LFSUtilsIOS.click(getNFKiosDevicesettingsTime1());
			LFSUtilsIOS.click(getNFKiosDevicesettingsTime2());
			getNFKiosDevicesettingHours().sendKeys(time2[0]);
			getNFKiosDevicesettingMinute().sendKeys(time2[1]);
			getNFKiosDevicesettingDaytime().sendKeys(time1[1]);
			LFSUtilsIOS.click(getNFKiosDevicesettingsTime2());
			
		}else {
			LFSUtilsIOS.click(getNFKiosdevicesettingsSetAutomaticallyBTN());
			LFSUtilsIOS.click(getNFKiosDevicesettingsTime1());
			LFSUtilsIOS.click(getNFKiosDevicesettingsTime2());
			getNFKiosDevicesettingHours().sendKeys(time2[0]);
			getNFKiosDevicesettingMinute().sendKeys(time2[1]);
			getNFKiosDevicesettingDaytime().sendKeys(time1[1]);
			LFSUtilsIOS.click(getNFKiosDevicesettingsTime2());
		}
		LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label=\"Settings\"]").click();
	}
	/*
	 * TO set default date setting of device
	 */
	public void SetTimeAutomatic() {
			LFSUtilsIOS.switchToContext("NATIVE_APP");
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
			LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
			Object res1 = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
			LFSUtilsIOS.click(getNFKiosdevicesettingsDateTimeBTN());
			String status=getNFKiosdevicesettingsSetAutomaticallyBTN().getAttribute("value");
			if(status.equals("0")) {
				LFSUtilsIOS.click(getNFKiosdevicesettingsSetAutomaticallyBTN());
			}
			LFSUtilsIOS.click(getNFKiosdevicesettingsGeneralScreenBtn());
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label=\"Settings\"]").click();
		}
	
	//Method to turn off wifi
	public void turnOffWifi() {
		try {
		utilsIos.turnOffWiFi();
		iosDriver.launchApp();
		Reporter.log("Successfully turned off wifi", MessageTypes.Pass);
	}catch (Exception e) {
		Reporter.log("Failed to turned off wifi", MessageTypes.Fail);
	}
	}

	//Method to turn on wifi
	public void turnOnWifi() {
		try {
		utilsIos.turnOnWiFi();
		iosDriver.launchApp();
		Reporter.log("Successfully turned on wifi", MessageTypes.Pass);
	}catch (Exception e) {
		Reporter.log("Failed to turned on wifi", MessageTypes.Fail);
	}
	}
	
}
