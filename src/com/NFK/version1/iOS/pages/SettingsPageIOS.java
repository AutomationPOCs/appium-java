package com.NFK.version1.iOS.pages;

import org.hamcrest.Matchers;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.hamcrest.Matchers;
import org.openqa.selenium.Point;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.EventDetailBeans;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.RandomStringGenerator;
import com.qmetry.qaf.automation.util.Randomizer;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class SettingsPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	MoremenuPageIOS moreMenuIos = new MoremenuPageIOS();
	List<Integer> a1cValues = new ArrayList<Integer>();
	
	HomePageIOS home = new HomePageIOS();

	@FindBy(locator = "NFKios.settingspage.genderMale.btn")
	private QAFWebElement NFKiosSettingspageGenderMaleBtn;

	@FindBy(locator = "NFKios.settingspage.genderFemale.btn")
	private QAFWebElement NFKiosSettingspageGenderFemaleBtn;

	@FindBy(locator = "NFKios.settingspage.mealTagging.swch")
	private QAFWebElement NFKiosSettingspageMealTaggingSwch;

	@FindBy(locator = "NFKios.settingspage.Setting.lbl")
	private QAFWebElement NFKiosSettingspageLabel;
	
	@FindBy(locator = "NFKios.settingspage.togglebtn")
	private List<QAFWebElement> NFKiosSettingspageTogglebtn;
	
	@FindBy(locator="NFKios.settingspage.usersettings.btn")
	private QAFWebElement NFKiosSettingspageUsersettingsBtn;
	
	@FindBy(locator = "NFKios.settingspage.beforeMeal.btn")
	private QAFWebElement NFKiosSettingspageBeforeMealBtn;

	@FindBy(locator = "NFKios.settingspage.afterMeal.btn")
	private QAFWebElement NFKiosSettingspageAfterMealBtn;

	@FindBy(locator = "NFKios.settingspage.back.btn")
	private QAFWebElement NFKiosSettingspageBackBtn;

	@FindBy(locator = "NFKios.settingspage.mealTagging.btm")
	private QAFWebElement NFKiosSettingspageMealTaggingBtm;

	@FindBy(locator = "NFKios.settingspage.range.picker")
	private QAFWebElement NFKiosSettingspageRangePicker;
	@FindBy(locator = "NFKios.settingspage.Done")
	private List<QAFWebElement> NFKiosSettingspageBeforemealDoneBtnList;
	@FindBy(locator = "NFKios.settingspage.rangepicker.forwardarrow.btn")
	private QAFWebElement NFKiosSettingspagerangepickerForwardarrowBtn;
	@FindBy(locator = "NFKios.settingspage.rangepicker.done.btn")
	private QAFWebElement NFKiosSettingspageRangePickerDoneBtn;
	@FindBy(locator = "NFKios.settingspage.beforemeal.forwardarrow.btn")
	private List<QAFWebElement> NFKiosSettingspageBeforemealForwardarrowBtnList;
	@FindBy(locator = "NFKios.settingspage.beforemeal.range text.lbl")
	private QAFWebElement NFKiosSettingspageBeforemealRangeLbl;
	@FindBy(locator = "NFKios.settingspage.glucose.range")
	private QAFWebElement NFKiosSettingspageGlucoseRange;
	
	@FindBy(locator="NFKios.settingspage.usersettingspage.range.title")
	private QAFWebElement NFKiosSettingspageUsersettingspageRangeTitle;
	
	@FindBy(locator = "NFKios.settingspage.rangepicker.backwardarrow.btn")
    private QAFWebElement NFKiosSettingspageRangepickerBackwardarrowBtn;
	@FindBy(locator = "NFKios.settingspage.aftermeal.range text.lbl")
	private QAFWebElement NFKiosSettingspageAfteremealRangeLbl;
	@FindBy(locator = "NFKios.settingspage.Done")
	private List<QAFWebElement> NFKiosSettingspageDone;
	@FindBy(locator = "NFKios.settingspage.timeOfDay.Breakfast")
	private QAFWebElement NFKiosSettingspageTimeOfDayBreakfast;
	@FindBy(locator = "NFKios.settingspage.timeOfDay.Hour")
	private QAFWebElement NFKiosSettingspageTimeOfDayHour;
    @FindBy(locator="NFKios.settingspage.log.insulin.togglebtn")
    private QAFWebElement NFKiosSettingspageLogInsulinToggleBtn;
	
	@FindBy(locator = "NFKios.settingspage.timeOfDay.over.begin")
	private QAFWebElement NFKiosSettingspageTimeOfDayOverBegin;

	@FindBy(locator = "NFKios.settingspage.timeOfDay.over.end")
	private QAFWebElement NFKiosSettingspageTimeOfDayUverEnd;

	@FindBy(locator = "NFKios.settingspage.timeOfDay.Breakfast.end")
	private QAFWebElement NFKiosSettingspageTimeOfDayBreakfastEnd;
	@FindBy(locator = "NFKios.settingspage.timeOfDay.Breakfast.lbl")
	private QAFWebElement NFKiosSettingspageTimeOfDayBreakfastLbl;
	@FindBy(locator = "NFKios.settingspage.insulin.btn")
	private QAFWebElement NFKiosSettingspageInsulinSwitch;

	@FindBy(locator = "NFKios.settingspage.beforemeal.picker2")
	private QAFWebElement NFKiosSettingspageBeforemealPicker2;
	@FindBy(locator = "NFKios.settingspage.selected.gender.male.btn")
	private QAFWebElement NFKiosSettingspageSelectedGenderMaleBtn;
	@FindBy(locator = "NFKios.settingspage.selected.gender.female.btn")
	private QAFWebElement NFKiosSettingspageSelectedGenderFemaleBtn;
	@FindBy(locator = "NFKios.settingspage.selected.diabetestype.type1.btn")
	private QAFWebElement NFKiosSettingspageSelectedDiabetesTypeType1Btn;
	@FindBy(locator = "NFKios.settingspage.selected.diabetestype.type2.btn")
	private QAFWebElement NFKiosSettingspageSelectedDiabetesTypeType2Btn;
	@FindBy(locator = "NFKios.settingspage.selected.diabetestype.gestational.btn")
	private QAFWebElement NFKiosSettingspageSelectedDiabetesTypeGestationalBtn;
	@FindBy(locator = "NFKios.settingspage.select.diabetestype.popup.type1.btn")
	private QAFWebElement NFKiosSettingspageSelectDiabetestypePopupType1Btn;
	@FindBy(locator = "NFKios.settingspage.select.diabetestype.popup.type2.btn")
	private QAFWebElement NFKiosSettingspageSelectDiabetestypePopupType2Btn;
	@FindBy(locator = "NFKios.settingspage.select.diabetestype.popup.cancle.btn")
	private QAFWebElement NFKiosSettingspageSelectDiabetestypePopupCancleBtn;
	@FindBy(locator = "NFKios.settingspage.select.diabetestype.popup.ok.btn")
	private QAFWebElement NFKiosSettingspageSelectDiabetestypePopupOkBtn;
	@FindBy(locator = "NFKios.settingspage.bg.overall.pkr")
	private QAFWebElement NFKiosSettingspageBgOverallPkr;
    @FindBy(locator="NFKios.settingspage.Events.title")
    private QAFWebElement NFKiosSettingspageEventsTitle;
	@FindBy(locator = "NFKios.settingspage.staticText.lbl")
	private QAFWebElement NFKiosSettingspageStatictextLbl;
    @FindBy(locator="NFKios.settingspage.systemsettings.btn")
    private QAFWebElement NFKiosSettingspageSystemsettingsBtn; 
	@FindBy(locator = "NFKios.settingspage.diabetiesquestion.chk.btn")
	private QAFWebElement NFKiosSettingspageDiabetiesquestionChkBtn;
    @FindBy(locator="NFKios.settingspage.overlay.event.timeline.togglebtn")
    private QAFWebElement NFKiosSettingspageOverlayEventTimelineToggleBtn;
	@FindBy(locator = "NFKios.settingspage.alertbtn.btn")
	private QAFWebElement NFKiosSettingspageAlertbtnBtn;
	public QAFWebElement getNFKiosSettingspageStatictextLbl(String string) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.staticText.lbl", string);
	}
	public QAFWebElement getNFKiosSettingspageDiabetiesquestionChkBtn() {
		return NFKiosSettingspageDiabetiesquestionChkBtn;
	}
	public QAFWebElement getNFKiosSettingspageAlertbtnBtn() {
		return NFKiosSettingspageAlertbtnBtn;
	}
	public QAFWebElement getNFKiosSettingspageLowbgvalueLbl() {
		return NFKiosSettingspageLowbgvalueLbl;
	}
	public QAFWebElement getNFKiosSettingspageHighbgvalueLbl() {
		return NFKiosSettingspageHighbgvalueLbl;
	}
	public QAFWebElement getNFKiosSettingspageOveralrangeLbl() {
		return NFKiosSettingspageOveralrangeLbl;
	}
	public QAFWebElement getNFKiosSettingspageOveralrangeBtn() {
		return NFKiosSettingspageOveralrangeBtn;
	}
	public QAFWebElement getNFKiosSettingspageDiabetiesquestionBtn() {
		return NFKiosSettingspageDiabetiesquestionBtn;
	}
	public QAFWebElement getNFKiosSettingspageBgGoalTxt(String string) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.bg.goal.txt", string);
	}
	public QAFWebElement getNFKiosSettingspageStepsGoalTxt(String string) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.steps.goal.txt", string);
	}
	public QAFWebElement getNFKiosSettingspageCarbsGoalTxt(String string) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.carbs.goal.txt", string);
	}
	public QAFWebElement getNFKiosSettingspageActivityGoalTxt(String string) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.activity.goal.txt", string);
	}

	@FindBy(locator = "NFKios.settingspage.watchDiet.btn")
	private QAFWebElement NFKiosSettingspageWatchDietBtn;

	
	public QAFWebElement getNFKiosSettingspageWatchDietBtn() {
		return NFKiosSettingspageWatchDietBtn;
	}
	
	@FindBy(locator = "NFKios.settingspage.oralMed.btn")
	private QAFWebElement NFKiosSettingspageOralMedBtn;

	
	public QAFWebElement getNFKiosSettingspageOralMedBtn() {
		return NFKiosSettingspageOralMedBtn;
	}

	@FindBy(locator = "NFKios.settingspage.lowBgValue.lbl")
	private QAFWebElement NFKiosSettingspageLowbgvalueLbl;

	@FindBy(locator = "NFKios.settingspage.highBgValue.lbl")
	private QAFWebElement NFKiosSettingspageHighbgvalueLbl;

	@FindBy(locator = "NFKios.settingspage.overalRange.lbl")
	private QAFWebElement NFKiosSettingspageOveralrangeLbl;

	@FindBy(locator = "NFKios.settingspage.overalRange.btn")
	private QAFWebElement NFKiosSettingspageOveralrangeBtn;
    
	@FindBy(locator="NFKios.settingspage.usersettings.gender.title")
	private QAFWebElement NFKiosSettingspageUsersettingsGenderTitle;
	
	@FindBy(locator = "NFKios.settingspage.diabetiesquestion.btn")
	private QAFWebElement NFKiosSettingspageDiabetiesquestionBtn;

	@FindBy(locator = "NFKios.settingspage.bg.goal.txt")
	private QAFWebElement NFKiosSettingspageBgGoalTxt;

	@FindBy(locator = "NFKios.settingspage.steps.goal.txt")
	private QAFWebElement NFKiosSettingspageStepsGoalTxt;

	@FindBy(locator = "NFKios.settingspage.carbs.goal.txt")
	private QAFWebElement NFKiosSettingspageCarbsGoalTxt;

	@FindBy(locator = "NFKios.settingspage.activity.goal.txt")
	private QAFWebElement NFKiosSettingspageActivityGoalTxt;

	@FindBy(locator = "NFKios.settingspage.systemsetting.awardtracker.lbl")
	private QAFWebElement NFKiosSettingspageSystemsettingAwardtrackerLbl;

	@FindBy(locator = "NFKios.settingspage.systemsetting.awardtracker.txt")
	private QAFWebElement NFKiosSettingspageSystemsettingAwardtrackerTxt;

	@FindBy(locator = "NFKios.settingspage.systemsetting.awardtracker.on.btn")
	private QAFWebElement NFKiosSettingspageSystemsettingAwardtrackerOnBtn;

	@FindBy(locator = "NFKios.settingspage.systemsetting.awardtracker.off.btn")
	private QAFWebElement NFKiosSettingspageSystemsettingAwardtrackerOffBtn;
    

	@FindBy(locator = "NFKios.settingspage.systemsetting.awardtracker.seeaward.btn")
	private QAFWebElement NFKiosSettingspageSystemsettingAwardtrackerSeeawardBtn;

	@FindBy(locator = "NFKios.settingspage.systemsetting.btn")
	private QAFWebElement NFKiosSettingspageSystemsettingBtn;

	@FindBy(locator = "NFKios.settingspage.usersetting.btn")
	private QAFWebElement NFKiosSettingspageUsersettingBtn;

	@FindBy(locator = "NFKios.settingspage.a1c.txt")
	private QAFWebElement NFKiosSettingspageA1cTxt;
	
	@FindBy(locator = "NFKios.settingspage.bg.goal.input.txt")
	private QAFWebElement NFKiosSettingspageBgGoalInputTxt;
	
	@FindBy(locator = "NFKios.settingspage.carbs.goal.input.txt")
	private QAFWebElement NFKiosSettingspageCarbsGoalInputTxt;
	
	@FindBy(locator = "NFKios.settingspage.steps.goal.input.txt")
	private QAFWebElement NFKiosSettingspageStepsGoalInputTxt;
	
	@FindBy(locator = "NFKios.settingspage.activity.goal.input.txt")
	private QAFWebElement NFKiosSettingspageActivityGoalInputTxt;
	
	@FindBy(locator = "NFKios.settingspage.bg.goal.lbl")
	private QAFWebElement NFKiosSettingspageBgGoalLbl;
	
	@FindBy(locator = "NFKios.settingspage.steps.goal.lbl")
	private QAFWebElement NFKiosSettingspageStepsGoalLbl;
	
	@FindBy(locator = "NFKios.settingspage.carbs.goal.lbl")
	private QAFWebElement NFKiosSettingspageCarbsGoalLbl;
	
	@FindBy(locator = "NFKios.settingspage.activity.goal.lbl")
	private QAFWebElement NFKiosSettingspageActivityGoalLbl;

	@FindBy(locator= "NFKios.settingspage.CurrentReading.title")
	private QAFWebElement NFKiosSettingspageCurrentReadingtitle;
	
	@FindBy(locator="NFKios.settingspage.BubbleAnimations.text")
	private QAFWebElement NFKiosSettingspageBubbleAnimationstext;
	
	
	@FindBy (locator="NFKios.settingspage.BubbleAnimations.btn")
	private QAFWebElement NFKiosSettingspageBubbleAnimationsbtn;
	
	//system settings
	@FindBy(locator="NFKios.settingspage.current.lbl")
	private QAFWebElement  NFKiosSettingspageCurrentLbl;
	@FindBy(locator="NFKios.settingspage.title.lbl")
	private List<QAFWebElement> NFKiosSettingspageTitleLbl ;
	@FindBy(locator="NFKios.settingspage.switch.btn")
	private List<QAFWebElement> NFKiosSettingspageSwitchBtn;
	@FindBy(locator="NFKios.settingspage.animation.msg.lbl")
	private QAFWebElement NFKiosSettingspageAnimationMsgLbl;
	@FindBy(locator="NFKios.settingspage.1hr.btn")
	private QAFWebElement NFKiosSettingspage1hrBtn;
	@FindBy(locator="NFKios.settingspage.4hr.btn")
	private QAFWebElement  NFKiosSettingspage4hrBtn;
	@FindBy(locator="NFKios.settingspage.8hr.btn")
	private QAFWebElement  NFKiosSettingspage8hrBtn;
	@FindBy(locator="NFKios.settingspage.12hr.btn")
	private QAFWebElement NFKiosSettingspage12hrBtn;
	@FindBy(locator="NFKios.settingspage.24hr.btn")
	private QAFWebElement NFKiosSettingspage24hrBtn;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	public QAFWebElement getNFKiosSettingspageCurrentLbl() {
		return NFKiosSettingspageCurrentLbl;
	}
	public List<QAFWebElement> getNFKiosSettingspageTitleLbl() {
		return NFKiosSettingspageTitleLbl;
	}
	public List<QAFWebElement> getNFKiosSettingspageSwitchBtn() {
		return NFKiosSettingspageSwitchBtn;
	}
	public QAFWebElement getNFKiosSettingspageAnimationMsgLbl() {
		return NFKiosSettingspageAnimationMsgLbl;
	}
	public QAFWebElement getNFKiosSettingspage1hrBtn() {
		return NFKiosSettingspage1hrBtn;
	}
	public QAFWebElement getNFKiosSettingspage4hrBtn() {
		return NFKiosSettingspage4hrBtn;
	}
	public QAFWebElement getNFKiosSettingspage8hrBtn() {
		return NFKiosSettingspage8hrBtn;
	}
	public QAFWebElement getNFKiosSettingspage12hrBtn() {
		return NFKiosSettingspage12hrBtn;
	}
	public QAFWebElement getNFKiosSettingspage24hrBtn() {
		return NFKiosSettingspage24hrBtn;
	}
	public QAFWebElement getNFKiosSettingspageBgOverallPkr() {
		return NFKiosSettingspageBgOverallPkr;
	}
    
	public QAFWebElement getNFKiosSettingspageUsersettingsGenderTitle() {
		return NFKiosSettingspageUsersettingsGenderTitle;
	}
	
	public QAFWebElement getNFKiosSettingspageBeforemealPicker2() {
		return NFKiosSettingspageBeforemealPicker2;
	}
     
	
	public List<QAFWebElement> getNFKiosSettingspageTogglebtn() {
		return NFKiosSettingspageTogglebtn;
	}
	public QAFWebElement getNFKsettingspageCurrentReadingtitle() {
		return NFKiosSettingspageCurrentReadingtitle;	
	}
	
	public QAFWebElement getNFKsettingspageBubbleAnimationstext() {
		return NFKiosSettingspageBubbleAnimationstext;
	}
	
	public QAFWebElement getNFKiosSettingspageInsulinSwitch() {
		return NFKiosSettingspageInsulinSwitch;
	}
     
	public QAFWebElement getNFKiosSettingspageLogInsulinToggleBtn() {
		return NFKiosSettingspageLogInsulinToggleBtn;
	}
	public QAFWebElement getNFKiosSettingspageOverlayEventTimelineToggleBtn() {
		return NFKiosSettingspageOverlayEventTimelineToggleBtn;
	}
	public QAFWebElement getNFKiosSettingspageUsersettingsBtn() {
		return NFKiosSettingspageUsersettingsBtn;
	}
	public QAFWebElement getNFKiosSettingspageAfteremealRangeLbl() {
		return NFKiosSettingspageAfteremealRangeLbl;
	}

	public QAFWebElement getNFKiosSettingspageBeforemealRangeLbl() {
		return NFKiosSettingspageBeforemealRangeLbl;
	}

	public QAFWebElement getNFKiossettingpageglucoseRange() {
		return NFKiosSettingspageGlucoseRange;
	}
	
	@FindBy(locator = "NFKios.settingspage.Cancel.Btn")
	private QAFWebElement NFKiosSettingspageCancelBtn;
	
	public QAFWebElement NFKiosSettingspageRangepickerBackwardarrowBtn() {
		return NFKiosSettingspageRangepickerBackwardarrowBtn;
	}
	
    public QAFWebElement getNFKiosSettingspageSystemsettingsBtn() {
    	return NFKiosSettingspageSystemsettingsBtn;
    }
	public QAFWebElement getNFKiosSettingspageGenderMaleBtn() {
		return NFKiosSettingspageGenderMaleBtn;
	}

	public QAFWebElement getNFKiosSettingspageGenderFemaleBtn() {
		return NFKiosSettingspageGenderFemaleBtn;
	}

	public QAFWebElement getNFKiosSettingspageMealTaggingSwch() {
		return NFKiosSettingspageMealTaggingSwch;
	}
	
	public QAFWebElement getNFKiosSettingspageLabel() {
		return NFKiosSettingspageLabel;
	}

	public QAFWebElement getNFKiosSettingspageBeforeMealBtn() {
		return NFKiosSettingspageBeforeMealBtn;
	}

	public QAFWebElement getNFKiosSettingspageAfterMealBtn() {
		return NFKiosSettingspageAfterMealBtn;
	}
    
	public QAFWebElement getNFKiosSettingspageBubbleAnimationsbtn() {
		return NFKiosSettingspageBubbleAnimationsbtn;
	}
	public QAFWebElement getNFKiosSettingspageBackBtn() {
		return NFKiosSettingspageBackBtn;
	}
    public QAFWebElement getNFKiosSettingspageUsersettingspageRangeTitle()
    {
    	return NFKiosSettingspageUsersettingspageRangeTitle;
    }
	public QAFWebElement getNFKiosSettingspageMealTaggingBtm() {
		return NFKiosSettingspageMealTaggingBtm;
	}

	public QAFWebElement getNFKiosSettingspageRangePicker() {
		return NFKiosSettingspageRangePicker;
	}

	public List<QAFWebElement> getNFKiosSettingspageDone() {
		return NFKiosSettingspageDone;
	}

	public List<QAFWebElement> getNFKiosSettingspageBeforemealDoneBtnList() {
		return NFKiosSettingspageBeforemealDoneBtnList;
	}

	public QAFWebElement getNFKiosSettingspagerangepickerForwardarrowBtn() {
		return NFKiosSettingspagerangepickerForwardarrowBtn;
	}
	
	public QAFWebElement getNFKiosSettingsRangePickerDoneBtn() {
		return NFKiosSettingspageRangePickerDoneBtn;
	}
	
	public List<QAFWebElement> getNFKiosSettingspageBeforemealForwardarrowBtnList() {
		return NFKiosSettingspageBeforemealForwardarrowBtnList;
	}

	public QAFWebElement getNFKiossettingpageStaticTextlbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.staticText.lbl", text);
	}
    public QAFWebElement getNFKiosSettingspageEventsTitle() {
    	return NFKiosSettingspageEventsTitle;
    }
	public QAFWebElement getNFKiosSettingspageTimeOfDayBreakfast() {
		return NFKiosSettingspageTimeOfDayBreakfast;
	}

	public QAFWebElement getNFKiosSettingspageTimeOfDayHour() {
		return NFKiosSettingspageTimeOfDayHour;
	}

	public QAFWebElement getNFKiosSettingspageTimeOfDayOverBegin() {
		return NFKiosSettingspageTimeOfDayOverBegin;
	}

	public QAFWebElement getNFKiosSettingspageTimeOfDayUverEnd() {
		return NFKiosSettingspageTimeOfDayUverEnd;
	}

	public QAFWebElement getNFKiosSettingspageTimeOfDayBreakfastEnd() {
		return NFKiosSettingspageTimeOfDayBreakfastEnd;
	}

	public QAFWebElement getNFKiosSettingspageTimeOfDayBreakfastLbl() {
		return NFKiosSettingspageTimeOfDayBreakfastLbl;
	}
	public QAFWebElement getNFKiossettingpageDiabetesQuestionchkbox(String text) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.diabetiesquestion.chk.btn",
				text);
	}
	public QAFWebElement getNFKiossettingpageDiabetesQuestionbtn(String text) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.diabetiesquestion.btn", text);
	}
	public QAFWebElement getNFKiossettingpageAlertStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.settingspage.alertbtn.btn", text);
	}
	public QAFWebElement getNFKiossettingpageOkBtn() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.staticText.lbl",
				LFSUtilsIOS.getPropString("appCommon.ok"));
	}
	public QAFWebElement getNFKiosSettingspageBeforemealDoneBtn() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.staticText.lbl",
				LFSUtilsIOS.getPropString("appCommon.done"));
	}
	public QAFWebElement getNFKiosSettingspageHighBgValu() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.highBgValue.lbl",
				LFSUtilsIOS.getPropString("appCommon.high"));
	}
	public QAFWebElement getNFKiosSettingspageLowBgValue() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.lowBgValue.lbl",
				LFSUtilsIOS.getPropString("appCommon.low"));
	}

	public QAFWebElement getNFKiosSettingspageOverallRangeLbl() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.overalRange.lbl",
				LFSUtilsIOS.getPropString("more.aboutme.targetRange.overall"));
	}
	public QAFWebElement getNFKiosSettingspageOverallRangeBtn() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.overalRange.btn",
				LFSUtilsIOS.getPropString("more.aboutme.targetRange.overall"));
	}

	public QAFWebElement getNFKiosSettingspageSelectedGenderMaleBtn() {
		return NFKiosSettingspageSelectedGenderMaleBtn;
	}

	public QAFWebElement getNFKiosSettingspageSelectedGenderFemaleBtn() {
		return NFKiosSettingspageSelectedGenderFemaleBtn;
	}

	public QAFWebElement getNFKiosSettingspageSelectedDiabetesTypeType1Btn() {
		return NFKiosSettingspageSelectedDiabetesTypeType1Btn;
	}
    
	public QAFWebElement getNFKiosSettingspageSelectedDiabetesTypeType2Btn() {
		return NFKiosSettingspageSelectedDiabetesTypeType2Btn;
	}

	public QAFWebElement getNFKiosSettingspageSelectedDiabetesTypeGestationalBtn() {
		return NFKiosSettingspageSelectedDiabetesTypeGestationalBtn;
	}

	public QAFWebElement getNFKiosSettingspageSelectDiabetestypePopupType1Btn() {
		return NFKiosSettingspageSelectDiabetestypePopupType1Btn;
	}

	public QAFWebElement getNFKiosSettingspageSelectDiabetestypePopupType2Btn() {
		return NFKiosSettingspageSelectDiabetestypePopupType2Btn;
	}

	public QAFWebElement getNFKiosSettingspageSelectDiabetestypePopupCancleBtn() {
		return NFKiosSettingspageSelectDiabetestypePopupCancleBtn;
	}

	public QAFWebElement getNFKiosSettingspageSelectDiabetestypePopupOkBtn() {
		return NFKiosSettingspageSelectDiabetestypePopupOkBtn;
	}

	public QAFWebElement getNFKiosSettingspageSystemsettingAwardtrackerLbl() {
		return NFKiosSettingspageSystemsettingAwardtrackerLbl;
	}
	public QAFWebElement getNFKiosSettingspageSystemsettingAwardtrackerTxt() {
		return NFKiosSettingspageSystemsettingAwardtrackerTxt;
	}
	public QAFWebElement getNFKiosSettingspageSystemsettingAwardtrackerOnBtn() {
		return NFKiosSettingspageSystemsettingAwardtrackerOnBtn;
	}
	public QAFWebElement getNFKiosSettingspageSystemsettingAwardtrackerOffBtn() {
		return NFKiosSettingspageSystemsettingAwardtrackerOffBtn;
	}
	public QAFWebElement getNFKiosSettingspageSystemsettingAwardtrackerSeeawardBtn() {
		return NFKiosSettingspageSystemsettingAwardtrackerSeeawardBtn;
	}
	public QAFWebElement getNFKiosSettingspageSystemsettingBtn() {
		return NFKiosSettingspageSystemsettingBtn;
	}
	public QAFWebElement getNFKiosSettingspageUsersettingBtn() {
		return NFKiosSettingspageUsersettingBtn;
	}
	public QAFWebElement getNFKiosSettingspageA1cTxt() {
		return NFKiosSettingspageA1cTxt;
	}

	public QAFWebElement getNFKiosSettingspageBgGoalInputTxt() {
		return NFKiosSettingspageBgGoalInputTxt;
	}
	public QAFWebElement getNFKiosSettingspageCarbsGoalInputTxt() {
		return NFKiosSettingspageCarbsGoalInputTxt;
	}
	public QAFWebElement getNFKiosSettingspageStepsGoalInputTxt() {
		return NFKiosSettingspageStepsGoalInputTxt;
	}
	public QAFWebElement getNFKiosSettingspageActivityGoalInputTxt() {
		return NFKiosSettingspageActivityGoalInputTxt;
	}
	public QAFWebElement getNFKiosSettingspageBgGoalLbl() {
		return NFKiosSettingspageBgGoalLbl;
	}
	public QAFWebElement getNFKiosSettingspageStepsGoalLbl() {
		return NFKiosSettingspageStepsGoalLbl;
	}
	public QAFWebElement getNFKiosSettingspageCarbsGoalLbl() {
		return NFKiosSettingspageCarbsGoalLbl;
	}
	public QAFWebElement getNFKiosSettingspageActivityGoalLbl() {
		return LFSUtilsIOS.getElement("NFKios.settingspage.staticText.lbl",
				LFSUtilsIOS.getPropString("settings.goals.activity"));
	}
	public QAFWebElement getNFKsettingspageCancelBtn() {
		return NFKiosSettingspageCancelBtn;
	}
	
	// Method to verify setting screen
	public void settingsScreen() {
		Reporter.logWithScreenShot("Setting screen1", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 800, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
	}

	// click on setting
	public void verifySettingUI() {
		//verify setting screen

		getNFKiosSettingspageLabel().waitForPresent();
		getNFKiosSettingspageLabel().verifyVisible("Settings screen");
		getNFKiosSettingspageSystemsettingsBtn().isPresent();
		if(getNFKiosSettingspageSystemsettingsBtn().isEnabled())
		{
			Reporter.logWithScreenShot("The user is on System settings Page", MessageTypes.Pass);
		}
		else
			Reporter.logWithScreenShot("The user is not on System settings Page", MessageTypes.Fail);
	}
	
	public void verifyBubbleAnimation() {
		getNFKsettingspageCurrentReadingtitle().verifyPresent("Current Reading Title");
		getNFKsettingspageCurrentReadingtitle().waitForPresent(2000);
		getNFKsettingspageBubbleAnimationstext().verifyPresent("Bubble animations Ttile");
		;
		getNFKsettingspageBubbleAnimationstext().waitForPresent(2000);
		if (getNFKsettingspageBubbleAnimationstext().isEnabled()) {
			getNFKiosSettingspageBubbleAnimationsbtn().click();
			Reporter.log("Bubble animations toggle button disabled", MessageTypes.Pass);
		}
		else {
			getNFKiosSettingspageBubbleAnimationsbtn().click();
			Reporter.log("Bubble animations toggle button enabled", MessageTypes.Pass);
		}
	}

	//analyze the target glucose range

	public void verifyTargetRange() {
		getNFKiossettingpageglucoseRange().waitForPresent();
		Reporter.logWithScreenShot("Verified default glucose range", MessageTypes.Pass);
	}
	
	//analyze the target glucose range

	public void analyzesensorValue(Object settingdetail) {
		
		EventDetailBeans eventbean= new EventDetailBeans(); 
		if (settingdetail instanceof String) {

			eventbean.fillFromConfig((String) settingdetail);
		} else {
			eventbean.fillData(settingdetail);
		} 
		String value1= getNFKiossettingpageglucoseRange().getText().replaceAll("\\s+", "");
		String value2= eventbean.getGlucosecompareios().replaceAll("\\s+", ""); 
			
        //value2=value2.replaceAll("-", "");
		Validator.verifyThat("Sensor range compare",
                		  value1,
           				Matchers.equalTo(value2));
                 Reporter.logWithScreenShot("Sensor range compared ", MessageTypes.Pass);
	}
	
	public void clickOnCancle()
	{
		getNFKiossettingpageglucoseRange().click();
		getNFKsettingspageCancelBtn().waitForPresent();
		getNFKsettingspageCancelBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user has clicked on Cancel button ",MessageTypes.Pass);
	}
	
	public void verifyUserSettingsScreen()
	{
		
		if(getNFKiosSettingspageUsersettingspageRangeTitle().isPresent() && getNFKiosSettingspageUsersettingsGenderTitle().isPresent())
		 Reporter.logWithScreenShot("Verified User Setting screen", MessageTypes.Pass);
		else
		 Reporter.logWithScreenShot("User setting screen is not displayed", MessageTypes.Fail);
	}
	
	//Verify edited target ranges

	public void verifyEditedTargetRanges(Object updatedrange) {
		EventDetailBeans eventbean= new EventDetailBeans();
		if (updatedrange instanceof String) {

			eventbean.fillFromConfig((String) updatedrange);
		} else {
			eventbean.fillData(updatedrange);
		}
		String value1= getNFKiossettingpageglucoseRange().getText();
        String delmg="mg/dL";
        String delmm="mmol/L";
		String newvalue=value1.replace(delmg,"");
		String v3=(eventbean.getLowglucosevalue()+eventbean.getDash()+eventbean.getHighglucosevalue());
		if(newvalue.contains(v3))
		{
			Reporter.logWithScreenShot("Verifed the target ranges ", MessageTypes.Pass);
		}
		else
			Reporter.logWithScreenShot("Target ranges are different then edited range ", MessageTypes.Fail);
		
	}
	
	public void clickOnMaleButton() {
		scrollToElementSettingScreen(getNFKiosSettingspageGenderMaleBtn());
		getNFKiosSettingspageGenderMaleBtn().click();

	}

	public void verifySelectedMaleButton() {
		getNFKiosSettingspageGenderFemaleBtn().click();
		getNFKiosSettingspageGenderMaleBtn().click();
		Reporter.logWithScreenShot("Male button is selected", MessageTypes.Pass);
	}

	public void clickOnFemaleButton() {
		if (getNFKiosSettingspageGenderFemaleBtn().isPresent()) {
			getNFKiosSettingspageGenderFemaleBtn().click();
		}
	}

	public void verifySelectedFemaleButton() {
		getNFKiosSettingspageGenderMaleBtn().click();
		getNFKiosSettingspageGenderFemaleBtn().click();
		Reporter.logWithScreenShot("Female button is selected", MessageTypes.Pass);

	}


	
	// Diabetes Management questions
	// Updated by Gaurav Bhamare
	
	
	public void verifyDiabeticQuestions() {
//		getNFKiosSettingspageUsersettingBtn().click();
//		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
//		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
//		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		
	//	getNFKiosSettingspageWatchDietBtn().click();
		try {
		scrollToElementSettingScreen(getNFKiossettingpageDiabetesQuestionbtn(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		getNFKiossettingpageDiabetesQuestionbtn(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump"))
						.waitForPresent();
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.oralMedication")));
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.injectOther")));
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.longActing")));
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		diabetesChekBoxState(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.rapidActing")));
		Reporter.logWithScreenShot("Choices Selected", MessageTypes.Pass);
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

	public void ToClickDoneBtn() {
		getNFKiosSettingspageDone().get(0).waitForPresent();
		for (QAFWebElement ele : getNFKiosSettingspageDone()) {
			if (LFSUtilsIOS.tryMethod(ele)) {
				ele.click();
				break;
			} else {

			}
		}
	}

	// For scrolling Time of Day view
	// Manjushri
	public void scrllToTimeOfDay(String str) {
		scrollToElementSettingScreen(getNFKiosSettingspageTimeOfDayBreakfastLbl());
	}

	// Changing Begin time
	public void changeBeginTime() {
		String str = LFSUtilsIOS.getPropString("more.aboutme.graph.header");
		if (getNFKiosSettingspageTimeOfDayBreakfastLbl().isPresent()) {
			LFSUtilsIOS.pause(1000);
			getNFKiosSettingspageTimeOfDayBreakfast().click();
			Reporter.logWithScreenShot("BreskFast Begin time", MessageTypes.Pass);
			getNFKiosSettingspageTimeOfDayHour().verifyPresent();
			getNFKiosSettingspageTimeOfDayHour().sendKeys("6");
			ToClickDoneBtn();
			Reporter.logWithScreenShot("Time Changed", MessageTypes.Pass);

			// reset to default value
			getNFKiosSettingspageTimeOfDayBreakfast().click();
			getNFKiosSettingspageTimeOfDayHour().verifyPresent();
			getNFKiosSettingspageTimeOfDayHour().sendKeys("5");
			LFSUtilsIOS.selectTimePicker(getNFKiosSettingspageTimeOfDayHour(), 5);
			ToClickDoneBtn();
			Reporter.logWithScreenShot("Time Changed back", MessageTypes.Pass);
		}
	}


	// Method to select insulin tab
	public void clickInsuliSwitch() {
		scrollToElementSettingScreen(getNFKiosSettingspageInsulinSwitch());
		Reporter.logWithScreenShot("Insulin switch before clicking", MessageTypes.Pass);
		getNFKiosSettingspageInsulinSwitch().click();
		Reporter.logWithScreenShot("Insulin switch clicked", MessageTypes.Pass);

	}

	// Method to scroll to element on setting screen
	// Milan
	public void scrollToElementSettingScreen(QAFWebElement element) {

		//getNFKiosSettingspageMealTaggingSwch().waitForPresent();
				//if (getNFKiosSettingspageMealTaggingSwch().getAttribute("visible")
		
				getNFKiosSettingspageUsersettingspageRangeTitle().waitForPresent();
				if (getNFKiosSettingspageUsersettingspageRangeTitle().getAttribute("visible")
						.equalsIgnoreCase("true")) {
					int count = 0;
					while (!(element.getAttribute("visible").equalsIgnoreCase("true"))) {
						LFSUtilsIOS.swipeWithScreenPercent(20, 80, 25, 40, 1);
						count++;
						if (count == 20)
							break;
					}
				} else {
					int count = 0;
					while (!(element.getAttribute("visible").equalsIgnoreCase("true"))) {
						LFSUtilsIOS.swipeWithCoordinates(496, 932, 443, 800, 1500);
						LFSUtilsIOS.pause(1000);
						count++;
						if (count == 20)
							break;
					}
				}


	}
	// Method to scroll up
	public void scrollUpSettingScreen(QAFWebElement element) {
		int count = 0;
		while (!(element.getAttribute("visible").equalsIgnoreCase("true"))) {

			LFSUtilsIOS.scrollUp();
			count++;
			if (count == 5)
				break;
		}
	}
	// Method to set blood glucose
	// Milan
	public void selectBG(int value) {
		LFSUtilsIOS.selectTimePicker(getNFKiosSettingspageRangePicker(), value);
		Reporter.logWithScreenShot("Set BG range", MessageTypes.Pass);
		getNFKiosSettingspageBeforemealDoneBtn().click();
		if (LFSUtilsIOS.tryMethod(getNFKiossettingpageOkBtn())) {
			getNFKiossettingpageOkBtn().click();
		}
	}

	

	// Method to verify app show mmol/L for canada on setting page
	// Milan
	public void verifyCandammol() {
		if (LFSUtilsIOS.tryMethod(getNFKiosSettingspageBeforeMealBtn())) {
			getNFKiosSettingspageMealTaggingSwch().click();
		}
		WebDriverTestCase.verifyTrue(
				getNFKiosSettingspageOverallRangeLbl().getAttribute("name")
						.contains("mmol/L"),
				"mmol/L as unit not present for canada",
				"mmol/L as unit present for canada");
	}

	public void clickOnAllCheckboxes() {
		try {
			LFSUtilsIOS.waitforLoad();
		scrollToElementSettingScreen(getNFKiossettingpageDiabetesQuestionbtn(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		getNFKiossettingpageDiabetesQuestionbtn(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump"))
						.waitForPresent();
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.oralMedication")));
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.injectOther")));
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.longActing")));
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		selectCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.rapidActing")));
       getNFKiossettingpageAlertStaticText(LFSUtilsIOS.getPropString("appCommon.no")).waitForPresent(2000);
			Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
			LFSUtilsIOS.clickWithText((LFSUtilsIOS.getPropString("appCommon.no").toString()));
		}
		catch(Exception e)
		{
		    Reporter.logWithScreenShot("User is unable to check the check boxes",MessageTypes.Fail); 	
		}   
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("After checked", MessageTypes.Pass);
	}

	public void selectCheckBox(QAFWebElement element) {
		if (element.isPresent()) {
			element.click();
		}
		else {
			Reporter.log("The user is not able to select the Checkboxes");
		}
	}

	public void uncheckCheckBox(QAFWebElement element) {
		if (element.getAttribute("value").contains("1")) {
			element.click();
		}
		else {
			Reporter.log("The user is not able to select the Checkboxes");
		}
	}

	public boolean diabetesChekBoxState(QAFWebElement element) {
		boolean flag = false;
		if (element.getAttribute("value").contains("1")) {
			flag = true;

		}
		return flag;
	}

	public void uncheckAllCheckboxes() {
//		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
//		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
//		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
//		LFSUtilsIOS.waitforLoad();		
		//getNFKiosSettingspageWatchDietBtn().click();
		
		scrollToElementSettingScreen(getNFKiossettingpageDiabetesQuestionbtn(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		getNFKiossettingpageDiabetesQuestionbtn(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump"))
						.waitForPresent();
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.oralMedication")));
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.injectOther")));
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.longActing")));
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(
				LFSUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		uncheckCheckBox(getNFKiossettingpageDiabetesQuestionchkbox(LFSUtilsIOS
				.getPropString("more.aboutme.diabetesManagement.rapidActing")));
		
		Reporter.logWithScreenShot("Choices unselected", MessageTypes.Pass);
	}

	// SG Method to Navigate back from settings menus to screen settings opened
	// from
	public void navigateBackFromSettings() {
		MoremenuPageIOS moremenuPageIOS = new MoremenuPageIOS();
		getNFKiosSettingspageBackBtn().click();
		moremenuPageIOS.getNFKiosMoremenupageSettingsBtn().waitForPresent();
		getNFKiosSettingspageBackBtn().click();
		Reporter.logWithScreenShot("navigated back", MessageTypes.Pass);
	}
	
	// method to verify selected gender and diabetes type on settings page
		public void verifySelectedGenderAndDiabetesTypeOnSettingsPage() {
			String selectedGender = ConfigurationManager.getBundle()
					.getString("singupScreen.selected.gender");
			String selectedDiabetesType = ConfigurationManager.getBundle()
					.getString("singupScreen.selected.diabetes type");		
			//scrollToElementSettingScreen(getNFKiosSettingspageSelectedGenderMaleBtn());
			try {
			if (selectedGender.equals("MALE")) {
				
				WebDriverTestCase.verifyTrue(
						getNFKiosSettingspageSelectedGenderMaleBtn().getAttribute("name")
								.equals("Male"),
						"Male button is not enabled", "Male button is enabled");
			} else {
				WebDriverTestCase.verifyTrue(
						getNFKiosSettingspageSelectedGenderFemaleBtn().getAttribute("name")
								.equals("Female"),
						"Female button is not enabled", "Female button is enabled");
			}}
		   catch (Exception e) {
			e.printStackTrace();
		}
			
			//scrollToElementSettingScreen(	getNFKiosSettingspageSelectedDiabetesTypeType2Btn());
			try {
				if (selectedDiabetesType.contains("TYPE 1")) {
					WebDriverTestCase.verifyTrue(
							getNFKiosSettingspageSelectedDiabetesTypeType1Btn()
									.getAttribute("value").equals("1"),
							"Type 1 button is not enabled", "Type 1button is enabled");
				} else {
					WebDriverTestCase.verifyTrue(
							getNFKiosSettingspageSelectedDiabetesTypeType2Btn()
									.getAttribute("value").equals("1"),
							"Type 2 button is not enabled", "Type 2 button is enabled");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
	// method to verify gestational type for male on settings page
	public void verifyGestationalTypeForMaleOnSettings() {
		scrollToElementSettingScreen(getNFKiosSettingspageSelectedGenderMaleBtn());
		getNFKiosSettingspageSelectedGenderMaleBtn().waitForPresent();
		getNFKiosSettingspageSelectedGenderMaleBtn().click();
		String confirmYourDiabetesTypePopUp =
				LFSUtilsIOS.getPropString("alerts.gender.selectDiabetesType.message");
		getNFKiossettingpageStaticTextlbl(confirmYourDiabetesTypePopUp).waitForPresent();
		getNFKiossettingpageStaticTextlbl(confirmYourDiabetesTypePopUp).verifyPresent(
				"To change the gender selection, please confirm your diabetes type.");
		getNFKiosSettingspageSelectDiabetestypePopupType1Btn().verifyPresent("Type 1");
		getNFKiosSettingspageSelectDiabetestypePopupType2Btn().verifyPresent("Type 2");
		getNFKiosSettingspageSelectDiabetestypePopupCancleBtn().verifyPresent("Cancle");
		getNFKiosSettingspageSelectDiabetestypePopupOkBtn().verifyPresent("Ok");
		getNFKiosSettingspageSelectDiabetestypePopupCancleBtn().click();
		scrollToElementSettingScreen(
				getNFKiosSettingspageSelectedDiabetesTypeGestationalBtn());
		if (getNFKiosSettingspageSelectedGenderFemaleBtn().getAttribute("value")
				.equalsIgnoreCase("1")
				&& getNFKiosSettingspageSelectedDiabetesTypeGestationalBtn()
						.getAttribute("value").equalsIgnoreCase("1")) {
			Reporter.logWithScreenShot(
					"Female and Gestational type is already selected after clicking on cancle",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Wrong gender and diabetes type is selected after clicking on cancle",
					MessageTypes.Fail);
		}
		getNFKiosSettingspageSelectedGenderMaleBtn().click();
		getNFKiosSettingspageSelectDiabetestypePopupType1Btn().click();
		getNFKiosSettingspageSelectDiabetestypePopupOkBtn().click();
		getNFKiosSettingspageSelectedGenderMaleBtn().waitForPresent();
		if (getNFKiosSettingspageSelectedGenderMaleBtn().getAttribute("value")
				.equalsIgnoreCase("1")
				&& getNFKiosSettingspageSelectedDiabetesTypeType1Btn()
						.getAttribute("value").equalsIgnoreCase("1")) {
			Reporter.logWithScreenShot(
					"Male and Type 1 selected after clicking OK button",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Wrong gender and diabetes type is selected after clicking Ok Button",
					MessageTypes.Fail);
		}
		getNFKiosSettingspageSelectedDiabetesTypeGestationalBtn()
				.verifyDisabled("Gestational type is disabled for male gender");
		Reporter.logWithScreenShot(
				"Gestational type is disabled for male on settings page",
				MessageTypes.Pass);
	}
	public void userRedirectsToRequiredSettings(String obj) {

		switch (obj) {

			case "User Settings" :
				String getData = obj;
				ConfigurationManager.getBundle().setProperty("settings.tab", getData);
				getNFKiosSettingspageStatictextLbl(
						LFSUtilsIOS.getPropString("settings.tab"))
								.verifyPresent("User Settings tab is present");
				getNFKiosSettingspageStatictextLbl(
						LFSUtilsIOS.getPropString("settings.tab")).click();
				break;

			case "System Settings" :
				String getData1 = obj;
				ConfigurationManager.getBundle().setProperty("settings.tab", getData1);
				getNFKiosSettingspageStatictextLbl(LFSUtilsIOS
						.getPropString(LFSUtilsIOS.getPropString("settings.tab")))
								.verifyPresent("System Settings tab is present");
				getNFKiosSettingspageStatictextLbl(
						LFSUtilsIOS.getPropString("settings.tab")).click();
				break;
		}

	}
	
	public void verifyAwardsModule() {
		getNFKiosSettingspageSystemsettingBtn()
				.verifyPresent("System Settings tab is present");
		getNFKiosSettingspageSystemsettingAwardtrackerLbl()
				.verifyPresent("Award tracker logo is present");
		getNFKiosSettingspageSystemsettingAwardtrackerTxt()
				.verifyPresent("Award tracker text is present");
	}

	public void verifyChangesForAwardSetting() {
		if (getNFKiosSettingspageSystemsettingAwardtrackerOnBtn().isPresent()) {
			getNFKiosSettingspageSystemsettingAwardtrackerOnBtn().click();
			Reporter.logWithScreenShot("Both Button is displayed", MessageTypes.Pass);
		}
		if (getNFKiosSettingspageSystemsettingAwardtrackerOffBtn().isPresent()) {
			getNFKiosSettingspageSystemsettingAwardtrackerOffBtn().click();
			Reporter.logWithScreenShot("off Button is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Awards tracker page is not displayed",
					MessageTypes.Fail);
		}

	}
	public void verifyAppAndUserSetting() {
		getNFKiosSettingspageStatictextLbl(
				LFSUtilsIOS.getPropString("settings.systemSettings")).verifyPresent();
		getNFKiosSettingspageStatictextLbl(
				LFSUtilsIOS.getPropString("settings.userSettings")).verifyPresent();
		getNFKiosSettingspageStatictextLbl(
				LFSUtilsIOS.getPropString("settings.userSettings")).click();
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("user settings clicked", MessageTypes.Pass);
		getNFKiosSettingspageStatictextLbl(
				LFSUtilsIOS.getPropString("settings.systemSettings")).click();
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("system settings clicked", MessageTypes.Pass);
		moreMenuIos.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("common.backbuttontext"))
								.click();

	}
	public void verifyUnableToAdd180Data() {
		EventLogPageIOS logbookPageIOS = new EventLogPageIOS();
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		logbookPageIOS.getNFKiosEventLogPageActivityIntensityBtn()
				.verifyPresent("Select date button is present");
		logbookPageIOS.getNFKiosEventLogPageActivityIntensityBtn().click();
		LFSUtilsIOS.waitforLoad();
		int getYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int backYear = getYear - 1;
		String getMonth = LFSUtilsIOS.getCurrentMonth();
		String getIntMonth = LFSUtilsIOS.monthIntValue(getMonth);
		try {
			Reporter.logWithScreenShot("Date displayed before selecting 120 days event date",MessageTypes.Pass);
			signupPageIOS.getNFKiosSignuppageTimingpickerYearPkr()
					.sendKeys(backYear + "");
			Reporter.logWithScreenShot("Date displayed after selecting 120 days event date",
					MessageTypes.Pass);
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(
					signupPageIOS.getNFKiosSignuppageTimingpickerYearPkr(),
					Integer.parseInt(backYear + ""));
		}
		if (signupPageIOS.getNFKiosSignuppageTimingpickerYearPkr().getAttribute("value")
				.toString().contains(backYear + "")
				&& signupPageIOS.getNFKiosSignuppageBirthdayMonthPkr()
						.getAttribute("value").toString().contains(getMonth)) {
			Reporter.logWithScreenShot("User is able to add A1C data beyond 120 days.",
					MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is not able to add A1C data beyond 120 days",
					MessageTypes.Pass);
	}
	
	public void clickSystemSetting() {
		getNFKiosSettingspageStatictextLbl(
				LFSUtilsIOS.getPropString("settings.systemSettings"))
						.verifyPresent("System Settings button is present");
		getNFKiosSettingspageStatictextLbl(
				LFSUtilsIOS.getPropString("settings.systemSettings")).click();
		Reporter.logWithScreenShot("System settings page is displayed",
				MessageTypes.Pass);
	}
	
	
		public void verifyUserSetting()
		{	
				getNFKiosSettingspageUsersettingsBtn().isPresent();
				LFSUtilsIOS.click(getNFKiosSettingspageUsersettingsBtn());
				Reporter.logWithScreenShot("The user is on User Settings screen", MessageTypes.Pass);
		}
		public void verifyEventsVisibility(String option) {
			
			EventLogPageIOS logbook = new EventLogPageIOS();
		/*	QAFWebElement getValue1 =
					logbook.getNFKiosLogbookPageStaticText((String) LFSUtilsIOS
							.getPropString("settings.events.log.insulin").subSequence(0, 11));
			QAFWebElement getValue2= logbook.getNFKiosLogbookPageStaticText((String)LFSUtilsIOS
					.getPropString("settings.events.overlay.timeline").subSequence(0,26));*/
			getNFKiosSettingspageEventsTitle().waitForPresent();
			getNFKiosSettingspageEventsTitle().verifyPresent("Events section is present");
			LFSUtilsIOS.waitforLoad();
			option = option.toUpperCase();
			
		
			switch (option) {
				case "ENABLED" :
					try {
					if (getNFKiosSettingspageTogglebtn().get(1).isPresent() && getNFKiosSettingspageTogglebtn().get(2).isPresent()) {
						getNFKiosSettingspageTogglebtn().get(1).verifyPresent("The Toggle button for Log Insulin ");
						getNFKiosSettingspageTogglebtn().get(1).verifyEnabled("The Toggle button for Log Insulin ");
						getNFKiosSettingspageTogglebtn().get(1).verifyPresent("The Toggle button for Overlay Events on Timeline ");
						getNFKiosSettingspageTogglebtn().get(1).verifyEnabled("The Toggle button forOverlay Events on Timeline ");
					   Reporter.logWithScreenShot("Buttons are Enabled",MessageTypes.Pass);
					}
					else {
						Reporter.log("The button Log Insulin and Overlay Event are Disabled", MessageTypes.Fail);
					}
					}
			     catch (Exception e) {
				    e.printStackTrace();
			  }	
					break;

				case "DISABLED" :
					try {
					if (getNFKiosSettingspageTogglebtn().get(1).isDisplayed() & getNFKiosSettingspageTogglebtn().get(2).isDisplayed()) {
						//getNFKiosSettingspageTogglebtn().get(1).verifyDisabled("The Toggle button for Log Insulin ");
					    //getNFKiosSettingspageTogglebtn().get(2).verifyDisabled("The Toggle button for Overlay Events on Timeline is Disabled");
					getNFKiosSettingspageTogglebtn().get(1).getAttribute("value").equals("0");
					getNFKiosSettingspageTogglebtn().get(2).getAttribute("value").equals("0");
					 Reporter.logWithScreenShot("The Toggle buttons are disabled",MessageTypes.Pass);
					}
					else{
						Reporter.log("The button Log Insulin and Overlay Event are Disabled", MessageTypes.Fail);
					}                  }catch (Exception e) {
						e.printStackTrace();
					}
					break;
			}
		}
		public void clicksBackButton() {
			try {
				getNFKiosSettingspageBackBtn().isPresent();
				getNFKiosSettingspageBackBtn().click();
				Reporter.logWithScreenShot("User clicked on Back Button", MessageTypes.Pass);
			} catch (Exception e) {
				LFSUtilsIOS.clickWithText("BACK");
				Reporter.logWithScreenShot("Back button clicked ", MessageTypes.Pass);
				LFSUtilsIOS.waitforLoad();

			}
			
		}
		public void clickOnEvents(String option) {
			option = option.toUpperCase();
			
			//LFSUtilsIOS.clickWithText("Log Insulin");
			switch (option) {
				case "ENABLED" :
					if(!(getNFKiosSettingspageTogglebtn().get(1).isEnabled() & getNFKiosSettingspageTogglebtn().get(2).isEnabled()))
						{
						getNFKiosSettingspageTogglebtn().get(1).click();
						   getNFKiosSettingspageTogglebtn().get(2).click();
						}
					break;
					
				case "DISABLED":
					try {
						if(getNFKiosSettingspageTogglebtn().get(1).isPresent() & getNFKiosSettingspageTogglebtn().get(2).isPresent())
					      {	
							getNFKiosSettingspageTogglebtn().get(1).click();
						   getNFKiosSettingspageTogglebtn().get(2).click();
						   Reporter.logWithScreenShot("The user has diabled the Toggle button", MessageTypes.Pass);
						 }
						 else {
							Reporter.log("The user is unable to click on Overlay toggle button",MessageTypes.Fail);
						 }
					}catch (Exception e) {
						Reporter.log("The user unable to Click on toggle buttons",MessageTypes.Fail);
					
						
					break;		}			
			}
}
		
		public void verifyUOMonUserSetting(String uom){
			//String uom1=uom.replaceAll("\\\\","");
		
			if(uom.equals("mmol/L"))
	    	  {	
				String getsubstr=getNFKiossettingpageglucoseRange().getText().substring(8).replaceAll("\\s", "");
			Assert.assertEquals(getsubstr,uom);
			    	Reporter.logWithScreenShot("User has set "+uom+" UOM", MessageTypes.Pass);
					
			}
			else
				{
				String getsubstr=getNFKiossettingpageglucoseRange().getText().substring(7);
				if(getsubstr.equals(uom))
				{
			    	Reporter.logWithScreenShot("User has set "+uom+" UOM", MessageTypes.Pass);
				}
				else
					Reporter.logWithScreenShot("Incorrect UOM is displayed", MessageTypes.Fail);
				}
		
		
		}
		public void verifiesSystemSettings() {
			getNFKiosSettingspageSystemsettingsBtn().assertPresent("System setting button");
			getNFKiosSettingspageCurrentLbl().assertPresent("Current reading label");
	Assert.assertEquals(getNFKiosSettingspageTitleLbl().get(1).getText(),LFSUtilsIOS.getPropString("settings.system.log.insulin.lbl"));
Assert.assertEquals(getNFKiosSettingspageTitleLbl().get(2).getText(),LFSUtilsIOS.getPropString("settings.events.overlay.timeline"));
				getNFKiosSettingspage1hrBtn().assertPresent("1 hr button");
			getNFKiosSettingspage4hrBtn().assertPresent("4 hr button");
			getNFKiosSettingspage8hrBtn().assertPresent("8 hr button");
			getNFKiosSettingspage12hrBtn().assertPresent("12 hr button");
			getNFKiosSettingspage24hrBtn().assertPresent("24 hr button");
			getNFKiosSettingspageLogInsulinToggleBtn().isEnabled();
		  Reporter.logWithScreenShot("User has verified the System settings page",MessageTypes.Pass);
		}
		public void changeGender() {
			try {
			
				String male=getNFKiosSettingspageSelectedGenderMaleBtn().getAttribute("value");
				String female=getNFKiosSettingspageSelectedGenderFemaleBtn().getAttribute("value");	
			if (male!=null){
				getNFKiosSettingspageSelectedGenderFemaleBtn().click();;
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.gender", "FEMALE");
			} else {
				getNFKiosSettingspageSelectedGenderMaleBtn().click();
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.gender", "MALE");
			}
		} catch (Exception e) {

		}
		LFSUtilsIOS.pause(2000);
		SignupPageIOS signupPage = new SignupPageIOS();
		signupPage.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
	}

	public void VerifyGender() {
		String selectedGender = ConfigurationManager.getBundle().getString("settingsScreen.selected.gender");
		if (selectedGender.equals("MALE")) {
			WebDriverTestCase.verifyTrue(
					getNFKiosSettingspageSelectedGenderMaleBtn().getAttribute("name").equals("Male"),
					"Male button is not enabled", "Male button is enabled");
		} else {
			WebDriverTestCase.verifyTrue(
					getNFKiosSettingspageSelectedGenderFemaleBtn().getAttribute("name").equals("Female"),
					"Female button is not enabled", "Female button is enabled");
		}
	}
	public void changediabetesType() {
		try {
			String Type1=getNFKiosSettingspageSelectedDiabetesTypeType1Btn().getAttribute("value");
			String Type2=getNFKiosSettingspageSelectedDiabetesTypeType2Btn().getAttribute("value");
			if (Type2!=null) {
				getNFKiosSettingspageSelectedDiabetesTypeType1Btn().click();
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.dType", "TYPE 1");
				Reporter.logWithScreenShot("Type Changed to Type1", MessageTypes.Pass);
			} 
			else  {
				getNFKiosSettingspageSelectedDiabetesTypeType2Btn().click();
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.dType", "TYPE 2");
				Reporter.logWithScreenShot("Type Changed to Type2", MessageTypes.Pass);
			}			
		} catch (NullPointerException e) {
			
		}
		LFSUtilsIOS.pause(2000);
		SignupPageIOS signupPage = new SignupPageIOS();
		signupPage.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();

	}
	public void VerifyDiabetesType() {
		String selecteddType = ConfigurationManager.getBundle().getString("settingsScreen.selected.dType");
		if (selecteddType.contains("TYPE 1")) {
			Reporter.logWithScreenShot("Type 1 is selected",MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Type 2 is selected",MessageTypes.Pass);
		}
	}
	//Rushikesh
    //Method to verify by default target range
    public void VerifyByDefaultTargetRange(String targetRange) {
	    try {
		   SoftAssert softAssert=new SoftAssert();
		   softAssert.assertEquals(getNFKiossettingpageglucoseRange().getText(),LFSUtilsIOS.getPropString("userSetting.targetRange"));	
		   Reporter.logWithScreenShot("Successfully verified default target rang",MessageTypes.Pass);
		   }catch(Exception e) {
		   Reporter.logWithScreenShot("Failed to verify default target range",MessageTypes.Fail);
	   }
   }
    //Rushikesh
    //Method to change the target range
    public void changeTargetRange(String targetRange) {
 	   LFSUtilsIOS.waitforLoad();
 		switch(targetRange) {
 		case "100-180 mg/dL":	
 			LFSUtilsIOS.click(getNFKiossettingpageglucoseRange());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.100low"));
 			LFSUtilsIOS.click(getNFKiosSettingsRangePickerDoneBtn());
 			break;
 		case "60–90 mg/dL":	
 			LFSUtilsIOS.click(getNFKiossettingpageglucoseRange());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.60low"));
 			LFSUtilsIOS.click(getNFKiosSettingspagerangepickerForwardarrowBtn());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.90high"));
 			LFSUtilsIOS.click(getNFKiosSettingsRangePickerDoneBtn());
 			break;
 		case "65–190 mg/dL":	
 			LFSUtilsIOS.click(getNFKiossettingpageglucoseRange());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.65low"));
 			LFSUtilsIOS.click(getNFKiosSettingspagerangepickerForwardarrowBtn());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.high190"));
 			LFSUtilsIOS.click(getNFKiosSettingsRangePickerDoneBtn());
 			break;
 		case "70–180 mg/dL":	
 			LFSUtilsIOS.click(getNFKiossettingpageglucoseRange());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.70low"));
 			LFSUtilsIOS.click(getNFKiosSettingspagerangepickerForwardarrowBtn());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.180high"));
 			LFSUtilsIOS.click(getNFKiosSettingsRangePickerDoneBtn());
 			break;
 		case "100–190 mg/dL":	
 			LFSUtilsIOS.click(getNFKiossettingpageglucoseRange());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.100low"));
 			LFSUtilsIOS.click(getNFKiosSettingspagerangepickerForwardarrowBtn());
 			getNFKiosSettingspageRangePicker().sendKeys(LFSUtilsIOS.getPropString("userSetting.change.targetRange.high190"));
 			LFSUtilsIOS.click(getNFKiosSettingsRangePickerDoneBtn());
 			break;
 		}
    }
	
		}
		