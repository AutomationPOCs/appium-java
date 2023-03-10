package com.NFK.version1.android.pages;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.NFK.support.ConsoleUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.ReminderDetailsBeans;
import com.NFK.version1.android.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MoreMenuPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.homepage.moremenu.settings.btn")
	private QAFWebElement NFKHomepageMoremenuSettingsBtn;
	@FindBy(locator = "NFK.homepage.moremenu.device.btn")
	private QAFWebElement NFKHomepageMoremenuMydeviceBtn;
	@FindBy(locator = "NFK.homepage.moremenu.reminders.btn")
	private QAFWebElement NFKHomepageMoremenuRemindersBtn;
	@FindBy(locator = "NFK.homepage.moremenu.account.btn")
	private QAFWebElement NFKHomepageMoremenuAccountBtn;
	@FindBy(locator = "NFK.homepage.moremenu.help.btn")
	private QAFWebElement NFKHomepageMoremenuHelpBtn;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.btn")
	private QAFWebElement NFKHomepageMoremenuContactusBtn;
	@FindBy(locator = "NFK.homepage.moremenu.termsofuse.btn")
	private QAFWebElement NFKHomepageMoremenuTermsofuseBtn;
	@FindBy(locator = "NFK.homepage.moremenu.privacypolicy.btn")
	private QAFWebElement NFKHomepageMoremenuPrivacypolicyBtn;
	@FindBy(locator = "NFK.homepage.moremenu.logout.btn")
	private QAFWebElement NFKHomepageMoremenuLogoutBtn;
	@FindBy(locator = "NFK.homepage.moremenu.termsofusepage.lbl")
	private QAFWebElement NFKHomepageMoremenuTermsofUsePageLbl;
	@FindBy(locator = "NFK.homepage.moremenu.connections.btn")
	private QAFWebElement NFKHomepageMoreMenuConnectionsBtn;
	@FindBy(locator = "NFK.homepage.moremenu.connections.officecode.txt")
	private QAFWebElement NFKHomepageMoremenuConnectionsOfficeCodeTxt;
	@FindBy(locator = "NFK.homepage.moremenu.connections.search.btn")
	private QAFWebElement NFKHomepageMoremenuConnectionsSearchBtn;
	@FindBy(locator = "NFK.homepage.moremenu.addofficecode.btn")
	private QAFWebElement NFKHomepageMoreMenuAddOfficeCodeBtn;
	@FindBy(locator = "NFK.homepage.moremenu.addcliniccode.YES.btn")
	private QAFWebElement NFKHomepageMoremenuAddClinicCodeYESBtn;
	@FindBy(locator = "NFK.homepage.moremenu.addcliniccode.renter.btn")
	private QAFWebElement NFKHomepageMoremenuAddcliniccodeRenterBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.reminders.lbl")
	private QAFWebElement NFKMoreMenuReminderspageRemindersLbl;
	@FindBy(locator = "NFK.moremenu.reminderspage.noreminders.lbl")
	private QAFWebElement NFKMoreMenuReminderspageNoRemindersLbl;
	@FindBy(locator = "NFK.moremenu.reminderspage.addreminder.btn")
	private QAFWebElement NFKMoreMenuReminderspageAddRemindersBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.staticText.btn")
	private QAFWebElement NFKMoreMenuReminderspageStaticTextBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.newreminder.btn")
	private QAFWebElement NFKMoreMenuReminderspageNewReminderBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.savereminder.btn")
	private QAFWebElement NFKMoreMenuReminderspageSaveRemindersBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.remember.btn")
	private QAFWebElement NFKMoreMenuReminderspageRememberBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.enterdescription.txt")
	private QAFWebElement NFKMoreMenuReminderspageEnterDescriptionTxt;
	@FindBy(locator = "NFK.moremenu.reminderspage.selectdatetime.btn")
	private QAFWebElement NFKMoreMenuReminderspageSelectedDateTimeBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.selectrepeatoption.btn")
	private QAFWebElement NFKMoreMenuReminderspageSelectRepeatOptionBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.saveddatetime.lbl")
	private QAFWebElement NFKMoreMenuMyRemindersPageSaveDateTimeLbl;
	@FindBy(locator = "NFK.moremenu.reminderdeteletpopup.delete.btn")
	private QAFWebElement NFKMoreMenuPageReminderDeletePopUpDeleteBtn;
	@FindBy(locator = "NFK.moremenuPage.reminder.description.txt")
	private QAFWebElement NFKMoremenuPageReminderDescriptionTxt;
	@FindBy(locator = "NFK.moremenu.connections.requestsubmit.lbl")
	private QAFWebElement NFKMoremenuConnectionsRequestsubmitLbl;
	@FindBy(locator = "NFK.moremenu.connections.withdrawreq.lbl")
	private QAFWebElement NFKMoremenuConnectionsWithdrawreqLbl;
	@FindBy(locator = "NFK.moremenu.connections.clinicname.lbl")
	private QAFWebElement NFKMoremenuConnectionsClinicnameLbl;
	@FindBy(locator = "NFK.moremenu.connections.clinicphono.lbl")
	private QAFWebElement NFKMoremenuConnectionsClinicphonoLbl;
	@FindBy(locator = "NFK.moremenu.connections.callpopup.message")
	private QAFWebElement NFKMoremenuConnectionsCallpopupMessage;
	@FindBy(locator = "NFK.moremenu.connections.callpopup.title")
	private QAFWebElement NFKMoremenuConnectionsCallpopupTitle;
	@FindBy(locator = "NFK.moremenu.connections.cancel.btn")
	private QAFWebElement NFKMoremenuConnectionsCancelBtn1;
	@FindBy(locator = "NFK.moremenu.connections.call.btn")
	private QAFWebElement NFKMoremenuConnectionsCallBtn;
	@FindBy(locator = "NFK.moremenu.connections.clinic.connected")
	private QAFWebElement NFKMoremenuConnectionsClinicConnected;

	@FindBy(locator = "NFK.homepage.moremenu.connections.officename.lbl")
	private QAFWebElement NFKHomepageMoremenuConnectionsOfficenameLbl;
	@FindBy(locator = "NFK.homepage.moremenu.connections.officenumber.lbl")
	private QAFWebElement NFKHomepageMoremenuConnectionsOfficenumberLbl;
	@FindBy(locator = "NFK.homepage.moremenu.connections.done.btn")
	private QAFWebElement NFKHomepageMoremenuConnectionsDoneBtn;
	@FindBy(locator = "NFK.homepage.moremenu.connections.officeaccept.chkbox")
	private QAFWebElement NFKHomepageMoremenuConnectionsOfficeacceptChkbox;
	@FindBy(locator = "NFK.homepage.moremenu.connections.walgreens.lbl")
	private QAFWebElement NFKHomepageMoremenuConnectionsWalgreensLbl;
	@FindBy(locator = "NFK.homepage.moremenu.connections.walgreen.tglbtn")
	private QAFWebElement NFKHomepageMoremenuConnectionsWalgreenTglbtn;
	@FindBy(locator = "NFK.homepage.moremenu.reminders.bgtest.temp.btm")
	private QAFWebElement NFKHomepageMoremenuRemindersBgtestTempBtm;
	@FindBy(locator = "NFK.homepage.moremenu.connections.walgreen.chkbx")
	private QAFWebElement NFKHomepageMoremenuConnectionsWalgreenChkbx;
	@FindBy(locator = "NFK.homepage.moremenu.clinic.confirmation.btn")
	private QAFWebElement NFKHomepageMoremenuClinicConfirmationBtn;
	@FindBy(locator = "NFK.homepage.moremenu.clinic.confirmation.field")
	private QAFWebElement NFKHomepageMoremenuClinicConfirmationField;
	@FindBy(locator = "NFK.moremenu.syncreminder.lbl")
	private QAFWebElement NFKMoremenuSyncreminderLbl;
	@FindBy(locator = "NFK.moremenu.syncreminder.toggle.btn")
	private QAFWebElement NFKMoremenuSyncreminderToggleBtn;
	@FindBy(locator = "NFK.walgreenpage.username.txtfld")
	private QAFWebElement NFKWalgreenpageUsernameTxtfld;
	@FindBy(locator = "NFK.walgreenpage.password.txtfld")
	private QAFWebElement NFKWalgreenpagePasswordTxtfld;
	@FindBy(locator = "NFK.walgreenpage.signin.btn")
	private QAFWebElement NFKWalgreenpageSigninBtn;
	@FindBy(locator = "NFK.walgreenpage.autologin.yes.btn")
	private QAFWebElement NFKWalgreenpageAutologinYesBtn;
	@FindBy(locator = "NFK.walgreenpage.finishlogin.btn")
	private QAFWebElement NFKWalgreenpageFinishloginBtn;
	@FindBy(locator = "NFK.walgreenpage.iagree.chkbx")
	private QAFWebElement NFKWalgreenpageIagreeChkbx;
	@FindBy(locator = "NFK.moremenu.reminderspage.repeat.lbl")
	private QAFWebElement NFKMoreMenuReminderRepeatLbl;
	@FindBy(locator = "NFK.moremenu.connections.cancel.btn")
	private QAFWebElement NFKMoremenuConnectionsCancelBtn;
	@FindBy(locator = "NFK.moremenu.connections.popup.TOU.link")
	private QAFWebElement NFKMoremenuConnectionsPopupTouLink;
	@FindBy(locator = "NFK.moremenu.connections.popup.PP.link")
	private QAFWebElement NFKMoremenuConnectionsPopupPpLink;
	@FindBy(locator = "NFK.moremenu.connections.popup.imporAlert.txt")
	private QAFWebElement NFKMoremenuConnectionsPopupImportantAlertText;
	@FindBy(locator = "NFK.moremenu.connections.popup.ok.btn")
	private QAFWebElement NFKMoremenuConnectionsPopupOkBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.newreminder.savedreminder.lbl")
	private QAFWebElement NFKMoremenuMyreminderspageNewreminderSavedreminderLbl;
	@FindBy(locator = "NFK.moremenu.reminderspage.reminder.popup.heading.lbl")
	private QAFWebElement otMoreMenuMyReminderspageReminderPopupheadingLbl;

	@FindBy(locator = "NFK.moremenu.reminderspage.createdreminder.btn")
	private QAFWebElement NFKMoreMenuReminderspageCreatedReminderBtn;

	@FindBy(locator = "NFK.moremenu.reminderspage.reminder.popup.title.txt")
	private QAFWebElement NFKMoreMenuReminderspageReminderPopupTitleTxt;

	@FindBy(locator = "NFK.moremenu.reminderspage.reminder.title.txt")
	private QAFWebElement NFKMoreMenuReminderspageReminderTitleTxt;
	@FindBy(locator = "NFK.moremenu.reminderspage.reminder.delete.btn")
	private QAFWebElement NFKMoreMenuReminderspageReminderDeleteBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.reminder.popup.ok.btn")
	private QAFWebElement NFKMoreMenuReminderspageReminderPopUpOkBtn;

	@FindBy(locator = "NFK.moremenu.alert.btn")
	private QAFWebElement NFKMoremenuAlertBtn;

	@FindBy(locator = "NFK.moremenu.share.btn")
	private QAFWebElement NFKMoremenuShareBtn;
	@FindBy(locator = "NFK.moremenu.reminderspage.addreminder.name")
	private QAFWebElement NFKMoremenuMyreminderspageAddreminderName;
	@FindBy(locator = "NFK.homepage.moremenu.popup.title")
	private QAFWebElement NFKHomepageMoremenuPopupTitle;
	@FindBy(locator = "NFK.homepage.moremenu.message.txt")
	private QAFWebElement NFKHomepageMoremenuMessageTxt;
	@FindBy(locator = "NFK.addevent.timeselect.hour.txt")
	private QAFWebElement NFKAddeventTimeselectHourTxt;
	@FindBy(locator = "NFK.addevent.timeselect.minute.txt")
	private QAFWebElement NFKAddeventTimeselectMinuteTxt;

	@FindBy(locator = "NFK.Mydevices.start.sensor.session.Btn")
	private QAFWebElement NFKMydevicestartsensorsessionbtn;

	@FindBy(locator = "NFK.Moremenu.unpairSensor.btn")
	private QAFWebElement NFKMoremenuUnpairSensorBtn;
	@FindBy(locator = "NFK.Moremenu.stopSensor.btn")
	private QAFWebElement NFKMoremenuStopSensorBtn;
	@FindBy(locator = "NFK.Moremenu.stopSensor.popop")
	private QAFWebElement NFKMoremenuStopSensorPopop;

	public QAFWebElement getNFKAddeventTimeselectHourTxt() {
		return NFKAddeventTimeselectHourTxt;
	}

	public QAFWebElement getNFKAddeventTimeselectMinuteTxt() {
		return NFKAddeventTimeselectMinuteTxt;
	}

	public QAFWebElement getNFKMydevicestartsensorsessionbtn() {
		return NFKMydevicestartsensorsessionbtn;
	}

	@FindBy(locator = "NFK.Mydevices.title")
	private QAFWebElement NFKMydevicestitle;
	@FindBy(locator = "NFK.Mydevices.icon.close.btn")
	private QAFWebElement NFKMydevicesIconCloseBtn;
	@FindBy(locator = "NFK.Mydevices.icon.msg.txt")
	private QAFWebElement NFKMydevicesIconMsgTxt;

	public QAFWebElement getNFKMydevicestitle() {
		return NFKMydevicestitle;
	}

	public QAFWebElement getNFKMydevicesIconCloseBtn() {
		return NFKMydevicesIconCloseBtn;
	}

	public QAFWebElement getNFKMydevicesIconMsgTxt() {
		return NFKMydevicesIconMsgTxt;
	}

	@FindBy(locator = "NFK.Mydevices.integrated.device.title")
	private QAFWebElement NFKMyDevicesintegratedtitle;

	public QAFWebElement getNFKMyDevicesintegratedtitle() {
		return NFKMyDevicesintegratedtitle;
	}

	@FindBy(locator = "NFK.Mydevices.i.icon")
	private QAFWebElement NFKMyDevicesiIcon;

	public QAFWebElement getNFKMyDevicesiIcon() {
		return NFKMyDevicesiIcon;
	}

	@FindBy(locator = "NFK.Mydevices.add.devices.button")
	private QAFWebElement NFKMyDevicesAdddevicebtn;

	public QAFWebElement getNFKMyDevicesAdddevicebtn() {
		return NFKMyDevicesAdddevicebtn;
	}

	@FindBy(locator = "NFK.Pair.Sensor.Back.btn")
	private QAFWebElement NFKPairsensorBackbtn;

	public QAFWebElement getNFKPairsensorBackbtn() {
		return NFKPairsensorBackbtn;
	}

	@FindBy(locator = "NFK.Pair.Sensor.title")
	private QAFWebElement NFKPairSensorTitle;

	public QAFWebElement getNFKPairSensorTitle() {
		return NFKPairSensorTitle;
	}

	@FindBy(locator = "NFK.Pair.Sensor.screen.text")
	private QAFWebElement NFKPairSensorscreentext;

	public QAFWebElement getNFKPairSensorscreentext() {
		return NFKPairSensorscreentext;
	}

	@FindBy(locator = "NFK.Pair.Sensor.pairing.code")
	private QAFWebElement NFKPairSensorpairingcode;

	public QAFWebElement getNFKPairSensorpairingcode() {
		return NFKPairSensorpairingcode;
	}

	@FindBy(locator = "NFK.Pair.Sensor.Use.Code.scanner.btn")
	private QAFWebElement NFKPairSensorUseCodeScannerBtn;

	public QAFWebElement getNFKPairSensorUseCodeScannerBtn() {
		return NFKPairSensorUseCodeScannerBtn;
	}

	@FindBy(locator = "NFK.Pair.Sensor.next.button.enable")
	private QAFWebElement NFKPairSensorNextbtnenable;

	public QAFWebElement getNFKPairSensorNextbtnenable() {
		return NFKPairSensorNextbtnenable;
	}

	@FindBy(locator = "NFK.moremenu.reminderspage.remindertitle.list")
	private List<QAFWebElement> NFKmoremenureminderspageremindertitlelist;

	public QAFWebElement getNFKMoreMenuReminderspageReminderPopUpOkBtn() {
		return NFKMoreMenuReminderspageReminderPopUpOkBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuPopupTitle() {
		return NFKHomepageMoremenuPopupTitle;
	}

	public QAFWebElement getNFKMoremenuConnectionsClinicnameLbl() {
		return NFKMoremenuConnectionsClinicnameLbl;
	}

	public QAFWebElement getNFKMoremenuConnectionsClinicphonoLbl() {
		return NFKMoremenuConnectionsClinicphonoLbl;
	}

	public QAFWebElement getNFKMoremenuConnectionsCallpopupMessage() {
		return NFKMoremenuConnectionsCallpopupMessage;
	}

	public QAFWebElement getNFKMoremenuConnectionsCallpopupTitle() {
		return NFKMoremenuConnectionsCallpopupTitle;
	}

	public QAFWebElement getNFKMoremenuConnectionsCancelBtn1() {
		return NFKMoremenuConnectionsCancelBtn1;
	}

	public QAFWebElement getNFKMoremenuConnectionsCallBtn() {
		return NFKMoremenuConnectionsCallBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuMessageTxt() {
		return NFKHomepageMoremenuMessageTxt;
	}

	public void setNFKMoreMenuReminderspageReminderPopUpOkBtn(
			QAFWebElement NFKMoreMenuReminderspageReminderPopUpOkBtn) {
		this.NFKMoreMenuReminderspageReminderPopUpOkBtn = NFKMoreMenuReminderspageReminderPopUpOkBtn;
	}

	public QAFWebElement getNFKMoremenuConnectionsRequestsubmitLbl() {
		return NFKMoremenuConnectionsRequestsubmitLbl;
	}

	public QAFWebElement getNFKMoreMenuReminderspageReminderTitleTxt() {
		return NFKMoreMenuReminderspageReminderTitleTxt;
	}

	public void setNFKMoreMenuReminderspageReminderTitleTxt(QAFWebElement NFKMoreMenuReminderspageReminderTitleTxt) {
		this.NFKMoreMenuReminderspageReminderTitleTxt = NFKMoreMenuReminderspageReminderTitleTxt;
	}

	public QAFWebElement getNFKMoremenuMyreminderspageAddreminderName() {
		return NFKMoremenuMyreminderspageAddreminderName;
	}

	public QAFWebElement getNFKMoreMenuReminderspageReminderDeleteBtn() {
		return NFKMoreMenuReminderspageReminderDeleteBtn;
	}

	public QAFWebElement getNFKMoremenuPageReminderDescriptionTxt() {
		return NFKMoremenuPageReminderDescriptionTxt;
	}

	public QAFWebElement getNFKMoremenuConnectionsWithdrawreqLbl() {
		return NFKMoremenuConnectionsWithdrawreqLbl;
	}

	public QAFWebElement getNFKMoremenuConnectionsClinicConnected() {
		return NFKMoremenuConnectionsClinicConnected;
	}

	public void setNFKMoreMenuReminderspageReminderDeleteBtn(QAFWebElement NFKMoreMenuReminderspageReminderDeleteBtn) {
		this.NFKMoreMenuReminderspageReminderDeleteBtn = NFKMoreMenuReminderspageReminderDeleteBtn;
	}

	public QAFWebElement getNFKMoreMenuReminderspageReminderPopupTitleTxt() {
		return NFKMoreMenuReminderspageReminderPopupTitleTxt;
	}

	public QAFWebElement getNFKMoremenuMyreminderspageNewreminderSavedreminderLbl() {
		return NFKMoremenuMyreminderspageNewreminderSavedreminderLbl;
	}

	public void setNFKMoreMenuReminderspageReminderPopupTitleTxt(
			QAFWebElement NFKMoreMenuReminderspageReminderPopupTitleTxt) {
		this.NFKMoreMenuReminderspageReminderPopupTitleTxt = NFKMoreMenuReminderspageReminderPopupTitleTxt;
	}

	public QAFWebElement getNFKMoreMenuReminderspageCreatedReminderBtn() {
		return NFKMoreMenuReminderspageCreatedReminderBtn;
	}

	public void setNFKMoreMenuReminderspageCreatedReminderBtn(
			QAFWebElement NFKMoreMenuReminderspageCreatedReminderBtn) {
		this.NFKMoreMenuReminderspageCreatedReminderBtn = NFKMoreMenuReminderspageCreatedReminderBtn;
	}

	public QAFWebElement getOtMoreMenuMyReminderspageReminderPopupheadingLbl() {
		return otMoreMenuMyReminderspageReminderPopupheadingLbl;
	}

	public void setOtMoreMenuMyReminderspageReminderPopupheadingLbl(
			QAFWebElement otMoreMenuMyReminderspageReminderPopupheadingLbl) {
		this.otMoreMenuMyReminderspageReminderPopupheadingLbl = otMoreMenuMyReminderspageReminderPopupheadingLbl;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKMoremenuConnectionsPopupOkBtn() {
		return NFKMoremenuConnectionsPopupOkBtn;
	}

	public QAFWebElement getNFKMoremenuConnectionsPopupImportantAlertText() {
		return NFKMoremenuConnectionsPopupImportantAlertText;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsOfficenameLbl() {
		return NFKHomepageMoremenuConnectionsOfficenameLbl;
	}

	public QAFWebElement getNFKMoremenuAlertBtn() {
		return NFKMoremenuAlertBtn;
	}

	public QAFWebElement getNFKMoremenuShareBtn() {
		return NFKMoremenuShareBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsOfficenumberLbl() {
		return NFKHomepageMoremenuConnectionsOfficenumberLbl;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsDoneBtn() {
		return NFKHomepageMoremenuConnectionsDoneBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsOfficeacceptChkbox() {
		return NFKHomepageMoremenuConnectionsOfficeacceptChkbox;
	}

	public QAFWebElement getNFKMoreMenuMyRemindersPageSaveDateTimeLbl() {
		return NFKMoreMenuMyRemindersPageSaveDateTimeLbl;
	}

	public QAFWebElement getNFKMoreMenuPageReminderDeletePopUpDeleteBtn() {
		return NFKMoreMenuPageReminderDeletePopUpDeleteBtn;
	}

	public QAFWebElement getNFKMoreMenuReminderspageSaveRemindersBtn() {
		return NFKMoreMenuReminderspageSaveRemindersBtn;
	}

	public QAFWebElement getNFKMoreMenuReminderspageRememberBtn() {
		return NFKMoreMenuReminderspageRememberBtn;
	}

	public QAFWebElement getNFKMoreMenuReminderspageEnterDescriptionTxt() {
		return NFKMoreMenuReminderspageEnterDescriptionTxt;
	}

	public QAFWebElement getNFKMoreMenuReminderspageSelectedDateTimeBtn() {
		return NFKMoreMenuReminderspageSelectedDateTimeBtn;
	}

	public QAFWebElement getNFKTimeStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.homepage.moremenu.datepopup.dynamic.txt", text);
	}

	public QAFWebElement getNFKMoreMenuReminderspageSelectRepeatOptionBtn() {
		return NFKMoreMenuReminderspageSelectRepeatOptionBtn;
	}

	public QAFWebElement getNFKMoreMenuReminderspageRemindersLbl() {
		return NFKMoreMenuReminderspageRemindersLbl;
	}

	public QAFWebElement getNFKMoreMenuReminderspageNoRemindersLbl() {
		return NFKMoreMenuReminderspageNoRemindersLbl;
	}

	public QAFWebElement getNFKMoreMenuReminderspageAddRemindersBtn() {
		return NFKMoreMenuReminderspageAddRemindersBtn;
	}

	public QAFWebElement getNFKMoreMenuReminderspageStaticTextBtn(String Text) {
		return LFSUtilsAndroid.getElement("NFK.moremenu.reminderspage.staticText.btn", Text);
	}

	public QAFWebElement getNFKMoreMenuReminderspageNewReminderBtn() {
		return NFKMoreMenuReminderspageNewReminderBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsOfficeCodeTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.homepage.moremenu.connections.officecode.txt", text);
	}

	public QAFWebElement getNFKHomepageMoreMenuAddOfficeCodeBtn() {
		return NFKHomepageMoreMenuAddOfficeCodeBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuAddOfficecodeYESBtn() {
		return NFKHomepageMoremenuAddClinicCodeYESBtn;
	}

	public QAFWebElement getNFKHomepageMoreMenuConnectionsSearchBtn() {
		return NFKHomepageMoremenuConnectionsSearchBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuAddcliniccodeRenterBtn() {
		return NFKHomepageMoremenuAddcliniccodeRenterBtn;
	}

	public QAFWebElement getNFKHomepageMoreMenuConnectionsBtn() {
		return NFKHomepageMoreMenuConnectionsBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuTermsofUsePageLbl() {
		return NFKHomepageMoremenuTermsofUsePageLbl;
	}

	public QAFWebElement getNFKHomepageMoremenuClinicConfirmationField() {
		return NFKHomepageMoremenuClinicConfirmationField;
	}

	public QAFWebElement getNFKhomepagemoremenusettingsbtn() {
		return NFKHomepageMoremenuSettingsBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuMydeviceBtn() {
		return NFKHomepageMoremenuMydeviceBtn;
	}

	public QAFWebElement getNFKhomepagemoremenuremindersbtn() {
		return NFKHomepageMoremenuRemindersBtn;
	}

	public QAFWebElement getNFKhomepagemoremenuaccountbtn() {
		return NFKHomepageMoremenuAccountBtn;
	}

	private List<QAFWebElement> getNFKmoremenureminderspageremindertitlelist() {
		return NFKmoremenureminderspageremindertitlelist;
	}

	public QAFWebElement getNFKhomepagemoremenuhelpbtn() {
		return NFKHomepageMoremenuHelpBtn;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusbtn() {
		return NFKHomepageMoremenuContactusBtn;
	}

	public QAFWebElement getNFKhomepagemoremenutermsofusebtn() {
		return NFKHomepageMoremenuTermsofuseBtn;
	}

	public QAFWebElement getNFKhomepagemoremenuprivacypolicybtn() {
		return NFKHomepageMoremenuPrivacypolicyBtn;
	}

	public QAFWebElement getNFKhomepagemoremenulogoutbtn() {
		return NFKHomepageMoremenuLogoutBtn;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsWalgreensLbl() {
		return NFKHomepageMoremenuConnectionsWalgreensLbl;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsWalgreenTglbtn() {
		return NFKHomepageMoremenuConnectionsWalgreenTglbtn;
	}

	public QAFWebElement getNFKHomepageMoremenuRemindersBgtestTempBtm() {
		return NFKHomepageMoremenuRemindersBgtestTempBtm;
	}

	public QAFWebElement getNFKHomepageMoremenuConnectionsWalgreenChkbx() {
		return NFKHomepageMoremenuConnectionsWalgreenChkbx;
	}

	public QAFWebElement getNFKMoremenuSyncreminderLbl() {
		return NFKMoremenuSyncreminderLbl;
	}

	public QAFWebElement getNFKMoremenuSyncreminderToggleBtn() {
		return NFKMoremenuSyncreminderToggleBtn;
	}

	public QAFWebElement getNFKWalgreenpageUsernameTxtfld() {
		return NFKWalgreenpageUsernameTxtfld;
	}

	public QAFWebElement getNFKWalgreenpagePasswordTxtfld() {
		return NFKWalgreenpagePasswordTxtfld;
	}

	public QAFWebElement getNFKWalgreenpageSigninBtn() {
		return NFKWalgreenpageSigninBtn;
	}

	@FindBy(locator = "xpath=//*[contains(@resource-id,'id/tv_office_status')]")
	private QAFWebElement NFKHomepageMoreMenuConnectionsAddedConnectionStatus;

	public QAFWebElement getNFKHomepageMoreMenuConnectionsAddedConnectionStatus() {
		return NFKHomepageMoreMenuConnectionsAddedConnectionStatus;
	}

	public QAFWebElement getNFKWalgreenpageAutologinYesBtn() {
		return NFKWalgreenpageAutologinYesBtn;
	}

	public QAFWebElement getNFKWalgreenpageFinishloginBtn() {
		return NFKWalgreenpageFinishloginBtn;
	}

	ContactusPageAndroid conPage = new ContactusPageAndroid();

	public QAFWebElement getNFKMoreMenuReminderRepeatLbl() {
		return NFKMoreMenuReminderRepeatLbl;
	}

	public void setNFKMoreMenuReminderRepeatLbl(QAFWebElement NFKMoreMenuReminderRepeatLbl) {
		this.NFKMoreMenuReminderRepeatLbl = NFKMoreMenuReminderRepeatLbl;
	}

	public QAFWebElement getNFKWalgreenpageIagreeChkbx() {
		return NFKWalgreenpageIagreeChkbx;
	}

	public QAFWebElement getNFKMoremenuConnectionsCancelBtn() {
		return NFKMoremenuConnectionsCancelBtn;
	}

	public QAFWebElement getNFKMoremenuConnectionsPopupTouLink() {
		return NFKMoremenuConnectionsPopupTouLink;
	}

	public QAFWebElement getNFKMoremenuConnectionsPopupPpLink() {
		return NFKMoremenuConnectionsPopupPpLink;
	}

	public QAFWebElement getNFKMoremenuUnpairSensorBtn() {
		return NFKMoremenuUnpairSensorBtn;
	}

	public QAFWebElement getNFKMoremenuStopSensorBtn() {
		return NFKMoremenuStopSensorBtn;
	}

	public QAFWebElement getNFKMoremenuStopSensorPopop() {
		return NFKMoremenuStopSensorPopop;
	}

	// Method to click on Contact Us menu
	public void clickContactUs() {
		Reporter.logWithScreenShot("More Menu with Contact Us button", MessageTypes.Pass);
		// getNFKhomepagemoremenucontactusbtn().click();
		LFSUtilsAndroid.click(getNFKhomepagemoremenucontactusbtn());
		conPage.getNFKhomepagemoremenucontactuscontactuslbl().waitForPresent();
		Reporter.logWithScreenShot("Contact Us Page Displayed", MessageTypes.Pass);
	}

	// Method to verify Menus from More Menu tab
	public void verifyMenu() {
		getNFKhomepagemoremenusettingsbtn().verifyPresent("Settings Menu in More Menu");
		// getNFKhomepagemoremenumymetersbtn().verifyPresent("My Meters Menu in More
		// Menu");
		getNFKhomepagemoremenucontactusbtn().verifyPresent("Contact Us Menu in More Menu");
		getNFKhomepagemoremenuaccountbtn().verifyPresent("Account Menu in More Menu");
		getNFKhomepagemoremenuhelpbtn().verifyPresent("Help Menu in More Menu");
		getNFKhomepagemoremenuremindersbtn().verifyPresent("Reminders Menu in More Menu");
		getNFKhomepagemoremenutermsofusebtn().verifyPresent("Terms Of Use Menu in More Menu");
		getNFKhomepagemoremenuprivacypolicybtn().verifyPresent("Privacy Policy Menu in More Menu");
		getNFKhomepagemoremenulogoutbtn().verifyNotPresent("Logout Button is removed from More Menu");

	}

	// Method to verify Terms of Use link from More Menu
	public void verifyTermsOfUsePage() {
		LFSUtilsAndroid.swipePage();
		getNFKhomepagemoremenutermsofusebtn().verifyPresent("Terms Of Use Menu in More Menu");
		getNFKhomepagemoremenutermsofusebtn().click();
		getNFKHomepageMoremenuTermsofUsePageLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKHomepageMoremenuTermsofUsePageLbl().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.terms")),
				"Incorrecct terms title", "Correcct Terms title");
		Reporter.logWithScreenShot("Terms Of Use Page is Displayed", MessageTypes.Pass);
		Reporter.logWithScreenShot("Terms Of Use Page 1 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 2 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 3 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 4 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 5 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify Privacy Policy link from More Menu
	public void verifyPrivacyPolicyPage() {
		LFSUtilsAndroid.swipePage();
		getNFKhomepagemoremenuprivacypolicybtn().verifyPresent("Privacy Policy Menu in More Menu");
		getNFKhomepagemoremenuprivacypolicybtn().click();
		getNFKHomepageMoremenuTermsofUsePageLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKHomepageMoremenuTermsofUsePageLbl().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.privacy")),
				"Incorrecct Privecy title", "Correcct Privecy title");
		Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 4 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 5 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to open setting Page
	public void clickMySetting() {
		LFSUtilsAndroid.click(getNFKhomepagemoremenusettingsbtn());
		Reporter.logWithScreenShot("User clicked on Setting option", MessageTypes.Pass);
	}

	// Method To Open My Devices
	public void clickMyDevices() {
		if (getNFKHomepageMoremenuMydeviceBtn().isPresent()) {
			getNFKHomepageMoremenuMydeviceBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("My Devices page", MessageTypes.Pass);
		}

	}

	public void VerifyMyDevices() {
		getNFKMydevicestitle().assertPresent("Title present");
		getNFKMydevicestartsensorsessionbtn().assertPresent("Startsensor sesiion button present");
		getNFKMyDevicesintegratedtitle().assertPresent("integrated device title");
		getNFKMyDevicesiIcon().assertPresent("i icon");
		getNFKMyDevicesAdddevicebtn().assertPresent("Add device btn");
		getNFKMyDevicesiIcon().click();
		getNFKMydevicestitle().assertPresent("Integrated devices");
		getNFKMydevicesIconMsgTxt().assertPresent("Text message");
		getNFKMydevicesIconCloseBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After clicking on reminder in more menu screen", MessageTypes.Pass);

	}

	// Click on Start sensor Senssion and pair sensor back button operation
	public void startsensorsession() {

		getNFKMydevicestartsensorsessionbtn().isPresent();
		getNFKMydevicestartsensorsessionbtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User is on Pair Sensor screen", MessageTypes.Pass);
		getNFKPairsensorBackbtn().click();
		getNFKMydevicestartsensorsessionbtn().click();
		LFSUtilsAndroid.waitforLoad();

	}

	// Verify pair sensor screen
	public void verifypairsensor() {

		getNFKPairSensorTitle().isPresent();
		getNFKPairSensorscreentext().isPresent();
		getNFKPairSensorpairingcode().isPresent();
		getNFKPairSensorUseCodeScannerBtn().isPresent();
		LFSUtilsAndroid.waitforLoad();
	}

	// Method to click on Connections tab on Homepage
	public void clickConnections() {
		LFSUtilsAndroid.click(getNFKHomepageMoreMenuConnectionsBtn());

		Reporter.logWithScreenShot("After clicking on connection switch", MessageTypes.Pass);
	}

	public void takeScreenshotsConnetionsPage() {

		Reporter.logWithScreenShot("Connections page is displayed", MessageTypes.Pass);
		getNFKHomepageMoreMenuAddOfficeCodeBtn().click();
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Add clinic button", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().isPresent()) {
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();
			Reporter.logWithScreenShot("Important notice message", MessageTypes.Pass);
			getNFKMoreMenuPageReminderDeletePopUpDeleteBtn().click();
			Reporter.logWithScreenShot("Walgreens notice page", MessageTypes.Pass);
		}
		LFSUtilsAndroid.clickBackButton();
	}

	public void enterAndVerifyValidOfficeCode(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		Reporter.logWithScreenShot("Clinic code text box", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKHomepageMoreMenuAddOfficeCodeBtn());
		enterClinicCode(userBean.getClinicCode());

		getNFKHomepageMoreMenuConnectionsSearchBtn().waitForEnabled();
		Reporter.logWithScreenShot("Clinic Code details are entered", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKHomepageMoreMenuConnectionsSearchBtn());

		getNFKHomepageMoremenuAddOfficecodeYESBtn().waitForEnabled();
		LFSUtilsAndroid.click(getNFKHomepageMoremenuAddcliniccodeRenterBtn());
		String getclinic = getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").getText();
		getclinic.isEmpty();
		enterClinicCode(userBean.getClinicCode());
		LFSUtilsAndroid.click(getNFKHomepageMoreMenuConnectionsSearchBtn());
		LFSUtilsAndroid.click(getNFKHomepageMoremenuAddOfficecodeYESBtn());
		LFSUtilsAndroid.pause(2000);
		Reporter.logWithScreenShot("Clinic consent", MessageTypes.Pass);
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKHomepageMoremenuConnectionsOfficeacceptChkbox());

		LFSUtilsAndroid.click(getNFKHomepageMoremenuConnectionsDoneBtn());

		Reporter.logWithScreenShot("Connection request submited label", MessageTypes.Pass);

	}

	private void enterClinicCode(String clinicode) {

		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").waitForPresent();
//		String clinicCode = userBean.getClinicCode();
		int index = 1;
		for (int i = 0; i < clinicode.length(); i++) {
			String boxNo = "" + index;
			char c = clinicode.charAt(i);
			String s = new StringBuilder().append(c).toString();
			getNFKHomepageMoremenuConnectionsOfficeCodeTxt(boxNo).sendKeys(s);
			index++;
		}

	}

	public void enterAndVerifyInvalidOfficeCode() {

		getNFKHomepageMoreMenuAddOfficeCodeBtn().waitForPresent();
		getNFKHomepageMoreMenuAddOfficeCodeBtn().click();
		Reporter.logWithScreenShot("Page to add office code is displayed", MessageTypes.Pass);
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").sendKeys("A");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("2").sendKeys("B");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("3").sendKeys("C");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("4").sendKeys("D");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("5").sendKeys("E");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("6").sendKeys("F");
		getNFKHomepageMoreMenuConnectionsSearchBtn().waitForEnabled();
		getNFKHomepageMoreMenuConnectionsSearchBtn().click();
		Reporter.logWithScreenShot("After clicking search", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Office code is invalid and denied", MessageTypes.Pass);
	}

	public void incorrectClinicCodeFormat() {
		getNFKHomepageMoreMenuAddOfficeCodeBtn().waitForPresent();
		getNFKHomepageMoreMenuAddOfficeCodeBtn().click();
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").verifyPresent("Clinic code text box");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").sendKeys("1");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("2").sendKeys("2");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("3").sendKeys("3");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("4").sendKeys("4");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("5").sendKeys("5");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("6").sendKeys("6");

		WebDriverTestCase.verifyTrue(
				!getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").getAttribute("value").contains("1"),
				"Able to enter numeric value", "Numeric value not allowed");

	}

	public void clickHelpOption() {

		LFSUtilsAndroid.click(getNFKhomepagemoremenuhelpbtn());
		Reporter.logWithScreenShot("User clicked on Help Option", MessageTypes.Pass);

	}

	// Method to click on logout button on more menu screen
	public void clickOnLogoutBtn() {
		getNFKhomepagemoremenulogoutbtn().waitForPresent();
		getNFKhomepagemoremenulogoutbtn().click();
		Reporter.logWithScreenShot("The user has clicked on Logout button", MessageTypes.Pass);
	}

	public void verifyAddedReminder() {
		try {
			String remindecription = ConfigurationManager.getBundle().getProperty("set.reminder.description")
					.toString();
			getNFKMoreMenuMyRemindersPageSaveDateTimeLbl().verifyPresent("Date and Time label is displayed");
			getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("reminder.types.daily"))
					.verifyPresent("Repeat Type");
			WebDriverTestCase.verifyTrue(getNFKMoremenuPageReminderDescriptionTxt().getText().equals(remindecription),
					"Description is incorrect", "Description is Correct");
			Reporter.logWithScreenShot("User verified the added Reminder", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify the added reminders", MessageTypes.Fail);
		}
	}

	public void ClickSaveBtn() {
		try {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageSaveRemindersBtn());
			Reporter.logWithScreenShot("sucessfully clicked on save btn", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on save btn", MessageTypes.Fail);
		}
	}

	public void verifySetReminderScreen(String reminderType) {
		try {
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("more.reminder.setReminder")).waitForPresent();
			getNFKMoreMenuReminderspageRememberBtn().verifyPresent("Set reminder title");
			WebDriverTestCase.verifyTrue(getNFKMoreMenuReminderspageStaticTextBtn(reminderType).isPresent(),
					"Reminder name incorrect", "Reminder name title correct");
			getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("more.reminder.date"))
					.verifyPresent("Date and time");
			getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("more.reminder.repeat"))
					.verifyPresent("Reminder repeat");
			Reporter.logWithScreenShot("sucessfully verified set reminder screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify set reminder screen", MessageTypes.Fail);
		}
	}

	public void clickOnAddicon() {
		try {
			getNFKMoreMenuReminderspageRemindersLbl().waitForPresent();
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageAddRemindersBtn());
			Reporter.logWithScreenShot("sucessfully clicked on add icon", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on add icon", MessageTypes.Fail);
		}
	}

	public void clickOnReminderFromMoreMenu() {
		try {
			LFSUtilsAndroid.click(getNFKhomepagemoremenuremindersbtn());
			Reporter.logWithScreenShot("User is on Reminder Page", MessageTypes.Pass);

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on reminder option from moremenu", MessageTypes.Fail);
		}
	}

	public void screenShotsForAllReminders() {

	}

	public void setRepeatPicker() {
		try {
			String remindertype = ConfigurationManager.getBundle().getString("reminder.types.daily");

			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.types.daily")));
			ConfigurationManager.getBundle().setProperty("last.added.reminder.types", remindertype);
			Reporter.logWithScreenShot("sucessfully set repate pick value", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to set repate picker value", MessageTypes.Fail);
		}
	}

	public void setWeeklyRepeatPicker() {
		try {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.types.weekly")));
			Reporter.logWithScreenShot("sucessfully set weekly repate value", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to set weekly repate value", MessageTypes.Fail);
		}
	}

	public void setMonthlyRepeatPicker() {
		try {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.types.monthly")));
			Reporter.logWithScreenShot("sucessfully set monthly repate value", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to set monthly repate value", MessageTypes.Fail);
		}
	}

	public void setYearlyRepeatPicker() {
		try {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.types.anually")));
			Reporter.logWithScreenShot("sucessfully set yearly repate value", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to set yearly repate value", MessageTypes.Fail);
		}
	}

	public void addNewReminderType() {
		String text = "New remidnerType";
		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getNFKMoreMenuReminderspageAddRemindersBtn().sendKeys(text);
		ClickSaveBtn();
		getNFKMoreMenuReminderspageStaticTextBtn(text);
		WebDriverTestCase.verifyTrue(getNFKMoreMenuReminderspageStaticTextBtn(text).isPresent(),
				"Added new reminder not saved", "Added new reminder type");

	}

	public void verifyAddRminderTypeScreen() {
		try {
			getNFKMoreMenuReminderspageAddRemindersBtn().verifyPresent("New Reminder text field is present");
			getNFKMoreMenuReminderspageSaveRemindersBtn().verifyPresent("Save Button is present");
			Reporter.logWithScreenShot("sucessfully verified add reminder screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify add reminder screen", MessageTypes.Fail);
		}
	}

	public void clickOnNewReminderBtn() {

		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageNewReminderBtn());
		Reporter.logWithScreenShot("After Clicking New Reminder button", MessageTypes.Pass);
	}

	public void verifyRemindersScreen() {
		getNFKMoreMenuReminderspageRemindersLbl().waitForPresent();
		getNFKMoreMenuReminderspageAddRemindersBtn().verifyPresent("Add icon");
		Reporter.logWithScreenShot("add Reminder screen icon successfully verified", MessageTypes.Pass);
	}

	public void verifyReminderScreens() {
		clickOnReminderFromMoreMenu();
		verifyRemindersScreen();
		clickOnAddicon();
		verifyChooseReminderScreen();
		getNFKMoreMenuReminderspageNewReminderBtn().waitForPresent();
		getNFKMoreMenuReminderspageNewReminderBtn().verifyPresent("New Reminder");
		clickOnNewReminderBtn();
		addNewReminder();
		WebDriverTestCase.verifyTrue(
				getNFKMoreMenuReminderspageStaticTextBtn(
						getNFKMoremenuMyreminderspageNewreminderSavedreminderLbl().getText()).isPresent(),
				"not verified the added reminder", "Verified Added new reminder type");
		Reporter.logWithScreenShot("Reminders screen", MessageTypes.Pass);
	}

	private void addNewReminder() {

		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		String text = "Adding new reminder of Sensor expiration";
		verifyAddRminderTypeScreen();
		LFSUtilsAndroid.enterText(getNFKMoremenuMyreminderspageAddreminderName(), "Check the Sensor expiration");
		Reporter.logWithScreenShot("User added the Reminder name", MessageTypes.Pass);
		LFSUtilsAndroid.enterText(getNFKMoremenuPageReminderDescriptionTxt(), text);

		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageSelectedDateTimeBtn());
		eventlogPageAndroid.selectFutureDate();
		if (getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("appCommon.ok")));
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("appCommon.ok")));
		}

		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageSelectRepeatOptionBtn());
		setRepeatPicker();
		Reporter.logWithScreenShot("User added the details of new reminder", MessageTypes.Pass);
		ClickSaveBtn();
	}

	public void verifyChooseReminderScreen() {
		try {
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.eat.snack"))
					.verifyPresent("Eat a Snack");
			getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("reminder.preset.eat"))
					.verifyPresent("Eat");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.activity")).verifyPresent("Activity");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.buy.sensor"))
					.verifyPresent("Order Sensors");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.take.medication"))
					.verifyPresent("Take Medication");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.refill.medication"))
					.verifyPresent("Refill Medication");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.glucagon.expiration"))
					.verifyPresent("Glucagon Expiration Reminder");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.strip.expiration"))
					.verifyPresent("Test Strip Expiration Reminder");
			getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("reminder.preset.schedule.appointment"))
					.verifyPresent("Schedule Doctor Appointment");
			getNFKMoreMenuReminderspageNewReminderBtn().verifyPresent("New Reminder button is present");
			Reporter.logWithScreenShot("sucessfully verified choose reminder screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify choose reminder screen", MessageTypes.Fail);
		}
	}

	public void setReminder(String reminderDetail) {

		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();

		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(reminderDetail));
		/*
		 * try { if (getNFKMoreMenuReminderspageStaticTextBtn(
		 * ConfigurationManager.getBundle().getString("appCommon.ok")) .isDisplayed()) {
		 * getNFKMoreMenuReminderspageStaticTextBtn(
		 * ConfigurationManager.getBundle().getString("appCommon.ok")) .click(); } }
		 * catch (Exception e) { Reporter.logWithScreenShot("Ok button not clicked",
		 * MessageTypes.Pass); }
		 */
		verifySetReminderScreen(reminderDetail);
		enterDecription();
		getNFKMoreMenuReminderspageSelectedDateTimeBtn().isPresent();
		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageSelectedDateTimeBtn());
		eventlogPageAndroid.selectFutureDate();
		if (getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {

			getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.click();
			getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.click();
		}
		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageSelectRepeatOptionBtn());
		setRepeatPicker();
		ClickSaveBtn();
		Reporter.logWithScreenShot("Reminder Saved", MessageTypes.Pass);
//		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(reminderDetail));
//		verifyAddedReminder();
//		LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.delete")));
//		Reporter.logWithScreenShot("Delete Popup is displayed", MessageTypes.Pass);
//		LFSUtilsAndroid.click(getNFKMoreMenuPageReminderDeletePopUpDeleteBtn());
//		Reporter.logWithScreenShot("Reminder is deleted successfully", MessageTypes.Pass);
	}

	// added multiple remainders on connection screen
	public void addmultipleRemainders(int times, String reminderName, String date, String flag) {
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();

		clickOnReminderFromMoreMenu();
		for (int i = 0; i < times; i++) {
			// LogbookPageAndroid logBookPage = new LogbookPageAndroid();
			clickOnAddicon();
			createNewReminder(reminderName);
			clickDateOfSetReminder();
			// eventlogPageAndroid.selectFutureDate();
			addReminderDetails(date, flag);
			LFSUtilsAndroid.swipePage();
		}
	}

	public void addReminderDetails(String date, String flag) {
		MoreMenuPageAndroid moreMenu = new MoreMenuPageAndroid();

		int dateAdd = Integer.parseInt(date);
		LocalDate todaysDate = LocalDate.now();
		todaysDate = todaysDate.plusDays(dateAdd);

		String dayOfWeek = todaysDate.getDayOfWeek().toString();
		dayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();

		String currentmonthValue = todaysDate.getMonth().toString();
		currentmonthValue = currentmonthValue.substring(0, 1)
				+ currentmonthValue.substring(1, currentmonthValue.length()).toLowerCase();

		int calDate = todaysDate.getDayOfMonth();
		String dateModified = Integer.toString(calDate);

		if (calDate <= 9) {
			dateModified = String.format("%02d", calDate);
		}

		String todayDate = dateModified + " " + currentmonthValue + " " + todaysDate.getYear();

		LFSUtilsAndroid.click(getNFKTimeStaticText(todayDate));

		clickOK();

		LFSUtilsAndroid.click(getNFKAddeventTimeselectHourTxt());
		String hourValue = getNFKAddeventTimeselectHourTxt().getText();
		int hrValue = Integer.parseInt(hourValue);

		LFSUtilsAndroid.click(getNFKAddeventTimeselectMinuteTxt());
		String minuteValue = getNFKAddeventTimeselectMinuteTxt().getText();
		int minValue = Integer.parseInt(minuteValue);

		LFSUtilsAndroid.click(getNFKAddeventTimeselectHourTxt());

		minValue = minValue + 3;

		if (minValue > 60) {
			minValue = minValue - 60;
		}

		minValue = new ConsoleUtils().getMinuteValue(minValue);

		if (minValue == 0) {
			++hrValue;
		}

		if (hrValue >= 13) {
			hrValue = hrValue % 12;
		}

		hourValue = Integer.toString(hrValue);
		minuteValue = Integer.toString(minValue);
		Actions action = new Actions(driver);
		LFSUtilsAndroid.click(getNFKAddeventTimeselectHourTxt());
		action.sendKeys(hourValue).perform();
//		LFSUtilsAndroid.enterText(getNFKAddeventTimeselectHourTxt(),hourValue);
		// getNFKMoreMenuReminderspageStaticTextBtn(hourValue).click();
		LFSUtilsAndroid.click(getNFKAddeventTimeselectMinuteTxt());

		action.sendKeys(minuteValue).perform();
		// LFSUtilsAndroid.enterText(getNFKAddeventTimeselectMinuteTxt(),minuteValue);

		// getNFKMoreMenuReminderspageStaticTextBtn(minuteValue).click();

		clickOK();

		if (flag.equalsIgnoreCase("Daily")) {
			LFSUtilsAndroid.click(moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn());
			moreMenu.setRepeatPicker();
			moreMenu.ClickSaveBtn();

		} else if (flag.equalsIgnoreCase("Weekly")) {
			LFSUtilsAndroid.click(moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn());
			moreMenu.setWeeklyRepeatPicker();
			moreMenu.ClickSaveBtn();

		} else if (flag.equalsIgnoreCase("Monthly")) {
			LFSUtilsAndroid.click(moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn());
			moreMenu.setMonthlyRepeatPicker();
			moreMenu.ClickSaveBtn();

		} else if (flag.equalsIgnoreCase("Annually")) {
			LFSUtilsAndroid.click(moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn());
			moreMenu.setYearlyRepeatPicker();
			moreMenu.ClickSaveBtn();

		}
	}

	private void clickOK() {
		try {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					ConfigurationManager.getBundle().getString("appCommon.ok")));
			Reporter.logWithScreenShot("Successfully clicked on Ok Btn", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to on OK btn", MessageTypes.Fail);
		}
	}

	public void enterDecription() {
		try {
			String rem = "Setting the reminder";
			LFSUtilsAndroid.enterText(getNFKMoremenuPageReminderDescriptionTxt(), rem);
			ConfigurationManager.getBundle().setProperty("set.reminder.description", rem);
			Reporter.logWithScreenShot("User entered the description on set reminder screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to enter description on set reminder screen", MessageTypes.Fail);
		}

	}

	// Method To Open Account Page
	public void clickMyAccount() {
		LFSUtilsAndroid.click(getNFKhomepagemoremenuaccountbtn());
		Reporter.logWithScreenShot("User clicked on My Account option", MessageTypes.Pass);
	}

	// Method to verify reminder type field maximum length
	public void verifyReminderTypeFieldMaxLength() {
		getNFKMoreMenuReminderspageRemindersLbl().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(36);
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getNFKMoreMenuReminderspageAddRemindersBtn().clear();
		getNFKMoreMenuReminderspageAddRemindersBtn().sendKeys(typeName);
		Validator.verifyThat("Reminder type length",
				getNFKMoreMenuReminderspageAddRemindersBtn().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(35));
	}

	// Method to check walgreen user
	public void verifyWalgreenUserSwitch() {
		getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("For walgreen user walgreen switch is enabled", MessageTypes.Pass);
	}

	// Method to verify reminder
	public void verifydescriptionLengthAndReminderTimePast() {
		getNFKMoreMenuReminderspageRemindersLbl().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(61);
		clickOnAddicon();
		getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("reminder.preset.perform.glucose.test"))
				.click();
		try {
			getNFKMoreMenuReminderspageStaticTextBtn("Allow").waitForPresent(5000);
			if (getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.isPresent()) {
				getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.click();
			} else if (getNFKMoreMenuReminderspageStaticTextBtn("Allow").isPresent()) {
				getNFKMoreMenuReminderspageStaticTextBtn("Allow").click();

			}
		} catch (Exception e) {
		}
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		getNFKMoreMenuReminderspageEnterDescriptionTxt().waitForPresent();
		getNFKMoreMenuReminderspageEnterDescriptionTxt().clear();
		getNFKMoreMenuReminderspageEnterDescriptionTxt().sendKeys(typeName);
		Validator.verifyThat("Reminder description max allowed charcter",
				getNFKMoreMenuReminderspageEnterDescriptionTxt().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(60));

		getNFKMoreMenuReminderspageSelectedDateTimeBtn().click();
		eventlogPageAndroid.getNFKEventLogEditglucoseDatepopupDateTxt().waitForPresent();
		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate()) - 1;
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : eventlogPageAndroid.getNFKEventLogEditglucoseDatepopupDatesvalueTxt()) {
			if (LFSUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("Selected date", MessageTypes.Pass);

	}

	public void reminderscreens() {
		getNFKMoreMenuReminderspageAddRemindersBtn().waitForPresent();
		Reporter.logWithScreenShot("reminder screen1", MessageTypes.Pass);
		getNFKMoreMenuReminderspageAddRemindersBtn().click();
		Reporter.logWithScreenShot("reminder screen2", MessageTypes.Pass);
		clickOnNewReminderBtn();
		Reporter.logWithScreenShot("reminder screen3", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		getNFKHomepageMoremenuRemindersBgtestTempBtm().click();
		String ok = LFSUtilsAndroid.getPropString("appCommon.ok");
		try {
			getNFKMoreMenuReminderspageStaticTextBtn(ok).waitForPresent(5000);
			if (getNFKMoreMenuReminderspageStaticTextBtn(ok).isPresent()) {
				getNFKMoreMenuReminderspageStaticTextBtn(ok).click();
			} else if (getNFKMoreMenuReminderspageStaticTextBtn("Allow").isPresent()) {
				getNFKMoreMenuReminderspageStaticTextBtn("Allow").click();

			}
		} catch (Exception e) {
		}
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		getNFKMoreMenuReminderspageSelectedDateTimeBtn().click();
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify setting screen
	public void mySettingScreen() {
		Reporter.logWithScreenShot("Setting screen", MessageTypes.Pass);
	}

	public void otherCountryClinicCode() {
		getNFKHomepageMoreMenuAddOfficeCodeBtn().click();
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("1").sendKeys("P");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("2").sendKeys("A");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("3").sendKeys("Y");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("4").sendKeys("C");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("5").sendKeys("W");
		getNFKHomepageMoremenuConnectionsOfficeCodeTxt("6").sendKeys("Y");
		getNFKHomepageMoreMenuConnectionsSearchBtn().waitForEnabled();
		getNFKHomepageMoreMenuConnectionsSearchBtn().click();
		getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("office.code.not.found"))
				.verifyPresent("Office code error message");
	}

	public void verifyWalgreenUserSwitchOff() {
		MyMeters myMeters = new MyMeters();
		getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("For walgreen user walgreen switch is enabled", MessageTypes.Pass);
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();
			myMeters.getNFKMymeterpagePairmeterPopupCancelBtn().waitForPresent();
			Reporter.logWithScreenShot("disable Walgreen confirmation popup is displayed", MessageTypes.Pass);
			myMeters.getNFKMymeterpagePairmeterPopupCancelBtn().click();
			if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("true"))
				Reporter.logWithScreenShot("walgreen switch is enabled when clicked on Cancel button",
						MessageTypes.Pass);
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();
			myMeters.getNFKMymeterpagePairmeterPopupCancelBtn().waitForPresent();
			getNFKMoreMenuPageReminderDeletePopUpDeleteBtn().click();
			if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("walgreen switch is disabled when clicked on ok button", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Walgreen switch is already unchecked", MessageTypes.Pass);

	}

	public void addNonwalgreenUserToWalgreen(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		uncheckWalgreenSwitch();
		getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();

		getNFKMoreMenuPageReminderDeletePopUpDeleteBtn().waitForPresent();
		getNFKMoreMenuPageReminderDeletePopUpDeleteBtn().click();
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		androidDriver.context("WEBVIEW");
		if (getNFKWalgreenpageIagreeChkbx().isPresent()) {

			Reporter.logWithScreenShot("Terms of Use disclaimer Page is displayed", MessageTypes.Pass);
			getNFKWalgreenpageIagreeChkbx().click();
		}

		getNFKWalgreenpageUsernameTxtfld().waitForPresent();
		getNFKWalgreenpageUsernameTxtfld().sendKeys(userBean.getUsername());
		getNFKWalgreenpagePasswordTxtfld().sendKeys(userBean.getPassword());
		getNFKWalgreenpageSigninBtn().click();
		getNFKWalgreenpageAutologinYesBtn().waitForPresent();
		getNFKWalgreenpageAutologinYesBtn().click();
		getNFKWalgreenpageFinishloginBtn().waitForPresent();
		getNFKWalgreenpageFinishloginBtn().click();
		getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("Non walgreen user is able to get connect to walgreen successfully",
					MessageTypes.Pass);

	}

	public void verifyToggleButton() {
		clickOnReminderFromMoreMenu();
		if (getNFKMoremenuSyncreminderLbl().isDisplayed())
			getNFKMoremenuSyncreminderToggleBtn().verifyPresent("Toggle button is present");
		else
			Reporter.logWithScreenShot("Toggle button is not present", MessageTypes.Pass);
	}

	public void verifyToggleButtonDisabled() {
		getNFKMoremenuSyncreminderToggleBtn().verifyDisabled("Toggle button is in disabled state");
	}

	public void verifyToggleButtonON() {
		clickOnReminderFromMoreMenu();
		if (getNFKMoremenuSyncreminderToggleBtn().getAttribute("text").equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Toggle button switch is ON", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Toggle button switch is OFF", MessageTypes.Pass);
			getNFKMoremenuSyncreminderToggleBtn().click();
			Reporter.logWithScreenShot("Toggle button switch is ON", MessageTypes.Pass);
		}
	}

	public void verifyWlagreenEnablePopUp() {
		getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		uncheckWalgreenSwitch();
		String important = LFSUtilsIOS.getPropString("alerts.attention.title");
		String enableNow = LFSUtilsIOS.getPropString("appCommon.enableNow");
		getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Logged-in user is already associated with Walgreen", MessageTypes.Pass);
		} else if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("false")) {
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();
			getNFKMoreMenuReminderspageStaticTextBtn(important).waitForPresent();
			Reporter.logWithScreenShot("Enable Walgreen for new user popup is displayed", MessageTypes.Pass);
			getNFKMoremenuConnectionsCancelBtn().click();
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
			if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("true")) {
				Reporter.logWithScreenShot("Application did not canceled the subscription process", MessageTypes.Pass);
			} else if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("false")) {
				Reporter.logWithScreenShot("Application canceled the subscription process", MessageTypes.Pass);
			}
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();
			LFSUtilsAndroid.waitforLoad();

			LFSUtilsAndroid jnjAndroid = new LFSUtilsAndroid();
			Set<String> dr = jnjAndroid.getDriver().getContextHandles();
			Iterator<String> It = dr.iterator();

			String winHandle1 = It.next();
			String winHandle2 = It.next();
			String winHandle3 = winHandle1;
			if (!getNFKMoremenuConnectionsPopupTouLink().isPresent()) {
				if (It.hasNext()) {
					winHandle3 = It.next();
					jnjAndroid.getDriver().context(winHandle3);
				}

			}
			getNFKMoremenuConnectionsPopupTouLink().verifyPresent("Terms of Use Link on Popup is present");
			getNFKMoremenuConnectionsPopupPpLink().verifyPresent("Privacy Policy Link on Popup is present");
			try {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", getNFKMoremenuConnectionsPopupTouLink());
			} catch (Exception e) {
				getNFKMoremenuConnectionsPopupTouLink().click();
			}
			if (!winHandle1.equals(winHandle3)) {

				winHandle3 = winHandle1;
				jnjAndroid.getDriver().context(winHandle3);
			}
		}

		getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("termsAndCond.title"))
				.waitForPresent();
		Reporter.logWithScreenShot("Terms of Use page is displayed", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid jnjAndroid = new LFSUtilsAndroid();
		Set<String> dr = jnjAndroid.getDriver().getContextHandles();
		Iterator<String> It = dr.iterator();

		String winHandle1 = It.next();
		String winHandle2 = It.next();
		String winHandle3 = winHandle1;
		if (!getNFKMoremenuConnectionsPopupTouLink().isPresent()) {
			if (It.hasNext()) {
				winHandle3 = It.next();
				jnjAndroid.getDriver().context(winHandle3);
			}

		}
		getNFKMoremenuConnectionsPopupPpLink().click();
		if (!winHandle1.equals(winHandle3)) {

			winHandle3 = winHandle1;
			jnjAndroid.getDriver().context(winHandle3);
		}
		getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("settings.privacypolicy"))
				.waitForPresent();
		Reporter.logWithScreenShot("Privacy Policy page is displayed", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();

	}

	public void uncheckWalgreenSwitch() {
		if (getNFKHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("walgreen check box checked", MessageTypes.Pass);
			getNFKHomepageMoremenuConnectionsWalgreenChkbx().click();
			getNFKMoremenuConnectionsPopupImportantAlertText().waitForPresent();
			getNFKMoremenuConnectionsPopupOkBtn().click();
		}

	}

	public void verifyAddPlusBtnInformation() {

		if (getNFKMoreMenuReminderspageNoRemindersLbl().isDisplayed()) {
			if (getNFKMoreMenuReminderspageNoRemindersLbl().getText()
					.equalsIgnoreCase("Tap the + button in the upper right hand corner to set a reminder.")) {
				Reporter.logWithScreenShot("Add plus button display information available on page as per requirement",
						MessageTypes.Pass);
				LFSUtilsAndroid.waitforLoad();
			} else {
				Reporter.logWithScreenShot(
						"Add plus button display information not available on page as per requirement",
						MessageTypes.Fail);
			}
		}
	}

	public void verifyAddPlusBtnOnMyRemindersPage() {

		if (getNFKMoreMenuReminderspageAddRemindersBtn().isDisplayed()) {
			Reporter.logWithScreenShot("Add Plus button for reminders present as per requirement", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Add Plus button for reminders not present as per requirement",
					MessageTypes.Fail);
		}
	}

	public void verifyNavigationToChooseReminder() {
		if (getNFKHomepageMoremenuTermsofUsePageLbl().verifyPresent("Choose Reminder")) {
			Reporter.logWithScreenShot("Choose Reminder heading present", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Choose Reminder heading not present", MessageTypes.Fail);
		}
	}

	public void verifyNavigationToSetReminder() {
		if (getNFKHomepageMoremenuTermsofUsePageLbl().verifyPresent("Set Reminder")) {
			Reporter.logWithScreenShot("Set Reminder heading present", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Set Reminder heading not present", MessageTypes.Fail);
		}
	}

	public void verifyListOfReminder(Object reminderName) {
		ReminderDetailsBeans reminderBean = new ReminderDetailsBeans();

		if (reminderName instanceof String) {

			reminderBean.fillFromConfig((String) reminderName);
		} else {
			reminderBean.fillData(reminderName);
		}

		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Perform a glucose test");
		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Eat a snack");
		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Eat");
		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Activity");
		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Buy strips");
		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Bolus");
		getNFKMoreMenuReminderspageStaticTextBtn(reminderBean.getGlucose()).verifyPresent("Take medication");

		if (getNFKMoreMenuReminderspageNewReminderBtn().isDisplayed()) {
			Reporter.logWithScreenShot("New Reminder button present on Choose Reminder page", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("New Reminder button not present on Choose Reminder page", MessageTypes.Fail);
		}
	}

	public void verifySetReminderPageDetails(String reminderName) {

		if (getNFKMoreMenuReminderspageSaveRemindersBtn().isPresent()) {
			Reporter.logWithScreenShot("Save button present on Set Reminder page", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Save button not present on Set Reminder page", MessageTypes.Fail);
		}

		getNFKMoreMenuReminderspageRememberBtn().verifyPresent(reminderName);

		if (getNFKMoreMenuReminderspageEnterDescriptionTxt().getText().equals("Enter description"))
			Reporter.logWithScreenShot("Enter description text box present with default text", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Enter description text box not present with default text", MessageTypes.Fail);

		getNFKMoreMenuReminderspageSelectedDateTimeBtn().verifyPresent(new ConsoleUtils().getDateTime("MMM dd, yyyy"));
		getNFKMoreMenuReminderspageSelectRepeatOptionBtn().verifyPresent("Never");

	}

	public void createNewReminder(String reminderName) {
		if (getNFKMoreMenuReminderspageStaticTextBtn(reminderName).isPresent()) {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(reminderName));

			Reporter.logWithScreenShot("New selected reminder name clicked", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("New selected reminder name not present", MessageTypes.Fail);
		}

	}

	public void clickDateOfSetReminder() {

		if (getNFKMoreMenuReminderspageSelectedDateTimeBtn().isPresent()) {
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageSelectedDateTimeBtn());

			Reporter.logWithScreenShot("Date and time popup opened", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Date and time not button not present", MessageTypes.Fail);
		}
	}

	public void verifySetReminderByUser(String reminderName) {

		LFSUtilsAndroid.waitforLoad();

		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		getOtMoreMenuMyReminderspageReminderPopupheadingLbl().waitForPresent(120000);

		if (getOtMoreMenuMyReminderspageReminderPopupheadingLbl().isDisplayed()) {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder popup screen displayed", MessageTypes.Pass);

			if (getNFKMoreMenuReminderspageReminderPopupTitleTxt().isDisplayed()) {
				LFSUtilsAndroid.waitforLoad();
				Reporter.logWithScreenShot("Reminder title displayed on popup screen", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Reminder title popup not displayed", MessageTypes.Pass);
			}

			getNFKMoreMenuReminderspageReminderPopUpOkBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder popup closed", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Reminder popup screen not displayed", MessageTypes.Fail);
		}
	}

	public void verifyReminderPopUp(String reminderName) {

		if (getNFKMoreMenuReminderspageStaticTextBtn(reminderName).verifyNotPresent("Perform a glucose test")) {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder details not present on Reminders Page", MessageTypes.Pass);
		} else {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder details present on Reminders Page", MessageTypes.Fail);
		}

	}

	public void verifyReminderPopUpPresent(String reminderName) {

		if (getNFKMoreMenuReminderspageStaticTextBtn(reminderName).verifyPresent("Perform a glucose test")) {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder details present on Reminders Page", MessageTypes.Pass);
		} else {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder details not present on Reminders Page", MessageTypes.Fail);
		}
	}

	public void verifyAddedClinic() {
		if (getNFKHomepageMoreMenuConnectionsAddedConnectionStatus().getAttribute("text").equalsIgnoreCase("Connected"))
			Reporter.logWithScreenShot("Connection is added", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Connection is not added", MessageTypes.Pass);
	}

	// verify added office on connection screen
	public void verifyAddedOfficeName(Object userDetails) {
		try {
			UserDetailBeans userBean = new UserDetailBeans();
			if (userDetails instanceof String) {

				userBean.fillFromConfig((String) userDetails);
			} else {
				userBean.fillData(userDetails);
			}

			WebDriverTestCase.verifyTrue(
					getNFKHomepageMoremenuConnectionsOfficenameLbl().getText().contains(userBean.getOfficName()),
					"Incorrect clinic name", "Correct clinic name");
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("office.code.withdraw"))
					.assertPresent("Request Link");
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("office.code.pending"))
					.assertPresent("Request submitted");
			Reporter.logWithScreenShot("sucessfully verified added office name", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify added office name", MessageTypes.Fail);
		}
	}

	public void clickMyAlerts() {
		LFSUtilsAndroid.click(getNFKMoremenuAlertBtn());
		Reporter.logWithScreenShot("User clicked on Alerts menu", MessageTypes.Pass);
	}

	public void clickOnShareMenu() {
		getNFKMoremenuShareBtn().verifyPresent("Share Button");
		LFSUtilsAndroid.click(getNFKMoremenuShareBtn());
		Reporter.logWithScreenShot("User clicked on Share menu", MessageTypes.Pass);
	}

	public void verifyListofremainders() {

		try {
			int listremainders = getNFKmoremenureminderspageremindertitlelist().size();
			for (int i = 0; i <= listremainders - 1; i++) {
				// String remainders=
				Reporter.log(
						"displayed reminders: "
								+ getNFKmoremenureminderspageremindertitlelist().get(i).getText().toString(),
						MessageTypes.Pass);
				LFSUtilsAndroid.swipePage();
			}
		} catch (Exception e) {

		}
	}

	public void verifyMaximumReminderPopup() {
		clickOnAddicon();
		getNFKHomepageMoremenuPopupTitle().isPresent();
		getNFKHomepageMoremenuMessageTxt().getText().equals(LFSUtilsAndroid.getPropString("reminder.max.popup"));
		Reporter.logWithScreenShot("Maximum Reminders reached popup", MessageTypes.Pass);
		getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isPresent();
		getNFKMoreMenuReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();

	}

	public void verifyConnectedStatus() {
		try {
			getNFKMoremenuConnectionsClinicnameLbl().assertPresent("Clinic name");
			getNFKMoremenuConnectionsRequestsubmitLbl().assertPresent("Physician's last and first name");
			getNFKMoremenuConnectionsClinicphonoLbl().assertPresent("Call Button");
			getNFKMoremenuConnectionsClinicConnected().isPresent();
			Reporter.logWithScreenShot("Verified the Connected Status", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify connected devices", MessageTypes.Fail);
		}
	}

	public void verifyPopup(String option) {
		switch (option) {
		case "Stop Sharing Data":
			clickOnClinicPhoneno();
			getNFKMoremenuConnectionsCallpopupMessage().getText()
					.equals(LFSUtilsAndroid.getPropString("office.code.disconnect"));
			getNFKMoremenuConnectionsCallpopupTitle().assertPresent("Stop Sharing Pop-up");
			getNFKMoremenuConnectionsCancelBtn1().isPresent();
			getNFKMoremenuConnectionsCallBtn().isPresent();
			LFSUtilsAndroid.click(getNFKMoremenuConnectionsCancelBtn1());
			clickOnClinicPhoneno();
			clickOnCallBtn();
			Reporter.logWithScreenShot("User has clicked on Call Button", MessageTypes.Pass);
			break;

		case "Declined Request":
			clickOnRemove();
			getNFKMoremenuConnectionsCallpopupMessage().getText()
					.equals(LFSUtilsAndroid.getPropString("office.code.declined.message"));
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("office.code.call")).isPresent();
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("appCommon.cancel").toUpperCase())
					.isPresent();
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("office.code.delete").toUpperCase())
					.isPresent();
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					LFSUtilsAndroid.getPropString("appCommon.cancel").toUpperCase()));
			clickOnRemove();
			Reporter.logWithScreenShot("User see declined request", MessageTypes.Pass);
			break;
		case "Withdraw Request":
			clickOnRemove();
			getNFKMoremenuConnectionsCallpopupMessage().getText()
					.equals(LFSUtilsAndroid.getPropString("office.code.withdraw.message"));
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("appCommon.yes").toUpperCase())
					.isPresent();
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("appCommon.no").toUpperCase())
					.isPresent();
			LFSUtilsAndroid.click(getNFKMoreMenuReminderspageStaticTextBtn(
					LFSUtilsAndroid.getPropString("appCommon.no").toUpperCase()));
			Reporter.logWithScreenShot("User see withdraw request", MessageTypes.Pass);
			break;
		}

	}

	private void clickOnRemove() {
		try {

			LFSUtilsAndroid.click(getNFKMoremenuConnectionsWithdrawreqLbl());
			Reporter.logWithScreenShot("sucessfully clicked on remove", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on remove", MessageTypes.Fail);
		}
	}

	private void clickOnClinicPhoneno() {
		try {
			LFSUtilsAndroid.click(getNFKMoremenuConnectionsClinicphonoLbl());
			Reporter.logWithScreenShot("sucessfully clicked on clinic phone no", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on clinic phone no", MessageTypes.Fail);
		}
	}

	private void clickOnCallBtn() {
		try {

			LFSUtilsAndroid.click(getNFKMoremenuConnectionsCallBtn());
			Reporter.logWithScreenShot("sucessfully clicked on call btn", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on call btn", MessageTypes.Fail);
		}
	}

	public void verifydeclinedStatus() {
		try {
			getNFKMoremenuConnectionsClinicnameLbl().assertPresent("Clinic name");
			getNFKMoremenuConnectionsRequestsubmitLbl().getText()
					.equals(LFSUtilsAndroid.getPropString("office.code.declined"));
			getNFKMoremenuConnectionsWithdrawreqLbl().getText()
					.equals(LFSUtilsAndroid.getPropString("office.code.delete"));
			Reporter.logWithScreenShot("Verified the declined status", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify declined status", MessageTypes.Fail);
		}
	}

	public void clickOnOrderSupplies() {
		LFSUtilsAndroid.swipePage();
		getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("order.suplies"))
				.assertPresent("Order supplies");
		getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("order.suplies")).click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has Clicked on Order Supplies and Browser displayed", MessageTypes.Pass);

	}

	@FindBy(locator = "NFK.Moremenu.Account.optin.checkbox")
	private QAFWebElement NFKMoremenuAccountoptincheckbox;
	@FindBy(locator = "NFK.Moremenu.Account.optin.title")
	private QAFWebElement NFKMoremenuAccountoptintitle;
	@FindBy(locator = "NFK.Moremenu.Account.optin.cancel.btn")
	private QAFWebElement NFKMoremenuAccountoptincancelbtn;
	@FindBy(locator = "NFK.Moremenu.Account.optin.agree.btn")
	private QAFWebElement NFKMoremenuAccountoptinagreebtn;

	public QAFWebElement getNFKMoremenuAccountoptincheckbox() {
		return NFKMoremenuAccountoptincheckbox;
	}

	public QAFWebElement getNFKMoremenuAccountoptintitle() {
		return NFKMoremenuAccountoptintitle;
	}

	public QAFWebElement getNFKMoremenuAccountoptincancelbtn() {
		return NFKMoremenuAccountoptincancelbtn;
	}

	public QAFWebElement getNFKMoremenuAccountoptinagreebtn() {
		return NFKMoremenuAccountoptinagreebtn;
	}

	public void clickOnOptincheckbox() {
		try {
			LFSUtilsAndroid.swipePage();
			getNFKMoremenuAccountoptincheckbox().isPresent();
			getNFKMoremenuAccountoptincheckbox().click();
			Reporter.logWithScreenShot("User successfully clicked on opt-in checkbox", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on opt-in checkbox", MessageTypes.Fail);
		}
	}

	public void verifyoptinscreen() {
		try {
			getNFKMoremenuAccountoptintitle().assertPresent("Opt In");
			getNFKMoremenuAccountoptincancelbtn().assertPresent("Cancel");
			getNFKMoremenuAccountoptinagreebtn().assertPresent("I Agree");
			getNFKMoreMenuReminderspageStaticTextBtn(LFSUtilsAndroid.getPropString("optin.text"))
					.assertPresent("You confirm that the information");
			Reporter.logWithScreenShot("User successfully verified opt-in screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify opt-in screen", MessageTypes.Fail);
		}
	}

	public void clickcanceloptin() {
		try {
			getNFKMoremenuAccountoptincancelbtn().click();
			clickOnOptincheckbox();
			Reporter.logWithScreenShot(
					"User successfully clicked on cancel, user is on account screen and again reselect optin checkbox",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on cancel and fail to select checkbox", MessageTypes.Fail);
		}
	}

	public void clickOnagreenandverifyoptincheckbox() {
		try {
			getNFKMoremenuAccountoptinagreebtn().click();
			getNFKMoremenuAccountoptincheckbox().isSelected();

			Reporter.logWithScreenShot(
					"User successfully clicked on agree button, user is on account screen and verified check box is selected",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on agree button and fail to verify checkbox selected or not",
					MessageTypes.Fail);
		}
	}

	public void userdeselectoptin() {
		try {
			LFSUtilsAndroid.uncheckCheckBox(getNFKMoremenuAccountoptincheckbox());
			Reporter.logWithScreenShot("User successfully de-select opt-in checkbox", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to de-select checkbox", MessageTypes.Fail);
		}
	}

	public void reselectandCancel() {
		try {
			clickOnOptincheckbox();
			getNFKMoremenuAccountoptincancelbtn().click();

			Reporter.logWithScreenShot(
					"User successfully reselect opt-in checkbox and use redirected to optin screen and clicked on cancel",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to reselect checkbox and click cancel", MessageTypes.Fail);
		}
	}
//Shubham 
//	Method to verify clicks on unpair sensor
	public void clickOnUnpairSensor() {
		LFSUtilsAndroid.click(getNFKMoremenuUnpairSensorBtn());
	}
//Shubham
//	Method to verify click on stop sensor
	public void ClickStopSensor() {
		try {
			if (getNFKMoremenuStopSensorBtn().isPresent()) {
				LFSUtilsAndroid.click(getNFKMoremenuStopSensorBtn());
				Reporter.logWithScreenShot("user clicked on Stop sensor button", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKMoremenuStopSensorPopop());
				Reporter.logWithScreenShot("user clicked on Stop sensor 1st popop", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKTimeStaticText("STOP SENSOR"));
				Reporter.logWithScreenShot("user clicked on Stop sensor 2nd popop", MessageTypes.Pass);
			}
		} catch (Exception e) {

		}
	}
}
