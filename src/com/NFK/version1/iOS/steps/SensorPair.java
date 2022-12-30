package com.NFK.version1.iOS.steps;

import java.io.IOException;

import com.NFK.sensorpair.iOSPair;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.HomePageIOS;
import com.NFK.version1.iOS.pages.MoremenuPageIOS;
import com.NFK.version1.iOS.pages.SensorPairPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.lfs.nfk.pages.MoteConfigPage;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SensorPair {

	SensorPairPageIOS sensorpair = new SensorPairPageIOS();
	MoteConfigPage moteConfigPage = new MoteConfigPage();
	iOSPair iosPair = new iOSPair();
	MoremenuPageIOS moreMenuPage = new MoremenuPageIOS();
	HomePageIOS homePage = new HomePageIOS();
	SignupPageIOS signupPageIOS = new SignupPageIOS();

	String pairedSensor;

	@QAFTestStep(description = "user waiting to connect to sensor")
	public void userWaitingToConnectToSensor() {
		sensorpair.connectingToSensor();
	}

	@QAFTestStep(description = "user redirects to Apply sensor screen and clicks on How to apply sensor link")
	public void userselectsensorloaction() {
		sensorpair.verifyapplysensor();
		sensorpair.verifyhowtoapplysensorlink();
		sensorpair.verifyhelpfultipslink();
	}

	@QAFTestStep(description = "user redirects to Apply sensor screen for two to five year old kid and clicks on How to apply sensor link")
	public void userselectsensorlocations() {
		sensorpair.verifyapplysensor2to6yrold();
		sensorpair.verifyhowtoapplysensorlink();
		sensorpair.verifyhelpfultipslink();
	}

	@QAFTestStep(description = "user selects {0} location of body to apply sensor")
	public void userSelectsTheLocationOfSensorToApplyOnBody(String location) {
		sensorpair.selectBodyLocation(location);
	}

	// CGM Automation

	@QAFTestStep(description = "user stuffs the emulator {0} with data {1} on machine {2}")
	public void userStuffsDataToEmulator(String emulator, String data,String ip) throws InterruptedException, IOException {
		String emulatorNo= ConfigurationManager.getBundle().getString(emulator);
		moteConfigPage.dataStuffing(emulatorNo,data,ip);
	}


	@QAFTestStep(description = "user selects {0} location of body to apply sensor and click on next")
	public void userSelectsLocationOfBodyToApplySensorAndClickOnNext(String location) {
		sensorpair.selectBodyLocation(location);
		sensorpair.selectsNextButtonStartPairing();
		sensorpair.clickOnContinueButton();
	}

	@QAFTestStep(description = "user enters the passkey {0} for sensor id {1}")
	public void paireSensorForDevice(String passkey, String id) throws Exception {
		pairedSensor = iosPair.pairSensor(id, passkey);
	}

	@QAFTestStep(description = "user verifies in range glucose readings on home screen")
	public void userVerifyInrangeReading() {
		sensorpair.verifySensorReadingOnHomeScreen();
	}

	@QAFTestStep(description = "user click on unpair sensor button and verify unpair sensor screen")
	public void userClickOnUnpairSensorButtonAndVerifyUnpairSensorScreen() {
		moreMenuPage.clickOnUnpairSensor();
		sensorpair.verifyUnpairSensorScreen();
	}
	@QAFTestStep(description = "user verifies sensor expiration countdown on home screen for 24hrs")
	public void userVerifiesSensorExpirationCountdown24OnHomeScreen() {
		sensorpair.verifySensorExpiration24hrs();
	}
	@QAFTestStep(description = "user verifies sensor expiration countdown on home screen")
	public void userVerifiesSensorExpirationCountdownOnHomeScreen() {
		sensorpair.verifySensorExpiration();
	}
	@QAFTestStep(description = "the user closes sensor expires popup")
	public void the_user_closes_sensor_expires_popup() {
		sensorpair.closeSensorExpirePopup();
	}
	@QAFTestStep(description = "the user closes sensor warmup alert")
	public void the_user_closes_sensor_warmup_alert() {
		sensorpair.verifySensorWarmupAlertAndClose();
	}
	@QAFTestStep(description = "user open notifications")
	public void userOpenNotification() {
		LFSUtilsIOS.openNotification();
	}
	@QAFTestStep(description = "user verifies urgent Low glucose Alarm on home screen")
	public void userVerifyUrgentLowSensorReading() {
		sensorpair.verifyUrgentLowSensorReadingOnHomeScreen();
	}
	
	@QAFTestStep(description = "user verifies Urgent Low glucose Alarm on home screen without acknowledge")
	public void userVerifyUrgentLowSensorReadingWithotAck() {
		sensorpair.verifyUrgentLowSensorReadingOnHomeScreenwithoutAck();
	}
	@QAFTestStep(description = "user verifies Urgent Low glucose Alarm not displayed")
	public void userVerifyUrgentLowAlarmNotDisplayed() {
		sensorpair.verifyUrgentLowSensorReadingNotDisplayed();
	}
	@QAFTestStep(description = "user clicks on Start Tour button")
	public void clickOnStartTour() {
		sensorpair.clickOnStartTour();
	}
	@QAFTestStep(description = "user verifies app should not display app tour button on home screen")
	public void verifyAppShouldNotDispalyAppTour() {
		sensorpair.verifyAppTourButtonNotDisplayed();
	}

	@QAFTestStep(description = "user verifies sensor expiration popup for {0}")
	public void userVerifySensorExpirationPopup(String duration) {
		sensorpair.verifySensorExpiration(duration);
	}
	

	@QAFTestStep(description = "user verifies {0} push notification")
	public void userVerifyAlertPushNotification(String notification) {
		sensorpair.verifyAlertOnPushNotification(notification);
	}
	
	@QAFTestStep(description = "user verifies {0} popup on home screen")
	public void userVerifyAlertOnHomeScreen(String alert) {
		sensorpair.VerifyAlertOnHomeScreen(alert);
	}
	@QAFTestStep(description = "user open browser and enter enter url {0} with a emailID {1}")
	public void userOpenBrowser(String followEmail, String webURL) {
		signupPageIOS.verifyOnBrowserContain(followEmail, webURL);
	}
	@QAFTestStep(description = "user verifies that {0} Range alert is displayed without acknowledge")
	public void userVerifyLowReadingWithoutAknwg(String NotificationType, String firstAlertType) {
		sensorpair.verifySensorReadingOnHomeScreenNotAkwg(NotificationType);
	}
//	@QAFTestStep(description = "user verifies that Low Range alert is displayed without acknowledge")
//	public void userVerifyLowReadingWithoutAknwg() {
//		sensorpair.verifyLowSensorReadingOnHomeScreenNotAkwg();
//	}
	
//	@QAFTestStep(description = "user verifies that No reading alert is displayed without acknowledge")
//	public void userVerifyNoReadingWithoutAknwg() {
//		sensorpair.verifyNoReadingSensorReadingOnLockAndHomeScreenNotAkwg();
//	}
	@QAFTestStep(description = "user verifies after fifteen minutes no Alert triggered")
	public void the_userVerifyHighReadingAlertNotTriggered() {
		sensorpair.verifyHighSensorRealertnotdisplayed();
	}
	@QAFTestStep(description = "user waits for five minutes and verifies Alerts get triggered")
	public void userWaitsHighReadingAlert() {
		sensorpair.waitHighSensorRealert();
	}
	@QAFTestStep(description = "user verifies {0} popup on home screen without ack")
	public void userVerifyAlertOnHomeScreenWithoutAck(String alert) {
		sensorpair.VerifyAlertOnHomeScreenWithoutAck(alert);
	}
	@QAFTestStep(description = "user verifies sensor expires popup not displayed")
	public void userVerifiesSensorExpiresPopupNotDisplayed() {
		sensorpair.verifiesSensorExpirePopupNotPresent();
	}
	@QAFTestStep(description = "user verifies home screen after bluetooth off")
	public void userVerifiesHomeScreenAfterBluetoothoff() {
		sensorpair.verifiesHomeScreenBluetoothoff();
	}
	@QAFTestStep(description = "user verifies after fifteen minutes no Alert triggered")
	public void the_userVerifyLowReadingAlertNotTriggered() {
		sensorpair.verifyLowSensorRealertnotdisplayed();
	}
	@QAFTestStep(description = "user waits for five minutes and verifies Alerts get triggered")
	public void userWaitsLowReadingAlert() {
		sensorpair.waitLowSensorRealert();
	}
	@QAFTestStep(description = "user verifies {0} push notification without open")
	public void userVerifyAlertPushNotificationWithoutOpen(String notification) {
		sensorpair.verifyAlertOnPushNotificationWithoutOpen(notification);
	}
	
	
	@QAFTestStep(description = "bluetooth is turned off at app level")
	public void bluetoothIsTrunedOffAtAppLevel() throws InterruptedException {
		LFSUtilsIOS lfsUtilsiOS= new LFSUtilsIOS();
		lfsUtilsiOS.bluetoothTurnedoffAtAppLevel();
	}
	@QAFTestStep(description = "user verifies BluetoothOff push notification not displayed")
	public void userVerifiesBluetoothoffPushNotificationNotDisplayed() throws InterruptedException {
		sensorpair.bluetoothOffNotificationNotDisplayed();
	}
	@QAFTestStep(description = "user verifies Low glucose Alert not displayed")
	public void userVerifyLowAlertNotDisplayed() {
		sensorpair.verifyLowSensorReadingNotDisplayed();
	}
	@QAFTestStep(description = "user unpairs the sensor and navigate to home screen")
	public void userClickOnUnpairSensorButton() {
		moreMenuPage.unpairSensor();
		homePage.clickOnHomeTab();
	}
	@QAFTestStep(description = "user verifies {0} is not triggered after sensor unpaired")
	public void verifyHighGlucoseAlertNotDisplayedAfterSensorUnpaired(String alertType) {
		LFSUtilsIOS.openNotification();
		sensorpair.verifyAlertNotDisplayed(alertType);
	}
	@QAFTestStep(description = "user verifies High Glucose alert on home screen")
	public void userVerifyHighReadingWithoutAknwg() {
		sensorpair.verifyHighGlucoseAlertOnHomeScreen();
	}
	@QAFTestStep(description = "user waits for {0} notification for {1} mins")
	public void the_user_opens_notification(String alertType,long mins ) {
		long miliSeconds = mins * 60000;
		LFSUtilsIOS.openNotification();
		sensorpair.waitForALerts(alertType, miliSeconds);
	}
	@QAFTestStep(description="user verifies No Readings Alerts is not displayed")
	public void userVerifiesNoReadingsAlertsNotDisplayed(){
		sensorpair.NoReadingsAlertsNotDisplayed();
	}
	@QAFTestStep(description = "user verifies High glucose Alert not displayed")
	public void userVerifyhighAlertNotDisplayed() {
		sensorpair.verifyhighSensorReadingNotDisplayed();
	}
	@QAFTestStep(description = "user verifies that High Range alert is displayed without acknowledge")
	public void userVerifyHighReadingWithoutAknwgalert() {
		sensorpair.verifyhighSensorReadingOnHomeScreenNotAkwg();
	}
	@QAFTestStep(description="user wait and closes app")
	public void userWaitsAndClosesApp(){
		LFSUtilsIOS.appBackground();
		LFSUtilsIOS.pause(180000);
		LFSUtilsIOS.userCloseTheApp();
	}
	@QAFTestStep(description="user open current app")
	public void useropenCurrentApp(){
		LFSUtilsIOS.opencurrentscreen();
	}
	@QAFTestStep(description = "user verifies High Glucose Alert not displayed")
	public void userVerifyHighAlertNotDisplayed() {
		sensorpair.verifyHighSensorReadingNotDisplayed();
	}
	@QAFTestStep(description="user verifies change setting popup on Home screen")
	public void userVerifiesChangeSettingPopupOnHomeScreen(){
		sensorpair.verifyNotificationSettingsPopup();
	}
	
	@QAFTestStep(description="user verifies {0} banner on Home screen")
	public void userVerifiesBannerOnHomeScreen(String bannerType){
		sensorpair.verifyBannerOnHomeScreen(bannerType);
	}
	@QAFTestStep(description="user launch settings and enable notifications")
	public void userlaunchEnableNotifications(){
		sensorpair.openAppNotification();
		sensorpair.ToggleNotification();
	}
	@QAFTestStep(description="user verifies {0} banner on Home screen not displayed")
	public void userVerifiesBannerOnHomeScreenNotDisplayed(String bannerType){
		sensorpair.verifyBannerOnHomeScreenNotDisplayed(bannerType);
	}
	
	@QAFTestStep(description="user disable notifications")
	public void userDisableNotifications(){
		LFSUtilsIOS.launchSettings();
		sensorpair.ToggleNotification();
	}
	@QAFTestStep(description="user puts app in background")
	public void userputsAppInBackground(){
		LFSUtilsIOS.appBackground();
	}
	
	@QAFTestStep(description="user click on settings on change setting popup")
	public void userclickOnSettingsOnChangeSettingPopup(){
		sensorpair.clickSettings();
	}
	
	@QAFTestStep(description="user verifies change setting popup on Alert screen after opening app")
	public void userVerifiesChangeSettingPopupOnAlertScreenAfterOpeningApp(){
		sensorpair.verifyNotificationSettingsPopupAlertScreen();
	}


@QAFTestStep(description = "user verifies first use tooltips on homescreen")
	public void userverifiesToolTip() {
		homePage.clickOnMoreMenuIcon();
		homePage.clickOnHomeTab();
		sensorpair.verifyTooltipOnHomeScreen();
	}
	
	@QAFTestStep(description = "user verifies that no tooltip is present on homescreen")
	public void verifyNoTooltipOnHomescreen() {
		homePage.clickOnMoreMenuIcon();
		homePage.clickOnHomeTab();
		sensorpair.verifyNoTooltipOnHomeScreen();

	}
	@QAFTestStep(description = "user verify {0} banner on home screen")
	public void userVerifyNoReadingsAlertBannerOnHomeScreen(String banner) {
		sensorpair.verifyBannersOnHomeScreen(banner);
	}
	@QAFTestStep(description = "user wait for {0} minutes")
	public void userWaits(int time) {
		sensorpair.userWaitForAction(time);
	}
	@QAFTestStep(description = "Scroll down device notification bar")
	public void scrollDownDeviceNotificationBar() {
		LFSUtilsIOS.ScrollDownNotifications();
	}
	@QAFTestStep(description = "user keep app in background")
	public void userKeepAppInBackground() {
		LFSUtilsIOS.appBackground();
	}
	@QAFTestStep(description = "verify Missed Condition push notification is not displayed")
	public void verifyMissedConditionPushNotificationIsNotDisplayed() {
		sensorpair.VerifyMissedConditionNotificationNotDisplayed();
	}
	@QAFTestStep(description = "user clicks on cancel button")
	public void userClicksOnCancelButton() {
		sensorpair.userClicksOnCancelButton();
	} 
	@QAFTestStep(description = "user clicks on tryagain button")
	public void userClicksOnTryagainButton() {
		sensorpair.userClicksOnTryagainButton();
	}
	@QAFTestStep(description = "user verifies after fifteen minutes no Low Alert triggered")
	public void the_userVerifyLowReadingAlertRealertNotTriggered() {
		sensorpair.verifyLowSensorRealertnotdisplayed();
	}
	@QAFTestStep(description ="user verifies Urgent Low Glucose Alarm on setting screen")
	public void userVerifiesUrgentLowGlucoseAlarmOnSettingScreen() {
		sensorpair.verifyUrgentLowOnSettingScreen();
	}
	@QAFTestStep(description ="user verifies {0} popup and acknowledge popup on home screen")
	public void userVerifiesUrgentLowGlucoseAndAcknowledgePopupOnHomeScreen() {
		sensorpair.verifyUrgentLowAndAcknowledgePopupOnHomeScreen();
}}
