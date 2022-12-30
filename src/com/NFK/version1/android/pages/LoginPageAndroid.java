package com.NFK.version1.android.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.support.ApiMethods;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.EventDetailBeans;
import com.NFK.version1.android.beans.UserDetailBeans;

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
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.loginpage.username.txt")
	private QAFWebElement NFKLoginpageUsernameTxt;
	@FindBy(locator = "NFK.loginpage.password.txt")
	private QAFWebElement NFKLoginpagePasswordTxt;
	@FindBy(locator = "NFK.loginpage.login.btn")
	private QAFWebElement NFKLoginpageLoginBtn;
	@FindBy(locator = "NFK.forgotpassword.close.btn")
	private QAFWebElement NFKForgotpasswordCloseBtn;
	@FindBy(locator = "NFK.loginpage.enabletouchid.lbl")
	private QAFWebElement NFKLoginpageEnabletouchidLbl;
	@FindBy(locator = "NFK.loginpage.enabletouchid.switch.btn")
	private QAFWebElement NFKLoginpageEnabletouchidSwitchBtn;
	@FindBy(locator = "NFK.loginpage.keepmelogin.lbl")
	private QAFWebElement NFKLoginpageKeepmeloginLbl;
	@FindBy(locator = "NFK.loginpage.keepmelogin.switch.btn")
	private QAFWebElement NFKLoginpageKeepmeloginSwitchBtn;
	@FindBy(locator = "NFK.loginpage.touchid.fingerprint.img")
	private QAFWebElement NFKLoginpageTouchidFingerprintImg;
	@FindBy(locator = "NFK.loginpage.forgotpassword.lnk")
	private QAFWebElement NFKLoginpageForgotpasswordLnk;
	@FindBy(locator = "NFK.loginpage.signup.lnk")
	private QAFWebElement NFKLoginpageSignupLnk;
	@FindBy(locator = "NFK.forgotpassword.email.txt")
	private QAFWebElement NFKForgotPasswordEmailTxt;
	@FindBy(locator = "NFK.forgotpassword.sendemail.btn")
	private QAFWebElement NFKForgotPasswordSenEmailBtn;
	@FindBy(locator = "NFK.forgotpassword.emailreset.lbl")
	private QAFWebElement NFKForgotPasswordEmailResetLbl;
	@FindBy(locator = "NFK.loginpage.statictext.btn")
	private QAFWebElement NFKLoginpageStatictextBtn;
	@FindBy(locator = "NFK.forgotpassword.statictext.btn")
	private QAFWebElement NFKForgotpasswordStatictextBtn;
	@FindBy(locator = "NFK.loginpage.frenchwelcome.lbl")
	private QAFWebElement NFKLoginpageFrenchwelcomeLbl;
	@FindBy(locator = "NFK.loginpage.meter.next.btn")
	private QAFWebElement NFKLoginpageMeterNextBtn;
	@FindBy(locator = "NFK.loginpage.meter.verioflex.img")
	private QAFWebElement NFKLoginpageMeterVerioFlexMeter;
	@FindBy(locator = "NFK.loginpage.signup.myself.link")
	private QAFWebElement NFKLoginpageSignupMyselfLink;
	@FindBy(locator = "NFK.loginpage.signup.dependent.link")
	private QAFWebElement NFKLoginpageSignupDependentLink;

	@FindBy(locator = "NFK.loginpage.pairmeter.continue.btn")
	private QAFWebElement NFKLoginpageMeterContinueBtn;

	@FindBy(locator = "NFK.loginpage.signin.older.btn")
	private QAFWebElement NFKLoginpageSignInOlderBtn;
	@FindBy(locator = "NFK.loginpage.username.older.txt")
	private QAFWebElement NFKLoginpageUsernameOlderTxt;
	@FindBy(locator = "NFK.loginpage.password.older.txt")
	private QAFWebElement NFKLoginpagePasswordOlderTxt;
	@FindBy(locator = "NFK.loginpage.login.older.btn")
	private QAFWebElement NFKLoginpageOlderLoginBtn;

	@FindBy(locator = "NFK.loginpage.important.ok.older.btn")
	private QAFWebElement NFKLoginpageImportantOkBtn;
	@FindBy(locator = "NFK.skip.pair.btn")
	private QAFWebElement NFKSkipPairBtn;

	// Update notice
	@FindBy(locator = "NFK.loginpage.update.notice.checkBox")
	private QAFWebElement NFKLoginpageUpdateNoticeCheckBox;
	@FindBy(locator = "NFK.loginpage.update.notice.continue.btn")
	private QAFWebElement NFKLoginpageUpdateNoticeContinueBtn;
	@FindBy(locator = "NFK.loginpage.update.notice.title")
	private QAFWebElement NFKLoginpageUpdateNoticeTitle;

	@FindBy(locator = "NFK.loginpage.createguradian.title")
	private QAFWebElement NFKLoginpageCreateguradianTitle;

	@FindBy(locator = "NFK.loginpage.createguradian.cancel.btn")
	private QAFWebElement NFKLoginpageCreateguradianCancelBtn;

	@FindBy(locator = "NFK.loginpage.createguradian.signup.btn")
	private QAFWebElement NFKloginpageCreateguradianSignupBtn;
	@FindBy(locator = "NFK.loginpage.validation.error.msg")
	private QAFWebElement NFKLoginpageValidationErrorMsg;

	@FindBy(locator = "NFK.loginpage.validation.error.icon")
	private QAFWebElement NFKLoginpageValidationErrorIcon;

	@FindBy(locator = "NFK.forgotpassword.email.reset.popup")
	private QAFWebElement NFKForgotpasswordEmailResetPopup;

	// Gest
	@FindBy(locator = "NFK.gestational.profile.info")
	private QAFWebElement NFKGestationalProfileInfo;
	@FindBy(locator = "NFK.gestational.profile.warning")
	private QAFWebElement NFKGestationalProfileWarning;
	@FindBy(locator = "NFK.gestational.typeOne.radio.btn")
	private QAFWebElement NFKGestationalTypeOneRadioBtn;
	@FindBy(locator = "NFK.gestational.typeTwo.radio.btn")
	private QAFWebElement NFKGestationalTypeTwoRadioBtn;
	@FindBy(locator = "NFK.gestational.continue.btn")
	private QAFWebElement NFKGestationalContinueBtn;
	@FindBy(locator = "NFK.gestational.cancel.btn")
	private QAFWebElement NFKGestationalCancelBtn;
	@FindBy(locator = "NFK.gestational.fotter.part")
	private QAFWebElement NFKGestationalFotterPart;
	@FindBy(locator = "NFK.Cancelsetup.btn")
	private QAFWebElement NFKCancelsetupbtn;

	@FindBy(locator = "NFK.gestational.ResetPassword.firstname")
	private QAFWebElement NFKGestationalResetPasswordFirstname;

	@FindBy(locator = "NFK.gestational.ResetPassword.lastname")
	private QAFWebElement NFKGestationalResetPasswordLastname;

	@FindBy(locator = "NFK.gestational.ResetPassword.birthDate")
	private QAFWebElement NFKGestationalResetPasswordBirthDate;

	@FindBy(locator = "NFK.gestational.ResetPassword.emailAddress")
	private QAFWebElement NFKGestationalResetPasswordEmailAddress;

	@FindBy(locator = "NFK.gestational.ResetPassword.confirmEmailAddress")
	private QAFWebElement NFKGestationalResetPasswordConfirmEmailAddress;

	@FindBy(locator = "NFK.gestational.ResetPassword.password")
	private QAFWebElement NFKGestationalResetPasswordPassword;

	@FindBy(locator = "NFK.gestational.ResetPassword.confirmPassword")
	private QAFWebElement NFKGestationalResetPasswordConfirmPassword;

	@FindBy(locator = "NFK.gestational.ResetPassword.checkAgreementTerm")
	private QAFWebElement NFKGestationalResetPasswordCheckAgreementTerm;

	@FindBy(locator = "NFK.gestational.ResetPassword.continueButton")
	private QAFWebElement NFKGestationalResetPasswordContinueButton;

	@FindBy(locator = "NFK.gestational.ResetPassword.input.icon")
	private List<QAFWebElement> NFKGestationalResetPasswordInputIcon;
	@FindBy(locator = "NFK.ResetPassword.dob.popup.title")
	private QAFWebElement NFKResetPasswordDobPopupTitle;

	@FindBy(locator = "NFK.ResetPassword.dob.popup.message")
	private QAFWebElement NFKResetPasswordDobPopupMessage;

	@FindBy(locator = "NFK.ResetPassword.dob.popup.ok")
	private QAFWebElement NFKResetPasswordDobPopupOk;

	@FindBy(locator = "NFK.ResetPassword.title")
	private QAFWebElement NFKResetPasswordTitle;

	@FindBy(locator = "NFK.signuppage.important.popup")
	private QAFWebElement NFKSignuppageImportantPopup;

	@FindBy(locator = "NFK.loginTab.btn")
	private QAFWebElement NFKLoginTabBtn;

	@FindBy(locator = "NFK.loginErrorMessage.btn")
	private QAFWebElement NFKLoginErrorMessageBtn;

	@FindBy(locator = "NFK.loginpage.Update.Notice.ok.popUp")
	private QAFWebElement NFKLoginpageUpdateNoticeOkPopUp;

	@FindBy(locator = "NFK.loginpage.loginBtn.error.title")
	private QAFWebElement NFKLoginpageLoginBtnErrorTitle;
	
	@FindBy(locator = "NFK.loginpage.loginBtn.error.textMsg")
	private QAFWebElement NFKLoginpageLoginBtnErrorTextMsg;
	
	@FindBy(locator = "NFK.loginpage.loginBtn.error.ok.btn")
	private QAFWebElement NFKLoginpageLoginBtnErrorOkBtn;
	
	public QAFWebElement getNFKLoginpageUpdateNoticeOkPopUp() {
		return NFKLoginpageUpdateNoticeOkPopUp;
	}
	public QAFWebElement getNFKLoginErrorMessageBtn() {
		return NFKLoginErrorMessageBtn;
	}

	@FindBy(locator = "NFK.loginpage.YesLoginMe.btn")
	private QAFWebElement NFKLoginpageYesLoginMeBtn;  
	@FindBy(locator = "NFK.loginpage.Myowndata.btn")
	private QAFWebElement NFKLoginpageMyowndataBtn; 
	
	@FindBy(locator = "NFK.loginpage.Update.Notice.Updatenotice.Lbl")
	private QAFWebElement NFKloginpageUpdateNoticeUpdatenoticeLbl;
	
	@FindBy(locator = "NFK.loginpage.Update.Notice.Wehaveupdated.Txt")
	private QAFWebElement NFKloginpageUpdateNoticeWehaveupdatedTxt;
	
	@FindBy(locator = "NFK.loginpage.Update.Notice.Privacypolicy.Txt")
	private QAFWebElement NFKloginpageUpdateNoticePrivacypolicyTxt;
	
	@FindBy(locator = "NFK.loginpage.Update.Notice.Termsofuse.Txt")
	private QAFWebElement NFKloginpageUpdateNoticeTermsofuseTxt;
	
	@FindBy(locator = "NFK.loginpage.Update.Notice.Consenttoprocess.Txt")
	private QAFWebElement NFKloginpageUpdateNoticeConsenttoprocessTxt;
	
	@FindBy(locator = "NFK.loginpage.loginBtn.clear.passwordtxt")
	private QAFWebElement NFKloginpageloginBtnclearpasswordtxt;
	
	public QAFWebElement getNFKloginpageloginBtnclearpasswordtxt() {
		return NFKloginpageloginBtnclearpasswordtxt;
	}
	
	
	@FindBy(locator = "NFK.signuppage.safety.title")
	private QAFWebElement NFKsignuppagesafetytitle;
	public QAFWebElement getNFKsignuppagesafetytitle() {
		return NFKsignuppagesafetytitle;
	}
	
	public QAFWebElement getNFKloginpageUpdateNoticeUpdatenoticeLbl() {
		return NFKloginpageUpdateNoticeUpdatenoticeLbl;
	}
	public QAFWebElement getNFKloginpageUpdateNoticeWehaveupdatedTxt() {
		return NFKloginpageUpdateNoticeWehaveupdatedTxt;
	}
	public QAFWebElement getNFKloginpageUpdateNoticePrivacypolicyTxt() {
		return NFKloginpageUpdateNoticePrivacypolicyTxt;
	}
	public QAFWebElement getNFKloginpageUpdateNoticeTermsofuseTxt() {
		return NFKloginpageUpdateNoticeTermsofuseTxt;
	}
	public QAFWebElement getNFKloginpageUpdateNoticeConsenttoprocessTxt() {
		return NFKloginpageUpdateNoticeConsenttoprocessTxt;
	}
	
	public QAFWebElement getNFKLoginpageMyowndataBtn() {
		return NFKLoginpageMyowndataBtn;
	}
	public QAFWebElement getNFKLoginpageYesLoginMeBtn() {
		return NFKLoginpageYesLoginMeBtn;
	}

	public QAFWebElement getNFKSignuppageImportantPopup() {
		return NFKSignuppageImportantPopup;
	}

	public QAFWebElement getNFKResetPasswordTitle() {
		return NFKResetPasswordTitle;
	}

	public QAFWebElement getNFKResetPasswordDobPopupOk() {
		return NFKResetPasswordDobPopupOk;
	}

	public QAFWebElement getNFKResetPasswordDobPopupMessage() {
		return NFKResetPasswordDobPopupMessage;
	}

	public QAFWebElement getNFKResetPasswordDobPopupTitle() {
		return NFKResetPasswordDobPopupTitle;
	}

	public List<QAFWebElement> getNFKGestationalResetPasswordInputIcon() {
		return NFKGestationalResetPasswordInputIcon;
	}

	public QAFWebElement getNFKGestationalResetPasswordFirstname() {
		return NFKGestationalResetPasswordFirstname;
	}

	public QAFWebElement getNFKGestationalResetPasswordLastname() {
		return NFKGestationalResetPasswordLastname;
	}

	public QAFWebElement getNFKGestationalResetPasswordBirthDate() {
		return NFKGestationalResetPasswordBirthDate;
	}

	public QAFWebElement getNFKGestationalResetPasswordEmailAddress() {
		return NFKGestationalResetPasswordEmailAddress;
	}

	public QAFWebElement getNFKGestationalResetPasswordConfirmEmailAddress() {
		return NFKGestationalResetPasswordConfirmEmailAddress;
	}

	public QAFWebElement getNFKGestationalResetPasswordPassword() {
		return NFKGestationalResetPasswordPassword;
	}

	public QAFWebElement getNFKGestationalResetPasswordConfirmPassword() {
		return NFKGestationalResetPasswordConfirmPassword;
	}

	public QAFWebElement getNFKGestationalResetPasswordCheckAgreementTerm() {
		return NFKGestationalResetPasswordCheckAgreementTerm;
	}

	public QAFWebElement getNFKGestationalResetPasswordContinueButton() {
		return NFKGestationalResetPasswordContinueButton;
	}

	public QAFWebElement getNFKGestationalProfileInfo() {
		return NFKGestationalProfileInfo;
	}

	public QAFWebElement getNFKGestationalProfileWarning() {
		return NFKGestationalProfileWarning;
	}

	public QAFWebElement getNFKGestationalTypeOneRadioBtn() {
		return NFKGestationalTypeOneRadioBtn;
	}

	public QAFWebElement getNFKGestationalTypeTwoRadioBtn() {
		return NFKGestationalTypeTwoRadioBtn;
	}

	public QAFWebElement getNFKGestationalContinueBtn() {
		return NFKGestationalContinueBtn;
	}

	public QAFWebElement getNFKGestationalCancelBtn() {
		return NFKGestationalCancelBtn;
	}

	public QAFWebElement getNFKGestationalFotterPart() {
		return NFKGestationalFotterPart;
	}

	public QAFWebElement getNFKForgotpasswordEmailResetPopup() {
		return NFKForgotpasswordEmailResetPopup;
	}

	public QAFWebElement getNFKLoginpageValidationErrorMsg() {
		return NFKLoginpageValidationErrorMsg;
	}

	public QAFWebElement getNFKLoginpageValidationErrorIcon() {
		return NFKLoginpageValidationErrorIcon;
	}

	public QAFWebElement getNFKLoginpageCreateguradianTitle() {
		return NFKLoginpageCreateguradianTitle;
	}

	public QAFWebElement getNFKLoginpageCreateguradianCancelBtn() {
		return NFKLoginpageCreateguradianCancelBtn;
	}

	public QAFWebElement getNFKloginpageCreateguradianSignupBtn() {
		return NFKloginpageCreateguradianSignupBtn;
	}

	public QAFWebElement getNFKLoginpageUpdateNoticeCheckBox() {
		return NFKLoginpageUpdateNoticeCheckBox;
	}

	public QAFWebElement getNFKLoginpageUpdateNoticeContinueBtn() {
		return NFKLoginpageUpdateNoticeContinueBtn;
	}

	public QAFWebElement getNFKLoginpageUpdateNoticeTitle() {
		return NFKLoginpageUpdateNoticeTitle;
	}

	public QAFWebElement getNFKSkipPairBtn() {
		return NFKSkipPairBtn;
	}

	public QAFWebElement getNFKLoginpageSignupMyselfLink() {
		return NFKLoginpageSignupMyselfLink;
	}

	public QAFWebElement getNFKLoginpageSignupDependentLink() {
		return NFKLoginpageSignupDependentLink;
	}

	public void setNFKSkipPairBtn(QAFWebElement NFKSkipPairBtn) {
		this.NFKSkipPairBtn = NFKSkipPairBtn;
	}

	public QAFWebElement getNFKLoginpageImportantOkBtn() {
		return NFKLoginpageImportantOkBtn;
	}

	public void setNFKLoginpageImportantOkBtn(QAFWebElement NFKLoginpageImportantOkBtn) {
		this.NFKLoginpageImportantOkBtn = NFKLoginpageImportantOkBtn;
	}

	public QAFWebElement getNFKLoginpageSignInOlderBtn() {
		return NFKLoginpageSignInOlderBtn;
	}

	public void setNFKLoginpageSignInOlderBtn(QAFWebElement NFKLoginpageSignInOlderBtn) {
		this.NFKLoginpageSignInOlderBtn = NFKLoginpageSignInOlderBtn;
	}

	public QAFWebElement getNFKLoginpageUsernameOlderTxt() {
		return NFKLoginpageUsernameOlderTxt;
	}

	public void setNFKLoginpageUsernameOlderTxt(QAFWebElement NFKLoginpageUsernameOlderTxt) {
		this.NFKLoginpageUsernameOlderTxt = NFKLoginpageUsernameOlderTxt;
	}

	public QAFWebElement getNFKLoginpagePasswordOlderTxt() {
		return NFKLoginpagePasswordOlderTxt;
	}

	public void setNFKLoginpagePasswordOlderTxt(QAFWebElement NFKLoginpagePasswordOlderTxt) {
		this.NFKLoginpagePasswordOlderTxt = NFKLoginpagePasswordOlderTxt;
	}

	public QAFWebElement getNFKLoginpageOlderLoginBtn() {
		return NFKLoginpageOlderLoginBtn;
	}

	public QAFWebElement getNFKCancelsetupbtn() {
		return NFKCancelsetupbtn;
	}

	public void setNFKLoginpageOlderLoginBtn(QAFWebElement NFKLoginpageOlderLoginBtn) {
		this.NFKLoginpageOlderLoginBtn = NFKLoginpageOlderLoginBtn;
	}

	public QAFWebElement getNFKLoginpageMeterContinueBtn() {
		return NFKLoginpageMeterContinueBtn;
	}

	public QAFWebElement getNFKLoginpageMeterVerioFlexMeter() {
		return NFKLoginpageMeterVerioFlexMeter;
	}

	public QAFWebElement getNFKLoginpageMeterNextBtn() {
		return NFKLoginpageMeterNextBtn;
	}

	public QAFWebElement getNFKForgotPasswordEmailTxt() {
		return NFKForgotPasswordEmailTxt;
	}

	public QAFWebElement getNFKForgotPasswordSenEmailBtn() {
		return NFKForgotPasswordSenEmailBtn;
	}

	public QAFWebElement getNFKForgotPasswordEmailResetLbl() {
		return NFKForgotPasswordEmailResetLbl;
	}

	public QAFWebElement getNFKForgotPasswordStaticTextBtn(String Text) {
		return LFSUtilsAndroid.getElement("NFK.forgotpassword.statictext.btn", Text);
	}

	public QAFWebElement getNFKLoginpageStatictextBtn(String text) {
		return LFSUtilsAndroid.getElement("NFK.loginpage.statictext.btn", text);
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKloginpageusernametxt() {
		return NFKLoginpageUsernameTxt;
	}

	public QAFWebElement getNFKloginpagepasswordtxt() {
		return NFKLoginpagePasswordTxt;
	}

	public QAFWebElement getNFKloginpageloginbtn() {
		return NFKLoginpageLoginBtn;
	}

	public QAFWebElement getNFKloginpageenabletouchidlbl() {
		return NFKLoginpageEnabletouchidLbl;
	}

	public QAFWebElement getNFKloginpageenabletouchidswitchbtn() {
		return NFKLoginpageEnabletouchidSwitchBtn;
	}

	public QAFWebElement getNFKloginpagekeepmeloginlbl() {
		return NFKLoginpageKeepmeloginLbl;
	}

	public QAFWebElement getNFKloginpagekeepmeloginswitchbtn() {
		return NFKLoginpageKeepmeloginSwitchBtn;
	}

	public QAFWebElement getNFKloginpagetouchidfingerprintimg() {
		return NFKLoginpageTouchidFingerprintImg;
	}

	public QAFWebElement getNFKloginpageforgotpasswordlnk() {
		return NFKLoginpageForgotpasswordLnk;
	}

	public QAFWebElement getNFKloginpagesignuplnl() {
		return NFKLoginpageSignupLnk;
	}

	public QAFWebElement getNFKForgotpasswordStatictextBtn() {
		return NFKForgotpasswordStatictextBtn;
	}

	public QAFWebElement getNFKLoginpageFrenchwelcomeLbl() {
		return NFKLoginpageFrenchwelcomeLbl;
	}

	public QAFWebElement getNFKLoginpageUpdatepageAgreeChkbx() {
		return NFKLoginpageUpdatepageAgreeChkbx;
	}

	public QAFWebElement getNFKLoginpageLocationaccessAllowBtn() {
		return NFKLoginpageLocationaccessAllowBtn;
	}
	public QAFWebElement getNFKForgotpasswordCloseBtn() {
		return NFKForgotpasswordCloseBtn;
	}
		
	public QAFWebElement getNFKLoginpageLoginBtnErrorTitle() {
		return NFKLoginpageLoginBtnErrorTitle;
	}

	public QAFWebElement getNFKLoginpageLoginBtnErrorTextMsg() {
		return NFKLoginpageLoginBtnErrorTextMsg;
	}

	public QAFWebElement getNFKLoginpageLoginBtnErrorOkBtn() {
		return NFKLoginpageLoginBtnErrorOkBtn;
	}

	CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
	@FindBy(locator = "NFK.loginpage.updatepage.agree.chkbx")
	private QAFWebElement NFKLoginpageUpdatepageAgreeChkbx;
	@FindBy(locator = "NFK.loginpage.locationaccess.allow.btn")
	private QAFWebElement NFKLoginpageLocationaccessAllowBtn;
	@FindBy(locator = "NFK.forgotpassword.emailerror.txt")
	private QAFWebElement NFKForgotpasswordEmailerrorTxt;
	@FindBy(locator = "NFK.loginpage.filled.username.txt")
	private QAFWebElement NFKLoginpageFilledUsernameTxt;
	@FindBy(locator = "NFK.loginpage.filled.password.txt")
	private QAFWebElement NFKLoginpageFilledPasswordTxt;

	public QAFWebElement getNFKLoginpageFilledUsernameTxt() {
		return NFKLoginpageFilledUsernameTxt;
	}

	public QAFWebElement getNFKLoginpageFilledPasswordTxt() {
		return NFKLoginpageFilledPasswordTxt;
	}

	public QAFWebElement getNFKLoginTabBtn() {
		return NFKLoginTabBtn;
	}

	public void signINToOlderApp() {
		if (getNFKLoginpageSignInOlderBtn().isPresent()) {
			getNFKLoginpageSignInOlderBtn().click();
		} else {
			Reporter.logWithScreenShot("Sign in button not present", MessageTypes.Pass);
		}
	}

	public void doLoginOlderApp(Object userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}
		if (getNFKLoginpageUsernameOlderTxt().isEnabled()) {

			getNFKLoginpageUsernameOlderTxt().click();
			getNFKLoginpageUsernameOlderTxt().sendKeys(userBean.getUsername());
			LFSUtilsAndroid.waitforLoad();
		}
		getNFKLoginpagePasswordOlderTxt().click();
		getNFKLoginpagePasswordOlderTxt().sendKeys(userBean.getPassword());

		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Login details are filled", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
	}

	public void doLogin(Object userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {
			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}
		if (getNFKloginpageusernametxt().isEnabled()) {
			LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), userBean.getUsername());
			LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userBean.getPassword());
		} else {
			LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userBean.getPassword());
		}
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
	}

	// method to signin with valid data
	public void doLogin1() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password.key");
		if (getNFKloginpageusernametxt().isEnabled()) {
			LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), email);
			LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), password);
		} else {
			LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), password);
		}
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
	}

	public void clickOnLogin_Btn_olderApp() {
		getNFKLoginpageOlderLoginBtn().click();
		LFSUtilsAndroid.waitforLoad();
	}

	public void clickOnLogin_Btn1() {
		LFSUtilsAndroid.click(getNFKloginpageloginbtn());
		Reporter.logWithScreenShot("User clicked on Login button", MessageTypes.Pass);
	}

	// Method to click on login button
	public void clickOnLogin_Btn() {
		getNFKloginpageloginbtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
		LFSUtilsAndroid.clickIfEnabled(getNFKloginpageloginbtn());
		LFSUtilsAndroid.click(getNFKLoginpageUpdateNoticeOkPopUp());	
		try {
			if (getNFKSignuppageImportantPopup().isDisplayed()) {
				getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("appCommon.ok")).click();
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Important Popup not displayed", MessageTypes.Pass);
		}
		
		getNFKLoginpageUpdateNoticeTitle().assertPresent("Update Notice title");
		LFSUtilsAndroid.click(getNFKLoginpageUpdateNoticeCheckBox());
		LFSUtilsAndroid.clickIfEnabled(getNFKLoginpageUpdateNoticeContinueBtn());
		Reporter.logWithScreenShot("User clicked on continue button of Notice screen", MessageTypes.Pass);
	}

	// Login to verify HCP user
	public void clickHCPLogin() {
		String msg = LFSUtilsAndroid.getPropString("auth.ageValidation.ageRestriction").substring(0, 54);
		getNFKForgotPasswordStaticTextBtn(msg).verifyPresent("Age restriction pop up");
	}

	// Method to clicking authentication type
	public void clickOnAuthenticationType(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getNFKloginpagekeepmeloginswitchbtn().getAttribute("checked").toString().equalsIgnoreCase("false"))
				getNFKloginpagekeepmeloginswitchbtn().click();
			Reporter.logWithScreenShot("Keep me login switch is On", MessageTypes.Pass);
			break;

		case "REQUIRE LOGIN":
			if (getNFKloginpagekeepmeloginswitchbtn().getAttribute("checked").toString().equalsIgnoreCase("true"))
				getNFKloginpagekeepmeloginswitchbtn().click();
			Reporter.logWithScreenShot("Keep me login toggle is off", MessageTypes.Pass);
			break;
		case "TOUCH ID":
			getNFKloginpageenabletouchidswitchbtn().waitForPresent();
			if (!getNFKloginpageenabletouchidswitchbtn().getAttribute("checked").toString().equalsIgnoreCase("true"))
				getNFKloginpageenabletouchidswitchbtn().click();
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	// To verify login page element
	public void verifyLoginPage() {
		getNFKloginpageusernametxt().verifyPresent("Username text field is present");
		getNFKloginpagepasswordtxt().verifyPresent("password text field is present");
		getNFKloginpageloginbtn().verifyPresent("Login button is present");
		getNFKloginpageforgotpasswordlnk().verifyPresent("Forgot password text is present");
		getNFKloginpagekeepmeloginswitchbtn().verifyPresent("Keep me login switch is present");
	}

	// Method to click on Forgot Password button
	public void clickOnforgotpass() {
		LFSUtilsAndroid.click(getNFKloginpageforgotpasswordlnk());
		Reporter.logWithScreenShot("User clicked on Fogot Password lilnk", MessageTypes.Pass);
	}

	// Method to verify forgot password page
	public void verifyForgotpwdPage() {
		getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("auth.forgotInfo.enterYourEmailLabel"));
		getNFKForgotPasswordEmailTxt().assertPresent("Email textfield to reset password");
		getNFKForgotPasswordSenEmailBtn().assertPresent("Send button");
		getNFKForgotpasswordCloseBtn().assertPresent("Close button");
		Reporter.logWithScreenShot("User has verified the Forgot screen", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKForgotpasswordCloseBtn());
		getNFKloginpageloginbtn().assertPresent("Login Button");
		Reporter.logWithScreenShot("User verified Fogot Password page", MessageTypes.Pass);
	}

	// Method to verify reset password with valid emailID
	public void verifyresetPasswordValidMail() {
		getNFKForgotPasswordEmailResetLbl().waitForPresent();
		getNFKForgotPasswordEmailTxt().clear();
		getNFKForgotPasswordEmailTxt().sendKeys("testt@testmail.com");
		getNFKForgotPasswordSenEmailBtn().click();
		getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("auth.confirmation.checkYourEmail"))
				.waitForPresent();
		getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("auth.confirmation.checkYourEmail"))
				.verifyVisible("Reset message");
	}

	// Method to reset password with invalid emailID
	public void verifyFGPWDInvalidEmailID() {
		getNFKForgotPasswordEmailResetLbl().waitForPresent();
		getNFKForgotPasswordEmailTxt().clear();
		if (getNFKForgotPasswordSenEmailBtn().isEnabled())
			getNFKForgotPasswordSenEmailBtn().click();
		else
			Reporter.logWithScreenShot("Email Text Field is blank and thus Send button is disabled", MessageTypes.Pass);
		getNFKForgotPasswordEmailResetLbl().waitForVisible();
		getNFKForgotPasswordEmailTxt().clear();
		getNFKForgotPasswordEmailTxt().sendKeys("Test123");
		getNFKForgotPasswordEmailResetLbl().click();
		Reporter.logWithScreenShot("Error popup for invalid email format", MessageTypes.Pass);
		getNFKForgotPasswordEmailTxt().clear();
		getNFKForgotPasswordEmailTxt().sendKeys("Test123@");
		getNFKForgotPasswordEmailResetLbl().click();
		Reporter.logWithScreenShot("Error popup for invalid email format", MessageTypes.Pass);
		getNFKForgotPasswordEmailTxt().clear();
		getNFKForgotPasswordEmailTxt().sendKeys("abcdsedsad@testmail.com");
		getNFKForgotPasswordEmailResetLbl().click();
		if (getNFKForgotPasswordSenEmailBtn().isEnabled())
			getNFKForgotPasswordSenEmailBtn().click();
		getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).waitForPresent();
		Reporter.logWithScreenShot("Error popup for invalid email format", MessageTypes.Pass);
		getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();

	}

	// Method to Login without Password field and invalid Password field
	public void loginWithoutPasswordField() {
		getNFKloginpageusernametxt().waitForPresent();
		getNFKloginpageusernametxt().sendKeys("Test123@testmail.com");
		getNFKloginpagepasswordtxt().clear();
		getNFKloginpagekeepmeloginlbl().click();
		if (getNFKloginpageloginbtn().isEnabled())
			getNFKloginpageloginbtn().click();
		else
			Reporter.logWithScreenShot("Password field is blank", MessageTypes.Pass);
		getNFKloginpagepasswordtxt().sendKeys("icpl12345#");
		if (getNFKloginpageloginbtn().isEnabled())
			getNFKloginpageloginbtn().click();
		if (getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Invalid Credential Popup is displayed")) {
			Reporter.logWithScreenShot("Entered Password is not a valid password", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to login successfully", MessageTypes.Pass);
		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}
	}

	// Method to login with Unregistered User
	public void loginUnregisteredUser() {
		String email = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		String pass = RandomStringUtils.randomAlphabetic(4) + "1234";
		getNFKloginpageusernametxt().waitForPresent();
		getNFKloginpageusernametxt().clear();
		getNFKloginpageusernametxt().sendKeys(email);
		getNFKloginpagepasswordtxt().clear();
		getNFKloginpagepasswordtxt().sendKeys(pass);
		if (getNFKloginpagekeepmeloginlbl().isPresent())
			getNFKloginpagekeepmeloginlbl().click();
		if (getNFKloginpageloginbtn().isEnabled())
			getNFKloginpageloginbtn().click();

		if (getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Invalid Credential Popup is displayed")) {
			Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is a registered user", MessageTypes.Pass);
		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}
	}

	// Method to login with Invalid Username
	public void loginWithInvalidUsername() {
		String typeName = RandomStringUtils.randomAlphanumeric(7) + "@testmail.com";
		LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), typeName);
		LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), "123abc@@");
		LFSUtilsAndroid.clickIfEnabled(getNFKloginpageloginbtn());
		getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Text of Error pop-up");
		getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("appCommon.ok"))
				.assertPresent("OK button on error pop up");
		LFSUtilsAndroid.click(getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("appCommon.ok")));
		Reporter.logWithScreenShot("User enetered invalid login details", MessageTypes.Pass);
	}

	public void validateSpecialCharacterEmailField() {
		getNFKForgotPasswordEmailTxt().clear();
		getNFKForgotPasswordEmailTxt().sendKeys("ab$#%^&@testmail.com");
		getNFKForgotPasswordSenEmailBtn().click();
		try {
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).isDisplayed();
			Reporter.logWithScreenShot("valid mail id is entered", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Inalid mail id is entered", MessageTypes.Pass);
		}

	}

	public QAFWebElement getNFKForgotpasswordEmailerrorTxt() {
		return NFKForgotpasswordEmailerrorTxt;
	}

	// Method to verify email field is non editable once user login in to
	// application
	public void verifyDisableEmailField() {
		getNFKloginpageusernametxt().waitForPresent();
		getNFKloginpageusernametxt().verifyDisabled("Email field after login once");
	}

	// Method to verify keep me login switch disable
	public void verifyKeepMeLoginSwtchDisable() {
		getNFKloginpagekeepmeloginswitchbtn().waitForPresent();

		WebDriverTestCase.verifyTrue(getNFKloginpagekeepmeloginswitchbtn().getAttribute("checked").contains("false"),
				"Keep me login btn is on", "Keep me login btn is off");
	}

	// Method to click on Login button
	public void clickOnLoginButtonAndBack() {
		getNFKloginpageloginbtn().waitForEnabled();
		getNFKloginpageloginbtn().click();
		String ok = ConfigurationManager.getBundle().getString("appCommon.ok");
		try {
			getNFKForgotPasswordStaticTextBtn(ok).waitForPresent();
			Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ok).click();
			try {
				getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("updateNotice.title"))
						.waitForPresent();
				Reporter.logWithScreenShot("Update Notice page is displayed", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Update Notice page is not displayed", MessageTypes.Pass);
			}
		} catch (Exception e) {

		}
		LFSUtilsAndroid.clickBackButton();
		getNFKloginpageloginbtn().verifyPresent("After clicking back login page");
	}

	// method to click on login button only
	public void clickOnLoginBtnOnly() {
		getNFKloginpageloginbtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKloginpageloginbtn().click();
		LFSUtilsAndroid.waitforLoad();
	}

	// Method to select update notice page check box and contineu
	public void selectUpdateNotice() {
		String ok = ConfigurationManager.getBundle().getString("appCommon.ok");
		try {
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.waitForPresent();
			Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			try {
				getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("updateNotice.title"))
						.waitForPresent();
				Reporter.logWithScreenShot("Update Notice page is displayed", MessageTypes.Pass);
				getNFKLoginpageUpdatepageAgreeChkbx().click();
				getNFKloginpageloginbtn().click();
			} catch (Exception e) {
				Reporter.logWithScreenShot("Update Notice page is not displayed", MessageTypes.Pass);
			}

			try {
				getNFKLoginpageLocationaccessAllowBtn().waitForPresent();
				if (getNFKLoginpageLocationaccessAllowBtn().isPresent()) {
					Reporter.logWithScreenShot("Location access popup is displayed", MessageTypes.Pass);
					getNFKLoginpageLocationaccessAllowBtn().click();
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}
	}

	// Mehtod to skip on turn on your meter screen
	public void clickOnSkipTurnOnMeterScreen() {
		getNFKLoginpageMeterVerioFlexMeter().waitForPresent();
		getNFKLoginpageMeterVerioFlexMeter().click();
		getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		SignupPageAndroid android = new SignupPageAndroid();
		android.getNFKsignuppageskipbtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on your meter screen", MessageTypes.Pass);
	}

	// method to skip on turn on blooth screen
	public void clickOnSkipTurnOnMeteBluetoothScreen() {
		getNFKLoginpageMeterVerioFlexMeter().waitForPresent();
		getNFKLoginpageMeterVerioFlexMeter().click();
		getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKLoginpageMeterNextBtn().click();
		Reporter.logWithScreenShot("After clicking next btn on Turn on your meter screen", MessageTypes.Pass);
		getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("pairing.turn.on.bluetooth").substring(0, 10))
				.waitForPresent();
		Reporter.logWithScreenShot("Turn Bluetooth On screen", MessageTypes.Pass);
		SignupPageAndroid android = new SignupPageAndroid();
		android.getNFKsignuppageskipbtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on Bluetooth screen", MessageTypes.Pass);
	}

	// method to skip on turn on blooth screen
	public void clickOnSkipSearchScreen() {
		getNFKLoginpageMeterVerioFlexMeter().waitForPresent();
		getNFKLoginpageMeterVerioFlexMeter().click();
		getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKLoginpageMeterNextBtn().click();
		Reporter.logWithScreenShot("After clicking next btn on Turn on your meter screen", MessageTypes.Pass);
		getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("pairing.turn.on.bluetooth").substring(0, 10))
				.waitForPresent();
		Reporter.logWithScreenShot("Turn Bluetooth On screen", MessageTypes.Pass);
		getNFKLoginpageMeterContinueBtn().click();
		Reporter.logWithScreenShot("After clicking Continue btn on Turn on Bluetooth screen", MessageTypes.Pass);
		SignupPageAndroid android = new SignupPageAndroid();
		android.getNFKsignuppageskipbtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on search device screen", MessageTypes.Pass);
	}

	public void verifyFingerPrint(String successFail) {
		clickOnAuthenticationType("TOUCH ID");
		getNFKloginpagetouchidfingerprintimg().click();
		Reporter.logWithScreenShot("after clicking", MessageTypes.Pass);

		String command = "mobile:fingerprint:set";
		LFSUtilsAndroid jnjUtil = new LFSUtilsAndroid();
		Map<String, Object> params = new HashMap<>();
		params.put("identifier", ConfigurationManager.getBundle().getString("appName"));
		params.put("resultAuth", successFail);
		jnjUtil.getDriver().executeScript("mobile:fingerprint:set", params);
		if (successFail.equalsIgnoreCase("success")) {
			params.put("resultAuth", "success");
			getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("appCommon.ok")).waitForPresent();
			getNFKForgotPasswordStaticTextBtn(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("FingerPrint is enabled successfully", MessageTypes.Pass);
		} else if (successFail.equalsIgnoreCase("fail")) {
			params.put("resultAuth", "fail");
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("FingerPrint authtentication fail", MessageTypes.Pass);
			getNFKloginpagetouchidfingerprintimg().verifyVisible("Login screen visible");

		}

	}

	// Method to verify no touch ID present when sensor is off
	public void noTouchIDPresent() {
		getNFKloginpageenabletouchidswitchbtn().verifyNotPresent("TouchID Switch");
	}
	// method to verify Enable touch id option on sign up page
	// Varsha

	public void verifyTouchIdImageOnLogin() {
		// getNFKLoginpageTouchidImg().waitForPresent();
		// getNFKLoginpageTouchidImg().verifyPresent("Enable touch ID image is
		// present");
		Reporter.logWithScreenShot("Perfecto pop up for fingure print activation");
	}

	// code added by Ashish Biradar
	public void clickAppCommonOkBtn() {
		String ok = ConfigurationManager.getBundle().getString("appCommon.ok");
		try {
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.waitForPresent();
			Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLoginIDPopullated(Object userdetails) {
		String userId = getNFKloginpageusernametxt().getText();

		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}

		if (userId.equalsIgnoreCase(userBean.getUsername())) {
			Reporter.logWithScreenShot("User Id pre-popullated matching as per requirement", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("User Id pre-popullated not matching as per requirement", MessageTypes.Fail);
		}
	}

	public void userEnterPasswordDetails(Object userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}

		getNFKloginpagepasswordtxt().click();
		getNFKloginpagepasswordtxt().sendKeys(userBean.getPassword());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Login details are filled", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
	}

	public void clickSkipBtn() {
		if (getNFKSkipPairBtn().isPresent()) {
			getNFKSkipPairBtn().click();
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Skip pair button not prsent", MessageTypes.Pass);
		}
	}
	/*
	 * Get the Os Version of the Device Develop BY:- Biswa Senapati
	 */

	public void getOS_Version() {
		Map<String, Object> params = new HashMap<>();
		params.put("property", "osVersion");
		String osVersion = (String) driver.executeScript("mobile:device:info", params);
		Reporter.log(osVersion);
		ConfigurationManager.getBundle().setProperty("Os.Version", osVersion);

	}

	/*
	 * Verify latest os Support NFK Develop BY:- Biswa Senapati
	 */

	public void verifyLatestOs() {
		String latestOs = "8.0.0";
		String previousLatestOs = "7.0";
		String osVersion = (String) ConfigurationManager.getBundle().getProperty("Os.Version");
		Reporter.log(osVersion);
		if (osVersion.equals(latestOs)) {
			Reporter.logWithScreenShot("NFK support latest OS" + osVersion, MessageTypes.Pass);
		}

		else if (osVersion.equals(previousLatestOs)) {
			Reporter.logWithScreenShot("NFK support latest OS" + previousLatestOs, MessageTypes.Pass);
		}

		else {
			Reporter.log("NFK does not support Latest OS", MessageTypes.Fail);
		}
	}

	public void loginWithGDPRInvalidUsername() {
		AccountPageAndroid accountPageAndroid = new AccountPageAndroid();
		getNFKloginpageusernametxt().waitForPresent();
		getNFKloginpageusernametxt().clear();
		getNFKloginpageusernametxt().sendKeys("#+avsbdf13234");
		getNFKloginpagepasswordtxt().clear();
		getNFKloginpagepasswordtxt().sendKeys("c0nn3ct");

		accountPageAndroid.getNFKMoremenuAccountpageDeleteaccountBtn().verifyEnabled("Delete account button is ");
		accountPageAndroid.getNFKMoremenuAccountpageDeleteaccountBtn().click();

		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Error message popup is displayed", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}

	}

	public void doLoginAfterAccountDeletion() {
		if (getNFKloginpageusernametxt().isEnabled()) {
			getNFKloginpageusernametxt().click();
			getNFKloginpageusernametxt()
					.sendKeys((String) ConfigurationManager.getBundle().getProperty("register.email.key"));
		}
		getNFKloginpagepasswordtxt().click();
		getNFKloginpagepasswordtxt()
				.sendKeys((String) ConfigurationManager.getBundle().getProperty("register.password.key"));
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Login details are filled", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();

	}

	public void clickLoginButtonToVerifyDelete() {
		getNFKloginpageloginbtn().click();

	}

	public void clickOnLoginNotAgreedTerms() {

		SignupPageAndroid android = new SignupPageAndroid();
		EventLogPageAndroid logbookPageAndroid = new EventLogPageAndroid();
		String ok = ConfigurationManager.getBundle().getString("appCommon.ok");
		getNFKloginpageloginbtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKloginpageloginbtn().click();

		try {

			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.waitForPresent();
			Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		} catch (Exception e) {
			Reporter.logWithScreenShot("No Pop up", MessageTypes.Pass);
		}
		getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("more.emeaConsent"))
				.waitForPresent();
		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("more.emeaConsent"))
				.isPresent()) {
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data link is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data link is not present",
					MessageTypes.Fail);
	}

	public void selectAndVerifySensitiveDataScreen() {
		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("more.emeaConsent"))
				.isPresent()) {
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data link is present", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("more.emeaConsent")).click();
		} else
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data link is not present",
					MessageTypes.Fail);
		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("more.emeaConsent"))
				.isPresent()) {
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data screen is present",
					MessageTypes.Pass);
			MyMeters meters = new MyMeters();
			meters.getNFKMymeterspagePairmeterCancelBtn().waitForPresent();
			meters.getNFKMymeterspagePairmeterCancelBtn().click();
		} else
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data screen is not present",
					MessageTypes.Fail);
	}

	public void sendDetailsForForgotPasswordLink(String email) {
		getNFKForgotPasswordEmailTxt().clear();
		getNFKForgotPasswordEmailTxt().sendKeys(email);
		getNFKForgotPasswordSenEmailBtn().verifyPresent("Send button");
		getNFKForgotPasswordSenEmailBtn().click();

	}

	public void loginAndVerifyLoginWithResetPwd(String email) {
		if (getNFKloginpageusernametxt().isEnabled()) {

			getNFKloginpageusernametxt().clear();

			getNFKloginpageusernametxt().sendKeys(email);
		}
		getNFKloginpagepasswordtxt().click();
		getNFKloginpagepasswordtxt().sendKeys((String) ConfigurationManager.getBundle().getProperty("newPassword"));
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Login details are filled", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
		SignupPageAndroid android = new SignupPageAndroid();
		EventLogPageAndroid logbookPageAndroid = new EventLogPageAndroid();
		getNFKloginpageloginbtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKloginpageloginbtn().click();

		try {

			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.waitForPresent();
			Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Reporter.logWithScreenShot("After click on login button");
	}

	public void enterLogindetailafterdelete() {
		if (getNFKloginpageusernametxt().isEnabled()) {
			getNFKloginpageusernametxt().click();
			getNFKloginpageusernametxt()
					.sendKeys((String) ConfigurationManager.getBundle().getProperty("register.email.key"));
		}
		getNFKloginpagepasswordtxt().click();
		getNFKloginpagepasswordtxt()
				.sendKeys((String) ConfigurationManager.getBundle().getProperty("register.password.key"));
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Login details are filled", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();

	}

	public void doDependentLogin(String userdata) {
		UserDetailBeans userbean = new UserDetailBeans();
		if (userdata instanceof String) {
			userbean.fillFromConfig(userdata);
		} else {
			userbean.fillData(userbean);
		}
		LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), userbean.getDependentemail());
		LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userbean.getDependentpassword());
		Reporter.logWithScreenShot("User has entered the Dependent Login details", MessageTypes.Pass);
	}

	public void verifyDepenedentLoginScreen() {
		try {
			getNFKloginpageusernametxt().assertPresent("Username or Email field");
			getNFKloginpagepasswordtxt().assertPresent("Password field");
			getNFKloginpageforgotpasswordlnk().assertPresent("Forgot password link");
			getNFKLoginpageSignupMyselfLink().assertPresent("Signup Myself link");
			getNFKLoginpageSignupDependentLink().assertPresent("Signup dependent link");
			Reporter.logWithScreenShot("User verified the Login screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify the Login screen", MessageTypes.Fail);
		}
	}

	public void handleErrorPopUp() {
		try {
			getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("alerts.error.title")).isPresent();
			getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("alerts.error.title"))
					.assertPresent("Error pop-up title");
			getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("network.error.loginAuthentication"))
					.assertPresent("Text of Error pop-up");
			getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			Reporter.logWithScreenShot("Error Pop-up displayed", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("appCommon.ok")));
			Reporter.logWithScreenShot("User handled error popup successfully", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to handle error popup", MessageTypes.Fail);
		}

	}

	public void getCGMReading(String cgmdata, String userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}
		EventDetailBeans detailbean = new EventDetailBeans();
		detailbean.fillFromConfig((String) cgmdata);

		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = userBean.getPassword();
		ApiMethods apiObj = new ApiMethods();
		// apiObj.addLoginDetails(email, password);

	}

	public void ClickonCancelButton() {
		if (getNFKLoginpageCreateguradianCancelBtn().isPresent()) {
			getNFKLoginpageCreateguradianCancelBtn().click();
			Reporter.logWithScreenShot("Cicked on cancel button", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Not able to click on cancel button", MessageTypes.Fail);
		}
	}

	public void ClickonSignupButton() {
		if (getNFKloginpageCreateguradianSignupBtn().isPresent()) {
			getNFKloginpageCreateguradianSignupBtn().click();
			Reporter.logWithScreenShot("Cicked on Signup button", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Not able to click on signup button", MessageTypes.Fail);
		}
	}

	public void verifyGuardianAccountPopup() {
		if (getNFKLoginpageCreateguradianTitle().isPresent() && getNFKLoginpageCreateguradianCancelBtn().isPresent()) {
			getNFKLoginpageCreateguradianTitle().assertPresent("Create a Guradian Account");
			getNFKLoginpageCreateguradianCancelBtn().assertPresent("CANCEL");
			Reporter.logWithScreenShot("Create Guardian Account Popup is present", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Create Guardian Account Popup is Not present", MessageTypes.Fail);
		}
	}

	public void verifyfilledLoginPage() {
		getNFKLoginpageFilledUsernameTxt().assertPresent("Username or Email Address");
		getNFKLoginpageFilledPasswordTxt().assertPresent("Password");
		getNFKloginpageforgotpasswordlnk().assertPresent("Forgot password link");
		getNFKLoginpageSignupMyselfLink().assertPresent("Signup Myself link");
		getNFKLoginpageSignupDependentLink().assertPresent("Signup dependent link");
		Reporter.logWithScreenShot("User verified the Login screen", MessageTypes.Pass);
	}

	public void clickOnLogin_BtnforMinor() {
		String ok = ConfigurationManager.getBundle().getString("appCommon.ok");
		getNFKloginpageloginbtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
		getNFKloginpageloginbtn().click();
		LFSUtilsAndroid.waitforLoad();
	}

	public void clickOnLoginLink() {
		CountrySelectionPageAndroid country = new CountrySelectionPageAndroid();
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		country.getNFKDecisionPageLoginDependentBtn().assertPresent("Login Dependent button");
		country.getNFKDecisionPageLoginDependentBtn().click();
		Reporter.logWithScreenShot("Clicked on Depedent Login", MessageTypes.Pass);
	}

	public void ValidateInvalidEmailid() {
		String email = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		LFSUtilsAndroid.enterText(getNFKForgotPasswordEmailTxt(), "Test123");
		LFSUtilsAndroid.click(getNFKForgotPasswordSenEmailBtn());
		if (getNFKLoginpageValidationErrorMsg().getText()
				.contains(ConfigurationManager.getBundle().getString("auth.emailValidation.emailNotValidFormat"))) {
			Reporter.logWithScreenShot("Error popup for invalid email format", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKLoginpageValidationErrorIcon());
		} else {
			Reporter.logWithScreenShot("Error popup for invalid email not displayed", MessageTypes.Fail);
		}
		if (!getNFKForgotPasswordSenEmailBtn().isEnabled()) {
			Reporter.logWithScreenShot("Send button is disabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Email is blank and Send button is Not disabled", MessageTypes.Fail);
		}
		LFSUtilsAndroid.enterText(getNFKForgotPasswordEmailTxt(), email);
		LFSUtilsAndroid.click(getNFKForgotPasswordSenEmailBtn());
		if (getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("auth.confirmation.checkYourEmail"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email Send popup displayed", MessageTypes.Pass);
			LFSUtilsAndroid.click(
					getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")));
		} else {
			Reporter.logWithScreenShot("Error popup for invalid email not displayed", MessageTypes.Fail);
		}
		// LFSUtilsAndroid.clickBackButton();
	}

	public void ClickBackAndMydepedentData() {
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		CountrySelectionPageAndroid SelectionAndroid = new CountrySelectionPageAndroid();
		LFSUtilsAndroid.click(SelectionAndroid.getNFKDecisionPageLoginDependentBtn());

	}

	public void LoginInvalidPassword() {

		getNFKloginpageusernametxt().waitForPresent();
		getNFKloginpageusernametxt().clear();
		getNFKloginpageusernametxt().sendKeys("testaccvm@mailinator.com");
		getNFKloginpagepasswordtxt().clear();
		getNFKloginpageloginbtn().verifyDisabled("Login Button  after blank  password");
		getNFKloginpagepasswordtxt().sendKeys("tets123123");
		if (getNFKloginpageloginbtn().isEnabled())
			getNFKloginpageloginbtn().click();

		if (getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Invalid Credential Popup is displayed")) {
			Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);

		} else
			Reporter.logWithScreenShot("User is a registered user", MessageTypes.Pass);
		if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}
	}

	public void verifyGestationalScreen() {
		getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("more.aboutme.diabetesType.gestational"))
				.waitForPresent(2000);
		getNFKLoginpageStatictextBtn(LFSUtilsAndroid.getPropString("more.aboutme.diabetesType.gestational"))
				.assertPresent("Title Gestational");
		getNFKGestationalProfileInfo().assertPresent("Profile Info");
		getNFKGestationalProfileWarning().assertPresent("Warning message");
		getNFKGestationalTypeOneRadioBtn().assertPresent("Type 1 Radio button");
		getNFKGestationalTypeTwoRadioBtn().assertPresent("Type 2 Radio button");
		getNFKGestationalFotterPart().isPresent();
		Reporter.logWithScreenShot("user has verified the Gestational screen", MessageTypes.Pass);
	}

	public void clickCancelNavLogin() {
		getNFKGestationalContinueBtn().waitForEnabled(200);
		if (getNFKGestationalContinueBtn().isEnabled()) {
			Reporter.logWithScreenShot("User has selected Type of Diabetes Continue button is Enabled",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Continue button is disbaled", MessageTypes.Fail);
		}
		getNFKGestationalCancelBtn().isPresent();
		getNFKGestationalCancelBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has clicked on Cancel button", MessageTypes.Pass);

	}

	public void verifyContinuebtnEnable() {
		getNFKGestationalContinueBtn().isPresent();
		getNFKGestationalContinueBtn().isEnabled();
		Reporter.logWithScreenShot("Continue button got enabled", MessageTypes.Pass);

	}

	public void VerifyResetPwd() {
		getNFKGestationalResetPasswordFirstname().verifyPresent("First Name is present");
		getNFKGestationalResetPasswordLastname().verifyPresent("last Name is present");
		getNFKGestationalResetPasswordBirthDate().verifyPresent("Birth Date is present");
		getNFKGestationalResetPasswordEmailAddress().verifyPresent("Email address is present");
		getNFKGestationalResetPasswordConfirmEmailAddress().verifyPresent("confirm Email address is present");
		getNFKGestationalResetPasswordPassword().verifyPresent("Password is present");
		getNFKGestationalResetPasswordConfirmPassword().verifyPresent("confirm password is present");
		getNFKGestationalResetPasswordCheckAgreementTerm().verifyPresent("Terms and angreement is present");
		for (int i = 0; i < 4; i++) {
			getNFKGestationalResetPasswordInputIcon().get(i).verifyPresent("Green Tick mark is present");
		}

		Reporter.logWithScreenShot("All field are verified ", MessageTypes.Pass);
		getNFKGestationalResetPasswordPassword().sendKeys("test1234");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		getNFKGestationalResetPasswordConfirmPassword().sendKeys("test1234");
		getNFKGestationalResetPasswordCheckAgreementTerm().click();
		LFSUtilsAndroid.hideKeyboard();
		getNFKGestationalResetPasswordContinueButton().isEnabled();
		Reporter.logWithScreenShot("Continue button enabled ", MessageTypes.Pass);
	}

	public void editResetPwdscreen() {
		LFSUtilsAndroid.swipePageUp();
		getNFKGestationalResetPasswordFirstname().clear();
		getNFKGestationalResetPasswordFirstname().sendKeys("John");
		getNFKGestationalResetPasswordLastname().clear();
		getNFKGestationalResetPasswordLastname().sendKeys("Smith");
		getNFKGestationalResetPasswordEmailAddress().clear();
		getNFKGestationalResetPasswordEmailAddress().sendKeys("testpatemail@testmail.com");
		getNFKGestationalResetPasswordConfirmEmailAddress().clear();
		getNFKGestationalResetPasswordConfirmEmailAddress().sendKeys("testpatemail@testmail.com");
	}

	public void resetpassdob() {
		getNFKGestationalResetPasswordBirthDate().click();
		getNFKResetPasswordDobPopupTitle().verifyPresent("Worng Date of birth Title");
		getNFKResetPasswordDobPopupOk().verifyPresent("Worng Date of birth OK Button");
		if (getNFKResetPasswordDobPopupTitle().getText().contains("Wrong birth date?")) {
			if (getNFKResetPasswordDobPopupOk().getText().contains("OK")) {
				Reporter.logWithScreenShot("Wrong birth date is displayed", MessageTypes.Pass);
				getNFKResetPasswordDobPopupOk().click();
			}
		} else {
			Reporter.logWithScreenShot("Wrong birth date is not displayed", MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipePageUp();
		getNFKResetPasswordTitle().verifyPresent("Reset Password Title is present");
		if (getNFKResetPasswordTitle().getText()
				.contains("Reset your password and confirm your information below to continue")) {
			Reporter.logWithScreenShot("Redirected to Reset Password screen ", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Not redirected to reset password screen", MessageTypes.Fail);
		}

	}
	//Auther-Pradnya
	//Description-Method to redirect login page
	public void userRedirectedLoginpage() {
		if(getNFKLoginpageYesLoginMeBtn().isPresent()) {
			LFSUtilsAndroid.click(getNFKLoginpageYesLoginMeBtn());}
		LFSUtilsAndroid.click(getNFKLoginpageMyowndataBtn());
	}
	//Auther-pradnya
	//Description-Method to enter login details
		public void userEnterLoginDetail(String details) {
			UserDetailBeans userbean = new UserDetailBeans();
			if (details instanceof String) {
				userbean.fillFromConfig(details);
			} else {
				userbean.fillData(userbean);
			}
			LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), userbean.getExpiredusername());
			LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userbean.getPassword());
			Reporter.logWithScreenShot("User has entered the Login details", MessageTypes.Pass);
			
		}
	public void cancelsetup() {

		getNFKCancelsetupbtn().isPresent();

		LFSUtilsAndroid.click(getNFKCancelsetupbtn());

		Reporter.logWithScreenShot("Cancel setup btn clicked sucessfully ", MessageTypes.Pass);
	}

//	 Shubham
//	 Method To Verify Login Tab And Error Message
	public void verifyLoginTabAndErrorMessage() {
		try {

			getNFKLoginTabBtn().verifyEnabled("Login button");
			getNFKLoginTabBtn().click();
			getNFKLoginErrorMessageBtn().verifyPresent("Creaditial error");
			getNFKLoginTabBtn().verifyEnabled();
			LFSUtilsAndroid.click(getNFKLoginTabBtn());
			getNFKLoginErrorMessageBtn().verifyPresent();

			Reporter.logWithScreenShot("The Login button enabled and verify error message", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify error message", MessageTypes.Fail);

		}
	}
	// AuthorName - Minal
			// Description - method to click on Login button
			public void clicksOnLoginAndNavigateToNoticescreen() {
				try {
					getNFKloginpageloginbtn().waitForEnabled();
					Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
					LFSUtilsAndroid.clickIfEnabled(getNFKloginpageloginbtn());
					Reporter.logWithScreenShot("User clicked on Login button", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("User not able to clicked on Login button", MessageTypes.Fail);
				}
			}

			// AuthorName - Minal
			// Description - method to Verify fields on Notice Screen.
			public void verifyNoticeScreen() {
				try {
					getNFKloginpageUpdateNoticeUpdatenoticeLbl().verifyPresent();
					getNFKloginpageUpdateNoticeWehaveupdatedTxt().verifyPresent();
					getNFKloginpageUpdateNoticePrivacypolicyTxt().verifyPresent();
					getNFKloginpageUpdateNoticeTermsofuseTxt().verifyPresent();
					getNFKloginpageUpdateNoticeConsenttoprocessTxt().verifyPresent();
					getNFKLoginpageUpdateNoticeCheckBox().verifyPresent();
					getNFKLoginpageUpdateNoticeContinueBtn().verifyDisabled();
					Reporter.logWithScreenShot("Verified Notice Screen", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Notice Screen not displayed", MessageTypes.Fail);
				}
			}

			// AuthorName - Minal
			// Description - Method to Verify Continue Button Gets Enable on Clicking Read and Agree checkbox
			public void verifyContinueBtngetsEnabled() {
				LFSUtilsAndroid.click(getNFKLoginpageUpdateNoticeCheckBox());
				getNFKLoginpageUpdateNoticeContinueBtn().waitForEnabled();
				if (getNFKLoginpageUpdateNoticeContinueBtn().isEnabled()) {
					Reporter.log("Continue button got enabled ", MessageTypes.Pass);
				} else {
					Reporter.log("Continue button not enabled ", MessageTypes.Pass);
				}

			}

			// AuthorName - Minal
			// Description - Method to click on Continue button on Notice Screen
			public void clickOnContinueBtn() {
				try {
					LFSUtilsAndroid.click(getNFKLoginpageUpdateNoticeContinueBtn());
					Reporter.logWithScreenShot("The user clicked on Continue button ", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("The user not able to click on Continue button", MessageTypes.Fail);
				}
			}

			// AuthorName - Minal
			// Description - Method to Verify user is landed on First page of safety onboarding from Notice screen.
			public void verifySafetyOnBoardingPage() {
				try {
					getNFKsignuppagesafetytitle().verifyPresent();
					Reporter.logWithScreenShot("User is navigated to Welcome screen of the Safety Onboarding",MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("User is not navigated to Welcome screen of the Safety Onboarding",MessageTypes.Fail);
				}
			}
			
			/*
			 * Author: Yogesh 
			 * Description: Method to launch chrome browser and reset the passwords
			 */
			public void launchChromeBrowser(String Usertype) throws InterruptedException {
				SignupPageAndroid android = new SignupPageAndroid();
				UserDetailBeans userBean = new UserDetailBeans();
				try {
					WebDriverManager.edgedriver().setup();
					WebDriver driver = new EdgeDriver();
					driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp?to="+ android.email1);
					driver.manage().window().maximize();
					WebDriverWait wait = new WebDriverWait(driver, 60);
					WebElement veryFirstEmail = wait.until(ExpectedConditions.elementToBeClickable(
							By.xpath("//*[@class=\"table-striped jambo_table\"]/tbody/tr[position()=1]/td[3]")));
					veryFirstEmail.click();
					int size = driver.findElements(By.tagName("iframe")).size();
					driver.switchTo().frame("html_msg_body");
					WebElement emailLink = wait
							.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > p:nth-child(2)")));
					String retrievedLink = emailLink.getText();
					((JavascriptExecutor) driver).executeScript("window.open()");
					ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs.get(1));
					driver.get(retrievedLink);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=\"password\"]")));
					switch (Usertype) {
					case "dependentUser":
						driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("Testing@123456");
						driver.findElement(By.cssSelector("input[id=\"confirmPassword\"]")).sendKeys("Testing@123456");
						driver.findElement(By.cssSelector("button[type=\"submit\"]")).sendKeys(Keys.RETURN);
						break;
					case "adultUser":
						driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("Testing@12345");
						driver.findElement(By.cssSelector("input[id=\"confirmPassword\"]")).sendKeys("Testing@12345");
						driver.findElement(By.cssSelector("button[type=\"submit\"]")).sendKeys(Keys.RETURN);
						break;
					}
					driver.quit();
					Reporter.logWithScreenShot("Adult user is updated the password", MessageTypes.Pass);
				} catch (Exception e) {
					e.printStackTrace();
					Reporter.logWithScreenShot("Failed to reset password", MessageTypes.Fail);

				}
			}

			/*
			 * Author: Yogesh 
			 * Description: method to enter email and password on the login page
			 */
			public void enterEmailandPassword(String Password) {
				UserDetailBeans userBean = new UserDetailBeans();
				if (Password instanceof String) {
					userBean.fillFromConfig(Password);
				} else {
					userBean.fillData(Password);
				}
				SignupPageAndroid android = new SignupPageAndroid();
				try {
					if (getNFKloginpageusernametxt().isEnabled()) {
						LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), android.email1);
						LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userBean.getPassword());
					} else {
						LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userBean.getPassword());
					}
					LFSUtilsAndroid.hideKeyboard();
					Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
				} catch (Exception e) {
					e.printStackTrace();
					Reporter.logWithScreenShot("Failed to Re-Login", MessageTypes.Fail);

				}
			}

			/*
			 * Author: Yogesh 
			 * Description: Method to enter details on send forget password email field and click on send button
			 */
			public void fillSignUpDetails() {
				SignupPageAndroid android = new SignupPageAndroid();
				try {
					getNFKForgotPasswordEmailTxt().clear();
					LFSUtilsAndroid.enterText(getNFKloginpageusernametxt(), android.email1);
					getNFKForgotPasswordSenEmailBtn().verifyPresent("Send button");
					getNFKForgotPasswordSenEmailBtn().click();
					if (getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).isDisplayed()) {
						getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
						}
					}catch (Exception e) {
						e.printStackTrace();
						Reporter.logWithScreenShot("Email entered and Password link sent", MessageTypes.Pass);
				}
			}

			/*
			 * Author: Yogesh 
			 * Description: Method to click on login button and verify the Notice screen
			 */
			public void ClickOnLogin_BtnAndVerifyNotice() {
				try {
					getNFKloginpageloginbtn().waitForEnabled();
					Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
					LFSUtilsAndroid.clickIfEnabled(getNFKloginpageloginbtn());
					getNFKloginpageUpdateNoticeUpdatenoticeLbl().verifyPresent();
					getNFKloginpageUpdateNoticeWehaveupdatedTxt().verifyPresent();
					getNFKloginpageUpdateNoticePrivacypolicyTxt().verifyPresent();
					getNFKloginpageUpdateNoticeTermsofuseTxt().verifyPresent();
					getNFKloginpageUpdateNoticeConsenttoprocessTxt().verifyPresent();
					getNFKLoginpageUpdateNoticeCheckBox().verifyPresent();
					getNFKLoginpageUpdateNoticeContinueBtn().verifyDisabled();
					Reporter.logWithScreenShot("User verify the notice screen", MessageTypes.Pass);
				} catch (Exception e) {
					e.printStackTrace();
					Reporter.logWithScreenShot("User failed to verify Notice screen", MessageTypes.Pass);
				}
			}
				
	/*
	 * Author: Yogesh 
	 * Description: Click on the Login Button and Verify the error pop-up for Incorrect username or password
	 */
	public void ClickOnLogin_BtnAndVerifyErrorMessage() {
		getNFKloginpageloginbtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
		LFSUtilsAndroid.clickIfEnabled(getNFKloginpageloginbtn());
		getNFKLoginpageLoginBtnErrorTitle().waitForPresent(2000);
		getNFKLoginpageLoginBtnErrorTitle().verifyPresent("Error");
		getNFKLoginpageLoginBtnErrorTextMsg().verifyPresent("Username or password is incorrect. Please try again.");
		try {
			if (getNFKLoginpageLoginBtnErrorTitle().isDisplayed()) {
				getNFKForgotPasswordStaticTextBtn(LFSUtilsAndroid.getPropString("appCommon.ok")).click();
			} else if (getNFKLoginpageLoginBtnErrorOkBtn().isDisplayed()) {
				LFSUtilsAndroid.click(getNFKLoginpageLoginBtnErrorOkBtn());
			}
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Error Popup not displayed", MessageTypes.Pass);
		}
	}

	/*
	 * Author: Yogesh 
	 * Description: Clear the password field and enter the Password in to the password field
	 */
	public void clearField_EnterPassword(String Password) {
		try{
			getNFKloginpageloginBtnclearpasswordtxt().waitForPresent(2000);
			getNFKloginpageloginBtnclearpasswordtxt().clear();
		UserDetailBeans userBean = new UserDetailBeans();
		if (Password instanceof String) {
			userBean.fillFromConfig(Password);
		} else {
			userBean.fillData(Password);
		}
		LFSUtilsAndroid.enterText(getNFKloginpagepasswordtxt(), userBean.getPassword());
	} catch (Exception e) {
		e.printStackTrace();
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
	}
}
}

