package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.HelpPageIOS;
import com.NFK.version1.iOS.pages.HomePageIOS;
import com.NFK.version1.iOS.pages.ProgressPageIOS;
import com.NFK.version1.iOS.pages.SensorPairPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class HomeIOSStep {

	HomePageIOS homePage = new HomePageIOS();
	ProgressPageIOS progresspage = new ProgressPageIOS();
	SignupPageIOS signupPage = new SignupPageIOS();
	HelpPageIOS helpPage =new HelpPageIOS();
	SensorPairPageIOS sensorpair = new SensorPairPageIOS();
	
	@QAFTestStep(description = "user clicks on more menu")
	public void clicksOnMoreMenu() {
		homePage.clickOnMoreMenuIcon();
	}

	@QAFTestStep(description = "user verify navigation bar on homescreen")
	public void verifynav() {
		homePage.verifynavigationBar();
	}


	@QAFTestStep(description = "user clicks on logbook tab")
	public void clicksOnLogbookIcon() {
		homePage.clickOnLogbookIcon();
	}

	@QAFTestStep(description = "user clicks on added event {0} on Event Log for {1}")
	public void clicksOnAddedEventLogScreen(String data, String Day) {
//		homePage.clickOnaddEvent(data,Day);
		homePage.clickOnaddEvent(data);
	}

	@QAFTestStep(description = "user verify added event {0} on home screen")
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		homePage.verifyAddedEventHomeScreen(eventDetail);
		Reporter.logWithScreenShot("Event displayed", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verifies event {0} is deleted on Event Log")
	public void verifyDeleteEventHomeScreen(Object eventDetail) {
		homePage.verifyEventDeleted(eventDetail);
	}

	@QAFTestStep(description = "user verifies note event {0} is deleted on Event Log")
	public void verifyDeleteNoteEventHomeScreen(Object eventDetail1) {
		homePage.verifyNoteEventDeleted(eventDetail1);
		Reporter.logWithScreenShot("Note Event is deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user clicks on Home tab")
	public void clickHomePage() {
		homePage.clickOnHome();
	}

	@QAFTestStep(description = "user redirects to logbook page")
	public void verifyLogbookPage() {
		homePage.verifyLogbook();
	}

	@QAFTestStep(description = "user clicks on connections tab")
	public void clicksOnConnectionTab() {
		homePage.clickConnectionIcon();
	}

	@QAFTestStep(description = "user clicks on My Progress")
	public void userClicksOnMyProgress() {
		progresspage.clickProgressBar();
	}

	@QAFTestStep(description = "user redirects to connections page")
	public void verifyConnectionPage() {
		homePage.verifyConnection();
	}

	@QAFTestStep(description = "user gets redirected to Home page")
	public void verifyHomePage() {
		homePage.verifyHome();
	}

	@QAFTestStep(description = "user clicks Add an Event")
	public void homepageAddEvent() {
		homePage.homepageAddEvent();
	}

	// Added Step def to click on X icon from Add an event menu
	@QAFTestStep(description = "user clicks on X icon from add an event screen")
	public void ClickonXiconAddEvent() {
		homePage.clickonIconAddEvent();
	}

	@QAFTestStep(description = "user verifies the events are not displayed")
	public void VerifyEvents() {
		homePage.eventsVerify();
	}

	@QAFTestStep(description = "user verifies the homepage with no events")
	public void homepageNoEvents() {
		homePage.homePageNoEvents();
	}


	@QAFTestStep(description = "user clicks and verify 14, 30, and 90 Day views")
	public void clickAndVerifyDayRangeViews() {
		homePage.verifyPeriodDayViews();
	}

	@QAFTestStep(description = "user clicks on last sync reading tab")
	public void clickOnRecentEvent() {
		homePage.clickOnRecentEventBtn();
	}

	@QAFTestStep(description = "user clicks on All events link")
	public void clickOnAllEventLink() {
		homePage.clickAllEventLink();
	}

	@QAFTestStep(description = "user verify 14, 30, and 90 Day views for no event data")
	public void verifyLastReadingWithNoReadingData() {
		homePage.verifyAllLastReadignWithNoReading();
	}

	@QAFTestStep(description = "user verify recent added BG on last sync tab using {0}")
	public void verifyRecentEventTab(Object eventDetails) {
		homePage.verifyRecentEventDetails(eventDetails);
	}

	@QAFTestStep(description = "user click on {0} over view tab")
	public void clickOnOverviewScreen(String tab) {
		homePage.click14_30_90Day(tab);
	}

	@QAFTestStep(description = "user verify BG period result popup")
	public void verifyPeriodResultPopUp() {
		homePage.verifyPeriodRusultPage();
	}


	@QAFTestStep(description = "user click on reading button on lastreading screen")
	public void clicksReadingButtonLastreadingPage() {
		homePage.clickReadingButtonLastreadingPage();
	}
	@QAFTestStep(description = "user verify added BG get deleted using {0}")
	public void verifyAddedBGDeleted(Object event) {
		homePage.verifyDeletedBGAfterDeletion(event);
	}

	@QAFTestStep(description = "user clears homepage events")
	public void clearHomeEvents() {
		homePage.deleteAllEvents();
	}

	@QAFTestStep(description = "user verify over all range on donut pop up")
	public void overallRangeOnDonutPopUp() {
		homePage.verifyOverallRangeonDonutPopUp();
	}

	@QAFTestStep(description = "user verify average reading units")
	public void verifyReadingsPerDayOn90DayView() {
		homePage.verifyReadingsPerDay();
	}

	@QAFTestStep(description = "user verify Yesterday text for yesterday added event")
	public void verifyYesterdayTextios() {
		homePage.verifyEventDateAsYesterDay();
	}

	@QAFTestStep(description = "user Syncing with account")
	public void Syncing_account() {
		homePage.syncingAccount();
	}

	@QAFTestStep(description = "user click and verify reading for {0} days")
	public void verifyAverage(int range) {
		homePage.verifyMyProgress(range);
	}

	
	@QAFTestStep(description = "user verify Added Carbs value on home page")
	public void verifyAddedCarbs() {
		homePage.verifyAddedCarbs();
		Reporter.logWithScreenShot("Carbs value added", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify Added Activity value on home page")
	public void verifyAddedActivity() {
		homePage.verifyAddedActivity();
		Reporter.logWithScreenShot("Activity value added", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user clicks on Pair sensor Button")
	public void userClicksOnPairSensorButton() {
		homePage.clickPairbtn();
	}

	@QAFTestStep(description = "user verifies all events are displayed")
	public void userVerifiesAllEventsAreDisplayed() {
		homePage.verifyAddEvents();
	}

	@QAFTestStep(description = "user verifies empty Home screen")
	public void userVerifiesEmptyHomeScreen() {
		homePage.verifyEmptyHomeScreen();
	}

	@QAFTestStep(description = "user redirects to Home screen")
	public void userClicksOnHomeTab() {

	}

	@QAFTestStep(description = "user verifies home screen after unpairing sensor")
	public void verifyHomeScreenAfterRepairingSensor() {
		homePage.clickOnHomeTab();
		homePage.verifyHomeScreenAfterUnpairingSensor();
	}

	@QAFTestStep(description = "user verifies home screen after adding reminder")
	public void verifyHomeScreenAfterAddingReminder() {
		homePage.clickOnHomeTab();
		homePage.verifyConnectToSensorPopup();

	}

	@QAFTestStep(description = "user opens app and verify home screen")
	public void openAppAndVerifyHomeScreenAfterunpairing() {
		signupPage.openNFKiosApp1();
		homePage.verifyHomeScreenAfterUnpairingSensor();

	}
	
	@QAFTestStep(description = "user clicks on pair sensor option")
	public void clickonpair() {
			homePage.clickonPairsensorOption();

	}
	@QAFTestStep(description = "user verify gets redirected to Home page")
	public void verifyHomePageopen() {
		homePage.verifyHome();
	}
	@QAFTestStep(description = "user verify the sensor warmup alert")
	public void the_user_verifywarmup() {
		homePage.verifySensorWarmupAlertAndClose();
	}
	
	@QAFTestStep(description = "user verify homepage")
	public void verifyhomescreen() {
		homePage.verifyhomescreen();
	}
	@QAFTestStep(description = "user tap on i icon and verify screen")
	public void verifyiIconscreen() {
		homePage.verifyiICOnscreen();
	}
	@QAFTestStep(description = "user taps on app tour and verify app tour screens")
	public void verifyapptour() {
		homePage.clickapptour();
		helpPage.verifyAppTourScreen(); 
	}
	
	@QAFTestStep(description = "user click on home icon")
	public void clickonhome() {
		homePage.clickOnHomeTab();
	

	}
}
