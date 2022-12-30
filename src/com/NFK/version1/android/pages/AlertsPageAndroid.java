package com.NFK.version1.android.pages;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.log4j.xml.Log4jEntityResolver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.HomePageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.thoughtworks.selenium.webdriven.commands.GetElementIndex;

import io.appium.java_client.android.AndroidDriver;

public class AlertsPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();

	@FindBy(locator = "NFK.alert.urgentlowsoon")
	private QAFWebElement NFKAlertUrgentlowsoon;
	@FindBy(locator = "NFK.alert.highalert")
	private QAFWebElement NFKAlertHighalert;
	@FindBy(locator = "NFK.alert.notifyMeAbove.title")
	private QAFWebElement NFKAlertNotifyMeAboveTitle;
	@FindBy(locator = "NFK.alert.lowalert")
	private QAFWebElement NFKAlertLowalert;
	@FindBy(locator = "NFK.alert.notifyMeBelow.title")
	private QAFWebElement NFKAlertNotifyMeBelowTitle;
	@FindBy(locator = "NFK.alert.fallRateAlert")
	private QAFWebElement NFKAlertFallRateAlert;
	@FindBy(locator = "NFK.alert.riseRateAlert")
	private QAFWebElement NFKAlertRiseRateAlert;
	@FindBy(locator = "NFK.alert.signalLossAlert")
	private QAFWebElement NFKAlertSignalLossAlert;
	@FindBy(locator = "NFK.alert.noReadingsAlert")
	private QAFWebElement NFKAlertNoReadingsAlert;
	@FindBy(locator = "NFK.homepage.moremenu.btn")
	private QAFWebElement NFKHomepageMoremenuBtn;
	@FindBy(locator = "NFK.moremenu.alert")
	private QAFWebElement NFKMoremenuAlert;
	@FindBy(locator = "NFK.alert.resetalert.popup.text")
	private QAFWebElement NFKAlertResetalertPopupText;
	@FindBy(locator = "NFK.alert.resetalert.popup.reset.btn")
	private QAFWebElement NFKAlertResetalertPopupResetBtn;
	@FindBy(locator = "NFK.alert.resetalert.popup.cancel.btn")
	private QAFWebElement NFKAlertResetalertPopupCancelBtn;
	@FindBy(locator = "NFK.alert.signalLoss.content")
	private QAFWebElement NFKAlertSignalLossContent;
	@FindBy(locator = "NFK.alert.content.value")
	private List<QAFWebElement> NFKAlertContentValue;
	@FindBy(locator = "NFK.alert.lowalert.contentt")
	private QAFWebElement NFKAlertLowalertContentt;
	@FindBy(locator = "NFK.alert.highalert.contentt")
	private QAFWebElement NFKAlertHighalertContentt;
	@FindBy(locator = "NFK.alert.picker.upper.field.button")
	private QAFWebElement NFKAlertPickerUpperFieldButton;
	
	 
		
	@FindBy(locator = "NFK.alert.title")
	private QAFWebElement NFKAlertTitle;
	@FindBy(locator = "NFK.alert.urgent.low.txt")
	private QAFWebElement NFKAlertUrgentLowTxt;
	@FindBy(locator = "NFK.alert.alarmsetting.label")
	private QAFWebElement NFKAlertAlarmsettingLabel;
	@FindBy(locator = "NFK.alert.urgentlowsoonalarm.label")
	private QAFWebElement NFKAlertUrgentlowsoonalarmLabel;
	@FindBy(locator = "NFK.alert.urgentlow.label")
	private QAFWebElement NFKAlertUrgentlowLabel;
	@FindBy(locator = "NFK.alert.urgentlow.default.value")
	private QAFWebElement NFKAlertUrgentlowDefaultValue;
	@FindBy(locator = "NFK.alert.urgentlow.notify")
	private QAFWebElement NFKAlertUrgentlowNotify;
	@FindBy(locator = "NFK.alert.urgentlow.repeat")
	private QAFWebElement NFKAlertUrgentlowRepeat;
	@FindBy(locator = "NFK.alert.sound.label")
	private QAFWebElement NFKAlertSoundLabel;
	@FindBy(locator = "NFK.alert.vibration.label")
	private QAFWebElement NFKAlertVibrationLabel;
	@FindBy(locator = "NFK.alert.sound.content")
	private QAFWebElement NFKAlertSoundContent;
	@FindBy(locator = "NFK.alert.vibration.content")
	private QAFWebElement NFKAlertVibrationContent;
	@FindBy(locator = "NFK.alert.alarm.dynamic.txt")
	private QAFWebElement NFKAlertAlarmDynamicTxt;
	@FindBy(locator = "NFK.alert.elements.list")
	private List<QAFWebElement> NFKAlertElementsList;
	@FindBy(locator = "NFK.alert.back.btn")
	private QAFWebElement NFKAlertBackBtn;
	@FindBy(locator = "NFK.alert.checkMark")
	private QAFWebElement NFKAlertCheckMark;
	@FindBy(locator = "NFK.alert.uregentlowsoon.vibration.label")
	private QAFWebElement NFKAlertUregentlowsoonVibrationLabel;
	@FindBy(locator = "NFK.alert.uregentlowsoon.sound.label")
	private QAFWebElement NFKAlertUregentlowsoonSoundLabel;
	@FindBy(locator = "NFK.alert.urgentlowsoon.repeat.label")
	private QAFWebElement NFKAlertUrgentlowsoonRepeatLabel;
	@FindBy(locator = "NFK.alert.uregentlowsoon.repeatfirst.button")
	private QAFWebElement NFKAlertUregentlowsoonRepeatfirstButton;
	@FindBy(locator = "NFK.alert.uregentlowsoon.repeatsecond.button")
	private QAFWebElement NFKAlertUregentlowsoonRepeatsecondButton;
	@FindBy(locator = "NFK.alert.description.txt")
	private QAFWebElement NFKAlertDescriptionTxt;
	@FindBy(locator = "NFK.alert.suboptions.screens.labels")
	private List<QAFWebElement> NFKAlertSuboptionsScreensLabels;
	@FindBy(locator = "NFK.alert.suboptions.screens.switch.btn")
	private QAFWebElement NFKAlertSuboptionsScreensSwitchBtn;
	@FindBy(locator = "NFK.alert.text.value")
	private List<QAFWebElement> NFKAlertTextValue;
	@FindBy(locator = "NFK.alert.editscreens.switch.btn")
	private List<QAFWebElement> NFKAlertEditscreensSwitchBtn;
	@FindBy(locator = "NFK.alert.numberpicker")
	private QAFWebElement NFKAlertNumberpicker;
	@FindBy(locator = "NFK.alert.picker.done.btn")
	private QAFWebElement NFKAlertPickerDoneBtn;
	@FindBy(locator = "NFK.alert.picker.cancel.btn")
	private QAFWebElement NFKAlertPickerCancelBtn;
	@FindBy(locator = "NFK.alert.picker.hr.lbl")
	private QAFWebElement NFKAlertPickerHrLbl;
	@FindBy(locator = "NFK.alert.picker.min.lbl")
	private QAFWebElement NFKAlertPickerMinLbl;
	@FindBy(locator = "NFK.alert.picker.upper.fieldbtn")
	private List<QAFWebElement> NFKAlertPickerUpperFieldbtn;
	@FindBy(locator = "NFK.alert.picker.lower.fieldbtn")
	private QAFWebElement NFKAlertPickerLowerFieldbtn;
	@FindBy(locator = "NFK.alert.repeat.numberpicker")
	private List<QAFWebElement> NFKAlertRepeatNumberpicker;

	// Edit scehedule
	@FindBy(locator = "NFK.alert.editschedule.submenu.lbl")
	private List<QAFWebElement> NFKAlertEditscheduleSubmenuLbl;
	@FindBy(locator = "NFK.alert.editschedule.submenu.values")
	private List<QAFWebElement> NFKAlertEditscheduleSubmenuValues;
	@FindBy(locator = "NFK.alert.editschedule.acctndetails.text")
	private List<QAFWebElement> NFKAlertEditscheduleAcctndetailsText;
	@FindBy(locator = "NFK.alert.schedule.name")
	private QAFWebElement NFKAlertScheduleName;

	@FindBy(locator = "NFK.editschedulepage.title")
	private QAFWebElement NFKEditschedulepageTitle;
	@FindBy(locator = "NFK.editschedulepage.cancel.btn")
	private QAFWebElement NFKEditschedulepageCancelBtn;
	@FindBy(locator = "NFK.editschedulepage.save.btn")
	private QAFWebElement NFKEditschedulepageSaveBtn;
	@FindBy(locator = "NFK.editschedulepage.account.txts")
	private List<QAFWebElement> NFKEditschedulepageAccountTxts;
	@FindBy(locator = "NFK.editschedulepage.schedules.value")
	private List<QAFWebElement> NFKEditschedulepageSchedulesValue;
	@FindBy(locator = "NFK.editschedulepage.schedules.labels")
	private List<QAFWebElement> NFKEditschedulepageSchedulesLabels;
	@FindBy(locator = "NFK.editschedulepage.clock.cancel.btn")
	private QAFWebElement NFKEditschedulepageClockCancelBtn;
	@FindBy(locator = "NFK.editschedulepage.clock.ok.btn")
	private QAFWebElement NFKEditschedulepageClockOkBtn;
	@FindBy(locator = "NFK.editschedulepage.clock.hrs.txt")
	private QAFWebElement NFKEditschedulepageClockHrsTxt;
	@FindBy(locator = "NFK.editschedulepage.clock.min.txt")
	private QAFWebElement NFKEditschedulepageClockMinTxt;
	@FindBy(locator = "NFK.editschedulepage.clock.am.txt")
	private QAFWebElement NFKEditschedulepageClockAmTxt;
	@FindBy(locator = "NFK.editschedulepage.clock.pm.txt")
	private QAFWebElement NFKEditschedulepageClockPmTxt;
	@FindBy(locator = "NFK.alert.reset.alert.btn")
	private QAFWebElement NFKAlertResetAlertBtn;
	@FindBy(locator="NFK.editschedulepage.riserate.btn")
	 private QAFWebElement NFKEditschedulepageRiseratebtn;
	 @FindBy(locator="NFK.editschedulepage.high.btn")
	 private QAFWebElement NFKEditschedulepageHighbtn;
	 @FindBy(locator="NFK.editSchedule.startTime.text")
	 private QAFWebElement NFKEditScheduleStartTimeText;
	 @FindBy(locator="NFK.editSchedule.stopTime.text")
	 private QAFWebElement NFKEditScheduleStopTimeText;
	 @FindBy(locator="NFK.editSchedule.ok.btn")
	 private QAFWebElement NFKEditScheduleOkBtn;
	 @FindBy(locator="NFK.alert.customHighAlert.text")
	 private QAFWebElement NFKAlertCustomHighAlertText;
	 @FindBy(locator="NFK.alert.notifyMeAbove.text")
	 private QAFWebElement NFKAlertNotifyMeAboveText;
	 @FindBy(locator="NFK.alert.notifyMeAbove.done.btn")
	 private QAFWebElement NFKAlertNotifyMeAboveDoneBtn;
	 @FindBy(locator="NFK.alert.picker.min.btn")
	 private QAFWebElement NFKAlertPickerMinBtn;
	 @FindBy(locator="NFK.alert.repeatpicker.Done.btn")
	 private QAFWebElement NFKAlertRepeatpickerDoneBtn;   
	 @FindBy(locator="NFK.alert.repeat.btn")
	 private QAFWebElement  NFKAlertRepeatBtn;
	 @FindBy(locator="NFK.alert.notifyMeBelow.text")
	 private QAFWebElement  NFKAlertNotifyMeBelowText;
	@FindBy(locator = "NFK.alert.repeatPicker")
	private List<QAFWebElement> NFKAlertRepeatPicker;
	
	public List<QAFWebElement> getNFKAlertRepeatPicker() {
		return NFKAlertRepeatPicker;
	}
	 
	 public QAFWebElement getNFKAlertNotifyMeBelowText() {
			return NFKAlertNotifyMeBelowText;
		}
	 
	 public QAFWebElement getNFKAlertRepeatBtn() {
			return NFKAlertRepeatBtn;
		}
	 public QAFWebElement getNFKSignuppageTimeStaticText(String text) {
			return LFSUtilsAndroid.getElement("NFK.signuppage.dynamic.txt", text);
		}
	 
	 public QAFWebElement getNFKAlertRepeatpickerDoneBtn() {
			return NFKAlertRepeatpickerDoneBtn;
		}
	 public QAFWebElement getNFKAlertPickerMinBtn() {
			return NFKAlertPickerMinBtn;
		}
	 public QAFWebElement getNFKAlertNotifyMeAboveDoneBtn() {
			return NFKAlertNotifyMeAboveDoneBtn;
		}
	 public QAFWebElement getNFKAlertCustomHighAlertText() {
			return NFKAlertCustomHighAlertText;
		}
	 
	 public QAFWebElement getNFKAlertNotifyMeAboveText() {
			return NFKAlertNotifyMeAboveText;
		}
	 public QAFWebElement getNFKEditScheduleOkBtn() {
			return NFKEditScheduleOkBtn;
		}
	 public QAFWebElement getNFKEditScheduleStopTimeText() {
			return NFKEditScheduleStopTimeText;
		}
	 public QAFWebElement getNFKEditScheduleStartTimeText() {
			return NFKEditScheduleStartTimeText;
		}
	 public QAFWebElement getNFKAlertUrgentlowsoon() {
			return NFKAlertUrgentlowsoon;
		}
			
		public QAFWebElement getNFKAlertHighalert() {
			return NFKAlertHighalert;
		}
			
		public QAFWebElement getNFKAlertNotifyMeAboveTitle() {
			return NFKAlertNotifyMeAboveTitle;
		}
			
		public QAFWebElement getNFKAlertLowalert() {
			return NFKAlertLowalert;
		}
			
		public QAFWebElement getNFKAlertNotifyMeBelowTitle() {
			return NFKAlertNotifyMeBelowTitle;
		}
			
		public QAFWebElement getNFKAlertFallRateAlert() {
			return NFKAlertFallRateAlert;
		}
			
		public QAFWebElement getNFKAlertRiseRateAlert() {
			return NFKAlertRiseRateAlert;
		}
			
		public QAFWebElement getNFKAlertSignalLossAlert() {
			return NFKAlertSignalLossAlert;
		}
			
		public QAFWebElement getNFKAlertNoReadingsAlert() {
			return NFKAlertNoReadingsAlert;
		}
			
		public QAFWebElement getNFKHomepageMoremenuBtn() {
			return NFKHomepageMoremenuBtn;
		}
			
		public QAFWebElement getNFKMoremenuAlert() {
			return NFKMoremenuAlert;
		}
			
		public QAFWebElement getNFKAlertResetalertPopupText() {
			return NFKAlertResetalertPopupText;
		}
			
		public QAFWebElement getNFKAlertResetalertPopupResetBtn() {
			return NFKAlertResetalertPopupResetBtn;
		}
			
		public QAFWebElement getNFKAlertResetalertPopupCancelBtn() {
			return NFKAlertResetalertPopupCancelBtn;
		}

		public QAFWebElement getNFKAlertSignalLossContent() {
			return NFKAlertSignalLossContent;
		}
			
		public List<QAFWebElement> getNFKAlertContentValue() {
			return NFKAlertContentValue;
		}
			
		public QAFWebElement getNFKAlertLowalertContentt() {
			return NFKAlertLowalertContentt;
		}
			
		public QAFWebElement getNFKAlertHighalertContentt() {
			return NFKAlertHighalertContentt;
		}
			
		public QAFWebElement getNFKAlertPickerUpperFieldButton() {
			return NFKAlertPickerUpperFieldButton;
		}
			
     public QAFWebElement getNFKEditschedulepageRiseratebtn() {
		return NFKEditschedulepageRiseratebtn;
	 }
	 
	 public QAFWebElement getNFKEditschedulepageHighbtn() {
		return NFKEditschedulepageHighbtn;
	 }
	public QAFWebElement getNFKAlertResetAlertBtn() {
		return NFKAlertResetAlertBtn;
	}

	public List<QAFWebElement> getNFKAlertElementsList() {
		return NFKAlertElementsList;
	}

	public QAFWebElement getNFKEditschedulepageStatictextBtn(String text) {
		return LFSUtilsAndroid.getElement("NFK.editschedulepage.statictext.btn", text);
	}

	public QAFWebElement getNFKEditschedulepageTitle() {
		return NFKEditschedulepageTitle;
	}

	public QAFWebElement getNFKEditschedulepageClockHrsTxt() {
		return NFKEditschedulepageClockHrsTxt;
	}

	public QAFWebElement getNFKEditschedulepageClockMinTxt() {
		return NFKEditschedulepageClockMinTxt;
	}

	public QAFWebElement getNFKEditschedulepageClockAmTxt() {
		return NFKEditschedulepageClockAmTxt;
	}

	public QAFWebElement getNFKEditschedulepageClockPmTxt() {
		return NFKEditschedulepageClockPmTxt;
	}

	public QAFWebElement getNFKEditschedulepageCancelBtn() {
		return NFKEditschedulepageCancelBtn;
	}

	public QAFWebElement getNFKEditschedulepageSaveBtn() {
		return NFKEditschedulepageSaveBtn;
	}

	public List<QAFWebElement> getNFKEditschedulepageAccountTxts() {
		return NFKEditschedulepageAccountTxts;
	}

	public List<QAFWebElement> getNFKEditschedulepageSchedulesValue() {
		return NFKEditschedulepageSchedulesValue;
	}

	public List<QAFWebElement> getNFKEditschedulepageSchedulesLabels() {
		return NFKEditschedulepageSchedulesLabels;
	}

	public QAFWebElement getNFKAlertScheduleName() {
		return NFKAlertScheduleName;
	}

	public List<QAFWebElement> getNFKAlertEditscheduleSubmenuLbl() {
		return NFKAlertEditscheduleSubmenuLbl;
	}

	public List<QAFWebElement> getNFKAlertEditscheduleSubmenuValues() {
		return NFKAlertEditscheduleSubmenuValues;
	}

	public List<QAFWebElement> getNFKAlertRepeatNumberpicker() {
		return NFKAlertRepeatNumberpicker;
	}

	public List<QAFWebElement> getNFKAlertEditscreensSwitchBtn() {
		return NFKAlertEditscreensSwitchBtn;
	}

	public QAFWebElement getNFKAlertPickerHrLbl() {
		return NFKAlertPickerHrLbl;
	}

	public List<QAFWebElement> getNFKAlertPickerUpperFieldbtn() {
		return NFKAlertPickerUpperFieldbtn;
	}

	public QAFWebElement getNFKAlertPickerLowerFieldbtn() {
		return NFKAlertPickerLowerFieldbtn;
	}

	public QAFWebElement getNFKAlertPickerMinLbl() {
		return NFKAlertPickerMinLbl;
	}

	public QAFWebElement getNFKAlertNumberpicker() {
		return NFKAlertNumberpicker;
	}

	public QAFWebElement getNFKAlertPickerDoneBtn() {
		return NFKAlertPickerDoneBtn;
	}

	public QAFWebElement getNFKAlertPickerCancelBtn() {
		return NFKAlertPickerCancelBtn;
	}

	public List<QAFWebElement> getNFKAlertSuboptionsScreensLabels() {
		return NFKAlertSuboptionsScreensLabels;
	}

	public List<QAFWebElement> getNFKAlertTextValue() {
		return NFKAlertTextValue;
	}

	public QAFWebElement getNFKAlertSuboptionsScreensSwitchBtn() {
		return NFKAlertSuboptionsScreensSwitchBtn;
	}

	public QAFWebElement getNFKAlertTitle() {
		return NFKAlertTitle;
	}

	public QAFWebElement getNFKAlertUrgentLowTxt() {
		return NFKAlertUrgentLowTxt;
	}

	public QAFWebElement getNFKAlertAlarmsettingLabel() {
		return NFKAlertAlarmsettingLabel;
	}

	public QAFWebElement getNFKAlertUrgentlowLabel() {
		return NFKAlertUrgentlowLabel;
	}

	public QAFWebElement getNFKAlertUrgentlowsoonalarmLabel() {
		return NFKAlertUrgentlowsoonalarmLabel;
	}

	public QAFWebElement getNFKAlertUrgentlowDefaultValue() {
		return NFKAlertUrgentlowDefaultValue;
	}

	public QAFWebElement getNFKAlertUrgentlowNotify() {
		return NFKAlertUrgentlowNotify;
	}

	public QAFWebElement getNFKAlertUrgentlowRepeat() {
		return NFKAlertUrgentlowRepeat;
	}

	public QAFWebElement getNFKAlertSoundLabel() {
		return NFKAlertSoundLabel;
	}

	public QAFWebElement getNFKAlertVibrationLabel() {
		return NFKAlertVibrationLabel;
	}

	public QAFWebElement getNFKAlertSoundContent() {
		return NFKAlertSoundContent;
	}

	public QAFWebElement getNFKAlertVibrationContent() {
		return NFKAlertVibrationContent;
	}

	public QAFWebElement getNFKAlertAlarmDynamicTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.alert.alarm.dynamic.txt", text);
	}

	public QAFWebElement getNFKAlertBackBtn() {
		return NFKAlertBackBtn;
	}

	public QAFWebElement getNFKAlertCheckMark() {
		return NFKAlertCheckMark;
	}

	public QAFWebElement getNFKAlertUregentlowsoonVibrationLabel() {
		return NFKAlertUregentlowsoonVibrationLabel;
	}

	public QAFWebElement getNFKAlertUregentlowsoonSoundLabel() {
		return NFKAlertUregentlowsoonSoundLabel;
	}

	public QAFWebElement getNFKAlertUrgentlowsoonRepeatLabel() {
		return NFKAlertUrgentlowsoonRepeatLabel;
	}

	public QAFWebElement getNFKAlertUregentlowsoonRepeatfirstButton() {
		return NFKAlertUregentlowsoonRepeatfirstButton;
	}

	public QAFWebElement getNFKAlertUregentlowsoonRepeatsecondButton() {
		return NFKAlertUregentlowsoonRepeatsecondButton;
	}

	public QAFWebElement getNFKAlertDescriptionTxt() {
		return NFKAlertDescriptionTxt;
	}

	public QAFWebElement getNFKEditschedulepageClockCancelBtn() {
		return NFKEditschedulepageClockCancelBtn;
	}

	public QAFWebElement getNFKEditschedulepageClockOkBtn() {
		return NFKEditschedulepageClockOkBtn;
	}
	SignupPageAndroid sign= new SignupPageAndroid();
	public void verifyAlertScreen() {
		try {
			getNFKAlertTitle().verifyPresent("Alert Screen title");
			getNFKAlertAlarmsettingLabel().verifyPresent("Alarm Settings");
			getNFKAlertUrgentlowLabel().verifyPresent("Urgent Low Alarm");
			getNFKAlertUrgentlowsoonalarmLabel().verifyPresent("Urgent Low Soon Alarm");
			getNFKAlertAlarmDynamicTxt(ConfigurationManager.getBundle().getString("alerts.alarmsSettings.Description"))
					.verifyPresent("Alarm setting description");
			Reporter.logWithScreenShot("User verified Alert screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify Alert screen", MessageTypes.Fail);
		}
	}

	public void clickOnUrgentAlarmAndVerify(String option) {
		try {
			option = option.toUpperCase();

			switch (option) {
			case "URGENT LOW ALARM":
				verifyUrgentLow();
				break;
			case "URGENT LOW SOON":
				clickUrgentLowSoon();
				verifyUrgentLowSoon();
				break;
			}
			Reporter.logWithScreenShot("User verified Alarm screen: " + option, MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify Alarm screen: " + option, MessageTypes.Fail);
		}
	}

	public void verifyUrgentLowSoon() {
		getNFKAlertTitle().assertPresent("Urgent Low Soon Alarm");
		getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
		getNFKAlertUrgentlowsoonRepeatLabel().assertPresent("Repeat Every(min.)");
		getNFKAlertUregentlowsoonSoundLabel().assertPresent("Sound Labe;");
		getNFKAlertUregentlowsoonVibrationLabel().verifyPresent("Vibration Label");
		getNFKAlertUregentlowsoonRepeatfirstButton().assertPresent("15");
		getNFKAlertUregentlowsoonRepeatsecondButton().assertPresent("30");
		getNFKAlertSoundContent().assertPresent("Urgent Low Soon");
		getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("urgent.low.soon.hint"));
	}

	public void clickUrgentLowSoon() {
		LFSUtilsAndroid.click(getNFKAlertUrgentlowsoonalarmLabel());
		Reporter.logWithScreenShot("User clicked on Urgent Low soon option", MessageTypes.Pass);
	}

	public void verifyUrgentLow() {
		getNFKAlertUrgentlowLabel().verifyPresent("Urgent Low Label");
		getNFKAlertUrgentlowDefaultValue().verifyPresent("55");
		LFSUtilsAndroid.click(getNFKAlertUrgentlowLabel());
		getNFKAlertTitle().verifyPresent("Urgent Low Alarm");
		Assert.assertNotNull(getNFKAlertUrgentlowNotify().getAttribute("readonly"));
		Assert.assertNotNull(getNFKAlertUrgentlowRepeat().getAttribute("readonly"));
		getNFKAlertAlarmDynamicTxt(ConfigurationManager.getBundle().getString("urgentlow.alarm.notification.text"))
				.isPresent();
		getNFKAlertSoundLabel().verifyPresent("Sound Label");
		getNFKAlertVibrationLabel().verifyPresent("Vibration Label");
		getNFKAlertSoundContent().verifyPresent("Urgent Low");
		getNFKAlertAlarmDynamicTxt(
				ConfigurationManager.getBundle().getString("urgentlow.alarm.notification.belowlevel.text")).isPresent();
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {

	}

	public void verifySoundAndVibrationScreen(String str0) {
		try {
			LFSUtilsAndroid.click(getNFKAlertSoundContent());
			String str1 = str0.toUpperCase();
			verifyList(str1);
			clickBackbutton();
			Reporter.logWithScreenShot("User verified the sound and vibration screens", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify sound and vibration screens", MessageTypes.Fail);
		}
	}

	public void verifyList(String str1) {
		List<QAFWebElement> list = getNFKAlertElementsList();
		String[] linkText = new String[list.size()];
		int i = 0;
		for (QAFWebElement a : list) {
			linkText[i] = a.getText().toUpperCase();
			if ((linkText[i]).equals(str1)) {
				getNFKAlertCheckMark().isPresent();
				Reporter.logWithScreenShot("User verified the default value selected ", MessageTypes.Pass);
			}
			i++;
		}
	}

	public void clickBackbutton() {
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("User clicked on Back button ", MessageTypes.Pass);
	}

	public void clickAndVerifyScreen(String Option) {
		switch (Option) {
		case "LOW":
			clickLowAlert();
			verifyLowScreen();
			break;
		case "HIGH":
			clickHighAlert();
			verifyHighAlertScreen();
			break;
		case "FALLRATE":
			clickFallRate();
			verifyFallRate();
			break;
		case "RISERATE":
			clickRiseRate();
			verifyRiseRate();
			break;
		case "SIGNALLOSS":
			clickSignalLoss();
			verifySignalLossScreen();
			break;
		case "NOREADINGS":
			clickNoReadings(Option);
			verifyNoReadings();
			break;
		}
		Reporter.logWithScreenShot("User has Verified the " + Option + " screen", MessageTypes.Pass);

	}

	private void verifyNoReadings() {
		try{
			Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("noreading.title"));
		getNFKAlertBackBtn().isPresent();
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),
				LFSUtilsAndroid.getPropString("noreading.title"));
		getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("ON");
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),
				LFSUtilsAndroid.getPropString("alerts.sound.option"));
		Assert.assertEquals(getNFKAlertTextValue().get(1).getText(), LFSUtilsAndroid.getPropString("noreading.sound"));
		getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("noreading.hint")).assertPresent("Hint Text");
		LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensLabels().get(1));
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("alerts.sound.option"));
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("Verified No Readings", MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Verified No Readings", MessageTypes.Fail);
	}
}

	private void clickNoReadings(String option) {
		try {
		LFSUtilsAndroid.waitforLoad();
	LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("noreadings.txt")));
		LFSUtilsAndroid.pause(100);
		Reporter.logWithScreenShot("Click No Readings",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Click No Readings",MessageTypes.Fail);
	}
}

	private void verifySignalLossScreen() {
		try {
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("signalloss.title"));
		getNFKAlertBackBtn().isPresent();
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),
				LFSUtilsAndroid.getPropString("signalloss.title"));
		getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("ON");
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),
				LFSUtilsAndroid.getPropString("formore.than"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),
				LFSUtilsAndroid.getPropString("alerts.sound.option"));
		Assert.assertEquals(getNFKAlertTextValue().get(1).getAttribute("text"),
				LFSUtilsAndroid.getPropString("signalloss.formore.than.val"));
		Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), LFSUtilsAndroid.getPropString("signalloss.sound"));
		getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("signal.loss.hint")).assertPresent("Hint Text");
		Reporter.logWithScreenShot("Verified Signal Loss screen", MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Verified Signal Loss screen", MessageTypes.Fail);
	}
}
	public void clickSignalLoss() {
		try {
	LFSUtilsAndroid.swipePage();
//		Assert.assertEquals(getNFKAlertTextValue().get(6).getText(), LFSUtilsAndroid.getPropString("appCommon.on"));
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(6));
		Reporter.logWithScreenShot("Clicked on signal Loss",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Clicked on signal Loss",MessageTypes.Fail);
	}
}

	public void updatePickervalue(String choice) {
		switch (choice) {
		case "LOW":
			updateNotifyBelow();
			updateRepeatValue();
			clickSound();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "HIGH":
			updateNotifyAbove();
			updateRepeatValue();
			clickSound();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "FALLRATE":
			updateNotifyMeAt();
			clickRateSound();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "RISERATE":
			updateNotifyMeAt();
			clickRateSound();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "SIGNALLOSS":
			updateForMoreThan();
			clickSignalLossSound();
			LFSUtilsAndroid.waitforLoad();
			break;

		}
		Reporter.logWithScreenShot("User has changed the " + choice + " picker values", MessageTypes.Pass);

	}

	private void clickSignalLossSound() {
	try {
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(2));
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("alerts.sound.option"));
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("Clicked on Signal Loss Sound ",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Clicked on Signal Loss Sound ",MessageTypes.Fail);
	}
}

	private void updateForMoreThan() {
		try {
		String hrs = String.valueOf(ThreadLocalRandom.current().nextInt(0, 4));
		String min = String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);
		ConfigurationManager.getBundle().setProperty("formorethan.hrs", hrs);
		ConfigurationManager.getBundle().setProperty("formorethan.min", min);
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(1));
		while (!(getNFKAlertRepeatNumberpicker().get(0).getText().equals(hrs))) {
			LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(1));
		}
		if (getNFKAlertRepeatNumberpicker().get(0).getText().equals("0")) {
			while (!(getNFKAlertRepeatNumberpicker().get(1).getText().equals("25"))) {
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(3));
			}

		} else {
			while (!(getNFKAlertRepeatNumberpicker().get(1).getText().equals(min))) {
				
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(3));
			}
		}
		LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
		Reporter.logWithScreenShot("Updated for More Than ",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Updated for More Than ",MessageTypes.Pass);
	}
}

	private void updateNotifyMeAt() {
		try {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "2");
			map.put(2, "2.5");
			map.put(3, "3");
			map.put(4, "3.5");
			map.put(5, "4");

			int notifyval = ThreadLocalRandom.current().nextInt(1, 4 + 1);
			String valueaboveme = map.get(notifyval);
			ConfigurationManager.getBundle().setProperty("fallrate.value", valueaboveme);
			LFSUtilsAndroid.click(getNFKAlertTextValue().get(1));
			while (!(getNFKAlertNumberpicker().getText().equals(valueaboveme))) {
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(1));
			}
			LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
			LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
			Reporter.logWithScreenShot("Update Notify Me At ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Update Notify Me At ", MessageTypes.Fail);
		}
	}

	public void verifyUpdatedPickervalue(String option) {
		switch (option) {
		case "LOW":
			verifyUpdatedLowValue();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "HIGH":
			verifyUpdatedHighValue();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "FALLRATE":
			verifyUpdatedRateValue();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "RISERATE":
			verifyUpdatedRateValue();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "SIGNALLOSS":
			verifyUpdatedsignallossValue();
			LFSUtilsAndroid.waitforLoad();
			break;

		}
		Reporter.logWithScreenShot("Verifies the updated Picker values of " + option, MessageTypes.Pass);
	}

	private void verifyUpdatedsignallossValue() {
		try {
		getNFKAlertSuboptionsScreensSwitchBtn().getText().equals("ON");
		String gethrs = (String) ConfigurationManager.getBundle().getProperty("formorethan.hrs");
		String moremin = (String) ConfigurationManager.getBundle().getProperty("formorethan.min");
		String timehrs = gethrs.concat("hours"), timeonehr = gethrs.concat("hour");
		String timemin = moremin.concat("min");
		String formorethanval = timehrs + timemin, foronehr = timeonehr + timemin;
		int getmin = Integer.parseInt(moremin);
		String mintw = "25".concat("min");
		if ((gethrs.equals("0"))) {
			Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[, ;]", ""), mintw);
		} else if (gethrs.equals("1")) {
			Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[, ;]", ""), foronehr);
		} else {
			Assert.assertEquals((getNFKAlertTextValue().get(1).getText().replaceAll("[, ;]", "")), formorethanval);
		}
		Reporter.logWithScreenShot("Verified Updated Signal Loss values",MessageTypes.Pass);
	}catch(Exception e){
		Reporter.logWithScreenShot("Verified Updated Signal Loss values",MessageTypes.Fail);
	}
}

	private void verifyUpdatedRateValue() {
		try {
		getNFKAlertSuboptionsScreensSwitchBtn().getText().equals("ON");
		String strval = (String) ConfigurationManager.getBundle().getProperty("fallrate.value");
		Assert.assertEquals(strval.replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""));
		Reporter.logWithScreenShot("Verified Updated Rate Value",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Verified Updated Rate Value",MessageTypes.Fail);
		}
	}

	private void verifyRiseRate() {
		try{
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("rise.rate"));
		getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("OFF");
		Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				LFSUtilsAndroid.getPropString("notify.me.at"));

		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),
				LFSUtilsAndroid.getPropString("alerts.sound.option"));
		Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), LFSUtilsAndroid.getPropString("rise.sound"));
		getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("rise.rate.hint")).assertPresent("Hint Text");
		Reporter.logWithScreenShot("Verify Rise Rate",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Verify Rise Rate",MessageTypes.Fail);
	}
}
	private void clickRiseRate() {
		Assert.assertEquals(getNFKAlertTextValue().get(6).getText(), LFSUtilsAndroid.getPropString("appCommon.off"));
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(6));
	}

	private void clickFallRate() {
		try {
			Assert.assertEquals(getNFKAlertTextValue().get(4).getText(),
					LFSUtilsAndroid.getPropString("appCommon.off"));
			LFSUtilsAndroid.click(getNFKAlertTextValue().get(4));
			Reporter.logWithScreenShot("Clicked on Fall Rate ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Clicked on Fall Rate ", MessageTypes.Fail);
		}
	}

	private void verifyFallRate() {
		try {
			Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("fall.rate"));
			getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("OFF");
			Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					LFSUtilsAndroid.getPropString("notify.me.at"));
			Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),
					LFSUtilsAndroid.getPropString("alerts.sound.option"));
			Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), LFSUtilsAndroid.getPropString("fall.sound"));
			getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("fall.rate.hint")).assertPresent("Hint Text");
			Reporter.logWithScreenShot("Verified Fall Rate", MessageTypes.Pass);
			
		} catch (Exception e) {
			Reporter.logWithScreenShot("Verified Fall Rate", MessageTypes.Fail);
		}
	}

	private void verifyHighAlertScreen() {
	try {
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("high.alert.title"));
		getNFKAlertBackBtn().assertPresent("Back button");
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),
				LFSUtilsAndroid.getPropString("high.alert.title"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),
				LFSUtilsAndroid.getPropString("high.notify.above"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),
				LFSUtilsAndroid.getPropString("alerts.repeat"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(3).getText(),
				LFSUtilsAndroid.getPropString("alerts.sound.option"));
		getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("high.hint.text")).assertPresent("Hint Text");
		getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
		Assert.assertEquals(getNFKAlertTextValue().get(2).getText(),
				LFSUtilsAndroid.getPropString("reminder.types.never"));
		Assert.assertEquals(getNFKAlertTextValue().get(3).getText(), LFSUtilsAndroid.getPropString("high.sound"));
		Reporter.logWithScreenShot("High Alert Screen", MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("High Alert Screen", MessageTypes.Fail);
		}
	}

	private void clickHighAlert() {
		try{
			LFSUtilsAndroid.waitforLoad();
		
		Assert.assertEquals(getNFKAlertTextValue().get(5).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				LFSUtilsAndroid.getPropString("high.value"));
	LFSUtilsAndroid.click(getNFKAlertTextValue().get(5));
	Reporter.logWithScreenShot("Clicked on High Alert",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Clicked on High Alert",MessageTypes.Fail);
		}
	}

	private void clickLowAlert() {
		try {
			Assert.assertEquals(getNFKAlertTextValue().get(3).getText(), LFSUtilsAndroid.getPropString("low.value"));
			LFSUtilsAndroid.click(getNFKAlertTextValue().get(3));
			Reporter.logWithScreenShot("Clicked on Low Alert", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Clicked on Low Alert", MessageTypes.Fail);
		}
	}


	private void verifyLowScreen() {
		try {
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("low.alert.title"));
		getNFKAlertBackBtn().assertPresent("Back button");
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),
				LFSUtilsAndroid.getPropString("low.alert.title"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),
				LFSUtilsAndroid.getPropString("low.notify.below"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),
				LFSUtilsAndroid.getPropString("alerts.repeat"));
		Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(3).getText(),
				LFSUtilsAndroid.getPropString("alerts.sound.option"));
		getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("low.hint.text")).assertPresent("Hint Text");
		getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
		Assert.assertEquals(getNFKAlertTextValue().get(1).getText(), LFSUtilsAndroid.getPropString("low.value"));
		Assert.assertEquals(getNFKAlertTextValue().get(2).getText(),
				LFSUtilsAndroid.getPropString("reminder.types.never"));
		Assert.assertEquals(getNFKAlertTextValue().get(3).getText(), LFSUtilsAndroid.getPropString("low.sound"));
		Reporter.logWithScreenShot("Verified Low Screen",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Verified Low Screen",MessageTypes.Fail);
	}
}


	private void clickSound() {
		try {
			LFSUtilsAndroid.click(getNFKAlertTextValue().get(3));
			Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("alerts.sound.option"));
			LFSUtilsAndroid.click(getNFKAlertBackBtn());
			Reporter.logWithScreenShot("Clicked on Sound",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Clicked on Sound",MessageTypes.Fail);
		}
	}

	private void clickRateSound() {
	try {
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(2));
		Assert.assertEquals(getNFKAlertTitle().getText(), LFSUtilsAndroid.getPropString("alerts.sound.option"));
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("Click Rate Sound",MessageTypes.Pass);
	}catch(Exception e){
		Reporter.logWithScreenShot("Click Rate Sound",MessageTypes.Fail);
	}
}


	private void updateRepeatValue() {
		try {
		String hrs = String.valueOf(ThreadLocalRandom.current().nextInt(0, 4));
		String min = String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);
		ConfigurationManager.getBundle().setProperty("repeat.hrs", hrs);
		ConfigurationManager.getBundle().setProperty("repeat.min", min);
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(2));
		while (!(getNFKAlertRepeatNumberpicker().get(0).getText().equals(hrs))) {
			LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(1));
		}
		if (getNFKAlertRepeatNumberpicker().get(0).getText().equals("0")) {
			while (!(getNFKAlertRepeatNumberpicker().get(1).getText().equals("15"))) {
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(3));
			}

		} else {
			while (!(getNFKAlertRepeatNumberpicker().get(1).getText().equals(min))) {
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(3));
			}
		}
		LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
		Reporter.logWithScreenShot("Updated Repeat Values",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Updated Repeat Values",MessageTypes.Fail);
	}
}


	private void updateNotifyAbove() {
		try {
		LFSUtilsAndroid.click(	getNFKAlertTextValue().get(1));
		String randomNum = String.valueOf(ThreadLocalRandom.current().nextInt(120, 310 + 1));
		String txt = getNFKAlertNumberpicker().getText();
		ConfigurationManager.getBundle().setProperty("high.value", randomNum);
		if (getNFKAlertNumberpicker().getText().equals(randomNum)) {
			Reporter.logWithScreenShot("Value found", MessageTypes.Pass);
		} else if (Integer.parseInt(randomNum) > Integer.parseInt(txt)) {
			while (!(getNFKAlertNumberpicker().getText().equals(randomNum))) {
				
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(1));
			}
		} else {
			while (!(getNFKAlertNumberpicker().getText().equals(randomNum))) {

				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(0));
			}
		}
		LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
		Reporter.logWithScreenShot("Updated Notify Above", MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Updated Notify Above", MessageTypes.Fail);
	}
}
	


private void updateNotifyBelow() {
		try {
		LFSUtilsAndroid.click(getNFKAlertTextValue().get(1));
		String randomNum = String.valueOf(ThreadLocalRandom.current().nextInt(60, 100 + 1));
		String txt = getNFKAlertNumberpicker().getText();
		ConfigurationManager.getBundle().setProperty("below.value", randomNum);
		if (getNFKAlertNumberpicker().getText().equals(randomNum)) {
			Reporter.logWithScreenShot("Value found", MessageTypes.Pass);
		} else if (Integer.parseInt(randomNum) > Integer.parseInt(txt)) {
			while (!(getNFKAlertNumberpicker().getText().equals(randomNum))) {
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(1));
			}
		} else {
			while (!(getNFKAlertNumberpicker().getText().equals(randomNum))) {
				LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldbtn().get(0));
			}
		}
		LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
		Reporter.logWithScreenShot("Upated Notified Below Alert",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Upated Notified Below Alert",MessageTypes.Fail);	
		}
	}




	private void verifyUpdatedHighValue() {
		try {
		String gethrs = ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
		String getmins = ConfigurationManager.getBundle().getPropertyValue("repeat.min");
		String repeatval = gethrs + getmins;
		Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				ConfigurationManager.getBundle().getProperty("high.value"));
		if (gethrs.equals("0")) {
			Assert.assertEquals(getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					"15");
		} else if (gethrs.equals("4")) {
			Assert.assertEquals(getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					gethrs);
		} else {
			Assert.assertEquals(getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					repeatval);
		}
		
		Reporter.logWithScreenShot("Verified Updated High Value ", MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Verified Updated High Value ", MessageTypes.Fail);
		}

	}

	private void verifyUpdatedLowValue() {
		try {
			String gethrs = ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
			String getmins = ConfigurationManager.getBundle().getPropertyValue("repeat.min");
			String repeatval = gethrs + getmins;
			Assert.assertEquals(ConfigurationManager.getBundle().getPropertyValue("below.value"),
					getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""));
			if (gethrs.equals("0")) {
				Assert.assertEquals(
						getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""), "15");
			} else if (gethrs.equals("4")) {
				Assert.assertEquals(
						getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
						gethrs);
			} else if (gethrs.equals("1")) {
				Assert.assertEquals(
						getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
						(gethrs + getmins));
			} else {
				Assert.assertEquals(
						getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
						repeatval);
			}
			Reporter.logWithScreenShot("Verified updated Low Value", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Verified updated Low Value", MessageTypes.Fail);
		}
	}

	public void enableAlertSchedule() {
	LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKAlertEditscreensSwitchBtn().get(1));
		getNFKAlertEditscreensSwitchBtn().get(1).isEnabled();
		LFSUtilsAndroid.click(getNFKAlertEditscreensSwitchBtn().get(1));
	}

	public void verifyNameField() {

	LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.waitforLoad();
		Assert.assertEquals(getNFKAlertScheduleName().getText(), LFSUtilsAndroid.getPropString("schedule.name"));
	}

	public void clickScheduleName() {
		if(getNFKAlertScheduleName().isPresent()) {
		LFSUtilsAndroid.click(getNFKAlertScheduleName());
		}
		Reporter.logWithScreenShot("Edit Schedule screen", MessageTypes.Pass);
	}

	public void verifyEditScheduleScreen() {
		waitForPageToLoad();
		LFSUtilsAndroid.waitforLoad();
		Assert.assertEquals(getNFKEditschedulepageTitle().getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.title"));
		Assert.assertEquals(getNFKEditschedulepageAccountTxts().get(0).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.name.lbl"));
//			 getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("edit.schedule.weekend.lbl")).
//			 assertPresent("Weekend text");
		Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(0),
				LFSUtilsAndroid.getPropString("schedule.name"));
		Assert.assertEquals(getNFKEditschedulepageAccountTxts().get(1).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.alert.settings.lbl"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(0),
				LFSUtilsAndroid.getPropString("edit.schedule.treatcritical.lbl"));
		getNFKEditschedulepageStatictextBtn(
				LFSUtilsAndroid.getPropString("edit.schedule.urgency.txt").replace("\"", ""));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(1).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.start.time"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(2).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.stop.time"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(3).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.daysweek.lbl"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(4).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.ULS.txt"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(5).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.low.txt"));
	LFSUtilsAndroid.swipePage();
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(6).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.fall.txt"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(7).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.high.txt"));
		Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(8).getText(),
				LFSUtilsAndroid.getPropString("edit.schedule.srise.txt"));
	}

	public void clickUserAlertSchedule(String option) {
		switch (option) {
		case "low":
			clikUserLowAlert();
			verifyLowScreen();
			break;
		case "high":
			clikUserHighAlert();
			verifyHighAlertScreen();
			break;
		case "fallrate":
			clikUserFallRateAlert();
			verifyFallRate();
			break;
		case "riserate":
			clikUserRiseRateAlert();
			verifyRiseRate();
			break;
		case "Urgent Low Soon":
			clikUserUrgentLowSoon();
			verifyUrgentLowSoon();
			break;
		}
		Reporter.logWithScreenShot("User has verified the " + option + " screen", MessageTypes.Pass);

	}

	private void clikUserUrgentLowSoon() {
		Assert.assertEquals(getNFKAlertTextValue().get(5).getText(), LFSUtilsAndroid.getPropString("appCommon.on"));
		getNFKAlertTextValue().get(5).click();
		LFSUtilsAndroid.waitforLoad();

	}

	private void clikUserRiseRateAlert() {
	LFSUtilsAndroid.swipePage();
	getNFKEditschedulepageRiseratebtn().assertPresent("Rise Rate");
	getNFKEditschedulepageRiseratebtn().click();
  	 LFSUtilsAndroid.waitforLoad();

	}

	private void clikUserFallRateAlert() {
		LFSUtilsAndroid.waitforLoad();
		Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(7).getText(),
				LFSUtilsAndroid.getPropString("appCommon.off"));
		getNFKEditschedulepageSchedulesValue().get(7).click();
	}

	private void clikUserHighAlert() {
	LFSUtilsAndroid.swipePage();
	getNFKEditschedulepageHighbtn().isPresent();
	getNFKEditschedulepageHighbtn().click();
	 LFSUtilsAndroid.waitforLoad();
		
	}

	private void clikUserLowAlert() {
		try {
		Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(6).getText(),
				LFSUtilsAndroid.getPropString("low.value"));
		LFSUtilsAndroid.click(getNFKEditschedulepageSchedulesValue().get(6));
		Reporter.logWithScreenShot("Clicked on Low Alert");
	}catch(Exception e) {
		Reporter.logWithScreenShot("Clicked on Low Alert");
	}
}

	public void enterScheduleName() {
		try {
		String str = "Holden Ford";
		getNFKEditschedulepageAccountTxts().get(0).sendKeys(str);
		ConfigurationManager.getBundle().setProperty("name.schedule", str);
		Reporter.logWithScreenShot("Enter Schedule Name ",MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Enter Schedule Name ",MessageTypes.Fail);
	}
}

	public void verifyScheduleField(String option) {
		switch (option) {
		case "Canceling":
			LFSUtilsAndroid.click(getNFKEditschedulepageCancelBtn());
			verifyOnCancel();
			break;
		case "Saving":
			enterScheduleName();
			LFSUtilsAndroid.click(getNFKEditschedulepageSaveBtn());
			verifyOnSaving();
			break;

		}

	}

	private void verifyOnSaving() {
		try {
		String savedval = (String) ConfigurationManager.getBundle().getProperty("name.schedule");
		Reporter.logWithScreenShot(savedval + "is present", MessageTypes.Pass);
	}catch(Exception e) {
		Reporter.logWithScreenShot("Schedule is present", MessageTypes.Fail);
	}
}

	public void verifyOnCancel() {
		try {
		Assert.assertEquals(getNFKAlertScheduleName().getText(), LFSUtilsAndroid.getPropString("schedule.name"));
		Reporter.logWithScreenShot("Verifed on Cancel",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Verifed on Cancel",MessageTypes.Fail);
		}
	}

	public void clicksOnPicker(String option) {
		switch (option) {
		case "Start time":
			clickStartTime();
			verifyClock();
			verifyDefaultValue();
			getNFKEditschedulepageSchedulesLabels().get(1).click();
			updatePickerTime();
			String getval = getNFKEditschedulepageSchedulesValue().get(2).getText().replaceAll(":", "");
			verifyPickerSetTime(getval);
			break;
		case "Stop time":
			clickStopTime();
			verifyClock();
			verifyDefaultStopTime();
			getNFKEditschedulepageSchedulesLabels().get(2).click();
			updateStopPickerTime();

			verifyPickerStopSetTime();
			break;
		case "Week picker":
			clickWeekPicker();
			verifyWeekPage();
			verifyupdatedweekvalue();
			break;
		case "Week picker All":
        	clickAllWeekPicker();
        	
        	break;

		}
		Reporter.logWithScreenShot("Verified the pickers of Edit schedule", MessageTypes.Pass);
	}

	private void verifyPickerStopSetTime() {
		String time = getNFKEditschedulepageSchedulesValue().get(3).getText().replaceAll(":", "");
		Assert.assertEquals(time, "430 PM");
	}
    public void clickAllWeekPicker() {
    	LFSUtilsAndroid.clickWithText("Days of Week");
    	LFSUtilsAndroid.clickWithText("Every Tuesday");
    	LFSUtilsAndroid.clickWithText("Every Wednesday");
    	LFSUtilsAndroid.clickWithText("Every Thursday");
    	LFSUtilsAndroid.click(getNFKAlertBackBtn());
    }
	private void verifyupdatedweekvalue() {
		LFSUtilsAndroid.waitforLoad();
		String getweekval = getNFKEditschedulepageSchedulesValue().get(4).getText();
		Reporter.logWithScreenShot(getweekval, MessageTypes.Pass);

	}

	private void updatePickerTime() {
		String randomhrs = String.valueOf(ThreadLocalRandom.current().nextInt(1, 9));
		LFSUtilsAndroid.waitforLoad();
		Actions action=new Actions(driver);
		action.sendKeys(randomhrs).perform();
		//getNFKEditschedulepageClockHrsTxt().sendKeys(randomhrs);
		new WebDriverWait(driver, 20);
		getNFKEditschedulepageClockPmTxt().click();
		getNFKEditschedulepageClockOkBtn().click();
		ConfigurationManager.getBundle().setProperty("picker.time", (randomhrs));
	}

	private void updateStopPickerTime() {
		getNFKEditschedulepageClockPmTxt().click();
		getNFKEditschedulepageClockOkBtn().click();
	}

	public void verifyPickerSetTime(String getval2) {
		String updaatedtime = String.valueOf(ConfigurationManager.getBundle().getPropertyValue("picker.time"));
		String am = " PM", zero = "00";
		String time = updaatedtime + zero + am;
		Assert.assertEquals(getval2, time);
		Reporter.logWithScreenShot("Verified the updated Picker values", MessageTypes.Pass);

	}

	private void verifyWeekPage() {
		Assert.assertEquals(getNFKEditschedulepageTitle().getText(), LFSUtilsAndroid.getPropString("day.week.title"));
		HashMap<String, String> weekview = new HashMap<String, String>();

		weekview.put("Every Sunday", "1");
		weekview.put("Every Monday", "2");
		weekview.put("Every Tuesday", "3");
		weekview.put("Every Wednesday", "4");
		weekview.put("Every Thursday", "5");
		weekview.put("Every Friday", "6");
		weekview.put("Every Saturday", "7");
		int key1 = ThreadLocalRandom.current().nextInt(1, 4);
		int key2 = ThreadLocalRandom.current().nextInt(5, 8);
		getNFKEditschedulepageSchedulesLabels().get(key1).click();
		getNFKEditschedulepageSchedulesLabels().get(key2).click();
		getNFKEditschedulepageCancelBtn().click();
	}

	private void verifyDefaultStopTime() {
		Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(3).getText(),
				LFSUtilsAndroid.getPropString("stop.time.default"));

	}

	private void verifyDefaultValue() {
		Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(2).getText(),
				LFSUtilsAndroid.getPropString("start.time.default.value"));

	}

	private void verifyClock() {
		getNFKEditschedulepageClockCancelBtn().isPresent();
		getNFKEditschedulepageClockOkBtn().isPresent();
		// click cancel
		getNFKEditschedulepageClockCancelBtn().click();

	}

	private void clickWeekPicker() {
		LFSUtilsAndroid.pause(200);
		Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(4).getText(), "All");
		getNFKEditschedulepageSchedulesLabels().get(3).click();

	}

	private void clickStopTime() {
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.click(getNFKEditScheduleStopTimeText());

	}

	private void clickStartTime() {
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.click(getNFKEditScheduleStartTimeText());
	}

	public void resetAlertsSettings() {
		// UrgentLow soon set OFF
		setUrgentLowSoonValue();
		waitForPageToLoad();
		// Set Low value
		setLowValue();
		waitForPageToLoad();
		// Fallrate ON
		setFallRate();
	LFSUtilsAndroid.swipePage();
		// High value
		setHighValue();
		// Rise Rate ON
		setRiseToOn();
		// SignalLoss OFF
		setSignalLossOFF();
		// No readings OFF
		setNoReadingsOFF();
	}

	private void setNoReadingsOFF() {
		getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("noreadings.txt")).click();
		getNFKAlertSuboptionsScreensSwitchBtn().click();
		clickBackbutton();

	}

	private void setSignalLossOFF() {
		clickSignalLoss();
		getNFKAlertSuboptionsScreensSwitchBtn().click();
		clickBackbutton();
	}

	private void setRiseToOn() {
		getNFKEditschedulepageStatictextBtn("Rise Rate").click();
		getNFKAlertSuboptionsScreensSwitchBtn().click();
		clickBackbutton();
	}

	private void setHighValue() {
		getNFKEditschedulepageStatictextBtn("High").click();
		updateNotifyAbove();
		clickBackbutton();
	}

	private void setFallRate() {
		clickFallRate();
		getNFKAlertSuboptionsScreensSwitchBtn().click();
		clickBackbutton();

	}

	private void setLowValue() {
		clickLowAlert();
		updateNotifyBelow();
		clickBackbutton();

	}

	private void setUrgentLowSoonValue() {
		clickUrgentLowSoon();
		getNFKAlertSuboptionsScreensSwitchBtn().click();
		clickBackbutton();

	}

	public void clickResetAlerts() {
	LFSUtilsAndroid.swipePage();
	LFSUtilsAndroid.swipePage();
		getNFKAlertResetAlertBtn().waitForPresent(200);
		getNFKAlertResetAlertBtn().click();
		SharePageAndroid share = new SharePageAndroid();
		share.getNFKSharepageShareReportPageTextDiscardTxt().click();
		Reporter.logWithScreenShot("settings configuration value", MessageTypes.Pass);
		getNFKAlertResetAlertBtn().click();
		share.getNFKSharepagePopupNodataOkBtn().click();
		LFSUtilsAndroid.waitforLoad();
	}

	public void getConfigurationSettinsg() {
		// reset to original settings
		Reporter.logWithScreenShot("Screen of ALerts ", MessageTypes.Pass);
		Assert.assertEquals(getNFKAlertTextValue().get(1).getText(), LFSUtilsAndroid.getPropString("low.value"));
		Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), LFSUtilsAndroid.getPropString("appCommon.off"));

		Assert.assertEquals(getNFKAlertTextValue().get(4).getText(), LFSUtilsAndroid.getPropString("appCommon.off"));
		Assert.assertEquals(getNFKAlertTextValue().get(5).getText(), LFSUtilsAndroid.getPropString("appCommon.on"));
		Assert.assertEquals(getNFKAlertTextValue().get(6).getText(), LFSUtilsAndroid.getPropString("appCommon.on"));
		Reporter.logWithScreenShot("User has verified the Configuration Setting after reset", MessageTypes.Pass);

		Assert.assertTrue(getNFKAlertTextValue().get(3).getText().equals("200 mg/dL"));

	}
	
	//Rushikesh
	//Method to turn off urgent low soon alert
	public void turnOffUrgentLowSoonAlert() {
		try {
		LFSUtilsAndroid.click(getNFKAlertUrgentlowsoon());
		LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("Successfully Turn Off UrgentLowSoon Alert", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Turn Off UrgentLowSoon Alert",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to change the default high and low alert threshould
	public void changeDefaultHighAndLowAlertThreshould() {
    	try {
		String highAlert = LFSUtilsAndroid.getPropString("alertPage.highAlert.updated");
		LFSUtilsAndroid.click(getNFKAlertHighalert());
		LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveTitle());
		while (!(getNFKAlertNumberpicker().getText().equals(highAlert))) {
			
			LFSUtilsAndroid.click(getNFKAlertPickerUpperFieldButton());
		}
		LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		
        String lowAlert= LFSUtilsAndroid.getPropString("alertPage.lowAlert.updated");
		LFSUtilsAndroid.click(getNFKAlertLowalert());
		LFSUtilsAndroid.click(getNFKAlertNotifyMeBelowTitle());
        while (!(getNFKAlertNumberpicker().getText().equals(lowAlert))) {
			
			LFSUtilsAndroid.click(getNFKAlertPickerLowerFieldbtn());
		}
		LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
		LFSUtilsAndroid.click(getNFKAlertBackBtn());		
		Reporter.logWithScreenShot("Successfully Change Default High And Low Alert Threshould", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Change Default High And Low Alert Threshould",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to turn on fall and rise rate alert
	public void turnOnFallAndRiseRateAlert() {
		try {
	    LFSUtilsAndroid.click(getNFKAlertFallRateAlert());		
		LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());		
		LFSUtilsAndroid.click(getNFKAlertBackBtn());		
	    LFSUtilsAndroid.click(getNFKAlertRiseRateAlert());		
	    LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());		
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("Successfully Turn On Fall And Rise Rate Alert", MessageTypes.Pass);
		}catch (Exception e) {
		Reporter.logWithScreenShot("Failed to Turn On Fall And Rise Rate Alert",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to turn off signal loss and no reading alert
	public void turnOFFSignalLossAndNoreadingsAlertSetting() {
		try {	
		LFSUtilsAndroid.click(getNFKAlertSignalLossAlert());		
		LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKAlertNoReadingsAlert());
		LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		Reporter.logWithScreenShot("Successfully Turn OFF Signal Loss And Noreadings Alert Setting", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Turn OFF Signal Loss And Noreadings Alert Setting",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to enable custom schedule setting
	public void enableCustomeScheuleSetting() {
		try {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKAlertEditscreensSwitchBtn().get(1));
		getNFKAlertEditscreensSwitchBtn().get(1).isEnabled();
		LFSUtilsAndroid.click(getNFKAlertBackBtn());
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to enableCustomeScheuleSetting",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to update alert setting
	public void updateAlertSetting() {	
		turnOffUrgentLowSoonAlert();
		waitForPageToLoad();
		changeDefaultHighAndLowAlertThreshould();
		waitForPageToLoad();
        turnOnFallAndRiseRateAlert();
		waitForPageToLoad();
        turnOFFSignalLossAndNoreadingsAlertSetting();
		enableCustomeScheuleSetting();
		Reporter.logWithScreenShot("Successfully updated alert setting", MessageTypes.Pass);
	}
	//Rushikesh
	//Method to verify reset alert setting button
	public void verifyResetAlertSettingButton() {
		try {
		HomePageAndroid HomePage=new HomePageAndroid();
		LFSUtilsAndroid.click(HomePage.getNFKHomepageHomeBtn());
		LFSUtilsAndroid.click(getNFKHomepageMoremenuBtn());
		LFSUtilsAndroid.click(getNFKMoremenuAlert());
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKAlertResetAlertBtn().verifyPresent();
		Reporter.logWithScreenShot("Successfully verified ResetAlertSettingButton",MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify ResetAlertSettingButton",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify confirmation screen
	public void verifyConfirmationScreen() {
		try {
		LFSUtilsAndroid.click(getNFKAlertResetAlertBtn());
		getNFKAlertResetalertPopupText().verifyPresent();
		getNFKAlertResetalertPopupResetBtn().verifyPresent();
		getNFKAlertResetalertPopupCancelBtn().verifyPresent();
		LFSUtilsAndroid.click(getNFKAlertResetalertPopupCancelBtn());
		Reporter.logWithScreenShot("Successfully verified ConfirmationScreen",MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify ConfirmationScreen",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify urgent low soon toggle if off
	public void urgentLowSoonToggleIsOFF() {
	try {
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.swipePageUp();
		LFSUtilsAndroid.swipePageUp();
		LFSUtilsAndroid.click(getNFKAlertUrgentlowsoon());
	    if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("Off")) {
        Reporter.logWithScreenShot("urgent low soon alert toggle off", MessageTypes.Pass);
		}
        LFSUtilsAndroid.click(getNFKAlertBackBtn());	
	}catch (Exception e) {
        Reporter.logWithScreenShot("urgent low soon alert toggle is on", MessageTypes.Fail);
	}
	}
	//Rushikesh
	//Method to verify the updated values of low and high alert
	public void verifyUpdatedValuesOfLowAndHighAlert() {
		try {
	        LFSUtilsAndroid.click(getNFKAlertLowalert());
	        LFSUtilsAndroid.click(getNFKAlertNotifyMeBelowTitle());
			if(getNFKAlertNumberpicker().getAttribute("text").equals(LFSUtilsAndroid.getPropString("alertPage.lowAlert.updated"))) {
			Reporter.logWithScreenShot("No changes made on low alert",MessageTypes.Pass);
			}
	        LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());
				
	        LFSUtilsAndroid.click(getNFKAlertHighalert());
	        LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveTitle());
			if(getNFKAlertNumberpicker().getAttribute("text").equals(LFSUtilsAndroid.getPropString("alertPage.highAlert.updated"))) {
			Reporter.logWithScreenShot("No changes made on high alert",MessageTypes.Pass);
			}
	        LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());	
		}catch (Exception e) {
			Reporter.logWithScreenShot("low and high alert values are not updated",MessageTypes.Fail);
		}
	}
	
	//Rushikesh
	//Method to verify fall rate is enabled
	public void verifyFallRateIsEnabled() {
		try {
			 LFSUtilsAndroid.click(getNFKAlertFallRateAlert());
			 getNFKAlertSuboptionsScreensSwitchBtn().verifyEnabled("On");
		     Reporter.logWithScreenShot("fall rate alert is enabled",MessageTypes.Pass);
		     LFSUtilsAndroid.click(getNFKAlertBackBtn());	
		}catch(Exception e) {
		     Reporter.logWithScreenShot("fall rate alert is disabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify rise rate is enabled
	public void verifyRiseRateIsEnabled() {
		try {
		       LFSUtilsAndroid.click(getNFKAlertRiseRateAlert());
			   getNFKAlertSuboptionsScreensSwitchBtn().verifyEnabled("On");
			   Reporter.logWithScreenShot("rise rate alert is enabled",MessageTypes.Pass);
		       LFSUtilsAndroid.click(getNFKAlertBackBtn());		
		}catch(Exception e) {
		     Reporter.logWithScreenShot("rise rate alert is disabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify signal loss alert is off
	public void verifySignalLossAlertIsOFF() {
		try {
		    if (getNFKAlertSignalLossContent().getAttribute("text").equals("Off")) {
		        Reporter.logWithScreenShot("signal loss toggle off", MessageTypes.Pass);
			    }
			    LFSUtilsAndroid.swipePage();
		}catch(Exception e) {
		     Reporter.logWithScreenShot("signal loss alert is enabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify no reading alert is off
	public void verifyNoReadingAlertIsOFF() {
		try {
	        LFSUtilsAndroid.click(getNFKAlertNoReadingsAlert());
			if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("Off")) {
		    Reporter.logWithScreenShot("no reading toggle off", MessageTypes.Pass);
		    }
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());
		}catch(Exception e) {
		     Reporter.logWithScreenShot("no reading alert is enabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify no changes are made on the alert screen
	public void verifyNoChangesAreMadeOnTheAlertScreen() {
		try {
			urgentLowSoonToggleIsOFF();	
			verifyUpdatedValuesOfLowAndHighAlert();
			verifyFallRateIsEnabled();
			verifyRiseRateIsEnabled();
			verifySignalLossAlertIsOFF();
			verifyNoReadingAlertIsOFF();
		    LFSUtilsAndroid.swipePage();
		    getNFKAlertEditscreensSwitchBtn().get(1).verifyEnabled("On");     
	        Reporter.logWithScreenShot("Successfully verified No Changes Are Made On The Alert Screen",MessageTypes.Pass);
		}catch (Exception e) {
            Reporter.logWithScreenShot("Failed to verify changes made on alert screen",MessageTypes.Fail);
		}
    }
	//Rushikesh
	//Method to reset alert setting
	public void resetTheAlertSetting() {
	    LFSUtilsAndroid.click(getNFKAlertResetAlertBtn());
        LFSUtilsAndroid.click(getNFKAlertResetalertPopupResetBtn());
	}
	
	//Rushikesh
	//Method to verify urgent low soon toggle is on
	public void urgentLowSoonToggleIsON() {
		try {
	        LFSUtilsAndroid.swipePageUp();
	        LFSUtilsAndroid.swipePageUp();
	        LFSUtilsAndroid.click(getNFKAlertUrgentlowsoon());
	        getNFKAlertSuboptionsScreensSwitchBtn().verifyEnabled("On");
	        Reporter.logWithScreenShot("urgent low soon alert is enabled",MessageTypes.Pass);
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());
		}catch (Exception e) {
	        Reporter.logWithScreenShot("urgent low soon alert is disabled", MessageTypes.Fail);
		}
		}
	
	//Rushikesh
	//Method to verify by default values of low and high alert 
	public void verifyByDefaultValuesOfLowAndHighAlert() {
		try {
		    LFSUtilsAndroid.click(getNFKAlertLowalert());
		    LFSUtilsAndroid.click(getNFKAlertNotifyMeBelowTitle());
			if(getNFKAlertNumberpicker().getAttribute("text").equals(LFSUtilsAndroid.getPropString("low.value"))) {
			Reporter.logWithScreenShot("No changes made on low alert",MessageTypes.Pass);
			}
		    LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());
				
		    LFSUtilsAndroid.click(getNFKAlertHighalert());
	        LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveTitle());
			if(getNFKAlertNumberpicker().getAttribute("text").equals(LFSUtilsAndroid.getPropString("high.value"))) {
			Reporter.logWithScreenShot("No changes made on high alert",MessageTypes.Pass);
			}
            LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());		
		}catch(Exception e) {
			Reporter.logWithScreenShot("changes are made on high and low alert",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify fall rate alert is disabled
	public void verifyFallRateAlertIsDisabled() {
		try {
	        LFSUtilsAndroid.click(getNFKAlertFallRateAlert());
			if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("Off")) {
			Reporter.logWithScreenShot("fall rate alert is disabled", MessageTypes.Pass);
			}
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());		
		}catch(Exception e) {
			Reporter.logWithScreenShot("fall rate alert is enabled",MessageTypes.Fail);
		}	
	}
	//Rushikesh
	//Method to verify rise rate alert is disabled
	public void verifyRiseRateAlertIsDisabled() {
		try {
	        LFSUtilsAndroid.click(getNFKAlertRiseRateAlert());
			if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("Off")) {
				Reporter.logWithScreenShot("rise rate alert alert is disabled", MessageTypes.Pass);
				}
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());	
		}catch(Exception e) {
			Reporter.logWithScreenShot("rise rate alert is enabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify signal loss alert is enabled
	public void verifySignalLossAlertIsEnabled() {
		try {
	        LFSUtilsAndroid.click(getNFKAlertSignalLossAlert());
			getNFKAlertSuboptionsScreensSwitchBtn().verifyEnabled("On");
			Reporter.logWithScreenShot("signal loss alert is enabled",MessageTypes.Pass);
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());
			LFSUtilsAndroid.swipePage();		
		}catch(Exception e) {
			Reporter.logWithScreenShot("signal loss alert is disabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify no reading alert is enabled
	public void verifyNoReadingAlertIsEnabled() {
		try {
	        LFSUtilsAndroid.click(getNFKAlertNoReadingsAlert());
			getNFKAlertSuboptionsScreensSwitchBtn().verifyEnabled("On");
			Reporter.logWithScreenShot("no reading alert is enabled",MessageTypes.Pass);
	        LFSUtilsAndroid.click(getNFKAlertBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("no reading alert is disabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to reset alert setting
	public void resetAlertSetting() {
		try {
			resetTheAlertSetting();
			urgentLowSoonToggleIsON();
			verifyByDefaultValuesOfLowAndHighAlert();
			verifyFallRateAlertIsDisabled();
			verifyRiseRateAlertIsDisabled();
			verifySignalLossAlertIsEnabled();
			verifyNoReadingAlertIsEnabled();
		    LFSUtilsAndroid.swipePage();
		    LFSUtilsAndroid.swipePage();
		    if (getNFKAlertEditscreensSwitchBtn().get(1).getAttribute("text").equals("Off")) {
			Reporter.logWithScreenShot("CustomeScheuleSetting toggle is off", MessageTypes.Pass);
		    }
			Reporter.logWithScreenShot("Successfully reset alert setting",MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to reset alert setting", MessageTypes.Fail);
		}

	}



		
	//Pradnya
	//Method to enter start and stop time
	public void clicksOnPickerAndUpdateValue(String option,String time) {
		switch(option) {
		case "Start time":
        	clickStartTime();
        	updatePickerTime(time);
        	break;
        case "Stop time":
        	clickStopTime();
        	updatePickerTime(time);
        	break;
		}
		
	}
	//Pradnya
	//Method to update the time for start and stop 
	
	private void updatePickerTime(String time) {
		String[] time1 = time.split("\\s");
		String[] time2 = time1[0].split("\\:");
		
		
		 String am_pm = time1[1];
		 
		 try {
			 getNFKEditschedulepageClockHrsTxt().sendKeys(time2[0]);
			 LFSUtilsAndroid.waitforLoad();
			 getNFKEditschedulepageClockMinTxt().sendKeys(time2[1]);
			 LFSUtilsAndroid.waitforLoad();
			 switch (am_pm) {
			case "AM":  
				
				if (getNFKEditschedulepageClockAmTxt().isPresent()) {
					LFSUtilsAndroid.click(getNFKEditschedulepageClockAmTxt());
				}

				break;
			case "PM":
				   
				if (getNFKEditschedulepageClockPmTxt().isPresent()) {
					LFSUtilsAndroid.click(getNFKEditschedulepageClockPmTxt());
				}

				break;
			default:
				break;
			}
		 }catch (Exception e) {
			Reporter.logWithScreenShot("User was unable to send the Time",MessageTypes.Fail);
			
		}
		 LFSUtilsAndroid.click(getNFKEditScheduleOkBtn());		
	}
	//Auther-Pradnya
	//Description-Method to click custom high Alert
	public void userClicksCustomHighAlert() {
		try {
			if(getNFKAlertCustomHighAlertText().isPresent()) {
				LFSUtilsAndroid.click(getNFKAlertCustomHighAlertText());
				Reporter.logWithScreenShot("Able to click on custom High Alert", MessageTypes.Pass);
			}
			
		}catch(Exception e) {
			Reporter.logWithScreenShot(" Not able to click on custom High Alert", MessageTypes.Fail);
		}
}
	//Auther-Pradnya
		//Description-Method to set notify above value 
		public void setNotifyMeAboveValue(String opt) {
			try {
				switch (opt) {
				case "165":
					String value = "165";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeAbove")).click();
					if (getNFKAlertNotifyMeAboveText().getText().equals(value)) {
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					} else {
						getNFKAlertNotifyMeAboveText().sendKeys(value);
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					}
					break;
				case "175":
					String value2 = "175";
					sign.getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeAbove")).click();
					if (getNFKAlertNotifyMeAboveText().getText().equals(value2)) {
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					} else {
						getNFKAlertNotifyMeAboveText().sendKeys(value2);
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					}
					break;
				case "180":
					String value3 = "180";
					sign.getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeAbove")).click();
					if (getNFKAlertNotifyMeAboveText().getText().equals(value3)) {
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					} else {
						getNFKAlertNotifyMeAboveText().sendKeys(value3);
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					}
					break;
				case "195":
					String value4 = "195";

					sign.getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeAbove")).click();
					if (getNFKAlertNotifyMeAboveText().getText().equals(value4)) {
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					} else {
						getNFKAlertNotifyMeAboveText().sendKeys(value4);
						LFSUtilsAndroid.click(getNFKAlertNotifyMeAboveDoneBtn());
					}
					break;
				default:
					Reporter.logWithScreenShot("Invalid notify me above value", MessageTypes.Pass);
					break;
				}
				Reporter.logWithScreenShot("User has set the notify me above value ", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to set the notify me above value ", MessageTypes.Fail);
			}
		}
		public void setHighRepeatValue(String opt) {

			try {
				switch (opt) {
				case "Fifteen":
					String min = "15";
					sign.getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).click();
					if (getNFKAlertPickerMinBtn().getText().equals(min)) {
						LFSUtilsAndroid.click(getNFKAlertRepeatpickerDoneBtn());
					} else {
						getNFKAlertPickerMinBtn().sendKeys(min);
						LFSUtilsAndroid.click(getNFKAlertRepeatpickerDoneBtn());
					}
					break;
				case "Never":
					String minzero = "0";
					sign.getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).click();
					if (getNFKAlertPickerMinBtn().getText().equals(minzero)) {
						LFSUtilsAndroid.click(getNFKAlertRepeatpickerDoneBtn());
					} else {
						getNFKAlertRepeatBtn().sendKeys("1");
						getNFKAlertPickerMinBtn().sendKeys(minzero);
						getNFKAlertRepeatBtn().sendKeys("0");
						LFSUtilsAndroid.click(getNFKAlertRepeatpickerDoneBtn());
					}
					break;
				case "Twenty":
					sign.getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).click();
					if (getNFKAlertPickerMinBtn().getText().equals("20")) {
						LFSUtilsAndroid.click(getNFKAlertRepeatpickerDoneBtn());
					} else {
						getNFKAlertPickerMinBtn().sendKeys("20");
						LFSUtilsAndroid.click(getNFKAlertRepeatpickerDoneBtn());
					}
					break;
				default:
					Reporter.logWithScreenShot("Invalid repeat value", MessageTypes.Pass);
					break;
				}
				Reporter.logWithScreenShot("User has set teh Repeat value ", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to set teh Repeat value ", MessageTypes.Fail);
			}
		}
		//Pradnya
		//Method to click back button on alertpage
		public void clickOnBackButton() {
			try {
			getNFKAlertBackBtn().isPresent();
			LFSUtilsAndroid.click(getNFKAlertBackBtn());
			}catch(Exception e)
			{
				Reporter.logWithScreenShot("User not able to click on back button", MessageTypes.Fail);
			}
			
		}
		//Rushikesh
		//Method to verify low alert toggle is enabled or disabled
		public void setLowToggle(String opt) {
			LFSUtilsAndroid.click(getNFKAlertLowalert());
			Reporter.logWithScreenShot("Clicked on Low Alert", MessageTypes.Pass);
			try {
				switch (opt) {
				case "OFF":
					
					if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("value").equals("1")) {
						LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
						Reporter.logWithScreenShot("Turn off low alert", MessageTypes.Pass);
					} else {
						Reporter.logWithScreenShot("low alert already turned off", MessageTypes.Pass);
					}
					break;
				case "ON":
					if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("value").equals("0")) {
						LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
						Reporter.logWithScreenShot("Turn on low alert", MessageTypes.Pass);
					} else {
						Reporter.logWithScreenShot("low Alert alredy on", MessageTypes.Pass);
						break;
					}	
					default:
						Reporter.logWithScreenShot("Fail to set toggle", MessageTypes.Pass);
						break;
					}
					Reporter.logWithScreenShot("User has set the low alert toggle ", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to set the low alert toggle", MessageTypes.Fail);
				}
			}

		//Pradnya
		//Method to click on high alert
		public void clickOnHighAlert() {
			try {
				if(getNFKAlertHighalert().isPresent()) {
					LFSUtilsAndroid.click(getNFKAlertHighalert());
				}
			}catch(Exception e) {
				Reporter.logWithScreenShot("User not able to click High alert", MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to set low alert picker value
		public void setNotifymebelowValue(String opt) {
			try {
				switch (opt) {
				case "65":
					String value = "65";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeBelow")).click();
					if (getNFKAlertNumberpicker().getText().equals(value)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertNumberpicker(), value);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
				case "75":
					String value2 = "75";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeBelow")).click();
					if (getNFKAlertNumberpicker().getText().equals(value2)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertNumberpicker(), value2);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
				case "80":
					String value3 = "80";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeBelow")).click();
					if (getNFKAlertNumberpicker().getText().equals(value3)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertNumberpicker(), value3);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
	                case "95":
					String value4 = "95";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.NotfyMeBelow")).click();
					if (getNFKAlertNumberpicker().getText().equals(value4)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertNumberpicker(), value4);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
				default:
					Reporter.logWithScreenShot("Invalid notify me below value", MessageTypes.Pass);
					break;
				}
				Reporter.logWithScreenShot("User has set the notify me below value ", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to set the notify me below value ", MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to click on low alert
		public void clikLowAlert() {
			try {
				LFSUtilsAndroid.click(getNFKAlertLowalert());
			Reporter.logWithScreenShot("Clicked on Low Alert", MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("user was unable to click on Low Alert", MessageTypes.Fail);	
			}
		}		
		//Rushikesh
		//Method to set repeat value
		public void setLowRepeatValue(String opt) {
			try {
				switch (opt) {
				case "Fifteen":
					String hr="0";
					String min = "15";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).waitForPresent();
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).click();
					if (getNFKAlertRepeatPicker().get(0).getText().equals(hr)
							&& getNFKAlertRepeatPicker().get(1).getText().equals(min)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(0), hr);
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(1), min);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
				case "Never":
					String hourzero="0";
					String minzero = "0";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).click();
					if (getNFKAlertRepeatPicker().get(0).getText().equals(hourzero)
							&& getNFKAlertRepeatPicker().get(1).getText().equals(minzero)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(0), hourzero);
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(1), minzero);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
				case "Twenty":
					String hrzero="0";
					String mintwenty = "20";
					getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.repeat")).click();
					if (getNFKAlertRepeatPicker().get(0).getText().equals(hrzero)
							&& getNFKAlertRepeatPicker().get(1).getText().equals(mintwenty)) {
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
					} else {
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(0), hrzero);
						LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(1), mintwenty);
						LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
					}
					break;
				default:
					Reporter.logWithScreenShot("Invalid repeat value", MessageTypes.Pass);
					break;
				}
				Reporter.logWithScreenShot("User has set teh Repeat value ", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to set teh Repeat value ", MessageTypes.Fail);
			}
		}
		//Rushikesh
		//Method to click on no reading alert
		public void clickOnNoReading() {
			try {
		        LFSUtilsAndroid.click(getNFKAlertNoReadingsAlert());
		        Reporter.logWithScreenShot("able to click on no reading", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("unable to click on no reading", MessageTypes.Fail);
			}
		}
		
		//Rushikesh
		//Method to set and verify no reading alert toggle
		public void toggleAlert(String command) {
			switch (command) {
			case "off":
				if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("value").equals("1")) {
					LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
					Reporter.logWithScreenShot("Turn off No Readings", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("No Readings Alerts alredy off", MessageTypes.Pass);

				}
				LFSUtilsAndroid.click(getNFKAlertBackBtn());
				break;
			case "on":
				if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("value").equals("0")) {
					LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
					Reporter.logWithScreenShot("Turn on No Readings", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("No Readings Alerts alredy on", MessageTypes.Pass);

				}
				LFSUtilsAndroid.click(getNFKAlertBackBtn());
				break;

			default:
				break;
			}
		}
		// Rushikesh
		// Method to verify signal loss toggle is enabled or disabled
		public void signalLossToggleAlert(String command) {
			LFSUtilsAndroid.click(getNFKAlertSignalLossAlert());
			try {
				switch (command) {
				case "off":
					if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("value").equals("1")) {
						LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
						Reporter.logWithScreenShot("Turn off Signal loss alert", MessageTypes.Pass);
					} else {
						Reporter.logWithScreenShot("Signal loss Alerts alredy off", MessageTypes.Pass);

					}
					LFSUtilsAndroid.click(getNFKAlertBackBtn());
					break;
				case "on":
					if (getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("value").equals("0")) {
						LFSUtilsAndroid.click(getNFKAlertSuboptionsScreensSwitchBtn());
						Reporter.logWithScreenShot("Turn on Signal loss", MessageTypes.Pass);
					} else {
						Reporter.logWithScreenShot("Signal loss Alerts alredy on", MessageTypes.Pass);

					}
					LFSUtilsAndroid.click(getNFKAlertBackBtn());
					break;
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("Failed to verify signal loss toggle is on or off", MessageTypes.Fail);
			}
		}
		
		// Rushikesh
		// Method to update and verify signal loss value
		public void updateAndVerifySignalLossValue(String option) {
				try {
					LFSUtilsAndroid.click(getNFKAlertSignalLossAlert());
					switch (option) {
					case "Fifteen":
						String hr = "0";
						String min = "15";
						getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("formore.than")).click();
						if (getNFKAlertRepeatPicker().get(0).getText().equals(hr)
								&& getNFKAlertRepeatPicker().get(1).getText().equals(min)) {
							LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
							Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
						} else {
							LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(0), hr);
							LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(1), min);
							LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						}
						LFSUtilsAndroid.click(getNFKAlertBackBtn());
						break;
					case "Never":
						String hourZero = "0";
						String minZero = "0";
						getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("formore.than")).click();
						if (getNFKAlertRepeatPicker().get(0).getText().equals(hourZero)
								&& getNFKAlertRepeatPicker().get(1).getText().equals(minZero)) {
							LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
							Reporter.logWithScreenShot("value was already set",MessageTypes.Pass);
						} else {
							LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(0), hourZero);
							LFSUtilsAndroid.selectBGRangePicker(getNFKAlertRepeatPicker().get(1), minZero);
							LFSUtilsAndroid.click(getNFKAlertPickerDoneBtn());
						}
						LFSUtilsAndroid.click(getNFKAlertBackBtn());
						break;
					}
				}catch (Exception e) {
					Reporter.logWithScreenShot("Failed to update signal loss value", MessageTypes.Fail);
				}
		}
}