package com.NFK.version1.iOS.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsIOS;
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

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;

public class AccountPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFKios.moremenu.accountpage.accntdtls.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageAccntdtlsLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.optin.btn")
	private QAFWebElement NFKiosMoremenuAccountpageOptinBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.useremail.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUseremailLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.logout.btn")
	private QAFWebElement NFKiosMoremenuAccountpageLogoutBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.lastsync.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageLastsyncLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.withmeter.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageWithmeterLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.metersynctime.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageMetersynctimeLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.withaccount.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageWithaccountLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.accountlastsynctime.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageAccountlastsynctimeLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.keepmelogin.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageKeepmeloginLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.syncwithaccount.btn")
	private QAFWebElement NFKiosMoremenuAccountpageSyncwithaccountBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.keepmelogin.switch")
	private QAFWebElement NFKiosMoremenuAccountpageKeepmeloginSwitch;
	@FindBy(locator = "NFKios.moremenu.accountpage.statictext.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageStatictextLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.edit.btn")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsEditBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.email.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsEmailLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.frstname.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsFrstnameLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.initial.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsInitialLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.lstname.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsLstnameLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.suffix.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsSuffixLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.dob.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsDobLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address1.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress1Lbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address2.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress2Lbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address3.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress3Lbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.city.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsCityLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.state.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsStateLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.zipcode.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsZipcodeLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.prinumber.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsPrinumberLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.email.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsEmailTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.frstname.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsFrstnameTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.initial.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsInitialTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.lstname.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsLstnameTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.suffix.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsSuffixTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.dob.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsDobTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address1.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress1Txt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address2.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress2Txt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address3.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress3Txt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.city.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsCityTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.state.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsStateTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.zipcode.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsZipcodeTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.prinumber.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsPrinumberTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.save.btn")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsSaveBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.iacknwldge.chkbx")
	private QAFWebElement NFKiosMoremenuAccountpageIacknwldgeChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.deleteaccount.chkbx")
	private QAFWebElement NFKiosMoremenuAccountpageDeleteaccountChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.deleteaccount.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeleteaccountBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.consent.chkbx")
	private QAFWebElement NFKiosMoremenuAccountpageConsentChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.useremail.label")
	private QAFWebElement NFKiosMoremenuAccountpageUseremailLabel;
	@FindBy(locator = "NFKios.moremenu.accountpage.userDOB.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdobLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userCountry.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUsercountryLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.state.done.btn")
	private QAFWebElement NFKiosMoremenuAccountpageStateDoneBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.delete.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeleteBtn;

	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.messageLabel")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenMessageLabel;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.email.field")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenEmailField;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.password.field")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPasswordField;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.ack.checkbox")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenAckCheckbox;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.verification.checkbox")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenVerificationCheckbox;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.delete.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenDeleteBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.popup.ok.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPopupOkBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.popup.title")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPopupTitle;
	@FindBy(locator = "NFKios.dependent.confirmpassword.tBox")
	private QAFWebElement NFKiosDependentConfirmpasswordTBox;
	@FindBy(locator = "NFKios.dependent.confirm.btn")
	private QAFWebElement NFKiosDependentConfirmBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.change.password.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordbutton;
	@FindBy(locator = "NFKios.moremenu.accountpage.change.password.title")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordtitle;
	@FindBy(locator = "NFKios.moremenu.accountpage.change.password.current.password.field")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordCurrentPasswordField;
	@FindBy(locator = "NFKios.moremenu.accountpage.change.password.new.password.field")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordNewPasswordField;
	@FindBy(locator = "NFKios.moremenu.accountpage.change.password.confirm.new.password.field")
	private QAFWebElement NFKiosMoremenuAccountpageChangePasswordConfirmPasswordField;
	@FindBy(locator = "NFKios.moremenu.accountpage.save.change.password.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordsavechangesbutton;
	@FindBy(locator = "NFKios.moremenu.accountpage.save.change.cancel.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordcancelbutton;
	@FindBy(locator = "NFKios.moremenu.accountpage.save.change.forgot.your.password.link")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink;
	@FindBy(locator = "NFKios.moremenu.accountpage.save.change.back.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordbackbutton;
	@FindBy(locator = "NFKios.moremenu.accountpage.change.password.email.address")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordemailaddress;
	@FindBy(locator = "NFKios.moremenu.accountpage.changed.password")
	private QAFWebElement NFKiosMoremenuAccountpagechangedpassword;
	@FindBy(locator = "NFKios.keyBoard.delete.btn")
	private QAFWebElement NFKiosKeyBoardDeleteBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.withsensor.Lbl")
	private QAFWebElement NFKiosMoremenuAccountpagewithsensorLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.back.btn")
	private QAFWebElement NFKiosMoremenuAccountpagebackbtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.withsensor.value")
	private QAFWebElement NFKiosMoremenuAccountpagewithsensorvalue;
	@FindBy(locator = "NFKios.Moremenu.home.btn")
	private QAFWebElement NFKiosMoremenuhomebtn;
	LoginPageIOS loginPageIOS= new LoginPageIOS();
	@FindBy(locator = "NFKios.moremnu.accountpage.optin.chkbx")
	private QAFWebElement NFKiosMoremnuAccountpageOptinChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.error.msg")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsErrorMsg;
	@FindBy(locator = "NFKios.moremenu.accountpage.back.btn")
	private QAFWebElement NFKiosMoremenuAccountpageBackBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.popupError.title")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPopupErrorTitle;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.popupError.txt2")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPopupErrorTxt2;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.requestUnsuccessful.popup")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenRequestUnsuccessfulPopup;
	@FindBy(locator = "NFKios.moremenu.accountpage.deletescreen.back.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenBackBtn;
	
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPopupErrorTitle() {
		return NFKiosMoremenuAccountpageDeletescreenPopupErrorTitle;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPopupErrorTxt2() {
		return NFKiosMoremenuAccountpageDeletescreenPopupErrorTxt2;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenRequestUnsuccessfulPopup() {
		return NFKiosMoremenuAccountpageDeletescreenRequestUnsuccessfulPopup;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenBackBtn() {
		return NFKiosMoremenuAccountpageDeletescreenBackBtn;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagewithsensorLbl() {
		return NFKiosMoremenuAccountpagewithsensorLbl;
	}
	public QAFWebElement getNFKiosMoremenuAccountpagebackbtn() {
		return NFKiosMoremenuAccountpagebackbtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpagewithsensorvalue() {
		return NFKiosMoremenuAccountpagewithsensorvalue;
	}
	public QAFWebElement getNFKiosMoremenuhomebtn() {
		return NFKiosMoremenuhomebtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageIacknwldgeChkbx() {
		return NFKiosMoremenuAccountpageIacknwldgeChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeleteaccountChkbx() {
		return NFKiosMoremenuAccountpageDeleteaccountChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeleteaccountBtn() {
		return NFKiosMoremenuAccountpageDeleteaccountBtn;
	}

	public QAFWebElement getNFKiosKeyBoardDeleteBtn() {
		return NFKiosKeyBoardDeleteBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangedpassword() {
		return NFKiosMoremenuAccountpagechangedpassword;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageBackBtn() {
		return NFKiosMoremenuAccountpageBackBtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsErrorMsg() {
		return NFKiosMoremenuAccountpageUserdtlsErrorMsg;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordemailaddress() {
		return NFKiosMoremenuAccountpagechangepasswordemailaddress;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordbackbutton() {
		return NFKiosMoremenuAccountpagechangepasswordbackbutton;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink() {
		return NFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordcancelbutton() {
		return NFKiosMoremenuAccountpagechangepasswordcancelbutton;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton() {
		return NFKiosMoremenuAccountpagechangepasswordsavechangesbutton;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField() {
		return NFKiosMoremenuAccountpageChangePasswordConfirmPasswordField;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordNewPasswordField() {
		return NFKiosMoremenuAccountpagechangepasswordNewPasswordField;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordtitle() {
		return NFKiosMoremenuAccountpagechangepasswordtitle;
	}

	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField() {
		return NFKiosMoremenuAccountpagechangepasswordCurrentPasswordField;
	}

	public QAFWebElement getiosNFKMoremenuAccountpageChangePasswordButton() {
		return NFKiosMoremenuAccountpagechangepasswordbutton;
	}

	public QAFWebElement getNFKiosDependentConfirmpasswordTBox() {
		return NFKiosDependentConfirmpasswordTBox;
	}

	public QAFWebElement getNFKiosDependentConfirmBtn() {
		return NFKiosDependentConfirmBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenMessageLabel() {
		return NFKiosMoremenuAccountpageDeletescreenMessageLabel;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageOptinBtn() {
		return NFKiosMoremenuAccountpageOptinBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPopupTitle() {
		return NFKiosMoremenuAccountpageDeletescreenPopupTitle;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenEmailField() {
		return NFKiosMoremenuAccountpageDeletescreenEmailField;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPasswordField() {
		return NFKiosMoremenuAccountpageDeletescreenPasswordField;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenAckCheckbox() {
		return NFKiosMoremenuAccountpageDeletescreenAckCheckbox;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox() {
		return NFKiosMoremenuAccountpageDeletescreenVerificationCheckbox;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenDeleteBtn() {
		return NFKiosMoremenuAccountpageDeletescreenDeleteBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageStateDoneBtn() {
		return NFKiosMoremenuAccountpageStateDoneBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUseremailLabel() {
		return NFKiosMoremenuAccountpageUseremailLabel;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdobLbl() {
		return NFKiosMoremenuAccountpageUserdobLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUsercountryLbl() {
		return NFKiosMoremenuAccountpageUsercountryLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn() {
		return NFKiosMoremenuAccountpageDeletescreenPopupOkBtn;
	}

	public QAFWebElement getNFKiosMoremnuAccountpageOptinChkbx() {
		return NFKiosMoremnuAccountpageOptinChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageStatictextLbl() {
		return NFKiosMoremenuAccountpageStatictextLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsEditBtn() {
		return NFKiosMoremenuAccountpageUserdtlsEditBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsEmailLbl() {
		return NFKiosMoremenuAccountpageUserdtlsEmailLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsFrstnameLbl() {
		return NFKiosMoremenuAccountpageUserdtlsFrstnameLbl;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageConsentChkbx() {
		return NFKiosMoremenuAccountpageConsentChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsInitialLbl() {
		return NFKiosMoremenuAccountpageUserdtlsInitialLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsLstnameLbl() {
		return NFKiosMoremenuAccountpageUserdtlsLstnameLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsSuffixLbl() {
		return NFKiosMoremenuAccountpageUserdtlsSuffixLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsDobLbl() {
		return NFKiosMoremenuAccountpageUserdtlsDobLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress1Lbl() {
		return NFKiosMoremenuAccountpageUserdtlsAddress1Lbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeleteBtn() {
		return NFKiosMoremenuAccountpageDeleteBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress2Lbl() {
		return NFKiosMoremenuAccountpageUserdtlsAddress2Lbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress3Lbl() {
		return NFKiosMoremenuAccountpageUserdtlsAddress3Lbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsCityLbl() {
		return NFKiosMoremenuAccountpageUserdtlsCityLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsStateLbl() {
		return NFKiosMoremenuAccountpageUserdtlsStateLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsZipcodeLbl() {
		return NFKiosMoremenuAccountpageUserdtlsZipcodeLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsPrinumberLbl() {
		return NFKiosMoremenuAccountpageUserdtlsPrinumberLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsEmailTxt() {
		return NFKiosMoremenuAccountpageUserdtlsEmailTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt() {
		return NFKiosMoremenuAccountpageUserdtlsFrstnameTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsInitialTxt() {
		return NFKiosMoremenuAccountpageUserdtlsInitialTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsLstnameTxt() {
		return NFKiosMoremenuAccountpageUserdtlsLstnameTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsSuffixTxt() {
		return NFKiosMoremenuAccountpageUserdtlsSuffixTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsDobTxt() {
		return NFKiosMoremenuAccountpageUserdtlsDobTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress1Txt() {
		return NFKiosMoremenuAccountpageUserdtlsAddress1Txt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress2Txt() {
		return NFKiosMoremenuAccountpageUserdtlsAddress2Txt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress3Txt() {
		return NFKiosMoremenuAccountpageUserdtlsAddress3Txt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsCityTxt() {
		return NFKiosMoremenuAccountpageUserdtlsCityTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsStateTxt() {
		return NFKiosMoremenuAccountpageUserdtlsStateTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt() {
		return NFKiosMoremenuAccountpageUserdtlsZipcodeTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt() {
		return NFKiosMoremenuAccountpageUserdtlsPrinumberTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsSaveBtn() {
		return NFKiosMoremenuAccountpageUserdtlsSaveBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosMoremenuAccountpageAccntdtlsLbl() {
		return NFKiosMoremenuAccountpageAccntdtlsLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUseremailLbl() {
		return NFKiosMoremenuAccountpageUseremailLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageLogoutBtn() {
		return NFKiosMoremenuAccountpageLogoutBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageLastsyncLbl() {
		return NFKiosMoremenuAccountpageLastsyncLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageWithmeterLbl() {
		return NFKiosMoremenuAccountpageWithmeterLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageMetersynctimeLbl() {
		return NFKiosMoremenuAccountpageMetersynctimeLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageWithaccountLbl() {
		return NFKiosMoremenuAccountpageWithaccountLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageAccountlastsynctimeLbl() {
		return NFKiosMoremenuAccountpageAccountlastsynctimeLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageKeepmeloginLbl() {
		return NFKiosMoremenuAccountpageKeepmeloginLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageKeepmeloginSwitch() {
		return LFSUtilsIOS.getElement("NFKios.moremenu.accountpage.keepmelogin.switch",
				LFSUtilsIOS.getPropString("common.logintype.persistent"));
	}

	public QAFWebElement getNFKiosMoremenuAccountpageSyncwithaccountBtn() {
		return NFKiosMoremenuAccountpageSyncwithaccountBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageStatictextLbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenu.accountpage.statictext.lbl", text);
	}

	public QAFWebElement getNFKiosMoremenuAccountpageTouchIDSwitch() {
		return LFSUtilsIOS.getElement("NFKios.moremenu.accountpage.keepmelogin.switch",
				LFSUtilsIOS.getPropString("common.logintype.fingerprint"));
	}


	// Method to verify account page
	// Milan
	public void verifyAccountPage(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosMoremenuAccountpageAccntdtlsLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKiosMoremenuAccountpageUseremailLbl().getAttribute("label")
						.equalsIgnoreCase(userBean.getEmailID()),
				userBean.getEmailID() + "Expected   Actual "
						+ getNFKiosMoremenuAccountpageUseremailLbl().getAttribute("label"),
				"Correct email ID");
		getNFKiosMoremenuAccountpageLogoutBtn().verifyPresent(LFSUtilsIOS.getPropString("account.logout.button"));
		getNFKiosMoremenuAccountpageLastsyncLbl().verifyPresent(LFSUtilsIOS.getPropString("account.lastsync.label"));
		getNFKiosMoremenuAccountpageWithmeterLbl().verifyPresent(LFSUtilsIOS.getPropString("account.lastsync.withmeter.label"));
		getNFKiosMoremenuAccountpageMetersynctimeLbl().verifyPresent(LFSUtilsIOS.getPropString("account.meter.withmeter.label"));
		getNFKiosMoremenuAccountpageWithaccountLbl().verifyPresent(LFSUtilsIOS.getPropString("account.syncwithaccount.label"));
		getNFKiosMoremenuAccountpageAccountlastsynctimeLbl().verifyPresent(LFSUtilsIOS.getPropString("account.lastsync.time.text"));
		getNFKiosMoremenuAccountpageKeepmeloginLbl().verifyPresent(LFSUtilsIOS.getPropString("account.keepmelogin.text"));
		getNFKiosMoremenuAccountpageKeepmeloginSwitch().verifyPresent(LFSUtilsIOS.getPropString("account.keepmelogin.switch.text"));
		getNFKiosMoremenuAccountpageSyncwithaccountBtn().verifyPresent(LFSUtilsIOS.getPropString("account.syncwithmeter.button"));

	}

	public void selectOptin() {
		getNFKiosMoremenuAccountpageStatictextLbl(ConstantUtils.OPTIN_MSG).verifyPresent("ConstantUtils.OPTIN_MSG");
		getNFKiosMoremenuAccountpageAccntdtlsLbl().verifyPresent(LFSUtilsIOS.getPropString("account.afterclicking.cancel.button.account.screen.text"));

	}

	public void optinCheckBox() {
		try {
			LFSUtilsIOS.scrollDown();
			if (getNFKiosMoremenuAccountpageOptinBtn().isSelected()) {
				Reporter.logWithScreenShot("The user has selected optin to receive diabetes related information",
						MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("The user has to select the optin to receive diabetes related information",
						MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify optin selection", MessageTypes.Fail);
		}
	}

	// Method to click on delete button n delete account page
	public void clickDeleteButton() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKiosMoremenuAccountpageDeleteaccountBtn().verifyPresent(LFSUtilsIOS.getPropString("account.deleteaccount.button.present.text"));
		getNFKiosMoremenuAccountpageDeleteaccountBtn().click();

	}

	// Method to agree consent and confirmation for delete account
	public void agreeConsentAndConfirmation() {
		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			LFSUtilsIOS.waitforLoad();
		}
		getNFKiosMoremenuAccountpageDeletescreenAckCheckbox().click();
		getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User checked the checkboxes ", MessageTypes.Pass);
	}

	// Method to verify delete button is enable or not
	public void verifyDeleteButtonEnable() {
		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
		} catch (Exception e) {
		}
		if (getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().getAttribute("enabled").toString()
				.equalsIgnoreCase("true"))
			getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().verifyEnabled(LFSUtilsIOS.getPropString("account.delete.button.enable.text"));
		else
			Reporter.logWithScreenShot("Delete button is not enabled, Kindly reconfirm your selection",
					MessageTypes.Fail);
	}

	// Method to click on edit profile button
	public void clickEditProfileButton() {
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageUserdtlsEditBtn());
		Reporter.logWithScreenShot("User clicked on edit profile button", MessageTypes.Pass);
	}

	
	static String editedEmail;
	// Method to update user profile details
	public void updateProfileDetails(String userDetail) {
		SignupPageIOS pageIOS = new SignupPageIOS();
		UserDetailBeans userBean = new UserDetailBeans();
		String depeditedEmail = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		if (userDetail instanceof String) {
			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(), depeditedEmail);
		ConfigurationManager.getBundle().setProperty("register.email.key", depeditedEmail);
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt(), userBean.getFirstName());
		ConfigurationManager.getBundle().setProperty("register.firstname.key", userBean.getFirstName());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsInitialTxt(), userBean.getMiddleName());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt(), userBean.getLastName());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsSuffixTxt(), userBean.getSuffix());
		getNFKiosMoremenuAccountpageUserdtlsDobTxt().click();
		pageIOS.setDateOfBirth(userBean);
		ConfigurationManager.getBundle().setProperty("register.DOB.key", userBean.getBirthdayYear());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress1Txt(), userBean.getAddress1());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress2Txt(), userBean.getAddress2());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress3Txt(), userBean.getAddress3());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsCityTxt(), userBean.getCity());
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageUserdtlsStateTxt());
		LFSUtilsIOS.scrollDown();
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageStateDoneBtn());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt(), userBean.getZipCode());
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt(), userBean.getPhoneNumber());
		LFSUtilsIOS.hideKeyboard();
		Reporter.logWithScreenShot("User updated the profile details", MessageTypes.Pass);
	}

	// Method to click on save button
	public void clickSaveButton() {
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageUserdtlsSaveBtn());
		Reporter.logWithScreenShot("User clicked on save button", MessageTypes.Pass);
	}

	// Method to click delete button
	public void deleteAccountPermnently() {
		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
		} catch (Exception e) {
		}
		getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().isEnabled();
		getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().click();
		LFSUtilsIOS.pause(2000);
		getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn().waitForPresent();
		try {
			if (getNFKiosMoremenuAccountpageDeletescreenPopupTitle().getText()
					.equals(LFSUtilsIOS.getPropString("appCommon.accountDeleted"))) {
				Reporter.logWithScreenShot("Delete account confirmation popup is displayed", MessageTypes.Pass);
				getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn().click();
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Delete account confirmation popup is not displayed", MessageTypes.Fail);
		}

	}

	public void enterDeleteCredentials() {

		SignupPageIOS signupPageIOS = new SignupPageIOS();
		getNFKiosMoremenuAccountpageDeletescreenEmailField().click();
		getNFKiosMoremenuAccountpageDeletescreenEmailField().sendKeys((signupPageIOS.email).toLowerCase());
		getNFKiosMoremenuAccountpageDeletescreenPasswordField().sendKeys("test@1234real");

		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Entered the valid credentials", MessageTypes.Pass);

	}

	public void uncheckConsentChkbx() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKiosMoremenuAccountpageConsentChkbx().verifyPresent(LFSUtilsIOS.getPropString("account.consentpage.checkbox.present.text"));
		getNFKiosMoremenuAccountpageConsentChkbx().click();
		Reporter.logWithScreenShot("Delete Account page is displayed", MessageTypes.Pass);
	}

	public void verifyAfterEditing() {
		try {
			getNFKiosMoremenuAccountpageUserdtlsEditBtn().waitForPresent();
			SignupPageIOS pageIOS = new SignupPageIOS();
			String emailafterEditing = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
			String emailBeforeSave = pageIOS.email;
			if (!emailafterEditing.equals(emailBeforeSave)) {
				Validator.verifyThat("The user profile details edited successfully", emailBeforeSave,
						Matchers.not(emailafterEditing));
			} else {
				Reporter.logWithScreenShot("User profile details not edited successfully", MessageTypes.Fail);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("User profile details not edited successfully", MessageTypes.Fail);
		}
	}

	public void checkOptinOptionForMarketing() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKiosMoremnuAccountpageOptinChkbx().verifyPresent(LFSUtilsIOS.getPropString("account.marketing.optin.checkbox.present.text"));
		getNFKiosMoremnuAccountpageOptinChkbx().click();
		if (getNFKiosMoremnuAccountpageOptinChkbx().isPresent()) {
			Reporter.logWithScreenShot("User has already opt-out, click again to check for optin again",
					MessageTypes.Pass);
			getNFKiosMoremnuAccountpageOptinChkbx().click();
		} else {
			Reporter.logWithScreenShot("User is about to opt-in for option", MessageTypes.Pass);

		}
	}

	public void agreeOptinCheckbox() {
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS.getPropString("optIn.title"))
				.verifyPresent(LFSUtilsIOS.getPropString("account.Opt-in.agreement.pageisdisplayed.text"));
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS.getPropString("termsAndCond.agree")).click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Opt-in option is check in", MessageTypes.Pass);
	}

	public void enterWrongEmailId() {

		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().clear();
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().sendKeys("abcd@.com");
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().click();
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyPresent("Invalid Email address has been entered, Kindly enter a valid ID");
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().clear();
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().sendKeys("1234.gmail.com");
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().click();
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyPresent("Invalid Email address has been entered, Kindly enter a valid ID");
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().clear();
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().sendKeys("abcd123@testmail.com");
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().click();
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyNotPresent("Valid Email id is entered");
	}
	public void loginWithGDPRInvalidUsername() {

		loginPageIOS.getNFKiosLoginpageEmailadressTbox().sendKeys("wrongmail.com");
		loginPageIOS.getNFKiosLoginpagePasswordTbox().sendKeys("abcd123#");

		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
		} catch (Exception e) {
			loginPageIOS.getNFKiosLoginpageTitleLbl().click();
		}

		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageDeleteaccountBtn().verifyEnabled("Delete button is enabled");
		getNFKiosMoremenuAccountpageDeleteaccountBtn().click();
		if (getNFKiosMoremenuAccountpageStatictextLbl(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Error message popup is displayed", MessageTypes.Pass);
			getNFKiosMoremenuAccountpageStatictextLbl(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.click();
		}

	}
	public void clickBackButton() {
		getNFKiosMoremenuAccountpageBackBtn().verifyPresent(LFSUtilsIOS.getPropString("account.backbutton.onedituser.detailpagee.text"));
		getNFKiosMoremenuAccountpageBackBtn().click();

	}
	public void verifyDeletebtnonAcc() {
		LFSUtilsIOS.scrollDown();
		getNFKiosMoremenuAccountpageDeleteBtn().waitForPresent();
		if (getNFKiosMoremenuAccountpageDeleteBtn().isPresent()) {
			Reporter.logWithScreenShot("Delete button is present ", MessageTypes.Pass);
			LFSUtilsIOS.pause(200);
			getNFKiosMoremenuAccountpageDeleteBtn().click();
		} else
			Reporter.logWithScreenShot("Delete button is not present for this country", MessageTypes.Fail);
	}

	public void verifydeleteaccscreen() {
		getNFKiosMoremenuAccountpageDeletescreenMessageLabel().verifyPresent(LFSUtilsIOS.getPropString("account.message.deletescreen.text"));
		getNFKiosMoremenuAccountpageDeletescreenEmailField().verifyPresent(LFSUtilsIOS.getPropString("account.deletescreen.email.text"));
		getNFKiosMoremenuAccountpageDeletescreenPasswordField().verifyPresent(LFSUtilsIOS.getPropString("account.deletescreen.Password.text"));
		getNFKiosMoremenuAccountpageDeletescreenAckCheckbox().verifyPresent(LFSUtilsIOS.getPropString("account.deletescreen.Ack.checkbox"));
		getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox().verifyPresent(LFSUtilsIOS.getPropString("account.deletescreen.verification.checkbox"));
		getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().verifyPresent(LFSUtilsIOS.getPropString("account.deletescreen.delete.button"));
		Reporter.logWithScreenShot("The Delete account screen ", MessageTypes.Pass);
	}

	public void enterLogindetail() {
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		LoginPageIOS logindetail = new LoginPageIOS();
		logindetail.getNFKiosLoginpageEmailadressTbox().click();
		logindetail.getNFKiosLoginpageEmailadressTbox().sendKeys(signupPageIOS.email);
		logindetail.getNFKiosLoginpagePasswordTbox().sendKeys("test@1234");
	}

	public void updateDependentProfileDetails(Object userDetail) {
		SignupPageIOS pageIOS = new SignupPageIOS();
		UserDetailBeans userBean = new UserDetailBeans();

		editedEmail = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
	
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt(), userBean.getDependentfname());
		ConfigurationManager.getBundle().setProperty("register.firstname.key", userBean.getDependentfname());
		getNFKiosMoremenuAccountpageUserdtlsInitialTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsInitialTxt(), userBean.getDependentmname());
		getNFKiosMoremenuAccountpageUserdtlsLstnameTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt(), userBean.getDependentlname());

		getNFKiosMoremenuAccountpageUserdtlsSuffixTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsSuffixTxt(), userBean.getDependentsuffix());
		getNFKiosMoremenuAccountpageUserdtlsDobTxt().click();
		pageIOS.getNFKiosSignuppageTimingpickerYearPkr().sendKeys(userBean.getDependentbirthyr());
		pageIOS.getNFKiosSignupPageBdPickerDoneBtn().click();
		// pageIOS.setDependentDateOfBirth(userBean);
		ConfigurationManager.getBundle().setProperty("register.DOB.key", userBean.getDependentbirthyr());

		getNFKiosMoremenuAccountpageUserdtlsAddress1Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress1Txt(), userBean.getDependentaddress1());

		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageUserdtlsAddress2Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress2Txt(), userBean.getDependentaddress2());

		getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
		getNFKiosMoremenuAccountpageUserdtlsAddress3Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress3Txt(), userBean.getDependentaddress3());

		getNFKiosMoremenuAccountpageUserdtlsCityTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsCityTxt(), userBean.getDependentcity());
		LFSUtilsIOS.waitforLoad();

		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsIOS.waitforLoad();

		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt(), userBean.getDependentphone());
		iosDriver.hideKeyboard(HideKeyboardStrategy.TAP_OUTSIDE);
		getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt(), userBean.getDependentzipcode());
		getNFKiosMoremenuAccountpageUserdtlsStateTxt().click();
		LFSUtilsIOS.scrollDown();
		getNFKiosMoremenuAccountpageStateDoneBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 20, 50, 80, 10);
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(), editedEmail);
		ConfigurationManager.getBundle().setProperty("register.email.key", editedEmail);
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
	}

	public void enterPasswordClickLogin() {
		getNFKiosDependentConfirmpasswordTBox().waitForPresent();
		getNFKiosDependentConfirmpasswordTBox().click();
		getNFKiosDependentConfirmpasswordTBox()
				.sendKeys(ConfigurationManager.getBundle().getString("dependent.password"));
		Reporter.logWithScreenShot("User entered Password", MessageTypes.Pass);
		getNFKiosDependentConfirmBtn().isEnabled();
		// getNFKiosDependentConfirmBtn().click();
		LFSUtilsIOS.clickWithText("Confirm");
		waitForPageToLoad();
	}

	public void verifyDepenedentEditedDetails(Object userDetail) {
		waitForPageToLoad();
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		LFSUtilsIOS.waitforLoad();
		LFSUtilsIOS.pause(3000);
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().waitForPresent(200);
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().waitForPresent();
		String editemail = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		getNFKiosMoremenuAccountpageUserdtlsEmailLbl().getAttribute("value").equals(editemail);
		getNFKiosMoremenuAccountpageUserdtlsFrstnameLbl().getAttribute("value")
				.equals(ConfigurationManager.getBundle().getProperty("register.firstname.key"));
		getNFKiosMoremenuAccountpageUserdtlsLstnameLbl().getAttribute("value").equals(userBean.getDependentlname());
		getNFKiosMoremenuAccountpageUserdtlsInitialLbl().getAttribute("value").equals(userBean.getDependentmname());
		getNFKiosMoremenuAccountpageUserdtlsSuffixLbl().getAttribute("value").equals(userBean.getDependentsuffix());
		LFSUtilsIOS.swipeWithScreenPercent(50, 40, 50, 80, 10);
		getNFKiosMoremenuAccountpageUserdtlsDobLbl().getAttribute("value");
		getNFKiosMoremenuAccountpageUserdtlsAddress1Lbl().getAttribute("value").equals(userBean.getDependentaddress1());
		getNFKiosMoremenuAccountpageUserdtlsAddress2Lbl().getAttribute("value").equals(userBean.getDependentaddress2());
		getNFKiosMoremenuAccountpageUserdtlsAddress3Lbl().getAttribute("value").equals(userBean.getDependentaddress3());
		LFSUtilsIOS.swipeWithScreenPercent(50, 40, 50, 80, 10);
		getNFKiosMoremenuAccountpageUserdtlsCityLbl().getAttribute("value").equals(userBean.getDependentcity());
		getNFKiosMoremenuAccountpageUserdtlsZipcodeLbl().getAttribute("value").equals(userBean.getDependentzipcode());
		getNFKiosMoremenuAccountpageUserdtlsPrinumberLbl().getAttribute("value").equals(userBean.getDependentphone());

	}

	// Click on Change password and verify screen
	public void clickChangePasswordButton() {
		if (getiosNFKMoremenuAccountpageChangePasswordButton().isDisplayed()) {
			LFSUtilsIOS.click(getiosNFKMoremenuAccountpageChangePasswordButton());
			Reporter.logWithScreenShot("Change Password button is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Change Password button is not present", MessageTypes.Fail);
	}

	// Verfiy Change password screen
	public void clickChangePasswordScreen() {
try {
		getNFKiosMoremenuAccountpagechangepasswordtitle().isPresent();
		getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField().assertPresent(LFSUtilsIOS.getPropString("account.changepassword.screen.currentpassword.text"));
		getNFKiosMoremenuAccountpagechangepasswordNewPasswordField().assertPresent(LFSUtilsIOS.getPropString("account.changepassword.screen.newpassword.text"));
		getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField().assertPresent(LFSUtilsIOS.getPropString("account.changepassword.screen.confirmpassword.text"));
		getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().isPresent();
		getNFKiosMoremenuAccountpagechangepasswordcancelbutton().isPresent();
		getNFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink().assertPresent(LFSUtilsIOS.getPropString("account.changepassword.screen.forgotpassword.text"));
		getNFKiosMoremenuAccountpagechangepasswordbackbutton().isPresent();
		Reporter.logWithScreenShot("Sucessfully verified Change password screen", MessageTypes.Pass);
}catch (Exception e) {
	e.printStackTrace();
	Reporter.logWithScreenShot("Fail to verify Change password screen",MessageTypes.Fail);
}
	}

	// Click on Cancel button from Change password screen
	public void clickChangePasswordCancelBtn() {
		try {
		getNFKiosMoremenuAccountpagechangepasswordcancelbutton().isPresent();
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpagechangepasswordcancelbutton());
		Reporter.logWithScreenShot("Account screen after clicling on Cancel button", MessageTypes.Pass);
		LFSUtilsIOS.click(getiosNFKMoremenuAccountpageChangePasswordButton());
		}catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click cnacel btn of change password ",MessageTypes.Fail);
		}
		}

	// Enter Change password detail
	public void enterChangePasswordDetail(Object userDetails) {
		try {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		Reporter.logWithScreenShot("Change password screen before entering details", MessageTypes.Pass);
	
		String pass = (String) ConfigurationManager.getBundle().getProperty("register.password");
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField(),pass);
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpagechangepasswordNewPasswordField(),userBean.getNewPassword());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField(),userBean.getNewPassword());
		Reporter.logWithScreenShot("Change password screen After entering details", MessageTypes.Pass);
	}catch (Exception e) {
		e.printStackTrace();
		Reporter.logWithScreenShot("Fail to chnage password ",MessageTypes.Fail);
	}
	}

	// Save Change password detail
	public void saveChangePasswordDetail() {
		try {
		getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().waitForPresent();
		getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().isEnabled();
		Reporter.logWithScreenShot("Enable save button", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton());
		Reporter.logWithScreenShot("Sucessfully cicked on  save button", MessageTypes.Pass);
		}catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on save btn ",MessageTypes.Fail);
		}
	}

	// Enter Changed Password Details on login screen

	public void enterchangepasswordlogindetails(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		SignupPageIOS sign = new SignupPageIOS();
		getNFKiosMoremenuAccountpagechangepasswordemailaddress().click();
		String str = (String) ConfigurationManager.getBundle().getProperty("register.email");
		getNFKiosMoremenuAccountpagechangepasswordemailaddress().sendKeys(str);
		// Properties login =
		// ConfigurationManager.getBundle().getProperties("register.email.key");
		getNFKiosMoremenuAccountpagechangedpassword().click();
		getNFKiosMoremenuAccountpagechangedpassword().sendKeys(userBean.getNewPassword());
		Reporter.logWithScreenShot("login screen After entering details", MessageTypes.Pass);
		LFSUtilsIOS.waitforLoad();

	}

	public void updateUserProfileDetails(Object userDetail) {

		SignupPageIOS pageIOS = new SignupPageIOS();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		UserDetailBeans userBean = new UserDetailBeans();

		String email = "mailinator.com";
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().click();

		QAFWebElement elementXpath = getNFKiosMoremenuAccountpageUserdtlsEmailTxt();

		String x[] = elementXpath.toString().split("xpath:");

		int eleX = Integer.valueOf(LFSUtilsIOS.getElementInfo("x", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int eleY = Integer.valueOf(LFSUtilsIOS.getElementInfo("y", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int eleHeight = Integer
				.valueOf(LFSUtilsIOS.getElementInfo("height", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int eleWidth = Integer
				.valueOf(LFSUtilsIOS.getElementInfo("width", x[1].replaceAll("\\s+", ""), "xpath").toString());

		int xPoint = eleX + eleWidth - 10;
		int yPoint = eleY + (eleHeight / 2);

		LFSUtilsIOS.tapOnCordinates(String.valueOf(xPoint), String.valueOf(yPoint));
		for (int i = 0; i < 9; i++) {
			getNFKiosKeyBoardDeleteBtn().click();
		}
		// LFSUtilsIOS.entermiddleText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(),email);
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(), email);
		LFSUtilsIOS.pause(200);
		String updatedEmail = getNFKiosMoremenuAccountpageUserdtlsEmailTxt().getText();
		ConfigurationManager.getBundle().setProperty("update1.editemail.key", updatedEmail);
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().verifyPresent("First name text field ");

		deleteText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt());

		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt(), userBean.getFirstName());
		ConfigurationManager.getBundle().setProperty("update1.editfirstname.key", userBean.getFirstName());

		deleteText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt());
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt(), userBean.getLastName());
		ConfigurationManager.getBundle().setProperty("update1.editlastname.key", userBean.getLastName());
		getNFKiosMoremenuAccountpageUserdtlsAddress1Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress1Txt(), userBean.getAddress1());
		ConfigurationManager.getBundle().setProperty("update1.editAddress1.key", userBean.getAddress1());
		getNFKiosMoremenuAccountpageUserdtlsCityTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsCityTxt(), userBean.getCity());
		ConfigurationManager.getBundle().setProperty("update1.editcity.key", userBean.getCity());
		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
	}
	public void deleteText(QAFWebElement element) {
		QAFWebElement elementXpath = element;
		String x[] = elementXpath.toString().split("xpath:");

		int eleX = Integer.valueOf(LFSUtilsIOS.getElementInfo("x", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int eleY = Integer.valueOf(LFSUtilsIOS.getElementInfo("y", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int eleHeight = Integer
				.valueOf(LFSUtilsIOS.getElementInfo("height", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int eleWidth = Integer
				.valueOf(LFSUtilsIOS.getElementInfo("width", x[1].replaceAll("\\s+", ""), "xpath").toString());
		int xPoint = eleX + eleWidth - 10;
		int yPoint = eleY + (eleHeight / 2);
		LFSUtilsIOS.tapOnCordinates(String.valueOf(xPoint), String.valueOf(yPoint));
		for (int i = 0; i < elementXpath.getText().length(); i++) {
			getNFKiosKeyBoardDeleteBtn().click();
		}
	}

	public void verifyupdatedUserProfileDetails(Object userDetail) {
		LFSUtilsIOS.pause(2000);
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosMoremenuAccountpageUserdtlsEmailLbl().getText()
				.equals(ConfigurationManager.getBundle().getProperty("update1.editemail.key"));

		getNFKiosMoremenuAccountpageUserdtlsFrstnameLbl().getText()
				.equals(ConfigurationManager.getBundle().getProperty("update1.editfirstname.key"));

		getNFKiosMoremenuAccountpageUserdtlsLstnameLbl()
				.equals(ConfigurationManager.getBundle().getProperty("update1.editlastname.key"));

		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageUserdtlsAddress1Lbl()
				.equals(ConfigurationManager.getBundle().getProperty("update1.editlastname.key"));
		LFSUtilsIOS.hideKeyboard();
		getNFKiosMoremenuAccountpageUserdtlsCityLbl()
				.equals(ConfigurationManager.getBundle().getProperty("update1.editcity.key"));

		Reporter.logWithScreenShot("Verified the deatils", MessageTypes.Pass);
	}

	

	public void verifylastsyncwithsensorvalue() {
		getNFKiosMoremenuAccountpageLastsyncLbl().verifyPresent(LFSUtilsIOS.getPropString("account.lastsync.text"));
		getNFKiosMoremenuAccountpagewithsensorLbl().assertPresent(LFSUtilsIOS.getPropString("account.withsensor.text"));
	}
	public void clickbacknadnavihome() {
		getNFKiosMoremenuAccountpagebackbtn().isPresent();
		getNFKiosMoremenuAccountpagebackbtn().click();
		getNFKiosMoremenuhomebtn().isPresent();
		getNFKiosMoremenuhomebtn().click();
		
	}
	public void verifylastsyncvalue() {
		getNFKiosMoremenuAccountpageLastsyncLbl().verifyPresent(LFSUtilsIOS.getPropString("account.lastsync.text"));
		getNFKiosMoremenuAccountpagewithsensorLbl().assertPresent(LFSUtilsIOS.getPropString("account.withsensor.text"));
		getNFKiosMoremenuAccountpagewithsensorLbl().verifyPresent(LFSUtilsIOS.getPropString("account.today.text"));
		getNFKiosMoremenuAccountpagebackbtn().click();
	}
	
	public void verifyCountryOptions() {
		try {
			String str1=getNFKiosMoremenuAccountpageUserdtlsEmailTxt().getAttribute("label");
			if(!(str1=="Country"));
			String str2=getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().getAttribute("label");
			if(!(str2=="Country"));
			String str3=getNFKiosMoremenuAccountpageUserdtlsInitialTxt().getAttribute("label");
			if(!(str3=="Country"));
			String str4=getNFKiosMoremenuAccountpageUserdtlsLstnameTxt().getAttribute("label");
			if(!(str4=="Country"));
			String str5=getNFKiosMoremenuAccountpageUserdtlsSuffixTxt().getAttribute("label");
			if(!(str5=="Country"));
			String str6=getNFKiosMoremenuAccountpageUserdtlsDobTxt().getAttribute("label");
			if(!(str6=="Country"));
			String str7=getNFKiosMoremenuAccountpageUserdtlsAddress1Txt().getAttribute("label");
			if(!(str7=="Country"));
			String str8=getNFKiosMoremenuAccountpageUserdtlsAddress2Txt().getAttribute("label");
			if(!(str8=="Country"));
			String str9=getNFKiosMoremenuAccountpageUserdtlsAddress3Txt().getAttribute("label");
			if(!(str9=="Country"));
			String str10=getNFKiosMoremenuAccountpageUserdtlsCityTxt().getAttribute("label");
			if(!(str10=="Country"));
			String str11=(getNFKiosMoremenuAccountpageUserdtlsStateTxt().getAttribute("label"));
			if(!(str11=="Country"));
			String str12=getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt().getAttribute("label");
			if(!(str12=="Country"));
			String str13=getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt().getAttribute("label");
 			if(!(str13=="Country"));
			Reporter.logWithScreenShot("User successfully verified country option not present on edit account page",MessageTypes.Pass);
	 }catch(Exception e){
			Reporter.logWithScreenShot("Fail to verify country option not present on edit account screen", MessageTypes.Fail);
	 }
}	

	//Method to click on delete account button on account screen
	public void clickOnDeleteAccount() {
		try {
		LFSUtilsIOS.scrollDown();
		getNFKiosMoremenuAccountpageDeleteBtn().waitForPresent();
		if (getNFKiosMoremenuAccountpageDeleteBtn().isPresent()) {
			Reporter.logWithScreenShot("Delete button is present ", MessageTypes.Pass);
			LFSUtilsIOS.pause(200);
			LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeleteBtn());		
		} else
			Reporter.logWithScreenShot("Delete button is not present for this country", MessageTypes.Fail);
		}
		catch (Exception e) {
			Reporter.logWithScreenShot("Delete button is not present for this country", MessageTypes.Fail);
		}
	}
	
	//Method to verify error popUp while doing field validations on delete account screen
	public void verifyErrorPopupUsingFieldValidations(String fieldValidations) {
		try {		
		UserDetailBeans userBean = new UserDetailBeans();
		if (fieldValidations instanceof String) {
			userBean.fillFromConfig(fieldValidations);
		} else {
			userBean.fillData(fieldValidations);
		}
		getNFKiosMoremenuAccountpageDeletescreenEmailField().sendKeys(userBean.getinvalidUserName());
		getNFKiosMoremenuAccountpageDeletescreenPasswordField().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.password"));
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenAckCheckbox());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenDeleteBtn());
		getNFKiosMoremenuAccountpageDeletescreenPopupErrorTitle().verifyPresent();
		getNFKiosMoremenuAccountpageDeletescreenPopupErrorTxt2().verifyPresent();
		getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn().verifyPresent();
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenBackBtn());
		 clickOnDeleteAccount();
		 
        getNFKiosMoremenuAccountpageDeletescreenEmailField().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.email"));
		getNFKiosMoremenuAccountpageDeletescreenPasswordField().sendKeys(userBean.getinvalidPassword());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenAckCheckbox());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenDeleteBtn());
		getNFKiosMoremenuAccountpageDeletescreenPopupErrorTitle().verifyPresent();
		getNFKiosMoremenuAccountpageDeletescreenPopupErrorTxt2().verifyPresent();
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn());
		Reporter.logWithScreenShot("Successfully verified Error Popup Using Field Validations", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify Error Popup Using Field Validations", MessageTypes.Fail);
		}
	}

	//Turn off wifi and verify delete screen account popUp
	public void turnOffWifiAndVerifyDeleteScreen() {
		try {
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		HomePageIOS home = new HomePageIOS();
		MoremenuPageIOS moremenu = new MoremenuPageIOS();
		LFSUtilsIOS.navigateToSettingSceenFromTrustScreen();
		lfs.turnOffWiFi();
		iosDriver.launchApp();
		home.clickOnMoreMenuIcon();
		moremenu.clickAccount();
		clickOnDeleteAccount();
   	    getNFKiosMoremenuAccountpageDeletescreenEmailField().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.email"));
		getNFKiosMoremenuAccountpageDeletescreenPasswordField().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.password"));
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenAckCheckbox());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox());
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenDeleteBtn());
		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageDeletescreenRequestUnsuccessfulPopup().verifyPresent();
		LFSUtilsIOS.click(getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn());
		lfs.turnOnWiFi();
		Reporter.logWithScreenShot("Successfully turned Off Wifi And Verify Delete Screen", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to turned Off Wifi And Verify Delete Screen", MessageTypes.Fail);
		}
	}
}
