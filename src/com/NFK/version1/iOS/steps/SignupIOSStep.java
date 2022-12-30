package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.CountryselectionPageIOS;
import com.NFK.version1.iOS.pages.DeviceSettingsPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;

import com.qmetry.qaf.automation.util.Reporter;

public class SignupIOSStep {

	SignupPageIOS signupPage = new SignupPageIOS();
	DeviceSettingsPageIOS deviceSettings = new DeviceSettingsPageIOS();
	CountryselectionPageIOS countrySelectionPage = new CountryselectionPageIOS();

	@QAFTestStep(description = "user opens app")
	public void userOpensApp() {
		signupPage.openNFKiosApp1();
	}

	@QAFTestStep(description = "user lunch app")
	public void lunchAppIos() {
		signupPage.lunchApp();
	}
	@QAFTestStep(description = "user Un-install and Install the app")
	public void userUninstallAndInstallTheApp() {
		LFSUtilsIOS.appBackground();
		signupPage.navigateToSettingSceenFromTrustScreen();
		signupPage.uninstallApp();
		signupPage.openNFKiosApp1();
	}
	@QAFTestStep(description ="user taps on skip button")
	public void userTapsOnSkipButton() {
		signupPage.verifyUserTapsOnSkipButton();
	}

	@QAFTestStep(description = "user opens app without allowing notification")
	public void openAppWithoutAllowingNotify() {
		signupPage.openAppWithoutNotification();
	}

	@QAFTestStep(description = "user verify signup page")
	public void userVerifySignUpPage() {
		signupPage.veriySignUpPage();
	}

	@QAFTestStep(description = "user verifies the Sign-up page")
	public void userVerifySignUpScreen() {
		Reporter.logWithScreenShot("User is on Sign-up Screen", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enters signup details using {0}")
	public void fillSignupDetails(String signupDetails) {
		signupPage.fillRandomSignUpDetails(signupDetails);
	}


	@QAFTestStep(description = "user Complete Safety Onboarding flow till Urgent Low Notification Screen")
	public void userCompletesSafetyOnboardingTillUrgentLowNotificationScreen() {
		signupPage.sensoronboardpages();
	}

	@QAFTestStep(description = "user enters signup details with birthdate under age using {0}")
	public void fillDetailsWithBelowAgeBirthdate(Object signupDetails) {
		signupPage.enterSignupFirstScreenBelowAgeBirthdate(signupDetails);
	}

	@QAFTestStep(description = "user enters signup details without birthdate using {0}")
	public void fillDetailsWithoutBirthdate(Object userDetails) {
		signupPage.enterSignupDetailsWithoutBirthdate(userDetails);
	}

	@QAFTestStep(description = "user enters signup details without TOU using {0}")
	public void signUpFlowWithoutCheckBox(Object userDetails) {
		signupPage.doSignUpWithoutCheckBox(userDetails);
	}

	@QAFTestStep(description = "user enters signup details without emailId using {0}")
	public void signUpFlowWithoutEmail(Object userDetails) {
		signupPage.fillRandomSignUpDetailsWithoutEmail(userDetails);
	}

	@QAFTestStep(description = "Signup details with invalid user id and email length more than 75 chars using {0}")
	public void signUpFlowWithInvalidEmail(Object userDetails) {
		signupPage.fillDetailsWithInvalidEmails(userDetails);

	}

	@QAFTestStep(description = "user gets redirected to {0} Page")
	public void userShouldBeOnPage(String pageName) {
		signupPage.redirectToPage(pageName);
	}

	@QAFTestStep(description = "Guardian enters signup details using {0}")
	public void dependentUserEntersSignupDetailsUsing(String details) {
		signupPage.fillDependentDetails(details);
	}

	@QAFTestStep(description = "Guardian enters dependent details and {0}")
	public void guardianEntersDependentDetailsUsing(Object signupDetails) {
		signupPage.enterDobFirstAndLastName(signupDetails);
	}

	@QAFTestStep(description = "Guardian selects dependent gender as {0} and diabetes type as {1}")
	public void guardianSelectsDependentGenderAsAndDiabetesTypeAs(String dependentgender,
			String dependentdiabetesType) {
		signupPage.selectGenderAndDiabetesType(dependentgender, dependentdiabetesType);
	}

	@QAFTestStep(description = "user clicks on signup button")
	public void userclicksOnSignupBtn() {
		signupPage.clickOnSignUpBtn();
	}

	@QAFTestStep(description = "user requests the cgmreading")
	public void userRequestsTheCgmreading() {
		signupPage.fillCGMReadings();
	}

	@QAFTestStep(description = "user requests the cgmreading for reports")
	public void userRequestsTheCgmreadingReports() {
		signupPage.fillCGMReadingsReports();
	}

	@QAFTestStep(description = "user requests the cgmreading for AGP report")
	public void userRequestsTheCgmreadingAGP() {
		signupPage.fillCGMReadingsReports();
	}

	@QAFTestStep(description = "user requests the low cgmreading")
	public void userRequestsTheLowCgmreading() {
		signupPage.fillLowCGMReadings();
	}

	@QAFTestStep(description = "user closes the app")
	public void userCloseTheApp() {
		LFSUtilsIOS.userCloseTheApp();
	}

	public String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

	@QAFTestStep(description = "user select access type as {0}")
	public void selectAccessType(String option) {
		signupPage.selectAccessType(option);
	}

	@QAFTestStep(description = "user click on skip button")
	public void clickOnSkipBtn() {
		signupPage.clickSkipBtn();
		LFSUtilsIOS.pause(3000);
		Reporter.logWithScreenShot("skip button clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify country selection Page")
	public void verifyCountrySelectionPage() {
		//countrySelectionPage.verifyCountrySelectionPage();
	}

	@QAFTestStep(description = "user selects country {0} from country list")
	public void userSelectCountryFromList(String countryName) {
		countrySelectionPage.selectNotificationPopupInCountrySelection(countryName);
		countrySelectionPage.selectCountry(countryName);
		countrySelectionPage.selectCountryScreenNextButton();
		countrySelectionPage.selectAgryCheckbox();
		countrySelectionPage.ClickAgreeConsent(countryName);
	}

	@QAFTestStep(description = "Signup details with email and confirm email validation using {0}")
	public void emailConfirmEmailValidation(String option) {
		signupPage.emailValidations(option);
	}

	@QAFTestStep(description = "Signup details without password using {0}")
	public void signupDetailsWithoutPassword(String option) {
		signupPage.noPasswordToFill(option);
	}

	@QAFTestStep(description = "Signup details with invalid password and less than 16 chars using {0}")
	public void signupDetailsWithInvalidPasword(String option) {
		signupPage.invalidPasswordEntry(option);
	}

	@QAFTestStep(description = "Signup details with already registered email id using {0}")
	public void signupDetailsWithSamemailId(String option) {
		signupPage.repeatedMailIdSignupFlow(option);
	}

	@QAFTestStep(description = "user resets app")
	public void uninstallDApp() throws InterruptedException {
		signupPage.uninstallApp();

	}

	@QAFTestStep(description = "user resets application")
	public void uninstallDApplication() throws InterruptedException {
		signupPage.uninstallApp();
		signupPage.unPairSensor();

	}

	@QAFTestStep(description = "user selects opt-in as {0} in sign up page")
	public void selectOptInSignup(String option) {
		signupPage.selectionOfOptin(option);
	}

	@QAFTestStep(description = "user verify invalid and other country clinic code using {0}")
	public void verifyInvalidClinicCode(String option) {
		signupPage.verifyInvalidClinicCode(option);
	}


	@QAFTestStep(description = "user verify blank email field using {0}")
	public void hcpUserNoEmailFieldValidation() {
		signupPage.noEmailResetPassword();
	}

	@QAFTestStep(description = "user clicks on {0} link on Create Account page to verify")
	public void clickTerms(String option) {
		signupPage.clickAndVerifyTermAndPrivecy(option);
	}

	@QAFTestStep(description = "user select UOM as {0}")
	public void selectUOMASMGDL(String option) {
//	signupPage.selectUOM(option);
	}

	@QAFTestStep(description = "user verify invalid First and Last Name")
	public void verifyInvalidCharactersForFirstsNameandLastName() {
		signupPage.verifyInvalidCharactersInFirstsNameandLastName();
	}

	@QAFTestStep(description = "user verify exact 18 date of birth is allowed")
	public void exactDateOfBirthAllowed() {
		signupPage.setYear();
	}

	@QAFTestStep(description = "user click on create account button")
	public void clickOnCreateAccountButton() {
		signupPage.clicksOnCreateAccountButton();
	}

	@QAFTestStep(description = "Turn off internet")
	public void turnOffInternet() {
		LFSUtilsIOS util = new LFSUtilsIOS();
		util.turnOffWiFi();
		Reporter.logWithScreenShot("wi-fi off", MessageTypes.Pass);
	}

	@QAFTestStep(description = "Turn on internet")
	public void turnOnInternet() {
		LFSUtilsIOS util = new LFSUtilsIOS();
		util.turnOnWiFi();
		Reporter.logWithScreenShot("wi-fi on", MessageTypes.Pass);

	}

	@QAFTestStep(description = "user verify optin on sign up screen")
	public void verifyOptinScreenios() {
		signupPage.verificationOfOptin();
	}

	@QAFTestStep(description = "user verify signup first screen")
	public void userVerifySignUpFirstPage() {
		signupPage.veriySignUpFirstPage();
	}

	@QAFTestStep(description = "user verify customer service link on opt in screen")
	public void userVerifyCustomerServiceLink() {
		signupPage.verifyCustomerServiceLink();
	}

	@QAFTestStep(description = "user selects gender as {0} and diabetes type as {1}")
	public void userSelectsGenderAndDiabetesType(String gender, String diabetesType) {
		signupPage.enterFirstAndLastName();
		signupPage.selectGenderAndDiabetesType(gender, diabetesType);
	}

	@QAFTestStep(description = "user verify gender and diabetes type selection page")
	public void userVerifyGenderAndDiabetesSelectionPage() {
		signupPage.verifyGenderAndDiabetesSelectionPage();
	}

	@QAFTestStep(description = "user clicks on continue button")
	public void userClicksOnContinueBtn() {
		signupPage.clickOnContinueBtn();
	}

	@QAFTestStep(description = "user verify gestational type when male is selected")
	public void userVerifyGestationalTypeForMale() {
		signupPage.verifyGestationalTypeForMale();
	}

	@QAFTestStep(description = "user add office on signup page using {0}")
	public void addOfficeSignupPageIos(Object userDetails) {
		signupPage.addOffice(userDetails);
	}

	@QAFTestStep(description = "user verify clinic term page and clinicInfo")
	public void userVerifyClinicTermPageAndInfo() {
		signupPage.verifyClinicTermsClinicInfo();
	}

	@QAFTestStep(description = "user verify that mobile app had incorporated a App Overview Overlay")
	public void userVerifyThatMobileAppHadIncorporatedAAppOverviewOverlay() {
		signupPage.verifyAppOverviewWelcome();

	}

	@QAFTestStep(description = "user verify the App Overview Overlay with all information")
	public void userVerifyTheAppOverviewOverlayWithAllInformation() {
		signupPage.verifyAppOverviewOverlayAllInfo();
	}

	@QAFTestStep(description = "user verify to and fro navigation on App Overview Overlay")
	public void userVerifyToAndFroNavigationOnAppOverviewOverlay() {
		signupPage.verifyForwardNavigation();
		signupPage.verifyBackwardNavigation();
	}

	@QAFTestStep(description = "user clicks on App Overview")
	public void userClicksOnAppOverview() {
		signupPage.verifyAppOverviewWelcome();
	}

	@QAFTestStep(description = "user tries to set maximum age more than 125")
	public void setMaxAge() {
		signupPage.setMaxAgeForDOB();
	}

	@QAFTestStep(description = "user completes Safety Onboarding")
	public void userCompletesSafetyOnboarding() {
		signupPage.sensoronboardpages();
	}

//to complete Safety Onboarding screen
	@QAFTestStep(description = "user completes Safety Onboarding and skips Sensor pair")
	public void userCompletesSafetyOnboardingAndSkipsSensorPair() {
		signupPage.safetyOnboardingScreen();
	}

	@QAFTestStep(description = "user redirected UOM screen and select {0} UOM")
	public void UOMscreen(String option) {
		signupPage.verifyUOMscreen();
		signupPage.selectUOM(option);
	}

	@QAFTestStep(description = "Guardian enters dependent detail for two to five year old")
	public void Selectchilddob() {
		signupPage.setchilddob();
//	signupPage.enterFirstAndLastName();
	}

	@QAFTestStep(description = "Guardian enters dependent detail for six to seventeen year old")
	public void Selectteendob() {
		signupPage.setteenagedob();
//signupPage.enterFirstAndLastName();
	}

	@QAFTestStep(description = "enter the Low Data")
	public void enterTheLowData() {
		signupPage.enterLowDataAPI();
	}

	@QAFTestStep(description = "user add CGM data")
	public void userAddCGMData() {
		signupPage.createDatasets();
	}

	@QAFTestStep(description = "user add CGM data for AGP report")
	public void userAddCGMDataAGP() {
		signupPage.createDatasetsAGP();
	}

	@QAFTestStep(description = "put app in the background")
	public void putAppBackground() {
		LFSUtilsIOS.appBackground();
		Reporter.logWithScreenShot("App is in background", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user click on Do not Allow button")
	public void userClickonDontallowbutton() {
		signupPage.clickDontAllowpopupbutton();
	}

	@QAFTestStep(description = "user click on back button")
	public void userClickonBackbutton() {
		signupPage.clickonBackbutton1();
	}

	@QAFTestStep(description = "user navigates back")
	public void usernavigateBack() {
		signupPage.clickonBackbutton();
	}

	@QAFTestStep(description = "user click on Done button")
	public void userClickonDonebutton() {
		signupPage.clickonDoneButton();
	}

	@QAFTestStep(description = "user verifies app get redirected to Allow Critical Alerts screen with setting button")
	public void userVerifiesAppGetRedirectedToAllowCriticalAlertScreenWithSettingButton() {
		signupPage.VerifyCriticalAlertScreen();
		// signupPage.ClickSettingButton();
	}

	@QAFTestStep(description = "user redirected to Urgent Low Notification Screen")
	public void userRedirectedToUrgentLowNotificationScreen() {
		signupPage.verifyUrgentLowNotificationScreen();
	}

	@QAFTestStep(description = "user click on settings Button")
	public void userClickOnSettingButton() {
		signupPage.ClickSettingButton();
	}

	@QAFTestStep(description = "user click on Notification settings Button")
	public void userClickOnNotificationSettingButton() {
		signupPage.ClickNotificationSettingButton();
	}

	@QAFTestStep(description = "user click on Allow Critical Alerts button and return back to app")
	public void userClickOnAllowCriticalAlertsButtonAndReturnBackToApp() {
		deviceSettings.ClickAllowCriticalAlertsButton();
		signupPage.ClickBackBtn();
		signupPage.launchPage(null);
		signupPage.lunchApp();
		Reporter.logWithScreenShot("Application opened", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verifies app displayed Pair Sensor screen")
	public void userVerifiesAppDisplayedPairSensorScreen() {
		signupPage.verifyPairSensorScreen();
	}

	@QAFTestStep(description = "user verifies guardian signup page")
	public void userverifiesguardiansignup() {
		signupPage.verifyGuardianSignupPage();

	}

	@QAFTestStep(description = "user clicks back and navigate LOGIN DEPENDENT Page")
	public void userClickOnLoginLink() {
		signupPage.clickOnLoginLink();

	}

	@QAFTestStep(description = "user validates signup myself page using data")
	public void userValidatesSignupMyselfPage() {
		signupPage.ValidatesSignupMyselfPage();
	}

	@QAFTestStep(description = "user validates signup dependent page")
	public void userValidatesSignupDepedentPage() {
		signupPage.validatesignupDepedentPage();
	}

	@QAFTestStep(description = "user validates signup myself second page and click on back button")
	public void ValidatesSignupMyselfSecondPage() {
		signupPage.validatessignupmyselfsecondpage();
	}

	@QAFTestStep(description = "user validates signup dependent second page")
	public void ValidatesSignupDepedentSecondPage() {
		signupPage.validatesSignupDepedentSecondPage();
	}

	@QAFTestStep(description = "user clicks on {0} Page")
	public void clickonsignupdepedent(String pagename) {
		signupPage.clickonSignupDepedent(pagename);
	}

	@QAFTestStep(description = "user enters signup details of existing user using {0}")
	public void userEntersSignupDetailsOfExistingUserUsing(String userDetails) {
		signupPage.fillexisitingUser(userDetails);
	}

	@QAFTestStep(description = "user verifies email exist popup and click on back button")
	public void userVerifiesEmailExistPopupAndClickOnBackButton() {
		signupPage.verifyEmailExitPopup();
	}

	@QAFTestStep(description = "user enters signup details of existing guardian using {0}")
	public void userEntersSignupDetailsOfExistingGuardianUsing(String userDetails) {
		signupPage.fillexisitingGuardianUser(userDetails);
	}

	@QAFTestStep(description = "user completes Safety Onboarding and skips emancipation")
	public void userCompletesSafetyOnboardingAndSkipsEmancipation() {
		// signupPage.sensoronboardpages();
		signupPage.SafetyOnboardingScreenSkipEmancipation();
	}

	@QAFTestStep(description = "user verifies emancipation screen")
	public void userVerifiesEmancipationScreen() {
		signupPage.verifyEmancipationscreen();
	}

	@QAFTestStep(description = "user verifies emancipation screen with data {0}")
	public void userVerifiesEmancipationScreenWithData(String userDetails) {
		signupPage.validateEmancipationfield(userDetails);
	}

	@QAFTestStep(description = "user verifies emancipation screen with exising user {0}")
	public void userVerifiesEmancipationScreenWithExisingUser(String userDetails) {
		signupPage.VerifyExistEmacipationEmail(userDetails);
	}

	@QAFTestStep(description = "bluetooth is turned off")
	public void bluetoothIsTurnedOff() throws InterruptedException {
		LFSUtilsIOS util = new LFSUtilsIOS();
		util.turnOffBluetooth();
		Reporter.logWithScreenShot("Bluetooth off", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user completes Safety Onboarding and click pair sensor")
	public void safetyOnboardingPairsensor() {
		signupPage.safetyOnboardingScreen();
	}
	/*
	 * @QAFTestStep(description = "user verify that bluetooth popup displayed")
	 * public void userVerifyBluetoothpopupDisplayed() {
	 * signupPage.Verifybluethoothpopup(); }
	 */

	@QAFTestStep(description = "user verify {0} bluetooth popup displayed")
	public void userVerifyBluetoothpopupDisplayed(String step) {
		signupPage.Verifybluethoothpopup(step);
	}

	@QAFTestStep(description = "user selects dont allow and country {0} from country list")
	public void userSelectdontallowandCountryFromList(String countryName) {
		CountryselectionPageIOS csPage = new CountryselectionPageIOS();
		csPage.handlePopupNotallow();
		csPage.selectCountry(countryName);
	}

	@QAFTestStep(description = "user start sensor pairing")
	public void StartSensorPairing() {
		signupPage.startApplySensor();
	}

	@QAFTestStep(description = "bluetooth is turned on")
	public void bluetoothON() throws InterruptedException {
		LFSUtilsIOS util = new LFSUtilsIOS();
		util.turnOnBluetooth();
	}

	@QAFTestStep(description = "user skips sensor Pairing")
	public void skipSensorPairing() {
		signupPage.skipsSensorPairing();
	}

	@QAFTestStep(description = "user taps on cancel button and verify optin checkbox deselected")
	public void tapcancelandVerifyoptin() {
		signupPage.tapCancelVerifyOptinCheckbox();
	}

	@QAFTestStep(description = "user verify signup first screen with optin checkbox selected")
	public void verifySignupfirstscreenoptin() {
		signupPage.VerifySignupfirstscreenOptinCheckbox();
	}

	@QAFTestStep(description = "user again select optin checkbox and click on I agree button")
	public void checkOptin() {
		signupPage.checkOptincheckbox();
	}

	@QAFTestStep(description = "user deselect optin checkbox")
	public void Deselectoptincheck() {
		signupPage.DeselectOptincheckbox();
	}

	@QAFTestStep(description = "user select optin checkbox")
	public void selectoptin() {
		signupPage.userselectoptin();
	}

	@QAFTestStep(description = "user selects a country {0} from country list")
	public void userSelectaCountryFromList(String countryName) {
	//	countrySelectionPage.selectsACountry(countryName);
		countrySelectionPage.selectNotificationPopupInCountrySelection(countryName);
		countrySelectionPage.selectCountry(countryName);
		countrySelectionPage.selectCountryScreenNextButton();
	}

	@QAFTestStep(description = "user verifies by default country region")
	public void userseebydefaultCountryatTop() {
		countrySelectionPage.countryDefaultatTop();
	}

	@QAFTestStep(description = "user display selected {0} country at top with green mark")
	public void verifyselectedcountry(String countryName) {
		countrySelectionPage.countryatTop(countryName);
	}

	@QAFTestStep(description = "User change timezone to {0}")
	public void changeTimezone(String timez) {
		deviceSettings.updateTimezone(timez);

	}

	@QAFTestStep(description = "user unistall the app and reinstall")
	public void userUninstallAndReinstallApp() {
		LFSUtilsIOS
				.closeApp(
						splitCapabilityString(ConfigurationManager.getBundle()
								.getProperty("appium.additional.capabilities").toString(), "bundleId':'"),
						"identifier");
		signupPage.uninstallApp();
		signupPage.unPairSensor();
		signupPage.openNFKiosApp1();

	}
	
	@QAFTestStep(description = "user clicks on the DOB field and verify the date")
	public void userClicksOnTheDOBFieldAndVerifyTheDate() {
		signupPage.userVerifyTheDate();
	}
	@QAFTestStep(description = "user clicks on the green hyperlink and verifies Opt-in screen")
	public void userClicksOnTheGreenHyperlinkAndVerifiesOptInScreen() {
		signupPage.userVerifiesSecondScreenOptIn();
	}
	@QAFTestStep(description = "user clicks on the back button and redirected to the signup screen")
	public void userClicksOnTheBackButtonAndRedirectedToTheSignupScreen() {
		signupPage.userRedirectedToTheSignupScreen();
	}

	
	@QAFTestStep(description = "user clicks on signup button and verifies safety onboarding screen-1")
	public void userClicksOnSignupButtonAndVerifiesSafetyOnboardingScreen1() {
		signupPage.verifySefetyOnboardingScreen1();
	}
	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-2")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen2() {
		signupPage.verifySefetyOnboardingScreen2();
	}
	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-3")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen3() {
		signupPage.verifySefetyOnboardingScreen3();
	}
	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-4")
	public void  userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen4() {
		signupPage.verifySefetyOnboardingScreen4();
	}
	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-5")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen5() {
		signupPage.verifySefetyOnboardingScreen5();
	}
	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-6")
	public void  userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen6() {
		signupPage.verifySefetyOnboardingScreen6();
	}
	@QAFTestStep(description = "user clicks on I Understand checkbox and verifies safety onboarding screen-7")
	public void userClicksOnIUnderstandCheckboxAndVerifiesSafetyOnboardingScreen7() {
		signupPage.verifySefetyOnboardingScreen7();
	}
	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-8")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen8() {
		signupPage.verifySefetyOnboardingScreen8();
	}
	@QAFTestStep(description = "user click on I Understand checkbox and app should display send you notification popup")
	public void UserClickOnIUnderstandCheckboxAndAppShouldDisplaySendYouNotificationPopup() {
		signupPage.verifiyNotificationPopup();
	}
	@QAFTestStep(description = "user click on Don't allow button and redirected to alert notification popup screen")
	public void userClickOnDontAllowButtonAndRedirectedToAlertNotificationPopupScreen() {
		signupPage.verifiyAlertNotificationPopupScreen();
	}
	@QAFTestStep(description = "user click on OK button and verifies safety onboarding screen-9")
	public void userClickOnOKButtonAndVerifiesSafetyOnboardingScreen9() {
		signupPage.verifySefetyOnboardingScreen9();
	}
	@QAFTestStep(description = "user clicks on next button and verifies safety onboarding screen-10")
	public void userClicksOnNextButtonAndVerifiesSafetyOnboardingScreen10() {
		signupPage.verifySefetyOnboardingScreen10();
	}
    @QAFTestStep(description = "user clicks on allow button and app should display pair sensor screen")
	public void userClicksOnAllowButtonAndAppShouldDisplayPairSensorScreen() {
		signupPage.verifyApplySensorScreen();
	}
	@QAFTestStep(description = "user clicks skip button and redirected to home screen")
	public void userClicksSkipButtonAndRedirectedToHomeScreen() {
		signupPage.verifyHomeScreen();
	}
	@QAFTestStep(description = "user verify on the home screen how to apply the home screen")
	public void userVerifyOnTheHomeScreenHowToApplyTheHomeScreen() {
		signupPage.userVerifyApplySensorHomeScreen();
	}

	@QAFTestStep(description = "user verify Instructions on How to apply the sensor screen")
	public void userVerifyInstructionsOnHowToApplyTheSensorScreen() {
		signupPage.userHowToApplyTheSensorScreen();
	}

	@QAFTestStep(description = "user verify right and left Abdomen")
	public void userVerifyRightAndLeftAbdomen() {
		signupPage.userVerifyLeftAndRightAbdomen();
	}

	@QAFTestStep(description = "user verify right and left upper arm")
	public void userVerifyRightAndLeftUpperArm() {
		signupPage.userVerifyRightAndLeftUpperArm();
	}

	@QAFTestStep(description = "user verify the apply sensor screen")
	public void userVerifyTheStartPairingSensorScreen() {
		signupPage.userApplySensorscreen();
	}

	@QAFTestStep(description = "user back to apply sensor screen")
	public void userBackToApplySensorScreen() {
		signupPage.backToApplySensorScreen();
	}


	@QAFTestStep(description ="user verify informative text")
	public void userVerifyInformativeText() {
		signupPage.verifyInformativeText();
	}
	@QAFTestStep(description ="user clicks on pair sensor button and user verify informative text")
	public void userClicksOnPairSensorButtonAndUserVerifyInformativeText() {
		signupPage.clicksOnPairSensorButtonAndUserVerifyInformativeText();
	}
	@QAFTestStep(description ="user verify sensor application screen in help menu")
	public void userVerifySensorApplicationScreenInHelpMenu() {
		signupPage.verifySensorApplicationScreenInHelpMenu();
	}
	@QAFTestStep(description ="user verify unpair the sensor")
	public void userVerifyUnpairTheSensor() {
		signupPage.verifyUnpairTheSensor();
	}
	@QAFTestStep(description ="user taps on pair sensor button")
	public void userTapsOnPairSensorButton() {
		signupPage.verifyTapsOnPairSensorButton();
	}
	@QAFTestStep(description ="user stop sensor pairing")
	public void userStopSensorPairing() {
		signupPage.verifyStopSensorPairing();
	}
	@QAFTestStep(description ="user pair sensor the application")
	public void userPairSensorTheApplication() {
		signupPage.verifypairSensorTheApplication();
	}
	@QAFTestStep(description ="user clicks on the cancel button")
	public void userClicksOnTheCancelButton() {
		signupPage.verifyUserClicksOnTheCancelButton();
	}
		
	@QAFTestStep(description = "User enters signup details using {0} for adult account")
	public void adultUserEntersSignupDetails(String signupDetails) {
		signupPage.fillAdultDetailsForSignUp(signupDetails);
	}
		
	@QAFTestStep(description = "Guardian enters signup details using {0} for dependent account")
	public void dependentUserEntersSignupDetails(String details) {
		signupPage.fillDependentDetailsForSignUp(details);
	}

}
