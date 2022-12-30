package com.NFK.version1.android.steps;

import java.io.IOException;

import com.NFK.sensorpair.AndroidPair;
import com.NFK.support.ApiMethods;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.HomePageAndroid;
import com.NFK.version1.android.pages.MoreMenuPageAndroid;
import com.NFK.version1.android.pages.SensorPairPageAndroid;
import com.NFK.version1.iOS.pages.SensorPairPageIOS;
import com.lfs.nfk.pages.MoteConfigPage;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SensorPairSteps {
	MoreMenuPageAndroid MoreMenuPage=new MoreMenuPageAndroid();
	SensorPairPageAndroid sensorpairpage = new SensorPairPageAndroid();
	AndroidPair androidPair = new AndroidPair();
	MoteConfigPage moteConfigPage = new MoteConfigPage();

	@QAFTestStep(description = "user enters valid sensor pair code")
	public void userEntersValidSensorPairCode() {
		sensorpairpage.entersensorCode();
	}

	@QAFTestStep(description = "user redirects to Apply sensor screen")
	public void checkApplySensorsc() {
		sensorpairpage.verifyapplysensor();
	}

	@QAFTestStep(description = "user verifies the Location Access permission")
	public void verifiesLocationAccessPermission() throws InterruptedException {
		sensorpairpage.selectsNextButtonStartPairing();
		sensorpairpage.checkLocationAccessPOpup();
	}

	@QAFTestStep(description = "user selects Start Session")
	public void userSelectsStartSession() {
		sensorpairpage.selectSensorSession();
	}

	@QAFTestStep(description = "user selects {0} location of body to apply sensor")
	public void userSelectsTheLocationOfSensorToApplyOnBody(String location) {
		sensorpairpage.selectbodyLocation(location);

	}

	@QAFTestStep(description = "user waiting to connect to sensor")
	public void userWaitingToConnectToSensor() {
		sensorpairpage.connectingtoSensor();
	}

	@QAFTestStep(description = "user redirects to Apply sensor screen and clicks on How to apply sensor link")
	public void userselectsensorloaction() {
		sensorpairpage.verifyapplysensor();
		sensorpairpage.verifyhowtoapplysensorlink();
		sensorpairpage.verifyhelpfultipslink();
	}

	@QAFTestStep(description = "user redirects to Apply sensor screen for two to five year old kid and clicks on How to apply sensor link")
	public void userselectsensorlocations() {
		sensorpairpage.verifyapplysensor2to6yrold();
		sensorpairpage.verifyhowtoapplysensorlink();
		sensorpairpage.verifyhelpfultipslink();
	}

	@QAFTestStep(description = "user verifies the nearby device popup on Apply sensor screen")
	public void userverifiesNearByPopupApplySensorScreen() {
		sensorpairpage.selectbodyLocation("RIGHTABDOMEN");
		sensorpairpage.verifyNearbyDevicePopup();
	}

	@QAFTestStep(description = "user enable the Nearby Devices Access permission from device settings screen")
	public void userEnableDeviceAccessPermission() {
		sensorpairpage.enableAccess();
	}

	@QAFTestStep(description = "user verifies that Low Range alert is displayed")
	public void userVerifyLowSensorReading() {
		sensorpairpage.verifyLowAlertAndAcknowledge();
	}

	@QAFTestStep(description = "user observes that In Range readings are shown on the home screen")
	public void userVerifyInrangeReading() {
		sensorpairpage.verifySensorReadingOnHomeScreen();
	}

	@QAFTestStep(description = "user verifies that High Range alert is displayed")
	public void userVerifyHighSensorReading() {
		sensorpairpage.verifyHighAlertAndAcknowledge();
	}

	@QAFTestStep(description = "user enters the passkey {0} for sensor id {1}")
	public void paireSensorForDevice(String passkey, String id) throws Exception {
		androidPair.pairSensor(id, passkey);
	}

	@QAFTestStep(description = "user stuffs the emulator {0} with data {1} on machine {2}")
	public void userStuffsDataToEmulator(String emulator, String data,String ip) throws InterruptedException, IOException {
		String emulatorNo= ConfigurationManager.getBundle().getString(emulator);
		moteConfigPage.dataStuffing(emulatorNo,data,ip);
	}


	@QAFTestStep(description = "user clicks on cancel button")
	public void userClicksOnCancelButton() {
		sensorpairpage.userClicksOnCancelButton();
	}

	@QAFTestStep(description = "user clicks on tryagain button")
	public void userClicksOnTryagainButton() {
		sensorpairpage.userClicksOnTryagainButton();
	}

	@QAFTestStep(description = "the user closes sensor warmup alert")
	public void userClosesSensorWarmupAlert() {
		sensorpairpage.userClosesSensorWarmupAlert();
	}

	@QAFTestStep(description = "user open notifications")
	public void userOpenNotifications() {
		LFSUtilsAndroid.openNotification();
	}

	@QAFTestStep(description = "user verifies {0} push notification")
	public void userVerifyAlertPushNotification(String notification) {
		sensorpairpage.verifyAlertOnPushNotification(notification);
	}

	@QAFTestStep(description = "user verifies {0} popup on home screen without ack")
	public void userVerifyAlertOnHomeScreenWithoutAck(String alert) {
		sensorpairpage.VerifyAlertOnHomeScreenWithoutAck(alert);
	}

	@QAFTestStep(description = "user waits for {0} notification for {1} mins")
	public void the_user_opens_notification(String alertType, long mins) {
		long miliSeconds = mins * 60000;
		LFSUtilsAndroid.openNotification();
		sensorpairpage.waitForALerts(alertType, miliSeconds);
	}

	@QAFTestStep(description = "user requests the cgmreading for days")
	public void userRequestsTheCgmreadingForDays() {
		ApiMethods.fillCGMReadingsForDifferentForAndroidDays();
	}

	@QAFTestStep(description = "user selects {0} location of body to apply sensor and click on next")
	public void userSelectsLocationOfBodyToApplySensorAndClickOnNext(String location) {
		sensorpairpage.selectbodyLocation(location);
		sensorpairpage.selectsNextButtonStartPairing();
		
	}
	@QAFTestStep(description = "user verifies {0} popup on home screen")
	public void userVerifyAlertOnHomeScreen(String alert) {
	}
	@QAFTestStep(description = "user verifies High Glucose Alert not displayed")
	public void userVerifyHighAlertNotDisplayed() {
		sensorpairpage.verifyHighSensorReadingNotDisplayed();
	
	}
	@QAFTestStep(description ="user requests the cgmreading for {0} days")
	public void userRequestsTheCgmreadingFor200Days() {
		ApiMethods.fillCGMReadingsForDifferentAndroid200Days();

	}
	@QAFTestStep(description = "user verifies {0} push notification without ackowladge")
	public void userVerifiesPushNotificationWithoutAckowladge(String notification) {
		sensorpairpage.verifyPushNotificationOnLockScreen(notification);
	}
	@QAFTestStep(description = "user click on unpair sensor button and verify unpair sensor screen")
	public void userClickOnUnpairSensorButtonAndVerifyUnpairSensorScreen() {	
		MoreMenuPage.clickOnUnpairSensor();
		sensorpairpage.verifyUnpairSensorScreen();
	}
}
