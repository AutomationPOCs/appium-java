package com.NFK.version1.iOS.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.pages.SignupPageAndroid;
import com.NFK.version1.iOS.beans.EventDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class HomePageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	EventDetailBeans eventBean = new EventDetailBeans();

	@FindBy(locator = "NFKios.homepage.share.btn")
	private QAFWebElement NFKiosHomepageShareBtn;
	@FindBy(locator = "NFKios.homepage.more.Btn")
	private QAFWebElement NFKiosHomepageMoreBtn;
	@FindBy(locator = "NFKios.homepage.home.btn")
	private QAFWebElement NFKiosHomepageHomeBtn;
	@FindBy(locator = "NFKios.homepage.logbook.btn")
	private QAFWebElement NFKiosHomepageLogbookBtn;
	@FindBy(locator = "NFKios.homepage.connection.btn")
	private QAFWebElement NFKiosHomepageConnectionBtn;
	@FindBy(locator = "NFKios.homepage.patterns.btn")
	private QAFWebElement NFKiosHomePagePatternsBtn;
	@FindBy(locator = "NFKios.homepage.lastreadings.btn")
	private QAFWebElement NFKiosHomepageLastreadingsBtn;
	@FindBy(locator = "NFKios.homepage.lastreadingdetail.btn")
	private QAFWebElement NFKiosHomepageLastreadingsdetailBtn;
	@FindBy(locator = "NFKios.homepage.lastreadingdetail14day.btn")
	private QAFWebElement NFKiosHomepageLastreadingdetail14dayBtn;
	@FindBy(locator = "NFKios.homepage.lastreadingdetail30day.btn")
	private QAFWebElement NFKiosHomepageLastreadingdetail30dayBtn;
	@FindBy(locator = "NFKios.homepage.lastreadingdetail90day.btn")
	private QAFWebElement NFKiosHomepageLastreadingdetail90dayBtn;
	@FindBy(locator = "NFKios.homepage.lastreadingdetialNumberofreadingsleft.txt")
	private QAFWebElement NFKiosHomepageLastreadingdetailNumberofreadingsleftTxt;
	@FindBy(locator = "NFKios.homepage.lastreadingdetialUnitofmeasure.txt")
	private QAFWebElement NFKiosHomepageLastreadingdetailUnitofmeasureTxt;
	@FindBy(locator = "NFKios.homepage.lastreadingdetialNumberofeadingsmiddle.txt")
	private QAFWebElement NFKiosHomepageLastreadingdetailNumberofreadingsmiddleTxt;
	@FindBy(locator = "NFKios.homepage.addedEvent.value.lbl")
	private List<QAFWebElement> NFKiosHomepageAddedEventValueLbl;
	@FindBy(locator = "NFKios.homepage.addedEvent.unit.lbl")
	private List<QAFWebElement> NFKiosHomepageAddedEventUnitLbl;
	@FindBy(locator = "NFKios.homepage.addedEvent.date.lbl")
	private List<QAFWebElement> NFKiosHomepageAddedEventDateLbl;
	@FindBy(locator = "NFKios.homepage.recentEventImg.btn")
	private QAFWebElement NFKiosHomepageRecenteventimgBtn;
	@FindBy(locator = "NFKios.homepage.recentEventValue.lbl")
	private QAFWebElement NFKiosHomepageRecenteventvalueLbl;
	@FindBy(locator = "NFKios.homepage.recentEventUnit.lbl")
	private QAFWebElement NFKiosHomepageRecenteventunitLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.recentBGUnit.lbl")
	private QAFWebElement NFKiosHomepageLastreadingRecentbgunitLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.recentBGLevel.lbl")
	private QAFWebElement NFKiosHomepageLastreadingRecentbglevelLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.recentBG.popup")
	private QAFWebElement NFKiosHomepageLastreadingRecentBGPopup;
	@FindBy(locator = "NFKios.homepage.lastreading.recentBGDate.lbl")
	private QAFWebElement NFKiosHomepageLastreadingRecentBGDateRangePopup;
	@FindBy(locator = "NFKios.homepage.readarticle.lnk")
	private QAFWebElement NFKiosHomepageReadarticleLnk;
	@FindBy(locator = "NFKios.homepage.lastreading.donat.overallRange.lbl")
	private QAFWebElement NFKiosHomepageLastreadingDonatOverallrangeLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.donat.afterrange.lbl")
	private QAFWebElement NFKiosHomepageLastreadingDonatAfterrangeLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.donat.beforerange.lbl")
	private QAFWebElement NFKiosHomepageLastreadingDonatBeforerangeLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.donat.beforemealcount.lbl")
	private QAFWebElement NFKiosHomepageLastreadingDonatBeforemealcountLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.donat.aftermealcount.lbl")
	private QAFWebElement NFKiosHomepageLastreadingDonatAftermealcountLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.donat.notagmealcount.lbl")
	private QAFWebElement NFKiosHomepageLastreadingDonatNotagmealcountLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.readings.inrange.lbl")
	private QAFWebElement NFKiosHomepageLastreadingReadingsInrangeLbl;
	@FindBy(locator = "NFKios.homepage.lastreading.readings.value.txt")
	private List<QAFWebElement> NFKiosHomepageLastreadingReadingsValueTxt;
	@FindBy(locator = "NFKios.homepage.Tip.container")
	private QAFWebElement NFKiosHomepageTipContainer;
	@FindBy(locator = "NFKios.homepage.patternon.btn")
	private QAFWebElement NFKiosHomepagePatternOnBtn;
	@FindBy(locator = "NFKios.homepage.readingsPerDay.txt")
	private QAFWebElement NFKiosHomepageReadingsPerDayTxt;
	@FindBy(locator = "NFKios.homepage.atricleclose.btn")
	private QAFWebElement NFKiosHomepageArticleCloseBtn;
	@FindBy(locator = "NFKios.homepage.atricle.ok.btn")
	private QAFWebElement NFKiosHomepageArticleOkBtn;
	@FindBy(locator = "NFKios.homepage.addedEvent.amountText.lbl")
	private QAFWebElement NFKiosHomepageAddedeventAmounttextLbl;
	@FindBy(locator = "NFKios.homepage.addedEvent.dynamic.lbl")
	private QAFWebElement NFKiosHomepageAddedeventDynamicLbl;
	@FindBy(locator = "NFKios.homepage.addevent.btn")
	private QAFWebElement NFKiosHomepageAddeventBtn;
	@FindBy(locator = "NFKios.homepage.lastsyncmetertitle.lbl")
	private QAFWebElement NFKiosHomepageLastsyncmetertitleLbl;
	@FindBy(locator = "NFKios.homepage.bg.goal.icon")
	private QAFWebElement NFKiosHomepageBgGoalIcon;
	@FindBy(locator = "NFKios.homepage.steps.goal.icon")
	private QAFWebElement NFKiosHomepageStepsGoalIcon;
	@FindBy(locator = "NFKios.homepage.carbs.goal.icon")
	private QAFWebElement NFKiosHomepageCarbsGoalIcon;
	@FindBy(locator = "NFKios.homepage.activity.goal.icon")
	private QAFWebElement NFKiosHomepageActivityGoalIcon;
	@FindBy(locator = "NFKios.homepage.lastreading.date")
	private QAFWebElement NFKiosHomepageLastreadingDate;
	@FindBy(locator = "NFKios.homepage.lastreading.avrgs.page1")
	private QAFWebElement NFKiosHomepageLastreadingAvrgsPage1;
	@FindBy(locator = "NFKios.homepage.lastreading.avrgs.page2")
	private QAFWebElement NFKiosHomepageLastreadingAvrgsPage2;
	@FindBy(locator = "NFKios.homepage.lastreading.avrgs.page3")
	private QAFWebElement NFKiosHomepageLastreadingAvrgsPage3;
	@FindBy(locator = "NFKios.homepage.lastreading.avrgs.page4")
	private QAFWebElement NFKiosHomepageLastreadingAvrgsPage4;
	@FindBy(locator = "NFKios.homepage.patterntabcount.lbl")
	private QAFWebElement NFKiosHomepagePatterntabcountLbl;
	@FindBy(locator = "NFKios.homepage.goals.txt")
	private QAFWebElement NFKiosHomePageGoalsTxt;
	@FindBy(locator = "NFKios.homepage.a1c.info.icon")
	private QAFWebElement NFKiosHomePageA1CInfoIcon;
	@FindBy(locator = "NFKios.eventlogPage.event.btn")
	private QAFWebElement NFKiosEventPageEventbtn;
	@FindBy(locator = "NFKios.homepage.myprogress.btn")
	private QAFWebElement NFKiosHomepageMyprogressBtn;

	public QAFWebElement getNFKiosHomepageAddeventBtn() {
		return NFKiosHomepageAddeventBtn;
	}

	@FindBy(locator = "NFKios.homepage.myprogress.range.7day.btn")
	private QAFWebElement NFKiosHomepageMyprogressRange7dayBtn;
	@FindBy(locator = "NFKios.homepage.myprogress.range.14day.btn")
	private QAFWebElement NFKiosHomepageMyprogressRange14dayBtn;
	@FindBy(locator = "NFKios.homepage.myprogress.range.30day.btn")
	private QAFWebElement NFKiosHomepageMyprogressRange30dayBtn;
	@FindBy(locator = "NFKios.homepage.myprogress.range.60day.btn")
	private QAFWebElement NFKiosHomepageMyprogressRange60dayBtn;
	@FindBy(locator = "NFKios.homepage.myprogress.range.90day.btn")
	private QAFWebElement NFKiosHomepageMyprogressRange90dayBtn;

	// Pair btn loc
	@FindBy(locator = "NFKios.pair.btn")
	private QAFWebElement NFKiosPairBtn;
	@FindBy(locator = "NFKios.sensor.sessoin.title")
	private QAFWebElement NFKiosSensorSessoinTitle;

	// Events Buttons
	@FindBy(locator = "NFKios.homepage.Activity.btn")
	private QAFWebElement NFKHomepageActivityBtn;

	@FindBy(locator = "NFKios.homepage.Carb.btn")
	private QAFWebElement NFKHomepageCarbBtn;
	@FindBy(locator = "NFKios.homepage.Insulin.btn")
	private QAFWebElement NFKHomepageInsulinBtn;
	@FindBy(locator = "NFKios.homepage.Note.btn")
	private QAFWebElement NFKHomepageNoteBtn;

	// Empty Home screen
	@FindBy(locator = "NFKios.homepage.banner.msg.lbl")
	private QAFWebElement NFKiosHomepageBannerMsgLbl;
	@FindBy(locator = "NFKios.homepage.sensor.title")
	private QAFWebElement NFKioshomepageSensorTitle;
	@FindBy(locator = "NFKios.homepage.sensor.descp.lbl")
	private QAFWebElement NFKioshomepageSensorDescpLbl;
	@FindBy(locator = "NFKios.homepage.sensor.howtoapply.btn")
	private QAFWebElement NFKioshomepageSensorHowtoapplyBtn;
	@FindBy(locator = "NFKios.homepage.pair.sensor.btn")
	private QAFWebElement NFKiosHomepagePairSensorBtn;
	@FindBy(locator = "NFKios.homepage.connectToSensor.title")
	private QAFWebElement NFKiosHomepageConnectToSensorTitle;
	@FindBy(locator = "NFKios.homepage.connectToSensor.description")
	private QAFWebElement NFKiosHomepagCconnectToSensorDescription;
	@FindBy(locator = "NFKios.homepage.connectToSensor.pair.button")
	private QAFWebElement NFKiosHomepageConnectToSensorPairButton;

	@FindBy(locator = "NFKios.homepage.connectToSensorpopup.repairSensor.button")
	private QAFWebElement NFKiosHomepageConnectToSensorPopupRepairSensorButton;
	@FindBy(locator = "NFKios.homepage.connectToSensorpopup.pairSensor.button")
	private QAFWebElement NFKiosHomepageConnectToSensorPopupPairSensorButton;
	@FindBy(locator = "NFKios.homepage.connectToSensorpopup.cancel.button")
	private QAFWebElement NFKiosHomepageConnectToSensorPopupCancelButton;
	@FindBy(locator = "NFKios.homepage.repairScreen.repairSensor.btn")
	private QAFWebElement NFKiosHomepageRepairScreenRepairSensorBtn;
	@FindBy(locator = "NFKios.homepage.repairScreen.cancel.btn")
	private QAFWebElement NFKiosHomepageRepairScreenCancelBtn;
	@FindBy(locator = "NFKios.homepage.warmup.countdown.img")
	private QAFWebElement NFKiosHomepagewarmupcountdownimg;
	@FindBy(locator = "NFKios.homepage.starttour.btn")
	private QAFWebElement NFKiosHomepageappTourbtn;
	@FindBy(locator = "NFKios.homepage.i.icon.btn")
	private QAFWebElement NFKiosHomepageiiconbtn;
	@FindBy(locator = "NFKios.homepage.i.iconscreen.title")
	private QAFWebElement NFKiosHomepageiicontitle;
	@FindBy(locator = "NFKios.homepage.i.iconscreen.x.btn")
	private QAFWebElement NFKiosHomepageiiconscreenXbtn;
	@FindBy(locator = "NFKios.Homepage.warmup.Ok.btn")
	private QAFWebElement NFKiosHomepagewarmupOkbtn;
	@FindBy(locator = "NFKios.Homepage.warmup.title")
	private QAFWebElement NFKiosHomepagewarmuptitle;

	public QAFWebElement getNFKiosHomepagewarmupcountdownimg() {
		return NFKiosHomepagewarmupcountdownimg;
	}

	public QAFWebElement getNFKiosHomepageiiconbtn() {
		return NFKiosHomepageiiconbtn;
	}

	public QAFWebElement getNFKiosHomepageiicontitle() {
		return NFKiosHomepageiicontitle;
	}

	public QAFWebElement getNFKiosHomepageiiconscreenXbtn() {
		return NFKiosHomepageiiconscreenXbtn;
	}

	public QAFWebElement getNFKiosHomepageappTourbtn() {
		return NFKiosHomepageappTourbtn;
	}

	public QAFWebElement getNFKiosHomepagewarmupOkbtn() {
		return NFKiosHomepagewarmupOkbtn;
	}

	public QAFWebElement getNFKiosHomepagewarmuptitle() {
		return NFKiosHomepagewarmuptitle;
	}

	public QAFWebElement getNFKiosHomepageStaticTextlbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.homepage.staticText.lbl", text);
	}

	public QAFWebElement getNFKiosHomepageConnectToSensorTitle() {
		return NFKiosHomepageConnectToSensorTitle;
	}

	public QAFWebElement getNFKiosHomepagCconnectToSensorDescription() {
		return NFKiosHomepagCconnectToSensorDescription;
	}

	public QAFWebElement getNFKiosHomepageConnectToSensorPairButton() {
		return NFKiosHomepageConnectToSensorPairButton;
	}

	public QAFWebElement getNFKiosHomepageConnectToSensorPopupRepairSensorButton() {
		return NFKiosHomepageConnectToSensorPopupRepairSensorButton;
	}

	public QAFWebElement getNFKiosHomepageConnectToSensorPopupPairSensorButton() {
		return NFKiosHomepageConnectToSensorPopupPairSensorButton;
	}

	public QAFWebElement getNFKiosHomepageConnectToSensorPopupCancelButton() {
		return NFKiosHomepageConnectToSensorPopupCancelButton;
	}

	public QAFWebElement getNFKiosHomepageRepairScreenRepairSensorBtn() {
		return NFKiosHomepageRepairScreenRepairSensorBtn;
	}

	public QAFWebElement getNFKiosHomepageRepairScreenCancelBtn() {
		return NFKiosHomepageRepairScreenCancelBtn;
	}

	public QAFWebElement getNFKiosHomepageBannerMsgLbl() {
		return NFKiosHomepageBannerMsgLbl;
	}

	public QAFWebElement getNFKioshomepageSensorTitle() {
		return NFKioshomepageSensorTitle;
	}

	public QAFWebElement getNFKioshomepageSensorDescpLbl() {
		return NFKioshomepageSensorDescpLbl;
	}

	public QAFWebElement getNFKioshomepageSensorHowtoapplyBtn() {
		return NFKioshomepageSensorHowtoapplyBtn;
	}

	public QAFWebElement getNFKiosHomepagePairSensorBtn() {
		return NFKiosHomepagePairSensorBtn;
	}

	public QAFWebElement getNFKHomepageActivityBtn() {
		return NFKHomepageActivityBtn;
	}

	public QAFWebElement getNFKHomepageCarbBtn() {
		return NFKHomepageCarbBtn;
	}

	public QAFWebElement getNFKHomepageInsulinBtn() {
		return NFKHomepageInsulinBtn;
	}

	public QAFWebElement getNFKHomepageNoteBtn() {
		return NFKHomepageNoteBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosPairBtn() {
		return NFKiosPairBtn;
	}

	public QAFWebElement getNFKiosSensorSessoinTitle() {
		return NFKiosSensorSessoinTitle;
	}

	public QAFWebElement getNFKiosA1CInfoIcon() {
		return NFKiosHomePageA1CInfoIcon;
	}

	public QAFWebElement getNFKiosHomePageGoalsTxt() {
		return NFKiosHomePageGoalsTxt;
	}

	public QAFWebElement getNFKiosEventspageEventBtn() {
		return NFKiosEventPageEventbtn;
	}

	public QAFWebElement getNFKiosHomepageMyprogressRange7dayBtn() {
		return NFKiosHomepageMyprogressRange7dayBtn;
	}

	public QAFWebElement getNFKiosHomepageMyprogressRange14dayBtn() {
		return NFKiosHomepageMyprogressRange14dayBtn;
	}

	public QAFWebElement getNFKiosHomepageMyprogressRange30dayBtn() {
		return NFKiosHomepageMyprogressRange30dayBtn;
	}

	public QAFWebElement getNFKiosHomepageMyprogressRange60dayBtn() {
		return NFKiosHomepageMyprogressRange60dayBtn;
	}

	public QAFWebElement getNFKiosHomepageMyprogressRange90dayBtn() {
		return NFKiosHomepageMyprogressRange90dayBtn;
	}

	public QAFWebElement getNFKiosHomepagePatterntabcountLbl() {
		return NFKiosHomepagePatterntabcountLbl;
	}

	public QAFWebElement getNFKiosHomepageArticleOkBtn() {
		return NFKiosHomepageArticleOkBtn;
	}

	public QAFWebElement getNFKiosHomepageArticleCloseBtn() {
		return NFKiosHomepageArticleCloseBtn;
	}

	public QAFWebElement getNFKiosHomepagePatternOnBtn() {
		return NFKiosHomepagePatternOnBtn;
	}

	public List<QAFWebElement> getNFKiosHomepageLastreadingReadingsValueTxt() {
		return NFKiosHomepageLastreadingReadingsValueTxt;
	}

	public QAFWebElement getNFKiosHomepageLastreadingReadingsInrangeLbl() {
		return NFKiosHomepageLastreadingReadingsInrangeLbl;
	}

	public QAFWebElement getNFKiosHomepageLastreadingDonatBeforemealcountLbl() {
		return NFKiosHomepageLastreadingDonatBeforemealcountLbl;
	}

	public QAFWebElement getNFKiosHomepageLastreadingDonatAftermealcountLbl() {
		return NFKiosHomepageLastreadingDonatAftermealcountLbl;
	}

	public QAFWebElement getNFKiosHomepageLastreadingDonatNotagmealcountLbl() {
		return NFKiosHomepageLastreadingDonatNotagmealcountLbl;
	}

	public QAFWebElement getNFKiosHomepageLastreadingDonatBeforerangeLbl() {
		return NFKiosHomepageLastreadingDonatBeforerangeLbl;
	}

	public QAFWebElement getNFKiosHomepageMyprogressBtn() {
		return NFKiosHomepageMyprogressBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingDonatAfterrangeLbl() {
		return NFKiosHomepageLastreadingDonatAfterrangeLbl;
	}

	public QAFWebElement getNFKiosHomepageLastreadingDonatOverallrangeLbl() {
		return NFKiosHomepageLastreadingDonatOverallrangeLbl;
	}

	public QAFWebElement getNFKiosHomepageReadarticleLnk() {
		return NFKiosHomepageReadarticleLnk;
	}

	public QAFWebElement getNFKiosHomepageLastreadingRecentBGDateRangePopup() {
		return NFKiosHomepageLastreadingRecentBGDateRangePopup;
	}

	public QAFWebElement getNFKiosHomepageLastreadingRecentBGPopup() {
		return NFKiosHomepageLastreadingRecentBGPopup;
	}

	public QAFWebElement getNFKiosHomepageLastreadingRecentbgunitLbl() {
		return NFKiosHomepageLastreadingRecentbgunitLbl;
	}

	public QAFWebElement getNFKiosHomepageLastreadingRecentbglevelLbl() {
		return NFKiosHomepageLastreadingRecentbglevelLbl;
	}

	public QAFWebElement getNFKiosHomepageRecenteventimgBtn() {
		return NFKiosHomepageRecenteventimgBtn;
	}

	public QAFWebElement getNFKiosHomepageRecenteventvalueLbl() {
		return NFKiosHomepageRecenteventvalueLbl;
	}

	public QAFWebElement getNFKiosHomepageRecenteventunitLbl() {
		return NFKiosHomepageRecenteventunitLbl;
	}

	public List<QAFWebElement> getNFKiosHomepageAddedEventDateLbl() {
		return NFKiosHomepageAddedEventDateLbl;
	}

	public List<QAFWebElement> getNFKiosHomepageAddedEventUnitLbl() {
		return NFKiosHomepageAddedEventUnitLbl;
	}

	public List<QAFWebElement> getONFKiosHomepageAddedEventValueLbl() {
		return NFKiosHomepageAddedEventValueLbl;
	}

	public QAFWebElement getNFKiosHomepageShareBtn() {
		return NFKiosHomepageShareBtn;
	}

	public QAFWebElement getNFKiosHomepageMoreBtn() {
		return NFKiosHomepageMoreBtn;
	}

	public QAFWebElement getNFKiosHomepageHomeBtn() {
		return NFKiosHomepageHomeBtn;
	}

	public QAFWebElement getNFKiosHomepageLogbookBtn() {
		return NFKiosHomepageLogbookBtn;
	}

	public QAFWebElement getNFKiosHomepageConnectionBtn() {
		return NFKiosHomepageConnectionBtn;
	}

	public QAFWebElement getNFKiosHomepageAddedEventDynamicAmountText(String text) {
		String text1 = LFSUtilsIOS.removeUTFCharacters(text);
		return LFSUtilsIOS.getElement("NFKios.homepage.addedEvent.amountText.lbl", text1);
	}

	public QAFWebElement getNFKiosHomePagePatternsBtn() {
		return NFKiosHomePagePatternsBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingsBtn() {
		return NFKiosHomepageLastreadingsBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingsdetailBtn() {
		return NFKiosHomepageLastreadingsdetailBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetail14dayBtn() {
		return NFKiosHomepageLastreadingdetail14dayBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetail30dayBtn() {
		return NFKiosHomepageLastreadingdetail30dayBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetail90dayBtn() {
		return NFKiosHomepageLastreadingdetail90dayBtn;
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetailNumberofreadingsleftTxt() {
		return NFKiosHomepageLastreadingdetailNumberofreadingsleftTxt;
	}

	public QAFWebElement getNFKiosHomepageTipContainer() {
		return NFKiosHomepageTipContainer;
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetailUnitofmeasureTxt() {
		return NFKiosHomepageLastreadingdetailUnitofmeasureTxt;
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetailNumberofreadingsmiddleTxt() {
		return NFKiosHomepageLastreadingdetailNumberofreadingsmiddleTxt;
	}

	public QAFWebElement getNFKiosHomepageAddedEventDynamicLbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.homepage.addedEvent.dynamic.lbl", text);
	}

	public QAFWebElement getNFKiosHomepageAddEventBtn() {
		return LFSUtilsIOS.getElement("NFKios.homepage.addevent.btn",
				LFSUtilsIOS.getPropString("home.action.addAnEvent"));
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetailReadingsperdayTxt() {
		return LFSUtilsIOS.getElement("NFKios.logbookPage.static.lbl",
				LFSUtilsIOS.getPropString("summary.readingsPerDayText"));
	}

	public QAFWebElement getNFKiosHomepageLastsyncwithmeterLbl() {
		return LFSUtilsIOS.getElement("NFKios.homepage.lastsyncmetertitle.lbl",
				LFSUtilsIOS.getPropString("lastSync.meter.title"));
	}

	public QAFWebElement getNFKiosHomepageLastsyncwithmeterViewalleventLnk() {
		return LFSUtilsIOS.getElement("NFKios.logbookPage.static.lbl",
				LFSUtilsIOS.getPropString("lastSync.meter.viewAllLogbookEvents"));
	}

	public QAFWebElement getNFKiosHomepageLastsyncwithmeterTotalreadingLbl() {
		return LFSUtilsIOS.getElement("NFKios.logbookPage.static.lbl",
				LFSUtilsIOS.getPropString("summary.readingsText"));
	}

	public QAFWebElement getNFKiosHomepageLastReadingNoavarageLbl() {
		return LFSUtilsIOS.getElement("NFKios.logbookPage.static.lbl",
				LFSUtilsIOS.getPropString("summary.noDataToDisplay"));
	}

	public QAFWebElement getNFKiosHomepageLastreadingdetailReadingsleftTxt() {
		return LFSUtilsIOS.getElement("NFKios.logbookPage.static.lbl",
				LFSUtilsIOS.getPropString("summary.readingsText"));
	}

	public QAFWebElement getNFKiosHomepageReadingsPerDayTxt() {
		return NFKiosHomepageReadingsPerDayTxt;
	}

	// method to verify home page
	public void verifynavigationBar() {
		getNFKiosHomepageShareBtn().waitForPresent();
		getNFKiosHomepageShareBtn().verifyPresent("Share icon");
		getNFKiosHomepageMoreBtn().verifyPresent("More icon");

	}

	// method to verify and click More icon
	public void clickOnMoreMenuIcon() {
		LFSUtilsIOS.click(getNFKiosHomepageMoreBtn());
		Reporter.logWithScreenShot("User Clicked on more menu icon", MessageTypes.Pass);
	}

// Method to click on share icon
	// milan
	public void clickOnShareIcon() {
		getNFKiosHomepageShareBtn().waitForPresent();
		getNFKiosHomepageShareBtn().click();
		Reporter.logWithScreenShot("After clicking share icon", MessageTypes.Pass);
	}

	// Method to click on home icon
	public void clickOnHome() {
		LFSUtilsIOS.click(getNFKiosHomepageHomeBtn());
		Reporter.logWithScreenShot("After clicking Home icon", MessageTypes.Pass);
	}

	// method to click on logbook icon
	public void clickOnLogbookIcon() {
		LFSUtilsIOS.click(getNFKiosHomepageLogbookBtn());
		LFSUtilsIOS.pause(5000);
		Reporter.logWithScreenShot("Logbook Page is displayed", MessageTypes.Pass);
	}

	// Method to click on added event displayed on home screen
	public void clickOnaddEvent(String data) {
		try {
			getNFKiosHomepageAddedEventDynamicAmountText(data).waitForPresent();
			Point p1 = getNFKiosEventspageEventBtn().getLocation();
			Dimension d1 = getNFKiosEventspageEventBtn().getSize();
			int count = 0;

			while (!LFSUtilsIOS.tryMethod(getNFKiosHomepageAddedEventDynamicAmountText(data))) {
				try {
					LFSUtilsIOS.swipeWithCoordinates(p1.getX() + d1.getWidth(), p1.getY() + d1.getHeight() + 200,
							p1.getX() + d1.getWidth(), p1.getY() + d1.getHeight(), 1000);
					Reporter.logWithScreenShot("After swipe" + count, MessageTypes.Pass);
					count++;
					if (count == 10)
						break;
				} catch (Exception e) {
				}
			}
			if (!getNFKiosHomepageAddedEventDynamicAmountText(data).isPresent()) {
				LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			}
			LFSUtilsIOS.clickWithText("Today");
			getNFKiosHomepageAddedEventDynamicAmountText(data).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user clicking on Added Event", MessageTypes.Pass);
	}

	// Method to click on connection tab
	// SG adding steps to open connections from More Menu per Sprint 4 change
	public void clickConnectionIcon() {
		getNFKiosHomepageMoreBtn().waitForPresent();
		getNFKiosHomepageMoreBtn().click();
		getNFKiosHomepageConnectionBtn().waitForPresent();
		getNFKiosHomepageConnectionBtn().click();
		Reporter.logWithScreenShot("After clicking Connection icon", MessageTypes.Pass);

	}

	// Method to verify logbook page elements
	public void verifyLogbook() {
		EventLogPageIOS logbookPageIOS = new EventLogPageIOS();
		logbookPageIOS.getNFKiosEventLogPageClassicBtn().verifyPresent("Classic view button is present");
		logbookPageIOS.getNFKiosEventLogPageWeekBtn().verifyPresent("Week view button is present");
		logbookPageIOS.getNFKiosEventLogPageDayBtn().verifyPresent("Day view button is present");
		Reporter.logWithScreenShot("Logbook Page is displayed", MessageTypes.Pass);
	}

	public void verifyConnection() {
		Reporter.logWithScreenShot("Connection page is displayed", MessageTypes.Pass);
	}

	// Method to verify home screen elements
	public void verifyHome() {
		getNFKiosHomepageHomeBtn().isPresent();
		getNFKiosHomepageAddEventBtn().isPresent();
		getNFKiosHomepageMoreBtn().isPresent();
		Reporter.logWithScreenShot("Application Main Page is displayed", MessageTypes.Pass);
	}

	// Method to verify added event on appear on home screen
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		EventLogPageIOS logbookpage = new EventLogPageIOS();
		String getAmount = logbookpage.getAddedAmount;
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (eventBean.getEventType().equalsIgnoreCase("glucose")) {
			WebDriverTestCase.verifyTrue(getNFKiosHomepageAddedEventDynamicAmountText(getAmount).isPresent(),
					getAmount + "Added event is not displayed", "Added event is displayed" + getAmount);
		} else {
			WebDriverTestCase.verifyTrue(
					getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).isPresent(),
					eventBean.getAmount() + "Added event is not displayed",
					"Added event is displayed" + eventBean.getAmount());
		}

	}

	// Method to verify added event on appear on home screen
	public void verifyAddedEventMyEventScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		EventLogPageIOS logbookpage = new EventLogPageIOS();
		String getAmount = logbookpage.getAddedAmount;
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (eventBean.getEventType().equalsIgnoreCase("glucose")) {
			WebDriverTestCase.verifyTrue(getNFKiosHomepageAddedEventDynamicAmountText(getAmount).isPresent(),
					getAmount + "Added event is not displayed", "Added event is displayed\t" + getAmount);
		} else {
			WebDriverTestCase.verifyTrue(
					getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).isPresent(),
					eventBean.getAmount() + "Added event is not displayed",
					"Added event is displayed\t" + eventBean.getAmount());
		}
	}

	public void verifyEventDeleted(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (!(LFSUtilsIOS.tryMethod(getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount())))) {
			Reporter.logWithScreenShot("The Event is deleted successfully ", MessageTypes.Pass);
		}

	}

	public void verifyNoteEventDeleted(Object eventDetail1) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail1 instanceof String) {

			eventBean.fillFromConfig((String) eventDetail1);
		} else {
			eventBean.fillData(eventDetail1);
		}
		int count = 0;
		while (LFSUtilsIOS.tryMethod(getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getnote()))) {

			EventLogPageIOS logbook = new EventLogPageIOS();
			try {
				logbook.verifyDeleteEventButton();
				logbook.clickSelectedEventDeleteButton();
			} catch (Exception e) {
			}
			count++;
			if (count == 10)
				break;
		}
		if (!(LFSUtilsIOS.tryMethod(getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getnote())))) {
			Reporter.logWithScreenShot("Event deleted successfully", MessageTypes.Pass);
		}
	}

	public void homepageAddEvent() {
		LFSUtilsIOS.click(getNFKiosHomepageAddEventBtn());
		Reporter.logWithScreenShot("User clicked on add event button", MessageTypes.Pass);
	}

	public void clickonIconAddEvent() {
		LFSUtilsIOS.click(getNFKiosHomepageAddEventBtn());
		Reporter.logWithScreenShot("User clicked on X-icon of add an event", MessageTypes.Pass);
	}

	// Method to verify Home Page with no Events created
	public void homePageNoEvents() {
		getNFKiosHomepageAddEventBtn().verifyPresent("Add Event button is present");
		Reporter.logWithScreenShot("Verify Add event button is present", MessageTypes.Pass);
	}

	// Method to click 14 30 90 Day button on Last Readings Summary page

	public void click14_30_90Day(String pageName) {
		pageName = pageName.toUpperCase();
		switch (pageName) {
		case "14 DAYS":
			getNFKiosHomepageLastreadingdetail14dayBtn().waitForPresent();
			getNFKiosHomepageLastreadingdetail14dayBtn().click();

			break;
		case "30 DAYS":
			getNFKiosHomepageLastreadingdetail30dayBtn().waitForPresent();
			getNFKiosHomepageLastreadingdetail30dayBtn().click();

			break;

		case "90 DAYS":
			getNFKiosHomepageLastreadingdetail90dayBtn().waitForPresent();
			getNFKiosHomepageLastreadingdetail90dayBtn().click();

			break;
		}

	}

	// Method to verify recent event values on recent event tab on home screen
	public void verifyRecentEventDetails(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		WebDriverTestCase.verifyTrue(
				getNFKiosHomepageRecenteventvalueLbl().getAttribute("label").contains(eventBean.getAmount()),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + eventBean.getAmount());
		WebDriverTestCase.verifyTrue(
				getNFKiosHomepageRecenteventunitLbl().getAttribute("label").contains(eventBean.getUnit()),
				eventBean.getUnit() + "Expected unit not present", "Proper unit  " + eventBean.getUnit());
	}

	// Method to click on recent event button
	public void clickOnRecentEventBtn() {
		getNFKiosHomepageRecenteventimgBtn().verifyPresent("Last Sync");
		LFSUtilsIOS.click(getNFKiosHomepageRecenteventimgBtn());

	}

	// method to click on all event link and verify logbook element
	public void clickAllEventLink() {
		getNFKiosHomepageLastsyncwithmeterLbl().waitForPresent();
		Reporter.logWithScreenShot("Last Reading all event page is displayed", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosHomepageLastsyncwithmeterViewalleventLnk());

	}

	// Method to verify detail BG pop up from circle view
	public void verifyPeriodRusultPage() {
		getNFKiosHomepageLastreadingRecentBGDateRangePopup().waitForPresent();
		Point p1 = getNFKiosHomepageLastreadingRecentbgunitLbl().getLocation();
		int yunit = p1.getY();
		Point p2 = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getLocation();
		Dimension d2 = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getSize();
		int x30Day = p2.getX();
		int y30Day = p2.getY();
		int xmidddle30Day = x30Day + d2.getWidth() / 2;
		int yMiddleDonat = (yunit + y30Day) / 2;
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(lfs.getDriver());

		tch.tap(point(xmidddle30Day, yMiddleDonat)).perform();
		WebDriverTestCase.verifyTrue(getNFKiosHomepageLastreadingRecentBGPopup().isPresent(),
				"Period result page not displayed ", "Period result page displayed");

	}

	// Method to verify date range
	public void verifyPeriodDayViews() {
		getNFKiosHomepageLastreadingRecentBGDateRangePopup().waitForPresent();

		int todaydate = Integer.parseInt(LFSUtilsIOS.getCurrentDate());
		String currMonth = LFSUtilsIOS.getCurrentMonth().substring(0, 3);
		int currentMonth = Integer.parseInt(LFSUtilsIOS.monthIntValue(currMonth));

		int previoueMonth = 0;
		if (currentMonth == 1)
			previoueMonth = 12;
		else
			previoueMonth = currentMonth - 1;

		String prevMonth = LFSUtilsIOS.monthIntValue(previoueMonth + "");
		int lastdayPreviousMonth = Integer.parseInt(LFSUtilsIOS.monthNoOFDay(prevMonth).replaceAll("[^0-9]", ""));

		// 14 day
		click14_30_90Day("14 DAYS");
		String dateRange = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getAttribute("label");
		String Date[] = (dateRange.split("-"));
		if (todaydate < 14) {
			int extraday = 14 - todaydate;

			int calstartDay = lastdayPreviousMonth - extraday + 1;
			String date1 = "" + calstartDay;
			WebDriverTestCase.verifyTrue(Date[0].contains(date1), "Expected " + date1 + "   Actual " + Date[0],
					"Starting date displayed" + date1);
			WebDriverTestCase.verifyTrue(
					Date[1].contains(ConfigurationManager.getBundle().getString("appCommon.today")), "Expected "
							+ ConfigurationManager.getBundle().getString("appCommon.today") + "   Actual " + Date[1],
					"Today displayed");

		} else {
			int calstartDay = todaydate - 14 + 1;
			String date1 = "" + calstartDay;
			WebDriverTestCase.verifyTrue(Date[0].contains(date1), "Expected " + date1 + "   Actual " + Date[0],
					"Starting date displayed" + date1);

		}

		// 30 day
		click14_30_90Day("30 DAYS");
		dateRange = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getAttribute("label");
		String Date1[] = (dateRange.split("-"));
		if (todaydate < 30) {
			int extraday = 30 - todaydate;
			int calstartDay = lastdayPreviousMonth - extraday + 1;
			String date1 = "" + calstartDay;
			WebDriverTestCase.verifyTrue(Date1[0].contains(date1), "Expected " + date1 + "   Actual " + Date1[0],
					"Starting date displayed" + date1);

		} else {
			int calstartDay = todaydate - 30 + 1;
			String date1 = "" + calstartDay;
			WebDriverTestCase.verifyTrue(Date1[0].contains(date1), "Expected " + date1 + "   Actual " + Date1[0],
					"Starting date displayed" + date1);

		}

		// 90 day
		click14_30_90Day("90 DAYS");
		dateRange = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getAttribute("label");
		String Date2[] = (dateRange.split("-"));
		int previousMonth1 = 0;
		if (previoueMonth == 1)
			previousMonth1 = 12;
		else
			previousMonth1 = previoueMonth - 1;
		String prevMonth1 = LFSUtilsIOS.monthIntValue(previousMonth1 + "");
		int lastdayMonth1 = Integer.parseInt(LFSUtilsIOS.monthNoOFDay(prevMonth1));
		int totalDay = todaydate + lastdayPreviousMonth + lastdayMonth1;
		if (totalDay < 90) {
			int remainingDay = 90 - totalDay;
			int previousMonth2 = 0;
			if (previousMonth1 == 1)
				previousMonth2 = 12;
			else
				previousMonth2 = previousMonth1 - 1;

			String prevMonth2 = LFSUtilsIOS.monthIntValue(previousMonth2 + "");
			int lastdayMonth2 = Integer.parseInt(LFSUtilsIOS.monthNoOFDay(prevMonth2));

			int calstartDay = lastdayMonth2 - remainingDay + 1;
			String date1 = "" + calstartDay;
			WebDriverTestCase.verifyTrue(Date2[0].contains(date1), "Expected " + date1 + "   Actual " + Date2[0],
					"Starting date displayed" + date1);

		} else {

			int calstartDay = totalDay - 90 + 1;
			String date1 = "" + calstartDay;
			WebDriverTestCase.verifyTrue(Date2[0].contains(date1), "Expected " + date1 + "   Actual " + Date2[0],
					"Starting date displayed" + date1);

		}

	}

	// Method to verify last reading screen
	public void verifyAllLastReadignWithNoReading() {
		click14_30_90Day("14 DAYS");
		getNFKiosHomepageAddedEventDynamicLbl("---").verifyPresent("NAN 14 day view");
		getNFKiosHomepageLastReadingNoavarageLbl().verifyPresent("No avarage label on 14 day view screen");
		click14_30_90Day("30 DAYS");
		getNFKiosHomepageAddedEventDynamicLbl("---").verifyPresent("NAN 30 day view");
		getNFKiosHomepageLastReadingNoavarageLbl().verifyPresent("No avarage label on 14 day view screen");
		click14_30_90Day("90 DAYS");
		getNFKiosHomepageAddedEventDynamicLbl("---").verifyPresent("NAN 90 day view");
		getNFKiosHomepageLastReadingNoavarageLbl().verifyPresent("No avarage label on 14 day view screen");
	}

	// Method to click on readings on last reading screen
	public void clickReadingButtonLastreadingPage() {
		getNFKiosHomepageLastreadingsdetailBtn().waitForPresent();
		LFSUtilsIOS.click(getNFKiosHomepageLastreadingsdetailBtn());
		Reporter.logWithScreenShot("Event page is displayed", MessageTypes.Pass);
	}

	public void verifyDeletedBGAfterDeletion(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		getNFKiosHomepageAddedEventDynamicLbl(eventBean.getAmount()).verifyNotPresent("Added BG deleted successfuly");
	}

	public void deleteAllEvents() {
		int count = 0;
		int count1 = 0;
		try {
			int cons = getONFKiosHomepageAddedEventValueLbl().size();
			for (int i = 0; i < getONFKiosHomepageAddedEventValueLbl().size(); i++) {
				if (LFSUtilsIOS.tryMethod(getONFKiosHomepageAddedEventValueLbl().get(i))) {
					getONFKiosHomepageAddedEventValueLbl().get(i).click();
					EventLogPageIOS logbook = new EventLogPageIOS();
					logbook.verifyDeleteEventButton();
					logbook.clickSelectedEventDeleteButton();
					cons--;
				}
				count1++;
				if (count == cons || count1 == 10)
					break;
			}
		} catch (Exception e) {
		}

	}

	// Method to click on donat circle
	// Milan
	public void clickOnDonatCircle() {
		Point p1 = getNFKiosHomepageLastreadingRecentbgunitLbl().getLocation();
		int yunit = p1.getY();

		Point p2 = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getLocation();
		Dimension d2 = getNFKiosHomepageLastreadingRecentBGDateRangePopup().getSize();
		int x30Day = p2.getX();
		int y30Day = p2.getY();
		int xmidddle30Day = x30Day + d2.getWidth() / 2;
		int yMiddleDonat = (yunit + y30Day) / 2;

		LFSUtilsIOS lfs = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(point(xmidddle30Day, yMiddleDonat)).perform();
	}

	// Method to verify period result pop up range
	// Milan
	public void verifyOverallRangeonDonutPopUp() {
		clickOnDonatCircle();
		String lowRange = ConfigurationManager.getBundle().getProperty("Low.BG.Range.Value").toString();
		String highRange = ConfigurationManager.getBundle().getProperty("Low.BG.Range.Value").toString();

		WebDriverTestCase.verifyTrue(
				getNFKiosHomepageLastreadingDonatOverallrangeLbl().getAttribute("label").contains(lowRange),
				"Incorrect low range ", "Correcct low range");
		WebDriverTestCase.verifyTrue(
				getNFKiosHomepageLastreadingDonatOverallrangeLbl().getAttribute("label").contains(highRange),
				"Incorrect high range ", "Correcct high range");
	}

	// Sangram

	public void verifyReadingsPerDay() {
		getNFKiosHomepageReadingsPerDayTxt().waitForPresent();
		Reporter.logWithScreenShot(
				"per day value in label" + getNFKiosHomepageReadingsPerDayTxt().getAttribute("name"));
		if (getNFKiosHomepageReadingsPerDayTxt().getAttribute("value").contains("0.")) {
			Reporter.logWithScreenShot(
					"per day value in label" + getNFKiosHomepageReadingsPerDayTxt().getAttribute("label"));
			Reporter.logWithScreenShot("Readings per day has value in decimal", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Readings per day is missing", MessageTypes.Fail);
		}
		String readingPerDay[] = getNFKiosHomepageReadingsPerDayTxt().getAttribute("label").split("\\.");
		if (readingPerDay[1].length() == 1) {
			Reporter.logWithScreenShot("Displaying as per length", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Not displaying as per length", MessageTypes.Fail);
		}
	}

	public void verifyEventDateAsYesterDay() {
		WebDriverTestCase.verifyTrue(getNFKiosHomepageAddedEventDateLbl().get(0).getText().contains("Yesterday"),
				"Yesterday is not displaying", "Date showing as yesterday");
	}

	public void syncingAccount() {

		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,40%");
		params.put("end", "15%,60%");
		params.put("duration", "3");
		Object res = driver.executeScript("mobile:touch:swipe", params);
		Reporter.logWithScreenShot("Syncing with Account", MessageTypes.Pass);

	}

	public void verifyMyProgress(int date) {
		LFSUtilsIOS lfsUtilsIOS = new LFSUtilsIOS();

		switch (date) {

		case 7:
			LFSUtilsIOS.clickWithText("7");
			Reporter.logWithScreenShot("Selected the 7 day Range", MessageTypes.Pass);
			break;
		case 14:
			LFSUtilsIOS.clickWithText("14");
			Reporter.logWithScreenShot("Selected the 14 day Range", MessageTypes.Pass);
			break;

		case 30:
			LFSUtilsIOS.clickWithText("30");
			Reporter.logWithScreenShot("Slected the 30 day range", MessageTypes.Pass);
			break;
		case 60:
			LFSUtilsIOS.clickWithText("60");
			Reporter.logWithScreenShot("Selected the 60 day range", MessageTypes.Pass);
			break;
		case 90:
			LFSUtilsIOS.clickWithText("90");
			Reporter.logWithScreenShot("Selected the 90 day range", MessageTypes.Pass);
			break;

		default:
			Reporter.logWithScreenShot("Invalid Number of days is passed", MessageTypes.Pass);
			break;
		}
	}

	// Verify Carbs after adding value
	public void verifyAddedCarbs() {
		SettingsPageIOS mySettingsPageIOS = new SettingsPageIOS();
		mySettingsPageIOS.getNFKiossettingpageStaticTextlbl(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
		mySettingsPageIOS.getNFKiosSettingspageCarbsGoalTxt(LFSUtilsIOS.getPropString("log.type.carbs")).isDisplayed();
		mySettingsPageIOS.getNFKiosSettingspageCarbsGoalTxt(LFSUtilsIOS.getPropString("log.type.carbs")).click();
	}

	// Verify Activity after adding value
	public void verifyAddedActivity() {
		SettingsPageIOS mySettingsPageIOS = new SettingsPageIOS();
		mySettingsPageIOS.getNFKiossettingpageStaticTextlbl(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
		mySettingsPageIOS.getNFKiosSettingspageActivityGoalTxt(LFSUtilsIOS.getPropString("more.general.activity"))
				.isDisplayed();
		mySettingsPageIOS.getNFKiosSettingspageActivityGoalTxt(LFSUtilsIOS.getPropString("more.general.activity"))
				.click();

	}

	public void clickonMyProgress() {
		try {
			getNFKiosHomepageMyprogressBtn().isPresent();
			getNFKiosHomepageMyprogressBtn().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Reporter.logWithScreenShot("Clicked on My Progress report", MessageTypes.Pass);
		// application wiats for 5 mins
		try {
			Thread.sleep(300000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eventsVerify() {
		try {
			EventLogPageIOS logbook = new EventLogPageIOS();
			logbook.getNFKiosHomepageActivityBtn().verifyNotVisible("Ativity event");
			logbook.getNFKiosHomepageCarbBtn().verifyNotVisible("Carbs event");
			Reporter.logWithScreenShot("User verified add an event screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify add an event screen", MessageTypes.Fail);
		}
	}

	public void clickPairbtn() {
		getNFKiosSensorSessoinTitle().isPresent();
		if (getNFKiosPairBtn().isPresent()) {
			getNFKiosPairBtn().click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("User has clicked on Pair sensor button", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Pair Sensor button not visible", MessageTypes.Fail);
		}
	}

	public void verifyAddEvents() {
		getNFKHomepageActivityBtn().waitForPresent();
		getNFKHomepageActivityBtn().assertPresent("Add Activity Button is present");
		getNFKHomepageCarbBtn().assertPresent("Carbs Button is present");
		getNFKHomepageInsulinBtn().assertPresent("Insulin Button is present");
		getNFKHomepageNoteBtn().assertPresent("Note Button is present");
	}

	public void verifyEmptyHomeScreen() {
		Assert.assertEquals(getNFKiosHomepageBannerMsgLbl().getText(),
				LFSUtilsIOS.getPropString("home.no.alert.alarm.banner"));
		Assert.assertEquals(getNFKioshomepageSensorTitle().getText(),
				LFSUtilsIOS.getPropString("home.start.sensor.title"));
		Assert.assertEquals(getNFKioshomepageSensorHowtoapplyBtn().getText(),
				LFSUtilsIOS.getPropString("home.how.apply.sensor"));
		Assert.assertEquals(getNFKioshomepageSensorDescpLbl().getText(), LFSUtilsIOS.getPropString("home.sensor.msg"));
		getNFKiosHomepageHomeBtn().isPresent();
		getNFKiosHomepageAddEventBtn().isPresent();
		getNFKiosHomepageMyprogressBtn().isPresent();
		getNFKiosHomepageMoreBtn().isPresent();
		Reporter.logWithScreenShot("User has verified the Empty Home screen", MessageTypes.Pass);
	}

	// CGM Automation

	public void clickOnHomeTab() {
		try {
			getNFKiosHomepageHomeBtn().click();
			Reporter.logWithScreenShot("User clicked on Home tab", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("User not able to click on Home tab", MessageTypes.Fail);
		}
	}

	public void verifyHomeScreenAfterUnpairingSensor() {
		SensorPairPageIOS sensorPage = new SensorPairPageIOS();
		getNFKiosHomepageConnectToSensorTitle().verifyPresent("Connect to sensor title");
		getNFKiosHomepagCconnectToSensorDescription().verifyPresent("Connect to pair description");
		getNFKiosHomepageConnectToSensorPairButton().verifyPresent("Pair Sensor button");
		Reporter.logWithScreenShot("User verified home screen after unpairing sensor", MessageTypes.Pass);
		verifyConnectToSensorPopup();
		getNFKiosHomepageConnectToSensorPopupRepairSensorButton().click();
		getNFKiosHomepageRepairScreenRepairSensorBtn().verifyPresent();
		getNFKiosHomepageRepairScreenCancelBtn().click();
		getNFKiosHomepageConnectToSensorPairButton().click();
		getNFKiosHomepageConnectToSensorPopupPairSensorButton().click();
		sensorPage.getNFKiosApplysensorTitle().verifyPresent("Apply sensor screen title");
		Reporter.logWithScreenShot("User redirected to apply sensor screen", MessageTypes.Pass);
		sensorPage.getNFKiosSensorpairingCancelBtn().click();
		getNFKiosHomepageConnectToSensorPairButton().click();
		getNFKiosHomepageConnectToSensorPopupCancelButton().click();
	}

	public void verifyConnectToSensorPopup() {
		getNFKiosHomepageConnectToSensorPairButton().click();
		getNFKiosHomepageConnectToSensorPopupRepairSensorButton().verifyPresent("Re-Pair Button");
		getNFKiosHomepageConnectToSensorPopupPairSensorButton().verifyPresent("Pair Button");
		getNFKiosHomepageConnectToSensorPopupCancelButton().verifyPresent("Cancel button");

	}

	public void clickonPairsensorOption() {
		getNFKiosHomepagePairSensorBtn().isPresent();
		getNFKiosHomepagePairSensorBtn().click();
	}

	public void verifyhomescreen() {
		try {
			getNFKiosHomepageStaticTextlbl(LFSUtilsIOS.getPropString("home.noAlert.banner")).verifyPresent("No Alerts");
			getNFKiosHomepagewarmupcountdownimg().isDisplayed();
			getNFKiosHomepageStaticTextlbl(LFSUtilsIOS.getPropString("home.sensor.text"))
					.verifyPresent("While your sensor is warming up");
			getNFKiosHomepageappTourbtn().assertPresent("satrt tour");
			Reporter.logWithScreenShot("User successfully verified home screen while warm up", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify home screen while warm up", MessageTypes.Fail);
		}
	}

	public void verifySensorWarmupAlertAndClose() {
		try {
			getNFKiosHomepagewarmuptitle().assertPresent("Sensor Warming Up");
			getNFKiosHomepageStaticTextlbl(LFSUtilsIOS.getPropString("warmup.text"))
					.verifyPresent("You won't get sensor");
			getNFKiosHomepagewarmupOkbtn().assertPresent("OK");
			LFSUtilsIOS.click(getNFKiosHomepagewarmupOkbtn());
			Reporter.logWithScreenShot("User successfully verified warm up popup and close", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify warm up popup and close", MessageTypes.Fail);
		}
	}

	public void verifyiICOnscreen() {
		try {
			LFSUtilsIOS.click(getNFKiosHomepageiiconbtn());
			getNFKiosHomepageiicontitle().assertPresent("Sensor Warming Up");
			getNFKiosHomepageStaticTextlbl(LFSUtilsIOS.getPropString("home.sensor.iIconscreen.text"))
					.verifyPresent("Each time you apply a new sensor");
			LFSUtilsIOS.click(getNFKiosHomepageiiconscreenXbtn());
			Reporter.logWithScreenShot("User successfully clicked on i icon and verified sideup screen",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on i icon and verify sideup screen", MessageTypes.Fail);
		}
	}

	public void clickapptour() {
		LFSUtilsIOS.click(getNFKiosHomepageappTourbtn());
		Reporter.logWithScreenShot("User successfully clicked start tour option", MessageTypes.Pass);

	}
}
