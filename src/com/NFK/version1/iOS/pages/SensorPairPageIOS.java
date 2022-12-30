package com.NFK.version1.iOS.pages;

import java.util.List;

import org.openqa.selenium.By;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.SensorPairBean;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class SensorPairPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	MoremenuPageIOS moreMenuPage = new MoremenuPageIOS();

	@FindBy(locator = "NFKios.homescreen.pairsensor.btn")
	private QAFWebElement NFKiosHomescreenPairsensorBtn;
	
	@FindBy(locator = "NFKios.sensorpairpage.title")
	private QAFWebElement NFKiosSensorpairpageTitle;
	@FindBy(locator = "NFKios.sensorpairpage.sensor.skip.btn")
	private QAFWebElement NFKiosSensorpairpageSensorSkipBtn;
	@FindBy(locator = "NFKios.sensorpairpage.code.all.field")
	private QAFWebElement NFKiosSensorpairpageCodeAllField;
	@FindBy(locator = "NFKios.sensorpairpage.code.first.field")
	private QAFWebElement NFKiosSensorpairpageCodeFirstField;
	@FindBy(locator = "NFKios.sensorpairpage.code.second.field")
	private QAFWebElement NFKiosSensorpairpageCodeSecondField;
	@FindBy(locator = "NFKios.sensorpairpage.code.third.field")
	private QAFWebElement NFKiosSensorpairpageCodeThirdField;
	@FindBy(locator = "NFKios.sensorpairpage.code.fourth.field")
	private QAFWebElement NFKiosSensorpairpageCodeFourthField;
	@FindBy(locator = "NFKios.sensorpairpage.code.fifth.field")
	private QAFWebElement NFKiosSensorpairpageCodeFifthField;
	@FindBy(locator = "NFKios.sensorpairpage.code.sixth.field")
	private QAFWebElement NFKiosSensorpairpageCodeSixthField;
	@FindBy(locator = "NFKios.sensorpairpage.code.seventh.field")
	private QAFWebElement NFKiosSensorpairpageCodeSeventhField;
	@FindBy(locator = "NFKios.sensorpairpage.next.button")
	private QAFWebElement NFKiosSensorpairpageNextButton;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.title")
	private QAFWebElement NFKiosSensorpairpageApplysensorTitle;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.next.button")
	private QAFWebElement NFKiosSensorpairpageApplysensorNextButton;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.back.button")
	private QAFWebElement NFKiosSensorpairpageApplysensorBackButton;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.rightabdomen.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorRightabdomenBtn;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.leftabdomen.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorLeftabdomenBtn;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.leftarm.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorLeftarmBtn;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.rightarm.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorRightarmBtn;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.howtoapply.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorHowtoapplyBtn;
	@FindBy(locator = "NFKios.sensorpairpage.applysensor.footer.lbl")
	private QAFWebElement NFKiosSensorpairpageApplysensorFooterLbl;
	@FindBy(locator = "NFKios.Sensorpairing.Stopsensor")
	private List<QAFWebElement> NFKiosSensorpairingStopsensor;
	@FindBy(locator = "NFKios.Sensorpairing.CancelBtn")
	private QAFWebElement NFKiosSensorpairingCancelBtn;
	@FindBy(locator = "NFKios.Sensorpairing.Link")
	private QAFWebElement NFKiosSensorpairingLink;

	@FindBy(locator = "NFKios.apply.sensor.back.btn")
	private QAFWebElement NFKiosApplysensorbackbtn;
	@FindBy(locator = "NFKios.homepage.banner.msg.lbl")
	private QAFWebElement NFKiosSensorHomepageBanner;

	@FindBy(locator = "NFKios.SensorHomepage.reading")
	private QAFWebElement NFKiosSensorHomepageReading;
	@FindBy(locator = "NFKios.Sensorexpiration.logo")
	private QAFWebElement NFKiosSensorexpirationLogo;
	@FindBy(locator = "NFKios.Sensorpairing.startPairing.cancel.btn")
	private QAFWebElement NFKiosSensorpairingStartPairingCancelBtn;
	@FindBy(locator = "NFKios.Sensorpairing.startPairing.tryAgain.btn")
	private QAFWebElement NFKiosSensorpairingStartPairingTryAgainBtn;
	public QAFWebElement getNFKiosSensorpairingStartPairingTryAgainBtn() {
		return NFKiosSensorpairingStartPairingTryAgainBtn;
	}
	public QAFWebElement getNFKiosSensorpairingStartPairingCancelBtn() {
		return NFKiosSensorpairingStartPairingCancelBtn;   
	}
	@FindBy(locator = "NFKios.Sensorpairing.nextbtn")
	private QAFWebElement NFKiosSensorpairingNextbtn;
	@FindBy(locator = "NFKios.Sensorpairing.continuebtn")
	private QAFWebElement NFKiosSensorpairingContinuebtn;
	@FindBy(locator = "NFKios.Sensorpairing.hompage.readings")
	private QAFWebElement NFKiosSensorpairingHompageReadings;
	@FindBy(locator = "NFKios.Sensorpairing.hompage.readingunit")
	private QAFWebElement NFKiosSensorpairingHompageReadingunit;
	@FindBy(locator = "NFKios.Sensorpairing.hompage.expirecntdwn")
	private QAFWebElement NFKiosSensorpairingHompageExpirecntdwn;
	@FindBy(locator = "NFKios.Sensorpairing.upairSensor.title")
	private QAFWebElement NFKiosSensorpairingUpairSensorTitle;
	@FindBy(locator = "NFKios.Sensorpairing.upairSensor.header")
	private QAFWebElement NFKiosSensorpairingupairSensorHeader;
	@FindBy(locator = "NFKios.Sensorpairing.upairSensor.description")
	private QAFWebElement NFKiosSensorpairingUpairSensorDescription;
	@FindBy(locator = "NFKios.Sensorpairing.upairSensor.pairingcode")
	private QAFWebElement NFKiosSensorpairingUpairSensorPairingcode;
	@FindBy(locator = "NFKios.Sensorpairing.upairSensor.unpairbtn")
	private QAFWebElement NFKiosSensorpairingUpairSensorUnpairbtn;
	@FindBy(locator = "NFKios.Sensorpairing.upairSensor.cancelbtn")
	private QAFWebElement NFKiosSensorpairingUpairSensorCancelbtn;
	@FindBy(locator = "NFKios.Sensor.highalert.banner")
	private QAFWebElement NFKiosSensorHighalertBanner;

	public QAFWebElement getNFKiosSensorHighalertBanner() {
		return NFKiosSensorHighalertBanner;
	}

	public QAFWebElement getNFKiosSensorpairingNextbtn() {
		return NFKiosSensorpairingNextbtn;
	}

	public QAFWebElement getNFKiosSensorpairingContinuebtn() {
		return NFKiosSensorpairingContinuebtn;
	}

	public QAFWebElement getNFKiosSensorppageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.sensor.static.lbl", text);
	}

	public QAFWebElement getNFKiosSensorpairingHompageReadings() {
		return NFKiosSensorpairingHompageReadings;
	}

	public QAFWebElement getNFKiosSensorpairingHompageReadingunit() {
		return NFKiosSensorpairingHompageReadingunit;
	}

	public QAFWebElement getNFKiosSensorpairingHompageExpirecntdwn() {
		return NFKiosSensorpairingHompageExpirecntdwn;
	}

	public QAFWebElement getNFKiosSensorpairingUpairSensorTitle() {
		return NFKiosSensorpairingUpairSensorTitle;
	}

	public QAFWebElement getNFKiosSensorpairingupairSensorHeader() {
		return NFKiosSensorpairingupairSensorHeader;
	}

	public QAFWebElement getNFKiosSensorpairingUpairSensorDescription() {
		return NFKiosSensorpairingUpairSensorDescription;
	}

	public QAFWebElement getNFKiosSensorpairingUpairSensorPairingcode() {
		return NFKiosSensorpairingUpairSensorPairingcode;
	}

	public QAFWebElement getNFKiosSensorpairingUpairSensorUnpairbtn() {
		return NFKiosSensorpairingUpairSensorUnpairbtn;
	}

	public QAFWebElement getNFKiosSensorpairingUpairSensorCancelbtn() {
		return NFKiosSensorpairingUpairSensorCancelbtn;
	}
	
	public QAFWebElement getNFKiosHomescreenPairsensorBtn() {
		return NFKiosHomescreenPairsensorBtn;
	}
	
	

	public QAFWebElement getNFKiosSensorexpirationLogo() {
		return NFKiosSensorexpirationLogo;
	}

	public QAFWebElement getNFKiosSensorHomepageReading() {
		return NFKiosSensorHomepageReading;
	}

	public QAFWebElement getNFKiosSensorHomepageBanner() {
		return NFKiosSensorHomepageBanner;
	}

	public QAFWebElement getNFKiosApplysensorbackbtn() {
		return NFKiosApplysensorbackbtn;
	}

	@FindBy(locator = "NFKios.apply.sensor.title")
	private QAFWebElement NFKiosApplysensorTitle;

	public QAFWebElement getNFKiosApplysensorTitle() {
		return NFKiosApplysensorTitle;
	}

	@FindBy(locator = "NFKios.apply.sensor.text1")
	private QAFWebElement NFKiosApplysensorText1;

	public QAFWebElement getNFKiosApplysensorText1() {
		return NFKiosApplysensorText1;
	}

	@FindBy(locator = "NFKios.apply.sensor.how.to.apply.sensor.link")
	private QAFWebElement NFKiosApplysensorHowtoapplysensorlink;

	public QAFWebElement getNFKiosApplysensorHowtoapplysensorlink() {
		return NFKiosApplysensorHowtoapplysensorlink;
	}

	@FindBy(locator = "NFKios.apply.sensor.text2")
	private QAFWebElement NFKiosApplysensorText2;

	public QAFWebElement getNFKiosApplysensorText2() {
		return NFKiosApplysensorText2;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.scrn.back.btn")
	private QAFWebElement NFKioshowtoapplysenorbackbtn;

	public QAFWebElement getNFKioshowtoapplysenorbackbtn() {
		return NFKioshowtoapplysenorbackbtn;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.title")
	private QAFWebElement NFKioshowtoapplysensorTitle;

	public QAFWebElement getNFKioshowtoapplysensorTitle() {
		return NFKioshowtoapplysensorTitle;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.pair.btn")
	private QAFWebElement NFKioshowtoapplysensorpairbtn;

	public QAFWebElement getNFKioshowtoapplysensorpairbtn() {
		return NFKioshowtoapplysensorpairbtn;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.helpful.tips.link")
	private QAFWebElement NFKioshowtoapplysensorhelpfultiplink;

	public QAFWebElement getNFKioshowtoapplysensorhelpfultiplink() {
		return NFKioshowtoapplysensorhelpfultiplink;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.helpful.tips.title")
	private QAFWebElement NFKioshowtoapplysensorhelpfultiplinktitle;

	public QAFWebElement getNFKioshowtoapplysensorhelpfultiplinktitle() {
		return NFKioshowtoapplysensorhelpfultiplinktitle;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.helpful.tips.screen.X.btn")
	private QAFWebElement NFKioshowtoapplysensorhelpfultiplinkXbtn;

	public QAFWebElement getNFKioshowtoapplysensorhelpfultiplinkXbtn() {
		return NFKioshowtoapplysensorhelpfultiplinkXbtn;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.left.buttock.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorleftButtockBtn;

	public QAFWebElement getNFKiosSensorpairpageApplysensorleftButtockBtn() {
		return NFKiosSensorpairpageApplysensorleftButtockBtn;
	}

	@FindBy(locator = "NFKios.how.to.apply.sensor.right.buttock.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorrightButtockBtn;

	public QAFWebElement getNFKiosSensorpairpageApplysensorrightButtockBtn() {
		return NFKiosSensorpairpageApplysensorrightButtockBtn;
	}

	@FindBy(locator = "NFKios.Sensorexpiration.popup.title")
	private QAFWebElement NFKiosSensorexpirationpopupTitle;

	public QAFWebElement getNFKiosSensorexpirationpopupTitle() {
		return NFKiosSensorexpirationpopupTitle;
	}

	@FindBy(locator = "NFKios.Sensorexpiration.2hrpopup.desc")
	private QAFWebElement NFKiosSensorexpiration2hrpopupDesc;

	public QAFWebElement getNFKiosSensorexpiration2hrpopupDesc() {
		return NFKiosSensorexpiration2hrpopupDesc;
	}

	@FindBy(locator = "NFKios.Sensorexpiration.ok.btn")
	private QAFWebElement NFKiosSensorexpirationOkBtn;

	public QAFWebElement getNFKiosSensorexpirationOkBtn() {
		return NFKiosSensorexpirationOkBtn;
	}

	@FindBy(locator = "NFKios.Sensorpairing.changesetting.settings")
	private QAFWebElement NFKiosSensorpairingChangesettingSettings;

	public QAFWebElement getNFKiosSensorpairingChangesettingSettings() {
		return NFKiosSensorpairingChangesettingSettings;
	}

	@FindBy(locator = "NFKios.Sensorpairing.changesetting.notnow")
	private QAFWebElement NFKiosSensorpairingChangesettingNotnow;

	public QAFWebElement getNFKiosSensorpairingChangesettingNotnow() {
		return NFKiosSensorpairingChangesettingNotnow;
	}

	public QAFWebElement getNFKiosSensorpairpageTitle() {
		return NFKiosSensorpairpageTitle;
	}

	public QAFWebElement getNFKiosSensorpairpageSensorSkipBtn() {
		return NFKiosSensorpairpageSensorSkipBtn;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeAllField() {
		return NFKiosSensorpairpageCodeAllField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeFirstField() {
		return NFKiosSensorpairpageCodeFirstField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeSecondField() {
		return NFKiosSensorpairpageCodeSecondField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeThirdField() {
		return NFKiosSensorpairpageCodeThirdField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeFourthField() {
		return NFKiosSensorpairpageCodeFourthField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeFifthField() {
		return NFKiosSensorpairpageCodeFifthField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeSixthField() {
		return NFKiosSensorpairpageCodeSixthField;
	}

	public QAFWebElement getNFKiosSensorpairpageCodeSeventhField() {
		return NFKiosSensorpairpageCodeSeventhField;
	}

	public QAFWebElement getNFKiosSensorpairpageNextButton() {
		return NFKiosSensorpairpageNextButton;

	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorTitle() {
		return NFKiosSensorpairpageApplysensorTitle;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorNextButton() {
		return NFKiosSensorpairpageApplysensorNextButton;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorBackButton() {
		return NFKiosSensorpairpageApplysensorBackButton;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorRightabdomenBtn() {
		return NFKiosSensorpairpageApplysensorRightabdomenBtn;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorLeftabdomenBtn() {
		return NFKiosSensorpairpageApplysensorLeftabdomenBtn;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorLeftarmBtn() {
		return NFKiosSensorpairpageApplysensorLeftarmBtn;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorRightarmBtn() {
		return NFKiosSensorpairpageApplysensorRightarmBtn;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorHowtoapplyBtn() {
		return NFKiosSensorpairpageApplysensorHowtoapplyBtn;
	}

	public QAFWebElement getNFKiosSensorpairpageApplysensorFooterLbl() {
		return NFKiosSensorpairpageApplysensorFooterLbl;
	}

	public List<QAFWebElement> getNFKiosSensorpairingStopsensor() {
		return NFKiosSensorpairingStopsensor;
	}

	public QAFWebElement getNFKiosSensorpairingCancelBtn() {
		return NFKiosSensorpairingCancelBtn;
	}

	public QAFWebElement getNFKiosSensorpairingLink() {
		return NFKiosSensorpairingLink;
	}

	@FindBy(locator = "NFKios.Sensorpairing.sensor.expiryLessthan16days.popup")
	private QAFWebElement NFKiosSensorpairingSensorExpiryLessthan16daysPopup;

	public QAFWebElement getNFKiosSensorpairingSensorExpiryLessthan16daysPopup() {
		return NFKiosSensorpairingSensorExpiryLessthan16daysPopup;
	}

	@FindBy(locator = "NFKios.Sensorpairing.sensorwarm.title")
	private QAFWebElement NFKiosSensorpairingSensorwarmTitle;

	public QAFWebElement getNFKiosSensorpairingSensorwarmTitle() {
		return NFKiosSensorpairingSensorwarmTitle;
	}

	@FindBy(locator = "NFKios.Sensorpairing.sensorwarmup.ok")
	private QAFWebElement NFKiosSensorpairingSensorwarmupOk;

	public QAFWebElement getNFKiosSensorpairingSensorwarmupOk() {
		return NFKiosSensorpairingSensorwarmupOk;
	}

	@FindBy(locator = "NFKios.SensorExpirationCountDown.periodLabel")
	private QAFWebElement NFKiosSensorExpirationCountDownPeriodLabel;

	public QAFWebElement getNFKiosSensorExpirationCountDownPeriodLabel() {
		return NFKiosSensorExpirationCountDownPeriodLabel;
	}

	@FindBy(locator = "NFKios.Sensorpairing.pushnotification.LowAlert")
	private QAFWebElement NFKiosSensorpairingPushnotificationLowAlert;

	public QAFWebElement getNFKiosSensorpairingPushnotificationLowAlert() {
		return NFKiosSensorpairingPushnotificationLowAlert;
	}

	@FindBy(locator = "NFKios.homepage.title.lbl")
	private QAFWebElement NFKiosHomepageTitleLbl;

	public QAFWebElement getNFKiosHomepageTitleLbl() {
		return NFKiosHomepageTitleLbl;
	}

	@FindBy(locator = "NFKios.homepage.desc.lbl")
	private QAFWebElement NFKiosHomepageDescLbl;

	public QAFWebElement getNFKiosHomepageDescLbl() {
		return NFKiosHomepageDescLbl;
	}


	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	LFSUtilsIOS LfsiOS = new LFSUtilsIOS();

	public void selectBodyLocation(String location) {
		getNFKiosSensorpairpageApplysensorTitle().waitForPresent();
		getNFKiosSensorpairpageApplysensorTitle().isPresent();
		switch (location) {
		case "LEFTABDOMEN":
			getNFKiosSensorpairpageApplysensorLeftabdomenBtn().waitForPresent();
			LFSUtilsIOS.click(getNFKiosSensorpairpageApplysensorLeftabdomenBtn());
			break;

		case "RIGHTABDOMEN":
			getNFKiosSensorpairpageApplysensorRightabdomenBtn().waitForPresent();
			LFSUtilsIOS.click(getNFKiosSensorpairpageApplysensorRightabdomenBtn());

		case "LEFTARM":
			getNFKiosSensorpairpageApplysensorLeftarmBtn().waitForPresent();
			LFSUtilsIOS.click(getNFKiosSensorpairpageApplysensorLeftarmBtn());
			break;

		case "RIGHTARM":
			getNFKiosSensorpairpageApplysensorRightarmBtn().waitForPresent();
			LFSUtilsIOS.click(getNFKiosSensorpairpageApplysensorRightarmBtn());
			break;
		}
		Reporter.logWithScreenShot("selected the body location ", MessageTypes.Pass);
		getNFKiosSensorpairpageApplysensorNextButton().waitForEnabled();
		LFSUtilsIOS.click(getNFKiosSensorpairpageApplysensorNextButton());
	}

	public void connectingToSensor() {
		HomePageIOS homebtn = new HomePageIOS();
		try {
			// wait until sensor connects
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homebtn.getNFKiosHomepageHomeBtn().waitForVisible(1000);

	}


	public void verifyapplysensor() {
		getNFKiosApplysensorbackbtn().isPresent();
		getNFKiosApplysensorTitle().isDisplayed();
		getNFKiosApplysensorText1().isPresent();
		getNFKiosSensorpairpageApplysensorRightabdomenBtn().assertPresent("RightAbdomen");
		getNFKiosSensorpairpageApplysensorLeftabdomenBtn().assertPresent("leftAbdomen");
		getNFKiosSensorpairpageApplysensorRightarmBtn().assertPresent("rightarm");
		getNFKiosSensorpairpageApplysensorLeftarmBtn().assertPresent("Leftarm");
		;
		getNFKiosApplysensorHowtoapplysensorlink().assertPresent("");
		getNFKiosApplysensorText2().assertPresent();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
	}

	public void verifyapplysensor2to6yrold() {
		getNFKiosApplysensorbackbtn().isPresent();
		getNFKiosApplysensorTitle().isDisplayed();
		getNFKiosApplysensorText1().isPresent();
		getNFKiosSensorpairpageApplysensorrightButtockBtn().assertPresent("Rightbuttock");
		getNFKiosSensorpairpageApplysensorleftButtockBtn().assertPresent("leftbuttock");
		getNFKiosApplysensorHowtoapplysensorlink().assertPresent("");
		getNFKiosApplysensorText2().assertPresent();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
	}

	public void verifyhowtoapplysensorlink() {
		getNFKiosApplysensorHowtoapplysensorlink().click();
		getNFKioshowtoapplysenorbackbtn().isPresent();
		getNFKioshowtoapplysensorTitle().isDisplayed();
		getNFKioshowtoapplysensorpairbtn().isPresent();
		getNFKioshowtoapplysensorhelpfultiplink().isPresent();
		Reporter.logWithScreenShot("How to apply senor screen with images1", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		Reporter.logWithScreenShot("How to apply senor screen with images2", MessageTypes.Pass);
		getNFKioshowtoapplysenorbackbtn().click();
		LFSUtilsIOS.waitforLoad();
	}

	public void verifyhelpfultipslink() {
		MoremenuPageIOS more = new MoremenuPageIOS();
		getNFKiosApplysensorHowtoapplysensorlink().click();
		getNFKioshowtoapplysensorhelpfultiplink().waitForPresent();
		getNFKioshowtoapplysensorhelpfultiplink().click();
		Reporter.logWithScreenShot("HelpFul tips screen", MessageTypes.Pass);
		getNFKioshowtoapplysensorhelpfultiplinktitle().isPresent();
		getNFKioshowtoapplysensorhelpfultiplinkXbtn().isPresent();
		getNFKioshowtoapplysensorhelpfultiplinkXbtn().isEnabled();
		getNFKioshowtoapplysensorhelpfultiplinkXbtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("How to Apply screen", MessageTypes.Pass);
		getNFKioshowtoapplysenorbackbtn().click();

		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User is on apply sensor screen", MessageTypes.Pass);
	}

	// CGM Automation

	

	public void selectsNextButtonStartPairing() {
		try {
			getNFKiosSensorpairingNextbtn().click();
			Reporter.logWithScreenShot("User clicked on Next button", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on Next button", MessageTypes.Fail);
		}
	}

	public void clickOnContinueButton() {
		try {
			getNFKiosSensorpairingContinuebtn().click();
			Reporter.logWithScreenShot("User clicked on Continue button", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on Continue button", MessageTypes.Fail);
		}

	}

	public void verifyLowSensorReadingOnHomeScreen() {
		try {
			getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(3500000);
			if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
				LFSUtilsIOS.clickWithText("OK");
			}
			Reporter.logWithScreenShot("User able to see Low glucose readings", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see Low glucose readings", MessageTypes.Fail);
		}
	}

	public void verifySensorReadingOnHomeScreen() {
		try {
			getNFKiosSensorpairingHompageReadings().waitForPresent(350000);
			if (getNFKiosSensorpairingHompageReadings().isPresent()) {
				getNFKiosSensorpairingHompageReadingunit().isPresent();
				getNFKiosSensorpairingHompageExpirecntdwn().isPresent();
				Reporter.logWithScreenShot("User able to see glucose readings", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see glucose readings", MessageTypes.Fail);
		}
	}

	public void verifyHighGlucoseAlertOnHomeScreen() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(4500000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				LFSUtilsIOS.clickWithText("OK");
			}
			Reporter.logWithScreenShot("User able to see High glucose readings", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see high glucose readings", MessageTypes.Fail);
		}
	}
	public void verifyUnpairSensorScreen() {
		try {
			getNFKiosSensorpairingUpairSensorTitle().isPresent();
			getNFKiosSensorpairingupairSensorHeader().isPresent();
			getNFKiosSensorpairingUpairSensorDescription().isPresent();
			getNFKiosSensorpairingUpairSensorPairingcode().isPresent();
			getNFKiosSensorpairingUpairSensorUnpairbtn().isPresent();
			getNFKiosSensorpairingUpairSensorCancelbtn().isPresent();
			Reporter.logWithScreenShot("User verified unpair sensor screen", MessageTypes.Pass);
			getNFKiosSensorpairingUpairSensorUnpairbtn().click();
			moreMenuPage.getNFKiosMoremenuPageMydevicesBackBtn().click();
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to unpair sensor screen", MessageTypes.Fail);
		}
	}

	public void verifySensorExpiration24hrs() {
		getNFKiosSensorpairingHompageExpirecntdwn().isPresent();
		LFSUtilsIOS.click(getNFKiosSensorpairingHompageExpirecntdwn());
		getNFKiosSensorExpirationCountDownPeriodLabel().isPresent();
		if (getNFKiosSensorpairingHompageExpirecntdwn().getText().equals("24")) {
			Reporter.logWithScreenShot("Sensor expiration countdown is present", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sensor expiration countdown is present", MessageTypes.Fail);
		}
	}

	public void verifySensorExpiration() {
		getNFKiosSensorpairingHompageExpirecntdwn().isPresent();
		LFSUtilsIOS.click(getNFKiosSensorpairingHompageExpirecntdwn());
		getNFKiosSensorExpirationCountDownPeriodLabel().isPresent();
		if (getNFKiosSensorpairingHompageExpirecntdwn().isDisplayed()) {
			Reporter.logWithScreenShot("Sensor expiration countdown is present", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sensor expiration countdown is present", MessageTypes.Fail);
		}
	}

	public void closeSensorExpirePopup() {
		try {
			if (getNFKiosSensorpairingSensorExpiryLessthan16daysPopup().isDisplayed()) {
				LFSUtilsIOS.clickWithText("OK");
				Reporter.logWithScreenShot("Successfully closed sensor expiration alert", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Sensor expires alert not displayed", MessageTypes.Pass);
		}

	}

	public void verifySensorWarmupAlertAndClose() {
		try {
			if (getNFKiosSensorpairingSensorwarmTitle().getText().contains("Sensor Warming Up")) {
				getNFKiosSensorpairingSensorwarmupOk().isPresent();
				LFSUtilsIOS.click(getNFKiosSensorpairingSensorwarmupOk());
				Reporter.logWithScreenShot("Closed sensor warm up popup", MessageTypes.Pass);
				getNFKiosSensorpairingHompageReadings().waitForPresent(300000);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Sensor warm up popup not displayed", MessageTypes.Fail);
		}
	}

	public void verifyUrgentLowSensorReadingOnHomeScreen() {
		try {
			getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(300000);
			if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Urgent Low Sensor Alarm", MessageTypes.Pass);
				getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").click();
				driver.findElement(By.xpath("//*[@label='Open']")).click();
			}
			getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(200000);
			if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Urgent Low Glucose Sensor Alarm", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see Low Sensor readings", MessageTypes.Fail);
		}
	}

	public void verifyUrgentLowSensorReadingOnHomeScreenwithoutAck() {
		try {
			getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(3500000);
			if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Urgent Low glucose Alarm", MessageTypes.Pass);
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see Urgent Low glucose readings", MessageTypes.Fail);
		}
	}

	public void verifyUrgentLowSensorReadingNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(1800000);
			if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Urgent Low glucose Alarm", MessageTypes.Fail);
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("user not able to see Urgent Low glucose Alarm", MessageTypes.Pass);
		}
	}

	@FindBy(locator = "NFKios.Sensorpairing.startTour.btn")
	private QAFWebElement NFKiosSensorpairingStartTourBtn;

	public QAFWebElement getNFKiosSensorpairingStartTourBtn() {
		return NFKiosSensorpairingStartTourBtn;
	}

	public void clickOnStartTour() {
		getNFKiosSensorpairingStartTourBtn().click();
	}

	public void verifyAppTourButtonNotDisplayed() {
		if (!getNFKiosSensorpairingStartTourBtn().isPresent()) {
			Reporter.logWithScreenShot("App tour button not displayed on home screen", MessageTypes.Pass);
		}
	}

	public void verifySensorExpiration(String duration) {
		getNFKiosSensorexpirationpopupTitle().waitForPresent(720000);
		switch (duration) {
		case "2hr":
			if (getNFKiosSensorexpirationpopupTitle().isDisplayed()) {
				Reporter.logWithScreenShot("User able to see 2hr sensor expiration popup", MessageTypes.Pass);
				getNFKiosSensorexpirationOkBtn().click();
			} else {
				Reporter.logWithScreenShot("User not able to see 2hr sensor expiration popup", MessageTypes.Fail);
			}
			break;
		case "3days":
			if (getNFKiosSensorexpirationpopupTitle().isDisplayed()) {
				Reporter.logWithScreenShot("User able to see 2hr sensor expiration popup", MessageTypes.Pass);
				getNFKiosSensorexpirationOkBtn().click();
			} else {
				Reporter.logWithScreenShot("User not able to see 2hr sensor expiration popup", MessageTypes.Fail);
			}
			break;

		default:
			break;
		}

	}

	public void verifyHighReading() {
		try {
			getNFKiosSensorHomepageReading().waitForPresent(720000);
			if (getNFKiosSensorHomepageReading().isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High Alert Readings", MessageTypes.Pass);
				System.out.println(getNFKiosSensorHomepageReading().getText());
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see High Glucose Alert Readings", MessageTypes.Fail);
		}
	}

	public void VerifyAlertOnHomeScreen(String alertType) {
		switch (alertType) {
		case "High Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(4500000);
				if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
					LFSUtilsIOS.clickWithText("OK");
				}
				Reporter.logWithScreenShot("User able to see High glucose readings", MessageTypes.Pass);

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see high glucose readings", MessageTypes.Fail);
			}
			break;
		case "Low Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(54000);
				if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
					LFSUtilsIOS.clickWithText("OK");
				}
				Reporter.logWithScreenShot("User able to see Low glucose readings", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Low glucose readings", MessageTypes.Fail);
			}
			break;

		case "Urgent Low Glucose Alarm":
			try {
				getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(200000);
				if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Urgent Low Glucose Sensor Alarm", MessageTypes.Pass);
					
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Urgent Low Glucose Sensor Alarm", MessageTypes.Fail);
			}
			break;

		case "No Readings Alert":
			try {
				getNFKiosSensorppageStaticlabel("No Readings Alert").waitForPresent(200000);
				if (getNFKiosSensorppageStaticlabel("No Readings Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see No Readings Alert", MessageTypes.Pass);
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see No Readings Alert", MessageTypes.Fail);
			}
			break;
		default:
			break;
		}
	}

	public void verifyAlertOnPushNotification(String NotificationType) {
		switch (NotificationType) {
		case "High Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(960000);
				if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see High Glucose Alert Notification", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("High Glucose Alert").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
					LFSUtilsIOS.waitforLoad();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see High Glucose Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Sensor Expiring":
			try {
				getNFKiosSensorppageStaticlabel("Sensor Expiring").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Sensor Expiring").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Sensor Expiration Notification", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Sensor Expiring").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Sensor Expiration Notification", MessageTypes.Fail);
			}
			break;
		case "No Readings Alert":
			try {
				getNFKiosSensorppageStaticlabel("No Readings Alert").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("No Readings Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see No reading Alert Notification", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("No Readings Alert").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
					LFSUtilsIOS.waitforLoad();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Urgent Low Glucose Alarm":
			try {
				getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Urgent Low Glucose Alarm Notification",
							MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Low Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see low Glucose Alert Notification", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Low Glucose Alert").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Low Glucose Alert Notification", MessageTypes.Fail);
			}
			break;
		case "BluetoothOff":
			try {
				getNFKiosSensorppageStaticlabel("Bluetooth").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Bluetooth").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Bluetooth Off Notification", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Bluetooth").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Bluetooth Off Notification", MessageTypes.Fail);
			}
			break;
		case "Sensor Warmup Complete":
			try {
				getNFKiosSensorppageStaticlabel("Sensor Warmup Complete").waitForPresent(180000);
				if (getNFKiosSensorppageStaticlabel("Sensor Warmup Complete").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Sensor Warmup Alert Notification", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Sensor Warmup Complete").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Sensor Warmup Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Missed Alert":
			
			try {
				getNFKiosSensorppageStaticlabel("Missed Alert").waitForPresent(960000);
				if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
					Reporter.logWithScreenShot("Missed alert present", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Missed Alert").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Missed  Alert Notification", MessageTypes.Fail);
			}
			break;
   case "Missed Alert DND":
			
			try {
				
				getNFKiosSensorppageStaticlabel("While in Do Not Disturb").waitForPresent(1020000); {
					getNFKiosSensorppageStaticlabel("While in Do Not Disturb").click();}
				getNFKiosSensorppageStaticlabel("Missed Alert").waitForPresent(960000);
				if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
					Reporter.logWithScreenShot("Missed alert present", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Missed Alert").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Missed  Alert Notification", MessageTypes.Fail);
			}
			break;
		default:
			break;
		}
	}

	public void verifySensorReadingOnHomeScreenNotAkwg(String NotificationType) {
		try {
			getNFKiosSensorppageStaticlabel(NotificationType).waitForPresent(200000);
			if (getNFKiosSensorppageStaticlabel(NotificationType).equals("Low Glucose Alert")) {
				Reporter.logWithScreenShot("User able to see Low Sensor readings", MessageTypes.Pass);
			}
			else if(getNFKiosSensorppageStaticlabel(NotificationType).equals("No Readings Alert")){
				Reporter.logWithScreenShot("User able to see No Readings Alert on home screen", MessageTypes.Pass);
			}
			else if(getNFKiosSensorppageStaticlabel(NotificationType).equals("High Glucose Alert")){
				Reporter.logWithScreenShot("High glucose Alert is not displayed", MessageTypes.Pass);
			}
			else if(getNFKiosSensorppageStaticlabel(NotificationType).equals("Urgent Low Glucose Alarm")){
				Reporter.logWithScreenShot("User able to see Urgent Low Glucose Alarm Notification",
						MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see Sensor readings", MessageTypes.Fail);
		}
	}

	public void verifyHighSensorRealertnotdisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(1020000);
			Reporter.logWithScreenShot("High glucose Alert is not displayed", MessageTypes.Pass);
		} catch (Exception e) {
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High Sensor readings", MessageTypes.Fail);
				LFSUtilsIOS.clickWithText("OK");
			}
		}
	}

	public void waitHighSensorRealert() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(372000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High Sensor readings", MessageTypes.Pass);
				LFSUtilsIOS LfsiOS = new LFSUtilsIOS();
				String curtime = LfsiOS.getDriver().getDeviceTime();
				String[] newt = curtime.split("T", 2);
				String[] sect = newt[1].split("-", 2);
				ConfigurationManager.getBundle().setProperty("secondlowalert", "sect[0]");
				LFSUtilsIOS.clickWithText("OK");
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("User not able to see Low Sensor readings", MessageTypes.Fail);
		}
	}

	public void VerifyAlertOnHomeScreenWithoutAck(String alertType) {
		switch (alertType) {
		case "High Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(4500000);
				if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see High glucose Aler", MessageTypes.Pass);
				}

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see high glucose Alet", MessageTypes.Fail);
			}
			break;
		case "Low Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(3500000);
				if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Low glucose Alert", MessageTypes.Pass);
				}

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Low glucose Alert", MessageTypes.Fail);
			}
			break;

		case "Urgent Low Glucose Alarm":
			try {
				getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(200000);
				if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Urgent Low Glucose Sensor Alarm", MessageTypes.Pass);
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Urgent Low Glucose Sensor Alarm", MessageTypes.Fail);
			}
			break;

		default:
			break;
		}
	}

	public void verifiesSensorExpirePopupNotPresent() {
		try {
			if (getNFKiosSensorpairingSensorExpiryLessthan16daysPopup().isDisplayed()) {
				LFSUtilsIOS.clickWithText("OK");
				Reporter.logWithScreenShot("sensor expiration alert displayed", MessageTypes.Fail);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Sensor expires alert not displayed", MessageTypes.Pass);
		}

	}

	public void verifiesHomeScreenBluetoothoff() {
		getNFKiosSensorHomepageBanner().waitForPresent(50000);
		if (getNFKiosSensorHomepageBanner().getText()
				.contains(ConfigurationManager.getBundle().getString("homepage.bluetoothoff"))) {
			Reporter.logWithScreenShot("use able to see Bluetooth off banner", MessageTypes.Pass);
		}
		if (getNFKiosHomepageTitleLbl().getText()
				.contains(ConfigurationManager.getBundle().getString("homepage.bluetoothoff"))) {
			getNFKiosHomepageDescLbl().getText()
					.contains(ConfigurationManager.getBundle().getString("homepage.bluetoothoff.desc"));
			Reporter.logWithScreenShot("use able to see Bluetooth off title and description", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("use not able to see Bluetooth off title and description", MessageTypes.Fail);
		}
	}

	public void verifyLowSensorRealertnotdisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(1020000);
			if(getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Low Sensor alert", MessageTypes.Fail);
				LFSUtilsIOS.clickWithText("OK");
			}
			else {
				Reporter.logWithScreenShot("Low glucose Alert is not displayed", MessageTypes.Pass);
			}
		} catch(Exception e) {
			Reporter.log(e.toString());
		}		
	}

	public void waitLowSensorRealert() {
		try {
			getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(372000);
			if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Low Sensor readings", MessageTypes.Pass);
				LFSUtilsIOS LfsiOS = new LFSUtilsIOS();
				String curtime = LfsiOS.getDriver().getDeviceTime();
				String[] newt = curtime.split("T", 2);
				String[] sect = newt[1].split("-", 2);
				ConfigurationManager.getBundle().setProperty("secondlowalert", "sect[0]");
				LFSUtilsIOS.clickWithText("OK");
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("User not able to see Low Sensor readings", MessageTypes.Fail);
		}
	}

	public void verifyAlertOnPushNotificationWithoutOpen(String NotificationType) {
		LFSUtilsIOS ios = new LFSUtilsIOS();

		switch (NotificationType) {
		case "High Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see High Glucose Alert Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see High Glucose Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Sensor Expiring":
			try {
				getNFKiosSensorppageStaticlabel("Sensor Expiring").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Sensor Expiring").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Sensor Expiration Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Sensor Expiration Notification", MessageTypes.Fail);
			}
			break;
		case "No reading Alert":
			try {
				getNFKiosSensorppageStaticlabel("No reading Alert").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("No reading Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see No reading Alert Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Urgent Low Glucose Alarm":
			try {
				getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Urgent Low Glucose Alarm Notification",
							MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Low Glucose Alert":
			try {
				getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see low Glucose Alert Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Low Glucose Alert Notification", MessageTypes.Fail);
			}
			break;

		case "BluetoothOff":
			try {
				getNFKiosSensorppageStaticlabel("Bluetooth").waitForPresent(720000);
				if (getNFKiosSensorppageStaticlabel("Bluetooth").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Bluetoothoff Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Bluetoothoff Notification", MessageTypes.Fail);
			}
			break;
		case "Missed Alert":
			try {
				getNFKiosSensorppageStaticlabel("Missed Alert").waitForPresent(960000);
				if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Missed Alert Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Missed Alert Notification", MessageTypes.Fail);
			}
			break;
		case "Missed Alarm":
			try {
				getNFKiosSensorppageStaticlabel("Missed Alarm").waitForPresent(960000);
				if (getNFKiosSensorppageStaticlabel("Missed Alarm").isDisplayed()) {
					Reporter.logWithScreenShot("User able to see Missed Alarm Notification", MessageTypes.Pass);
					ios.openNFKApp();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Missed Alarm Notification", MessageTypes.Fail);
			}
			break;
		case "Missed Alert DND":
			try {
				getNFKiosSensorppageStaticlabel("While in Do Not Disturb").waitForPresent(1020000);
				getNFKiosSensorppageStaticlabel("While in Do Not Disturb").click();
				getNFKiosSensorppageStaticlabel("Missed Alert").waitForPresent(1080000);
				if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
					Reporter.logWithScreenShot("Missed alert present", MessageTypes.Pass);
					getNFKiosSensorppageStaticlabel("Missed Alert").click();
					driver.findElement(By.xpath("//*[@label='Open']")).click();
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to see Sensor Warmup Alert Notification", MessageTypes.Fail);
			}
			break;
		default:
			break;
		}
	}

	public void bluetoothOffNotificationNotDisplayed() {
		LFSUtilsIOS ios = new LFSUtilsIOS();
		try {
			getNFKiosSensorppageStaticlabel("Bluetooth").waitForPresent(60000);
			if (getNFKiosSensorppageStaticlabel("Bluetooth").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Bluetoothoff Notification", MessageTypes.Fail);
			} else {
				Reporter.logWithScreenShot("User Not able to see Bluetoothoff Notification", MessageTypes.Pass);
				ios.openNFKApp();
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}
	}

	public void verifyLowSensorReadingNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("Low Glucose Alert").waitForPresent(4000);
			if (getNFKiosSensorppageStaticlabel("Low Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see Low glucose Alert", MessageTypes.Fail);
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("user not able to see Low glucose Alert", MessageTypes.Pass);
		}
	}

	public void verifyAlertNotDisplayed(String alertType) {
		try {
			getNFKiosSensorppageStaticlabel(alertType).waitForNotPresent(15000);
			if (!getNFKiosSensorppageStaticlabel(alertType).isPresent()) {
				Reporter.logWithScreenShot(alertType + " not triggred", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Fail to verify " + alertType, MessageTypes.Fail);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify " + alertType, MessageTypes.Fail);
		}
	}

	public void waitForALerts(String alertType, long time) {
		try {
			getNFKiosSensorppageStaticlabel(alertType).waitForPresent(time);
		} catch (Exception e) {
			Reporter.logWithScreenShot(alertType + " notification not displayed", MessageTypes.Pass);
		}
	}

	public void NoReadingsAlertsNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("No Readings Alert").waitForPresent(180000);
			if (getNFKiosSensorppageStaticlabel("No Readings Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User Not able to see No Readings Alert", MessageTypes.Fail);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("use able to see No Readings Alert", MessageTypes.Pass);
		}
	}

	public void verifyhighSensorReadingNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(4000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High glucose Alert", MessageTypes.Fail);
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("user not able to see High glucose Alert", MessageTypes.Pass);
		}
	}

	public void verifyhighSensorReadingOnHomeScreenNotAkwg() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(300000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High Sensor readings", MessageTypes.Pass);
				getNFKiosSensorppageStaticlabel("High Glucose Alert").click();
				driver.findElement(By.xpath("//*[@label='Open']")).click();
			}
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(200000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High Sensor readings", MessageTypes.Pass);
				LFSUtilsIOS LfsiOS = new LFSUtilsIOS();
				String curtime = LfsiOS.getDriver().getDeviceTime();
				String[] newt = curtime.split("T", 2);
				String[] sect = newt[1].split("-", 2);
				ConfigurationManager.getBundle().setProperty("firsthighalert", "sect[0]");
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see High Sensor readings", MessageTypes.Fail);
		}
	}

	public void verifyHighSensorReadingNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(4000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High glucose Alert", MessageTypes.Fail);
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("user not able to see High glucose Alert", MessageTypes.Pass);
		}
	}

	public void verifySensorExpirePopupWithoutClose() {
		try {
			if (getNFKiosSensorpairingSensorExpiryLessthan16daysPopup().isDisplayed()) {
				getNFKiosSensorexpirationLogo().click();
				Reporter.logWithScreenShot("Successfully verified sensor expiration alert", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Sensor expires alert not displayed", MessageTypes.Pass);
		}

	}

	public void verifyNotificationSettingsPopup() {
		getNFKiosSensorppageStaticlabel("Change Your Settings").isPresent();
		getNFKiosSensorppageStaticlabel(ConfigurationManager.getBundle().getString("changesetting.desc")).isPresent();
		getNFKiosSensorpairingChangesettingNotnow().isPresent();
		getNFKiosSensorpairingChangesettingSettings().isPresent();
		getNFKiosSensorpairingChangesettingNotnow().click();
	}

	public void verifyBannerOnHomeScreen(String bannerType) {
		HomePageIOS homePage = new HomePageIOS();
		if (homePage.getNFKiosHomepageBannerMsgLbl().getText().equals(bannerType)) {
			Reporter.logWithScreenShot("Mobile Device Alerts Off Banner is present", MessageTypes.Pass);
			LFSUtilsIOS.click(homePage.getNFKiosHomepageBannerMsgLbl());
			getNFKiosSensorpairingChangesettingSettings().click();
		} else {
			Reporter.logWithScreenShot("Mobile Device Alerts Off Banner is present", MessageTypes.Fail);
		}

	}

	public void openAppNotification() {
		DeviceSettingsPageIOS deviceSettings = new DeviceSettingsPageIOS();
		deviceSettings.getNFKiosSettingAppnotification().isPresent();
		LFSUtilsIOS.click(deviceSettings.getNFKiosSettingAppnotification());
	}

	public void ToggleNotification() {
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Notifications\"]")
				.waitForPresent();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Notifications\"]")
				.click();

	}

	public void verifyBannerOnHomeScreenNotDisplayed(String bannerType) {
		HomePageIOS homePage = new HomePageIOS();
		if (homePage.getNFKiosHomepageBannerMsgLbl().isPresent()) {
			Reporter.logWithScreenShot("" + bannerType + " Banner is not present", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("" + bannerType + " Banner is present", MessageTypes.Fail);
		}
	}

	public void clickSettings() {
		getNFKiosSensorpairingChangesettingSettings().isPresent();
		LFSUtilsIOS.click(getNFKiosSensorpairingChangesettingNotnow());
	}

	public void verifyNotificationSettingsPopupAlertScreen() {
		getNFKiosSensorppageStaticlabel("Change Your Settings").isPresent();
		getNFKiosSensorppageStaticlabel(ConfigurationManager.getBundle().getString("changesetting.desc")).isPresent();
		getNFKiosSensorpairingChangesettingNotnow().isPresent();
		getNFKiosSensorpairingChangesettingSettings().isPresent();
		getNFKiosSensorpairingChangesettingSettings().click();
	}

	public void verifyTooltipOnHomeScreen() {
		getNFKiosSensorppageStaticlabel("Adjust Your Settings and Alerts from the More menu.").verifyPresent();
		getNFKiosSensorppageStaticlabel("Adjust Your Settings and Alerts from the More menu.").click();
		getNFKiosSensorppageStaticlabel("Your Trend Graph").verifyPresent();
		getNFKiosSensorppageStaticlabel(("Pinch and Zoom")).verifyPresent();
		getNFKiosSensorppageStaticlabel(("Scroll")).verifyPresent();
		getNFKiosSensorppageStaticlabel("Your Trend Graph").click();

	}
	public void verifyTooltipNearMoreMenu() {
		try {
			getNFKiosSensorppageStaticlabel("Adjust Your Settings and Alerts from the More menu.").verifyPresent();
			LFSUtilsIOS.click(getNFKiosSensorppageStaticlabel("Adjust Your Settings and Alerts from the More menu."));
			getNFKiosSensorppageStaticlabel("Your Trend Graph").verifyPresent();
			Reporter.logWithScreenShot("User verified tool tip near more menu ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify tool tip near more menu", MessageTypes.Fail);
		}
	}

	public void verifyTooltipNearTrendGraphh() {
		try {
			getNFKiosSensorppageStaticlabel("Your Trend Graph").verifyPresent();
			getNFKiosSensorppageStaticlabel(("Pinch and Zoom")).verifyPresent();
			getNFKiosSensorppageStaticlabel(("Scroll")).verifyPresent();
			LFSUtilsIOS.click(getNFKiosSensorppageStaticlabel("Your Trend Graph"));
			Reporter.logWithScreenShot("User verified tool tip near trend graph", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify tool tip  near trend graph", MessageTypes.Fail);
		}
	}

	public void verifyNoTooltipOnHomeScreen() {
		getNFKiosSensorppageStaticlabel("Adjust Your Settings and Alerts from the More menu.").verifyNotPresent();
		Reporter.logWithScreenShot("App not displayed first use tooltip after login", MessageTypes.Pass);

	}
	/*
	 *TO verify High Alert notification not displayed 
	 */
	public void VerifyHighAlertNotificationNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("High Glucose Alert").waitForPresent(60000);
			if (getNFKiosSensorppageStaticlabel("High Glucose Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User able to see High Glucose Alert Notification", MessageTypes.Fail);
			} else {
				Reporter.logWithScreenShot("User Not able to see High Glucose Alert Notification", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

	}

	/*
	 * to verify title of Missed condition alert 
	 */
	public void VerifyTitleMissedConditionNotification() {
		try {
			if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
				getNFKiosSensorppageStaticlabel("Missed Alert").verifyPresent("Missed Alert");
				Reporter.logWithScreenShot("User able to see Title of Missed Alert Notification", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see Title of Missed Alert Notification", MessageTypes.Fail);
		}

	}

	/*
	 * Verify Description of Missed Alert
	 */
	public void VerifyDescriptionMissedNotification() {
		try {
			if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
				getNFKiosSensorppageStaticlabel(ConfigurationManager.getBundle().getString("highalert.missed"))
						.verifyPresent("Missed Alert");
				Reporter.logWithScreenShot("User able to see Description of Missed Alert Notification",
						MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to see Description of Missed Alert Notification", MessageTypes.Fail);
		}

	}

	/*
	 * Verify the Missed Alert is not displayed 
	 */
	public void VerifyMissedConditionNotificationNotDisplayed() {
		try {
			getNFKiosSensorppageStaticlabel("Missed Alert").waitForPresent(60000);
			if (getNFKiosSensorppageStaticlabel("Missed Alert").isDisplayed()) {
				Reporter.logWithScreenShot("User not able to see Missed Alert Notification", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("User able to see Missed Alert Notification", MessageTypes.Fail);
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}
	}
	//Auther-Pradnya
			//Description-Method to click on cancel button
			public void userClicksOnCancelButton() {
				if(getNFKiosSensorpairingStartPairingCancelBtn().isPresent()) {
					LFSUtilsIOS.click(getNFKiosSensorpairingStartPairingCancelBtn());
					Reporter.logWithScreenShot("User able to click cancel button", MessageTypes.Pass);
					LFSUtilsIOS.click(getNFKiosSensorpairingNextbtn());
				}
			}
			//Auther-Pradnya
			//Description-Method to click on try again button
			public void userClicksOnTryagainButton() {
				try {
					LFSUtilsIOS.click(getNFKiosSensorpairingStartPairingTryAgainBtn());
					Reporter.logWithScreenShot("User able to click tryagain button", MessageTypes.Pass);
				}catch(Exception e) {
					Reporter.logWithScreenShot("User notable to click tryagain button", MessageTypes.Pass);
				}
			}
			
			//Rushikesh
			//Method to verify banner on home screen
			public void verifyBannersOnHomeScreen(String bannerType) {
				switch (bannerType) {
				case "No Readings Alert":
					try {
						getNFKiosSensorppageStaticlabel("No Readings Alert").waitForPresent(100000);
						getNFKiosSensorppageStaticlabel("No Readings Alert").verifyPresent();
						Reporter.logWithScreenShot("User able to see No Readings Alert banner", MessageTypes.Pass);
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see No Readings Alert banner", MessageTypes.Fail);
					}
					break;
				}
			}
			/*
			 * Wait for specific time
			 */
			public void userWaitForAction(int time) {
				LFSUtilsIOS.WaitforAction(time);
			}
			public void verifyUrgentLowOnSettingScreen() {
				LFSUtilsIOS.click(getNFKiosSensorppageStaticlabel("Urgent Low"));
				getNFKiosSensorppageStaticlabel("Notify Me At or Below").verifyPresent(LFSUtilsIOS.getPropString("sensorPairPage.notifyMeAtOrBelow"));
				getNFKiosSensorppageStaticlabel("Repeat").verifyPresent(LFSUtilsIOS.getPropString("sensorPairPage.Repeat.every30Min"));

				
			}
//			Shubham
//			Method to verify urgent low and acknowledge popop on homescreen
			public void verifyUrgentLowAndAcknowledgePopupOnHomeScreen() {
				try {
					getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").waitForPresent(200000);
					if (getNFKiosSensorppageStaticlabel("Urgent Low Glucose Alarm").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see Urgent Low Glucose Sensor Alarm", MessageTypes.Pass);
						LFSUtilsIOS.clickWithText("OK");
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see Urgent Low Glucose Sensor Alarm", MessageTypes.Fail);
				}
				
			}
}
