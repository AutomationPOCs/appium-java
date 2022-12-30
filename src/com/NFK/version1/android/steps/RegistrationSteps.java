package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
//import com.lemonade.version3.iOS.steps.HCP;
//import com.lemonade.version3.iOS.steps.from;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class RegistrationSteps {

	CountrySelectionPageAndroid countrySelectionPAge = new CountrySelectionPageAndroid();

	@QAFTestStep(description = "user opens app")
	public void user_opens_app_android() {
		countrySelectionPAge.openNFKApp();
	}

	@QAFTestStep(description = "user lunch app")
	public void lunchApp() {
		countrySelectionPAge.openNFKApp();
	}

	@QAFTestStep(description = "user verify country selection Page")
	public void user_selects_country() {
		countrySelectionPAge.verifyCountrySelectionPage();

	}

	@QAFTestStep(description = "user clicks on Next button")
	public void user_clicks_on_Next_button() {
		countrySelectionPAge.clickOnNextButton();
		Reporter.logWithScreenShot("User clicks on Next button", MessageTypes.Pass);

	}

	@QAFTestStep(description = "user clicks on Next button of older app")
	public void user_clicks_on_Next_button_older_app() {
		if (countrySelectionPAge.getNFKCountrySelectionpageOlderNextBtn().isEnabled()) {
			countrySelectionPAge.getNFKCountrySelectionpageOlderNextBtn().click();
		} else {
			Reporter.logWithScreenShot("Next button not enabled", MessageTypes.Pass);
		}

		Reporter.logWithScreenShot("User clicks on Next button", MessageTypes.Pass);

	}

	@QAFTestStep(description = "user will see Signin and Create an account button")
	public void verify_Signin_CreateAnAccount_buttons() {
		Reporter.logWithScreenShot("Create Account and Signin buttons are present", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user clicks on Create an account button")
	public void user_clicks_on_Create_an_account_button() {
		Reporter.logWithScreenShot("User clicks on Create an account button", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user fills registration form")
	public void user_fills_registration_info() {
		Reporter.logWithScreenShot("User fills registration form", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user should get register successfully")
	public void user_register_successfully() {
	}

	@QAFTestStep(description = "user closes the app")
	public void userCloseTheAndroidApp() {
		LFSUtilsAndroid.closeApp();
	}

	@QAFTestStep(description = "user selects country {0} from country list")
	public void selectCountry(String country) {
		countrySelectionPAge.selectCountryFromList(country);
	}

	@QAFTestStep(description = "user launch {0} app")
	public void launchAnotherApp(Object appName) {
		countrySelectionPAge.launchAnotherApp(appName);
	}

	@QAFTestStep(description = "user select country {0} from country list for older version")
	public void selectOldAppCountry(String country) {
		countrySelectionPAge.selectOlderCountryFromList(country);
	}

	@QAFTestStep(description = "user resets app")
	public void resetApp() {
		LFSUtilsAndroid.resetApp();
	}

	@QAFTestStep(description = "user start setting activity for date change")
	public void startSettingActivity() {
		countrySelectionPAge.startSettingActivity();
	}

	@QAFTestStep(description = "user on country selection Page")
	public void user_On_selects_country_Screen() {
		countrySelectionPAge.verifyOnCountrySelectionScreen();

	}
	@QAFTestStep(description = "user selects a country {0} from country list")
	public void userSelectaCountryFromList(String countryName) {
		countrySelectionPAge.selectsACountry(countryName);
	}
	@QAFTestStep(description = "user verifies by default country region")
	public void userseebydefaultCountryatTop() {
		countrySelectionPAge.countryDefaultatTop();
	}
	@QAFTestStep(description = "user display selected {0} country at top with green mark")
	public void verifyselectedcountry(String countryName) {
		countrySelectionPAge.countryatTop(countryName);
	}
	@QAFTestStep(description = "user verifies country selection screen")
	public void userVerifyCountrySelection() {
		countrySelectionPAge.countrySelectionPage();
	}

}
