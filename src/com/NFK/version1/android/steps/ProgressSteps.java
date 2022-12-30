package com.NFK.version1.android.steps;

import com.NFK.support.ApiMethods;
import com.NFK.version1.android.pages.ProgressPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ProgressSteps {
	ApiMethods apiMethods = new  ApiMethods();
	ProgressPageAndroid progresspage = new ProgressPageAndroid();

	@QAFTestStep(description = "user clicks on progress tab and verifies the My progress screen")
	public void verifyAddedEventOnprogressScreen() {
		progresspage.clickProgressBar();
		progresspage.verifyMyProgress();
	}

	/*
	 * @QAFTestStep(description = "user verifies the Glucose Average and GMI")
	 * public void verifyGlucoseAverageGMI(){ progresspage.verifyAverage(); }
	 */
	@QAFTestStep(description = "user verifies the Glucose Average and GMI for {0} days")
	public void userVerifiesTheGlucoseAverageAndGMI(String opt) {
		progresspage.verifyAverage(opt);
	}

	@QAFTestStep(description = "user verifies current data and past data displays for the {0} days")
	public void userCurrentDataPastDataCompare(String opt) {
		progresspage.compareData(opt);
	}

	@QAFTestStep(description = "user verifies the My Progress screen when no CGM data")
	public void userVerifiesTheMyProgressScreen() {
		progresspage.clickProgressBar();
		progresspage.noDataProgressScreen();
	}

	@QAFTestStep(description = "user checks message for number of days data not available")
	public void verifyMessageNodata() {
		progresspage.textNoData();
	}

	@QAFTestStep(description = "user verifies the Low Glucose Events on My Progress screen")
	public void verifyLowGlucoseEvents() {
		progresspage.clickProgressBar();
		progresspage.verifyNoOfLowEvents();
	}

	@QAFTestStep(description = "user verifies Ambulatory Glucose Profile section on My Progress screen")
	public void userVerifiesAmbulatoryGlucoseprofile() {
		progresspage.verifyAGPsection();
		progresspage.verifyGlucoseProfile();
		progresspage.verifyDailyGlucoseProfile();
		progresspage.verifyViewFullAGpReport();

	}

	@QAFTestStep(description = "user clicks on progress tab and verifies selected day")
	public void verifyprogressScreen() {
		progresspage.clickProgressBar();
		progresspage.verifyProgressScreenwithnewlyselcted();
	}

	@QAFTestStep(description = "user selects 14 days")
	public void userchnagemyprogressdaysoption() {
		progresspage.select14day();
	}

	@QAFTestStep(description = "user clicks on {0} and verify app not load the AGP report")
	public void userVerifyAppNotLoadTheAGPReport() {
		progresspage.userVerifyAppNotLoadTheAGPReport();
	}

	@QAFTestStep(description = "user verifies the by default selected with 7 days")
	public void userVerifiesmyprogressdaysoption() {
		progresspage.verify7Daysbydefault();
	}

	@QAFTestStep(description = "user clicks on i icon of AGP and verify AGP Info on slideup")
	public void userClicksOnIIconOfAGPAndVerifyAGPInfoOnSlideup() {
		progresspage.verifyAGPIndoOnSlideup();
	}

	@QAFTestStep(description = "user click on the compair switch toggle")
	public void userClickOnCompairSwitchToggle() {
		progresspage.compairSwitchToggle();
	}

	@QAFTestStep(description = "user verify CGM Readings")
	public void userVerifyCGMReadings() {
		progresspage.verifyCGMReadings();
	}

	@QAFTestStep(description = "user verify CGM and GMI Readings")
	public void userVerifyCGMAndGMIReadings() {
		progresspage.verifyCGMAndGMIReadings();
	}

	@QAFTestStep(description = "user selects 30 days")
	public void userSelects30Days() {
		progresspage.select30Day();
	}

	@QAFTestStep(description = "user selects 60 days")
	public void userSelects60Days() {
		progresspage.select60Day();
	}

	@QAFTestStep(description = "user selects 90 days")
	public void userSelects90Days() {
		progresspage.select90Day();
	}

	@QAFTestStep(description = "user verify all readings in minutes and hour")
	public void userVerifyAllReadingsInMinutesAndHour() {
		progresspage.verifyReadingsInMinutesAndHour();
	}

	@QAFTestStep(description = "user verify not enough data text")
	public void userVerifyNotEnoughDataText() {
		progresspage.verifyNotEnoughDataText();
	}
	@QAFTestStep(description = "user clicks on progress tab")
	public void userClicksOnProgressTab() {
		progresspage.verifyProgressTab();
	}
	@QAFTestStep(description = "user verifies daily glucose profile section on my progress screen")
	public void userVerifiesDailyGlucoseProfileSectionOnMyProgressScreen() {
		progresspage.verifyDailyGlucoseProfileSection();
	}
	@QAFTestStep(description = "user verifies view full AGP report section on my progress screen")
	public void userVerifiesViewFullAGPReportSectionOnMyProgressScreen() {
		progresspage.verifyViewFullAGpReport();
	}
	@QAFTestStep(description = "user requests the cgmreading for past {0} days for AGP report")
	public void userRequestsTheCgmreadingForPastDaysForAGPReport(int days) {
		apiMethods.fillCGMReadingForAGPForAndroid(days);
	}
	@QAFTestStep(description = "user verifies 7 days as selected by default")
	public void userVerifies7DaysAsSelectedByDefault() {
		progresspage.verify7DaysSelectedAsBydefault();
	}

	@QAFTestStep(description = "user requests the cgmreading for {0} days In range CGM Data")
	public void userRequestsTheCgmReadingForInRangeCGMData(int noofdays) {
		apiMethods.fillCGMReadingsForInRangeDataForAndroid(noofdays);
	}

	@QAFTestStep(description = "user verify glucose average value")
	public void userVerifyGlucoseAverageValue() {
		progresspage.verifyGlucoseAverageValue();
	}

	@QAFTestStep(description = "user verify Ranges Doughnut chart")
	public void userVerifyRangesDoughnutChart() {
		progresspage.verifyRangesDoughnutChart();
	}

	@QAFTestStep(description = "user clicks on GMI info icon and verify slideUp screen")
	public void userClicksOnGMIInfoIconAndVerifySlideUpScreen() {
		progresspage.verifyGlucoseManagementIndicatorSlideupScreen();
	}

	@QAFTestStep(description = "user verify GMI fields")
	public void userVerifyGMIFields() {
		progresspage.verifyGlucoseManagementIndicatorField();
	}

	@QAFTestStep(description = "user requests the cgmreading for {0} days with low, Inrange and high reading")
	public void userRequestsTheCgmreadingFor7DaysWithLowInrangeAndHighReading(int noofdays) {
		apiMethods.fillCGMReadingForLowInRangeHighDataForAndroid(noofdays);
	}

	@QAFTestStep(description = "user verify the percent and average time in range per day")
	public void userVerifyThePercentAndAverageTimeInRangePerDay() {
		progresspage.verifyLowInrangeHighRangeReadingWhenTargetRangeIs70_180();
		progresspage.AverageTimeInRangePerDay();
	}

	@QAFTestStep(description = "user verify the percent time in range")
	public void userVerifyThePercentTimeInRange() {
		progresspage.verifyLowInrangeHighRangeReadingWhenTargetRangeIs100_190();
	}
}
