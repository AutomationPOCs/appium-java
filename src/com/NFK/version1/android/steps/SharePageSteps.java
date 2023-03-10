package com.NFK.version1.android.steps;

import com.NFK.support.ApiMethods;
import com.NFK.version1.android.pages.SharePageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SharePageSteps {
	ApiMethods apiMethods= new ApiMethods();
	SharePageAndroid sharePage = new SharePageAndroid();
	@QAFTestStep(description="user verify share page")
	public void verifySharePage(){
		sharePage.verifyShare();
	}

	@QAFTestStep(description = "user select share type as {0} and verifies the No Reading Available popup")
	public void selectShareType(String type) {
		sharePage.clickOnFromShareType(type);
		sharePage.verifyNoDataPopup();
	}
	@QAFTestStep(description = "user select share type as {0} and verifies the Not Enough Data popup")
	public void verifyNotEnoughDataPopUp(String type) {
		sharePage.clickOnFromShareType(type); 
		sharePage.verifyNoEnoughPopup();  
	}
	
	@QAFTestStep(description="user click on share pdf")
	public void shareToPDF(){
		sharePage.sharePDFFile();
	}
	@QAFTestStep(description="user click on export data csv")
	public void exportToCSV(){
		sharePage.clickExportButtonToShare();
	}
	
	@QAFTestStep(description="user click on share last reading using text")
	public void shareReadingUsingText(){
		sharePage.shareUsingText();
	}
	
	@QAFTestStep(description="user click on share last reading using email")
	public void shareReadingUsingEmail(){
		sharePage.shareUsingEmail();
	}
	@QAFTestStep(description="user click on share last reading using AGP")
	public void shareLastReadingViaAGP(){
		sharePage.shareLastReadingUsingAGP();
	}
	@QAFTestStep(description="user click on share last reading using CSV")
	public void shareLastReadingViaCSV(){
		sharePage.clickOnCSV();
		sharePage.shareUsingEmail();
		sharePage.openInReport();
	}
	@QAFTestStep(description = "user select share type as {0}")
	public void selecstShareType(String type) {
		sharePage.clickOnFromShareType(type);
	}
	
	@QAFTestStep(description = "user verify share text screen")
	public void verifyShareTextScreen() {
		sharePage.verifyShareTextScreen();
	}
	
	@QAFTestStep(description="user verify share pdf timeframe sequence")
	public void verifyPDFTimeSequence(){
		sharePage.verifyPDFtimeFrameSequence();
	}
	
	@QAFTestStep(description="user verify share CSV timeFrame sequence")
	public void verifyCSVTimeSequnece(){
		sharePage.verifyCSVTimeFrameSequence();
	}
	
	@QAFTestStep(description="user create a report")
	public void createPerfectoReport(){
		sharePage.createReportium();
	}
	
	@QAFTestStep(description="user clicks on PDF option")
	public void shareReportPDF(){
		sharePage.clickOnPDF();
	}
	
	@QAFTestStep(description="user clicks on CSV option")
	public void shareExportDataCSV(){
		sharePage.clickOnCSV();
	}
	@QAFTestStep(description="user clicks on Low Glucose option")
	public void userClicksLowGlucose(){
		sharePage.clickOnLowGlucose();
	}
	
	@QAFTestStep(description="user verify Email share option")
	public void sharePDFReportByEmail(){
		sharePage.clickOnPDFByEmail();
	}
	@QAFTestStep(description = "user verifies No Data Available popup")
	public void userVerifiesNoDataPopup() {
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("7"); 
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("30");
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("60");
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("90");
		sharePage.verifyPOPupTimeFrame(); 
		sharePage.clickBack();
	}
	@QAFTestStep(description ="user verifies No Low Glucose Events popup")
	public void userVerifiesNoLowData(){
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("7"); 
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("30");
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("60");
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("90");
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.clickBack();
	}	
	@QAFTestStep(description="user verify Print share option")
	public void sharePDFReportByPrint(){
		sharePage.clickOnPDFByPrint();
	}
	
	@QAFTestStep(description="user verify Open in share option")
	public void sharePDFReportByOpenIn(){
		sharePage.clickOnPDFByOpenIn();
	}
	
	@QAFTestStep(description = "user gets redirected to Share Page")
	public void verifySharePageUI() {
		sharePage.verifyShareUI();
	}
	@QAFTestStep(description = "user add new Follower and verify the Status")
	public void addFollowerVerifyStatus() {
		sharePage.completeFirstUseStatements();
		sharePage.clicksOnInviteFollowerBtn();
		sharePage.clicksOnAddFollowerBtn();
		sharePage.addFollowersDetails();
		sharePage.clicksOnInviteBtn();
		sharePage.checkStaus();
	}
	
	@QAFTestStep(description = "user check the Remove button and Resend link")
	public void checkRemoveResendBtn() {
		sharePage.checkRemoveResendBtn();
	
		}
	@QAFTestStep(description = "user removes the follower and verifies followers name no longer display on share screen")
	public void removePopup() {
		sharePage.clickOnRemovebtn();
	    sharePage.verifyPopup();
	    sharePage.verifyfollowername(); 
	    sharePage.verifyNoFollowerName();
		}
	
	@QAFTestStep(description = "user clicks on Add Follower button")
	public void clicksOnAddFollower() {
		sharePage.clicksOnAddFollowerBtn();
	}
	
	@QAFTestStep(description = "user add and invites twenty new followers")
	public void addtwentyFollowers() {
		sharePage.addTwentyFollowersDetails();
	}
	
	@QAFTestStep(description="user verifies Maximum Followers Reached popup")
	public void userVerifiesMaximumFollowersReachedPopup(){
		sharePage.MaximumFollowersReachedPopup();
	}
	
	@QAFTestStep(description = "user verifies Sharing First Use Statements")
	public void sharingFirstUseStatements() {
		sharePage.completeFirstUseStatements();
	}
	
	@QAFTestStep(description = "user clicks on Invite Followers button")
	public void clicksOnInviteFollower() {
		sharePage.clicksOnInviteFollowerBtn();
	}
	
	@QAFTestStep(description = "user gets redirected to Add Follower page")
	public void verifyAddFollowerPageUI() {
		sharePage.verifyAddFollowerUI();
	}
	
	@QAFTestStep(description = "user enters name and email address of follower and clicks on next button")
	public void addUserDetailsAddFollower() {
		sharePage.addFollowersDetails();
	}
	
	@QAFTestStep(description = "user gets redirected to Set Follower page")
	public void verifySetFollowerPageUI() {
		sharePage.verifySetFollowerUI();
	}
	
	@QAFTestStep(description = "user enables {0} {1} and {2} notifications")
	public void userSetNotifications(String notification1, String notification2, String notification3) { 
		sharePage.setNotifications(notification1);
		sharePage.setNotifications(notification2);
		sharePage.setNotifications(notification3);
		
	}
	
	@QAFTestStep(description = "clicks on Invite button")
	public void clicksOnInvite() {
		sharePage.clicksOnInviteBtn();
	}
	
	@QAFTestStep(description = "user verifies the added follower on share page")
	public void verifyFollowerOnSharepage() {
		sharePage.verifyFollowerOnShare();
	}
	@QAFTestStep(description="user verify the Status")
	public void userVerifyTheStatus(){
		sharePage.verifyfollowerStatus();
	}
	@QAFTestStep(description="user toggles trend graph and sensor expiration")
	public void userTogglesTrendGraphAndSensorExpiration(){
		sharePage.toggleSwitchFollwerSettings();
	}
	@QAFTestStep(description="user turn off toggle button")
	public void userTurnOffToggleButton(){
		sharePage.userTurnOffToggleButton();
		
	}  
	@QAFTestStep(description="user click on status expired follower")
	public void userClickStatusExpiredFollower(){
		sharePage.userClickExpiredFollowerName();
		
	}
	@QAFTestStep(description="user click on follower name")
	public void userClickOnFollowerName(){
		sharePage.userClickOnFollowerName();
	} 
	@QAFTestStep(description="user click on accepted followername")
	public void userClickAcceptedFollowername(){
		sharePage.userClickAcceptedFollowername();
	} 
	@QAFTestStep(description="user click on paused follower name using {0}")
	public void userClickPausedFollowerName(String details){
		sharePage.userClickPausedFollowerName(details);
	} 

	@QAFTestStep(description = "user enter follower details {0}")
	public void useEnterAddFollowersDetail(String details) {
		sharePage.userEnterAddFollowersDetails(details);
		}
	@QAFTestStep(description="user click on invited follower name")
	public void userClickOnInvitedFollowerName(){
		sharePage.userClickOnInvitedFollowerName();
		
	}
	@QAFTestStep(description="user click on add follower button using {0}")
	public void userClickAddFollowerButton(String details){     
		sharePage.userClickAddFollowerButton();
		sharePage.addDetails(details);
	}  
	@QAFTestStep(description="user click follower name")
	public void userClickFollowerName(){
		sharePage.userClickFollowerName();	
	}
	@QAFTestStep(description = "user requests the cgmreading for past {0} for low glucose event")
	public void userRequestsTheCgmReadingForPastForLowGlucoseEvent(int noOfDays) {
		apiMethods.fillCGMReadingForLowGlucoseEventForAndroid(noOfDays);	
	} 
	@QAFTestStep(description = "user verify loading spinner and agp details")
	public void userVerifyLoadingSpinnerAndAgpDetails() {
		sharePage.verifyAGPDetailsOnEmailScreen();	
	}
	@QAFTestStep(description = "user verify CSV details")
	public void userVerifyCSVDetails() {
		sharePage.verifyCSVDetails();	
	}
	@QAFTestStep(description = "user verify loading spinner and low glucose event details")
	public void userVerifyLoadingSpinnerAndLowGlucoseEventDetails() {
		sharePage.lowGlucoseEventEmailScreen();	
	}	

	@QAFTestStep(description = "user verify email section on AGP screen")
	public void userVerifyEmailSectionOnAGPScreen() {
		sharePage.verifyAGPEmailSection();	
	}
	@QAFTestStep(description = "user verify PDF report attached to mail")
	public void userVerifyPDFReportAttachedToMail() {
		sharePage.verifyPDFReportAttachedToMail();	
	}

	@QAFTestStep(description = "user select time period as {0} days")
	public void userSelectTimePeriodAsDays(String days) {
		sharePage.selectTimePeriod(days);	
	}
	@QAFTestStep(description = "user verify email section on low glucose event screen")
	public void userVerifyEmailSectionOnLowGlucoseEventScreen() {
		sharePage.verifyEmailSectionOnLowGlucoseEventScreen();	
	}
	@QAFTestStep(description = "user send an email")
	public void userSendAnEmail() {
		sharePage.sendAnEmail();	
	}
	@QAFTestStep(description = "user verify requests unsuccessful popup")
	public void userverifyRequestsUnsuccessfulPopup() {
		sharePage.verifyRequestUnsuccessfulPopup();	
	}
	@QAFTestStep(description = "user clicks on back button on email screen and navigate to app")
	public void userClicksOnBackButtonOnEmailScreenAndNavigateToApp() {
		sharePage.clickOnBackButtonOnMail();	
	}
	@QAFTestStep(description = "user clicks on {0} option")
	public void userClicksOnOptions(String option) {
		sharePage.clickOnOptionsPresentOnShareScreen(option);	
	}
	@QAFTestStep(description = "user verify print section on low glucose event screen")
	public void userVerifyPrintSectionOnLowGlucoseEventScreen() {
		sharePage.verifyPrintSectionOnLowGlucoseEventScreen();	
	}
	@QAFTestStep(description = "user clicks on cancel button and navigate to low glucose event screen")
	public void userClicksOnCancelButtonAndNavigateToLowGlucoseEventScreen() {
		sharePage.clickOnCancelButtonAndNavToLGEScreen();	
	}
	@QAFTestStep(description = "user clicks on back button navigate to share screen")
	public void userClicksOnBackButtonNavigateToShareScreen() {
		sharePage.clickOnBackButtonOnLGEAndNavToShareScreen();	
	}
}