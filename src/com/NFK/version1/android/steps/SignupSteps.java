package com.NFK.version1.android.steps;

import java.time.Duration;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
import com.NFK.version1.android.pages.SignupPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;

public class SignupSteps {

	SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
	CountrySelectionPageAndroid countryselectionpage = new CountrySelectionPageAndroid();
	RegistrationSteps registration = new RegistrationSteps();
	LFSUtilsAndroid baseReference = new LFSUtilsAndroid();
	CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();

	@QAFTestStep(description = "user clicks on signup button")
	public void clickSignUp() {
		signupPageAndroid.clickSignUpButton();
	}

	@QAFTestStep(description = "user requests the cgmreading")
	public void userrequestCGMreadings() {
		signupPageAndroid.fillCGMReadings();
	}

	@QAFTestStep(description = "user requests the cgmreading for reports")
	public void userrequestCGMreadingsReports() {
		signupPageAndroid.fillCGMReadingsReports();
	}

	@QAFTestStep(description = "user requests the low cgmreading")
	public void userRequestsTheLowCgmreading() {
		signupPageAndroid.fillLowCGMReadings();
	}

	@QAFTestStep(description = "user requests the cgmreading for AGP report")
	public void userRequestsTheCgmreadingForAGPReport() {
		signupPageAndroid.fillCGMReadingsAGP();
	}

	@QAFTestStep(description = "user clicks on {0} link on Create Account page to verify")
	public void clickTerms(String option) {
		signupPageAndroid.clickTerms(option);
	}

	@QAFTestStep(description = "user click on skip button")
	public void clickOnSkipBtn() {
		signupPageAndroid.clickSkipBtn();
		Reporter.logWithScreenShot("skip button clicked", MessageTypes.Pass);
	}

	// to complete Safety Onboarding screen
	@QAFTestStep(description = "user completes Safety Onboarding and skips Sensor pair")
	public void userCompletesSafetyOnboardingAndSkipsSensorPair() {
		signupPageAndroid.safetyOnboardingScreen();
		signupPageAndroid.setSettingsDND();
		signupPageAndroid.skipTheSensorScreen();
	}

	@QAFTestStep(description = "user completes Safety Onboarding")
	public void userCompletesSafetyOnboarding() {
		signupPageAndroid.safetyOnboardingScreen();
		signupPageAndroid.setSettingsDND();

	}

	/*
	 * @QAFTestStep(description="user opens app without allowing notification")
	 * public void openAppWithoutAllowingNotify() {
	 * signupPageAndroid.openAppWithoutNotification(); }
	 */

	@QAFTestStep(description = "user enters signup details using {0}")
	public void fillDetails(String userDetails) {
		signupPageAndroid.fillSignUpDetails(userDetails);
	}

	@QAFTestStep(description = "user enters signup details without first name using {0}")
	public void fillDeatilsWithoutFirstName(Object userDetail) {
		signupPageAndroid.doSignUpWithoutFirstName(userDetail);
	}

	@QAFTestStep(description = "user enters signup details without last name using {0}")
	public void fillDeatilsWithoutLastName(Object userDetail) {
		signupPageAndroid.doSignUpWithoutLastName(userDetail);
	}

	@QAFTestStep(description = "user enters signup details with birthdate under age using {0}")
	public void fillDetailsWithBirthdateBelowAge(Object userDetail) {
		signupPageAndroid.doSignUpWithDateBelowAge(userDetail);
		Reporter.logWithScreenShot("cannot create account", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enters signup details without birthdate using {0}")
	public void fillDetailsWithoutBirthdate(Object userDetail) {
		signupPageAndroid.fillDetailsWithoutBirthday(userDetail);
		Reporter.logWithScreenShot("cannot create account", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enters signup details without TOU using {0}")
	public void verifySignupWithoutTOUCheckbox(Object userDetail) {
		signupPageAndroid.fillSignUpDetailsWithoutChckbox(userDetail);

	}

	@QAFTestStep(description = "user enters signup details without emailId using {0}")
	public void signUpFlowWithoutEmail(Object userDetail) {
		signupPageAndroid.fillRandomSignUpDetailsWithoutEmail(userDetail);
	}

	@QAFTestStep(description = "Signup details with invalid user id and email length more than 75 chars using {0}")
	public void signUpFlowWithInvalidEmail(Object userDetail) {
		signupPageAndroid.fillDetailsWithInvalidEmails(userDetail);
	}

	@QAFTestStep(description = "Signup details with email and confirm email validation using {0}")
	public void emailConfirmEmailValidation(String option) {
		signupPageAndroid.emailValidations(option);
	}

	@QAFTestStep(description = "Signup details without password using {0}")
	public void signupDetailsWithoutPassword(String option) {
		signupPageAndroid.noPasswordToFill(option);
	}

	@QAFTestStep(description = "Signup details with invalid password and less than 16 chars using {0}")
	public void signupDetailsWithInvalidPasword(String option) {
		signupPageAndroid.invalidPasswordEntry(option);
	}

	@QAFTestStep(description = "Signup details with already registered email id using {0}")
	public void signupDetailsWithSamemailId(String option) {
		signupPageAndroid.repeatedMailIdSignupFlow(option);
	}

	@QAFTestStep(description = "user enters signup details with invalid clinic code using {0}")
	public void signupDetailsWithInvalidClinicCode(String option) {
		signupPageAndroid.signUpDetailsWithInvalidClinicCode(option);
	}

	@QAFTestStep(description = "user selects opt-in as {0} in sign up page")
	public void selectOptInSignup(String option) {
		signupPageAndroid.selectionOfOptin(option);
	}

	@QAFTestStep(description = "user clicks login link")
	public void clickLoginLink() {
		countryselectionpage.clickLogin();
	}

	@QAFTestStep(description = "user clicks back button")
	public void clickDeviceBackButton() {
		LFSUtilsAndroid.clickBackButton();
	}

	@QAFTestStep(description = "Sign up negetive positive screenshot using {0}")
	public void signupScreenShot(Object userDetails) {
		signupPageAndroid.signupsecondPageScreen(userDetails);
	}

	@QAFTestStep(description = "user enters hcp details for validations using {0}")
	public void hcpUserTOUUnchecked(Object userDetails) {
		signupPageAndroid.fillHCPDetails(userDetails);
	}

	@QAFTestStep(description = "user verify blank email field using {0}")
	public void hcpBlankMail(Object userDetails) {
		signupPageAndroid.verifyBlankMail(userDetails);
	}

	@QAFTestStep(description = "HCP user set reset password using {0}")
	public void fillResetPasswordDetails(Object userDetails) {
		signupPageAndroid.addresetPasswordDetailHCP(userDetails);
	}

	@QAFTestStep(description = "user verify invalid and other country clinic code using {0}")
	public void verifyInvalidClinicCode(String option) {
		signupPageAndroid.verifyInvalidClinicCode(option);
	}

	@QAFTestStep(description = "user select UOM as {0}")
	public void selectUOMASMGDL(String option) {
		signupPageAndroid.selectUOM(option);
	}

	@QAFTestStep(description = "user verify invalid First and Last Name")
	public void verifyInvalidCharactersForFirstsNameandLastName() {
		signupPageAndroid.veriyFirstAndLastName();
	}

	@QAFTestStep(description = "user verify exact 18 date of birth is allowed")
	public void exactDateOfBirthAllowed() {
		signupPageAndroid.setYear();
	}

	@QAFTestStep(description = "user select authentication type as {0} on sign up")
	public void selectAuthanticationTypeAndroid(String option) {
		signupPageAndroid.clickOnAuthenticationTypeSignup(option);
	}

	@QAFTestStep(description = "user click on create account button")
	public void clickOnCreateAccountButtonAndroid() {
		// signupPageAndroid.enterFirstLastName();
		// signupPageAndroid.selectGenderAndDiabetesType("MALE", "TYPE 2");;
		signupPageAndroid.clicksOnCreateAccountButton();
	}

	@QAFTestStep(description = "user clicks on continue button")
	public void clickOnContinueAccountButtonAndroid() {
		signupPageAndroid.clicksOnCreateAccountButton();
	}

	@QAFTestStep(description = "user verifies touch id option present")
	public void verifyTouchIDOptionAndroid() {
		signupPageAndroid.verifiesTouchIDOption();
	}

	@QAFTestStep(description = "user verify optin on sign up screen")
	public void verifyOptinScreenAndroid() {
		signupPageAndroid.verificationOfOptin();
	}

	@QAFTestStep(description = "user verify signup first screen")
	public void userVerifySignUpFirstPage() {
		signupPageAndroid.veriySignUpFirstPage();
	}

	@QAFTestStep(description = "user select access type as {0}")
	public void selectAccessType(String option) {
		signupPageAndroid.clickOnAuthenticationTypeSignup(option);
	}

	@QAFTestStep(description = "user install app without sensor")
	public void userInstallWithoutSensorsIos() {
		signupPageAndroid.installWithoutSensor();
	}

	/// Varsha
	@QAFTestStep(description = "user verify Touch ID option is not present")
	public void userVerifyTouchidNotPresent() {
		signupPageAndroid.touchIDNotPresent();
	}

	/// Varsha
	@QAFTestStep(description = "user verify keep me login option is not present")
	public void userVerifyKeepMeLoginNotPresent() {
		signupPageAndroid.keepMeLoginNotPresent();
	}

	@QAFTestStep(description = "Turn off internet")
	public void turnOffInternet() {
		LFSUtilsAndroid.turnWifiOff();
		Reporter.logWithScreenShot("wi-fi off", MessageTypes.Pass);
	}

	@QAFTestStep(description = "Turn on internet")
	public void turnOnInternet() {
		LFSUtilsAndroid.turnWifiOn();
		Reporter.logWithScreenShot("wi-fi on", MessageTypes.Pass);
	}

	@QAFTestStep(description = "put app in the background")
	public void putAppBackground() {
		LFSUtilsAndroid.appBackground();
		Reporter.logWithScreenShot("App is in background", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify customer service link on opt in screen")
	public void userVerifyCustomerServiceLink() {
		signupPageAndroid.verifyCustomerServiceLink();
	}

	@QAFTestStep(description = "user selects gender as {0} and diabetes type as {1}")
	public void userSelectsGenderAndDiabetesTypeAndroid(String gender, String diabetesType) {
		signupPageAndroid.selectGenderAndDiabetesType(gender, diabetesType);
	}

	@QAFTestStep(description = "user verify gender and diabetes type selection page")
	public void userVerifyGenderAndDiabetesSelectionPageAndroid() {
		signupPageAndroid.verifyGenderAndDiabetesSelectionPage();
	}

	@QAFTestStep(description = "user clicks on continue button on sign up second screen")
	public void userClicksOnContinueBtnAndroid() {
		signupPageAndroid.clickOnContinueBtn();
	}

	@QAFTestStep(description = "user verify gestational type when male is selected")
	public void userVerifyGestationalTypeForMale() {
		signupPageAndroid.verifyGestationalTypeForMale();
	}

	@QAFTestStep(description = "user verify Privacy policy link on update notice screen")
	public void userVerifyPrivacyPolicyLink() {
		signupPageAndroid.verifyPrivacyPolicyOnUpdate();
	}

	@QAFTestStep(description = "user verify Update Notice Check box unchecked")
	public void userVerifyUpdateNoticeChkBox() {
		signupPageAndroid.verifyUpdateNoticeCheckBox();
	}

	@QAFTestStep(description = "user click Update notice check box")
	public void userClickUpdateNoticeCheckBox() {
		signupPageAndroid.clickUpdateNoticeCheckBox();
	}

	@QAFTestStep(description = "user click Update notice continue button")
	public void clickUpdateNoticeContinueBtn() {
		signupPageAndroid.clickUpdateNoticeContinueBtn();
	}

	@QAFTestStep(description = "user set the touch id option")
	public void set_the_touch_id() {
		signupPageAndroid.setTouchID();
	}

	@QAFTestStep(description = "user add office on signup page using {0}")
	public void addOfficeSignupPageAndroid(Object userDetails) {
		signupPageAndroid.addOffice(userDetails);
	}

	@QAFTestStep(description = "user verify clinic term page and clinicInfo")
	public void userVerifyClinicTermPageAndInfo() {
		signupPageAndroid.verifyClinicTermsClinicInfo();
	}

	@QAFTestStep(description = "user verify blank field function on clinic term page using {0}")
	public void blankFieldAddClinicSendKey(Object userDetails) {
		signupPageAndroid.clinicInfo();
		signupPageAndroid.addOffice(userDetails);
		Reporter.logWithScreenShot("Clinic after clicking send", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add office code using {0}")
	public void addOfficeSignupPage(Object userDetails) {
		signupPageAndroid.addOfficeCode(userDetails);
	}

	@QAFTestStep(description = "user clicks on terms of use link on Create Account page to verify")
	public void clickTermsOfUse() {
		signupPageAndroid.clickTerm();
	}

	@QAFTestStep(description = "user clicks on Privacy Policy link on Create Account page to verify")
	public void clickPrivacyPolicy() {
		signupPageAndroid.clickprivacy();
	}

	@QAFTestStep(description = "user verifies no internet popup")
	public void noInternEtPopup() {
		signupPageAndroid.verifyNoInternetPopup();
	}

	@QAFTestStep(description = "user verify that mobile app had incorporated a App Overview Overlay")
	public void verifyAppOverview() {
		signupPageAndroid.verifyAppOverview();
	}

	@QAFTestStep(description = "user verify the App Overview Overlay with all information")
	public void verifyAppOverviewOverlay() {
		signupPageAndroid.verifyAppOverviewOverlay();
	}

	@QAFTestStep(description = "user verify to and fro navigation on App Overview Overlay")
	public void verifyToAndFroOverview() {
		signupPageAndroid.verifyToAndFroOverview();
	}

	@QAFTestStep(description = "user tries to set maximum age more than 125")
	public void enterMaxAgeLimit() {
		signupPageAndroid.enterMaxAgeForDOB();
	}

	@QAFTestStep(description = "user selects gender as {0}")
	public void selectGender(String gender) {
		signupPageAndroid.selectGender(gender);
	}

	@QAFTestStep(description = "user verify the Types of Diabetes and select the type as {0}")
	public void verifyDiabetes(String diabetesType) {

		signupPageAndroid.verifyDiabetesType();
		signupPageAndroid.selectDiabetesType(diabetesType);
	}

	@QAFTestStep(description = "user removes the app from background")
	public void removeAppFromBackground1() {
		// Remove the app
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());

		// appiumDriver.removeApp("com.lifescan.norfolk.adhoctest");

		// Run App in background
		// appiumDriver.runAppInBackground(Duration.ofSeconds(10));
		countryselectionpage.runAppInBackground(5);

	}

	@QAFTestStep(description = "user opens the application")
	public void openapp() {
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		appiumDriver.launchApp();

	}

	@QAFTestStep(description = "Guardian enters signup details using {0}")
	public void guardianEntersSignupDetailsUsing(String details) {
		signupPageAndroid.fillDependentDetails(details);

	}

	@QAFTestStep(description = "Guardian selects dependent gender as {0} and diabetes type as {1}")
	public void guardianSelectsDependentGenderAsAndDiabetesTypeAs(String dependentgender,
			String dependentdiabetesType) {
		signupPageAndroid.selectGender(dependentgender);
		signupPageAndroid.selectDiabetesType(dependentdiabetesType);
	}

	@QAFTestStep(description = "Guardian enters dependent details and {0}")
	public void guardianEntersDependentDetailsAnd(String userDetails) {
		signupPageAndroid.enterDobFirstAndLastName(userDetails);

	}

	@QAFTestStep(description = "user redirected UOM screen and select {0} UOM")
	public void UOMscreen(String option) {
		signupPageAndroid.verifyUOMscreen();
		signupPageAndroid.selectUOM(option);
	}

	@QAFTestStep(description = "Guardian enters dependent detail for two to five year old")
	public void Selectchilddob() {
		signupPageAndroid.setchilddob();
//	signupPage.enterFirstAndLastName();
	}

	@QAFTestStep(description = "Guardian enters dependent detail for six to seventeen year old")
	public void Selectteendob() {
		signupPageAndroid.setteenagedob();
		// signupPage.enterFirstAndLastName();
	}

//	@QAFTestStep(description="enter the Low Data")
//	public void enterTheLowData(){
//		signupPageAndroid.enterLowDataAPI();
//	}

	@QAFTestStep(description = "user verifies guardian signup page")
	public void userverifiesguardiansignup() {
		signupPageAndroid.verifyGuardianSignupPage();

	}

	@QAFTestStep(description = "user clicks back and navigate to Decision screen")
	public void userClickOnLoginLink() {
		signupPageAndroid.clickOnLoginLink();

	}

	@QAFTestStep(description = "user validates signup myself page using data")
	public void validateSignupMyselfPage() {
		signupPageAndroid.verifySignupMyselfPage();
	}

	@QAFTestStep(description = "user validates signup myself second page and click on back button")
	public void validateSignupMyselfSecondPage() {
		signupPageAndroid.verifySignupMyselfSecondPage();
	}

	@QAFTestStep(description = "user click on back button")
	public void clickonbackbutton() {
		signupPageAndroid.clickonBackbutton();
	}

	@QAFTestStep(description = "user validates signup dependent page")
	public void validateSignupDependentPage() {
		signupPageAndroid.verifySignupDependentPage();
	}

	@QAFTestStep(description = "user validates signup dependent second page")
	public void validateSignupDependentSecondPage() {
		signupPageAndroid.verifySignupDependentSecondPage();
	}

	@QAFTestStep(description = "user enters signup details of existing user using {0}")
	public void userEntersSignupDetailsOfExistingUserUsing(String userDetails) {
		signupPageAndroid.fillexisitingUser(userDetails);
	}

	@QAFTestStep(description = "user verifies email exist popup and click on back button")
	public void userVerifiesEmailExistPopupAndClickOnBackButton() {
		signupPageAndroid.verifyEmailExitPopup();
	}

	@QAFTestStep(description = "user enters signup details of existing guardian using {0}")
	public void userEntersSignupDetailsOfExistingGuardianUsing(String userDetails) {
		signupPageAndroid.fillexisitingGuardianUser(userDetails);
	}

	@QAFTestStep(description = "user completes Safety Onboarding and skips emancipation")
	public void userCompletesSafetyOnboardingAndSkipsEmancipation() {
		signupPageAndroid.safetyOnboardingScreen();
		signupPageAndroid.setSettingsDND();
		signupPageAndroid.skipEmancipationScreen();

	}

	@QAFTestStep(description = "user verifies emancipation screen")
	public void userVerifiesEmancipationScreen() {
		signupPageAndroid.verifyEmancipationScreen();
	}

	@QAFTestStep(description = "user verifies emancipation screen with data {0}")
	public void userVerifiesEmancipationEmailFieldWithInvalidData(String userDetails) {
		signupPageAndroid.validateEmancipationField(userDetails);
	}

	@QAFTestStep(description = "user verifies emancipation screen with exising user {0}")
	public void userVerifiesEmancipationScreenWithExisingUser(String userDetails) {
		signupPageAndroid.VerifyExistEmacipationEmail(userDetails);
	}

	@QAFTestStep(description = "bluetooth is turned off")
	public void bluetoothTurnedOFF() {
		signupPageAndroid.bluetoothoff();
	}

	@QAFTestStep(description = "user start sensor pairing")
	public void StartSensorPairing() {
		signupPageAndroid.verifyApplySensor();
	}

	@QAFTestStep(description = "user allow location permission")
	public void AllowLocationPermission() {
		signupPageAndroid.AllowLocationPermission();
	}

	@QAFTestStep(description = "user verify that bluetooth popup displayed")
	public void VerifyAllowBluetooth() {
		signupPageAndroid.VerifyAllowBluetooth();
	}

	@QAFTestStep(description = "user taps on cancel button and verify optin checkbox deselected")
	public void tapcancelandVerifyoptin() {
		signupPageAndroid.tapCancelVerifyOptinCheckbox();
	}

	@QAFTestStep(description = "user verify signup first screen with optin checkbox selected")
	public void verifySignupfirstscreenoptin() {
		signupPageAndroid.VerifySignupfirstscreenOptinCheckbox();
	}

	@QAFTestStep(description = "user again select optin checkbox and click on I agree button")
	public void checkOptin() {
		signupPageAndroid.checkOptincheckbox();
	}

	@QAFTestStep(description = "user deselect optin checkbox")
	public void Deselectoptincheck() {
		signupPageAndroid.DeselectOptincheckbox();
	}

	@QAFTestStep(description = "user select optin checkbox")
	public void selectoptin() {
		signupPageAndroid.userselectoptin();
	}

	@QAFTestStep(description = "user clicks on the DOB field and verify the date")
	public void userClicksOnTheDOBFieldAndVerifyTheDate() {
		signupPageAndroid.userVerifyTheDate();
	}

	@QAFTestStep(description = "user clicks on the green hyperlink and verifies Opt-in screen")
	public void userClicksOnTheGreenHyperlinkAndVerifiesOptInScreen() {
		signupPageAndroid.userVerifiesSecondScreenOptIn();
	}

	@QAFTestStep(description = "user clicks on the back button and redirected to the signup screen")
	public void userClicksOnTheBackButtonAndRedirectedToTheSignupScreen() {
		signupPageAndroid.userRedirectedToTheSignupScreen();
	}

	@QAFTestStep(description = "user clicks on signup button and verifies safety onboarding screen-1")
	public void userClicksOnSignupButtonAndVerifiesSafetyOnboardingScreen() {
		signupPageAndroid.verifySefetyOnboardingScreen1();
	}

	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-2")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen2() {
		signupPageAndroid.verifySefetyOnboardingScreen2();
	}

	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-3")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen3() {
		signupPageAndroid.verifySefetyOnboardingScreen3();
	}

	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-4")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen4() {
		signupPageAndroid.verifySefetyOnboardingScreen4();
	}

	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-5")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen5() {
		signupPageAndroid.verifySefetyOnboardingScreen5();
	}

	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-6")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen6() {
		signupPageAndroid.verifySefetyOnboardingScreen6();
	}

	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-7")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen7() {
		signupPageAndroid.verifySefetyOnboardingScreen7();
	}

	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-8")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen8() {
		signupPageAndroid.verifySefetyOnboardingScreen8();
	}

	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-9")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen9() {
		signupPageAndroid.verifySefetyOnboardingScreen9();
	}

	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-10")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen10() {
		signupPageAndroid.verifySefetyOnboardingScreen10();
	}

	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-11")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen11() {
		signupPageAndroid.verifySefetyOnboardingScreen11();
	}

	@QAFTestStep(description = "user clicks on setting button and allow DND permission")
	public void userClicksOnSettingButtonAndAllowDNDPermission() {
		signupPageAndroid.allowDNDPermission();
	}

	@QAFTestStep(description = "user clicks on back button and app should display pair sensor screen")
	public void userClicksOnBackButtonAndAppShouldDisplayPairSensorScreen() {
		signupPageAndroid.verifyPairSensorScreen();
	}

	@QAFTestStep(description = "user clicks skip button and redirected to home screen")
	public void userClicksSkipButtonAndRedirectedToHomeScreen() {
		signupPageAndroid.verifyHomeScreen();
	}

	@QAFTestStep(description = "user verify on the home screen how to apply the home screen")
	public void userVerifyOnTheHomeScreenHowToApplyTheHomeScreen() {
		signupPageAndroid.userVerifyApplySensorHomeScreen();
	}

	@QAFTestStep(description = "user verify Instructions on How to apply the sensor screen")
	public void userVerifyInstructionsOnHowToApplyTheSensorScreen() {
		signupPageAndroid.userHowToApplyTheSensorScreen();
	}

	@QAFTestStep(description = "user verify right and left Abdomen")
	public void userVerifyRightAndLeftAbdomen() {
		signupPageAndroid.userVerifyRightandLeftAbdomen();
	}

	@QAFTestStep(description = "user verify right and left upper arm")
	public void userVerifyRightAndLeftUpperArm() {
		signupPageAndroid.userVerifyRightAndLeftUpperArm();
	}

	@QAFTestStep(description = "user verify the Start Pairing Sensor screen using right arm")
	public void userVerifyTheStartPairingSensorScreenUsingRightArm() {
		signupPageAndroid.userVerifyTheStartPairingSensorScreenUsingRightArm();
	}

	@QAFTestStep(description = "user verify the Start Pairing Sensor screen")
	public void userVerifTheStartPairingSensorScreen() {
		signupPageAndroid.userVerifyTheStartPairingSensorScreen();
	}

	@QAFTestStep(description = "user verify Instructions on the See Helpful Tips screen")
	public void userVerifyInstructionsOnTheSeeHelpfulTipsScreen() {
		signupPageAndroid.userSeeHelpfulTipsScreen();
	}

	@QAFTestStep(description = "user clicks on the skip button and verify home screen")
	public void userClicksOnTheSkipButtonAndVerifyHomeScreen() {
		signupPageAndroid.SkipButtonAndVerifyHomeScreen();
	}

	@QAFTestStep(description = "user verify the apply sensor screen")
	public void userVerifyTheStartPairingSensorScreen() {
		signupPageAndroid.userApplySensorscreen();
	}

	@QAFTestStep(description = "user back to apply sensor screen")
	public void userBackToApplySensorScreen() {
		signupPageAndroid.backToApplySensorScreen();
	}

	@QAFTestStep(description = "user verify sensor application screen in help menu")
	public void userVerifySensorApplicationScreenInHelpMenu() {
		signupPageAndroid.verifySensorApplicationScreenInHelpMenu();
	}

	@QAFTestStep(description = "user taps on pair sensor button")
	public void userTapsOnPairSensorButton() {
		signupPageAndroid.verifyTapsOnPairSensorButton();
	}

	@QAFTestStep(description = "user taps on skip button")
	public void userTapsOnSkipButton() {
		signupPageAndroid.skipEmancipationScreen();
	}

	@QAFTestStep(description = "user verify informative text")
	public void userVerifyInformativeText() {
		signupPageAndroid.verifyInformativeText();
	}

	@QAFTestStep(description = "user clicks on pair sensor button and user verify informative text")
	public void userClicksOnPairSensorButtonAndUserVerifyInformativeText() {
		signupPageAndroid.clicksOnPairSensorButtonAndUserVerifyInformativeText();
	}

	@QAFTestStep(description = "user pair sensor the application")
	public void userPairSensorTheApplication() {
		signupPageAndroid.verifypairSensorTheApplication();
	}

	@QAFTestStep(description = "user clicks on the cancel button")
	public void userClicksOnTheCancelButton() {
		signupPageAndroid.verifyUserClicksOnTheCancelButton();

	}
			
	@QAFTestStep(description = "User enters signup details using {0} for adult account")
	public void adultUserEntersSignupDetails(String signupDetails) {
		signupPageAndroid.fillAdultDetailsForSignUp(signupDetails);
	}
		
	@QAFTestStep(description = "Guardian enters signup details using {0} for dependent account")
	public void dependentUserEntersSignupDetails(String details) {
		signupPageAndroid.fillDependentDetailsForSignUp(details);
	}
}
