package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.SettingsPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.util.Reporter;

public class SettingsIOSStep {

	SettingsPageIOS settingsPage = new SettingsPageIOS();

	@QAFTestStep(description = "user gets redirected to setting Page")
	public void verifySettingsPageUI() {
		settingsPage.verifySettingUI();
	}
	
	@QAFTestStep(description = "user clicks on User settings button")
	public void verifyUserSettingsscreen() {
		settingsPage.verifyUserSetting();
	}	

	@QAFTestStep(description="user analyzes the target glucose range {0}")
	public void userAnalyzeTheTargetGlucoseRange(String settingdetail){
	settingsPage.analyzesensorValue(settingdetail);
	}
	
	@QAFTestStep(description = "user verifies range and clicks on Cancel button")
	public void clickOnCancle() {
		settingsPage.clickOnCancle();
	}
	
	@QAFTestStep(description = "user verifies User setting screen")
	public void verifySetting() {
		settingsPage.verifyUserSettingsScreen(); 
	}
	

//	@QAFTestStep(description="user analyze the target glucose range")
//	public void userAnalyzeTheTargetGlucoseRange(){
//		settingsPage.verifyTargetRange();
//	}
	
	
	@QAFTestStep(description="user verifies Log Insulin and Overlay Event is displayed and {0}")
	public void userVerifyLogInsulinAndOverlayEventIsDisplayedAnd(String option){
	settingsPage.verifyEventsVisibility(option);
	}
	
	@QAFTestStep(description = "user clicks setting screen back button")
	public void clicksBackButton() {
		settingsPage.clicksBackButton(); 
	}
	@QAFTestStep(description="user {0} the Events")
	public void userTheEvents(String option){
		settingsPage.clickOnEvents(option);
	}
	@QAFTestStep(description="user verifies the edited {0} target ranges")
	public void userVerifyTheEditedTargetRanges(String updatedrange){
		settingsPage.verifyEditedTargetRanges(updatedrange);
	}
	
	@QAFTestStep(description = "user clicks on Male button")
	public void clickOnMale() {
		settingsPage.clickOnMaleButton();
	}

	@QAFTestStep(description = "user verifies Male button selected")
	public void verifyMaleButtonSelected() {
		settingsPage.verifySelectedMaleButton();
	}

	@QAFTestStep(description = "user clicks on Female button")
	public void clickOnFeMale() {
		settingsPage.clickOnFemaleButton();
	}

	@QAFTestStep(description = "user verifies Female button seleced")
	public void verifyFeMaleButtonSelected() {
		settingsPage.verifySelectedFemaleButton();
	}

	// Updated by Gaurav Bhamare
	@QAFTestStep(description = "user verifies selected checkboxes")
	public void verifyDiabeticQuestionsOnSettingsPage() {
		settingsPage.verifyDiabeticQuestions();
	}

	// Code is remaining
	@QAFTestStep(description = "user take Before & After BG value on setting page")
	public void VerifyBGValueBEforeAfter() {
		// settingsPage.verifyBGValueBEforeAfter();
	}

	@QAFTestStep(description = "user change Begin time")
	public void changeBeginTime() {
		settingsPage.changeBeginTime();
	}

	@QAFTestStep(description = "user clicks on insulin switch")
	public void clickOnInsulinSwitch() {
		settingsPage.clickInsuliSwitch();
	}
	
	@QAFTestStep(description = "user verify canada unit as mmol/L setting screen")
	public void canadaUnitSettingPage() {
		settingsPage.verifyCandammol();
	}
	
	@QAFTestStep(description = "user selects the checkboxes for Diabetes Management questions") 
	public void selectCheckboxesForDiabetisQstn() {
		settingsPage.clickOnAllCheckboxes();
	}
	
	@QAFTestStep(description = "user unchecks the checkboxes") 
	public void checkAllSelectedCheckboxes() {
		settingsPage.uncheckAllCheckboxes();
	}
	
	@QAFTestStep(description = "user navigates to page settings menu opened from")
	public void navigateBackFromSettings() {
		settingsPage.navigateBackFromSettings();
	}
	

	@QAFTestStep(description = "user verifies selected gender and diabetes type on settings page")
	public void userVerifySelectedGenderAndDiabetesTypeOnSettingsPage() {
		settingsPage.verifySelectedGenderAndDiabetesTypeOnSettingsPage();
		
	}

	/// Varsha
	@QAFTestStep(description = "user verify gestational type for male on settings page")
	public void userVerifyGestationalTypeForMaleOnSettings() {
		settingsPage.verifyGestationalTypeForMaleOnSettings();
	}
	
	//Gaurav
	@QAFTestStep(description = "user selects {0}")
	public void userRedirectsToSettings(String obj) {
		settingsPage.userRedirectsToRequiredSettings(obj);
	}
	
	@QAFTestStep(description = "user verify awards module")
	public void verifyAwardModule() {
		settingsPage.verifyAwardsModule();
	}
	
	@QAFTestStep(description = "user verify to change the Awards Setting")
	public void verifyChangeAwardSetting() {
		settingsPage.verifyChangesForAwardSetting();
	}
	
	@QAFTestStep(description = "user verify System Setting has option App and User Setting")
	public void verifyAppUserSetting() {
		settingsPage.verifyAppAndUserSetting();
	} 

	@QAFTestStep(description = "user is not able to add A1C for more than 120 days")
	public void verifyNotAdding180DayData() {
		settingsPage.verifyUnableToAdd180Data();
	}
	
	@QAFTestStep(description="user verify and click on System Setting")
	public void clickSystemSetting() {
		settingsPage.clickSystemSetting();
	}
	
	@QAFTestStep(description = "user verifies Bubble animations toggle with text")
	public void verifyBubbleAnimationsToggleWithText() {
		settingsPage.verifyBubbleAnimation();
	}

	@QAFTestStep(description="verify the unit of measure for Range of glucose should be {0}")
	public void verifyTheUnitOfMeasureForRangeOfGlucoseShouldBe(String uom){
		settingsPage.verifyUserSetting();
		settingsPage.verifyUOMonUserSetting(uom);
	}
	@QAFTestStep(description="user verifies system setting screen")
	public void userVerifiesSystemSettings(){
		settingsPage.verifiesSystemSettings();
	}
@QAFTestStep(description = "user verifies selected gender and change the gender on settings page")
	public void userVerifiesSelectedGenderAndChangeTheGenderOnSettingsPage() {
		settingsPage.changeGender();
	}

	@QAFTestStep(description = "user verifies selected gender")
	public void userVerifiesSelectedGender() {
		settingsPage.VerifyGender();
	}

	@QAFTestStep(description = "user verifies selected diabetes type and chnage diabetes type on settings page")
	public void userVerifiesSelectedDiabetesTypeAndChangeTheDiabetesTypeOnSettingsPage() {
		settingsPage.changediabetesType();
	}

	@QAFTestStep(description = "user verifies diabetes type")
	public void userVerifiesSelectedDiabetesType() {
		settingsPage.VerifyDiabetesType();
	}
	@QAFTestStep(description= "user verify target range by default as {0}")
	public void userVerifyByDefaultTargetRange(String targetRange){
		settingsPage.VerifyByDefaultTargetRange(targetRange);
	}
	@QAFTestStep(description="user change the target range as {0}")
	public void userChangeTheTargetRange(String targetRange){
		settingsPage.changeTargetRange(targetRange);
	}
}
