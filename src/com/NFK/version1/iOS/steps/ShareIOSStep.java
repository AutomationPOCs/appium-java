package com.NFK.version1.iOS.steps;

import com.NFK.support.ApiMethods;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.SharePageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ShareIOSStep {
	ApiMethods apiObj = new ApiMethods();
	SharePageIOS sharePage=new SharePageIOS();
	
	@QAFTestStep(description = "user verify share page")
	public void userVerifiesShareScreen() {
		sharePage.verifyShareScreen();
	}

	@QAFTestStep(description = "user verifies time frame pop up")
	public void verifyTimeFramePopUp() {
		sharePage.timeFramePopUp();
	}
	@QAFTestStep(description = "user clicks on time frame button")
	public void clicksTimeFrameBtn() {
		sharePage.clickTimeFrameBtn();
	}
	@QAFTestStep(description = "user select {0} day as time frame")
	public void selecstTimeFrame(String day) {
		sharePage.selectTimeFrame(day);
	}
	@QAFTestStep(description = "user select share type as {0} and verifies the No Reading Available popup")
	public void selecstShareType(String type) {
		sharePage.clickOnFromShareType(type);
	}
	@QAFTestStep(description = "user select share type as {0} and verifies the Not Enough Data popup")
	public void verifyNotEnoughDataPopUp(String type) {
		sharePage.clickOnFromShareType(type); 
	}
	@QAFTestStep(description = "user verify share text screen")
	public void verifyShareTextScreen() {
		sharePage.verifyShareTextScreen();
	}
	@QAFTestStep(description="user click on share pdf")
	public void shareToPDFiOS(){
		sharePage.sharePDFFIle();
	}

	@QAFTestStep(description="user click on export data csv")
	public void exportToCSV(){
		sharePage.clickExportButtonToShare();
	}
	
	@QAFTestStep(description="user verify share pdf timeframe sequence")
	public void verifyTimeframeOnPDF() {
		sharePage.clickOnPdfTimeframe();
	}

	@QAFTestStep(description="user verify share CSV timeFrame sequence")
	public void verifyTimeframeOnCSV() {
		sharePage.clickOnCsvTimeframe();
	}
	
	@QAFTestStep(description="user click on share last reading using text")
	public void shareLastReading(){
		sharePage.verifyShareTextScreen();
	}
	@QAFTestStep(description="user click on share last reading using email")
	public void shareLastReadingViaEmail(){
		sharePage.shareLastReadingUsingEmail();
	}
	@QAFTestStep(description="user click on share last reading using AGP")
	public void shareLastReadingViaAGP(){
		sharePage.shareLastReadingUsingAGP();
	}
	@QAFTestStep(description="user click on share last reading using CSV")
	public void shareLastReadingViaCSV(){
		sharePage.clickOnCSV();
		sharePage.shareLastReadingUsingEmail();
		sharePage.openInReport();
	}
	@QAFTestStep(description="user click on cancel button share page")
	public void clickOnCancelButtonSharePage(){
		sharePage.sharepageCancelButton();
	}
	
	@QAFTestStep(description="user clicks on PDF option")
	public void shareReportPDF(){
		sharePage.clickOnPDF();
	}
	
	@QAFTestStep(description="user clicks on CSV option")
	public void shareExportDataCSV(){
		sharePage.clickOnCSV();
		sharePage.verifyCSVScreen();
	}
	@QAFTestStep(description="user clicks on Low Glucose option")
	public void userClicksLowGlucose(){
		sharePage.clickOnLowGlucose();
	}
	
	@QAFTestStep(description="user verify Email share option")
	public void sharePDFReportByEmail(){
		sharePage.clickOnPDFByEmail();
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
		sharePage.verifyShareScreen();
	}
	
	@QAFTestStep(description = "user clicks on Add Follower button")
	public void clicksOnAddFollower() {
		sharePage.clicksOnAddFollowerBtn();
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
	    sharePage.clickDiscard();
	    sharePage.verifyNoFollowerName();
		}

	@QAFTestStep(description = "user gets redirected to Add Follower page")
	public void verifyAddFollowerPageUI() {
		sharePage.verifyAddFollowerUI();
	}

	@QAFTestStep(description = "user enters name and email address of follower and clicks on next button")
	public void addUserDetailsAddFollower() {
		sharePage.addFollowersDetails();
	}
	
	
	@QAFTestStep(description = "user add and invites twenty new followers")
	public void addtwentyFollowers() {
		sharePage.addTwentyFollowersDetails();
	}
	
	@QAFTestStep(description = "user verifies Maximum Followers Reached popup")
	public void verifyMaxFollowers() {
		sharePage.verifyMaxFolloerPopup();
	}
	
	@QAFTestStep(description = "user verifies Sharing First Use Statements")
	public void sharingFirstUseStatements() {
		sharePage.completeFirstUseStatements();
	}
	
	@QAFTestStep(description = "user clicks on Invite Followers button")
	public void clicksOnInviteFollower() {
		sharePage.clicksOnInviteFollowerBtn();
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
		LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
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
		LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
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
		@QAFTestStep(description = "user clicks on Add followers feild and verify share your data screen")
		public void userClicksAddFollowersFeildandVerifyShareYourDataScreen() {
			sharePage.userClicksAddFollowersFeildAndVerifyShareYourDataScreen();
		}
		@QAFTestStep(description = "user click on invite followers button of invite followers screen")
		public void userClickInviteFollowersButtonofInviteFollowersScreen() {
			sharePage.userClickInviteFollowersButtonofInviteFollowersScreen();
		}
		@QAFTestStep(description = "user enter follower details {0}")
		public void userEnterAddFollowersDetail(String details) {
			sharePage.userEnterAddFollowersDetail(details);
		}
		@QAFTestStep(description = "user click on invited follower name")
		public void userClickOnInvitedFollowerName() {
			sharePage.userClickOnInvitedFollowerName();
			
		}  
		@QAFTestStep(description = "user click on add follower button using {0}")
		public void userClickOnAddFollowerButton(String details) {
			sharePage.userClickOnAddFollowerButton();
			sharePage.addDetails(details);
		}  
		@QAFTestStep(description = "user click follower name")
		public void userClickFollowerName() {
			sharePage.userClickFollowerName();	
		} 
		@QAFTestStep(description = "user requests the cgmreading for past {0} for low glucose event")
		public void userRequestsTheCgmReadingForPastForLowGlucoseEvent(int noOfDays) {
			apiObj.fillCGMReadingForLowGlucoseEventForIOS(noOfDays);	
		} 
		@QAFTestStep(description = "user clicks on low glucose event on share screen")
		public void userClicksOnLowGlucoseEventOnShareScreen() {
			sharePage.clickOnLowGlucoseEvent();	
		}
		@QAFTestStep(description = "user verify loading spinner and low glucose event details")
		public void userVerifyLoadingSpinnerAndLowGlucoseEventDetails() {
			sharePage.lowGlucoseEventEmailScreen();	
		}
		@QAFTestStep(description = "user verify CSV details")
		public void userVerifyCSVDetails() {
			sharePage.verifyCSVDetails();	
		}
		@QAFTestStep(description = "user clicks on Agp option on share screen")
		public void userClicksOnAgpOptionOnShareScreen() {
			sharePage.clickOnAGPOption();	
		}
		@QAFTestStep(description = "user verify loading spinner and agp details")
		public void userVerifyLoadingSpinnerAndAgpDetails() {
			sharePage.verifyAGPDetailsOnEmailScreen();	
		}		
		@QAFTestStep(description = "user clicks on Email option on CSV screen")
		public void userClicksOnEmailOptionOnCSVScreen() {
			sharePage.clickOnEmailOnCSVScreen();	
		}
		@QAFTestStep(description = "user clicks on Email option on AGP screen")
		public void userClicksOnEmailOptionOnAGPScreen() {
			sharePage.clickOnEmailOnAGPScreen();	
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
		@QAFTestStep(description = "user clicks on delete draft and navigate to low glucose event screen")
		public void userclicksOnDeleteDraftAndNavigateToLowGlucoseEventScreen() {
			sharePage.clickOnCancelButtonAndNavToShareScreen();	
		}
		@QAFTestStep(description = "user clicks on {0} on low glucose event screen")
		public void userClicksOnEmailOnLowGlucoseEventScreen(String option) {
			sharePage.clickOnOptionsPresentOnLowGlucoseEventScreen(option);	
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