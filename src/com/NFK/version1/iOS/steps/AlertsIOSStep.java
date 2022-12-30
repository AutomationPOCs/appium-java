package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.AlertsPageIOS;
import com.NFK.version1.iOS.pages.HomePageIOS;
import com.NFK.version1.iOS.pages.MoremenuPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class AlertsIOSStep {

	AlertsPageIOS alerts = new AlertsPageIOS();
	HomePageIOS homePage = new HomePageIOS();
	MoremenuPageIOS moremenu =new MoremenuPageIOS();
	@QAFTestStep(description = "user verifies Alert screen")
	public void verifyAlerts() {
		alerts.verifyAlertScreen();
	}
	
	@QAFTestStep(description = "user clicks on {0} and verifies the screen")
	public void verifyurgentlowAlerts(String str) {
		alerts.clickOnUrgentAlarmAndVerify(str);
	}
	
	@QAFTestStep(description = "user verify the sound and vibration screen of {0}")
	public void verifySoundAndVibrationForUrgentLow(String Values) {
		alerts.verifySoundVibrationScreen(Values);
	}
	
	
	@QAFTestStep(description="user clicks back button and navigate to alert screen")
	public void userClicksBackButtonAndNavigateToAlertScreen(){
		alerts.clickAlertBackbutton();
	}
	
	@QAFTestStep(description="user clicks on {0} Alert and verifies the screen")
	public void userClicksOnAlertAndVerifiesTheScreen(String str0){
		alerts.clickVerifyScreen(str0);
	}
	
	@QAFTestStep(description="user clicks on user {0} Alert schedule and verifies the screen")
	public void userClicksOnUserAlertScheduleAndVerifiesTheScreen(String str0){
		alerts.clickUserAlertSchedule(str0);
	}
	
	
	@QAFTestStep(description="user updates the picker values present on {0} screen")
	public void userUpdatesThePickerValuesPresentOnScreen(String str0){
		alerts.updatePickervalue(str0);
	}
	
	@QAFTestStep(description="user verifies the updated picker values present on {0} screen")
	public void userVerifiesTheUpdatedPickerValuesPresent(String option){
		alerts.verifyUpdatedPickervalue(option);
	}
	
	@QAFTestStep(description="user enables the alert schedule and verifies the name field")
	public void userEnablesTheAlertScheduleAndVerifiesTheNameField(){
		alerts.enableAlertSchedule();
		alerts.verifyNameField();
	}
	
	@QAFTestStep(description="user clicks on name field and verifies Edit schedule screen")
	public void userTapsOnNameFieldAndNavigatesToEditScheduleScreen(){
	    alerts.clickScheduleName();
	}
	
	@QAFTestStep(description="user clicks on schedule name")
	public void userclicksonschedulename(){
	  alerts.clickScheduleName();
	}
	
	@QAFTestStep(description="user enables the alert schedule and clicks on schedule name")
	public void userEnablesTheAlertScheduleAndClicksOnScheduleName(){
		alerts.enableAlertSchedule();
		alerts.clickScheduleName();
	}
	@QAFTestStep(description="user enters schedule name and verifies Alert screen on {0}")
	public void userchecksthedefaultvaluesoneditschedulescreen(String str){
	    alerts.enterScheduleName();
	    alerts.verifyScheduleField(str);
	}
	
	@QAFTestStep(description="user clicks on {0} and update Picker values")
	public void userClicksOnAndUpdatePickerValues(String str){
		alerts.clicksOnPicker(str);
	
	}
	
	@QAFTestStep(description="user reset all the alert settings")
	public void userResetAlertsSetting(){
		alerts.resetAlertsSettings();
	}
	@QAFTestStep(description="user verifies Alerts settings configuration to factory configuration")
	public void verifySettingsConfiguration(){
		alerts.getConfigurationSettinsg();
	}
	@QAFTestStep(description="user clicks on Reset Alert Settings")
	public void userResetsVerifiesSettings(){
		alerts.clickResetAlerts();
       alerts.verifyresetSeetings();
	}
	@QAFTestStep(description="user click on information icon")
	public void userclickonInfoicon(){
		alerts.clickinfoIcon();
	}
	
	
	@QAFTestStep(description="user verifies mobile device setting alert")
	public void userverifymobiledevicesettingalert(){
		alerts.verifymobiledevicesettingalert();
	}

	@QAFTestStep(description="user verifies setting screen")
	public void userverifysettingsscreen(){
		alerts.verifymobiledevicesettings();
	}
	
	@QAFTestStep(description="user verifies the Critical Toggle button")
	public void userverifiesCriticalToggleBtn(){
		alerts.verifiesCriticalTogglebtn();
	}
	@QAFTestStep(description="user launch settings and disbale the critical alert")
	public void userlaunchDisableCritical(){
		LFSUtilsIOS.launchSettings();
		alerts.openNotification(); 
		alerts.disableCriticalAlert();
	}
	@QAFTestStep(description="user verifies change setting popup on Alert screen")
	public void userChangeSettingPopAlert(){
		alerts.verifySettingsPopup();
	}
	@QAFTestStep(description = "user clicks on High Alert and sets Repeat picker to {0}")
	public void userClickHighAlertSetsRepeatPicker(String str) {
		alerts.clickonHighAlert();
		alerts.setHighRepeatValue(str);
	}
	@QAFTestStep(description = "user navigate Back to Home screen")
	public void usernavigateHomeScreen() {
		alerts.navigateHomeScreenClickback();
	}
	@QAFTestStep(description = "user clicks on Low Alert and sets Repeat picker to {0}")
	public void userClickLowAlertSetsRepeatPicker(String str) {
		alerts.clikLowAlert();
		alerts.setLowRepeatValue(str);
	}
	@QAFTestStep(description = "user navigate Back to Home screen from alert screen")
	public void usernavigatebackHomeScreen() {
		alerts.navigatebacktoHomeScreenfromlowalert();
	}
	@QAFTestStep(description = "user clicks on Low Alert and {0} low alert toggle")
	public void userClickLowAlertoffthetoggle(String str) {
		alerts.setLowToggle(str);
	}
	@QAFTestStep(description = "user clicks on low Alert and sets Notify me below picker to {0} mgdl")
	public void usersetNotifymebelowPicker(String str) {
		alerts.clikLowAlert();
		alerts.setNotifymebelowValue(str);
	}
	@QAFTestStep(description="user clicks on {0} Alert")
	public void userClicksOnAlert(String alertType){
		alerts.clickOnAlert(alertType);
	}
	@QAFTestStep(description="user turn {0} alert")
	public void userTurnOffAlert(String toggle){
		alerts.toggleAlert(toggle);
	}
	@QAFTestStep(description = "user clicks on High Alert and {0} High alert toggle")
	public void userClickHighAlertoffthetoggle(String str) {
		alerts.setHighToggle(str);
	}
	@QAFTestStep(description = "user navigate Back to Home screen from high alert screen")
	public void usernavigatebacktoHomeScreen() {
		alerts.navigatebacktoHomeScreenfromhighalert();
	}
	@QAFTestStep(description = "user clicks on High Alert and sets Notify me Above picker to {0} mgdl")
	public void usersetNotifymeAbovePicker(String str) {
		alerts.clickonHighAlert();
		alerts.setNotifymeAboveValue(str);
	}
	@QAFTestStep(description = "user clicks on Low Alert and sets Repeat picker to {0} and sets Notify me below picker to {1} mgdl")
	public void userClickLowAlertSetsRepeatPickerandnotify(String str,String str1) {
		alerts.clikLowAlert();
		alerts.setLowRepeatValue(str);
		alerts.setNotifymebelowValue(str1);
	}
	@QAFTestStep(description="user launch settings and disable notifications")
	public void userlaunchDisableNotifications(){
		LFSUtilsIOS.launchSettings();
		alerts.openNotification(); 
		alerts.disableNotifications();
		
	}
	
	@QAFTestStep(description = "user disables custome alert setting")
	public void userDisablesTheAlertScheduleSetting() {
		alerts.disableAlertSceduelSetting();
	} 
	@QAFTestStep(description = "user saves custome alert setting")
	public void userSavesAlertScheduleSetting() {
		alerts.saveCustomALertSetting();
	}
	@QAFTestStep(description="user clicks back button on alert")
	public void userClicksBackButtonOnAlert(){
	alerts.clickOnBackButton();
	}
	@QAFTestStep(description = "user clicks on No Reading Alert and {0} No Reading alert toggle")
	public void userClickNOAlertoffthetoggle(String str) {
		alerts.clickonNoreading();
		alerts.toggleAlert(str);
	}
	@QAFTestStep(description = "user navigate Back to Home screen from No Reading alert screen")
	public void usernavigatebacktoHomeScreenfromnoreading() {
		alerts.navigatebacktoHomeScreenfromNoReadingalert();
	}
	@QAFTestStep(description = "user clicks on Signal loss Alert and {0} Signal loss alert toggle")
	public void userClicksOnSignalLossAlertAndSignalLossAlertToggle(String str) {
		alerts.clickSignalLoss();
		alerts.signalLossToggleAlert(str);
	}
	@QAFTestStep(description ="user update the signal loss value {0} hrs {1} min")
	public void userUpdateTheSignalLossValueHrsMin(String hrs, String min) {
		alerts.clickSignalLoss();
		alerts.updateAndVerifySignalLossValue(hrs, min);
	}

	@QAFTestStep(description="user clicks on {0} and update Picker values to {1}")
	public void userClicksOnAndUpdatePickerValuesTo(String str ,String time){
		alerts.clicksOnPickerAndUpdateValue(str,time);
	}
	@QAFTestStep(description="user clicks on {0} Alert schedule and {1} alert toggle")
	public void userclickAlertAndchangealert(String str ,String str2){
		alerts.setClickAlertSchedule(str);
		alerts.setToogleAlert(str2);
	}
	@QAFTestStep(description="user set {0} Alert and Notify Me Above {1}")
	public void userSetAlertAndNotifyMeAbove(String str ,String time){
		alerts.setAlertAndNotifyMeAbove(str);
		alerts.setNotifymeAboveValue(time);
	}
	@QAFTestStep(description="user set picker value to {0} mgdl")
	public void userChangePickerValue(String str){
		alerts.setNotifymebelowValue(str);
	}

	@QAFTestStep(description = "user clicks on Custom High Alert and sets Repeat picker to {0} and sets Notify me Above picker to {1} mgdl")
	public void userClicksCustomHighAlertAndSetsRepeatPickerFifteenAndNotifyMeAbovePicker(String str,String str1) {
		alerts.userClicksCustomHighAlert();
		alerts.setHighRepeatValue(str);
		alerts.setNotifymeAboveValue(str1);	
	}  
	
	@QAFTestStep(description = "user clicks on Custom Low Alert and sets Repeat picker to {0} and sets Notify me Above picker to {1} mgdl")
	public void userClicksCustomLowAlertAndSetsRepeatPickerFifteenAndNotifyMeAbovePicker(String str,String str1) {
//		alerts.userClicksCustomHighAlert();
		alerts.clikLowAlert();
		alerts.setLowRepeatValue(str);		
		alerts.setNotifymeAboveValue(str1);	
	}  
	@QAFTestStep(description = "user reset alert setting and verify app should reset all the alerts setting configuration")
	public void userResetAlertSettingandVerifyAppShouldResetAllTheAlertsSettingConfiguration() {
		alerts.resetAlertSetting();
	}
	@QAFTestStep(description = "user navigate to alert screen and verify reset alert setting button")
	public void userNavigateToAlertScreenAndVerifyResetAlertSettingButton() {
		alerts.verifyResetAlertSettingButton();
	}
	@QAFTestStep(description="user clicks on custom {0} Alert and sets Repeat picker to {1}")
	public void userclickAlertAndchangeNotifyMeAbove(String str1, String str2){
		alerts.setClickAlertSchedule(str1);
		alerts.setHighRepeatValue(str2);	
	}
	@QAFTestStep(description = "user verifies Change Your Settings popup and Mobile Device Alerts Off banner not displaying on home screen")
	public void VerifyAlertOffBannerAndChangeYourSettingsPopupNotDisplayed() {
		alerts.verifyMobileDeviceAlertoffBanner();
		alerts.verifyMobileDeviceSettingScreenDisplyed();
	}
	@QAFTestStep(description = "user tap on Not Now option and verifies that user remains on Mobile Device Settings screen")
	public void VerifyMobileDeviceSettingScreenDisplayed() {
		alerts.taponNotNow();
		alerts.verifyMobileDeviceSettingScreenDisplyed();
	}
	@QAFTestStep(description = "User verifies Change your settings popup")
	public void verifyChangeYourSettingsPopup() {
		alerts.verifyChangeYourSettingPopupDisplayed();
	}
	@QAFTestStep(description = "user tap on Go to mobile settings link and verifies mobile settings screen")
	public void tapOnGoToMobileSettingLinkVerifyMobileSettingScreen() {
		alerts.tapOnGoToMobileSettingLink();
	}
	@QAFTestStep(description = "User verifies Mobile Device Settings screen")
	public void verifyMobileDeviceScreen() {
		alerts.verifyMobileDeviceSettingScreen();
	}
	@QAFTestStep(description = "user Tap on information i icon on Alerts screen")
	public void taponInformationIcon() {
		alerts.taponNotNow();
		alerts.tapOnInformationIcon();
	}
	@QAFTestStep(description = "user selects more menu icon and then Alert screen")
	public void userSelectsMoreMenuandAlertScreen() {
		alerts.taponNotNow();
		homePage.clickOnMoreMenuIcon();
    	moremenu.clickMyAlerts();
	}
	@QAFTestStep(description = "user Tap on Mobile Device Alerts Off banner and verifies Change your settings popup")
	public void tapOnAlertOffBannerAndVerifyChangeYourSettingsPopup(){
		alerts.tapOnMobileDeviceAlertsOffbanner();
		alerts.verifyChangeYourSettingPopupDisplayed();
	}
	@QAFTestStep(description = "user tap on Not Now option and verifies Change your settings popup and Red Alert Banner")
	public void verifyChangeYourSettingsPopupAndRedAlertBanner() {
		alerts.taponNotNow();
		alerts.verifyChangeYourSettingPopupDisplayed();
		alerts.verifyMobileDeviceAlertoffBanner();
	}
	@QAFTestStep(description = "user verifies Change your settings popup on homescreen")
	public void VerifyMobileDeviceAlertOffBannerAndChangeYourSettingsPopup() {
		alerts.verifyChangeYourSettingsPopup();
	}
	@QAFTestStep(description = "user navigates to Home screen")
	public void VerifyUserNavigatesToAlertScreen() {
		alerts.navigateHomeScreenFromMobileDeviceSetting();
		
	}

	@QAFTestStep(description = "user clicks on Custom High Alert toggle")
	public void userClicksOnCustomHighAlertToggle() {
		alerts.userClicksOnCustomHighAlertToggle();
		
	}
	@QAFTestStep(description = "user verify High alert should be {0}")
	public void userVerifyHighAlert(String str) {
		alerts.userVerifyHighAlert(str);
		
	}

	 @QAFTestStep(description = "user enables Treat as Critical on alert screen")
		public void userenablesTreatasCriticalonalertschedulescreen() {
			alerts.setTreatasCriticalalertschedule();
		}


	@QAFTestStep(description="user clicks on {0} Alert schedule and update value {1}")
	public void userclickAlertAndupdateValue(String str ,String str2){
		alerts.setClickAlertSchedule(str);
		alerts.setNotifymebelowValue(str2);
	}
	@QAFTestStep(description = "user clicks on cancel button and verify no changes are made on alert screen")
	public void userClicksOnCancelButtonAndVerifyNoChangesAreMadeOnAlertScreen() {
		alerts.verifyNoChangesAreMadeOnTheAlertScreen();
	}
	@QAFTestStep(description = "user clicks on reset setting button and verify confirmation screen")
	public void userClicksOnResetSettingButtonAndVerifyConfirmationScreen() {
		alerts.verifyConfirmationScreen();
	}
	@QAFTestStep(description = "user update the alert setting and navigate to home screen")
	public void userUpdateTheAlertSettingAndNavigateToHomeScreen() {
		alerts.updateAlertSetting();
	}
	@QAFTestStep(description = "user enables Treat as Critical on alert screen")
	public void userClickTreatasCriticaloffthetoggle() {
		alerts.setTreatasCritical();
	}
	@QAFTestStep(description="user enabled treat as critical toggle from schedule screen")
	public void userEnabledTreatAsCriticalToggleFromScheduleScreen(){
		alerts.enabledTreatAsCriticalToggle();
	}

}
