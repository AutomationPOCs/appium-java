package com.NFK.version1.android.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.component.PatternComponent;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class ProgressPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.logbook.totalpattern.lbl")
	private QAFWebElement NFKLogbookTotalpatternLbl;
	@FindBy(locator = "NFK.pattern.lowcount.lbl")
	private QAFWebElement NFKPatternLowcountLbl;
	@FindBy(locator = "NFK.pattern.highcount.lbl")
	private QAFWebElement NFKPatternHighcountLbl;
	@FindBy(locator = "NFK.pattern.patternlist.comp")
	private List<PatternComponent> NFKPatternPatternComponentList;

	// NFK Progress page
	@FindBy(locator = "NFK.homepage.progress.tab")
	private QAFWebElement NFKhomepageProgresstab;
	@FindBy(locator = "NFK.progresspage.rangedays.radio.btn")
	private QAFWebElement NFKProgresspageRangedaysRadioBtn;
	@FindBy(locator = "NFK.progresspage.compare.lbl")
	private QAFWebElement NFKProgresspageCompareLbl;
	@FindBy(locator = "NFK.progresspage.switch.btn")
	private QAFWebElement NFKProgresspageSwitchBtn;
	@FindBy(locator = "NFK.progresspage.availableday.lbl")
	private QAFWebElement NFKProgresspageAvailabledayLbl;
	@FindBy(locator = "NFK.progresspage.avergaes.lbl")
	private List<QAFWebElement> NFKProgresspageAvergaesLbl;
	@FindBy(locator = "NFK.progresspage.averages.value")
	private List<QAFWebElement> NFKProgresspageAveragesValue;
	@FindBy(locator = "NFK.progresspage.piechart")
	private QAFWebElement NFKProgresspagePiechart;
	@FindBy(locator = "NFK.progresspage.dateon.piechart")
	private QAFWebElement NFKProgresspageDateonPiechart;
	@FindBy(locator = "NFK.progresspage.dateon.comp.piechart")
	private List<QAFWebElement> NFKProgresspageDateonCompPiechart;
	@FindBy(locator = "NFK.progresspage.low.lbl")
	private QAFWebElement NFKProgresspageLowLbl;
	@FindBy(locator = "NFK.progresspage.low.vlue")
	private QAFWebElement NFKProgresspageLowVlue;
	@FindBy(locator = "NFK.progresspage.inrange.lbl")
	private QAFWebElement NFKProgresspageInrangeLbl;
	@FindBy(locator = "NFK.progresspage.inrange.value")
	private QAFWebElement NFKProgresspageInrangeValue;
	@FindBy(locator = "NFK.progresspage.high.value")
	private QAFWebElement NFKProgresspageHighValue;
	@FindBy(locator = "NFK.progresspage.legendinfo.lbl")
	private QAFWebElement NFKProgresspageLegendinfoLbl;
	@FindBy(locator = "NFK.progresspage.title.lbl")
	private QAFWebElement NFKProgresspageTitleLbl;
	@FindBy(locator = "NFK.progresspage.buttons.list")
	private List<QAFWebElement> NFKProgresspageButtonsList;
	@FindBy(locator = "NFK.progresspage.carousel.dot")
	private List<QAFWebElement> NFKProgresspageCarouselDot;
	@FindBy(locator = "NFK.progresspage.high.lbl")
	private QAFWebElement NFKProgresspageHighLbl;
	@FindBy(locator = "NFK.progresspage.compr.glucose.lbl")
	private QAFWebElement NFKProgresspageComprGlucoseLbl;
	@FindBy(locator = "NFK.progresspage.compr.pre.avg.val")
	private QAFWebElement NFKProgresspageComprPreAvgVal;
	@FindBy(locator = "NFK.progresspage.compr.curr.avg.val")
	private QAFWebElement NFKProgresspageComprCurrAvgVal;
	@FindBy(locator = "NFK.progresspage.compr.gmi.lbl")
	private QAFWebElement NFKProgresspageComprGmiLbl;
	@FindBy(locator = "NFK.progresspage.compr.pre.gmi.val")
	private QAFWebElement NFKProgresspageComprPreGmiVal;
	@FindBy(locator = "NFK.progresspage.compr.curr.gmi.val")
	private QAFWebElement NFKProgresspageComprCurrGmiVal;
	@FindBy(locator = "NFK.progresspage.compr.low.pre.val")
	private QAFWebElement NFKProgresspageComprLowPreVal;
	@FindBy(locator = "NFK.progresspage.compr.inrange.pre.val")
	private QAFWebElement NFKProgresspageComprInrangePreVal;
	@FindBy(locator = "NFK.progresspage.compr.high.pre.val")
	private QAFWebElement NFKProgresspageComprHighPreVal;
	@FindBy(locator = "NFK.progresspage.compr.low.curr.val")
	private QAFWebElement NFKProgresspageComprLowCurrVal;
	@FindBy(locator = "NFK.progresspage.compr.inrange.curr.val")
	private QAFWebElement NFKProgresspageComprInrangeCurrVal;
	@FindBy(locator = "NFK.progresspage.compr.high.curr.val")
	private QAFWebElement NFKProgresspageComprHighCurrVal;
	@FindBy(locator = "NFK.progresspage.no.sensordata.txt")
	private QAFWebElement NFKProgresspageNoSensordataTxt;
	@FindBy(locator = "NFK.progresspage.info.icon")
	private List<QAFWebElement> NFKProgresspageInfoIcon;
	@FindBy(locator = "NFK.progresspage.descp.nodata.txt")
	private List<QAFWebElement> NFKProgresspageDescpNodataTxt;
	@FindBy(locator = "NFK.progresspage.slideup.close.btn")
	private QAFWebElement NFKProgresspageSlideupCloseBtn;
	@FindBy(locator = "NFK.progresspage.low.slideup.txt")
	private QAFWebElement NFKProgresspageLowSlideupTxt;
	@FindBy(locator = "NFK.progresspage.agp.slideup.txt")
	private QAFWebElement NFKProgresspageAgpSlideupTxt;
	@FindBy(locator = "NFK.progresspage.lowagp.title.lbl")
	private List<QAFWebElement> NFKProgresspageLowagpTitleLbl;
	@FindBy(locator = "NFK.progresspage.low.chart")
	private QAFWebElement NFKProgresspageLowChart;
	@FindBy(locator = "NFK.progresspage.low.txt.lbl")
	private List<QAFWebElement> NFKProgresspageLowTxtLbl;
	@FindBy(locator = "NFK.progresspage.low.events.value")
	private List<QAFWebElement> NFKProgresspageLowEventsValue;
	@FindBy(locator = "NFK.progresspage.view.agp.report")
	private QAFWebElement NFKProgresspageViewAgpReport;
	@FindBy(locator = "NFK.progresspage.card.title")
	private List<QAFWebElement> NFKProgresspageCardTitle;
	@FindBy(locator = "NFK.progresspage.card.description")
	private List<QAFWebElement> NFKProgresspageCardDescription;
	@FindBy(locator = "NFK.progresspage.title.report")
	private QAFWebElement NFKProgresspageTitleReport;
	@FindBy(locator = "NFK.progresspage.close.btn.report")
	private QAFWebElement NFKProgresspageCloseBtnReport;

	@FindBy(locator = "NFK.progresspage.titles")
	private List<QAFWebElement> NFKProgresspageTitles;

	@FindBy(locator = "NFK.progresspage.contents")
	private List<QAFWebElement> NFKProgresspageContents;

	@FindBy(locator = "NFK.progresspage.range14Day.btn")
	private QAFWebElement NFKProgresspageRange14DayBtn;
	@FindBy(locator = "NFK.progresspage.AGP.txt")
	private QAFWebElement NFKProgresspageAGPTxt;

	@FindBy(locator = "NFK.progressPage.agp.info.icon")
	private List<QAFWebElement> NFKProgressPageAgpInfoIcon;
	@FindBy(locator = "NFKios.myProgress.range.7Days.btn")
	private QAFWebElement NFKiosMyProgressRange7DaysBtn;
	@FindBy(locator = "NFK.progresspage.glucoseValuePeriod.btn")
	private QAFWebElement NFKProgresspageGlucoseValuePeriodBtn;
	@FindBy(locator = "NFK.progresspage.30Day.btn")
	private QAFWebElement NFKProgresspage30DayBtn;
	@FindBy(locator = "NFK.progresspage.60Day.btn")
	private QAFWebElement NFKProgresspage60DayBtn;
	@FindBy(locator = "NFK.progresspage.90Day.btn")
	private QAFWebElement NFKProgresspage90DayBtn;
	@FindBy(locator = "NFK.progresspage.informationIcon.btn")
	private QAFWebElement NFKProgresspageInformationIconBtn;
	@FindBy(locator = "NFK.progresspage.informationIconText.btn")
	private QAFWebElement NFKProgresspageInformationIconTextBtn;
	@FindBy(locator="NFK.progressPage.agp.information.icon")
	private QAFWebElement NFKProgressPageAgpInformationIcon;
	@FindBy(locator="NFK.progressPage.gmiInfo.icon")
	private QAFWebElement NFKProgressPageGmiInfoIcon;
	@FindBy(locator="NFK.progressPage.gmiSlideUp.footNote.label")
	private QAFWebElement NFKProgressPageGmiSlideUpFootNoteLabel;
	@FindBy(locator="NFK.progressPage.high.label")
	private QAFWebElement NFKProgresspPageHighLabel;
	

	public QAFWebElement getNFKProgressPageGmiInfoIcon() {
		return NFKProgressPageGmiInfoIcon;
	}
	public QAFWebElement getNFKProgressPageGmiSlideUpFootNoteLabel() {
		return NFKProgressPageGmiSlideUpFootNoteLabel;
	}
	public QAFWebElement getNFKProgresspPageHighLabel() {
		return NFKProgresspPageHighLabel;
	}
	public QAFWebElement getNFKProgressPageAgpInformationIcon(){
		return NFKProgressPageAgpInformationIcon;
	}

	public List<QAFWebElement> getNFKProgresspageContents() {
		return NFKProgresspageContents;
	}

	public List<QAFWebElement> getNFKProgresspageTitles() {
		return NFKProgresspageTitles;
	}

	public List<QAFWebElement> getNFKProgresspageDateonCompPiechart() {
		return NFKProgresspageDateonCompPiechart;
	}

	public QAFWebElement getNFKProgresspageViewAgpReport() {
		return NFKProgresspageViewAgpReport;
	}

	public QAFWebElement getNFKProgresspageCloseBtnReport() {
		return NFKProgresspageCloseBtnReport;
	}

	public QAFWebElement getNFKProgresspageTitleReport() {
		return NFKProgresspageTitleReport;
	}

	public List<QAFWebElement> getNFKProgresspageCardDescription() {
		return NFKProgresspageCardDescription;
	}

	public List<QAFWebElement> getNFKProgresspageCardTitle() {
		return NFKProgresspageCardTitle;
	}

	public QAFWebElement getNFKProgresspageLowChart() {
		return NFKProgresspageLowChart;
	}

	public List<QAFWebElement> getNFKProgresspageLowTxtLbl() {
		return NFKProgresspageLowTxtLbl;
	}

	public List<QAFWebElement> getNFKProgresspageLowEventsValue() {
		return NFKProgresspageLowEventsValue;
	}

	public List<QAFWebElement> getNFKProgresspageLowagpTitleLbl() {
		return NFKProgresspageLowagpTitleLbl;
	}

	public List<QAFWebElement> getNFKProgresspageInfoIcon() {
		return NFKProgresspageInfoIcon;
	}

	public List<QAFWebElement> getNFKProgresspageDescpNodataTxt() {
		return NFKProgresspageDescpNodataTxt;
	}

	public QAFWebElement getNFKProgresspageSlideupCloseBtn() {
		return NFKProgresspageSlideupCloseBtn;
	}

	public QAFWebElement getNFKProgresspageLowSlideupTxt() {
		return NFKProgresspageLowSlideupTxt;
	}

	public QAFWebElement getNFKProgresspageAgpSlideupTxt() {
		return NFKProgresspageAgpSlideupTxt;
	}

	public QAFWebElement getNFKProgresspageNoSensordataTxt() {
		return NFKProgresspageNoSensordataTxt;
	}

	public QAFWebElement getNFKProgresspageHighLbl() {
		return NFKProgresspageHighLbl;
	}

	public QAFWebElement getNFKProgresspageComprGlucoseLbl() {
		return NFKProgresspageComprGlucoseLbl;
	}

	public QAFWebElement getNFKProgresspageComprPreAvgVal() {
		return NFKProgresspageComprPreAvgVal;
	}

	public QAFWebElement getNFKProgresspageComprCurrAvgVal() {
		return NFKProgresspageComprCurrAvgVal;
	}

	public QAFWebElement getNFKProgresspageComprGmiLbl() {
		return NFKProgresspageComprGmiLbl;
	}

	public QAFWebElement getNFKProgresspageComprPreGmiVal() {
		return NFKProgresspageComprPreGmiVal;
	}

	public QAFWebElement getNFKProgresspageComprCurrGmiVal() {
		return NFKProgresspageComprCurrGmiVal;
	}

	public QAFWebElement getNFKProgresspageComprLowPreVal() {
		return NFKProgresspageComprLowPreVal;
	}

	public QAFWebElement getNFKProgresspageComprInrangePreVal() {
		return NFKProgresspageComprInrangePreVal;
	}

	public QAFWebElement getNFKProgresspageComprHighPreVal() {
		return NFKProgresspageComprHighPreVal;
	}

	public QAFWebElement getNFKProgresspageComprLowCurrVal() {
		return NFKProgresspageComprLowCurrVal;
	}

	public QAFWebElement getNFKProgresspageComprInrangeCurrVal() {
		return NFKProgresspageComprInrangeCurrVal;
	}

	public QAFWebElement getNFKProgresspageComprHighCurrVal() {
		return NFKProgresspageComprHighCurrVal;
	}

	public QAFWebElement getNFKProgresstabStaticText(String Text) {
		return LFSUtilsAndroid.getElement("NFK.progresstab.static.text", Text);
	}

	public List<QAFWebElement> getNFKProgresspageButtonsList() {
		return NFKProgresspageButtonsList;
	}

	public List<QAFWebElement> getNFKProgresspageCarouselDot() {
		return NFKProgresspageCarouselDot;
	}

	public QAFWebElement getNFKhomepageProgresstab() {
		return NFKhomepageProgresstab;
	}

	public QAFWebElement getNFKProgresspageRangedaysRadioBtn() {
		return NFKProgresspageRangedaysRadioBtn;
	}

	public QAFWebElement getNFKProgresspageCompareLbl() {
		return NFKProgresspageCompareLbl;
	}

	public QAFWebElement getNFKProgresspageLowVlue() {
		return NFKProgresspageLowVlue;
	}

	public QAFWebElement getNFKProgresspageSwitchBtn() {
		return NFKProgresspageSwitchBtn;
	}

	public QAFWebElement getNFKProgresspageAvailabledayLbl() {
		return NFKProgresspageAvailabledayLbl;
	}

	public List<QAFWebElement> getNFKProgresspageAvergaesLbl() {
		return NFKProgresspageAvergaesLbl;
	}

	public List<QAFWebElement> getNFKProgresspageAveragesValue() {
		return NFKProgresspageAveragesValue;
	}

	public QAFWebElement getNFKProgresspagePiechart() {
		return NFKProgresspagePiechart;
	}

	public QAFWebElement getNFKProgresspageInrangeValue() {
		return NFKProgresspageInrangeValue;
	}

	public QAFWebElement getNFKProgresspageDateonPiechart() {
		return NFKProgresspageDateonPiechart;
	}

	public QAFWebElement getNFKProgresspageLowLbl() {
		return NFKProgresspageLowLbl;
	}

	public QAFWebElement getNFKProgresspageInrangeLbl() {
		return NFKProgresspageInrangeLbl;
	}

	public QAFWebElement getNFKProgresspageHighValue() {
		return NFKProgresspageHighValue;
	}

	public QAFWebElement getNFKProgresspageLegendinfoLbl() {
		return NFKProgresspageLegendinfoLbl;
	}

	public QAFWebElement getNFKProgresspageTitleLbl() {
		return NFKProgresspageTitleLbl;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<PatternComponent> getNFKPatternPatternComponentList() {
		return NFKPatternPatternComponentList;
	}

	public QAFWebElement getNFKLogbookTotalpatternLbl() {
		return NFKLogbookTotalpatternLbl;
	}

	public QAFWebElement getNFKPatternLowcountLbl() {
		return NFKPatternLowcountLbl;
	}

	public QAFWebElement getNFKPatternHighcountLbl() {
		return NFKPatternHighcountLbl;
	}

	public List<QAFWebElement> getNFKProgressPageAgpInfoIcon() {
		return NFKProgressPageAgpInfoIcon;
	}

	public QAFWebElement getNFKiosMyProgressRange7DaysBtn() {
		return NFKiosMyProgressRange7DaysBtn;
	}

	public QAFWebElement getNFKProgresspageAGPTxt() {
		return NFKProgresspageAGPTxt;
	}

	public QAFWebElement getNFKProgresspageRange14DayBtn() {
		return NFKProgresspageRange14DayBtn;

	}

	public QAFWebElement getNFKProgresspageGlucoseValuePeriodBtn() {
		return NFKProgresspageGlucoseValuePeriodBtn;
	}

	public QAFWebElement getNFKProgresspage30DayBtn() {
		return NFKProgresspage30DayBtn;
	}

	public QAFWebElement getNFKProgresspage60DayBtn() {
		return NFKProgresspage60DayBtn;
	}

	public QAFWebElement getNFKProgresspage90DayBtn() {
		return NFKProgresspage90DayBtn;
	}

	public QAFWebElement getNFKProgresspageInformationIconBtn() {
		return NFKProgresspageInformationIconBtn;
	}

	public QAFWebElement getNFKProgresspageInformationIconTextBtn() {
		return NFKProgresspageInformationIconTextBtn;
	}

	public void verifyNoOFPatternCount(String low, String high) {
		int total = Integer.parseInt(low) + Integer.parseInt(high);
		WebDriverTestCase.verifyTrue(getNFKLogbookTotalpatternLbl().getText().contains(total + ""),
				"Count is incorrect", "Total " + getNFKLogbookTotalpatternLbl().getText());
		WebDriverTestCase.verifyTrue(getNFKPatternLowcountLbl().getText().contains(low), "Count is incorrect",
				"Count " + getNFKPatternLowcountLbl().getText());
		WebDriverTestCase.verifyTrue(getNFKPatternHighcountLbl().getText().contains(high), "Count is incorrect",
				"Count " + getNFKPatternHighcountLbl().getText());

	}

	public void verifyBlankPatternPage() {
		WebDriverTestCase.verifyTrue(getNFKLogbookTotalpatternLbl().getText().contains(0 + ""), "Pettern present",
				"Pattern screen is blank " + getNFKLogbookTotalpatternLbl().getText());
	}

	public void verfyPatternDetail() {
		getNFKLogbookTotalpatternLbl().waitForPresent();
		for (int i = 0; i < getNFKPatternPatternComponentList().size(); i++) {
			PatternComponent ptrn = getNFKPatternPatternComponentList().get(i);
			if (i == 0) {
				WebDriverTestCase.verifyTrue(
						ptrn.getNFKPatternBgbubblelValueLbl().get(0).getText()
								.contains(LFSUtilsAndroid.getPropString("readingsHigh.bg1"))
								&& ptrn.getNFKPatternBgbubblelValueLbl().get(1).getText()
										.contains(LFSUtilsAndroid.getPropString("readingsHigh.bg2"))
								&& ptrn.getNFKPatternBgbubblelValueLbl().get(2).getText()
										.contains(LFSUtilsAndroid.getPropString("readingsHigh.bg3")),
						"Pettern High value are incorrect", "Pattern High value are correct");

			}
			if (i == 1) {
				WebDriverTestCase.verifyTrue(
						ptrn.getNFKPatternBgbubblelValueLbl().get(0).getText()
								.contains(LFSUtilsAndroid.getPropString("readingsLow.bg1"))
								&& ptrn.getNFKPatternBgbubblelValueLbl().get(1).getText()
										.contains(LFSUtilsAndroid.getPropString("readingsLow.bg2")),
						"Pettern Low value are incorrect", "Pattern Low value are correct");

			}
		}
	}

	// Method to click on generated pattern using number from the list

	public void clickOnPatternFromList(String numb) {
		getNFKPatternPatternComponentList().get(Integer.parseInt(numb) - 1).click();
	}

	public void clickProgressBar() {
		getNFKhomepageProgresstab().waitForPresent();
		getNFKhomepageProgresstab().click();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.pause(30000);
		Reporter.logWithScreenShot("Progress Page", MessageTypes.Pass);
		waitForPageToLoad();

	}

	public void verifyMyProgress() {
		Assert.assertEquals(getNFKProgresspageTitleLbl().getText(), LFSUtilsAndroid.getPropString("my.pogress.title"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(1).getText(),
				LFSUtilsAndroid.getPropString("range.timeFrame14"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(2).getText(),
				LFSUtilsAndroid.getPropString("range.timeFrame30"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(3).getText(),
				LFSUtilsAndroid.getPropString("range.timeFrame60"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(4).getText(),
				LFSUtilsAndroid.getPropString("range.timeFrame90"));
		Assert.assertEquals(getNFKProgresspageCompareLbl().getText(),
				LFSUtilsAndroid.getPropString("my.progress.compare.lbl"));
		getNFKProgresspageSwitchBtn().getText().equals("OFF");
		// Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),LFSUtilsAndroid.getPropString("my.progress.availble.data.lbl"));

	}

	public void verifyAverage(String opt) {
		LFSUtilsAndroid.waitforLoad();
		switch (opt) {
		case "7":
			getNFKProgresspageButtonsList().get(0).click();
			getNFKProgresspageButtonsList().get(0).isEnabled();
			verifyAvgGMI(opt);
			break;
		case "14":
			getNFKProgresspageButtonsList().get(1).click();
			getNFKProgresspageButtonsList().get(1).isEnabled();
			verifyAvgGMI(opt);
			break;
		case "30":
			getNFKProgresspageButtonsList().get(2).click();
			getNFKProgresspageButtonsList().get(2).isEnabled();
			verifyAvgGMI(opt);
			break;
		case "60":
			getNFKProgresspageButtonsList().get(3).click();
			getNFKProgresspageButtonsList().get(3).isEnabled();
			verifyAvgGMI(opt);
			break;
		case "90":
			getNFKProgresspageButtonsList().get(4).click();
			getNFKProgresspageButtonsList().get(4).isEnabled();
			verifyAvgGMI(opt);
			break;

		}
	}

	public void verifyAvgGMI(String opt) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM d");
		int i = Integer.parseInt(opt);
		LocalDateTime myDateObj = LocalDateTime.now().minusDays(i - 1);
		String formattedDate = myFormatObj.format(myDateObj);
		LFSUtilsAndroid.waitforLoad();
		getNFKProgresspageAvergaesLbl().get(0).getText().equals(LFSUtilsAndroid.getPropString("glucose.avg.lbl"));// get
																													// average
		getNFKProgresspageAvergaesLbl().get(1).getText().equals(LFSUtilsAndroid.getPropString("gmi.lbl"));// get GMI
		String datecheck = formattedDate.concat("toToday");
		if (i == 7) {

			getNFKProgresspagePiechart().waitForPresent();
			Assert.assertEquals(getNFKProgresspageDateonPiechart().getText().replaceAll("\n|\\t", ""), datecheck);
			Assert.assertEquals(getNFKProgresspageAveragesValue().get(0).getText(),
					LFSUtilsAndroid.getPropString("my.progress.avg.value"));
			Assert.assertTrue(getNFKProgresspageAveragesValue().get(1).getText().equals("--")); // 7 days no GMI
			Assert.assertEquals(getNFKProgresspageLowVlue().getText(),
					LFSUtilsAndroid.getPropString("my.progress.low.per"));// % of LOW
			Assert.assertEquals(getNFKProgresspageInrangeValue().getText(),
					LFSUtilsAndroid.getPropString("my.progress.inrange.per"));// % of inrange
			Assert.assertEquals(getNFKProgresspageHighValue().getText(),
					LFSUtilsAndroid.getPropString("my.progress.high.per"));// % of High
		} else {
			getNFKProgresspagePiechart().waitForPresent(2500);
			Assert.assertEquals(getNFKProgresspageDateonPiechart().getText().replaceAll("\n|\\t", ""), datecheck);
			Assert.assertEquals(getNFKProgresspageAveragesValue().get(0).getText(),
					LFSUtilsAndroid.getPropString("my.progress.avg.value"));
			Assert.assertEquals(getNFKProgresspageAveragesValue().get(1).getText(),
					LFSUtilsAndroid.getPropString("my.progress.gmi.value"));
			Assert.assertEquals(getNFKProgresspageLowVlue().getText(),
					LFSUtilsAndroid.getPropString("my.progress.low.per"));// % of LOW
			Assert.assertEquals(getNFKProgresspageInrangeValue().getText(),
					LFSUtilsAndroid.getPropString("my.progress.inrange.per"));// % of inrange
			Assert.assertEquals(getNFKProgresspageHighValue().getText(),
					LFSUtilsAndroid.getPropString("my.progress.high.per"));// % of High

		}

	}

	public void compareData(String opt) {
		clickProgressBar();
		clickComparebtn();
		verifyChartDate(opt);
		verifyLabels();
		compareAverage();
	}

	private void verifyChartDate(String days) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM d");
		int i = Integer.parseInt(days);
		LocalDateTime myDateObj = LocalDateTime.now().minusDays(6);
		// String formattedDate1 = myFormatObj.format(myDateObj);
		LocalDateTime mydateobj2 = LocalDateTime.now().minusDays(7);
		LocalDateTime mydate14days = LocalDateTime.now().minusDays(13);
		String formateDatesev = myFormatObj.format(mydateobj2);
		String formateDatefou = myFormatObj.format(mydate14days);
		String currdate = myFormatObj.format(myDateObj).concat("toToday");
		Reporter.logWithScreenShot("Formated date 14days    " + formateDatefou.concat("to").concat(formateDatesev));

		Reporter.logWithScreenShot("Current date  " + currdate);
		Reporter.logWithScreenShot(
				"Get the date last 14 days " + getNFKProgresspageDateonCompPiechart().get(0).getText());
		Reporter.logWithScreenShot("Get date till today " + getNFKProgresspageDateonCompPiechart().get(1).getText());
		String date = formateDatefou.concat("to").concat(formateDatesev);
		Assert.assertEquals(getNFKProgresspageDateonCompPiechart().get(0).getText().replaceAll("\\n", ""), date);
		Assert.assertEquals(getNFKProgresspageDateonCompPiechart().get(1).getText().replaceAll("\\n", ""), currdate);
		LFSUtilsAndroid.waitforLoad();

	}

	private void compareAverage() {
		Assert.assertEquals(getNFKProgresspageComprCurrAvgVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.avg.value"));
		Assert.assertEquals(getNFKProgresspageComprCurrAvgVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.avg.value"));
		Assert.assertEquals(getNFKProgresspageComprPreAvgVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.avg.value"));
		// Gmi
		Assert.assertTrue(getNFKProgresspageComprCurrGmiVal().getText().equals("--%"));
		Assert.assertTrue(getNFKProgresspageComprPreGmiVal().getText().equals("--%"));
		// Percent values
		Assert.assertEquals(getNFKProgresspageComprLowPreVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.low.per"));
		Assert.assertEquals(getNFKProgresspageComprLowCurrVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.low.per"));
		Assert.assertEquals(getNFKProgresspageComprInrangePreVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.inrange.per"));
		Assert.assertEquals(getNFKProgresspageComprInrangeCurrVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.inrange.per"));
		LFSUtilsAndroid.swipeWithCoordinates(300, 800, 443, 500, 50);
		Assert.assertEquals(getNFKProgresspageComprHighPreVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.high.per"));
		Assert.assertEquals(getNFKProgresspageComprHighCurrVal().getText(),
				LFSUtilsAndroid.getPropString("my.progress.high.per"));
		Reporter.logWithScreenShot("User has Compared the Average value and GMI", MessageTypes.Pass);

	}

	private void verifyLabels() {
		getNFKProgresspageComprGlucoseLbl().assertPresent("Glucose Average label");
		getNFKProgresspageComprGmiLbl().assertPresent("GMI label");
		getNFKProgresspageLowLbl().assertPresent("Low label");
		getNFKProgresspageInrangeLbl().assertPresent("Inrange label");
		LFSUtilsAndroid.swipePage();
		getNFKProgresspageHighLbl().assertPresent("High label");

	}

	private void clickComparebtn() {
		getNFKProgresspageSwitchBtn().waitForPresent(200);
		getNFKProgresspageSwitchBtn().isDisplayed();
		getNFKProgresspageSwitchBtn().click();
		LFSUtilsAndroid.pause(1000);
	}

	public void noDataProgressScreen() {
		getNFKProgresspageButtonsList().get(0).isEnabled();
		getNFKProgresspageSwitchBtn().assertDisabled("Switch button is Disabled");
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),
				LFSUtilsAndroid.getPropString("my.progress.data.txt"));
		Assert.assertEquals(getNFKProgresspageNoSensordataTxt().getText(),
				LFSUtilsAndroid.getPropString("my.progress.msg.nodata"));
		Assert.assertEquals(getNFKProgresspageLowagpTitleLbl().get(0).getText(),
				LFSUtilsAndroid.getPropString("my.progress.low.lbl"));
		Assert.assertEquals(getNFKProgresspageDescpNodataTxt().get(0).getText(),
				LFSUtilsAndroid.getPropString("my.progress.low.nodata.txt"));
		Assert.assertEquals(getNFKProgresspageLowagpTitleLbl().get(1).getText(),
				LFSUtilsAndroid.getPropString("my.progress.agp.txt"));
		Assert.assertEquals(getNFKProgresspageDescpNodataTxt().get(1).getText(),
				LFSUtilsAndroid.getPropString("my.progress.agp.nodata.txt"));
		getNFKProgresspageInfoIcon().get(0).isPresent();
		getNFKProgresspageInfoIcon().get(0).click();
		getNFKProgresspageLowSlideupTxt().assertPresent("Low text on Slideup");
		getNFKProgresspageSlideupCloseBtn().click();
		getNFKProgresspageInfoIcon().get(1).isPresent();
		getNFKProgresspageInfoIcon().get(1).click();
		getNFKProgresspageLowSlideupTxt().assertPresent("AGP text Slideup");
		getNFKProgresspageSlideupCloseBtn().click();
		Reporter.logWithScreenShot("User has verified the My Progress Screen when No CGM Data is present",
				MessageTypes.Pass);
	}

	public void textNoData() {
		getNFKProgresspageButtonsList().get(1).click();
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),
				LFSUtilsAndroid.getPropString("my.progress.data.14.txt"));
		getNFKProgresspageButtonsList().get(2).click();
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),
				LFSUtilsAndroid.getPropString("my.progress.data.30.txt"));
		getNFKProgresspageButtonsList().get(3).click();
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),
				LFSUtilsAndroid.getPropString("my.progress.data.60.txt"));
		getNFKProgresspageButtonsList().get(4).click();
		getNFKProgresspageAvailabledayLbl().assertPresent("90 days Text");

	}

	public void verifyAGPsection() {
		waitForPageToLoad();
		getNFKProgresspageButtonsList().get(1).click();
		getNFKProgresspageButtonsList().get(1).isEnabled();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();

		Assert.assertEquals(getNFKProgresspageCardTitle().get(1).getText(),
				LFSUtilsAndroid.getPropString("my.progress.glucose.profile"));
		Assert.assertEquals(getNFKProgresspageCardDescription().get(1).getText(),
				LFSUtilsAndroid.getPropString("my.progress.glucose.desc"));
		Assert.assertEquals(getNFKProgresspageCardTitle().get(2).getText(),
				LFSUtilsAndroid.getPropString("my.progress.daily.glucose.profile"));

		Assert.assertEquals(getNFKProgresspageCardDescription().get(2).getText(),
				LFSUtilsAndroid.getPropString("my.progress.daily.glucose.desc"));
		LFSUtilsAndroid.waitforLoad();
		getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.disclaimer.AGP.txt"))
				.assertPresent("Disclaimer of AGP");
		Reporter.logWithScreenShot("Verified the AGP report Section", MessageTypes.Pass);
	}

	public void verifyGlucoseProfile() {
		LFSUtilsAndroid.waitforLoad();
		getNFKProgresspageCardTitle().get(1).click();
		LFSUtilsAndroid.pause(5000);
		Reporter.logWithScreenShot("Glucose Profile Report ", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifyDailyGlucoseProfile() {
		LFSUtilsAndroid.waitforLoad();
		getNFKProgresspageCardTitle().get(2).click();
		LFSUtilsAndroid.pause(5000);
		Assert.assertEquals(getNFKProgresspageTitleReport().getText(),
				LFSUtilsAndroid.getPropString("my.progress.daily.glucose.profile"));
		Reporter.logWithScreenShot("Daily glucose profile Report", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifyViewFullAGpReport() {
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.clickWithText("View full AGP Report");
		LFSUtilsAndroid.pause(5000);
		Assert.assertEquals(getNFKProgresspageTitleReport().getText(),
				LFSUtilsAndroid.getPropString("my.progress.agp.report"));
		Reporter.logWithScreenShot("Full AGP Report", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifyNoOfLowEvents() {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		Assert.assertEquals(getNFKProgresspageTitles().get(0).getText(), "Total Events");
		Reporter.logWithScreenShot("Total no. of Events are " + getNFKProgresspageContents().get(0).getText(),
				MessageTypes.Pass);
		Assert.assertEquals(getNFKProgresspageTitles().get(1).getText(), "Lowest Reading");
		Assert.assertEquals(getNFKProgresspageContents().get(1).getText(), "56 mg/dL");
		Assert.assertEquals(getNFKProgresspageTitles().get(2).getText(), "Average Duration");
		Assert.assertEquals(getNFKProgresspageContents().get(2).getText(), "16m");
		Assert.assertEquals(getNFKProgresspageTitles().get(3).getText(), "Most Events");
		Assert.assertEquals(getNFKProgresspageContents().get(3).getText(), "3AM–6AM");
		Reporter.logWithScreenShot("Verified the Low Events", MessageTypes.Pass);
	}

	// Rushikesh
	// Method to verify 7 days button is enabled or not
	public void verify7Daysbydefault() {
		getNFKiosMyProgressRange7DaysBtn().isEnabled();
		Reporter.logWithScreenShot("7 days button is enabled", MessageTypes.Pass);
	}

	// Rushikesh
	// check AGP info by clicking on i icon
	public void verifyAGPIndoOnSlideup() {
		try {
			LFSUtilsAndroid.click(getNFKProgressPageAgpInformationIcon());
			getNFKProgresspageTitleLbl().verifyPresent();
			getNFKProgresspageLowSlideupTxt().verifyPresent();
			LFSUtilsAndroid.click(getNFKProgresspageSlideupCloseBtn());
			Reporter.logWithScreenShot("Successfully verified AGP Info On SlideUp", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify AGP Info On SlideUp", MessageTypes.Pass);
		}
	}

	public void verifyProgressScreenwithnewlyselcted() {
		try {
			LFSUtilsAndroid.click(getNFKProgresspageRange14DayBtn());
			getNFKProgresspageRange14DayBtn().isEnabled();

			Reporter.logWithScreenShot("Verify progress screen with newly selected", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify progress screen with newly selected", MessageTypes.Fail);
		}
	}

	public void select14day() {
		try {
			LFSUtilsAndroid.click(getNFKProgresspageRange14DayBtn());
			getNFKProgresspageRange14DayBtn().isEnabled();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Verify selected 14 day", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify selected 14 day", MessageTypes.Fail);
		}

	}

	// Shubham
	// Method to user verify app not load the AGP report
	public void userVerifyAppNotLoadTheAGPReport() {
		try {
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.click(getNFKProgresspageAGPTxt());
			getNFKProgresspageAGPTxt().verifyPresent();
			Reporter.logWithScreenShot("user verify selected 14 day", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to user selected 14 day", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To verify compair switch toggle
	public void compairSwitchToggle() {
		LFSUtilsAndroid.click(getNFKProgresspageSwitchBtn());
	}

//	Shubham
//	Method To verify CGM readings
	public void verifyCGMReadings() {
		try {
			getNFKProgresspagePiechart().verifyPresent();
			getNFKProgresspageGlucoseValuePeriodBtn().verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.low.reading")))
					.verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.inRange.reading")))
					.verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.high.reading")))
					.verifyPresent();
			Reporter.logWithScreenShot("Verify CGM readings", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify CGM readings", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To verify CGM and GMI readings
	public void verifyCGMAndGMIReadings() {
		try {
			getNFKProgresspagePiechart().verifyPresent();
			getNFKProgresspageGlucoseValuePeriodBtn().verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.GMI.reading")))
					.verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.low.reading")))
					.verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.inRange.reading")))
					.verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.high.reading")))
					.verifyPresent();
			Reporter.logWithScreenShot("Verify CGM and GMI  readings", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify CGM and GMI readings", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To verify selects 30 day
	public void select30Day() {
		LFSUtilsAndroid.click(getNFKProgresspage30DayBtn());

	}

//	Shubham
//	Method To verify selects 60 day
	public void select60Day() {
		LFSUtilsAndroid.click(getNFKProgresspage60DayBtn());
	}

//	Shubham
//	Method To verify selects 90 day
	public void select90Day() {
		LFSUtilsAndroid.click(getNFKProgresspage90DayBtn());
	}

//	Shubham
//	Method To verify reading in minutes and hour
	public void verifyReadingsInMinutesAndHour() {
		try {
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.low.readingInHour")))
					.verifyPresent();
			getNFKProgresstabStaticText(
					ConfigurationManager.getBundle().getString(("progresspage.inRange.readingInHour"))).verifyPresent();
			getNFKProgresstabStaticText(ConfigurationManager.getBundle().getString(("progresspage.high.readingInHour")))
					.verifyPresent();
			LFSUtilsAndroid.click(getNFKProgresspageInformationIconBtn());
			getNFKProgresspageInformationIconTextBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKProgresspageSlideupCloseBtn());
			Reporter.logWithScreenShot("Verify readings in minute and hour", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify readings in minute and hour", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To verify not enough data text
	public void verifyNotEnoughDataText() {
		getNFKProgresspageNoSensordataTxt().verifyPresent();
	}

	public void verifyProgressTab() {
		LFSUtilsAndroid.click(getNFKhomepageProgresstab());
	}

	// Rushikesh
	// Method to verify daily glucose profile section
	public void verifyDailyGlucoseProfileSection() {
		try {
			LFSUtilsAndroid.waitforLoad();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			Assert.assertEquals(getNFKProgresspageCardTitle().get(2).getText(),
					LFSUtilsAndroid.getPropString("my.progress.daily.glucose.profile"));

			Assert.assertEquals(getNFKProgresspageCardDescription().get(2).getText(),
					LFSUtilsAndroid.getPropString("my.progress.daily.glucose.desc"));
			getNFKProgresspageCardTitle().get(2).click();
			LFSUtilsAndroid.pause(5000);
			Assert.assertEquals(getNFKProgresspageTitleReport().getText(),
					LFSUtilsAndroid.getPropString("my.progress.daily.glucose.profile"));
			Reporter.logWithScreenShot("Daily glucose profile Report", MessageTypes.Pass);
			LFSUtilsAndroid.clickBackButton();
			Reporter.logWithScreenShot("Successfully verified daily glucose profile section", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify daily glucose profile section", MessageTypes.Fail);
		}
	}
	//Rushikesh
		//Method to verify 7 days button is enabled or not
		public void verify7DaysSelectedAsBydefault() {
			try {
			getNFKProgresspageButtonsList().get(0).isEnabled();
			Reporter.logWithScreenShot("7 days button is enabled",MessageTypes.Pass);
			}catch(Exception e) {
			Reporter.logWithScreenShot("7 days button is not enabled",MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to verify glucose average value
		public void verifyGlucoseAverageValue() {
			try {
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.average.value")).verifyPresent();;
				Reporter.logWithScreenShot("Successfully verified Glucose Average Value",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify Glucose Average Value",MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to verify Glucose Management Indicator Field
		public void verifyGlucoseManagementIndicatorField() {
			try {
				getNFKProgresspageAvergaesLbl().get(2).verifyPresent();
				getNFKProgressPageGmiInfoIcon().verifyPresent();
				Reporter.logWithScreenShot("Successfully verified GMI Field",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify GMI Field",MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to verify Glucose Management Indicator Slideup Screen
		public void verifyGlucoseManagementIndicatorSlideupScreen() {
			try {
				LFSUtilsAndroid.click(getNFKProgressPageGmiInfoIcon());
				getNFKProgresspageTitleLbl().verifyPresent();
				getNFKProgresspageLowSlideupTxt().verifyPresent();
				getNFKProgressPageGmiSlideUpFootNoteLabel().verifyPresent();
				LFSUtilsAndroid.click(getNFKProgresspageSlideupCloseBtn());
				Reporter.logWithScreenShot("Successfully verified GMI slideUp screen",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify GMI slideUp screen",MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to verify range doughnut chart and low, inRange, High labels
		public void verifyRangesDoughnutChart() {
			try {
				getNFKProgresspagePiechart().verifyPresent();
				getNFKProgresspageLowLbl().verifyPresent();
				getNFKProgresspageInrangeLbl().verifyPresent();
				getNFKProgresspPageHighLabel().verifyPresent();
				Reporter.logWithScreenShot("Successfully verified Ranges Doughnut Chart and low,inRange,High labels",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify Ranges Doughnut Chart and low,inRange,High labels",MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to check the low, inRange , and highRange reading while we are stuffing data for 7 days when target range70-180
		public void verifyLowInrangeHighRangeReadingWhenTargetRangeIs70_180() {
			try {
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.lowRange.percentage")).verifyPresent();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.inRange.percentage")).verifyPresent();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.highRange.percentage")).verifyPresent();
				Reporter.logWithScreenShot("Successfully verified low,inRange,High range readings",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify low,inRange,High range readings",MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to verify average time in range per day
		public void AverageTimeInRangePerDay() {
			try {
				LFSUtilsAndroid.swipeWithScreenPercent(95, 75, 5, 75, 7);
				LFSUtilsAndroid.waitforLoad();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.lowRange.averageTime")).verifyPresent();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.inRange.averageTime")).verifyPresent();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.highRange.averageTime")).verifyPresent();
				Reporter.logWithScreenShot("Successfully verified average time in range per day",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify average time in range per day",MessageTypes.Fail);
			}
		}
				
		//Rushikesh
		//Method to check the low, inRange , and highRange reading while we are stuffing data for 7 days when target range is 100-190mg/dL
		public void verifyLowInrangeHighRangeReadingWhenTargetRangeIs100_190() {
			try {
				LFSUtilsAndroid.swipeWithScreenPercent(5, 75, 95, 75, 7);
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.lowRange.percentage.targetRange100_190")).verifyPresent();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.inRange.percentage.targetRange100_190")).verifyPresent();
				getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.highRange.percentage.targetRange100_190")).verifyPresent();
				Reporter.logWithScreenShot("Successfully verified low,inRange,High range readings",MessageTypes.Pass);
				}catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify low,inRange,High range readings",MessageTypes.Fail);
			}
		}
}