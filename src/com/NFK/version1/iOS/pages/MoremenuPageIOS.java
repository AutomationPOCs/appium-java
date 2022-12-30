package com.NFK.version1.iOS.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.ReminderDetailsBeans;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;

import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class MoremenuPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.moremenuPage.Settings.btn")
	private QAFWebElement NFKiosMoremenupageSettingsBtn;
	@FindBy(locator = "NFKios.moremenuPage.myMeter.btn")
	private QAFWebElement NFKiosMoremenupageMymeterBtn;
	@FindBy(locator = "NFKios.moremenuPage.myReminder.btn")
	private QAFWebElement NFKiosMoremenupageMyreminderBtn;
	@FindBy(locator = "NFKios.moremenuPage.myAccount.btn")
	private QAFWebElement NFKiosMoremenupageMyaccountBtn;
	@FindBy(locator = "NFKios.moremenuPage.help.btn")
	private QAFWebElement NFKiosMoremenupageHelpBtn;
	@FindBy(locator = "NFKios.moremenuPage.contactus.btn")
	private QAFWebElement NFKiosMoremenupageContactusBtn;
	@FindBy(locator = "NFKios.moremenuPage.logout.btn")
	private QAFWebElement NFKiosMoremenupageLogoutBtn;
	@FindBy(locator = "NFKios.moremenuPage.termsOfUse.btn")
	private QAFWebElement NFKiosMoremenupageTermsofuseBtn;
	@FindBy(locator = "NFKios.moremenuPage.privecyPolicy.btn")
	private QAFWebElement NFKiosMoremenupagePrivecypolicyBtn;
	@FindBy(locator = "NFKios.moremenuPage.termsofService.back.btn")
	private QAFWebElement NFKiosMoremenupageTermsofserviceBackBtn;
	@FindBy(locator = "NFKios.moremenuPage.contactUsTitle.lbl")
	private QAFWebElement NFKiosMoremenuPageContactUsTitleLbl;
	@FindBy(locator = "NFKios.moremenuPage.contactEmail.lbl")
	private QAFWebElement NFKiosMoremenuPageContactEmailLbl;
	@FindBy(locator = "NFKios.moremenuPage.contactNumber.lbl")
	private QAFWebElement NFKiosMoremenuPageContactNumberLbl;
	@FindBy(locator = "NFKios.moremenuPage.contactSite.lbl")
	private QAFWebElement NFKiosMoremenuPageContactSiteLbl;
	@FindBy(locator = "NFKios.moremenuPage.rateThisApp.lbl")
	private QAFWebElement NFKiosMoremenuPageRateThisAppLbl;
	@FindBy(locator = "NFKios.moremenuPage.myMeter.autoUpdateTime.lbl")
	private QAFWebElement NFKiosMoremenuMyMeterAutoUpdateTimeLbl;
	@FindBy(locator = "NFKios.moremenuPage.myMeter.autoUpdateTime.btn")
	private QAFWebElement NFKiosMoremenuMyMeterAutoUpdateTimeBtn;
	@FindBy(locator = "NFKios.moremenuPage.myMeter.pairMeter.btn")
	private QAFWebElement NFKiosMoremenuMyMeterPairMeterBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.back.btn")
	private QAFWebElement NFKiosMoremenuReminderBackBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.add.btn")
	private QAFWebElement NFKiosMoremenuReminderAddBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.chooseReminder.lbl")
	private QAFWebElement NFKiosMoremenupageReminderChooseReminderlbl;
	@FindBy(locator = "NFKios.moremenuPage.reminder.newReminder.btn")
	private QAFWebElement NFKiosMoremenupageReminderNewReminderBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.addReminder.lbl")
	private QAFWebElement NFKiosMoremenupageReminderAddReminderlbl;
	@FindBy(locator = "NFKios.moremenuPage.reminder.save.btn")
	private QAFWebElement NFKiosMoremenupageReminderSaveBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.setReminder.lbl")
	private QAFWebElement NFKiosMoremenupageReminderSetReminderlbl;
	@FindBy(locator = "NFKios.moremenuPage.reminder.reminderDescription.txt")
	private QAFWebElement NFKiosMoremenupageReminderReminderDescriptionTxt;
	@FindBy(locator = "NFKios.moremenuPage.reminder.datetime.btn")
	private QAFWebElement NFKiosMoremenupageReminderDateTimeBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.repeat.btn")
	private QAFWebElement NFKiosMoremenupageReminderRepeatBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.date.pkr")
	private QAFWebElement NFKiosMoremenupageReminderDatePicker;
	@FindBy(locator = "NFKios.moremenuPage.reminder.hour.pkr")
	private QAFWebElement NFKiosMoremenupageReminderHourPicker;
	@FindBy(locator = "NFKios.moremenuPage.reminder.minute.pkr")
	private QAFWebElement NFKiosMoremenupageReminderMinutePicker;
	@FindBy(locator = "NFKios.moremenuPage.reminder.saveTiming.lbl")
	private QAFWebElement NFKiosMoremenupageReminderSaveTiminglbl;
	@FindBy(locator = "NFKios.moremenuPage.reminder.repeat.pkr1")
	private QAFWebElement NFKiosMoremenupageReminderRepeatPicker;
	@FindBy(locator = "NFKios.moremenuPage.reminder.repeat.pkr")
	private List<QAFWebElement> NFKiosMoremenupageReminderRepeatPickerList;
	@FindBy(locator = "NFKios.moremenuPage.reminder.deteletPopUpDelete.btn")
	private QAFWebElement NFKiosMoremenupageReminderDeteletPopUpDeleteBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.addreminderBack.btn")
	private List<QAFWebElement> NFKiosMoremenupageReminderAddReminderTypeBackBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.addreminderField.txt")
	private QAFWebElement NFKiosMoremenupageReminderAddreminderFieldTxt;
	@FindBy(locator = "NFKios.moremenuPage.reminder.reminder.lbl")
	private QAFWebElement NFKiosMoremenupageRemindersTitle;
	@FindBy(locator = "NFKios.moremenupage.connection.btn")
	private QAFWebElement NFKiosMoremenupageConnectionBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.title")
	private QAFWebElement NFKiosMoremenupageConnectionTitle;
	@FindBy(locator = "NFKios.moremenupage.connection.applehealth.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionApplehealthLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.applehealth.swch")
	private QAFWebElement NFKiosMoremenupageConnectionApplehealthSwch;
	@FindBy(locator = "NFKios.moremenupage.connection.addoffice.btn")
	private QAFWebElement NFKiosMoremenupageConnectionAddofficeBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.addofficeCancel.btn")
	private QAFWebElement NFKiosMoremenupageConnectionAddofficecancelBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.addofficeSearch.btn")
	private QAFWebElement NFKiosMoremenupageConnectionAddofficesearchBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.addofficeTitle.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionAddofficetitleLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.walgreen.switch")
	private QAFWebElement NFKiosMoremenupageConnectionWalgreenSwitch;
	@FindBy(locator = "NFKios.moremenupage.connection.walgreen.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionWalgreenLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.importpopup.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionImportpopupLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.officereenter.btn")
	private QAFWebElement NFKiosMoremenupageConnectionOfficereenterBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.officeyes.btn")
	private QAFWebElement NFKiosMoremenupageConnectionOfficeyesBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.officeqst.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionOfficeqstLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.officename.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionOfficenameLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.officecontact.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionOfficecontactLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.done.btn")
	private QAFWebElement NFKiosMoremenupageConnectionDoneBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.checkbox.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionCheckboxLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.requestSubmited.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionRequestsubmitedLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.withdrawrequest.btn")
	private QAFWebElement NFKiosMoremenupageConnectionWithdrawrequestBtn;
	@FindBy(locator = "NFKios.moremenuPage.other.back.btn")
	private List<QAFWebElement> NFKiosMoremenupagebackndBtn;
	@FindBy(locator = "NFKios.moremenupage.contatcus.returnto.btn")
	private QAFWebElement NFKiosMoremenupageContactusReturnBtn;
	@FindBy(locator = "NFKios.moremenupage.contactusdeletedraft.btn")
	private QAFWebElement NFKiosMoremenupageContactusDeleteDraftBtn;
	@FindBy(locator = "NFKios.moremenupage.reminder.alertpopupok.btn")
	private QAFWebElement NFKiosMoremenupageReminderAlertOkBtn;
	@FindBy(locator = "NFKios.moremenupage.reteappback.btn")
	private QAFWebElement NFKiosMoremenupageRateappBackBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.name.txt")
	private QAFWebElement NFKiosMoremenuPageReminderNameTxt;
	@FindBy(locator = "NFKios.moremenupage.reminder.synToggle.btn")
	private QAFWebElement NFKiosMoremenupageReminderSynToggleBtn;
	@FindBy(locator = "NFKios.moremenupage.reminder.Done.btn")
	private QAFWebElement NFKiosMoremenupageReminderDoneBtn;
	@FindBy(locator = "NFKios.moremenuPage.myMeter.veriometer.img")
	private QAFWebElement NFKiosMoremenupageMymeterVeriometerImg;
	@FindBy(locator = "NFKios.moremenuPage.connection.chk")
	private QAFWebElement NFKiosMoremenupageConnectionWalgreenChk;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.email.txt")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenEmailTxt;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.password.txt")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenPasswordTxt;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.signin.btn")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenSigninBtn;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.yes.btn")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenYesBtn;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.no.btn")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenNoBtn;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.finish.btn")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenFinishBtn;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.term.lnk")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenTermLnk;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.privecy.lnk")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenPrivecyLnk;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.cancel.btn")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenCancelBtn;
	@FindBy(locator = "NFKios.moremenuPage.connection.walgreen.enable.btn")
	private QAFWebElement NFKiosMoremenuPageConnectionWalgreenEnableBtn;
	@FindBy(locator = "NFKios.moremenuPage.myMeters.meterNotFound.tryAgain.btn")
	private QAFWebElement NFKiosMoremenuPagemyMetersMeterNotFoundTryAgainBtn;
	@FindBy(locator = "NFKios.moremenuPage.myMeters.meterNotFound.cancel.btn")
	private QAFWebElement NFKiosMoremenuPagemyMetersMeterNotFoundCancelBtn;
	@FindBy(locator = "NFKios.moremenuPage.staticback.btn")
	private QAFWebElement NFKiosMoremenuPageBackStaticBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.svaedopen.delete.btn")
	private QAFWebElement NFKiosMoremenuPageReminderSaveOpenDeleteBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.setSave.btn")
	private QAFWebElement NFKiosMoremenupageSetReminderSaveBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.addicon.lbl")
	private QAFWebElement NFKiosMoremenupageReminderAddiconLbl;
	@FindBy(locator = "NFKios.moremenuPage.connection.officeNo.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionOfficeNoLbl;
	@FindBy(locator = "NFKios.moremenupage.connection.addedofficename.lbl")
	private QAFWebElement NFKiosMoremenupageConnectionAddedofficenameLbl;
	@FindBy(locator = "NFKios.moremenuPage.myalerts.btn")
	private QAFWebElement NFKiosmoremenuPagemyalertsbtn;
	@FindBy(locator = "NFKios.moremenuPage.Share.btn")
	private QAFWebElement NFKiosmoremenuPageShareBtn;
	@FindBy(locator = "NFKios.moremenuPage.reminder.description")
	private QAFWebElement NFKiosMoremenuPageReminderDescription;
	@FindBy(locator = "NFKios.moremenu.reminderspage.remindertitle.list")
	private List<QAFWebElement> NFKiosmoremenureminderspageremindertitlelist;
	@FindBy(locator = "NFKios.moremenu.reminderspage.popup.title")
	private QAFWebElement NFKiosMoremenuReminderspagePopupTitle;
	@FindBy(locator = "NFKios.moremenuPage.ordersupplies.btn")
	private QAFWebElement NFKiosMoremenuPageOrdersuppliesBtn;
	@FindBy(locator = "NFKios.moremenuPage.connected.call.btn")
	private QAFWebElement NFKiosMoremenuPageConnectedCallBtn;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.title")
	private QAFWebElement NFKiosMydevicestitle;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.unpairbtn")
	private QAFWebElement NFKiosmoremenuPageMydevicesSensorUnpairbtn;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.Stopbtn")
	private QAFWebElement NFKiosmoremenuPageMydevicesSensorStopbtn;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.Name")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorName;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.Number")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorNumber;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.PairCode")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorPairCode;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.PairStatus")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorPairStatus;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.SessionDetails")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorSessionDetails;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.dateExpire")
	private QAFWebElement NFKiosMoremenuPageMydevicessensorDateExpire;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.Location")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorLocation;
	@FindBy(locator = "NFKios.Sensorpairing.Stopsensor")
	private List<QAFWebElement> NFKiosSensorpairingStopsensor;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensor.title")
	private QAFWebElement NFKiosMmoremenuPageMydevicesSensorTitle;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.Stopsensor")
	private List<QAFWebElement> NFKiosMoremenuPageMydevicesStopsensor;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.CancelBtn")
	private QAFWebElement NFKiosMoremenuPageMydevicesCancelBtn;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.sensorInstruction.link")
	private QAFWebElement NFKiosMoremenuPageMydevicesSensorInstructionLink;
	@FindBy(locator = "NFKios.moremenuPage.stopSensor.popup.stopBtn")
	private QAFWebElement NFKiosMoremenuPageStopSensorPopupStopBtn;
	@FindBy(locator = "NFKios.moremenuPage.stopSensor.popup.cancelBtn")
	private QAFWebElement NFKiosMoremenuPageStopSensorPopupCancelBtn;
	@FindBy(locator = "NFKios.moremenuPage.stopSensor.popup.title")
	private QAFWebElement NFKiosMoremenuPageStopSensorPopupTitle;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.back.btn")
	private QAFWebElement NFKiosMoremenuPageMydevicesBackBtn;
	@FindBy(locator = "NFKios.moremenuPage.removeSensor.tile")
	private QAFWebElement NFKiosMoremenuPageRemoveSensorTile;
	@FindBy(locator = "NFKios.moremenuPage.removeSensor.done.btn")
	private QAFWebElement NFKiosMoremenuPageRemoveSensorDoneBtn;
	@FindBy(locator = "NFKios.moremenuPage.removeSensor.instructiona.text")
	private QAFWebElement NFKiosMoremenuPageRemoveSensorInstructionaText;
	@FindBy(locator = "NFKios.moremenuPage.removeSensor.image")
	private QAFWebElement NFKiosMoremenuPageRemoveSensorImage;
	@FindBy(locator = "NFKios.moremenuPage.stopSensorPopup.btn")
	private QAFWebElement NFKiosMoremenuPageStopSensorPopupBtn;
	
	@FindBy(locator = "NFKios.Moremenu.Connections.connectedClinics")
	private List<QAFWebElement> NFKiosMoremenuConnectionsConnectedClinics;
	@FindBy(locator = "NFKios.moremenupage.connection.page.clinic.in.alphabetical.format")
	private List<QAFWebElement> NFKiosMoremenupageConnectionPageClinicInAlphabeticalFormat;
	@FindBy(locator = "NFKios.moremenupage.connection.page.header")
	private QAFWebElement NFKiosMoremenupageConnectionPageHeader;
	@FindBy(locator = "NFKios.moremenupage.connection.care.team.title")
	private QAFWebElement NFKiosMoremenupageConnectionCareTeamTitle;
	@FindBy(locator = "NFKios.moremenupage.tap.on.addClinic.btn")
	private QAFWebElement NFKiosMoremenupageTapOnAddClinicBtn;
	@FindBy(locator = "NFKios.moremenupage.connection.page.addClinic.btn.popup.message.text")
	private QAFWebElement NFKiosMoremenupageConnectionPageAddClinicBtnPopupMessageText;
	@FindBy(locator = "NFKios.moremenupage.connection.page.addClinic.btn.popup.message.ok.btn")
	private QAFWebElement NFKiosMoremenupageConnectionPageAddClinicBtnPopupMessageOkBtn;

	public QAFWebElement getNFKiosmoremenuPageMydevicesSensorUnpairbtn() {
		return NFKiosmoremenuPageMydevicesSensorUnpairbtn;
	}

	public QAFWebElement getNFKiosmoremenuPageMydevicesSensorStopbtn() {
		return NFKiosmoremenuPageMydevicesSensorStopbtn;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorName() {
		return NFKiosMoremenuPageMydevicesSensorName;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorNumber() {
		return NFKiosMoremenuPageMydevicesSensorNumber;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorPairCode() {
		return NFKiosMoremenuPageMydevicesSensorPairCode;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorPairStatus() {
		return NFKiosMoremenuPageMydevicesSensorPairStatus;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorSessionDetails() {
		return NFKiosMoremenuPageMydevicesSensorSessionDetails;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicessensorDateExpire() {
		return NFKiosMoremenuPageMydevicessensorDateExpire;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorLocation() {
		return NFKiosMoremenuPageMydevicesSensorLocation;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorTitle() {
		return NFKiosMmoremenuPageMydevicesSensorTitle;
	}

	public List<QAFWebElement> getNFKiosMoremenuPageMydevicesStopsensor() {
		return NFKiosMoremenuPageMydevicesStopsensor;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesCancelBtn() {
		return NFKiosMoremenuPageMydevicesCancelBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesSensorInstructionLink() {
		return NFKiosMoremenuPageMydevicesSensorInstructionLink;
	}

	public QAFWebElement getNFKiosMoremenuPageStopSensorPopupStopBtn() {
		return NFKiosMoremenuPageStopSensorPopupStopBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageStopSensorPopupCancelBtn() {
		return NFKiosMoremenuPageStopSensorPopupCancelBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageStopSensorPopupTitle() {
		return NFKiosMoremenuPageStopSensorPopupTitle;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesBackBtn() {
		return NFKiosMoremenuPageMydevicesBackBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageRemoveSensorTile() {
		return NFKiosMoremenuPageRemoveSensorTile;
	}

	public QAFWebElement getNFKiosMoremenuPageRemoveSensorDoneBtn() {
		return NFKiosMoremenuPageRemoveSensorDoneBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageRemoveSensorInstructionaText() {
		return NFKiosMoremenuPageRemoveSensorInstructionaText;
	}

	public QAFWebElement getNFKiosMoremenuPageRemoveSensorImage() {
		return NFKiosMoremenuPageRemoveSensorImage;
	}

	public QAFWebElement getNFKiosMydevicestitle() {
		return NFKiosMydevicestitle;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectedCallBtn() {
		return NFKiosMoremenuPageConnectedCallBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageOrdersuppliesBtn() {
		return NFKiosMoremenuPageOrdersuppliesBtn;
	}

	@FindBy(locator = "NFKios.moremenuPage.Mydevices.btn")
	private QAFWebElement NFKiosMoremenuPageMydevicesBtn;

	@FindBy(locator = "NFKios.moremenuPage.Mydevices.start.sensor.session")
	private QAFWebElement NFKiosMyDevicesStartSensorsessionbtn;

	public QAFWebElement getNFKiosMyDevicesStartSensorsessionbtn() {
		return NFKiosMyDevicesStartSensorsessionbtn;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesBtn() {
		return NFKiosMoremenuPageMydevicesBtn;
	}

	@FindBy(locator = "NFKios.applysensor.back.btn")
	private QAFWebElement NFKiosApplysorBackbtn;

	public QAFWebElement getNFKiosApplysorBackbtn() {
		return NFKiosApplysorBackbtn;
	}

	@FindBy(locator = "NFKios.PairSensor.title")
	private QAFWebElement NFKiosPairSensorTitle;

	public QAFWebElement getNFKiosPairSensorTitle() {
		return NFKiosPairSensorTitle;
	}

	@FindBy(locator = "NFKios.PairSensor.screen.txt")
	private QAFWebElement NFKiosPairSensorscreentext;

	public QAFWebElement getNFKiosPairSensorscreentext() {
		return NFKiosPairSensorscreentext;
	}

	@FindBy(locator = "NFKios.PairSensor.pairingcode.field")
	private QAFWebElement NFKiosPairSensorpairingcode;

	public QAFWebElement getNFKiosPairSensorpairingcode() {
		return NFKiosPairSensorpairingcode;
	}

	@FindBy(locator = "NFKios.PairSensor.Use.code.scanner")
	private QAFWebElement NFKiosPairSensorUseCodeScannerBtn;

	public QAFWebElement getNFKiosPairSensorUseCodeScannerBtn() {
		return NFKiosPairSensorUseCodeScannerBtn;
	}

	@FindBy(locator = "NFKios.moremenuPage.Mydevices.integrate.title")
	private QAFWebElement NFKiosMyDevicesintegratedtitle;

	public QAFWebElement getNFKiosMyDevicesintegratedtitle() {
		return NFKiosMyDevicesintegratedtitle;
	}

	@FindBy(locator = "NFKios.moremenuPage.Mydevices.i.Icon")
	private QAFWebElement NFKiosMyDevicesiIcon;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.icon.title")
	private QAFWebElement NFKiosMoremenuPageMydevicesIconTitle;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.icon.close.btn")
	private QAFWebElement NFKiosMoremenuPageMydevicesIconCloseBtn;
	@FindBy(locator = "NFKios.moremenuPage.Mydevices.icon.msg.txt")
	private QAFWebElement NFKiosMoremenuPageMydevicesIconMsgTxt;
	@FindBy(locator = "NFKios.Moremenu.Account.optin.checkbox")
	private QAFWebElement NFKiosMoremenuAccountoptincheckbox;
	@FindBy(locator = "NFKios.Moremenu.Account.optin.title")
	private QAFWebElement NFKiosMoremenuAccountoptintitle;
	@FindBy(locator = "NFKios.Moremenu.Account.optin.cancel.btn")
	private QAFWebElement NFKiosMoremenuAccountoptincancelbtn;
	@FindBy(locator = "NFKios.Moremenu.Account.optin.agree.btn")
	private QAFWebElement NFKiosMoremenuAccountoptinagreebtn;
	
	public QAFWebElement getNFKiosMoremenuAccountoptincheckbox() {
		return NFKiosMoremenuAccountoptincheckbox;
	}
	public QAFWebElement getNFKiosMoremenuAccountoptintitle() {
		return NFKiosMoremenuAccountoptintitle;
	}
	public QAFWebElement getNFKiosMoremenuAccountoptincancelbtn() {
		return NFKiosMoremenuAccountoptincancelbtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountoptinagreebtn() {
		return NFKiosMoremenuAccountoptinagreebtn;
	}
	public QAFWebElement getNFKiosMoreMenupageStaticTextBtn(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.staticText.lbl", text);}

	public QAFWebElement getNFKiosMyDevicesiIcon() {
		return NFKiosMyDevicesiIcon;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesIconTitle() {
		return NFKiosMoremenuPageMydevicesIconTitle;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesIconCloseBtn() {
		return NFKiosMoremenuPageMydevicesIconCloseBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageMydevicesIconMsgTxt() {
		return NFKiosMoremenuPageMydevicesIconMsgTxt;
	}

	@FindBy(locator = "NFKios.moremenuPage.Mydevices.Add.device.btn")
	private QAFWebElement NFKiosMyDevicesAdddevicebtn;

	public QAFWebElement getNFKiosMyDevicesAdddevicebtn() {
		return NFKiosMyDevicesAdddevicebtn;
	}

	@FindBy(locator = "NFKios.moremenuPage.reminder.addname.text")
	private QAFWebElement NFKiosMoremenuPageReminderAddnameText;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddedofficenameLbl() {
		return NFKiosMoremenupageConnectionAddedofficenameLbl;
	}

	public QAFWebElement getNFKiosMoremenuReminderspagePopupTitle() {
		return NFKiosMoremenuReminderspagePopupTitle;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionTitle() {
		return NFKiosMoremenupageConnectionTitle;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddedofficenameLbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.connection.addedofficename.lbl", text);
	}

	public QAFWebElement getNFKiosMoremenupageConnectionOfficeNoLbl() {
		return NFKiosMoremenupageConnectionOfficeNoLbl;
	}

	public QAFWebElement getNFKiosMoremenupageReminderAddiconLbl() {
		return NFKiosMoremenupageReminderAddiconLbl;
	}

	public void setNFKiosMoremenupageReminderAddiconLbl(QAFWebElement NFKiosMoremenupageReminderAddiconLbl) {
		this.NFKiosMoremenupageReminderAddiconLbl = NFKiosMoremenupageReminderAddiconLbl;
	}

	public QAFWebElement getNFKiosMoremenupageSetReminderSaveBtn() {
		return NFKiosMoremenupageSetReminderSaveBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageReminderSaveOpenDeleteBtn() {
		return NFKiosMoremenuPageReminderSaveOpenDeleteBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageReminderDescription() {
		return NFKiosMoremenuPageReminderDescription;
	}

	private List<QAFWebElement> getNFKiosmoremenureminderspageremindertitlelist() {
		return NFKiosmoremenureminderspageremindertitlelist;
	}

	public QAFWebElement getNFKiosMoremenuPageBackStaticBtn() {
		return NFKiosMoremenuPageBackStaticBtn;
	}

	public QAFWebElement getNFKiosMoremenuPagemyMetersMeterNotFoundCancelBtn() {
		return NFKiosMoremenuPagemyMetersMeterNotFoundCancelBtn;
	}

	public QAFWebElement getNFKiosMoremenuPagemyMetersMeterNotFoundTryAgainBtn() {
		return NFKiosMoremenuPagemyMetersMeterNotFoundTryAgainBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenTermLnk() {
		return NFKiosMoremenuPageConnectionWalgreenTermLnk;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenPrivecyLnk() {
		return NFKiosMoremenuPageConnectionWalgreenPrivecyLnk;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenCancelBtn() {
		return NFKiosMoremenuPageConnectionWalgreenCancelBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageReminderAddnameText() {
		return NFKiosMoremenuPageReminderAddnameText;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenEnableBtn() {
		return NFKiosMoremenuPageConnectionWalgreenEnableBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenFinishBtn() {
		return NFKiosMoremenuPageConnectionWalgreenFinishBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenEmailTxt() {
		return NFKiosMoremenuPageConnectionWalgreenEmailTxt;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenPasswordTxt() {
		return NFKiosMoremenuPageConnectionWalgreenPasswordTxt;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenSigninBtn() {
		return NFKiosMoremenuPageConnectionWalgreenSigninBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenYesBtn() {
		return NFKiosMoremenuPageConnectionWalgreenYesBtn;
	}

	public QAFWebElement getNFKiosMoremenuPageConnectionWalgreenNoBtn() {
		return NFKiosMoremenuPageConnectionWalgreenNoBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionWalgreenChk() {
		return NFKiosMoremenupageConnectionWalgreenChk;
	}

	public QAFWebElement getNFKiosMoremenupageMymeterVeriometerImg() {
		return NFKiosMoremenupageMymeterVeriometerImg;
	}

	public QAFWebElement getNFKiosMoremenupageRateappBackBtn() {
		return NFKiosMoremenupageRateappBackBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderAlertOkBtn() {
		return NFKiosMoremenupageReminderAlertOkBtn;
	}

	public QAFWebElement getNFKiosMoremenupageContactusDeleteDraftBtn() {
		return NFKiosMoremenupageContactusDeleteDraftBtn;
	}

	public QAFWebElement getNFKiosMoremenupageContactusReturnBtn() {
		return NFKiosMoremenupageContactusReturnBtn;
	}

	public List<QAFWebElement> getONFKiosMoremenupagebackndBtn() {
		return NFKiosMoremenupagebackndBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionOfficereenterBtn() {
		return NFKiosMoremenupageConnectionOfficereenterBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionOfficeyesBtn() {
		return NFKiosMoremenupageConnectionOfficeyesBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionOfficeqstLbl() {
		return NFKiosMoremenupageConnectionOfficeqstLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionOfficenameLbl() {
		return NFKiosMoremenupageConnectionOfficenameLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionOfficecontactLbl() {
		return NFKiosMoremenupageConnectionOfficecontactLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionDoneBtn() {
		return NFKiosMoremenupageConnectionDoneBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionCheckboxLbl() {
		return NFKiosMoremenupageConnectionCheckboxLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionRequestsubmitedLbl() {
		return NFKiosMoremenupageConnectionRequestsubmitedLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionWithdrawrequestBtn() {
		return NFKiosMoremenupageConnectionWithdrawrequestBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionWalgreenSwitch() {
		return NFKiosMoremenupageConnectionWalgreenSwitch;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionWalgreenLbl() {
		return NFKiosMoremenupageConnectionWalgreenLbl;
	}

	public QAFWebElement getNFKiosmoremenuPagemyalertsbtn() {
		return NFKiosmoremenuPagemyalertsbtn;
	}

	public QAFWebElement getNFKiosmoremenuPageShareBtn() {
		return NFKiosmoremenuPageShareBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionImportpopupLbl() {
		return NFKiosMoremenupageConnectionImportpopupLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionApplehealthLbl() {
		return NFKiosMoremenupageConnectionApplehealthLbl;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionApplehealthSwch() {
		return NFKiosMoremenupageConnectionApplehealthSwch;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddofficeBtn() {
		return NFKiosMoremenupageConnectionAddofficeBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddofficecancelBtn() {
		return NFKiosMoremenupageConnectionAddofficecancelBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddofficesearchBtn() {
		return NFKiosMoremenupageConnectionAddofficesearchBtn;
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddofficetitleLbl() {
		return NFKiosMoremenupageConnectionAddofficetitleLbl;
	}

	public QAFWebElement getNFKiosMoremenupageRemindersTitle() {
		return NFKiosMoremenupageRemindersTitle;
	}

	public QAFWebElement getNFKiosMoremenupageReminderAddreminderFieldTxt() {
		return NFKiosMoremenupageReminderAddreminderFieldTxt;
	}

	public List<QAFWebElement> getNFKiosMoremenupageReminderAddReminderTypeBackBtn() {
		return NFKiosMoremenupageReminderAddReminderTypeBackBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderDeteletPopUpDeleteBtn() {
		return NFKiosMoremenupageReminderDeteletPopUpDeleteBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderRepeatPicker() {
		return NFKiosMoremenupageReminderRepeatPicker;
	}

	public List<QAFWebElement> getNFKiosMoremenupageReminderRepeatPickerList() {
		return NFKiosMoremenupageReminderRepeatPickerList;
	}

	public QAFWebElement getNFKiosMoremenupageReminderSaveTiminglbl() {
		return NFKiosMoremenupageReminderSaveTiminglbl;
	}

	public QAFWebElement getNFKiosMoremenupageReminderMinutePicker() {
		return NFKiosMoremenupageReminderMinutePicker;
	}

	public QAFWebElement getNFKiosMoremenupageReminderHourPicker() {
		return NFKiosMoremenupageReminderHourPicker;
	}

	public QAFWebElement getNFKiosMoremenupageReminderDatePicker() {
		return NFKiosMoremenupageReminderDatePicker;
	}

	public QAFWebElement getNFKiosMoremenupageReminderRepeatBtn() {
		return NFKiosMoremenupageReminderRepeatBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderDateTimeBtn() {
		return NFKiosMoremenupageReminderDateTimeBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderReminderDescriptionTxt() {
		return NFKiosMoremenupageReminderReminderDescriptionTxt;
	}

	public QAFWebElement getNFKiosMoremenupageReminderSetReminderlbl() {
		return NFKiosMoremenupageReminderSetReminderlbl;
	}

	public QAFWebElement getNFKiosMoremenupageReminderSaveBtn() {
		return NFKiosMoremenupageReminderSaveBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderAddReminderlbl() {
		return NFKiosMoremenupageReminderAddReminderlbl;
	}

	public QAFWebElement getNFKiosMoremenupageReminderNewReminderBtn() {
		return NFKiosMoremenupageReminderNewReminderBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderChooseReminderlbl() {
		return NFKiosMoremenupageReminderChooseReminderlbl;
	}

	public QAFWebElement getNFKiosMoremenuReminderAddBtn() {
		return NFKiosMoremenuReminderAddBtn;
	}

	public QAFWebElement getNFKiosMoremenuReminderBackBtn() {
		return NFKiosMoremenuReminderBackBtn;
	}

	public QAFWebElement getNFKiosMoremenuMyMeterPairMeterBtn() {
		return NFKiosMoremenuMyMeterPairMeterBtn;
	}

	public QAFWebElement getNFKiosMoremenuMyMeterAutoUpdateTimeBtn() {
		return NFKiosMoremenuMyMeterAutoUpdateTimeBtn;
	}

	public QAFWebElement getNFKiosMoremenuMyMeterAutoUpdateTimeLbl() {
		return NFKiosMoremenuMyMeterAutoUpdateTimeLbl;
	}

	public QAFWebElement getNFKiosMoremenuPageRateThisAppLbl() {
		return NFKiosMoremenuPageRateThisAppLbl;
	}

	public QAFWebElement getNFKiosMoremenuPageContactSiteLbl() {
		return NFKiosMoremenuPageContactSiteLbl;
	}

	public QAFWebElement getNFKiosMoremenuPageContactNumberLbl() {
		return NFKiosMoremenuPageContactNumberLbl;
	}

	public QAFWebElement getNFKiosMoremenuPageContactEmailLbl() {
		return NFKiosMoremenuPageContactEmailLbl;
	}

	public QAFWebElement getNFKiosMoremenuPageContactUsTitleLbl() {
		return NFKiosMoremenuPageContactUsTitleLbl;
	}

	public QAFWebElement getNFKiosMoremenupageSettingsBtn() {
		return NFKiosMoremenupageSettingsBtn;
	}

	public QAFWebElement getNFKiosMoremenupageMymeterBtn() {
		return NFKiosMoremenupageMymeterBtn;
	}

	public QAFWebElement getNFKiosMoremenupageMyreminderBtn() {
		return NFKiosMoremenupageMyreminderBtn;
	}

	public QAFWebElement getNFKiosMoremenupageMyaccountBtn() {
		return NFKiosMoremenupageMyaccountBtn;
	}

	public QAFWebElement getNFKiosMoremenupageHelpBtn() {
		return NFKiosMoremenupageHelpBtn;
	}

	public QAFWebElement getNFKiosMoremenupageContactusBtn() {
		return NFKiosMoremenupageContactusBtn;
	}

	public QAFWebElement getNFKiosMoremenupageLogoutBtn() {
		return NFKiosMoremenupageLogoutBtn;
	}

	public QAFWebElement getNFKiosMoremenupageTermsofuseBtn() {
		return NFKiosMoremenupageTermsofuseBtn;
	}

	public QAFWebElement getNFKiosMoremenupagePrivecypolicyBtn() {
		return NFKiosMoremenupagePrivecypolicyBtn;
	}

	public QAFWebElement getNFKiosMoremenupageTermsofserviceBackBtn() {
		return NFKiosMoremenupageTermsofserviceBackBtn;
	}

	public QAFWebElement getNFKiosMorepageStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenu.reminder.staticText.lbl", text);
	}

	public QAFWebElement getNFKiosMoremenupageConnectionBtn() {
		return NFKiosMoremenupageConnectionBtn;
	}

	public QAFWebElement getNFKiosMorepageStaticTextlbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.staticText.lbl", text);
	}

	public QAFWebElement getNFKiosMorepageaddOffceCodeBox(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.connection.addofficeEnterCode.box", text);
	}

	public QAFWebElement getNFKiosMoremenuPageReminderNameTxt(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenuPage.reminder.name.txt", text);
	}

	public QAFWebElement getNFKiosMoremenupageReminderSynToggleBtn() {
		return NFKiosMoremenupageReminderSynToggleBtn;
	}

	public QAFWebElement getNFKiosMoremenupageReminderDoneBtn() {
		return NFKiosMoremenupageReminderDoneBtn;
	}

	public QAFWebElement getNFKiosMoremenupageRemindercontinueBtn() {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.staticText.lbl",
				LFSUtilsIOS.getPropString("alerts.meterTargetRangeDifferenceConfirmation.continue"));
	}

	public QAFWebElement getNFKiosMoremenupageConnectionAddofficeentercodeLbl() {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.staticText.lbl",
				LFSUtilsIOS.getPropString("office.code.add.heading"));
	}

	public QAFWebElement getNFKiosMoremenupageMyMetersCancelBtn() {
		return LFSUtilsIOS.getElement("NFKios.moremenupage.staticText.lbl",
				LFSUtilsIOS.getPropString("appCommon.cancel"));
	}

	public List<QAFWebElement> getNFKiosMoremenuPageClinicConnections() {
		return NFKiosMoremenuConnectionsConnectedClinics;
	}
	public List<QAFWebElement> getNFKiosConnectionPageClinicInAlphabeticalFormat() {
		return NFKiosMoremenupageConnectionPageClinicInAlphabeticalFormat;
	}
	public QAFWebElement getNFKiosConnectionPageHeader() {
		return NFKiosMoremenupageConnectionPageHeader;
	}
	public QAFWebElement getNFKiosConnectionCareTeamTitle() {
		return NFKiosMoremenupageConnectionCareTeamTitle;
	}
	public QAFWebElement getNFKiosTapOnAddClinicBtn() {
		return NFKiosMoremenupageTapOnAddClinicBtn;
	}
	public QAFWebElement getNFKiosConnectionPageAddClinicBtnPopupMessageText() {
		return NFKiosMoremenupageConnectionPageAddClinicBtnPopupMessageText;
	}
	public QAFWebElement getNFKiosConnectionPageAddClinicBtnPopupMessageOkBtn() {
		return NFKiosMoremenupageConnectionPageAddClinicBtnPopupMessageOkBtn;
	}
	
	
	
	
	/*
	 * Method to verify elements in more menu milan
	 */
	public void verifyMoreMenu() {
		getNFKiosMoremenupageSettingsBtn().waitForPresent();
		getNFKiosMoremenupageSettingsBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.settings.label"));
		getNFKiosMoremenupageMymeterBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.myMeter.label"));
		getNFKiosMoremenupageMyreminderBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.myReminder.label"));
		getNFKiosMoremenupageMyaccountBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.myAccount.label"));
		getNFKiosMoremenupageConnectionBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.connection.label"));
		getNFKiosMoremenupageHelpBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.help.label"));
		getNFKiosMoremenupageContactusBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.contactus.label"));
		getNFKiosMoremenupageLogoutBtn().verifyNotVisible(LFSUtilsIOS.getPropString("moremenu.logout.removed"));
		getNFKiosMoremenupageTermsofuseBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.termofuse.label"));
		getNFKiosMoremenupagePrivecypolicyBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.privacypolicy.label"));

	}

	public void clickSetting() {
		try {
			LFSUtilsIOS.click(getNFKiosMoremenupageSettingsBtn());
			Reporter.logWithScreenShot("The user clicked on My Settings", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click My settings ", MessageTypes.Fail);
		}
	}

	// Method to click and verify Privacy policy screen
	public void clickAndVerifyPrivecyPilicyScreen() {
		getNFKiosMoremenupagePrivecypolicyBtn().waitForPresent();
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(200);
		getNFKiosMoremenupagePrivecypolicyBtn().click();
		if (getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
				.isPresent()) {
			Reporter.logWithScreenShot("Privacy policy title", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Privacy policy title", MessageTypes.Pass);
		}
		Reporter.logWithScreenShot("Privacy policy screen1", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen2", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen3", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen4", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen5", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen6", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen7", MessageTypes.Pass);
		ToClickBackBtn2();
		getNFKiosMoremenupageSettingsBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.settings.label"));

	}

	// Method to click and verify Privacy Terms of use screen

	public void clickAndVerifyTermsOfUseScreen() {
		getNFKiosMoremenupageTermsofuseBtn().waitForPresent();
		getNFKiosMoremenupageTermsofuseBtn().click();
		if (getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.terms"))
				.isPresent()) {
			Reporter.logWithScreenShot("Terms of Use Title", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Terms of Use Title", MessageTypes.Pass);
		}
		Reporter.logWithScreenShot("Terms of use screen 1", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 2", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 3", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 3", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 4", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 5", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 6", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 7", MessageTypes.Pass);
		ToClickBackBtn2();
		getNFKiosMoremenupageSettingsBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.settings.label"));

	}

	// Method to click on Contact Us menu from More menu
	public void clickContactUsPage() {
		try {
			LFSUtilsIOS.click(getNFKiosMoremenupageContactusBtn());
			Reporter.logWithScreenShot("Sucessfully clicked on contact us page", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on contact us page", MessageTypes.Fail);
		}
	}

	// user verify contact us screen

	public void verifyContactUsScreen() {
		try {
			getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("contact.title"));

					
			getNFKiosMoremenuPageContactEmailLbl().verifyPresent("contact Email ");
			getNFKiosMoremenuPageContactNumberLbl().verifyPresent("Contact Number");
			getNFKiosMoremenuPageContactSiteLbl().verifyPresent("Contact Site");
			getNFKiosMoremenuPageRateThisAppLbl().verifyPresent("Rate this app");

			Reporter.logWithScreenShot("Sucessfully verified Contact us screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify Contact us screen", MessageTypes.Fail);
		}
	}

	// Method to click on email to verify
	public void clickEmailToVerify() {
		LFSUtilsIOS.click(getNFKiosMoremenuPageContactEmailLbl());

		Reporter.logWithScreenShot("Email options in IOS", MessageTypes.Pass);
		if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
			LFSUtilsIOS.click(getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("appCommon.revertValue")));
		} else {
			LFSUtilsIOS.click(getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("appCommon.cancel")));
		}
		Reporter.logWithScreenShot("After clicking cancel button", MessageTypes.Pass);
		LFSUtilsIOS.clickWithText("OneTouch");

	}


	// method to click on reminder button form more menu screen

	public void clickOnReminderFromMoreMenu() {
		getNFKiosMoremenupageMyreminderBtn().isPresent();
		LFSUtilsIOS.click(getNFKiosMoremenupageMyreminderBtn());
		// getNFKiosMoremenupageMyreminderBtn().click();
		Reporter.logWithScreenShot("After clicking on reminder in more menu screen", MessageTypes.Pass);
	}

	// Method to verify set reminder screen

	public void verifySetReminderScreen(String reminderType) {
		try {
			getNFKiosMoremenupageReminderSetReminderlbl().waitForPresent();
			getNFKiosMoremenupageReminderSetReminderlbl().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.setreminder.title"));
			WebDriverTestCase.verifyTrue(getNFKiosMoremenuPageReminderAddnameText().getText().equals(reminderType),
					" Reminder name incorrect", "Reminder name title correct");
			getNFKiosMoremenupageReminderDateTimeBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.setreminder.datetime"));
			getNFKiosMoremenupageReminderRepeatBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.setreminder.repeat"));
			Reporter.logWithScreenShot("sucessfully verified set reminder screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify set reminder screen", MessageTypes.Fail);
		}
	}

	// method to select date and time picker
	public void selectDateTimePicker() {
		Point p1 = getNFKiosMoremenupageReminderDatePicker().getLocation();
		Dimension d1 = getNFKiosMoremenupageReminderDatePicker().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(point(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) + 70)).perform();
		int hour = Integer.parseInt(ConfigurationManager.getBundle().getProperty("reminder.hour").toString());
		int minute = Integer.parseInt(ConfigurationManager.getBundle().getProperty("reminder.minute").toString());
		selectTimePicker(getNFKiosMoremenupageReminderHourPicker(), hour);
		selectTimePicker(getNFKiosMoremenupageReminderMinutePicker(), minute);
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderDoneBtn());
		Reporter.logWithScreenShot("User Sets date and time", MessageTypes.Pass);
	}

	// method to select date time picker

	public void selectTimePicker(WebElement element, int value) {
		Point p1 = element.getLocation();
		Dimension d1 = element.getSize();
		LFSUtilsIOS jnj = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(jnj.getDriver());
		int hr = Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", ""));
		if (hr >= value) {
			while (!(element.getAttribute("value").toString().replaceAll("[^0-9]", "").equals(value + ""))) {
				try {
					tch.tap(point(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 40)).perform();
				} catch (Exception e) {
				}
			}
		}

		if (hr < value) {
			while (!(element.getAttribute("value").toString().replaceAll("[^0-9]", "").equals(value + ""))) {
				try {
					tch.tap(point(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) + 40)).perform();
				} catch (Exception e) {
				}
			}
		}
	}

	// method to verify added reminder

	public void verifyAddedReminder() {
		try {
			String hour = ConfigurationManager.getBundle().getProperty("reminder.hour").toString();
			String minute = ConfigurationManager.getBundle().getProperty("reminder.minute").toString();
			String typerepeat = ConfigurationManager.getBundle().getProperty("last.added.reminder.types").toString();
			String remindecription = ConfigurationManager.getBundle().getProperty("set.reminder.description")
					.toString();
			WebDriverTestCase.verifyTrue(getNFKiosMoremenupageReminderDateTimeBtn().getText().contains(hour),
					"Hour value is incorrect", " Hour value is correct ");
			WebDriverTestCase.verifyTrue(getNFKiosMoremenupageReminderDateTimeBtn().getText().contains(minute),
					"Minute value is incorrect", " Minute value is correct ");
			WebDriverTestCase.verifyTrue(getNFKiosMoremenupageReminderRepeatBtn().getText().equals(typerepeat),
					"Repeat value is incorrect", " Repeat value is correct ");
			WebDriverTestCase.verifyTrue(getNFKiosMoremenuPageReminderDescription().getText().equals(remindecription),
					"Description is incorrect", "Decription is Correct");
			Reporter.logWithScreenShot("sucessfully verified added reminder", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify added reminder", MessageTypes.Fail);
		}
	}

	// method to add a new reminder type

	public void addNewReminderType() {
		String text = "New remidnerType";
		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getNFKiosMoremenupageReminderAddreminderFieldTxt().sendKeys(text);
		clickSaveBtn();
		getNFKiosMorepageStaticText(text);
		WebDriverTestCase.verifyTrue(getNFKiosMorepageStaticText(text).isPresent(), "Added new reminder not saved",
				"Added new reminder type");

	}

	// method to click on add icon for reminder

	public void clickOnAddicon() {
		LFSUtilsIOS.click(getNFKiosMoremenuReminderAddBtn());
		Reporter.logWithScreenShot("User sets the reminder by tapping on + icon", MessageTypes.Pass);
	}

	// method to click on add icon for reminder

	public void clickOnNewReminderBtn() {
		getNFKiosMoremenupageReminderNewReminderBtn().waitForPresent();
		getNFKiosMoremenupageReminderNewReminderBtn().click();
		Reporter.logWithScreenShot("User clicked on New Reminder button", MessageTypes.Pass);

	}

	// method to click on add icon for reminder

	public void verifyAddRminderTypeScreen() {
		getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("more.reminder.newType.screenTitle"))
				.verifyPresent(LFSUtilsIOS.getPropString("more.reminder.newType.screenTitle"));
		getNFKiosMoremenupageReminderAddreminderFieldTxt().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.addreminder.txt"));
		getNFKiosMoremenupageSetReminderSaveBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.setreminder.save.btn"));

	}

	// method to click on add icon for reminder

	public void clickSaveBtn() {
		getNFKiosMoremenupageSetReminderSaveBtn().waitForPresent();
		getNFKiosMoremenupageSetReminderSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// method to click on add icon for reminder

	// SG working
	public void toClickBackBtn() {
		try {
			getNFKiosMoremenuPageBackStaticBtn().waitForPresent(4000);
			getNFKiosMoremenuPageBackStaticBtn().click();
		} catch (Exception e) {
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
		}
		if (getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("appCommon.ok")).isPresent()) {
			Reporter.logWithScreenShot("Are you sure, you want to discard Changes Popup is displayed",
					MessageTypes.Pass);
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		}

		Reporter.logWithScreenShot("After clicking on back button", MessageTypes.Pass);

	}

	public void ToClickBackBtn2() {
		getONFKiosMoremenupagebackndBtn().get(0).waitForPresent();
		for (QAFWebElement ele : getONFKiosMoremenupagebackndBtn()) {
			if (LFSUtilsIOS.tryMethod(ele))
				ele.click();
		}

	}

	// method to set repeat picker

	public void setRepeatPicker() {
		getNFKiosMoremenupageReminderRepeatBtn().waitForPresent();
		String remindertype = ConfigurationManager.getBundle().getString("reminder.types.daily");
		LFSUtilsIOS.clickWithText(remindertype);
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderDoneBtn());
		ConfigurationManager.getBundle().setProperty("last.added.reminder.types", remindertype);
		Reporter.logWithScreenShot("User Selected the Repeat Mode", MessageTypes.Pass);

	}

	// Method to verify all pages off reminder flow

	public void verifyReminderScreens() {
		clickOnReminderFromMoreMenu();
		verifyRemindersScreen();
		clickOnAddicon();
		verifyChooseReminderScreen();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 100);
		getNFKiosMoremenupageReminderNewReminderBtn().click();
		getNFKiosMoremenupageReminderAddReminderlbl().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.setreminder.title"));
		addNewReminder();
		Reporter.logWithScreenShot("added", MessageTypes.Pass);
		getNFKiosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("addReminder.text"))
				.verifyPresent(LFSUtilsIOS.getPropString("addReminder.text"));
		Reporter.logWithScreenShot("Verified the Reminder screen", MessageTypes.Pass);
	}

	private void addNewReminder() {
		getNFKiosMoremenuPageReminderAddnameText().isPresent();
		LFSUtilsIOS.enterText(getNFKiosMoremenuPageReminderAddnameText(),
				LFSUtilsIOS.getPropString("addReminder.text"));
		Reporter.logWithScreenShot("User added the Reminder name", MessageTypes.Pass);
		getNFKiosMoremenuPageReminderDescription().isPresent();
		LFSUtilsIOS.enterText(getNFKiosMoremenuPageReminderDescription(), "Adding new reminder of Sensor expiration");
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderDateTimeBtn());
		selectDateTimePicker();
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderRepeatBtn());
		setRepeatPicker();
		Reporter.logWithScreenShot("User added the details for setting the reminder", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosMoremenupageSetReminderSaveBtn());
	}

	// Method to verify "Reminders" screen

	public void verifyRemindersScreen() {
		try {
			getNFKiosMoremenuReminderAddBtn().verifyPresent(LFSUtilsIOS.getPropString("Add icon"));
			Reporter.logWithScreenShot("sucessfully verified reminder screen add icon", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify reminder screen add icon", MessageTypes.Fail);
		}
	}

	// Method to verify "Choose reminder" screen

	public void verifyChooseReminderScreen() {
		try {
			getNFKiosMoremenupageReminderChooseReminderlbl().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.choosereminder.label"));
			getNFKiosMoremenupageReminderNewReminderBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.reminder.newreminder.btn"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.eat.snack"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.eat.snack"));
			getNFKiosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.eat"))
					.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.eat"));
			getNFKiosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.activity"))
					.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.activity"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.buy.sensor"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.buy.sensor"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.take.medication"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.take.medication"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.refill.medication"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.refill.medication"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.glucagon.expiration"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.glucagon.expiration"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.strip.expiration"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.strip.expiration"));
			getNFKiosMoremenuPageReminderNameTxt(
					ConfigurationManager.getBundle().getString("reminder.preset.schedule.appointment"))
							.verifyPresent(ConfigurationManager.getBundle().getString("reminder.preset.schedule.appointment"));
			Reporter.logWithScreenShot("sucessfully verified choose reminder screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify choose reminder screen", MessageTypes.Fail);
		}
	}

	// Method to call customer care help desk
	public void callCustomerCare() {
		try {
			LFSUtilsIOS.click(getNFKiosMoremenuPageContactNumberLbl());
			Reporter.logWithScreenShot("Calling Screen", MessageTypes.Pass);

			if (LFSUtilsIOS.tryMethod(getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("appCommon.cancel"))))
				LFSUtilsIOS.click(getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("appCommon.cancel")));
			Reporter.logWithScreenShot("clicked on contact number and Calling customer care Screen display",
					MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to clicked on contact number and unable to see customer care screen",
					MessageTypes.Fail);
		}
	}

	// Method to visit Customer Application Site
	public void visitApplicationSite() {
		try {
			if (getNFKiosMoremenuPageContactSiteLbl().isDisplayed()) {
				LFSUtilsIOS.click(getNFKiosMoremenuPageContactSiteLbl());
				Reporter.logWithScreenShot("Application Website", MessageTypes.Pass);
			}
			LFSUtilsIOS.clickWithText("OneTouch");
			Reporter.logWithScreenShot("sucessfully visited application site", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to visit application site", MessageTypes.Fail);
		}

	}

	// Method to rate application on Apple Store
	public void rateApplication() {
		getNFKiosMoremenuPageRateThisAppLbl().waitForPresent();
		if (getNFKiosMoremenuPageRateThisAppLbl().isDisplayed()) {
			Reporter.logWithScreenShot("Rate this app label is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Rate Label is not present", MessageTypes.Fail);

	}

	// Method To Open My Account Page
	public void clickAccount() {
		LFSUtilsIOS.click(getNFKiosMoremenupageMyaccountBtn());
		Reporter.logWithScreenShot("User clicked on My Account option", MessageTypes.Pass);
	}

	// Method to verify time update switch off by default and then enable
	public void timeUpdate() {
		Boolean timeChangeSwitch = NFKiosMoremenuMyMeterAutoUpdateTimeBtn.isSelected();
		if (timeChangeSwitch == true) {
			Reporter.logWithScreenShot("Time Switch On by Default");
		} else {
			getNFKiosMoremenuMyMeterAutoUpdateTimeBtn().click();
			NFKiosMoremenuMyMeterAutoUpdateTimeBtn.isSelected();
		}
		timeChangeSwitch.compareTo(timeChangeSwitch);
		Reporter.logWithScreenShot("Time Switch Turned on by User");

	}

	// Method to open connections page
	public void clickConnections() {
		getNFKiosMoremenupageConnectionBtn().waitForPresent();
		getNFKiosMoremenupageConnectionBtn().click();
		getNFKiosMoremenupageConnectionTitle().waitForPresent();
		Reporter.logWithScreenShot("After clicking on connection switch", MessageTypes.Pass);

	}

	// Method to click and open Help page
	public void clickHelpOption() {
		try {
			LFSUtilsIOS.click(getNFKiosMoremenupageHelpBtn());
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("help.title")).assertPresent(LFSUtilsIOS.getPropString("help.title"));
			;
			Reporter.logWithScreenShot("Sucessfully clicked on help option", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on help option", MessageTypes.Fail);
		}
	}

	// Method to verify Connections page UI
	public void verifyConnetionsPage() {
		Reporter.logWithScreenShot("Connections page is displayed", MessageTypes.Pass);
		getNFKiosMoremenupageConnectionApplehealthLbl().verifyPresent(LFSUtilsIOS.getPropString("moremenu.connection.applehealth.label"));
		getNFKiosMoremenupageConnectionApplehealthSwch().verifyPresent(LFSUtilsIOS.getPropString("moremenu.connection.applehealth.label"));
		getNFKiosMoremenupageConnectionAddofficeBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.connection.addoffice.btn"));
		getNFKiosMoremenupageTermsofserviceBackBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.termofservice.back.btn"));
		getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("offices.instructions"))
				.verifyPresent(LFSUtilsIOS.getPropString("offices.instructions"));
		getNFKiosMoremenupageTermsofserviceBackBtn().click();

	}

	// Method to verify More Menu header
	public void verifyMoreMenuHeader() {
		getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("more.title"))
				.verifyPresent(LFSUtilsIOS.getPropString("more.title"));
	}

	// Method to verify incorrect office code
	public void incorrectClinicCode() {
		getNFKiosMoremenupageConnectionAddofficeBtn().click();
		Reporter.logWithScreenShot("Page to add office code is displayed", MessageTypes.Pass);
		getNFKiosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		getNFKiosMorepageaddOffceCodeBox("1").sendKeys(LFSUtilsIOS.getPropString("moremenu.addofficecode.incorrect1"));
		getNFKiosMoremenupageConnectionAddofficesearchBtn().click();
		Reporter.logWithScreenShot("After clicking search", MessageTypes.Pass);
		getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent(LFSUtilsIOS.getPropString("office.code.not.found"));
	}

	// Method to verify incorrect office code
	public void incorrectClinicCodeFormat() {

		getNFKiosMoremenupageConnectionAddofficeBtn().click();
		getNFKiosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		getNFKiosMorepageaddOffceCodeBox("1").verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.box"));
		getNFKiosMorepageaddOffceCodeBox("1").sendKeys(LFSUtilsIOS.getPropString("moremenu.addofficecode.incorrect2"));
		try {
			WebDriverTestCase.verifyTrue(!getNFKiosMorepageaddOffceCodeBox("1").getAttribute("value").contains("1"),
					"Able to enter numeric value", "Numeric value not allowed");
		} catch (Exception e) {
			Reporter.logWithScreenShot("Numeric value not allowed", MessageTypes.Pass);
		}
	}

	// Method verify connecting with valid office code

	public void validClinicCode(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosMoremenupageConnectionAddofficeBtn().click();
		// getNFKiosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		getNFKiosMorepageaddOffceCodeBox("1").verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.box"));
		getNFKiosMorepageaddOffceCodeBox("1").sendKeys(userBean.getClinicCode());
		getNFKiosMoremenupageConnectionAddofficesearchBtn().click();

		getNFKiosMoremenupageConnectionOfficereenterBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.reenter.btn"));
		getNFKiosMoremenupageConnectionOfficeyesBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.yes.btn"));
		getNFKiosMoremenupageConnectionOfficeqstLbl().verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.question.label"));
		WebDriverTestCase.verifyTrue(
				getNFKiosMorepageaddOffceCodeBox("1").getAttribute("value").contains(userBean.getClinicCode()),
				"Incorrect office name", "Correct Office name");
		getNFKiosMoremenupageConnectionOfficereenterBtn().click();
		try {
			WebDriverTestCase.verifyTrue(
					!(getNFKiosMorepageaddOffceCodeBox("1").getAttribute("value")
							.contains(userBean.getClinicCode().substring(0, 1))),
					"After clicking reenter button previous office code displaying",
					"After clicking reenter button previous office code not displaying");
		} catch (Exception e) {
			Reporter.logWithScreenShot("After clicking reenter button previous office code not displaying",
					MessageTypes.Pass);
		}

		getNFKiosMorepageaddOffceCodeBox("1").sendKeys(userBean.getClinicCode());
		getNFKiosMoremenupageConnectionAddofficesearchBtn().click();
		getNFKiosMoremenupageConnectionOfficeyesBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.yes.btn"));
		getNFKiosMoremenupageConnectionOfficeyesBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 100);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 100);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 100);
		getNFKiosMoremenupageConnectionCheckboxLbl().verifyPresent(LFSUtilsIOS.getPropString("moremenu.addofficecode.checkbox.label"));
		getNFKiosMoremenupageConnectionCheckboxLbl().click();
		getNFKiosMoremenupageConnectionAddofficesearchBtn().waitForEnabled();
		getNFKiosMoremenupageConnectionAddofficesearchBtn().click();
		getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("connections.screenTitle")).waitForPresent();
		Reporter.logWithScreenShot("Connection request submitted label", MessageTypes.Pass);

	}

	// Method to set Reminder for all options available--updated
	public void setSnackReminder(String option) {
		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		LFSUtilsIOS.click(getNFKiosMorepageStaticText(option));
		verifySetReminderScreen(option);
		enterdescription();
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderDateTimeBtn());
		selectDateTimePicker();
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderRepeatBtn());
		setRepeatPicker();
		LFSUtilsIOS.click(getNFKiosMoremenupageSetReminderSaveBtn());
		Reporter.logWithScreenShot("User has saved the Reminder", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosMorepageStaticText(option));
		verifyAddedReminder();
		LFSUtilsIOS.click(getNFKiosMoremenuPageReminderSaveOpenDeleteBtn());
		Reporter.logWithScreenShot("Delete Popup is displayed", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderDeteletPopUpDeleteBtn());
		Reporter.logWithScreenShot("User deleted the Reminder successfully", MessageTypes.Pass);
	}

	public void addReminder(String option) {
		LFSUtilsIOS.click(getNFKiosMorepageStaticText(option));
		verifySetReminderScreen(option);
		enterdescription();
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderDateTimeBtn());
		selectDateTimePicker();
		LFSUtilsIOS.click(getNFKiosMoremenupageReminderRepeatBtn());
		setRepeatPicker();
		LFSUtilsIOS.click(getNFKiosMoremenupageSetReminderSaveBtn());
		Reporter.logWithScreenShot("User has saved the Reminder", MessageTypes.Pass);
		getNFKiosMoremenuPageMydevicesBackBtn().click();
	}

	public void enterdescription() {
		String rem = "Setting the reminder";
		LFSUtilsIOS.enterText(getNFKiosMoremenuPageReminderDescription(), rem);
		ConfigurationManager.getBundle().setProperty("set.reminder.description", rem);
		Reporter.logWithScreenShot("User entered the description on set reminder screen", MessageTypes.Pass);
	}
	// method to verify reminder type max allowed size

	public void verifyReminderTypeFieldMaxLength() {
		getNFKiosMoremenupageRemindersTitle().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(36);
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getNFKiosMoremenupageReminderAddreminderFieldTxt().clear();
		getNFKiosMoremenupageReminderAddreminderFieldTxt().sendKeys(typeName);
		Validator.verifyThat("Reminder type length",
				getNFKiosMoremenupageReminderAddreminderFieldTxt().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(35));
	}

	// Method to verify reminder
	public void verifydescriptionLengthAndReminderTimePast() {
		getNFKiosMoremenupageRemindersTitle().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(61);
		clickOnAddicon();
		getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("reminder.preset.perform.glucose.test")).click();
		try {
			getNFKiosMoremenupageReminderAlertOkBtn().waitForPresent(5000);
			getNFKiosMoremenupageReminderAlertOkBtn().click();
		} catch (Exception e) {
		}
		getNFKiosMoremenupageReminderReminderDescriptionTxt().waitForPresent();
		getNFKiosMoremenupageReminderReminderDescriptionTxt().clear();
		getNFKiosMoremenupageReminderReminderDescriptionTxt().sendKeys(typeName);
		Validator.verifyThat("Reminder description max allowed charcter",
				getNFKiosMoremenupageReminderReminderDescriptionTxt().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(60));

		getNFKiosMoremenupageReminderDateTimeBtn().click();
		Point p1 = getNFKiosMoremenupageReminderDatePicker().getLocation();
		Dimension d1 = getNFKiosMoremenupageReminderDatePicker().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(point(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 70)).perform();
		LFSUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getNFKiosMoremenupageReminderDatePicker().getAttribute("value").contains("Today"),
				"Selecting past date", "picker now allowing Past date ");

		Point p2 = getNFKiosMoremenupageReminderHourPicker().getLocation();
		Dimension d2 = getNFKiosMoremenupageReminderHourPicker().getSize();
		String hour = getNFKiosMoremenupageReminderDatePicker().getAttribute("value").replaceAll("[^0-9]", "");
		tch.tap(point(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 70)).perform();
		LFSUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getNFKiosMoremenupageReminderDatePicker().getAttribute("value").contains(hour),
				"Selecting past hour", "picker now allowing Past hour ");

	}

	// reminder screen navigation
	public void reminderscreens() {

		getNFKiosMoremenuReminderAddBtn().waitForPresent();
		Reporter.logWithScreenShot("reminder screen1", MessageTypes.Pass);
		getNFKiosMoremenuReminderAddBtn().click();
		Reporter.logWithScreenShot("reminder screen2", MessageTypes.Pass);
		clickOnNewReminderBtn();
		Reporter.logWithScreenShot("reminder screen3", MessageTypes.Pass);

		if (LFSUtilsIOS.tryMethod(getNFKiosMoremenupageReminderAddReminderTypeBackBtn().get(0))) {
			toClickBackBtn();
		} else if (getONFKiosMoremenupagebackndBtn().get(0).isPresent()) {
			ToClickBackBtn2();
		}

		String eat = LFSUtilsIOS.getPropString("reminder.preset.eat");
		getNFKiosMorepageStaticText(eat).click();

		try {
			getNFKiosMoremenupageReminderAlertOkBtn().waitForPresent(5000);
			getNFKiosMoremenupageReminderAlertOkBtn().click();
		} catch (Exception e) {
		}
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		getNFKiosMoremenupageReminderDateTimeBtn().click();
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		getNFKiosMoremenupageReminderRepeatBtn().click();
		getNFKiosMoremenupageReminderRepeatBtn().click();
		Reporter.logWithScreenShot("reminder screen6", MessageTypes.Pass);
		toClickBackBtn();
		toClickBackBtn();

	}

	// Method to verify my setting screen
	public void mySettingScreen() {
		Reporter.logWithScreenShot("Setting screen1", MessageTypes.Pass);
		LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
	}

	// Click and verify clinic code screen

	public void clickAndVerifyClinicCodeScreen() {
		getNFKiosMoremenupageConnectionAddofficeBtn().click();
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
		getNFKiosMoremenupageConnectionAddofficecancelBtn().click();
	}

	public void clickMyAlerts() {
		LFSUtilsIOS.click(getNFKiosmoremenuPagemyalertsbtn());
		LFSUtilsIOS.pause(1000);
		Reporter.logWithScreenShot("My Alerts Page is Displayed", MessageTypes.Pass);
	}

	public void clicksOnShare() {
		LFSUtilsIOS.pause(1000);
		LFSUtilsIOS.click(getNFKiosmoremenuPageShareBtn());
		Reporter.logWithScreenShot("Share Page is Displayed", MessageTypes.Pass);

	}

	public void clicksOnAddFollowerBtn() {
		getNFKiosmoremenuPageShareBtn().waitForPresent();
		getNFKiosmoremenuPageShareBtn().click();
		LFSUtilsIOS.pause(1000);
		Reporter.logWithScreenShot("Share Page is Displayed", MessageTypes.Pass);

	}

	

	// Method to verify ohter country office code
	public void ohterCountryClinicCode() {
		getNFKiosMoremenupageConnectionAddofficeBtn().click();
		getNFKiosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.nl.code1").toString();
		getNFKiosMorepageaddOffceCodeBox("1").sendKeys(clinicCode);
		getNFKiosMoremenupageConnectionAddofficesearchBtn().click();
		getNFKiosMorepageStaticTextlbl(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Office code error message");
	}

	public void verifyToggleButton() {
		clickOnReminderFromMoreMenu();
		getNFKiosMoremenupageReminderSynToggleBtn().waitForPresent();
		Reporter.logWithScreenShot("Toggle button for Sync my readings is pesent", MessageTypes.Pass);
		if (getNFKiosMoremenupageReminderSynToggleBtn().getAttribute("enabled").equalsIgnoreCase("false")) {
			getNFKiosMoremenupageReminderSynToggleBtn().click();
			Reporter.logWithScreenShot("Toggle button is clicked to ON ", MessageTypes.Pass);
		} else if (getNFKiosMoremenupageReminderSynToggleBtn().getAttribute("enabled").equalsIgnoreCase("true")) {
			getNFKiosMoremenupageReminderSynToggleBtn().click();
			Reporter.logWithScreenShot("Toggle button is clicked to OFF ", MessageTypes.Pass);
		}

	}

	public void verifyToggleButtonDisabled() {
		clickOnReminderFromMoreMenu();
		getNFKiosMoremenupageReminderSynToggleBtn().waitForPresent();
		if (getNFKiosMoremenupageReminderSynToggleBtn().getAttribute("enabled").equalsIgnoreCase("false")) {
			Reporter.logWithScreenShot("Sync toggle button is disabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sync toggle button is not disabled", MessageTypes.Fail);
		}
	}

	public void verifyToggleButtonON() {
		clickOnReminderFromMoreMenu();
		getNFKiosMoremenupageReminderSynToggleBtn().waitForPresent();
		if (getNFKiosMoremenupageReminderSynToggleBtn().getAttribute("value").equalsIgnoreCase("1")) {
			Reporter.logWithScreenShot("Toggle button switch is ON", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Toggle button switch is OFF", MessageTypes.Fail);

		}
	}

	EventLogPageIOS log = new EventLogPageIOS();

	public void verifyRateUsLabel() {
		log.getNFKiosEventLogPageStaticText(ConfigurationManager.getBundle().getString("rateUs.message"))
				.waitForPresent();
		log.getNFKiosEventLogPageStaticText(ConfigurationManager.getBundle().getString("rateUs.message"))
				.verifyPresent(ConfigurationManager.getBundle().getString("rateUs.message"));

	}
	public void navigateToHomepage() {

		new HomePageIOS().getNFKiosHomepageHomeBtn().verifyPresent("Home page");
	}

	public void verifyAddPlusBtnOnMyRemindersPage() {

		if (getNFKiosMoremenuReminderAddBtn().isDisplayed()) {
			Reporter.logWithScreenShot("Add Plus button for reminders present as per requirement", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Add Plus button for reminders not present as per requirement",
					MessageTypes.Fail);
		}
	}

	// method to click on my device
	public void clickOnMyDevices() {
		getNFKiosMoremenuPageMydevicesBtn().isPresent();
		getNFKiosMoremenuPageMydevicesBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("After clicking on My Devices ", MessageTypes.Pass);
	}

	public void verifyNavigationToChooseReminder() {
		if (getNFKiosMoremenuPageReminderNameTxt("Choose Reminder").isPresent()) {
			Reporter.logWithScreenShot("Choose Reminder heading present", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Choose Reminder heading not present", MessageTypes.Fail);
		}
	}

	public void verifyListOfReminder(Object reminderName) {
		ReminderDetailsBeans reminderBean = new ReminderDetailsBeans();

		if (reminderName instanceof String) {

			reminderBean.fillFromConfig((String) reminderName);
		} else {
			reminderBean.fillData(reminderName);
		}

		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt1"));
		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt2"));
		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt3"));
		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt4"));
		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt5"));
		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt6"));
		getNFKiosMoremenuPageReminderNameTxt(reminderBean.getGlucose()).verifyPresent(LFSUtilsIOS.getPropString("moremenu.remindername.txt7"));

		if (getNFKiosMoremenuPageReminderNameTxt("New Reminder").isDisplayed()) {
			Reporter.logWithScreenShot("New Reminder button present on Choose Reminder page", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("New Reminder button not present on Choose Reminder page", MessageTypes.Fail);
		}
	}

	public void createNewReminder(String reminderName) {
		if (getNFKiosMoremenuPageReminderNameTxt(reminderName).isPresent()) {
			getNFKiosMoremenuPageReminderNameTxt(reminderName).click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("New selected reminder name clicked", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("New selected reminder name not present", MessageTypes.Fail);
		}
	}

	public void verifyNavigationToSetReminder() {
		if (getNFKiosMoremenuPageReminderNameTxt("Set Reminder").isPresent()) {
			Reporter.logWithScreenShot("Set Reminder heading present", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Set Reminder heading not present", MessageTypes.Fail);
		}
	}

	public void verifySetReminderPageDetails(String reminderName) {

		if (getNFKiosMoremenuPageReminderNameTxt("Save").isPresent()) {
			Reporter.logWithScreenShot("Save button present on Set Reminder page", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Save button not present on Set Reminder page", MessageTypes.Fail);
		}

		getNFKiosMoremenuPageReminderNameTxt(reminderName).verifyPresent("Reminder name present");

		if (getNFKiosMoremenuPageReminderNameTxt("Enter description").getAttribute("name").equals("Enter description"))
			Reporter.logWithScreenShot("Enter description text box present with default text", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Enter description text box not present with default text", MessageTypes.Fail);

		if (getNFKiosMoremenupageReminderDateTimeBtn().isPresent())
			Reporter.logWithScreenShot("Date and time button present", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Date and time button not present", MessageTypes.Fail);

		if (getNFKiosMoremenupageReminderRepeatBtn().isPresent())
			Reporter.logWithScreenShot("Repeat reminder button present", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Repeat reminder button not present", MessageTypes.Fail);
	}

	public void clickDateOfSetReminder() {

		if (getNFKiosMoremenupageReminderDateTimeBtn().isPresent()) {
			getNFKiosMoremenupageReminderDateTimeBtn().click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("Date and time popup opened", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Date and time not button not present", MessageTypes.Fail);
		}
	}

	public void verifySetReminderByUser(String reminderName) {

		LFSUtilsIOS.waitforLoad();

		while (!getNFKiosMoremenuPageReminderNameTxt("OneTouch�Reveal�").isPresent()) {
			try {
				Thread.sleep(80000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (getNFKiosMoremenuPageReminderNameTxt("OneTouch�Reveal�").isDisplayed()) {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder popup screen displayed", MessageTypes.Pass);

			if (getNFKiosMoremenuPageReminderNameTxt(reminderName).isDisplayed()) {
				LFSUtilsAndroid.waitforLoad();
				Reporter.logWithScreenShot("Reminder title displayed on popup screen", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Reminder title popup not displayed", MessageTypes.Pass);
			}

			getNFKiosMoremenuPageReminderNameTxt("OK").click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Reminder popup closed", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Reminder popup screen not displayed", MessageTypes.Fail);
		}
	}

	// verify added office on connection screen
	public void verifyAddedOfficeName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenupageConnectionAddedofficenameLbl(userBean.getOfficName()).waitForPresent();

		WebDriverTestCase.verifyTrue(
				getNFKiosMoremenupageConnectionAddedofficenameLbl(userBean.getOfficName()).isPresent(),
				"Incorrect clinic name", "Correct clinic name");
		getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("office.code.withdraw")).assertPresent(LFSUtilsIOS.getPropString("office.code.withdraw"));
		getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("office.code.pending"))
				.assertPresent(LFSUtilsIOS.getPropString("office.code.pending"));

	}

	public void scrollToElementConnectionPage(QAFWebElement element) {

		getNFKiosMoremenupageConnectionDoneBtn().waitForPresent();
		if (getNFKiosMoremenupageConnectionDoneBtn().getAttribute("visible").equalsIgnoreCase("true")) {
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

	public void addmultipleRemainders(int times, String reminderName, String date, String flag) {

		clickOnReminderFromMoreMenu();
		for (int i = 0; i < times; i++) {
			// LogbookPageAndroid logBookPage = new LogbookPageAndroid();
			clickOnAddicon();
			createNewReminder(reminderName);
			clickDateOfSetReminder();
			selectDateTimePicker();
			addReminderDetails(date, flag);
		}

	}

	private void addReminderDetails(String date, String flag) {
		if (flag.equalsIgnoreCase("Daily")) {
			getNFKiosMoremenupageReminderRepeatBtn().click();
			// getNFKiOSMoreMenuReminderspageSelectRepeatOptionBtn().click();
			setRepeatPicker();
			clickSaveBtn();

			LFSUtilsIOS.waitforLoad();
		} else if (flag.equalsIgnoreCase("Weekly")) {
			getNFKiosMoremenupageReminderRepeatBtn().click();
			setRepeatPicker();
			clickSaveBtn();

			LFSUtilsIOS.waitforLoad();
		} else if (flag.equalsIgnoreCase("Monthly")) {
			getNFKiosMoremenupageReminderRepeatBtn().click();
			setRepeatPicker();
			clickSaveBtn();

			LFSUtilsIOS.waitforLoad();
		} else if (flag.equalsIgnoreCase("Annually")) {
			getNFKiosMoremenupageReminderRepeatBtn().click();
			setRepeatPicker();
			clickSaveBtn();
			LFSUtilsIOS.waitforLoad();
		}
	}

	public void verifyListofremainders() {
		try {
			int listremainders = getNFKiosmoremenureminderspageremindertitlelist().size();
			for (int i = 0; i <= listremainders - 1; i++) {
				// String remainders=
				Reporter.logWithScreenShot(
						"displayed reminders: "
								+ getNFKiosmoremenureminderspageremindertitlelist().get(i).getText().toString(),
						MessageTypes.Pass);
			}
		} catch (Exception e) {

		}
	}

	public void verifyMaximumReminderPopup() {
		clickOnAddicon();
		getNFKiosMoremenuReminderspagePopupTitle().isPresent();
		Reporter.logWithScreenShot("Maximum Reminders reached popup", MessageTypes.Pass);
		getNFKiosMorepageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent();
		getNFKiosMorepageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();

	}

	public void verifyConnectedStatus() {
		try {
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("clinic.name")).assertPresent(LFSUtilsIOS.getPropString("clinic.name"));
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("clinic.status.connected")).assertPresent(LFSUtilsIOS.getPropString("clinic.status.connected"));
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("clinic.phone.no")).assertPresent(LFSUtilsIOS.getPropString("clinic.phone.no"));
			Reporter.log("Verified the Connected Status of Clinic", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify connected status", MessageTypes.Fail);
		}
	}

	public void verifyPopup(String option) {
		switch (option) {
		case "Stop Sharing Data":
			clickOnClinicPhoneno();

			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("appCommon.cancel")).isPresent();
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("office.code.call")).isPresent();
			LFSUtilsIOS.click(getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("appCommon.cancel")));
			clickOnClinicPhoneno();
			clickOnCallBtn();
			Reporter.logWithScreenShot("User has clicked on Call Button", MessageTypes.Pass);
			break;

		default:
			break;
		}

	}

	private void clickOnClinicPhoneno() {
		try {
			LFSUtilsIOS.click(getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("clinic.phone.no")));
			Reporter.logWithScreenShot("Sucessfully clicked on clinic phone no", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to clicked on clinic phone no", MessageTypes.Fail);
		}
	}

	private void clickOnCallBtn() {
		try {
			LFSUtilsIOS.click(getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("office.code.call")));
			Reporter.logWithScreenShot("Sucessfully clicked on call btn", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to clicked on call btn", MessageTypes.Fail);
		}
	}

	public void verifydeclinedStatus() {
		try {
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("clinic.name")).assertPresent(LFSUtilsIOS.getPropString("clinic.name"));
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("office.code.declined"))
					.assertPresent(LFSUtilsIOS.getPropString("office.code.declined"));
			getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("office.code.delete")).assertPresent(LFSUtilsIOS.getPropString("office.code.delete"));
			Reporter.log("Verified the Declined Status of Clinic", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify declined status of clinic", MessageTypes.Fail);
		}
	}

	// verify My device screen
	public void verifyMyDevicesScreenWithouSensor() {
		try {
			getNFKiosMydevicestitle().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.title"));
			getNFKiosMyDevicesStartSensorsessionbtn().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.startsensorsession"));
			getNFKiosMyDevicesintegratedtitle().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.integrated.title"));
			getNFKiosMyDevicesiIcon().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.device.icon"));
			getNFKiosMyDevicesAdddevicebtn().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.device.icon"));
			getNFKiosMyDevicesiIcon().click();
			getNFKiosMoremenuPageMydevicesIconTitle().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.adddevice.icon.title"));
			getNFKiosMoremenuPageMydevicesIconMsgTxt().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.adddevice.msg.txt"));
			getNFKiosMoremenuPageMydevicesIconCloseBtn().click();
			Reporter.logWithScreenShot("User verified my devices screen without sensor", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify my devices screen without sensor", MessageTypes.Fail);
		}
	}

	// Click on Start sensor Senssion and pair sensor back button operation
	public void startsensorsession() {

		getNFKiosMyDevicesStartSensorsessionbtn().isPresent();
		getNFKiosMyDevicesStartSensorsessionbtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User is on Pair Sensor screen", MessageTypes.Pass);
		getNFKiosApplysorBackbtn().click();
		getNFKiosMyDevicesStartSensorsessionbtn().click();
		LFSUtilsIOS.waitforLoad();

	}

	// Verify pair sensor screen
	public void verifypairsensor() {

		getNFKiosPairSensorTitle().isPresent();
		getNFKiosPairSensorscreentext().isPresent();
		getNFKiosPairSensorpairingcode().isPresent();
		getNFKiosPairSensorUseCodeScannerBtn().isPresent();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User is on Pair Sensor screen", MessageTypes.Pass);
	}

	public void clickOnOrderSupplies() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 100);
		getNFKiosMoremenuPageOrdersuppliesBtn().waitForPresent(100);
		getNFKiosMoremenuPageOrdersuppliesBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User has Clicked on Order Supplies and Browser displayed", MessageTypes.Pass);
	}

	// CGM Automation

	

	public void sensorDetails() {
		if (getNFKiosmoremenuPageMydevicesSensorUnpairbtn().isPresent()
				&& getNFKiosmoremenuPageMydevicesSensorStopbtn().isPresent()) {
			Reporter.logWithScreenShot("Sensor is paried with the app", MessageTypes.Pass);
			getNFKiosMoremenuPageMydevicesSensorName().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.name"));
			getNFKiosMoremenuPageMydevicesSensorNumber().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.number"));
			getNFKiosMoremenuPageMydevicesSensorPairCode().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.paircode"));
			getNFKiosMoremenuPageMydevicesSensorPairStatus().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.pairstatus"));
			getNFKiosMoremenuPageMydevicesSensorSessionDetails().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.session.details"));
			getNFKiosMoremenuPageMydevicessensorDateExpire().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.expiredate"));
			getNFKiosMoremenuPageMydevicesSensorLocation().assertPresent(LFSUtilsIOS.getPropString("moremenu.mydevices.sensor.location"));
			Reporter.logWithScreenShot("user able to verify Sensor details", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("user not able to verify Sensor details", MessageTypes.Fail);
		}
	}

	public void ClickStopSensor() {
		try {
			if (getNFKiosmoremenuPageMydevicesSensorStopbtn().isPresent()) {
				getNFKiosmoremenuPageMydevicesSensorStopbtn().click();
				Reporter.logWithScreenShot("user clicked on Stop sensor button", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("user not able click on Stop sensor button", MessageTypes.Fail);
		}
	}

	public void verifyStopSensorScreen() {
		try {
			getNFKiosMoremenuPageMydevicesStopsensor().get(0).verifyPresent(LFSUtilsIOS.getPropString("moremenu.stopsensor.popup.stop.btn"));
			getNFKiosMoremenuPageMydevicesCancelBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.stopsensor.popup.cancel.btn"));
			getNFKiosMoremenuPageMydevicesSensorInstructionLink().verifyPresent(LFSUtilsIOS.getPropString("moremenu.removesensor.instructions"));
			if (getNFKiosMoremenuPageMydevicesStopsensor().get(0).getText().contains("Stop Sensor")) {
				getNFKiosMoremenuPageMydevicesCancelBtn().click();
				getNFKiosMydevicestitle().waitForPresent();
				Reporter.logWithScreenShot("User redirected to my devices screen after clicking on cancel button",
						MessageTypes.Pass);
				verifyRemoveSensorScreen();
				verifyStopSensorPopup();
				getNFKiosMoremenuPageMydevicesStopsensor().get(0).click();
				getNFKiosMoremenuPageStopSensorPopupStopBtn().click();
				Reporter.logWithScreenShot("user verified stop sensor screen", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify stop sensor screen", MessageTypes.Fail);
		}
	}

	public void verifyRemoveSensorScreen() {
		try {
			getNFKiosmoremenuPageMydevicesSensorStopbtn().click();
			getNFKiosMoremenuPageMydevicesSensorInstructionLink().click();
			getNFKiosMoremenuPageRemoveSensorTile().verifyPresent(LFSUtilsIOS.getPropString("moremenu.removesensor.title"));
			getNFKiosMoremenuPageRemoveSensorDoneBtn().verifyPresent(LFSUtilsIOS.getPropString("appCommon.done"));
			getNFKiosMoremenuPageRemoveSensorInstructionaText().verifyPresent(LFSUtilsIOS.getPropString("moremenu.removesensor.instructions"));
			getNFKiosMoremenuPageRemoveSensorImage().verifyPresent(LFSUtilsIOS.getPropString("moremenu.removesensor.image"));
			Reporter.logWithScreenShot("user verified remove sensor screen", MessageTypes.Pass);
			getNFKiosMoremenuPageRemoveSensorDoneBtn().click();

		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify remove sensor screen", MessageTypes.Fail);
		}

	}

	public void verifyStopSensorPopup() {
		try {
			getNFKiosMoremenuPageMydevicesStopsensor().get(0).click();
			getNFKiosMoremenuPageStopSensorPopupTitle().verifyPresent(LFSUtilsIOS.getPropString("moremenu.stopsensor.popup.title"));
			getNFKiosMoremenuPageStopSensorPopupStopBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.stopsensor.popup.stop.btn"));
			getNFKiosMoremenuPageStopSensorPopupCancelBtn().verifyPresent(LFSUtilsIOS.getPropString("moremenu.stopsensor.popup.cancel.btn"));
			Reporter.logWithScreenShot("User Verified stop sensor popup", MessageTypes.Pass);
			getNFKiosMoremenuPageStopSensorPopupCancelBtn().click();
			getNFKiosMoremenuPageMydevicesSensorInstructionLink().waitForPresent();
			Reporter.logWithScreenShot("User redirected to stop sensor screen after clicking on cancel button of popup",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify stop sensor popup", MessageTypes.Fail);
		}
	}

	public void clickOnUnpairSensor() {
		getNFKiosmoremenuPageMydevicesSensorUnpairbtn().click();
	}
	
	public void stopsensor() {
		getNFKiosMoremenuPageMydevicesStopsensor().get(0).click();
		getNFKiosMoremenuPageStopSensorPopupTitle().verifyPresent(LFSUtilsIOS.getPropString("moremenu.stopsensor.popup.title"));
		getNFKiosMoremenuPageStopSensorPopupStopBtn().click();
	}
	

	
	public void clickOnOptincheckbox() {
		try {
		LFSUtilsIOS.swipePage();
		getNFKiosMoremenuAccountoptincheckbox().isPresent();
		getNFKiosMoremenuAccountoptincheckbox().click();
		Reporter.logWithScreenShot("User successfully clicked on opt-in checkbox",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to click on opt-in checkbox", MessageTypes.Fail);
		 }
	}
	
	public void verifyoptinscreen() {
		try {
		getNFKiosMoremenuAccountoptintitle().assertPresent(LFSUtilsIOS.getPropString("moremenu.account.optin.title"));
		getNFKiosMoremenuAccountoptincancelbtn().assertPresent(LFSUtilsIOS.getPropString("appCommon.cancel"));
		getNFKiosMoremenuAccountoptinagreebtn().assertPresent(LFSUtilsIOS.getPropString("termsAndCond.agree"));
		getNFKiosMoreMenupageStaticTextBtn(LFSUtilsIOS.getPropString("optin.text"))
		.assertPresent(LFSUtilsIOS.getPropString("optin.text"));
		Reporter.logWithScreenShot("User successfully verified opt-in screen",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to verify opt-in screen", MessageTypes.Fail);
		 }
		}
	
	public void clickCanceloptin() {
		try {
		LFSUtilsIOS.click(getNFKiosMoremenuAccountoptincancelbtn());
//		clickOnOptincheckbox();
		Reporter.logWithScreenShot("User successfully clicked on cancel, optin checkbox",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to click on cancel checkbox", MessageTypes.Fail);
		 }	
	}
	public void clickOnagreenandverifyoptincheckbox() {
		try {
		getNFKiosMoremenuAccountoptinagreebtn().click();
		getNFKiosMoremenuAccountoptincheckbox().isSelected();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User successfully clicked on agree button, user is on account screen and verified check box is selected",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to click on agree button and fail to verify checkbox selected or not", MessageTypes.Fail);
		 }
		}
	public void userdeselectoptin() {
		try {
		getNFKiosMoremenuAccountoptincheckbox().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User successfully de-select opt-in checkbox",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to de-select checkbox", MessageTypes.Fail);
		 }
	}
	
	public void reselectandCancel() {
		try {
		clickOnOptincheckbox();
		LFSUtilsIOS.click(getNFKiosMoremenuAccountoptincancelbtn());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User successfully reselect opt-in checkbox and use redirected to optin screen and clicked on cancel",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to reselect checkbox and click cancel", MessageTypes.Fail);
		 }
	}
	
	public void unpairSensor() {
		SensorPairPageIOS sensorPage=new SensorPairPageIOS();
		getNFKiosmoremenuPageMydevicesSensorUnpairbtn().click();
		sensorPage.getNFKiosSensorpairingUpairSensorUnpairbtn().click();
		clickOnBackButton();
	}
	
	public void clickOnBackButton() {
		getNFKiosMoremenuPageMydevicesBackBtn().click();
	}
	
	
	
	/*
	 * Author: Sachin Implemented to verify the connected clinic count on
	 * connections page
	 */
	public void verifyAddedClinics() {
		try {
			int clinicCount = getNFKiosMoremenuPageClinicConnections().size();
			if (clinicCount == 20) {
				Assert.assertTrue(true);
				Reporter.logWithScreenShot("Successfully verified that patient count is to 20 different clinic",
						MessageTypes.Pass);
			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Unable to verify that patient count is to 20 different clinic",
					MessageTypes.Fail);
		}
	}
	
	/*
	 * Author: Sachin Implemented to sort the connected clinics in alphabetical
	 * order
	 */
	public void verifyClinicInAlphabeticalFormat() {
		try {
			List<QAFWebElement> items = getNFKiosConnectionPageClinicInAlphabeticalFormat();
			ArrayList<String> originalist = new ArrayList<String>();
			for (int i = 0; i < items.size() - 1; i++) {
				originalist.add(items.get(i).getText());
			}
			ArrayList<String> templist = new ArrayList<String>(originalist);
			Collections.sort(originalist);
			Assert.assertEquals(originalist, templist);
			Reporter.logWithScreenShot("Verified that clinic displays in alphabetical format", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to Verify that clinic displays in alphabetical format", MessageTypes.Fail);
		}

	}

	/*
	 * Author: Sachin Implemented to verify the connections page
	 */
	public void verifyConnetionsPageUI() {
		try {
			getNFKiosConnectionPageHeader().verifyPresent("Connections");
			getNFKiosConnectionCareTeamTitle().verifyPresent("Care Team");
			Reporter.logWithScreenShot("Connections page is displayed", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Conection page not displayed", MessageTypes.Fail);
		}
	}

	/*
	 * Author: Sachin Implemented to verify 'maximum clinic reached' validation
	 * popup
	 */
	public void tapOnAddClinicBtn() {
		try {
			getNFKiosTapOnAddClinicBtn().waitForPresent(10000);
			LFSUtilsIOS.click(getNFKiosTapOnAddClinicBtn());
			Reporter.logWithScreenShot("Successfully clicked on plus button", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on plus button", MessageTypes.Fail);
		}
	}

	/*
	 * Author: Sachin Implemented to verify 'maximum clinic reached' validation
	 * popup
	 */
	public void verifyPopupMessage() {
		try {
			getNFKiosConnectionPageAddClinicBtnPopupMessageText().waitForPresent(20000);
			getNFKiosConnectionPageAddClinicBtnPopupMessageText().verifyPresent("Maximum Clinics Reached");
			getNFKiosConnectionPageAddClinicBtnPopupMessageOkBtn().verifyPresent("OK");
			Reporter.logWithScreenShot("Successfully verified limit exceed popup message", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify limit exceed popup message", MessageTypes.Fail);
		}

	}

	/*
	 * Author: Sachin Implemented to click on click on popup 'Ok' button
	 */
	public void tapOnOkBtn() {
		LFSUtilsIOS.click(getNFKiosConnectionPageAddClinicBtnPopupMessageOkBtn());
		Reporter.logWithScreenShot("user clicked ok button", MessageTypes.Pass);
	}


}
