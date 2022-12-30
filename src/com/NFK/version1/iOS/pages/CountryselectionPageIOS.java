package com.NFK.version1.iOS.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
public class CountryselectionPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	private AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
	SignupPageIOS signup = new SignupPageIOS();

	@FindBy(locator = "NFKios.countryselectionPage.next.btn")
	private QAFWebElement NFKiosCountryselectionpageNextBtn;
	@FindBy(locator = "NFKios.countryselectionPage.selectCountry.lbl")
	private QAFWebElement NFKiosCountryselectionpageSelectcountryLbl;
	@FindBy(locator = "NFKios.countryselectionPage.onetouch.img")
	private QAFWebElement NFKiosCountryselectionpageOnetouchImg;
	@FindBy(locator = "NFKios.countryselectionPage.whereLive.lbl")
	private QAFWebElement NFKiosCountryselectionpageWhereliveLbl;
	@FindBy(locator = "NFKios.countryselectionPage.iagree.btn")
	private QAFWebElement NFKiosCountryselectionPageIagreebtn;
	@FindBy(locator = "NFKios.countryselectionPage.Iunderstand.chkbx")
	private QAFWebElement NFKiosCountryselectionPageIunderstandChkbx;

	public QAFWebElement getNFKiosCountryselectionPageIunderstandChkbx() {
		return NFKiosCountryselectionPageIunderstandChkbx;
	}
	public QAFWebElement getNFKiosCountryselectionPageIagreebtn() {
		return NFKiosCountryselectionPageIagreebtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosCountryselectionpageNextBtn() {
		return NFKiosCountryselectionpageNextBtn;
	}

	public QAFWebElement getNFKiosCountryselectionpageSelectcountryLbl() {
		return NFKiosCountryselectionpageSelectcountryLbl;
	}

	public QAFWebElement getNFKiosCountryselectionpageOnetouchImg() {
		return NFKiosCountryselectionpageOnetouchImg;
	}

	public QAFWebElement getNFKiosCountryselectionpageWhereliveLbl() {
		return NFKiosCountryselectionpageWhereliveLbl;
	}

	public QAFWebElement getNFKiosCountryselectionpageStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.countryselectionPage.staticText.lbl", text);
	}

	// Method to click on single country and click on next

	public void selectNotificationPopupInCountrySelection(String countryName) {
		if (signup.getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
			Reporter.logWithScreenShot("Notification pop up displayed", MessageTypes.Pass);
			LFSUtilsIOS.click(signup.getNFKiosSignupPageNotificationAllowPopup());
		} else {
			Reporter.logWithScreenShot("Notification pop up not displayed", MessageTypes.Pass);
		}
	}

	public void selectCountry(String countryName) {
		if (getNFKiosCountryselectionpageSelectcountryLbl().isPresent()) {
			scrllToCountry(countryName);
			LFSUtilsIOS.click(getNFKiosCountryselectionpageStaticText(countryName));
			Object o = LFSUtilsIOS.getLocationAndSize(getNFKiosCountryselectionpageNextBtn());
			Reporter.logWithScreenShot(countryName + " is selected", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(countryName + " is Not selected", MessageTypes.Fail);
		}
	}

	public void selectCountryScreenNextButton() {
		LFSUtilsIOS.clickIfEnabled(getNFKiosCountryselectionpageNextBtn());
	}

	public void selectAgryCheckbox() {
		LFSUtilsIOS.scrollDown();
		getNFKiosCountryselectionPageIunderstandChkbx().isPresent();
		LFSUtilsIOS.click(getNFKiosCountryselectionPageIunderstandChkbx());
	}

	public void ClickAgreeConsent(String countryName) {
		if (getNFKiosCountryselectionPageIagreebtn().isPresent()) {
			LFSUtilsIOS.click(getNFKiosCountryselectionPageIagreebtn());
			Reporter.logWithScreenShot("Consent page displayed for country : " + countryName, MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Consent page Not displayed for country: " + countryName, MessageTypes.Fail);
		}
	}
	

	// method to scroll for specific country
	public void scrllToCountry(String countryName) {
		int count = 0;
		while (!LFSUtilsIOS.tryMethod(getNFKiosCountryselectionpageStaticText(countryName))) {
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
			if (count == 10)
				break;
			count++;
		}

	}

	public void startSettingActivity() {
		IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
		DeviceSettingsPageIOS deviceSettings = new DeviceSettingsPageIOS();
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Settings");
		try {
			iosDriver.executeScript("mobile:application:open", params);
			Reporter.logWithScreenShot("Device Settings launched1", MessageTypes.Pass);
			iosDriver.executeScript("mobile:application:close", params);
			Reporter.logWithScreenShot("Device Settings closed1", MessageTypes.Pass);
		} catch (Exception e) {
			// TODO: handle exception
		}

		iosDriver.executeScript("mobile:application:open", params);
		Reporter.logWithScreenShot("Device Settings launched", MessageTypes.Pass);
		deviceSettings.setDateAndTime();

	}

	public void closeSettingActivity() {
		IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Settings");
		try {
			iosDriver.executeScript("mobile:application:close", params);
		} catch (Exception e) {
		}

		Reporter.logWithScreenShot("Device Settings launched", MessageTypes.Pass);

	}
	public void handlePopupNotallow() {
			LFSUtilsIOS.waitExplicit(getNFKiosCountryselectionpageStaticText("Don�t Allow"), 5000);
				if (getNFKiosCountryselectionpageStaticText("Don�t Allow").isPresent()) {
					Reporter.logWithScreenShot("Bluetooth Notification pop up", MessageTypes.Pass);
					LFSUtilsIOS.clickWithText("Don�t Allow");
				} else {
					Reporter.logWithScreenShot("No notification pop up", MessageTypes.Fail);
				} 
			getNFKiosCountryselectionpageSelectcountryLbl().waitForPresent(5000);
		} 
	
	
	// Popup method No used 	
   public void countryDefaultatTop() {
		if (signup.getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
			Reporter.logWithScreenShot("Notification pop up displayed", MessageTypes.Pass);
			LFSUtilsIOS.click(signup.getNFKiosSignupPageNotificationAllowPopup());
		} else {
			Reporter.logWithScreenShot("Notification pop up not displayed", MessageTypes.Pass);
		}
	   getNFKiosCountryselectionpageSelectcountryLbl().isPresent();
	   getNFKiosCountryselectionpageStaticText(LFSUtilsIOS.getPropString("country.lable1")).verifyPresent("Where do you live?");
	   getNFKiosCountryselectionpageStaticText(LFSUtilsIOS.getPropString("default.country")).verifyPresent("United States");
		Reporter.logWithScreenShot("default country displayed", MessageTypes.Pass);
   }
 
    public void countryatTop(String countryName) {
		getNFKiosCountryselectionpageStaticText(countryName).isPresent();
		Reporter.logWithScreenShot(countryName + " is selected and display at top", MessageTypes.Pass);
   }
}

