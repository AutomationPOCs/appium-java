package com.NFK.version1.iOS.pages;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class AlertsPageIOS extends WebDriverBaseTestPage<WebDriverTestPage>
{	
	@FindBy(locator = "NFKios.alertspage.Home.btn")
	private QAFWebElement NFKiosAlertspageHomeBtn;
	@FindBy(locator = "NFKios.alertspage.popup.text")
	private QAFWebElement NFKiosAlertspagePopupText;
	@FindBy (locator= "NFKios.alertspage.alarm.txt")
	private QAFWebElement NFKiosAlertspagealarmtxt;
	@FindBy (locator= "NFKios.alertspage.urgent.low.alarm.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmlbl;
	@FindBy (locator= "NFKios.alertspage.urgent.low.soon.alarm.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.title")
	private QAFWebElement NFKiosAlertspageurgentlowalarmtitle;
	@FindBy (locator="NFKios.alertspage.notify.me.below.txt")
	private QAFWebElement NFKiosAlertspagenotifymebelowtxt;
	@FindBy (locator="NFKios.alertspage.repeat.txt")
	private QAFWebElement NFKiosAlertspagerepeatTxt;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.back.btn.urgent.low")
	private QAFWebElement NFKiosAlertspageurgentlowalarmbackbtnurgentlow;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.back.btn.urgent.low.soon")
	private QAFWebElement NFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon;
	@FindBy (locator="NFKios.alertspage.back.btn")
	private QAFWebElement NFKiosAlertspagebackbtn;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.repeat.hint.txt")
	private QAFWebElement NFKiosAlertspageurgentlowalarmrepeathinttxt;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.sound.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmsoundlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.vibration.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmvibrationlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.urgent.low.hint.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmurgentlowhintlbl;
	@FindBy (locator= "NFKios.alertspage.urgent.low.alarm.sound.title")
	private QAFWebElement NFKiosAlertspageurgentlowalarmsoundtitle;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.vibration.title")
	private QAFWebElement NFKiosAlertspageurgentlowalarmvibrationtitle;
	@FindBy (locator= "NFKios.alertspage.urgent.low.soon.alarm.title")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmtitle;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.repreat")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmrepreat;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.sound.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmsoundlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.vibration.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmvibrationlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.repeat.hint.txt")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmrepeathinttxt;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.urgent.low.select")
	private QAFWebElement NFKiosAlertspageurgentlowalarmurgentlowselect;
	@FindBy(locator="NFKios.alertspage.urgentlow.back.btn")
	private QAFWebElement NFKiosAlertspageUrgentLowBackBtn;
	@FindBy(locator="NFKios.alertspage.urgentlowsoon.back.btn")
	private QAFWebElement NFKiosAlertspageUrgentlowsoonBackBtn;
	@FindBy(locator="NFKios.alertspage.urgentlow.elements.soundvibration")
	private List<QAFWebElement> NFKiosAlertspageUrgentlowElementsSoundvibration;
	@FindBy(locator="NFKios.alertspage.urgentlow.checkmark")
	private QAFWebElement NFKiosAlertspageUrgentlowCheckmark;
	//Low Alert page
	@FindBy(locator="NFKios.alertspage.lowalert.txt")
	private QAFWebElement NFKiosAlertspageLowalertTxt;
    @FindBy(locator="NFKios.alertspage.lowalert.field")
	private QAFWebElement NFKiosAlertspageLowalertField;
    @FindBy(locator="NFKios.alertspage.switch.btn")
    private QAFWebElement NFKiosAlertspageSwitchBtn;
    @FindBy(locator="NFKios.alertspage.alertsc.switch.btn")
    private QAFWebElement NFKiosAlertspageAlertscSwitchBtn;
    @FindBy(locator="NFKios.alertspage.lowalert.repeatfield")
    private QAFWebElement NFKiosAlertspageLowalertRepeatfield;
    @FindBy(locator="NFKios.alertspage.lowalert.soundfield")
    private QAFWebElement NFKiosAlertspageLowalertSoundfield;
    @FindBy(locator="NFKios.alertspage.lowalert.hint.txt")
    private QAFWebElement NFKiosAlertspageLowalertHintTxt;
    @FindBy(locator="NFKios.alertspage.lowalert.back.btn")
    private QAFWebElement NFKiosAlertspageLowalertBackBtn;
    @FindBy(locator="NFKios.alertspage.lowalert.notify.mebelow.btn")
    private QAFWebElement NFKiosAlertspageLowalertNotifyMebelowBtn;
    @FindBy(locator="NFKios.alertspage.picker.btn")
    private QAFWebElement NFKiosAlertspagePickerBtn;
    @FindBy(locator="NFKios.alertspage.picker.min.btn")
    private QAFWebElement NFKiosAlertspagePickerMinBtn;
    @FindBy(locator="NFKios.alertspage.picker.done.btn")
    private QAFWebElement NFKiosAlertspagePickerDoneBtn;
    @FindBy(locator="NFKios.alertspage.picker.cancel.btn")
    private QAFWebElement NFKiosAlertspagePickerCancelBtn;
    //High Alert
    @FindBy(locator="NFKios.alertspage.highalert.txt")
    private QAFWebElement NFKiosAlertspageHighalertTxt;
    @FindBy(locator="NFKios.alertspage.highalert.notify.meabove.btn")
    private QAFWebElement NFKiosAlertspageHighalertNotifyMeaboveBtn;
    @FindBy(locator="NFKios.alertspage.highalert.repeatfield")
    private QAFWebElement NFKiosAlertspageHighalertRepeatfield;
    @FindBy(locator="NFKios.alertspage.highalert.soundfield")
    private QAFWebElement NFKiosAlertspageHighalertSoundfield;
    @FindBy(locator="NFKios.alertspage.highalert.hint.txt")
    private QAFWebElement NFKiosAlertspageHighalertHintTxt;
    @FindBy(locator="NFKios.alertspage.highalert.back.btn")
    private QAFWebElement NFKiosAlertspageHighalertBackBtn;
    //Fall Rate
    @FindBy(locator="NFKios.alertspage.fallratealert.txt")
    private QAFWebElement NFKiosAlertspageFallratealertTxt;
    @FindBy(locator="NFKios.alertspage.fallratealert.notify.atbelow.btn")
    private QAFWebElement NFKiosAlertspageFallratealertNotifyAtbelowBtn;
    @FindBy(locator="NFKios.alertspage.fallratealert.soundfield")
    private QAFWebElement NFKiosAlertspageFallratealertSoundfield;
    @FindBy(locator="NFKios.alertspage.fallratealert.hint.txt")
    private QAFWebElement NFKiosAlertspageFallratealertHintTxt;
    @FindBy(locator="NFKios.alertspage.fallratealert.back.btn")
    private QAFWebElement NFKiosAlertspageFallratealertBackBtn;
    //Rise rate
    @FindBy(locator="NFKios.alertspage.riseratealert.txt")
    private QAFWebElement NFKiosAlertspageRiseratealertTxt;
    @FindBy(locator="NFKios.alertspage.riseratealert.notify.atabove.btn")
    private QAFWebElement NFKiosAlertspageRiseratealertNotifyAtaboveBtn;
    @FindBy(locator="NFKios.alertspage.riseratealert.soundfield")
    private QAFWebElement NFKiosAlertspageRiseratealertSoundfield;
    @FindBy(locator="NFKios.alertspage.riseratealert.hint.txt")
    private QAFWebElement NFKiosAlertspageRiseratealertHintTxt;
    @FindBy(locator="NFKios.alertspage.riseratealert.back.btn")
    private QAFWebElement NFKiosAlertspageRiseratealertBackBtn;
  //signal loss
    @FindBy(locator="NFKios.alertspage.signalloss.back.btn")
        private QAFWebElement NFKiosAlertspageSignallossBackBtn;
    @FindBy(locator="NFKios.alertspage.signalloss.txt")
        private QAFWebElement NFKiosAlertspageSignallossTxt;
    @FindBy(locator="NFKios.alertspage.signalloss.formorethan")
        private QAFWebElement NFKiosAlertspageSignallossFormorethan;
    @FindBy(locator="NFKios.alertspage.signalloss.soundfield")
        private QAFWebElement NFKiosAlertspageSignallossSoundfield;
    @FindBy(locator="NFKios.alertspage.signalloss.hint.txt")
        private QAFWebElement NFKiosAlertspageSignallossHintTxt;
    	
    //No reading
    @FindBy(locator="NFKios.alertspage.noreading.back.btn")
        private QAFWebElement NFKiosAlertspageNoreadingBackBtn;
    @FindBy(locator="NFKios.alertspage.noreading.txt")
        private QAFWebElement NFKiosAlertspageNoreadingTxt;
    @FindBy(locator="NFKios.alertspage.noreading.field")
        private QAFWebElement NFKiosAlertspageNoreadingField;
    @FindBy(locator="NFKios.alertspage.noreading.soundfield")
        private QAFWebElement NFKiosAlertspageNoreadingSoundfield;	
    @FindBy(locator="NFKios.alertspage.noreading.hint.txt")
        private QAFWebElement NFKiosAlertspageNoreadingHintTxt;	
    
    //Edit schedule
    @FindBy(locator="NFKios.alertspage.schedule.name.field")
      private QAFWebElement NFKiosAlertspageScheduleNameField;
    @FindBy(locator="NFKios.editschedulepage.title")
     private QAFWebElement NFKiosEditschedulepageTitle;
    @FindBy(locator="NFKios.editschedulepage.cancel.btn")
     private QAFWebElement  NFKiosEditschedulepageCancelBtn;
    @FindBy(locator="NFKios.editschedulepage.save.btn")
      private QAFWebElement  NFKiosEditschedulepageSaveBtn;
    @FindBy(locator="NFKios.editschedulepage.schdeule.label")
      private QAFWebElement  NFKiosEditschedulepageSchdeuleLabel;
    @FindBy(locator="NFKios.editschedulepage.schdeule.name")
      private QAFWebElement  NFKiosEditschedulepageSchdeuleName;
    @FindBy(locator="NFKios.editschedulepage.weekend.label")
     private QAFWebElement NFKiosEditschedulepageWeekendLabel;
    @FindBy(locator="NFKios.editschedulepage.alertsettings.label")
      private QAFWebElement NFKiosEditschedulepageAlertsettingsLabel;
    @FindBy(locator="NFKios.editschedulepage.treatcritical.label")
    private QAFWebElement NFKiosEditschedulepageTreatcriticalLabel;
    @FindBy(locator="NFKios.editschedulepage.warningmsg.label")
    private QAFWebElement NFKiosEditschedulepageWarningmsgLabel;
    @FindBy(locator="NFKios.editschedulepage.starttime.label")
      private QAFWebElement NFKiosEditschedulepageStarttimeLabel;
    @FindBy(locator="NFKios.editschedulepage.stoptime.label")
    private QAFWebElement NFKiosEditschedulepageStoptimeLabel;
    @FindBy(locator="NFKios.editschedulepage.daysofweek.field")
      private QAFWebElement NFKiosEditschedulepageDaysofweekField;
    @FindBy(locator="NFKios.editschedulepage.urgentlbl.label")
     private QAFWebElement NFKiosEditschedulepageUrgentlblLabel;
    @FindBy(locator="NFKios.editschedulepage.low.label")
     private QAFWebElement NFKiosEditschedulepageLowLabel;
    @FindBy(locator="NFKios.editschedulepage.fallrate.label")
      private QAFWebElement NFKiosEditschedulepageFallrateLabel;
    @FindBy(locator="NFKios.editschedulepage.high.label")
      private QAFWebElement NFKiosEditschedulepageHighLabel;
    @FindBy(locator="NFKios.editschedulepage.riserate.label")
      private QAFWebElement NFKiosEditschedulepageRiserateLabel;
    @FindBy(locator="NFKios.editschedulepage.hrs.pkr")
    private QAFWebElement NFKiosEditschedulepageHrsPkr;
    @FindBy(locator="NFKios.editschedulepage.minute.pkr")
    private QAFWebElement NFKiosEditschedulepageMinutePkr;
    @FindBy(locator="NFKios.editschedulepage.ampm.pkr")
    private QAFWebElement NFKiosEditschedulepageAmPmPkr;
    @FindBy(locator="NFKios.editschedulepage.done.btn")
    private QAFWebElement NFKiosEditschedulepageDoneBtn;
    @FindBy(locator="NFKios.editschedulepage.picker.cancel.btn")
    private QAFWebElement NFKiosEditschedulepagePickerCancelBtn;
    @FindBy(locator="NFKios.editschedulepage.week.back.btn")
    private QAFWebElement NFKiosEditschedulepageWeekBackBtn;
    @FindBy(locator="NFKios.alertspage.reset.btn")
    private QAFWebElement NFKiosAlertspageResetBtn;
    @FindBy(locator="NFKios.alertspage.resetpop.reset.btn")
    private QAFWebElement NFKiosAlertspageResetpopResetBtn;
    @FindBy(locator="NFKios.alertspage.critical.toggle.btn")
    private QAFWebElement NFKiosAlertspageCriticalToggleBtn;
    @FindBy(locator="NFKios.alertspage.setting.popup.title")
     private QAFWebElement NFKiosAlertspageSettingPopupTitle;
    @FindBy(locator="NFKios.alertspage.setting.notnow.btn")
    private QAFWebElement NFKiosAlertspageSettingNotnowBtn;
    @FindBy(locator="NFKios.alertspage.setting.setting.btn")
    private QAFWebElement NFKiosAlertspageSettingSettingBtn;
    @FindBy(locator="NFKios.alertspage.Back.btn")
    private QAFWebElement NFKiosAlertspageBackbtn;
    @FindBy(locator="NFKios.Alertspage.NotifyBelowvalue.Btn")
    private QAFWebElement NFKiosAlertspageNotifyBelowvalueBtn;
    @FindBy(locator="NFKios.alertspage.NotifyBelowvalue.done.btn")
    private QAFWebElement NFKiosalertspageNotifyBelowvaluedonebtn;
    @FindBy(locator="NFKios.alertspage.schedule.HighAlert")
    private QAFWebElement NFKiosAlertspageScheduleHighAlert;
    @FindBy(locator="NFKios.alertspage.schedule.LowAlert")
    private QAFWebElement NFKiosAlertspageScheduleLowAlert;
    @FindBy(locator = "NFKios.alertspage.customAlert.save.btn")
	private QAFWebElement NFKiosAlertspageCustomAlertSaveBtn;
    @FindBy(locator="NFKios.alertspage.schedule.customHighAlert")
    private QAFWebElement NFKiosAlertspageScheduleCustomHighAlert;
    @FindBy(locator="NFKios.alertspage.alertsc.TreatasCritical.btn")
    private QAFWebElement NFKiosalertspagealertscTreatasCriticalbtn;
    public QAFWebElement getNFKiosalertspagealertscTreatasCriticalbtn() {
		return NFKiosalertspagealertscTreatasCriticalbtn;
	}
    
    @FindBy(locator="NFKios.alertspage.TreatasCritical.btn")
    private QAFWebElement NFKiosalertspageTreatasCriticalbtn;
    public QAFWebElement getNFKiosalertspageTreatasCriticalbtn() {
		return NFKiosalertspageTreatasCriticalbtn;
	}
    
    
    public QAFWebElement getNFKiosAlertspageScheduleCustomHighAlert() {
		return NFKiosAlertspageScheduleCustomHighAlert;
	}
    public QAFWebElement getNFKiosAlertspageCustomAlertSaveBtn() {
		return NFKiosAlertspageCustomAlertSaveBtn;
	}
    public QAFWebElement getNFKiosAlertspagePopupText() {
		return NFKiosAlertspagePopupText;
	}
    public QAFWebElement getNFKiosAlertspageScheduleHighAlert(){
    	return NFKiosAlertspageScheduleHighAlert;
    }
    public QAFWebElement getNFKiosAlertspageHomeBtn() {
		return NFKiosAlertspageHomeBtn;
    }
    public QAFWebElement getNFKiosAlertspageNotifyBelowvalueBtn(){
    	return NFKiosAlertspageNotifyBelowvalueBtn;
    }
    
    public QAFWebElement getNFKiosalertspageNotifyBelowvaluedonebtn(){
    	return NFKiosalertspageNotifyBelowvaluedonebtn;
    }
public QAFWebElement getNFKiosAlertspageSettingPopupTitle(){
    	return NFKiosAlertspageSettingPopupTitle;
    }
    public QAFWebElement getNFKiosAlertspageSettingNotnowBtn() {
    	return NFKiosAlertspageSettingNotnowBtn;
    }
    public QAFWebElement getNFKiosAlertspageSettingSettingBtn() {
    	return NFKiosAlertspageSettingSettingBtn;
    }
	public QAFWebElement getNFKiosAlertspageCriticalToggleBtn(){
		return NFKiosAlertspageCriticalToggleBtn;
	}	
	public QAFWebElement getNFKiosAlertspageScheduleLowAlert(){
    	return NFKiosAlertspageScheduleLowAlert;
    }
	
	public QAFWebElement getNFKiosAlertspageBackbtn(){
		return NFKiosAlertspageBackbtn;
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	public QAFWebElement getNFKiosAlertspageResetBtn() {
		return NFKiosAlertspageResetBtn;
	}
	public QAFWebElement getNFKiosAlertspageResetpopResetBtn() {
		return NFKiosAlertspageResetpopResetBtn;
	}
	//Edit schedule
	 public QAFWebElement getNFKiosAlertspageScheduleNameField() {
		 return NFKiosAlertspageScheduleNameField;
	 }
	 public QAFWebElement getNFKiosEditschedulepageWeekBackBtn() {
		 return NFKiosEditschedulepageWeekBackBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageHrsPkr() {
		 return NFKiosEditschedulepageHrsPkr;
	 }
	 public QAFWebElement getNFKiosEditschedulepageMinutePkr() {
		 return NFKiosEditschedulepageMinutePkr;
	 }
	 public QAFWebElement getNFKiosEditschedulepageAmPmPkr() {
		 return NFKiosEditschedulepageAmPmPkr;
	 }
	 public QAFWebElement getNFKiosEditschedulepageDoneBtn() {
		 return NFKiosEditschedulepageDoneBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepagePickerCancelBtn() {
		 return NFKiosEditschedulepagePickerCancelBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageTitle() {
		 return NFKiosEditschedulepageTitle;
	 }
	 public QAFWebElement getNFKiosEditschedulepageCancelBtn() {
		 return NFKiosEditschedulepageCancelBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageSaveBtn() {
		 return NFKiosEditschedulepageSaveBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageSchdeuleLabel() {
		 return NFKiosEditschedulepageSchdeuleLabel;
	 }	
	 public QAFWebElement getNFKiosEditschedulepageSchdeuleName(){
		 return NFKiosEditschedulepageSchdeuleName;
	 }	
	 public QAFWebElement getNFKiosEditschedulepageWeekendLabel(){
		 return NFKiosEditschedulepageWeekendLabel;
	 }	
	 public QAFWebElement getNFKiosEditschedulepageAlertsettingsLabel(){
		 return NFKiosEditschedulepageAlertsettingsLabel;
	 }	
	public QAFWebElement getNFKiosEditschedulepageTreatcriticalLabel() {
		return NFKiosEditschedulepageTreatcriticalLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageWarningmsgLabel() {
		return NFKiosEditschedulepageWarningmsgLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageStarttimeLabel(){
		return NFKiosEditschedulepageStarttimeLabel;
	}	
	public QAFWebElement getNFKiosEditschedulepageStoptimeLabel() {
		return NFKiosEditschedulepageStoptimeLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageDaysofweekField(){
		return NFKiosEditschedulepageDaysofweekField;
	}
	public QAFWebElement getNFKiosEditschedulepageUrgentlblLabel(){
		return NFKiosEditschedulepageUrgentlblLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageLowLabel(){
		return NFKiosEditschedulepageLowLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageFallrateLabel() {
		return NFKiosEditschedulepageFallrateLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageHighLabel() {
		return NFKiosEditschedulepageHighLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageRiserateLabel() {
		return NFKiosEditschedulepageRiserateLabel;
	}
	public QAFWebElement getNFKiosAlertspageAlertscSwitchBtn(){
		return NFKiosAlertspageAlertscSwitchBtn;
	}
	//Low Alert page
	public QAFWebElement getNFKiosAlertspageLowalertTxt() {
		return NFKiosAlertspageLowalertTxt;
	}
	public QAFWebElement getNFKiosAlertspagePickerMinBtn() {
		return NFKiosAlertspagePickerMinBtn;
	}
	public QAFWebElement getNFKiosAlertspagePickerBtn() {
		return NFKiosAlertspagePickerBtn;
	}
	public QAFWebElement getNFKiosAlertspagePickerDoneBtn() {
		return NFKiosAlertspagePickerDoneBtn;
	}
	public QAFWebElement getNFKiosAlertspagePickerCancelBtn() {
		return NFKiosAlertspagePickerCancelBtn;
	}
	public QAFWebElement getNFKiosAlertspageLowalertNotifyMebelowBtn() {
		return NFKiosAlertspageLowalertNotifyMebelowBtn;
	}
	public QAFWebElement getNFKiosAlertspageLowalertField() {
		return NFKiosAlertspageLowalertField;
	}
	public QAFWebElement getNFKiosAlertspageSwitchBtn() {
		return NFKiosAlertspageSwitchBtn;
	}
	public QAFWebElement getNFKiosAlertspageLowalertRepeatfield() {
		return NFKiosAlertspageLowalertRepeatfield;
	}
	public QAFWebElement getNFKiosAlertspageLowalertSoundfield() {
		return NFKiosAlertspageLowalertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageLowalertHintTxt() {
		return NFKiosAlertspageLowalertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageLowalertBackBtn() {
		return NFKiosAlertspageLowalertBackBtn;
	}
	//High Rate
	public QAFWebElement getNFKiosAlertspageHighalertTxt() {
		 return NFKiosAlertspageHighalertTxt;
	}
	public QAFWebElement getNFKiosAlertspageHighalertNotifyMeaboveBtn() {
		return NFKiosAlertspageHighalertNotifyMeaboveBtn;
	}
	public QAFWebElement getNFKiosAlertspageHighalertRepeatfield() {
		return NFKiosAlertspageHighalertRepeatfield;
	}
	public QAFWebElement getNFKiosAlertspageHighalertSoundfield() {
		return NFKiosAlertspageHighalertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageHighalertHintTxt() {
		return NFKiosAlertspageHighalertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageHighalertBackBtn() {
		return NFKiosAlertspageHighalertBackBtn;
	}
	//Fall Rate
	public QAFWebElement getNFKiosAlertspageFallratealertTxt() {
		return NFKiosAlertspageFallratealertTxt;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertNotifyAtbelowBtn() {
		return NFKiosAlertspageFallratealertNotifyAtbelowBtn;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertSoundfield() {
		return NFKiosAlertspageFallratealertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertHintTxt() {
		return NFKiosAlertspageFallratealertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertBackBtn() {
		return NFKiosAlertspageFallratealertBackBtn;
	}
	//Rise Rate Alert
	public QAFWebElement getNFKiosAlertspageRiseratealertTxt() {
		return NFKiosAlertspageRiseratealertTxt;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertNotifyAtaboveBtn() {
		return NFKiosAlertspageRiseratealertNotifyAtaboveBtn;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertSoundfield() {
		return NFKiosAlertspageRiseratealertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertHintTxt() {
		return NFKiosAlertspageRiseratealertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertBackBtn() {
		return NFKiosAlertspageRiseratealertBackBtn;
	}
	//Signal loss
		public QAFWebElement getNFKiosAlertspageSignallossBackBtn() {
			return NFKiosAlertspageSignallossBackBtn;
		}
		public QAFWebElement getNFKiosAlertspageSignallossTxt() {
			return NFKiosAlertspageSignallossTxt;
		}
		public QAFWebElement getNFKiosAlertspageSignallossFormorethan() {
			return NFKiosAlertspageSignallossFormorethan;
		}
		public QAFWebElement getNFKiosAlertspageSignallossSoundfield() {
			return NFKiosAlertspageSignallossSoundfield;
		}
		public QAFWebElement getNFKiosAlertspageSignallossHintTxt() {
			return NFKiosAlertspageSignallossHintTxt;
		}
		
		//no reading
		public QAFWebElement getNFKiosAlertspageNoreadingBackBtn() {
			return NFKiosAlertspageNoreadingBackBtn;
		}
		public QAFWebElement getNFKiosAlertspageNoreadingTxt() {
			return NFKiosAlertspageNoreadingTxt;
		}
	    public QAFWebElement getNFKiosAlertspageNoreadingField(){
		     return NFKiosAlertspageNoreadingField;
		}
		public QAFWebElement getNFKiosAlertspageNoreadingSoundfield(){
		   return NFKiosAlertspageNoreadingSoundfield;
		}
		public QAFWebElement getNFKiosAlertspageNoreadingHintTxt(){
		   return NFKiosAlertspageNoreadingHintTxt; 
		}
		public QAFWebElement getNFKiosAlertspagealarmtxt() {
			return NFKiosAlertspagealarmtxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmlbl() {
			return NFKiosAlertspageurgentlowalarmlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmlbl() {
			return NFKiosAlertspageurgentlowsoonalarmlbl;
		}
	
		public QAFWebElement getNFKiosAlertspageurgentlowalarmtitle() {
			return NFKiosAlertspageurgentlowalarmtitle;
		}
		
		public QAFWebElement getNFKiosAlertspagenotifymebelowtxt() {
			return NFKiosAlertspagenotifymebelowtxt;
		}
		
		public QAFWebElement getNFKiosAlertspagerepeatTxt() {
			return NFKiosAlertspagerepeatTxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmbackbtnurgentlow() {
			return NFKiosAlertspageurgentlowalarmbackbtnurgentlow;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon() {
			return NFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon;
		}
		
		public QAFWebElement getNFKiosAlertspagebackbtn() {
			return NFKiosAlertspagebackbtn;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmrepeathinttxt() {
			 return NFKiosAlertspageurgentlowalarmrepeathinttxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmsoundlbl() {
			return NFKiosAlertspageurgentlowalarmsoundlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmvibrationlbl() {
			return NFKiosAlertspageurgentlowalarmvibrationlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmurgentlowhintlbl() {
			return NFKiosAlertspageurgentlowalarmurgentlowhintlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmsoundtitle() {
			return NFKiosAlertspageurgentlowalarmsoundtitle;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmvibrationtitle() {
			return NFKiosAlertspageurgentlowalarmvibrationtitle;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmtitle() {
			return NFKiosAlertspageurgentlowsoonalarmtitle;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmrepreat() {
			return NFKiosAlertspageurgentlowsoonalarmrepreat;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmsoundlbl() {
			return NFKiosAlertspageurgentlowsoonalarmsoundlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmvibrationlbl() {
			return NFKiosAlertspageurgentlowsoonalarmvibrationlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmrepeathinttxt() {
			return NFKiosAlertspageurgentlowsoonalarmrepeathinttxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmurgentlowselect() {
			return NFKiosAlertspageurgentlowalarmurgentlowselect;
		}
		
		public QAFWebElement getNFKiosAlertspageUrgentLowBackBtn() {
			return NFKiosAlertspageUrgentLowBackBtn;
		}
		
		public QAFWebElement getNFKiosAlertspageUrgentlowsoonBackBtn() {
			return NFKiosAlertspageUrgentlowsoonBackBtn;
		}
		public List<QAFWebElement> getNFKiosAlertspageUrgentlowElementsSoundvibration() {
			return NFKiosAlertspageUrgentlowElementsSoundvibration;
	    	}
		
		public QAFWebElement getNFKiosAlertspageUrgentlowCheckmark() {
			return NFKiosAlertspageUrgentlowCheckmark;
		}
		@FindBy(locator = "NFKios.alertspage.info.btn")
	private QAFWebElement NFKiosAlertspageInfoBtn;

	public QAFWebElement getNFKiosAlertspageInfoBtn() {
		return NFKiosAlertspageInfoBtn;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.heading")
	private QAFWebElement NFKiosAlertspageDevicesettingalertHeading;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertHeading() {
		return NFKiosAlertspageDevicesettingalertHeading;
	}
	@FindBy(locator="NFKios.Alertspage.NotifyAbovevalue.Btn")
    private QAFWebElement NFKiosAlertspageNotifyAbovevalueBtn;
    @FindBy(locator="NFKios.alertspage.NotifyAbovevalue.done.btn")
    private QAFWebElement NFKiosalertspageNotifyAbovevaluedonebtn;
    
    public QAFWebElement getNFKiosAlertspageNotifyAbovevalueBtn(){
    	return NFKiosAlertspageNotifyAbovevalueBtn;
    }
	 public QAFWebElement getNFKiosalertspageNotifyAbovevaluedonebtn(){
    	return NFKiosalertspageNotifyAbovevaluedonebtn;
    }
	@FindBy(locator = "NFKios.alertspage.devicesettingalert.title")
	private QAFWebElement NFKiosAlertspageDevicesettingalertTitle;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertTitle() {
		return NFKiosAlertspageDevicesettingalertTitle;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.subTitle")
	private QAFWebElement NFKiosAlertspageDevicesettingalertSubTitle;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertSubTitle() {
		return NFKiosAlertspageDevicesettingalertSubTitle;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.descriptionLabel")
	private QAFWebElement NFKiosAlertspageDevicesettingalertDescriptionLabel;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertDescriptionLabel() {
		return NFKiosAlertspageDevicesettingalertDescriptionLabel;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.criticalAlertsLabel")
	private QAFWebElement NFKiosAlertspageDevicesettingalertCriticalAlertsLabel;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertCriticalAlertsLabel() {
		return NFKiosAlertspageDevicesettingalertCriticalAlertsLabel;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.soundsLabel")
	private QAFWebElement NFKiosAlertspageDevicesettingalertSoundsLabel;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertSoundsLabel() {
		return NFKiosAlertspageDevicesettingalertSoundsLabel;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.mobilesettinglink")
	private QAFWebElement NFKiosAlertspageDevicesettingalertMobilesettinglink;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertMobilesettinglink() {
		return NFKiosAlertspageDevicesettingalertMobilesettinglink;
	}

	@FindBy(locator = "NFKios.alertspage.devicesettingalert.allowNotificationsLabel")
	private QAFWebElement NFKiosAlertspageDevicesettingalertAllowNotificationsLabel;

	public QAFWebElement getNFKiosAlertspageDevicesettingalertAllowNotificationsLabel() {
		return NFKiosAlertspageDevicesettingalertAllowNotificationsLabel;
	}

	@FindBy(locator = "NFKios.alertspage.setting.title")
	private QAFWebElement NFKiosAlertspageSettingTitle;

	public QAFWebElement getNFKiosAlertspageSettingTitle() {
		return NFKiosAlertspageSettingTitle;
	}

	@FindBy(locator = "NFKios.alertspage.setting.bluetooth")
	private QAFWebElement NFKiosAlertspageSettingBluetooth;

	public QAFWebElement getNFKiosAlertspageSettingBluetooth() {
		return NFKiosAlertspageSettingBluetooth;
	}
	@FindBy(locator = "NFKios.alertspage.highalert.back.btn")
	private QAFWebElement getNFKiosAlertspageAlertBackBtn;

	public QAFWebElement getNFKiosAlertspageAlertBackBtn() {
		return NFKiosAlertspageHighalertBackBtn;
	}
	@FindBy(locator = "NFKios.alertspage.back.btn")
	private QAFWebElement NFKiosAlertspageBackBtn;

	public QAFWebElement getNFKiosAlertspageBackBtn() {
		return NFKiosAlertspageBackBtn;
	}
	public QAFWebElement getNFKiosSignuppageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", text);
	}

	@FindBy(locator = "NFKios.alertspage.MobileDeviceAlertsOff.Banner.txt")
	private QAFWebElement NFKiosalertspageMobileDeviceAlertsOffBannertxt;
	
	public QAFWebElement getNFKiosalertspageMobileDeviceAlertsOffBannertxt() {
		return NFKiosalertspageMobileDeviceAlertsOffBannertxt;
	}
	@FindBy(locator = "NFKios.alertspage.ChangeYourSettingsPopup.lbl")
	private QAFWebElement NFKiosalertspageChangeYourSettingsPopuplbl;
	
	public QAFWebElement getNFKiosalertspageChangeYourSettingsPopuplbl() {
		return NFKiosalertspageChangeYourSettingsPopuplbl;
	}

	@FindBy(locator = "NFKios.alertspage.ChangeYourSettingsPopup.txt")
	private QAFWebElement NFKiosalertspageChangeYourSettingsPopuptxt;
	
	public QAFWebElement getNFKiosalertspageChangeYourSettingsPopuptxt() {
		return NFKiosalertspageChangeYourSettingsPopuptxt;
	}

	@FindBy(locator = "NFKios.alertspage.ChangeYourSettingsPopup.NotNow.Btn")
	private QAFWebElement NFKiosalertspageChangeYourSettingsPopupNotNowBtn;
	
	public QAFWebElement getNFKiosalertspageChangeYourSettingsPopupNotNowBtn() {
		return NFKiosalertspageChangeYourSettingsPopupNotNowBtn;
	}

	@FindBy(locator = "NFKios.alertspage.ChangeYourSettingsPopup.Settings.Btn")
	private QAFWebElement NFKiosalertspageChangeYourSettingsPopupSettingsBtn;
	
	public QAFWebElement getNFKiosalertspageChangeYourSettingsPopupSettingsBtn() {
		return NFKiosalertspageChangeYourSettingsPopupSettingsBtn;
	}
	@FindBy(locator = "NFKios.alertspage.info.btn")
	private QAFWebElement NFKiosalertspageinfobtn;
	
	public QAFWebElement getNFKiosalertspageinfobtn() {
	  	return NFKiosalertspageinfobtn;
	}
	   @FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.lbl")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingslbl;
   
	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingslbl() {
   		return NFKiosalertspageInformationiconMobiledevicesettingslbl;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.txt")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingstxt;
   
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingstxt() {
   		return NFKiosalertspageInformationiconMobiledevicesettingstxt;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Keepyouaware.txt")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsKeepyouawaretxt;
  
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsKeepyouawaretxt() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsKeepyouawaretxt;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Toreceivealertsmakesure.txt")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsToreceivealertsmakesuretxt;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsToreceivealertsmakesuretxt() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsToreceivealertsmakesuretxt;
   	}
 
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Criticalalerts.btn")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsCriticalalertsbtn;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsCriticalalertsbtn() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsCriticalalertsbtn;
   	}
   	
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Timesensitive.btn")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsTimesensitivebtn;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsTimesensitivebtn() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsTimesensitivebtn;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Allownotifications.btn")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsAllownotificationsbtn;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsAllownotificationsbtn() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsAllownotificationsbtn;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Sounds.btn")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsSoundsbtn;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsSoundsbtn() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsSoundsbtn;
   	}
   	
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Gotomobilesettings.link")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsGotomobilesettingslink;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsGotomobilesettingslink() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsGotomobilesettingslink;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Focusmode.txt")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsFocusmodetxt;
 
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsFocusmodetxt() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsFocusmodetxt;
   	}
   	
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Beforeyouturnonfocusmode.txt")
   	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsBeforeyouturnonfocusmodetxt;
  
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsBeforeyouturnonfocusmodetxt() {
   		return NFKiosalertspageInformationiconMobiledevicesettingsBeforeyouturnonfocusmodetxt;
   	}
   	@FindBy(locator = "NFKios.alertspage.Informationicon.Mobiledevicesettings.Cancel.btn")
	private QAFWebElement NFKiosalertspageInformationiconMobiledevicesettingsCancelbtn;
	
   	public QAFWebElement getNFKiosalertspageInformationiconMobiledevicesettingsCancelbtn() {
		return NFKiosalertspageInformationiconMobiledevicesettingsCancelbtn;
	}
 	@FindBy(locator = "NFKios.alertspage.Alerts.Back.btn")
	private QAFWebElement NFKiosalertspageAlertsBackbtn;
	
   	public QAFWebElement getNFKiosalertspageAlertsBackbtn() {
		return NFKiosalertspageAlertsBackbtn;
	}
		
		public void verifyAlertScreen() {
			getNFKiosAlertspagealarmtxt().waitForPresent();
			getNFKiosAlertspagealarmtxt().verifyPresent(LFSUtilsIOS.getPropString("alerts.alarmsSettings.Description"));
			getNFKiosAlertspageurgentlowalarmlbl().verifyPresent("Urgent Low Alarm");
			getNFKiosAlertspageurgentlowsoonalarmlbl().verifyPresent("Urgent Low Soon Alarm");
			Reporter.logWithScreenShot("User verified the Alert screen", MessageTypes.Pass);
		}
			

		public void clickOnUrgentAlarmAndVerify(String option) {
			option = option.toUpperCase();
			switch(option) {
			case "URGENT LOW ALARM":
				verifyUrgenLowAlarmScreen();
				Reporter.logWithScreenShot("User verified the Urgent Low Alarm screen",MessageTypes.Pass);
				break;
			case "URGENT LOW SOON":
				clickUrgentLowSoon();
				verifyUrgenLowSoonAlarmScreen();
				Reporter.logWithScreenShot("User verified the Urgent Low Soon Alarm screen",MessageTypes.Pass);
				break;
			}
				    
		}

		public void verifyUrgenLowAlarmScreen() {
			getNFKiosAlertspageurgentlowalarmlbl().click();
			getNFKiosAlertspageurgentlowalarmtitle().verifyPresent("Urgent Low Alarm");
		    Assert.assertTrue(getNFKiosAlertspagenotifymebelowtxt().getAttribute("visible").
		    		equals("true"),"Notify Me at below");
			Assert.assertTrue(getNFKiosAlertspagerepeatTxt().getAttribute("visible").equals("true"),"Repeat");
			getNFKiosAlertspageurgentlowalarmbackbtnurgentlow().verifyPresent("Back");
			getNFKiosAlertspageurgentlowalarmrepeathinttxt().verifyPresent();
			getNFKiosAlertspageurgentlowalarmsoundlbl().verifyPresent("Sound");
//			getNFKiosAlertspageurgentlowalarmvibrationlbl().verifyPresent("Vibration");
			getNFKiosAlertspageurgentlowalarmurgentlowhintlbl().verifyPresent();
		}
		
		public void verifyUrgenLowSoonAlarmScreen() {	
			try {
			getNFKiosAlertspageurgentlowsoonalarmtitle().verifyPresent("Urgent Low Soon Alarm");
			getNFKiosAlertspageurgentlowsoonalarmrepreat().verifyPresent("Repeat Every (min.)");
			getNFKiosAlertspageurgentlowsoonalarmsoundlbl().verifyPresent("Sound");
//			getNFKiosAlertspageurgentlowsoonalarmvibrationlbl().verifyPresent("Vibration");
			getNFKiosAlertspageurgentlowsoonalarmrepeathinttxt().verifyPresent();
			Reporter.logWithScreenShot("Verified Urgent Low Soon Alarm Screen",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Urgent Low screen not present",MessageTypes.Fail);
		}
	}
		
		private void clickUrgentLowSoon() {
			getNFKiosAlertspageurgentlowsoonalarmlbl().waitForPresent();
			getNFKiosAlertspageurgentlowsoonalarmlbl().click();
			
		}
		public void clickOnSoundAndVibrationUrgentLowAlarm(String str) {
			try {
				if(getNFKiosAlertspageurgentlowalarmtitle().isPresent()) {
					getNFKiosAlertspageurgentlowalarmsoundlbl().click();
					Reporter.logWithScreenShot("Sound screen of Urgent Low",MessageTypes.Pass);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.pause(2000);
					getNFKiosAlertspageurgentlowalarmvibrationlbl().click();
					Reporter.logWithScreenShot("Vibration screen",MessageTypes.Pass);
					LFSUtilsIOS.pause(1000);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.pause(2000);
				}
				else {
					LFSUtilsIOS.waitforLoad();
					getNFKiosAlertspageurgentlowsoonalarmsoundlbl().isPresent();
					getNFKiosAlertspageurgentlowsoonalarmsoundlbl().click();
					Reporter.logWithScreenShot("Sound screen of Urgent Low Soon ",MessageTypes.Pass);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.waitforLoad();
					getNFKiosAlertspageurgentlowsoonalarmvibrationlbl().click();
					Reporter.logWithScreenShot("Vibration screen of Urgent Low soon",MessageTypes.Pass);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.waitforLoad();
				}
			} catch (Exception e) {	
				e.printStackTrace();
			}
		}
		
		
		public void soundVibration(String str1)
		{
			List<QAFWebElement> list=getNFKiosAlertspageUrgentlowElementsSoundvibration();
	           String []linkText =new String[list.size()];
	           int i=0;
	           for(QAFWebElement a: list)
	           {
	              linkText[i]=a.getText().toUpperCase();
	              String str=str1.toUpperCase();
	            if((linkText[i]).equals(str))
	             {
	            	 //check the checkmark is present or not
	            	getNFKiosAlertspageUrgentlowCheckmark().isPresent();
	         	   Reporter.logWithScreenShot("User verified the default value selected ",MessageTypes.Pass);
	            }  
	              i++;
	           }		
		}		
		
		
		public void verifySoundVibrationScreen(String option) {
			switch(option) {
			case "Urgent Low":
				clickOnSoundAndVibrationUrgentLowAlarm(option);	
				LFSUtilsIOS.waitforLoad();
				Reporter.logWithScreenShot("User verified the Urgent low's Sound and vibration screen", MessageTypes.Pass);
				break;
				
			case "Urgent Low Soon":			
				clickOnSoundAndVibrationUrgentLowAlarm(option);	
				LFSUtilsIOS.pause(2000);
				Reporter.logWithScreenShot("User verified Urgent low Soon's Sound and Vibration screen", MessageTypes.Pass);
				break;
			}
		}
		public void clickAlertBackbutton() {
			if(getNFKiosAlertspageUrgentLowBackBtn().isPresent())
			{	
				getNFKiosAlertspageUrgentLowBackBtn().waitForPresent();
				  getNFKiosAlertspageUrgentLowBackBtn().click();
			}
			else {
				getNFKiosAlertspageUrgentlowsoonBackBtn().waitForPresent();
				getNFKiosAlertspageUrgentlowsoonBackBtn().click();
			}
			Reporter.logWithScreenShot("User clicked on Back button", MessageTypes.Pass);
			
		}
		
		public void clickVerifyScreen(String Option) {
			 switch (Option) {
             case "LOW":
          	   clikLowAlert();
          	   verifyLowScreen();
                 break;
             case "HIGH":
            	   clikHighAlert();
            	   verifyHighScreen();
                   break;
             case "FALLRATE":
          	   clikFallRateAlert();
          	   verifyFallRateScreen();
                 break;
             case "RISERATE":
          	   clikRiseRateAlert();
          	   verifyRiseRateScreen();
                 break;
             case "SIGNALLOSS":
            	 clickSignalLoss();
          	     verifySignalLossScreen();               	 
                 break;
             case "NOREADINGS":
            	 clickNoReadings();
          	      verifyNoReadings();
                 break;
              }
			Reporter.logWithScreenShot("User has verified the "+Option+" screen",MessageTypes.Pass);
		}
		
		private void verifyNoReadings() {
			try {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("noreading.title")).
			assertPresent("Title No Readings alert");
			getNFKiosAlertspageFallratealertBackBtn().isPresent();
			Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
					LFSUtilsIOS.getPropString("noreading.title"));
			getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1");
			Assert.assertEquals(getNFKiosAlertspageNoreadingSoundfield().getAttribute("value"),
					LFSUtilsIOS.getPropString("noreading.sound"));
			Assert.assertEquals(getNFKiosAlertspageNoreadingHintTxt().getText(),
					LFSUtilsIOS.getPropString("noreading.hint"));
			Reporter.logWithScreenShot("Verify No Readings",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("No Readings",MessageTypes.Fail);
		}
	}
		private void clickNoReadings() {
			try {
				getNFKiosAlertspageNoreadingTxt().waitForPresent();
				Reporter.logWithScreenShot("Get attribute value is "
						+ getNFKiosAlertspageNoreadingTxt().getAttribute("value") + " displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosAlertspageNoreadingTxt().getAttribute("value").equals("On"));
				LFSUtilsIOS.click(getNFKiosAlertspageNoreadingTxt());
				Reporter.logWithScreenShot("Clicked No Readings", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("User was unable to click on No readings", MessageTypes.Fail);
			}
		}
		
		private void verifySignalLossScreen() {
			try {
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("signalloss.title"))
						.assertPresent("Title Signal Loss alert");
				getNFKiosAlertspageFallratealertBackBtn().isPresent();
				Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
						LFSUtilsIOS.getPropString("signalloss.title"));
				getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1");
				Assert.assertEquals(getNFKiosAlertspageSignallossFormorethan().getAttribute("label"),
						LFSUtilsIOS.getPropString("formore.than"));
				Assert.assertEquals(getNFKiosAlertspageSignallossSoundfield().getAttribute("value"),
						LFSUtilsIOS.getPropString("signalloss.sound"));
				Assert.assertEquals(getNFKiosAlertspageSignallossFormorethan().getAttribute("value"),
						LFSUtilsIOS.getPropString("signalloss.formore.than.val"));
				Assert.assertEquals(getNFKiosAlertspageSignallossHintTxt().getText(),
						LFSUtilsIOS.getPropString("signal.loss.hint"));
				Reporter.logWithScreenShot("Verified Signal Loss Screen", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Loss Screen not verified", MessageTypes.Fail);
			}
		}

		public void clickSignalLoss() {
			try {
				getNFKiosAlertspageSignallossTxt().waitForPresent();
				Reporter.logWithScreenShot("Get attribute value is "
						+ getNFKiosAlertspageSignallossTxt().getAttribute("value") + " displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosAlertspageSignallossTxt().getAttribute("value").equals("On"));
				LFSUtilsIOS.click(getNFKiosAlertspageSignallossTxt());
				LFSUtilsIOS.waitforLoad();
				Reporter.logWithScreenShot("Clicked Signal Loss", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("User was unable to click on Signal loss", MessageTypes.Fail);
			}
		}
		
		private void verifyRiseRateScreen() {
			try {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("rise.rate")).
			assertPresent("Title Rise Rate alert");
			getNFKiosAlertspageRiseratealertBackBtn().isPresent();
		Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
				LFSUtilsIOS.getPropString("rise.rate"));
		getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0");
		
		Assert.assertEquals(getNFKiosAlertspageRiseratealertNotifyAtaboveBtn().getAttribute("label"),
				LFSUtilsIOS.getPropString("notify.me.at.txt"));
		Assert.assertEquals(getNFKiosAlertspageRiseratealertSoundfield().getText(),
				LFSUtilsIOS.getPropString("rise.sound"));
		Assert.assertEquals(getNFKiosAlertspageRiseratealertNotifyAtaboveBtn().getAttribute("value").replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				LFSUtilsIOS.getPropString("notify.me.at"));
		Assert.assertEquals(getNFKiosAlertspageRiseratealertHintTxt().getText(),
				LFSUtilsIOS.getPropString("rise.rate.hint"));			
		Reporter.logWithScreenShot("user has verified the screen",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("user was unable to verify the screen",MessageTypes.Fail);
		}
	}

		private void clikRiseRateAlert() {
			try {
				getNFKiosAlertspageRiseratealertTxt().waitForPresent();
				Assert.assertTrue(getNFKiosAlertspageRiseratealertTxt().getAttribute("value").equals("Off"));
				LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertTxt());
				Reporter.logWithScreenShot("Clicked on Rise Alert", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to click on Rise Alert", MessageTypes.Fail);
			}
		}
		
		private void verifyFallRateScreen() {
		try {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fall.rate")).
	
			assertPresent("Title Fall Rate alert");
			getNFKiosAlertspageFallratealertBackBtn().isPresent();
		Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
				LFSUtilsIOS.getPropString("fall.rate"));
		getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0");
		Assert.assertEquals(getNFKiosAlertspageFallratealertNotifyAtbelowBtn().getAttribute("label"),
				LFSUtilsIOS.getPropString("notify.me.at.txt"));
		Assert.assertEquals(getNFKiosAlertspageFallratealertSoundfield().getText(),
				LFSUtilsIOS.getPropString("fall.sound"));
		Assert.assertEquals(getNFKiosAlertspageFallratealertNotifyAtbelowBtn().getAttribute("value").replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				LFSUtilsIOS.getPropString("notify.me.at"));
		Reporter.logWithScreenShot("Verified Fall Rate screen",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("user was unable to verify Fall Rate screen",MessageTypes.Fail);
		}
		}
		
		private void clikFallRateAlert() {
			try {
				Reporter.logWithScreenShot("Get attribute value is "
						+ getNFKiosAlertspageFallratealertTxt().getAttribute("value") + " displayed",
						MessageTypes.Pass);
				Assert.assertTrue(getNFKiosAlertspageFallratealertTxt().getAttribute("value").equals("Off"));
				LFSUtilsIOS.click(getNFKiosAlertspageFallratealertTxt());
				Reporter.logWithScreenShot("Clicke Fall Rate Alert", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to click on Fall Rate Alert", MessageTypes.Fail);
			}
		}
		
		public void updatePickervalue(String option) {
			switch (option) {
            case "LOW":
            	updateNotifyBelow();
            	updateRepeatValue();
            	clickOnSound();	
                break;
            case "HIGH":
            	updateNotifyAbove();
            	updateRepeatValue();
            	clickOnSound();
                break;
            case "FALLRATE":
            	updateFallNotifyMeAT();
            	clickOnSound();
                break;
            case "RISERATE":
            	updateRiseNotifyMeAT();
            	clickOnSound();
                break;
            case "SIGNALLOSS":
            	updateSignalLossValue();
            	clickOnSound();
                break;
            case "NOREADINGS":
            	clickOnSound();
                break;
             }	
			Reporter.logWithScreenShot("User has updated the picker values",MessageTypes.Pass);
		}
		
		private void updateSignalLossValue() {
			try {
				getNFKiosAlertspageSwitchBtn().getText().equals("0");
				String hrs = String.valueOf(ThreadLocalRandom.current().nextInt(0, 4));
				String min = String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);
				ConfigurationManager.getBundle().setProperty("formorethan.hrs", hrs);
				ConfigurationManager.getBundle().setProperty("formorethan.min", min);
				LFSUtilsIOS.click(getNFKiosAlertspageSignallossFormorethan());
				int mint = 20;
				int raandommin = Integer.parseInt(min);
				if ((hrs.equals("0")) && raandommin <= mint) {
					Reporter.log("The value of minute is less than 20");
				} else if ((hrs.equals("0")) && raandommin >= mint) {
					LFSUtilsIOS.enterText(getNFKiosAlertspagePickerMinBtn(), min);
				} else {
					while (!(getNFKiosAlertspagePickerBtn().getText().equals(hrs))) {
						LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(),hrs);
					}
					while (!(getNFKiosAlertspagePickerMinBtn().getText().equals(min))) {
						LFSUtilsIOS.enterText(getNFKiosAlertspagePickerMinBtn(), min);
					}
					LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
				}
				LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
				Reporter.logWithScreenShot("Updated Signal Loss Value",MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update Signal Loss Value",MessageTypes.Fail);
			}
		}
		
		private void updateRiseNotifyMeAT() {
			try {
				HashMap<Integer, String> map = new HashMap<Integer, String>();
				map.put(1, "2");
				map.put(2, "2.5");
				map.put(3, "3");
				map.put(4, "3.5");
				map.put(5, "4");
				int notifyval = ThreadLocalRandom.current().nextInt(1, 4 + 1);
				String valueaboveme = map.get(notifyval);
				ConfigurationManager.getBundle().setProperty("riserate.value", valueaboveme);
				LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertNotifyAtaboveBtn());
				LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(), valueaboveme);
				LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
				LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
				Reporter.logWithScreenShot("Updated Rise Notification Me ", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update Rise Notification Me ", MessageTypes.Fail);
			}
		}
		
		private void updateFallNotifyMeAT() {
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
				LFSUtilsIOS.click(getNFKiosAlertspageFallratealertNotifyAtbelowBtn());
				LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(), valueaboveme);
				LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
				LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
				Reporter.logWithScreenShot("Update Fall NotifyMe At", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update Fall NotifyMe At", MessageTypes.Fail);
			}
		}
		
		public void verifyUpdatedPickervalue(String option) {
			switch (option) {
            case "LOW":
            	verifyUpdatedLowPickervalue();
                break;
            case "HIGH":
            	verifyUpdatedHighPickervalue();
                break;
            case "FALLRATE":
            	verifyUpdatedFallNotifyMeAtValue();
                break;
            case "RISERATE":
            	verifyUpdatedRiseNotifyMeAtValue();
            	break;
            case "SIGNALLOSS":
            	verifyUpdatedSignalLossValue();
            	break;
             }	
			Reporter.logWithScreenShot("Verified the "+option+" picker values",MessageTypes.Pass);
		}
		
		private void verifyUpdatedSignalLossValue() {
			try {
			getNFKiosAlertspageSwitchBtn().getText().equals("1");
			String tmin="20min";
			String gethrs=(String)ConfigurationManager.getBundle().getProperty("formorethan.hrs");
		String moremin=(String) ConfigurationManager.getBundle().getProperty("formorethan.min");
		String timehrs=gethrs.concat("hours");
		String timeonehr=gethrs.concat("hour");
		String timemin=moremin.concat("min");
		String formorethanval=timehrs+timemin;
		String timeone=timeonehr+timemin;
		int getmin=Integer.parseInt(moremin),mintw=20;
			 if((gethrs.equals("0")) && getmin<=mintw) {
				LFSUtilsIOS.findText(
						tmin);
			   }
			 else if((gethrs.equals("0"))&&(getmin>20)){
				 LFSUtilsIOS.findText(
						 tmin);
			 }
			 else if(gethrs.equals("1")) {
				 LFSUtilsIOS.findText(timeone);
			 }
			 else
			 {
				 LFSUtilsIOS.findText(
						 formorethanval);
			 }
			 Reporter.logWithScreenShot("Verified Updating Signal Loss Value",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("user was unable to update Signal Loss Value",MessageTypes.Fail);
		}
	}
		private void verifyUpdatedRiseNotifyMeAtValue() {
			try {
				getNFKiosAlertspageSwitchBtn().getText().equals("1");
				String getfallvalue = (String) ConfigurationManager.getBundle().getProperty("riserate.value");
				LFSUtilsIOS.findText(getfallvalue);
				LFSUtilsIOS.waitforLoad();
				Reporter.logWithScreenShot("Verified Updated Rise Notify me", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update Rise Notify me", MessageTypes.Fail);
			}
		}
		
		private void verifyUpdatedFallNotifyMeAtValue() {
			try {
				getNFKiosAlertspageSwitchBtn().getText().equals("1");
				String getfallval = (String) ConfigurationManager.getBundle().getPropertyValue("fallrate.value");
				LFSUtilsIOS.findText(getfallval);
				LFSUtilsIOS.waitforLoad();
				Reporter.logWithScreenShot("Verified Updated Fall Notify Me", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update Fall Notify Me", MessageTypes.Fail);
			}
		}
		
		private void verifyHighScreen() {
			try {
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("high.alert.title"))
						.assertPresent("Title High alert");
				getNFKiosAlertspageHighalertBackBtn().isPresent();
				Assert.assertEquals(getNFKiosAlertspageLowalertField().getText(),
						LFSUtilsIOS.getPropString("high.alert.title"));
				Assert.assertEquals(getNFKiosAlertspageHighalertNotifyMeaboveBtn().getAttribute("label"),
						LFSUtilsIOS.getPropString("high.notify.above"));
				Assert.assertEquals(getNFKiosAlertspageHighalertRepeatfield().getAttribute("label"),
						LFSUtilsIOS.getPropString("alerts.repeat"));
				Assert.assertEquals(getNFKiosAlertspageHighalertSoundfield().getAttribute("label"),
						LFSUtilsIOS.getPropString("alerts.sound.option"));
				Assert.assertEquals(getNFKiosAlertspageHighalertRepeatfield().getAttribute("value"),
						LFSUtilsIOS.getPropString("reminder.types.never"));
				Assert.assertEquals(getNFKiosAlertspageHighalertSoundfield().getAttribute("value"),
						LFSUtilsIOS.getPropString("high.sound"));
				Assert.assertEquals(getNFKiosAlertspageHighalertHintTxt().getText(),
						LFSUtilsIOS.getPropString("high.hint.text"));
				Reporter.logWithScreenShot("Verified High Screen",MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update High Screen",MessageTypes.Fail);
			}
		}
		
		public void clikHighAlert() {
			try {
	      getNFKiosAlertspageHighalertTxt().waitForPresent();
			String str = getNFKiosAlertspageHighalertTxt().getText().replaceAll("[^\\d]", " ");
			Assert.assertEquals(str.replaceAll("\\s", ""),
					LFSUtilsIOS.getPropString("high.value"));
		     LFSUtilsIOS.click(getNFKiosAlertspageHighalertTxt());
				Reporter.logWithScreenShot("Clicked on High Alert",MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("user was unable to click on High Alert",MessageTypes.Fail);
			}
		}
		SignupPageIOS sign= new SignupPageIOS();
		
		private void verifyLowScreen() {
			try {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("low.alert.title")).assertPresent("Title Low alert");
			getNFKiosAlertspageLowalertBackBtn().isPresent();
			Assert.assertEquals(getNFKiosAlertspageLowalertField().getText(),LFSUtilsIOS.getPropString("low.alert.title"));
			Assert.assertEquals(getNFKiosAlertspageLowalertNotifyMebelowBtn().getAttribute("label"),LFSUtilsIOS.getPropString("low.notify.below"));
			Assert.assertEquals(getNFKiosAlertspageLowalertRepeatfield().getAttribute("label"),LFSUtilsIOS.getPropString("alerts.repeat"));
			Assert.assertEquals(getNFKiosAlertspageLowalertSoundfield().getAttribute("label"),LFSUtilsIOS.getPropString("alerts.sound.option"));
			Assert.assertEquals(getNFKiosAlertspageLowalertHintTxt().getText(),
					LFSUtilsIOS.getPropString("low.hint.text"));
			Reporter.logWithScreenShot("Low value is "+getNFKiosAlertspageLowalertNotifyMebelowBtn().getAttribute("value")+" present",
					MessageTypes.Pass);	
			Assert.assertEquals(getNFKiosAlertspageLowalertRepeatfield().getAttribute("value"),LFSUtilsIOS.getPropString("reminder.types.never"));
		  Assert.assertEquals(getNFKiosAlertspageLowalertSoundfield().getAttribute("value"),
				  LFSUtilsIOS.getPropString("low.sound"));
		  Reporter.logWithScreenShot("Verified Low Screen",MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("user was unable to verify Low Screen",MessageTypes.Fail);
			}
		}
		
		public void clikLowAlert() {
			try {
			getNFKiosAlertspageLowalertTxt().waitForPresent();
			String str = getNFKiosAlertspageLowalertTxt().getText().replaceAll("[^\\d]", " ");
			Assert.assertEquals(str.replaceAll("\\s", ""),
					LFSUtilsIOS.getPropString("low.value"));
			LFSUtilsIOS.click(getNFKiosAlertspageLowalertTxt());
			Reporter.logWithScreenShot("Clicked on Low Alert", MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("user was unable to click on Low Alert", MessageTypes.Fail);	
			}
		}
		
		private void verifyUpdatedHighPickervalue() {
			try {
				// String str =
				// getNFKiosAlertspageHighalertNotifyMeaboveBtn().getAttribute("value").replaceAll("[^\\d]",
				// " ");
				String getmin = ConfigurationManager.getBundle().getPropertyValue("repeat.min");
				String gethrs = ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
				String time = gethrs + getmin;
				LFSUtilsIOS.findText((ConfigurationManager.getBundle().getProperty("notify.above")).toString());
				if (gethrs.equals("0")) {
					LFSUtilsIOS.findText(getmin);
				} else if (gethrs.equals("4")) {
					LFSUtilsIOS.findText(gethrs);
				} else {
					LFSUtilsIOS.findText(time);
				}
				Reporter.logWithScreenShot("Verified Updated High Picker Value", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("user was unable to update High Picker Value", MessageTypes.Fail);
			}
		}
		
		private void clickOnSound() {
			try {
				LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.sound.option")));
			SignupPageIOS sign= new SignupPageIOS();
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.sound.option")).
			  assertPresent("Sound Screen");
			LFSUtilsIOS.click(getNFKiosAlertspagebackbtn());
			Reporter.logWithScreenShot("Clicked on Sound",MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("unable to click on Sound",MessageTypes.Fail);	
			}
		}
		public void clickAllWeekPicker() {
		LFSUtilsIOS.waitforLoad();
		getNFKiosEditschedulepageDaysofweekField().click();
	}
	//Auther-Pradnya
	//Description-Method to select all days
	public void verifyWeekPageAll() {
	//	getNFKiosEditschedulepageWeekBackBtn().isPresent();
		SignupPageIOS sign= new SignupPageIOS();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("day.week.title"));
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sun")).isPresent();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("mon")).isPresent();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("tue")).isPresent();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("wed")).isPresent();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("thu")).isPresent();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fri")).isPresent();
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sat")).isPresent();
		//select the days
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("mon")));
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fri")));
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sat")));
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sun")));
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("tue")));
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("thu")));
		LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("wed")));
		 
		LFSUtilsIOS.click(getNFKiosEditschedulepageWeekBackBtn());
	}
		
		private void updateNotifyAbove() {
			try {
			String aboveval=String.valueOf(ThreadLocalRandom.current().nextInt(120, 300 + 1));
			ConfigurationManager.getBundle().setProperty("notify.above",aboveval);
			LFSUtilsIOS.click(getNFKiosAlertspageHighalertNotifyMeaboveBtn());
			LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(), aboveval);
			LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
			Reporter.logWithScreenShot("Updated Notify Above",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Not able to Notify Above",MessageTypes.Fail);
		}
	}
		
		private void updateRepeatValue() {
			try {
			// convert to nearest multiple of 5	
			String min = String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);                       
			String hrs=String.valueOf(ThreadLocalRandom.current().nextInt(0, 4+ 1));
			ConfigurationManager.getBundle().setProperty("repeat.min",min);
			ConfigurationManager.getBundle().setProperty("repeat.hrs",hrs);
			LFSUtilsIOS.click(sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")));
			LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(), hrs);
			if(hrs.equals("4")) {
				LFSUtilsIOS.enterText(getNFKiosAlertspagePickerMinBtn(),"0");
			}
			else {
				LFSUtilsIOS.enterText(getNFKiosAlertspagePickerMinBtn(),min);
			}
			LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
			Reporter.logWithScreenShot("Updated Reporte Value",MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("Not Updated Reporte Value",MessageTypes.Fail);	
			}
		}
		
		private void updateNotifyBelow() {
			try {
			String belowval=String.valueOf(ThreadLocalRandom.current().nextInt(60, 100 + 1));
			ConfigurationManager.getBundle().setProperty("notify.below",belowval);
			LFSUtilsIOS.click(getNFKiosAlertspageLowalertNotifyMebelowBtn());
			LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(), belowval);
			LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
			Reporter.logWithScreenShot("Updated Notify Below",MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("Not Updated Notify Below",MessageTypes.Fail);
			}
			
		}
		
		public void verifyUpdatedLowPickervalue() {
			try {		
			String getmin= ConfigurationManager.getBundle().getPropertyValue("repeat.min");
			  String gethrs= ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
             String time=gethrs+getmin;
		if(gethrs.equals("0")) {
			LFSUtilsIOS.findText(getmin);
		}
		else if(gethrs.equals("4")) {
			LFSUtilsIOS.findText(gethrs);
		  }
		  else {
			  LFSUtilsIOS.findText(time);
		  }
		Reporter.logWithScreenShot("Verified Updated Low Picker Value ",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Not verified Low Picker Value ",MessageTypes.Fail);	
		}
	}
		
	public void enableAlertSchedule() {
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			try {
				getNFKiosAlertspageAlertscSwitchBtn().waitForPresent(10);	
				getNFKiosAlertspageAlertscSwitchBtn().assertPresent("Switch button");
                if(getNFKiosAlertspageAlertscSwitchBtn().getAttribute("value").equals("0")) {	
				LFSUtilsIOS.click(getNFKiosAlertspageAlertscSwitchBtn());
				
            }else {
                Reporter.logWithScreenShot("Alert Schedule Already Enabled", MessageTypes.Pass);
            }getNFKiosAlertspageAlertscSwitchBtn().isEnabled();
				Reporter.logWithScreenShot("Enabled Alert Schedule", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("User was not able to enable Alert Schedule", MessageTypes.Fail);
			}
		
		
	}
		public void verifyNameField() {
			getNFKiosAlertspageScheduleNameField().waitForPresent();
			getNFKiosAlertspageScheduleNameField().assertPresent("Schedule name field");
			Reporter.logWithScreenShot("Schedule name field",MessageTypes.Pass);
		}
		public void clickScheduleName() {
			try {
			LFSUtilsIOS.waitforLoad();
		   LFSUtilsIOS.click(getNFKiosAlertspageScheduleNameField());
		   getNFKiosEditschedulepageTitle().waitForPresent();
		Assert.assertEquals(getNFKiosEditschedulepageTitle().getText(),
				LFSUtilsIOS.getPropString("edit.schedule.title"));
		Reporter.logWithScreenShot("Edit Schedule screen display",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Edit Schedule screen not display",MessageTypes.Fail);
		}
	}
		
			
	
		public void clickUserAlertSchedule(String Option) {
			 switch (Option) {
            case "low":
         	   clikUserLowAlert();
         	   verifyLowScreen();
                break;
            case "high":
           	   clikUserHighAlert();
           	   verifyHighScreen();
                  break;
            case "fallrate":
         	   clikUserFallRateAlert();
         	   verifyFallRateScreen();
                break;
            case "riserate":
         	   clikUserRiseRateAlert();
         	   verifyRiseRateScreen();
                break;
            case "Urgent Low Soon":
            	clikUserUrgentLowSoon();
            	verifyUrgenLowSoonAlarmScreen();
                 break;   
                
             }
			Reporter.logWithScreenShot("User has verified the "+Option+" screen",MessageTypes.Pass);
		}
		private void clikUserUrgentLowSoon() {
			try {
			getNFKiosEditschedulepageUrgentlblLabel().waitForPresent();
			Assert.assertTrue(getNFKiosEditschedulepageUrgentlblLabel().getAttribute("value").equals("On"));	
			LFSUtilsIOS.click(getNFKiosEditschedulepageUrgentlblLabel());
			Reporter.logWithScreenShot("Clicked User Urgent Low Soon",MessageTypes.Pass);
			}catch(Exception e) {
			Reporter.logWithScreenShot("Unable to click on Urgent Low Soon",MessageTypes.Fail);
		}
	}
		private void clikUserRiseRateAlert() {
			try {
			getNFKiosEditschedulepageRiserateLabel().waitForPresent();
			Assert.assertTrue(getNFKiosEditschedulepageRiserateLabel().getAttribute("value").equals("Off"));	
			LFSUtilsIOS.click(getNFKiosEditschedulepageRiserateLabel());
		     LFSUtilsIOS.waitforLoad();
		     Reporter.logWithScreenShot("Clicked user Rise Rate Alert",MessageTypes.Pass);
			}catch(Exception e) {
				Reporter.logWithScreenShot("Unable to click on Rise Rate Alert",MessageTypes.Fail);	
			}
		}
		private void clikUserFallRateAlert() {
			try {
			getNFKiosEditschedulepageFallrateLabel().waitForPresent();
			   Reporter.logWithScreenShot("Get attribute value is "+getNFKiosEditschedulepageFallrateLabel().getAttribute("value")+" displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosEditschedulepageFallrateLabel().getAttribute("value").equals("Off"));	
					LFSUtilsIOS.click(getNFKiosEditschedulepageFallrateLabel());
			     LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("Clicked Uer Fall Rate Alert", MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Unable to click on Fall Rate Alert", MessageTypes.Fail);
		}
}
		private void clikUserHighAlert() {
			try {
			LFSUtilsIOS.swipeWithScreenPercent(50,80,50,30,1);
		      getNFKiosEditschedulepageHighLabel().waitForPresent();
		      System.out.println(driver.getPageSource());
				String str = getNFKiosEditschedulepageHighLabel().getText().replaceAll("[^\\d]", " ");
				Assert.assertEquals(str.replaceAll("\\s", ""),
						LFSUtilsIOS.getPropString("high.value"));
				
				LFSUtilsIOS.click(getNFKiosEditschedulepageHighLabel());
			Reporter.logWithScreenShot("Clicked User High Alert",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Unable to click on High Alert",MessageTypes.Fail);
		}
	}
		private void clikUserLowAlert() {
			try {
			getNFKiosEditschedulepageLowLabel().waitForPresent();
			String str = getNFKiosEditschedulepageLowLabel().getText().replaceAll("[^\\d]", " ");
			Assert.assertEquals(str.replaceAll("\\s", ""),
					LFSUtilsIOS.getPropString("low.value"));
			LFSUtilsIOS.click(getNFKiosEditschedulepageLowLabel());
			Reporter.logWithScreenShot("Click User Low Alert",MessageTypes.Pass);		
		}catch(Exception e) {
			Reporter.logWithScreenShot("Unable to click on Low Alert",MessageTypes.Fail);
		}
	}
			
		public void enterScheduleName() {
			try {
			String str="Theodara Crain";
			LFSUtilsIOS.enterText(getNFKiosEditschedulepageSchdeuleName(), str);
			ConfigurationManager.getBundle().setProperty("name.schedule", str);
			Reporter.logWithScreenShot("Enter Schedule Name",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("Not Entered Schedule Name",MessageTypes.Fail);
		}
}
		public void verifyScheduleField(String option) {
			 switch (option) {
	            case "Canceling":
	            	getNFKiosEditschedulepageCancelBtn().click();
	            	verifyOnCancel();
	            	break;
	            case "Saving":
	            	getNFKiosEditschedulepageSaveBtn().click();
	            	verifyOnSaving();
	            	break;
	            
			
		  }
		}
			 public void verifyOnSaving() {
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 String str=(String) ConfigurationManager.getBundle().getPropertyValue("name.schedule");
				 Assert.assertEquals(getNFKiosAlertspageScheduleNameField().getText(),str);
					
		}
			public void verifyOnCancel() {
				LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				LFSUtilsIOS.waitforLoad();
				Assert.assertEquals(getNFKiosAlertspageScheduleNameField().getText(),
						LFSUtilsIOS.getPropString("schedule.name"));	
				}
			public void clicksOnPicker(String option) {
				switch(option) {
				case "Start time":
	            	clickStartTime();
	            	verifyClock();
	            	verifyDefaultValue();
	            	getNFKiosEditschedulepageStarttimeLabel().click();
	            	updatePickerTime();
	            	String getval=	getNFKiosEditschedulepageStarttimeLabel().getAttribute("value").replaceAll(":","");
	            	verifyPickerSetTime(getval);
	            	break;
	            case "Stop time":
	            	clickStopTime();
	            	verifyClock();
	            	verifyDefaultStopTime();
	            	getNFKiosEditschedulepageStoptimeLabel().click();
	            	updatePickerTime();
	            	String getstoptime=	getNFKiosEditschedulepageStoptimeLabel().getAttribute("value").replaceAll(":","");	
	            	verifyPickerSetTime(getstoptime);
	            	break;
	            case "Week picker":
	            	clickWeekPicker();
	            	verifyWeekPage();
	            	verifyupdatedweekvalue();
	            	break;
				case "Week picker All":
					clickAllWeekPicker();
					verifyWeekPageAll();
					verifyupdatedweekvalue();
        			break;
		}
				}
				
				
			
			private void verifyupdatedweekvalue() {
				LFSUtilsIOS.waitforLoad();
				String getweekval=getNFKiosEditschedulepageWeekendLabel().getAttribute("value");
		    Reporter.logWithScreenShot(getweekval, MessageTypes.Pass);
			}
			
			private void verifyDefaultStopTime() {
				LFSUtilsIOS.findText(LFSUtilsIOS.getPropString("stop.time.default"));
				
			}
			
			private void verifyWeekPage() {
				getNFKiosEditschedulepageWeekBackBtn().isPresent();
				SignupPageIOS sign= new SignupPageIOS();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("day.week.title"));
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sun")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("mon")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("tue")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("wed")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("thu")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fri")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sat")).isPresent();
				//select the days
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("mon")).click();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fri")).click();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sat")).click();
				 
				getNFKiosEditschedulepageWeekBackBtn().click();
			}
			
			private void verifyPickerSetTime(String getval) {
			String gettime=ConfigurationManager.getBundle().getPropertyValue("picker.time");
			String starttime=gettime.replaceAll("[, ;]", "")+" PM";
			Assert.assertEquals(getval,starttime);
				
			}
			private void updatePickerTime() {
				 String randomhrs= String.valueOf(ThreadLocalRandom.current().nextInt(1,12));
				 String randommin = String.valueOf(ThreadLocalRandom.current().nextInt(5,55));
				 LFSUtilsIOS.waitforLoad();
				 try {
					 getNFKiosEditschedulepageHrsPkr().sendKeys(randomhrs);
					 LFSUtilsIOS.waitforLoad();
					 getNFKiosEditschedulepageMinutePkr().sendKeys(randommin);
					 LFSUtilsIOS.waitforLoad();
					 getNFKiosEditschedulepageAmPmPkr().sendKeys("PM");
				 }catch (Exception e) {
					Reporter.logWithScreenShot("User was unable to send the Time",MessageTypes.Fail);
					
				}
				 getNFKiosEditschedulepageDoneBtn().click();
				 String settime=(randomhrs+randommin);
				 ConfigurationManager.getBundle().setProperty("picker.time",(settime));
				
			}
			
			private void verifyDefaultValue() {
				Assert.assertEquals(
				getNFKiosEditschedulepageStarttimeLabel().getAttribute("value"),
				LFSUtilsIOS.getPropString("start.time.default.value"));				
			}
			
			private void verifyClock() {
			getNFKiosEditschedulepageDoneBtn().isPresent();
			getNFKiosEditschedulepageHrsPkr().isPresent();
			getNFKiosEditschedulepagePickerCancelBtn().click();
				
			}
			private void clickWeekPicker() {
				LFSUtilsIOS.waitforLoad();
	Assert.assertEquals(getNFKiosEditschedulepageDaysofweekField().getAttribute("value"),"All");
	getNFKiosEditschedulepageDaysofweekField().click();
				
			}
			private void clickStopTime() {
				LFSUtilsIOS.waitforLoad();
				getNFKiosEditschedulepageStoptimeLabel().click();
			
				
			}
			private void clickStartTime() {
				LFSUtilsIOS.waitforLoad();
				getNFKiosEditschedulepageStarttimeLabel().click();
			
				
			}
			public void resetAlertsSettings() {
				//UrgentLow soon set OFF 	
				  setUrgentLowSoonValue();
				   waitForPageToLoad();
				//Set Low value
				   setLowValue();
				  waitForPageToLoad();
				//Fallrate ON
				   setFallRate();
				   LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			    //High value
				  setHighValue();
				//Rise Rate ON
				  setRiseToOn();
				//SignalLoss OFF
				  setSignalLossOFF();
				//No readings OFF
				  setNoReadingsOFF();
				
			}
			private void setNoReadingsOFF() {
				 clickNoReadings();
				 getNFKiosAlertspageSwitchBtn().click();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setSignalLossOFF() {
				clickSignalLoss();
				getNFKiosAlertspageSwitchBtn().click();
				LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setRiseToOn() {
				  clikRiseRateAlert();
				  getNFKiosAlertspageSwitchBtn().click();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setHighValue() {
				  clikHighAlert();
				  updateNotifyAbove();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setFallRate() {
				clikFallRateAlert();
				getNFKiosAlertspageSwitchBtn().click();
				LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setLowValue() {
				clikLowAlert();
				 updateNotifyBelow();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
				
			}
			private void setUrgentLowSoonValue() {
				clickUrgentLowSoon();
				getNFKiosAlertspageSwitchBtn().click();
				clickAlertBackbutton();
				
			}
			public void getConfigurationSettinsg() {
				String str = getNFKiosAlertspageLowalertTxt().getText().replaceAll("[^\\d]", " ");
				Assert.assertEquals(str.replaceAll("\\s", ""),
						LFSUtilsIOS.getPropString("low.value"));
				
				Assert.assertTrue(getNFKiosAlertspageRiseratealertTxt().getAttribute("value").equals("Off"));	
				Assert.assertTrue(getNFKiosAlertspageFallratealertTxt().getAttribute("value").equals("Off"));	
				String str1 = getNFKiosAlertspageHighalertTxt().getText().replaceAll("[^\\d]", " ");
				Assert.assertEquals(str1.replaceAll("\\s", ""),
						LFSUtilsIOS.getPropString("high.value"));
				Assert.assertTrue(getNFKiosAlertspageSignallossTxt().getAttribute("value").equals("On"));	
				Assert.assertTrue(getNFKiosAlertspageNoreadingTxt().getAttribute("value").equals("On"));
					
			}
			public void clickResetAlerts() {
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 getNFKiosAlertspageResetBtn().click();
				 //Pop displayed
				 Reporter.logWithScreenShot("User has clicked on Reset Alert button on Alerts screen",MessageTypes.Pass);
				 getNFKiosAlertspageResetpopResetBtn().click();
				waitForPageToLoad();
				
			}
			public void verifyresetSeetings() {
			
				
			}
			public void clickinfoIcon() {
		if (getNFKiosAlertspageInfoBtn().isPresent()) {
		LFSUtilsIOS.click(getNFKiosAlertspageInfoBtn());
			Reporter.logWithScreenShot("user Clicked on info icon", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("user not able to click on info icon", MessageTypes.Fail);
		}
	}

	public void verifymobiledevicesettingalert() {
		getNFKiosAlertspageDevicesettingalertHeading().verifyPresent("Alert Heading is present");
		getNFKiosAlertspageDevicesettingalertTitle().verifyPresent("Alert device setting title is present");
		getNFKiosAlertspageDevicesettingalertSubTitle().verifyPresent("Alert device setting subtitle is present");
		getNFKiosAlertspageDevicesettingalertDescriptionLabel()
				.verifyPresent("Alert device setting description is present");
		getNFKiosAlertspageDevicesettingalertCriticalAlertsLabel()
				.verifyPresent("Alert device setting critical alert  is present");
		getNFKiosAlertspageDevicesettingalertSoundsLabel().verifyPresent("Alert device setting sound label is present");
		getNFKiosAlertspageDevicesettingalertAllowNotificationsLabel()
				.verifyPresent("Alert device setting allow notificationlabel is present");
		getNFKiosAlertspageDevicesettingalertMobilesettinglink()
				.verifyPresent("Alert device setting Mobile setting link is present");
		LFSUtilsIOS.click(getNFKiosAlertspageDevicesettingalertMobilesettinglink());
	}
	public void verifymobiledevicesettings() {
		getNFKiosAlertspageSettingTitle().verifyPresent("Device setting title is present");
		getNFKiosAlertspageSettingBluetooth().verifyPresent("Bluetooth setting is present");
	}
	
	public void verifiesCriticalTogglebtn() {
		getNFKiosAlertspageCriticalToggleBtn().assertPresent("Toggle button");
		sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("dnd.alert.msg")).
		assertPresent("Text msg to receive Alerts");
		getNFKiosAlertspageCriticalToggleBtn().click();
	}
	
	public void openNotification() {
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=\"NOTIFICATIONS_ID\"]").click();	
		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,60%");
		params.put("end", "15%,40%");
		params.put("duration", "2");
		 LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		 LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);
		 
	}
	public void disableCriticalAlert(){
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Critical Alerts\"]").waitForPresent();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Critical Alerts\"]").click();
		
	}
	public void verifySettingsPopup() {
		HomePageIOS homePage= new HomePageIOS();
		MoremenuPageIOS moreMenuPage= new MoremenuPageIOS();
		homePage.clickOnMoreMenuIcon();
		moreMenuPage.clickMyAlerts();	
		try {
		Assert.assertTrue(getNFKiosAlertspageSettingPopupTitle().getText().equals(LFSUtilsIOS.getPropString("change.setting.title")));
	  	getNFKiosAlertspageSettingNotnowBtn().assertPresent("Not now button");
	  	getNFKiosAlertspageSettingSettingBtn().assertPresent("Settings button");
	  	//sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("adjust.setting.msg")).assertPresent("Text message");
	  	Reporter.logWithScreenShot("User has verified the popup",MessageTypes.Pass);
		}catch (NotFoundException e) {
			Reporter.logWithScreenShot("User was unable to verify popup",MessageTypes.Fail);
		}
		LFSUtilsIOS.waitforLoad();
		getNFKiosAlertspageSettingSettingBtn().click();
		LFSUtilsIOS.waitforLoad();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label=\"Notifications, Banners, Sounds\"]").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Critical Alerts\"]").click();
		
		Reporter.logWithScreenShot("User turne ON the toggle of Critical Alert",MessageTypes.Pass);
	}
					
	public void setHighRepeatValue(String opt) {

		try {
			switch (opt) {
			case "Fifteen":
				String min = "5";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
				if (getNFKiosAlertspagePickerMinBtn().getText().equals(min)) {
					getNFKiosAlertspagePickerDoneBtn().click();
				} else {
					getNFKiosAlertspagePickerMinBtn().sendKeys(min);
					getNFKiosAlertspagePickerDoneBtn().click();
				}
				break;
			case "Never":
				String minzero = "0";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
				if (getNFKiosAlertspagePickerMinBtn().getText().equals(minzero)) {
					getNFKiosAlertspagePickerDoneBtn().click();
				} else {
					getNFKiosAlertspagePickerBtn().sendKeys("1");
					getNFKiosAlertspagePickerMinBtn().sendKeys(minzero);
					getNFKiosAlertspagePickerBtn().sendKeys("0");
					getNFKiosAlertspagePickerDoneBtn().click();
				}
				break;
			case "Twenty":
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
				if (getNFKiosAlertspagePickerMinBtn().getText().equals("20")) {
					getNFKiosAlertspagePickerDoneBtn().click();
				} else {
					getNFKiosAlertspagePickerMinBtn().sendKeys("20");
					getNFKiosAlertspagePickerDoneBtn().click();
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

	public void navigateHomeScreenClickback() {
		HomePageIOS home = new HomePageIOS();
		try {
			getNFKiosAlertspageHighalertBackBtn().click();
			getNFKiosAlertspageAlertBackBtn().click();
			home.getNFKiosHomepageHomeBtn().click();
			Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
		}
	}
	public void setLowRepeatValue(String opt) {

		try {
			switch (opt) {
			case "Fifteen":
				String min = "5";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).waitForPresent();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
				if (getNFKiosAlertspagePickerMinBtn().getText().equals(min)) {
					getNFKiosAlertspagePickerDoneBtn().click();
				} else {
					getNFKiosAlertspagePickerMinBtn().sendKeys(min);
					getNFKiosAlertspagePickerDoneBtn().click();
				}
				break;
			case "Never":
				String minzero = "0";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
				if (getNFKiosAlertspagePickerMinBtn().getText().equals(minzero)) {
					getNFKiosAlertspagePickerDoneBtn().click();
				} else {
					getNFKiosAlertspagePickerBtn().sendKeys("1");
					getNFKiosAlertspagePickerMinBtn().sendKeys(minzero);
					getNFKiosAlertspagePickerBtn().sendKeys("0");
					getNFKiosAlertspagePickerDoneBtn().click();
				}
				break;
			case "Twenty":
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
				if (getNFKiosAlertspagePickerMinBtn().getText().equals("20")) {
					getNFKiosAlertspagePickerDoneBtn().click();
				} else {
					getNFKiosAlertspagePickerMinBtn().sendKeys("20");
					getNFKiosAlertspagePickerDoneBtn().click();
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
	public void navigatebacktoHomeScreenfromlowalert() {
		HomePageIOS home = new HomePageIOS();
		try {
			LFSUtilsIOS.click(getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")));
			getNFKiosAlertspageBackbtn().click();
			home.getNFKiosHomepageHomeBtn().click();
			Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
		}
	}
	public void setLowToggle(String opt) {
		LFSUtilsIOS.click(getNFKiosAlertspageLowalertTxt());
		Reporter.logWithScreenShot("Clicked on Low Alert", MessageTypes.Pass);
		try {
			switch (opt) {
			case "OFF":
				
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
//				(getNFKiosAlertspageSwitchBtn().verifyDisabled("OFF")) {
					Reporter.logWithScreenShot("low alert toggle alredy off", MessageTypes.Pass);

				} else {
					
					getNFKiosAlertspageSwitchBtn().click();
				}
				break;
			case "ON":
				
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
//				(getNFKiosAlertspageSwitchBtn().isEnabled()) {
					Reporter.logWithScreenShot("low alert toggle alredy On", MessageTypes.Pass);
				} else {
					
					getNFKiosAlertspageSwitchBtn().click();
				}
				break;
		
			default:
				Reporter.logWithScreenShot("Fail to set toggle", MessageTypes.Pass);
				break;
			}
			Reporter.logWithScreenShot("User has set the low alert toggle ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to set the low alert toggle", MessageTypes.Fail);
		}
	}
	public void setNotifymebelowValue(String opt) {

		try {
			switch (opt) {
			case "65":
				String value = "65";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")).click();
				if (getNFKiosAlertspageNotifyBelowvalueBtn().getText().equals(value)) {
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(value);
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				}
				break;
			case "75":
				String value2 = "75";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")).click();
				if (getNFKiosAlertspageNotifyBelowvalueBtn().getText().equals(value2)) {
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(value2);
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				}
				break;
			case "80":
				String value3 = "80";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")).click();
				if (getNFKiosAlertspageNotifyBelowvalueBtn().getText().equals(value3)) {
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(value3);
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				}
				break;
			   case "85":
   				String value5 = "85";
   				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")).click();
   				if (getNFKiosAlertspageNotifyBelowvalueBtn().getText().equals(value5)) {
   					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
   				} else {
   					getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(value5);
   					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
   				}
   				break;
                case "95":
				String value4 = "95";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")).click();
				if (getNFKiosAlertspageNotifyBelowvalueBtn().getText().equals(value4)) {
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(value4);
					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
				}

				break;  
            	case "220":
    				String value6 = "220";
    				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")).click();
    				if (getNFKiosAlertspageNotifyBelowvalueBtn().getText().equals(value6)) {
    					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
    				} else {
    					getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(value6);
    					getNFKiosalertspageNotifyBelowvaluedonebtn().click();
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
	
	public void clickOnAlert(String Alerts) {
		switch (Alerts) {
		case "NOREADINGS":
			try {
				LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 1);
				getNFKiosAlertspageNoreadingTxt().waitForPresent();
				LFSUtilsIOS.click(getNFKiosAlertspageNoreadingTxt());
				Reporter.logWithScreenShot("Clicked No Readings", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("User was unable to click on No readings", MessageTypes.Fail);
			}

			break;

		default:
			break;
		}
	}
	public void toggleAlert(String command) {
		HomePageIOS home = new HomePageIOS();
		switch (command) {
		case "off":
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
				getNFKiosAlertspageSwitchBtn().click();
				Reporter.logWithScreenShot("Turn off No Readings", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("No Readings Alerts alredy off", MessageTypes.Pass);

			}
			LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));

			try {
				home.getNFKiosHomepageHomeBtn().click();
				Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
			}
			break;
		case "on":
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
				getNFKiosAlertspageSwitchBtn().click();
				Reporter.logWithScreenShot("Turn on No Readings", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("No Readings Alerts alredy on", MessageTypes.Pass);

			}
			LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			try {
				home.getNFKiosHomepageHomeBtn().click();
				Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
			}

			break;

		default:
			break;
		}

	}
	public void setHighToggle(String opt) {
		LFSUtilsIOS.click(getNFKiosAlertspageHighalertTxt());
		Reporter.logWithScreenShot("Clicked on high Alert", MessageTypes.Pass);
		try {
			switch (opt) {
			case "OFF":
				
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
					Reporter.logWithScreenShot("High alert toggle alredy off", MessageTypes.Pass);

				} else {
					
					getNFKiosAlertspageSwitchBtn().click();
				}
				break;
			case "ON":
				
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
					Reporter.logWithScreenShot("High alert toggle alredy On", MessageTypes.Pass);
				} else {
					
					getNFKiosAlertspageSwitchBtn().click();
				}
				break;
		
			default:
				Reporter.logWithScreenShot("Fail to set toggle", MessageTypes.Pass);
				break;
			}
			Reporter.logWithScreenShot("User has set the high alert toggle ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to set the high alert toggle", MessageTypes.Fail);
		}
	}
	public void navigatebacktoHomeScreenfromhighalert() {
		HomePageIOS home = new HomePageIOS();
		try {
			LFSUtilsIOS.clickWithText("Back");
			getNFKiosAlertspageBackbtn().click();
			home.getNFKiosHomepageHomeBtn().click();
			Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
		}
	}
	public void clickonHighAlert() {
		try {
     
	     LFSUtilsIOS.click(getNFKiosAlertspageHighalertTxt());
			Reporter.logWithScreenShot("Clicked on High Alert",MessageTypes.Pass);
		}catch(Exception e) {
			Reporter.logWithScreenShot("user was unable to click on High Alert",MessageTypes.Fail);
		}
	}
	public void setNotifymeAboveValue(String opt) {

		try {
			switch (opt) {
			case "300":
				String value = "300";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeAbove")).click();
				if (getNFKiosAlertspageNotifyAbovevalueBtn().getText().equals(value)) {
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyAbovevalueBtn().sendKeys(value);
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				}
				break;
			case "210":
				String value2 = "210";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeAbove")).click();
				if (getNFKiosAlertspageNotifyAbovevalueBtn().getText().equals(value2)) {
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyAbovevalueBtn().sendKeys(value2);
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				}
				break;
                case "220":
				String value3 = "220";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeAbove")).click();
				if (getNFKiosAlertspageNotifyAbovevalueBtn().getText().equals(value3)) {
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyAbovevalueBtn().sendKeys(value3);
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				}
				break;

			case "190":
				String value4 = "190";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeAbove")).click();
				if (getNFKiosAlertspageNotifyAbovevalueBtn().getText().equals(value4)) {
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyAbovevalueBtn().sendKeys(value4);
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				}
				break;
			case "200":
				String value5 = "200";
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeAbove")).click();
				if (getNFKiosAlertspageNotifyAbovevalueBtn().getText().equals(value5)) {
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				} else {
					getNFKiosAlertspageNotifyAbovevalueBtn().sendKeys(value5);
					getNFKiosalertspageNotifyAbovevaluedonebtn().click();
				}
				break;
			default:
				Reporter.logWithScreenShot("Invalid notify me Above value", MessageTypes.Pass);
				break;
			}
			Reporter.logWithScreenShot("User has set the notify me Above value ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to set the notify me Above value ", MessageTypes.Fail);
		}
	}
	
	public void disableNotifications() {
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Notifications\"]").waitForPresent();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeSwitch[@label=\"Allow Notifications\"]").click();
		Reporter.logWithScreenShot("User able to turn off Notification",MessageTypes.Pass);
	}

	public void clickOnBackButton() {
	getNFKiosAlertspageBackbtn().isPresent();
	LFSUtilsIOS.click(getNFKiosAlertspageBackbtn());;
		
	}
	public void clickonNoreading() {
		
		LFSUtilsIOS.click(getNFKiosAlertspageNoreadingTxt());
	}
	public void navigatebacktoHomeScreenfromNoReadingalert() {
		HomePageIOS home = new HomePageIOS();
		try {
			LFSUtilsIOS.clickWithText("Back");		
			LFSUtilsIOS.click(getNFKiosAlertspageBackbtn());
//		home.getNFKiosHomepageHomeBtn().click();
		Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
	} catch (Exception e) {
		Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
	}
}

//Rushikesh
	//Method to turn off urgent low soon alert
	public void turnOffULSAlert() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageurgentlowsoonalarmlbl());
			LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
			LFSUtilsIOS.click(getNFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon());
		    Reporter.logWithScreenShot("Successfully turned off ULSAlert", MessageTypes.Pass);
	} catch(Exception e) {
		Reporter.logWithScreenShot("Failed to turned off ULSAlert",MessageTypes.Fail);
    	}
	}
	//Rushikesh
	//Method to change default high and low alert
	public void changeDefaultHighAndLowAlertThreshould() {
		try {
		String Highalert = LFSUtilsIOS.getPropString("alertPage.highAlert.updated");
		LFSUtilsIOS.click(getNFKiosAlertspageHighalertTxt());
		LFSUtilsIOS.click(getNFKiosAlertspageHighalertNotifyMeaboveBtn());
		getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(Highalert);
		LFSUtilsIOS.click(getNFKiosalertspageNotifyBelowvaluedonebtn());
		LFSUtilsIOS.click(getNFKiosAlertspageHighalertBackBtn());
		
		String Lowalert= LFSUtilsIOS.getPropString("alertPage.lowAlert.updated");
		LFSUtilsIOS.click(getNFKiosAlertspageLowalertTxt());
		LFSUtilsIOS.click(getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.NotfyMeBelow")));
		getNFKiosAlertspageNotifyBelowvalueBtn().sendKeys(Lowalert);
		LFSUtilsIOS.click(getNFKiosalertspageNotifyBelowvaluedonebtn());
		LFSUtilsIOS.click(getNFKiosAlertspageLowalertBackBtn());
		Reporter.logWithScreenShot("Successfully changed Default High And Low Alert Threshould", MessageTypes.Pass);
	} catch(Exception e) {
		Reporter.logWithScreenShot("Failed to Change Default High And Low Alert Threshould",MessageTypes.Fail);
    	}
	}
	//Rushikesh
	//Method to turn on fall and rise rate 
	public void turnOnFallAndRiseRateAlert() {
		try {
		LFSUtilsIOS.click(getNFKiosAlertspageFallratealertTxt());
		LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
		LFSUtilsIOS.click(getNFKiosAlertspageFallratealertBackBtn());
		LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertTxt());
		LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
		LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertBackBtn());
		Reporter.logWithScreenShot("Successfully turned On Fall And Rise Rate Alert", MessageTypes.Pass);
	} catch(Exception e) {
		Reporter.logWithScreenShot("Failed to turned On Fall And Rise Rate Alert",MessageTypes.Fail);
    	}

	}
	//Rushikesh
	//Method to turn off signal loss and no reading alert
	public void turnOFFSignalLossAndNoreadingsAlertSetting() {
		try {
		LFSUtilsIOS.click(getNFKiosAlertspageSignallossTxt());
		LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
		LFSUtilsIOS.click(getNFKiosAlertspageSignallossBackBtn());
		LFSUtilsIOS.click(getNFKiosAlertspageNoreadingTxt());
		LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
		LFSUtilsIOS.click(getNFKiosAlertspageNoreadingBackBtn());
		Reporter.logWithScreenShot("Successfully turned OFF Signal Loss And No readings Alert Setting", MessageTypes.Pass);
	} catch(Exception e) {
		Reporter.logWithScreenShot("Failed to Turn OFF Signal Loss And No readings Alert Setting",MessageTypes.Fail);
    	}
	}
	//Rushikesh
	//Method to enable custome schedule setting 
	public void enableCustomeScheuleSetting() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		try {
			getNFKiosAlertspageAlertscSwitchBtn().waitForPresent(10);	
			getNFKiosAlertspageAlertscSwitchBtn().assertPresent("Switch button");	
			LFSUtilsIOS.click(getNFKiosAlertspageAlertscSwitchBtn());
			getNFKiosAlertspageAlertscSwitchBtn().isEnabled();
			Reporter.logWithScreenShot("Enabled Alert Schedule", MessageTypes.Pass);
			LFSUtilsIOS.click(getNFKiosAlertspageBackbtn());
			LFSUtilsIOS.click(getNFKiosAlertspageHomeBtn());
		} catch (Exception e) {
			Reporter.logWithScreenShot("User was not able to enable Alert Schedule", MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to update alert setting
	public void updateAlertSetting() {
		try {
		turnOffULSAlert();
		waitForPageToLoad();
		changeDefaultHighAndLowAlertThreshould();
		waitForPageToLoad();
        turnOnFallAndRiseRateAlert();
		waitForPageToLoad();
        turnOFFSignalLossAndNoreadingsAlertSetting();
		enableCustomeScheuleSetting();
		Reporter.logWithScreenShot("Successfully updated Alert Setting",MessageTypes.Pass);
	} catch(Exception e) {
		Reporter.logWithScreenShot("Failed to updated Alert Setting",MessageTypes.Fail);
    	}
	}
	//Rushikesh 
	//Method to verify reset alert setting button
	public void verifyResetAlertSettingButton() {
		try {
		HomePageIOS HomePage=new HomePageIOS();
		LFSUtilsIOS.click(HomePage.getNFKiosHomepageMoreBtn());
		MoremenuPageIOS moremenu=new MoremenuPageIOS();
		LFSUtilsIOS.click(moremenu.getNFKiosmoremenuPagemyalertsbtn());
		LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
		LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
		getNFKiosAlertspageResetBtn().verifyPresent();
		Reporter.logWithScreenShot("Successfully verified Reset Alert Setting Button",MessageTypes.Pass);
    	} catch(Exception e) {
		Reporter.logWithScreenShot("Failed to verifiy Reset Alert Setting Button",MessageTypes.Fail);
    	}
		}
	//Rushikesh
	//Method to verify confirmation screen
	public void verifyConfirmationScreen() {
		try {
		LFSUtilsIOS.click(getNFKiosAlertspageResetBtn());
		getNFKiosAlertspagePopupText().assertPresent("Do you want to reset");
		getNFKiosAlertspageResetpopResetBtn().verifyPresent();
		getNFKiosAlertspagePickerCancelBtn().verifyPresent();
		LFSUtilsIOS.click(getNFKiosAlertspagePickerCancelBtn());
		Reporter.logWithScreenShot("Successfully verified ConfirmationScreen",MessageTypes.Pass);
		} catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifiy ConfirmationScreen",MessageTypes.Fail);
		}
	}

	//Rushikesh
	//Method to verify urgent low soon alarm is disabled
	public void urgentLowSoonAlarmIsDisabled() {
		try {
			LFSUtilsIOS.scrollUp();
			LFSUtilsIOS.click(getNFKiosAlertspageurgentlowsoonalarmlbl());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
	        Reporter.logWithScreenShot("urgent low soon alert is disabled", MessageTypes.Pass);
			}
			LFSUtilsIOS.click(getNFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon());
		} catch(Exception e) {
			Reporter.logWithScreenShot("urgent low soon alert is enabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify no changes made on high and low alert 
	public void verifyNoChangeMadeOnHighAndLowAlert() {
		try {
			if(getNFKiosAlertspageHighalertTxt().getAttribute("value").equals(LFSUtilsIOS.getPropString("alertPage.highAlert.updated"))) {
				Reporter.logWithScreenShot("No changes in high alert reading",MessageTypes.Pass);
			}
		    
			if(getNFKiosAlertspageLowalertTxt().getAttribute("value").equals(LFSUtilsIOS.getPropString("alertPage.lowAlert.updated"))) {
				Reporter.logWithScreenShot("No changes in low alert reading",MessageTypes.Pass);
			}
		}catch(Exception e) {
			Reporter.logWithScreenShot("Failed to change the low and high alert reading",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify fall and rise rate are enabled
	public void verifyFallAndRiseRateAreEnabled() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageFallratealertTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
			Reporter.logWithScreenShot("fall rate alert toggle On", MessageTypes.Pass);
			}
			LFSUtilsIOS.click(getNFKiosAlertspageFallratealertBackBtn());

			LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
				Reporter.logWithScreenShot("rise rate alert toggle On", MessageTypes.Pass);
				}
			LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("fall and rise rate toggle is off",MessageTypes.Fail);
		}	
	}
	//Rushikesh
	//Method to verify signal loss and no reading toggle is off
	public void verifySignalLossAndNoReadingToggleIsOff() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageSignallossTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
	            Reporter.logWithScreenShot("signal loss toggle is disabled", MessageTypes.Pass);
			    }
			LFSUtilsIOS.click(getNFKiosAlertspageSignallossBackBtn());
			
			LFSUtilsIOS.click(getNFKiosAlertspageNoreadingTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
	            Reporter.logWithScreenShot("no reading toggle is disabled", MessageTypes.Pass);
			    }
			LFSUtilsIOS.click(getNFKiosAlertspageNoreadingBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("signal loss and no reading toggle is enabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify no changes are made on the alert screen
	public void verifyNoChangesAreMadeOnTheAlertScreen() {
		try {
			urgentLowSoonAlarmIsDisabled();
			verifyNoChangeMadeOnHighAndLowAlert();
			verifyFallAndRiseRateAreEnabled();
			verifySignalLossAndNoReadingToggleIsOff();
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			getNFKiosAlertspageAlertscSwitchBtn().waitForPresent(10);	
			getNFKiosAlertspageAlertscSwitchBtn().isEnabled();       
		 Reporter.logWithScreenShot("Successfully verified No Changes Are Made On The Alert Screen",MessageTypes.Pass);
		} catch (Exception e) {
			 Reporter.logWithScreenShot("Failed to verify no changes are made on alert screen",MessageTypes.Fail);
		}
    }
	//Rushikesh
	//Method to reset alert setting
	public void resetTheAlertSetting() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageResetBtn());
			LFSUtilsIOS.click(getNFKiosAlertspageResetpopResetBtn());
			Reporter.logWithScreenShot("Successfully reset alert setting", MessageTypes.Pass);	
		}catch(Exception e) {
			Reporter.logWithScreenShot("Failed to reset alert setting", MessageTypes.Fail);	
		}
	}
	//Rushikesh
	//Method to verify urgent low soon alert is enabled
	public void verifyUrgentLowSoonIsEnabled() {
		try {	        
	        LFSUtilsIOS.scrollUp();
			LFSUtilsIOS.click(getNFKiosAlertspageurgentlowsoonalarmlbl());
	        if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
		        Reporter.logWithScreenShot("urgent low soon alert is enabled",MessageTypes.Pass);
			    }
			LFSUtilsIOS.click(getNFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon());
		}catch(Exception e) {
	        Reporter.logWithScreenShot("urgent low soon alert is disabled", MessageTypes.Fail);
		}	
	}
	//Rushikesh
	//Method to verify by default values of low and high alert 
	public void verifyByDefaultValuesOfLowAndHighAlert() {
		try {
			if(getNFKiosAlertspageLowalertTxt().getAttribute("value").equals(LFSUtilsIOS.getPropString("high.value"))) {
				Reporter.logWithScreenShot("High Alert Threshold as (Notify Me Above = 200 mg/dL)",MessageTypes.Pass);

			}	    
			if(getNFKiosAlertspageLowalertTxt().getAttribute("value").equals(LFSUtilsIOS.getPropString("low.value"))) {
				Reporter.logWithScreenShot("Low Alert Threshold as (Notify me Below = 80 mg/dL)",MessageTypes.Pass);
			}	
		}catch(Exception e) {
			Reporter.logWithScreenShot("changes are made on high and low alert",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify fall rate alert is disabled
	public void verifyFallRateAlertIsDisabled() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageFallratealertTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
				Reporter.logWithScreenShot("fall rate alert is disabled", MessageTypes.Pass);
				}
			LFSUtilsIOS.click(getNFKiosAlertspageFallratealertBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("fall rate alert is enabled",MessageTypes.Fail);
		}	
	}
	//Rushikesh
	//Method to verify rise rate alert is disabled
	public void verifyRiseRateAlertIsDisabled() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
				Reporter.logWithScreenShot("rise rate alert is disabled", MessageTypes.Pass);
				}
			LFSUtilsIOS.click(getNFKiosAlertspageRiseratealertBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("rise rate alert is enabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify signal loss alert is enabled
	public void verifySignalLossAlertIsEnabled() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageSignallossTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
	            Reporter.logWithScreenShot("signal loss alert is enabled", MessageTypes.Pass);
			    }
			LFSUtilsIOS.click(getNFKiosAlertspageSignallossBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("signal loss alert is disabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to verify no reading alert is enabled
	public void verifyNoReadingAlertIsEnabled() {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageNoreadingTxt());
			if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
	            Reporter.logWithScreenShot("no reading alert is enabled", MessageTypes.Pass);
			    }
			LFSUtilsIOS.click(getNFKiosAlertspageNoreadingBackBtn());
		}catch(Exception e) {
			Reporter.logWithScreenShot("no reading alert is disabled",MessageTypes.Fail);
		}
	}
	//Rushikesh
	//Method to reset alert and verify alert setting
	public void resetAlertSetting() {
		try {
			resetTheAlertSetting();
			verifyUrgentLowSoonIsEnabled();
			verifyByDefaultValuesOfLowAndHighAlert();
			verifyFallRateAlertIsDisabled();
			verifyRiseRateAlertIsDisabled();
			verifySignalLossAlertIsEnabled();
			verifyNoReadingAlertIsEnabled();
		    LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		    LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		    getNFKiosAlertspageAlertscSwitchBtn().waitForPresent(10);	
		    getNFKiosAlertspageAlertscSwitchBtn().verifyEnabled("Toggle is OFF");
		    Reporter.logWithScreenShot("Successfully reset alert setting",MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to reset alert setting",MessageTypes.Fail);
		}
	}
	/*
	 * Author : Vaibhav
	 * Method to update the time for start and stop 
	 */
	private void updatePickerTime(String time) {
		String[] time1 = time.split("\\s");
		String[] time2 = time1[0].split("\\:");
		 LFSUtilsIOS.waitforLoad();
		 try {
			 getNFKiosEditschedulepageHrsPkr().sendKeys(time2[0]);
			 LFSUtilsIOS.waitforLoad();
			 getNFKiosEditschedulepageMinutePkr().sendKeys(time2[1]);
			 LFSUtilsIOS.waitforLoad();
			 getNFKiosEditschedulepageAmPmPkr().sendKeys(time1[1]);
		 }catch (Exception e) {
			Reporter.logWithScreenShot("User was unable to send the Time",MessageTypes.Fail);
			
		}
		 getNFKiosEditschedulepageDoneBtn().click();		
	}

	
	/*
	 * Author : Vaibhav
	 * Method to add start time and Stop time in Alert Schedule
	 */
	public void clicksOnPickerAndUpdateValue(String option,String time) {
		switch(option) {
		case "Start time":
        	clickStartTime();
        	LFSUtilsIOS.click(getNFKiosEditschedulepageStarttimeLabel());
        	updatePickerTime(time);
        	break;
        case "Stop time":
        	clickStopTime();
        	LFSUtilsIOS.click(getNFKiosEditschedulepageStoptimeLabel());
        	updatePickerTime(time);
        	break;
		}
		
	}
	/*
	 * Author :Vaibhav
	 * Method to click High Alert in Alert Schedule
	 */
	public void setAlertAndNotifyMeAbove(String str) {
		switch(str) {
		case "High":
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			getNFKiosAlertspageScheduleHighAlert().isPresent();
			LFSUtilsIOS.click(getNFKiosAlertspageScheduleHighAlert());
        	break;
		case "Low":
			getNFKiosAlertspageLowalertTxt().isPresent();
			LFSUtilsIOS.click(getNFKiosAlertspageLowalertTxt());
        	break;
		}
		
	}
	public void setToogleAlert(String opt) {
		try {
			switch (opt) {
			case "OFF":
				
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
//				(getNFKiosAlertspageSwitchBtn().verifyDisabled("OFF")) {
					Reporter.logWithScreenShot("low alert toggle alredy off", MessageTypes.Pass);

				} else {
					
					getNFKiosAlertspageSwitchBtn().click();
				}
				break;
			case "ON":
				
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
//				(getNFKiosAlertspageSwitchBtn().isEnabled()) {
					Reporter.logWithScreenShot("low alert toggle alredy On", MessageTypes.Pass);
				} else {
					
					getNFKiosAlertspageSwitchBtn().click();
				}
				break;
		
			default:
				Reporter.logWithScreenShot("Fail to set toggle", MessageTypes.Pass);
				break;
			}
			Reporter.logWithScreenShot("User has set the low alert toggle ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to set the low alert toggle", MessageTypes.Fail);
		}
	}

	public void setClickAlertSchedule(String str) {
		switch(str) {
		case "High":
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
			getNFKiosAlertspageScheduleHighAlert().isPresent();
			LFSUtilsIOS.click(getNFKiosAlertspageScheduleHighAlert());
        	break;
		case "Low":
			getNFKiosAlertspageScheduleLowAlert().isPresent();
			LFSUtilsIOS.click(getNFKiosAlertspageScheduleLowAlert());
        	break;
		}		
	}

	// Priya
	// Method to navigate from low alert screen to alert screen
	public void naviagateBackToAlertScreenFromLowAlertScreen() {
		LFSUtilsIOS.click(getNFKiosAlertspageLowalertBackBtn());
		getNFKiosAlertspagealarmtxt().verifyPresent();
		Reporter.logWithScreenShot("User successfully navigated to Alert screen", MessageTypes.Pass);
	}

	// Priya
	// Method to disable Custom alert setting
	public void disableAlertSceduelSetting() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		try {
			getNFKiosAlertspageAlertscSwitchBtn().waitForPresent();
			getNFKiosAlertspageAlertscSwitchBtn().assertPresent("Switch button");
			if (getNFKiosAlertspageAlertscSwitchBtn().isEnabled()) {
				LFSUtilsIOS.click(getNFKiosAlertspageAlertscSwitchBtn());
				Reporter.logWithScreenShot("Disabled Alert Schedule Setting", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Custom Alert Schedule Setting is already disabled", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to disable Alert Schedule Setting", MessageTypes.Fail);
		}
	}

	// Priya
	// Method to save Custom alert setting
	public void saveCustomALertSetting() {
		LFSUtilsIOS.click(getNFKiosAlertspageCustomAlertSaveBtn());
		getNFKiosAlertspagealarmtxt().verifyPresent();
		Reporter.logWithScreenShot("User saved custom alert setting and vaigated to alert screen", MessageTypes.Pass);
	}	
	// Abhinav- Reset confirmation popup
	public void resetConfirmationPopup() {
		try {
		LFSUtilsIOS.click(getNFKiosAlertspageResetBtn());
		getNFKiosAlertspagePopupText().assertPresent("Do you want to reset");
		getNFKiosAlertspageResetpopResetBtn().verifyPresent();
		getNFKiosAlertspagePickerCancelBtn().verifyPresent();
		Reporter.logWithScreenShot("Successfully clicked on Reset button on popup",MessageTypes.Pass);
		} catch(Exception e) {
			Reporter.logWithScreenShot("Failed to clicked on Reset button on popup",MessageTypes.Fail);

	}

		}
	
	//Abhinav- Reset button on reset confirmation popup
	public void resetConfirmationPopupBtn(){
		LFSUtilsIOS.click(getNFKiosAlertspageResetpopResetBtn());
		Reporter.logWithScreenShot("Successfully clicked on Reset button on popup",MessageTypes.Pass);
	}


	// Rushikesh
	// Method to verify signal loss toggle is enabled or disabled
	public void signalLossToggleAlert(String command) {
		try {
			HomePageIOS home = new HomePageIOS();
			switch (command) {
			case "off":
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1")) {
					LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
					Reporter.logWithScreenShot("Turn off Signal loss alert", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("Signal loss Alerts alredy off", MessageTypes.Pass);

				}
				LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
				break;
			case "on":
				if (getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0")) {
					LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
					Reporter.logWithScreenShot("Turn on Signal loss", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("Signal loss Alerts alredy on", MessageTypes.Pass);

				}
				LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
				break;
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify signal loss toggle is on or off", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to update and verify signal loss value
	public void updateAndVerifySignalLossValue(String hrs, String min) {
		try {
			LFSUtilsIOS.click(getNFKiosAlertspageSignallossFormorethan());
			LFSUtilsIOS.enterText(getNFKiosAlertspagePickerBtn(), hrs);
			LFSUtilsIOS.enterText(getNFKiosAlertspagePickerMinBtn(), min);
			LFSUtilsIOS.click(getNFKiosAlertspagePickerDoneBtn());
			Reporter.logWithScreenShot("Successfully updated Signal loss value", MessageTypes.Pass);
			LFSUtilsIOS.click(getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")));
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to update signal loss value", MessageTypes.Fail);
		}
	}

	//Auther-Pradnya
		//Description-Method to click custom high Alert
		public void userClicksCustomHighAlert() {
			try {
				if(getNFKiosAlertspageScheduleCustomHighAlert().isPresent()) {
					LFSUtilsIOS.click(getNFKiosAlertspageScheduleCustomHighAlert());
					Reporter.logWithScreenShot("Able to click on custom High Alert", MessageTypes.Pass);
				}
				
			}catch(Exception e) {
				Reporter.logWithScreenShot(" Not able to click on custom High Alert", MessageTypes.Fail);
			}

        }

		//Minal
	   	//Method to verify Mobile Device Alert off Banner
		public void verifyMobileDeviceAlertoffBanner() {
			if (getNFKiosalertspageMobileDeviceAlertsOffBannertxt().verifyPresent()) {
				Reporter.logWithScreenShot("Mobile Device Alerts Off banner displayed", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Mobile Device Alerts Off banner not displayed", MessageTypes.Fail);
			}
		}
		//Minal
	   	//Method to verify Change Your Setting popup
		public void verifyChangeYourSettingsPopup() {
			try {
				getNFKiosalertspageChangeYourSettingsPopuplbl().verifyPresent();
				getNFKiosalertspageChangeYourSettingsPopuptxt().verifyPresent();
				getNFKiosalertspageChangeYourSettingsPopupNotNowBtn().verifyPresent();
				getNFKiosalertspageChangeYourSettingsPopupSettingsBtn().verifyPresent();
				Reporter.logWithScreenShot("Change Your Settings displayed", MessageTypes.Pass);
			} catch (Exception e) {

				Reporter.logWithScreenShot("Change Your Settings not displayed", MessageTypes.Fail);
			}
		}
		//Minal
	   	//Method to verify Change Your Setting popup is displaying or not
		public void verifyChangeYourSettingPopupDisplayed() {
			if (getNFKiosalertspageChangeYourSettingsPopuplbl().isPresent()) {
				Reporter.logWithScreenShot("Change Your Settings popup displayed", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Change Your Settings not displayed", MessageTypes.Fail);
			}
		}
		//Minal
	   	//Method to click on Not Now button of Change Your Setting popup
		public void taponNotNow() {
			LFSUtilsIOS.click(getNFKiosalertspageChangeYourSettingsPopupNotNowBtn());
			Reporter.log("User Successfully clicked on Not Now Button", MessageTypes.Pass);
		}
		//Minal
	   	//Method to click on  Mobile Device Alert off Banner
		public void tapOnMobileDeviceAlertsOffbanner() {
			LFSUtilsIOS.click(getNFKiosalertspageMobileDeviceAlertsOffBannertxt());
			Reporter.log("User Successfully clicked on Mobile Device Alerts Off banner", MessageTypes.Pass);
		}
		//Minal
	   	//Method to click on Information Icon of Alert Screen
		public void tapOnInformationIcon() {
			LFSUtilsIOS.click(getNFKiosalertspageinfobtn());
			Reporter.log("User Successfully clicked on Information Icon ", MessageTypes.Pass);
		}
		//Minal
	   	//Method to Verify Mobile Device Setting Screen 
		public void verifyMobileDeviceSettingScreen() {

			try {
				getNFKiosalertspageInformationiconMobiledevicesettingslbl().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingstxt().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsKeepyouawaretxt().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsToreceivealertsmakesuretxt().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsCriticalalertsbtn().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsTimesensitivebtn().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsAllownotificationsbtn().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsSoundsbtn().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsGotomobilesettingslink().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsFocusmodetxt().verifyPresent();
				getNFKiosalertspageInformationiconMobiledevicesettingsBeforeyouturnonfocusmodetxt().verifyPresent();
				Reporter.logWithScreenShot("Mobile Device Screen is displayed ", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Mobile Device Screen is  not displayed", MessageTypes.Fail);
			}
		}
		
		//Minal
	   	//Method to Verify Mobile Device Setting Screen present or not
		public void verifyMobileDeviceSettingScreenDisplyed() {

			if (getNFKiosalertspageChangeYourSettingsPopuplbl().isPresent()) {
				Reporter.logWithScreenShot("User remains on Mobile Device Setting Screen", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot(" Mobile Device Setting Screen not displayed", MessageTypes.Fail);
			}

		}
		
		//Minal
	   	//Method to Verify Mobile Device Setting Screen present or not
		public void tapOnGoToMobileSettingLink() {
			LFSUtilsIOS.click(getNFKiosalertspageInformationiconMobiledevicesettingsGotomobilesettingslink());

			if (LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label='Settings']")
					.verifyPresent()) {
				Reporter.logWithScreenShot("Mobile Setting Screen is displayed ", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Mobile Setting Screen is  not displayed", MessageTypes.Fail);
			}
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label='Settings']").click();
			
		}
		//Minal
	   	//Method to navigate to Home screen from Mobile Device setting.
		public void navigateHomeScreenFromMobileDeviceSetting() {
			HomePageIOS home = new HomePageIOS();
			try {
				LFSUtilsIOS.click(getNFKiosalertspageInformationiconMobiledevicesettingsCancelbtn());
				getNFKiosalertspageAlertsBackbtn().click();
				home.getNFKiosHomepageHomeBtn().click();
				Reporter.logWithScreenShot("User navigated back to homescreen", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to navigate back to homescreen", MessageTypes.Fail);
			}
		}

		//Pradnya
				//Method to click on custom high alert toggle button
				public void userClicksOnCustomHighAlertToggle() {
					try
					{   
						if(getNFKiosAlertspageScheduleCustomHighAlert().isPresent())
						{
							LFSUtilsIOS.click(getNFKiosAlertspageScheduleCustomHighAlert());
						}
						LFSUtilsIOS.click(getNFKiosAlertspageScheduleCustomHighAlert());
						Reporter.logWithScreenShot("able to click on custom high alert toggle button", MessageTypes.Pass);
						
					}catch(Exception e) {
						Reporter.logWithScreenShot("not able to click on custom high alert toggle button", MessageTypes.Fail);
						}
					}
				//Pradnya
				//Method to verify high alert
				public void userVerifyHighAlert(String str)
				{
					
						try {
							switch (str) {
							case "200":
								String value = "200";
								
								if(getNFKiosAlertspageLowalertTxt().getAttribute("value").equals(LFSUtilsIOS.getPropString("highAlert.value")))
									Reporter.logWithScreenShot("Able to verify high alert is 200", MessageTypes.Pass);
								
								break;
							case "OFF":
								String value2 = "OFF";
								if(getNFKiosAlertspageLowalertTxt().getAttribute("value").equals(LFSUtilsIOS.getPropString("highAlert1.value")))
									Reporter.logWithScreenShot("Able to verify high alert is OFF", MessageTypes.Pass);
								break;
							}
							
					}catch(Exception e) {
						Reporter.logWithScreenShot("not Able to verify high alert", MessageTypes.Fail);
					}
						
				}

				// Minal
				// Method to turn on Treat as critical button on alert schedule screen
				public void setTreatasCriticalalertschedule() {

					try {
						getNFKiosalertspagealertscTreatasCriticalbtn().waitForPresent(10);
						if (getNFKiosalertspagealertscTreatasCriticalbtn().getAttribute("value").equals("0")) {
							LFSUtilsIOS.click(getNFKiosalertspagealertscTreatasCriticalbtn());

						} else {
							Reporter.logWithScreenShot("Treat as critical Already Enabled on alert schedule screen", MessageTypes.Pass);
						}
						getNFKiosalertspagealertscTreatasCriticalbtn().isEnabled();
						Reporter.logWithScreenShot("Enabled Treat as critical on alert schedule screen ", MessageTypes.Pass);
					} catch (Exception e) {
						Reporter.logWithScreenShot("User was not able to enable Treat as critical on alert schedule screen", MessageTypes.Fail);
					}
				}
				

				public void setTreatasCritical() {

					try {
						getNFKiosalertspageTreatasCriticalbtn().waitForPresent(10);
						if (getNFKiosalertspageTreatasCriticalbtn().getAttribute("value").equals("0")) {
							LFSUtilsIOS.click(getNFKiosalertspageTreatasCriticalbtn());

						} else {
							Reporter.logWithScreenShot("Treat as critical Already Enabled", MessageTypes.Pass);
						}
						getNFKiosalertspageTreatasCriticalbtn().isEnabled();
						Reporter.logWithScreenShot("Enabled Treat as critical on alert screen", MessageTypes.Pass);
					} catch (Exception e) {
						Reporter.logWithScreenShot("User was not able to enable Treat as critical on alert screen",
								MessageTypes.Fail);
					}
				}
				public void enabledTreatAsCriticalToggle() {
					LFSUtilsIOS.click(getNFKiosAlertspageSwitchBtn());
			}


    }