package com.NFK.version1.iOS.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.support.LFSUtilsAndroid;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	SignupPageIOS signup = new SignupPageIOS();

	@FindBy(locator = "NFKios.loginPage.emailAdress.tBox")
	private QAFWebElement NFKiosLoginpageEmailadressTbox;
	@FindBy(locator = "NFKios.loginPage.password.tBox")
	private QAFWebElement NFKiosLoginpagePasswordTbox;
	@FindBy(locator = "NFKios.loginPage.enableTouchID.switch")
	private QAFWebElement NFKiosLoginpageEnabletouchidSwitch;
	@FindBy(locator = "NFKios.loginPage.title.lbl")
	private QAFWebElement NFKiosLoginpageTitleLbl;
	@FindBy(locator = "NFKios.loginPage.touchID.img")
	private QAFWebElement NFKiosLoginpageTouchidImg;
	@FindBy(locator = "NFKios.loginPage.forgotpwd.emailfield.txt")
	private QAFWebElement NFKiosLoginpageForgotpwdEmailfieldTxt;
	@FindBy(locator = "NFKios.loginPage.forgotpwd.send.btn")
	private QAFWebElement NFKiosLoginpageForgotpwdSendBtn;
	@FindBy(locator = "NFKios.loginPage.forgotpwd.close.btn")
	private QAFWebElement NFKiosLoginpageForgotpwdCloseBtn;
	@FindBy(locator = "NFKios.loginpage.updatepage.agree.chkbx")
	private List<QAFWebElement> NFKiosLoginpageUpdatepageAgreeChkbx;
	@FindBy(locator = "NFKios.loginPage.meterskip.btn")
	private QAFWebElement NFKiosLoginpageMeterskipBtn;
	@FindBy(locator = "NFKios.loginPage.cancelErrorMsg.img")
	private QAFWebElement NFKiosLoginPageCancelErrorMsgImg;
	@FindBy(locator = "NFKios.loginPage.forgotPassword.NFKLogo.img")
	private QAFWebElement NFKiosLoginPageForgotPasswordNFKLogoImg;
	@FindBy(locator = "NFKios.loginPage.meter.verioflex.img")
	private QAFWebElement NFKiosLoginPageMeterVerioflexImg;
	@FindBy(locator = "NFKios.loginPage.meter.veriosync.img")
	private QAFWebElement NFKiosLoginPageMeterVeriosyncImg;
	@FindBy(locator = "NFKios.loginPage.meter.continue.btn")
	private QAFWebElement NFKiosLoginPageMeterContinueBtn;
	@FindBy(locator = "NFKios.loginPage.password.lbl")
	private QAFWebElement NFKiosloginPagepasswordlbl;
	@FindBy(locator = "NFKios.loginpage.back.btn")
	private QAFWebElement NFKiosloginpagebackbtn;
	@FindBy(locator = "NFKios.loginPage.forgotpassword.link")
	private QAFWebElement NFKiosLoginPageForgotpasswordLink;
	@FindBy(locator = "NFKios.loginPage.signup.adult.link")
	private QAFWebElement NFKiosLoginPageSignupAdultLink;
	@FindBy(locator = "NFKios.loginPage.signup.dependent.link")
	private QAFWebElement NFKiosLoginPageSignupDependentLink;
	@FindBy(locator = "NFKios.dependent.createguardian.cancelBtn")
	private QAFWebElement NFKiosDependentCreateguardianCancelBtn;
	@FindBy(locator = "NFKios.dependent.createguardian.signupBtn")
	private QAFWebElement NFKiosDependentCreateguardianSignupBtn;

	// gest user
	@FindBy(locator = "NFKios.gestational.title")
	private QAFWebElement NFKiosGestationalTitle;
	@FindBy(locator = "NFKios.gestational.profile.info")
	private QAFWebElement NFKiosGestationalProfileInfo;
	@FindBy(locator = "NFKios.gestational.profile.warning")
	private QAFWebElement NFKiosGestationalProfileWarning;
	@FindBy(locator = "NFKios.gestational.typeOne.radio.btn")
	private QAFWebElement NFKiosGestationalTypeOneRadioBtn;
	@FindBy(locator = "NFKios.gestational.typeTwo.radio.btn")
	private QAFWebElement NFKiosGestationalTypeTwoRadioBtn;
	@FindBy(locator = "NFKios.gestational.cancel.btn")
	private QAFWebElement NFKiosGestationalCancelBtn;
	@FindBy(locator = "NFKios.gestational.fotter.part")
	private QAFWebElement NFKiosGestationalFotterPart;
	@FindBy(locator = "NFKios.gestational.continue.btn")
	private QAFWebElement NFKiosGestationalContinueBtn;
	@FindBy(locator = "NFKios.gestational.ResetPassword.firstName")
	private QAFWebElement NFKiosGestationalResetPasswordFirstName;
	@FindBy(locator = "NFKios.gestational.ResetPassword.lastName")
	private QAFWebElement NFKiosGestationalResetPasswordLastName;
	@FindBy(locator = "NFKios.gestational.ResetPassword.emailAddress")
	private QAFWebElement NFKiosGestationalResetPasswordEmailAddress;
	@FindBy(locator = "NFKios.gestational.ResetPassword.confirmEmailAddress")
	private QAFWebElement NFKiosGestationalResetPasswordConfirmEmailAddress;
	@FindBy(locator = "NFKios.gestational.ResetPassword.password")
	private QAFWebElement NFKiosGestationalResetPasswordPassword;
	@FindBy(locator = "NFKios.gestational.ResetPassword.confirmPassword")
	private QAFWebElement NFKiosGestationalResetPasswordConfirmPassword;
	@FindBy(locator = "NFKios.gestational.ResetPassword.birthDayField")
	private QAFWebElement NFKiosGestationalResetPasswordBirthDayField;
	@FindBy(locator = "NFKios.gestational.ResetPassword.termsAndPrivacyButton")
	private QAFWebElement NFKiosGestationalResetPasswordTermsAndPrivacyButton;
	@FindBy(locator = "NFKios.gestational.ResetPassword.continueButton")
	private QAFWebElement NFKiosGestationalResetPasswordContinueButton;
	@FindBy(locator = "NFKios.gestational.ResetPassword.checkMarkImage")
	private List<QAFWebElement> NFKiosGestationalResetPasswordCheckMarkImage;
	@FindBy(locator = "NFKios.loginpage.Cancelsetup.btn")
	private QAFWebElement NFKiosloginpageCancelsetupbtn;
	@FindBy(locator = "NFKios.loginpage.YesLoginMe.btn")
	private QAFWebElement NFKiosLoginpageYesLoginMebtn;
	@FindBy(locator = "NFKios.loginpage.MyOwnData.btn")
	private QAFWebElement NFKiosLoginpageMyOwnDatabtn;
	@FindBy(locator = "NFKios.loginpage.hcpFirstName.text")
	private QAFWebElement NFKiosLoginpageHcpFirstNameText;
	@FindBy(locator = "NFKios.loginpage.hcpLastName.text")
	private QAFWebElement NFKiosLoginpageHcpLastNameText;
	@FindBy(locator = "NFKios.loginpage.hcpDOB.text")
	private QAFWebElement NFKiosLoginpageHcpDOBText;
	@FindBy(locator = "NFKios.loginpage.hcpEmail.text")
	private QAFWebElement NFKiosLoginpageHcpEmailText;
	@FindBy(locator = "NFKios.loginpage.hcpConfirmEmail.text")
	private QAFWebElement NFKiosLoginpageHcpConfirmEmailText;
	@FindBy(locator = "NFKios.loginpage.hcpPassword.text")
	private QAFWebElement NFKiosLoginpageHcpPasswordText;
	@FindBy(locator = "NFKios.loginpage.hcpConfirmPassword.text")
	private QAFWebElement NFKiosLoginpageHcpConfirmPasswordText;
	@FindBy(locator = "NFKios.loginpage.hcpCheckBox.text")
	private QAFWebElement NFKiosLoginpageHcpCheckBoxText;
	@FindBy(locator = "NFKios.loginpage.hcpContinue.btn")
	private QAFWebElement NFKiosLoginpageHcpContinueBtn;
	@FindBy(locator = "NFKios.loginpage.hcpDOBOk.popup")
	private QAFWebElement NFKiosLoginpageHcpDOBOkPopup;    
	@FindBy(locator = "NFKios.loginpage.onetouch.logo")
	private QAFWebElement NFKiosLoginpageOnetouchLogo; 
@FindBy(locator = "NFKios.loginpage.dependentLogin.btn")
	private QAFWebElement NFKiosLoginpageDependentLoginBtn;
	@FindBy(locator = "NFKios.dependent.loginErrorMessage.txt")
	private QAFWebElement NFKiosDependentLoginErrorMessageTxt;
	@FindBy(locator = "NFKios.noticepage.PrivacyPolicy.Statictext")
	private QAFWebElement NFKiosnoticepagePleaseReviewandAgreeStatictext;
	@FindBy(locator = "NFKios.noticepage.PrivacyPolicy.Statictext")
	private QAFWebElement NFKiosnoticepagePrivacyPolicyStatictext;
	@FindBy(locator = "NFKios.noticepage.TermsofUse.Statictext")
	private QAFWebElement NFKiosnoticepageTermsofUseStatictext;
	@FindBy(locator = "NFKios.noticepage.ConsenttoProcess.Statictext")
	private QAFWebElement NFKiosnoticepageConsenttoProcessStatictext;
	@FindBy(locator = "NFKios.noticepage.checkbox")
	private QAFWebElement NFKiosnoticepagecheckbox;
	@FindBy(locator = "NFKios.noticepage.continue.btn")
	private QAFWebElement NFKiosnoticepagecontinuebtn;
	@FindBy(locator = "NFKios.noticepage.title")
	private QAFWebElement NFKiosnoticepagetitle;
	@FindBy(locator = "NFKios.signupPage.Safetydone.Welcome.Title")
	private QAFWebElement NFKiossignupPageSafetydoneWelcomeTitle;
	@FindBy(locator = "NFKios.dependent.intendedUse.txt")
	private QAFWebElement NFKiosDependentIntendedUseTxt;
	@FindBy(locator = "NFKios.loginpage.NoticeOk.popup")
	private QAFWebElement NFKiosloginpageNoticeOkpopup;
	@FindBy(locator = "NFKios.loginpage.important.popup")
	private QAFWebElement NFKiosloginpageimportantpopup;
	@FindBy(locator = "NFKios.loginpage.loginBtn.error.title")
	private QAFWebElement NFKiosLoginpageLoginBtnErrorTitle;
	@FindBy(locator = "NFKios.loginpage.loginBtn.error.textMsg")
	private QAFWebElement NFKiosLoginpageLoginBtnErrorTextMsg;
	@FindBy(locator = "NFKios.loginpage.loginBtn.error.ok.btn")
	private QAFWebElement NFKiosLoginpageLoginBtnErrorOkBtn;

	public static String email = "testt" + RandomStringUtils.randomAlphabetic(5) + "@mailinator.com";
	
	public QAFWebElement getNFKiossignupPageSafetydoneWelcomeTitle() {
			return NFKiossignupPageSafetydoneWelcomeTitle;
	}

	public QAFWebElement getNFKiosnoticepagetitle() {
		return NFKiosnoticepagetitle;
	}
	
	public QAFWebElement getNFKiosnoticepagePleaseReviewandAgreeStatictext() {
			return NFKiosnoticepagePleaseReviewandAgreeStatictext;
	}
	
	public QAFWebElement getNFKiosnoticepagePrivacyPolicyStatictext() {
			return NFKiosnoticepagePrivacyPolicyStatictext;
	}
	
	public QAFWebElement getNFKiosnoticepageTermsofUseStatictext() {
			return NFKiosnoticepageTermsofUseStatictext;
	}
	
	public QAFWebElement getNFKiosnoticepageConsenttoProcessStatictext() {
			return NFKiosnoticepageConsenttoProcessStatictext;
	}
	
	
	public QAFWebElement getNFKiosnoticepagecheckbox() {
			return NFKiosnoticepagecheckbox;
	}
	
	public QAFWebElement getNFKiosnoticepagecontinuebtn() {
			return NFKiosnoticepagecontinuebtn;
	}	
	public QAFWebElement getNFKiosLoginpageOnetouchLogo() {
		return NFKiosLoginpageOnetouchLogo;
	}
	public QAFWebElement getNFKiosLoginpageHcpFirstNameText() {
		return NFKiosLoginpageHcpFirstNameText;
	}
	public QAFWebElement getNFKiosLoginpageHcpLastNameText() {
		return NFKiosLoginpageHcpLastNameText;
	}
	public QAFWebElement getNFKiosLoginpageHcpEmailText() {
		return NFKiosLoginpageHcpEmailText;
	}
	public QAFWebElement getNFKiosLoginpageHcpConfirmEmailText() {
		return NFKiosLoginpageHcpConfirmEmailText;
	}
	public QAFWebElement getNFKiosLoginpageHcpPasswordText() {
		return NFKiosLoginpageHcpPasswordText;
	}
	public QAFWebElement getNFKiosLoginpageHcpConfirmPasswordText() {
		return NFKiosLoginpageHcpConfirmPasswordText;
	}
	public QAFWebElement getNFKiosLoginpageHcpDOBText() {
		return NFKiosLoginpageHcpDOBText;
	}
	public QAFWebElement getNFKiosLoginpageHcpCheckBoxText() {
		return NFKiosLoginpageHcpCheckBoxText;
	}
	public QAFWebElement getNFKiosLoginpageHcpContinueBtn() {
		return NFKiosLoginpageHcpContinueBtn;
	}
	public QAFWebElement getNFKiosLoginpageHcpDOBOkPopup() {
		return NFKiosLoginpageHcpDOBOkPopup;
	}
	
	

	public List<QAFWebElement> getNFKiosGestationalResetPasswordCheckMarkImage() {
		return NFKiosGestationalResetPasswordCheckMarkImage;
	}
	public QAFWebElement getNFKiosLoginpageMyOwnDatabtn() {
		return NFKiosLoginpageMyOwnDatabtn;
	}

	public QAFWebElement getNFKiosLoginpageYesLoginMebtn() {
		return NFKiosLoginpageYesLoginMebtn;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordContinueButton() {
		return NFKiosGestationalResetPasswordContinueButton;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordTermsAndPrivacyButton() {
		return NFKiosGestationalResetPasswordTermsAndPrivacyButton;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordBirthDayField() {
		return NFKiosGestationalResetPasswordBirthDayField;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordConfirmPassword() {
		return NFKiosGestationalResetPasswordConfirmPassword;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordPassword() {
		return NFKiosGestationalResetPasswordPassword;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordConfirmEmailAddress() {
		return NFKiosGestationalResetPasswordConfirmEmailAddress;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordEmailAddress() {
		return NFKiosGestationalResetPasswordEmailAddress;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordLastName() {
		return NFKiosGestationalResetPasswordLastName;
	}

	public QAFWebElement getNFKiosGestationalResetPasswordFirstName() {
		return NFKiosGestationalResetPasswordFirstName;
	}

	public QAFWebElement getNFKiosGestationalContinueBtn() {
		return NFKiosGestationalContinueBtn;
	}

	public QAFWebElement getNFKiosGestationalTitle() {
		return NFKiosGestationalTitle;
	}

	public QAFWebElement getNFKiosGestationalCancelBtn() {
		return NFKiosGestationalCancelBtn;
	}

	public QAFWebElement getNFKiosGestationalProfileInfo() {
		return NFKiosGestationalProfileInfo;
	}

	public QAFWebElement getNFKiosGestationalProfileWarning() {
		return NFKiosGestationalProfileWarning;
	}

	public QAFWebElement getNFKiosGestationalTypeOneRadioBtn() {
		return NFKiosGestationalTypeOneRadioBtn;
	}

	public QAFWebElement getNFKiosGestationalTypeTwoRadioBtn() {
		return NFKiosGestationalTypeTwoRadioBtn;
	}

	public QAFWebElement getNFKiosGestationalFotterPart() {
		return NFKiosGestationalFotterPart;
	}

	public QAFWebElement getNFKiosDependentCreateguardianSignupBtn() {
		return NFKiosDependentCreateguardianSignupBtn;
	}

	public QAFWebElement getNFKiosDependentCreateguardianCancelBtn() {
		return NFKiosDependentCreateguardianCancelBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosLoginPageForgotpasswordLink() {
		return NFKiosLoginPageForgotpasswordLink;
	}

	public QAFWebElement getNFKiosLoginPageSignupAdultLink() {
		return NFKiosLoginPageSignupAdultLink;
	}

	public QAFWebElement getNFKiosLoginPageSignupDependentLink() {
		return NFKiosLoginPageSignupDependentLink;
	}

	public QAFWebElement getNFKiosLoginpageMeterskipBtn() {
		return NFKiosLoginpageMeterskipBtn;
	}

	// Manjushri
	public List<QAFWebElement> getNFKiosLoginpageUpdatepageAgreeChkbx() {
		return NFKiosLoginpageUpdatepageAgreeChkbx;
	}

	public QAFWebElement getNFKiosLoginpageEmailadressTbox() {
		return NFKiosLoginpageEmailadressTbox;
	}

	public QAFWebElement getNFKiosLoginpagePasswordTbox() {
		return NFKiosLoginpagePasswordTbox;
	}

	public QAFWebElement getNFKiosLoginpagePasswordlbl() {
		return NFKiosloginPagepasswordlbl;
	}

	public QAFWebElement getNFKiosLoginpageBackBtn() {
		return NFKiosloginpagebackbtn;
	}

	public QAFWebElement getNFKiosLoginpageEnabletouchidSwitch() {
		return NFKiosLoginpageEnabletouchidSwitch;
	}

	public QAFWebElement getNFKiosLoginpageTitleLbl() {
		return NFKiosLoginpageTitleLbl;
	}

	public QAFWebElement getNFKiosLoginpageTouchidImg() {
		return NFKiosLoginpageTouchidImg;
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdEmailfieldTxt() {
		return NFKiosLoginpageForgotpwdEmailfieldTxt;
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdSendBtn() {
		return NFKiosLoginpageForgotpwdSendBtn;
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdCloseBtn() {
		return NFKiosLoginpageForgotpwdCloseBtn;
	}

	public QAFWebElement getNFKiosLoginpageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl", text);
	}

	public QAFWebElement getNFKiosLoginpageKeepmeloginSwitch() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.keepMeLogin.switch",
				LFSUtilsIOS.getPropString("common.logintype.persistent"));
	}

	public QAFWebElement getNFKiosLoginpageLoginBtn() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("login.action.login"));
	}

	public QAFWebElement getNFKiosLoginpageForgotpasswordLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("login.action.forgotPassword").substring(0, 8));
	}

	public QAFWebElement getNFKiosLoginpageSignupLnk() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("createaccount.action.signup"));
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdResetmsgLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("auth.forgotInfo.enterYourEmailLabel"));
	}

	public QAFWebElement getNFKLoginpageUpdatepageContinueBtn() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("alerts.meterTargetRangeDifferenceConfirmation.continue"));
	}

	public QAFWebElement getNFKLoginpageUpdatepageUpdateNoticeLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.updateNotice.lbl",
				LFSUtilsIOS.getPropString("updateNotice.title"));
	}

	public QAFWebElement getNFKiosLoginpageEnabletouchidLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("common.logintype.fingerprint"));
	}

	public QAFWebElement getNFKiosLoginPageCancelErrorMsgImg() {
		return NFKiosLoginPageCancelErrorMsgImg;
	}

	public QAFWebElement getNFKiosLoginPageForgotPasswordNFKLogoImg() {
		return NFKiosLoginPageForgotPasswordNFKLogoImg;
	}

	public QAFWebElement getNFKiosLoginPageMeterVerioflexImg() {
		return NFKiosLoginPageMeterVerioflexImg;
	}

	public QAFWebElement getNFKiosLoginPageMeterVeriosyncImg() {
		return NFKiosLoginPageMeterVeriosyncImg;
	}

	public QAFWebElement getNFKiosLoginPageMeterContinueBtn() {
		return NFKiosLoginPageMeterContinueBtn;
	}

	public QAFWebElement getNFKiosloginpageCancelsetupbtn() {
		return NFKiosloginpageCancelsetupbtn;
	}
	public QAFWebElement getNFKiosLoginpageDependentLoginBtn() {
		return NFKiosLoginpageDependentLoginBtn;
	}
public QAFWebElement getNFKiosDependentLoginErrorMessageTxt() {
		return NFKiosDependentLoginErrorMessageTxt;
	}
	public QAFWebElement getNFKiosDependentIntendedUseTxt() {
		return NFKiosDependentIntendedUseTxt;
	}
	
	public QAFWebElement getNFKiosNFKiosloginpageNoticeOkpopup() {
		return NFKiosloginpageNoticeOkpopup;
	}
	
	public QAFWebElement getNFKiosloginpageimportantpopup() {
		return NFKiosloginpageimportantpopup;
	}
	
	public QAFWebElement getNFKiosLoginpageLoginBtnErrorTitle() {
		return NFKiosLoginpageLoginBtnErrorTitle;
	}

	public QAFWebElement getNFKiosLoginpageLoginBtnErrorTextMsg() {
		return NFKiosLoginpageLoginBtnErrorTextMsg;
	}

	public QAFWebElement getNFKiosLoginpageLoginBtnErrorOkBtn() {
		return NFKiosLoginpageLoginBtnErrorOkBtn;
	}
	// To verify login page element
	// milan
	public void verifyLoginPage() {
		getNFKiosLoginpageEmailadressTbox().verifyPresent("Username text field is present");
		getNFKiosLoginpagePasswordTbox().verifyPresent("password text field is present");
		getNFKiosLoginpageLoginBtn().verifyPresent("Login button is present");
		Reporter.logWithScreenShot("User is on Log-in Screen", MessageTypes.Pass);
	}

	public void redirectToDecisionScreenFromloginScreen() {
		getNFKiosLoginpageBackBtn().click();
	}

	public void fillLoginDetail(String userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {
			userBean.fillFromConfig(userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (getNFKiosLoginpageEmailadressTbox().getAttribute("name").equals("LoginViewController.emailLabel")) {
			Reporter.log("Username is already filled", MessageTypes.Pass);
		} else {
			LFSUtilsIOS.enterText(getNFKiosLoginpageEmailadressTbox(), userBean.getUsername());
		}
		LFSUtilsIOS.enterText(getNFKiosLoginpagePasswordTbox(), userBean.getPassword());
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
	}

//	/ Method to click on sign up button when enabled
	public void clickOnLogin_Btn() {
		SignupPageIOS sign = new SignupPageIOS();
		try {
			getNFKiosLoginpageLoginBtn().getAttribute("enabled");
			if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				getNFKiosLoginpageLoginBtn().click();
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("The Login button not enabled", MessageTypes.Pass);
		}
	}
			
	public void clickOnImportanPopup() {
					LFSUtilsIOS.click(getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")));
					
	}
	public void UpdateNoticeCheckbox() {
					LFSUtilsIOS.waitExplicit(signup.getNFKiosSignuppageUpdateNoticeCheckbox(), 2000); 
					LFSUtilsIOS.click(signup.getNFKiosSignuppageUpdateNoticeCheckbox());
					LFSUtilsIOS.click(signup.getNFKiosSignuppageStaticlabel("Continue"));
	}

	// Method to click forgot password btn
	public void clickOnforgotpass() {
		getNFKiosLoginPageForgotpasswordLink().waitForPresent();
		getNFKiosLoginPageForgotpasswordLink().click();
		Reporter.logWithScreenShot("User has clicked on Forgot Password Link", MessageTypes.Pass);
	}

	// Method to verify forgot password page
	// milan
	public void verifyForgotpwdPage() {
		getNFKiosLoginpageForgotpwdEmailfieldTxt().assertPresent("Email field");
		getNFKiosLoginpageForgotpwdSendBtn().assertPresent("Send button");
		getNFKiosLoginpageForgotpwdResetmsgLbl().assertPresent("Reset message");
		getNFKiosLoginpageForgotpwdCloseBtn().assertPresent("Close button");
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User has verified the Forgot password screen", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdCloseBtn());
		LFSUtilsIOS.waitforLoad();

	}

	// Method to verify email field is non editable once user login in to
	// application
	public void verifyDisableEmailField() {
		getNFKiosLoginpageEmailadressTbox().waitForPresent();
		getNFKiosLoginpageEmailadressTbox().verifyDisabled("Email field after login once");
	}

	// Method to verify keep me login switch disable
	public void verifyKeepMeLoginSwtchDisable() {
		getNFKiosLoginpageKeepmeloginSwitch().waitForPresent();

		WebDriverTestCase.verifyTrue(getNFKiosLoginpageKeepmeloginSwitch().getAttribute("value").contains("0"),
				"Keep me login btn is on", "Keep me login btn is off");
	}

	// method to click on login button only
	public void clickOnLoginBtnOnly() {
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKiosLoginpageLoginBtn().click();
	}

	// Method to select update notice page check box and contineu
	public void selectUpdateNotice() {try {
			SignupPageIOS signup = new SignupPageIOS();
			signup.getNFKiosSignuppageSingupOkBtn().waitForPresent();
			signup.getNFKiosSignuppageSingupOkBtn().click();
			getNFKLoginpageUpdatepageUpdateNoticeLbl().waitForPresent(5000);
			for (int i = 0; i < getNFKiosLoginpageUpdatepageAgreeChkbx().size(); i++) {
				if (getNFKiosLoginpageUpdatepageAgreeChkbx().get(i).isPresent()) {
					getNFKiosLoginpageUpdatepageAgreeChkbx().get(i).click();
					getNFKLoginpageUpdatepageContinueBtn().click();
					break;
				}
			}

		} catch (Exception e) {
		}
	}	
	

	public void getOS_Version() {

		Map<String, Object> params = new HashMap<>();
		params.put("property", "osVersion");
		String osVersion = (String) driver.executeScript("mobile:device:info", params);
		Reporter.log(osVersion);
		ConfigurationManager.getBundle().setProperty("Os.Version", osVersion);

	}

	public void clickLoginButtonToVerifyDelete() {
		LFSUtilsIOS.click(getNFKiosLoginpageLoginBtn());

	}

	public void clickOnLoginNotAgreedTerms() {
		getNFKiosLoginpageLoginBtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosLoginpageLoginBtn());
		LFSUtilsIOS.waitforLoad();
		try {
			SignupPageIOS signup = new SignupPageIOS();
			signup.getNFKiosSignuppageSingupOkBtn().waitForPresent();
			LFSUtilsIOS.click(signup.getNFKiosSignuppageSingupOkBtn());
			getNFKLoginpageUpdatepageUpdateNoticeLbl().waitForPresent(5000);

		} catch (Exception e) {
		}

	}

	public void sendDetailsForForgotPasswordLink(String email) {
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys(email);
		getNFKiosLoginpageForgotpwdSendBtn().verifyPresent("Send button");
		LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());
		if (getNFKiosLoginpageForgotpwdSendBtn().isPresent())
			LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());

	}

	public void doDependentLogin(Object userdata) {
		UserDetailBeans userbean = new UserDetailBeans();
		if (userdata instanceof String) {
			userbean.fillFromConfig((String) userdata);
		} else {
			userbean.fillData(userdata);
		}
		LFSUtilsIOS.click(getNFKiosLoginpageEmailadressTbox());
		getNFKiosLoginpageEmailadressTbox().sendKeys(userbean.getDependentemail());
		LFSUtilsIOS.click(getNFKiosLoginpagePasswordTbox());
		getNFKiosLoginpagePasswordTbox().sendKeys(userbean.getDependentpassword());
		Reporter.logWithScreenShot("User has entered the Login dependent details", MessageTypes.Pass);
	}

	public void verifyLoginDependentscreen() {
		LFSUtilsIOS.waitforLoad();
		getNFKiosLoginpageEmailadressTbox().assertPresent("Email field");
		getNFKiosLoginpagePasswordTbox().assertPresent("Password field");
		getNFKiosLoginPageForgotpasswordLink().assertPresent("Forgot password link");
		getNFKiosLoginPageSignupAdultLink().assertPresent("Signup Adult link");
		getNFKiosLoginPageSignupDependentLink().assertPresent("Signup dependent link");
		Reporter.logWithScreenShot("User has verified the Login page", MessageTypes.Pass);

	}

	public void handleErrorPopup() {
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("alerts.error.title")).isPresent()) {
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("alerts.error.title"))
					.assertPresent("Error pop-up title");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
					.assertPresent("Text of Error pop-up");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			Reporter.logWithScreenShot("Error Pop-up displayed", MessageTypes.Pass);
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		} else {
			Reporter.logWithScreenShot("Incorrect Error Pop-up is displayed", MessageTypes.Fail);
		}

	}

	public void doLogin1() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		if (getNFKiosLoginpageEmailadressTbox().getAttribute("name").equals("LoginViewController.emailLabel")) {
			Reporter.log("The username is already filled", MessageTypes.Pass);
		} else {
			LFSUtilsIOS.enterText(getNFKiosLoginpageEmailadressTbox(), email);
		}
		LFSUtilsIOS.enterText(getNFKiosLoginpagePasswordTbox(), password);
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
	}

	public void verifyCreateGuardianAccountPopup() {
		if (getNFKiosDependentCreateguardianCancelBtn().isPresent()
				&& getNFKiosDependentCreateguardianSignupBtn().isPresent()) {
			Reporter.logWithScreenShot("Create Guardian Account popup Available", MessageTypes.Pass);
		}
	}

	public void ClickonCancelButton() {
		getNFKiosDependentCreateguardianCancelBtn().isPresent();
		LFSUtilsIOS.click(getNFKiosDependentCreateguardianCancelBtn());
	}

	public void ClickonSignup() {
		getNFKiosDependentCreateguardianSignupBtn().isPresent();
		LFSUtilsIOS.click(getNFKiosDependentCreateguardianSignupBtn());
	}

	public void clickOnLogin_BtnforMinor() {
		try {
			getNFKiosLoginpageLoginBtn().getAttribute("enabled");
			if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				getNFKiosLoginpageLoginBtn().click();
			}
			Reporter.logWithScreenShot("The user clicked on Login button", MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			Reporter.logWithScreenShot("The Login button not enabled", MessageTypes.Pass);
		}
	}

	public void validatesInvalidEmailForgotPass() {
		String email = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());
		getNFKiosLoginpageForgotpwdSendBtn().verifyDisabled("Send button is disable for blank email field");
		LFSUtilsIOS.enterText(getNFKiosLoginpageForgotpwdEmailfieldTxt(), "Test123");
		LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Email Error Msg Displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Invalid Email Error Msg Not Displayed", MessageTypes.Fail);
		}

		LFSUtilsIOS.enterText(getNFKiosLoginpageForgotpwdEmailfieldTxt(), email);
		LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.confirmation.checkYourEmail"))
				.assertPresent("Text of Email send");
		LFSUtilsIOS.click(signupPageIOS.getNFKiosSignuppageSingupOkBtn());

	}

	public void ClickBackandMydepedentData() {
		SignupPageIOS signuppage = new SignupPageIOS();
		LFSUtilsIOS.click(getNFKiosLoginpageBackBtn());
		LFSUtilsIOS.click(signuppage.getNFKiosDecisionPageLoginDependentBtn());
	}

	public void LoginIncorrectPassword() {
		getNFKiosLoginpageEmailadressTbox().clear();
		getNFKiosLoginpageEmailadressTbox().sendKeys("testaccvm@mailinator.com");
		getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpageLoginBtn().verifyDisabled("Login Button  after blank  password");
		getNFKiosLoginpagePasswordTbox().sendKeys("1111aaaa");
		getNFKiosLoginpageLoginBtn().click();
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
				.verifyVisible("Invalid Credential Popup is displayed")) {
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is a registered user", MessageTypes.Fail);
	}

	public void verifyGestationalScreen() {
		getNFKiosGestationalTitle().assertPresent("Title of Gestational");
		getNFKiosGestationalProfileInfo().assertPresent("Profile information");
		getNFKiosGestationalProfileWarning().assertPresent("Profile warning");
		getNFKiosGestationalTypeOneRadioBtn().assertPresent("Type 1 radio button");
		getNFKiosGestationalTypeTwoRadioBtn().assertPresent("Tyep 2 Radio button");
		if (!getNFKiosGestationalContinueBtn().isEnabled())
			Reporter.log("Continue button is disabled", MessageTypes.Pass);
		else
			Reporter.log("Continue button is Enabled", MessageTypes.Fail);
		getNFKiosGestationalCancelBtn().isPresent();
		getNFKiosGestationalFotterPart().isPresent();
	}

	public void clickCancelNavLogin() {
		getNFKiosGestationalCancelBtn().isPresent();
		getNFKiosGestationalCancelBtn().click();
		Reporter.logWithScreenShot("User has clicked on Cancel button", MessageTypes.Pass);
	}

	public void VerifyResetPwd() {
		getNFKiosGestationalResetPasswordFirstName().verifyPresent("First Name is present");
		getNFKiosGestationalResetPasswordLastName().verifyPresent("Last Name is present");
		getNFKiosGestationalResetPasswordEmailAddress().verifyPresent("Email Address is present");
		getNFKiosGestationalResetPasswordConfirmEmailAddress().verifyPresent("Confirm Email Address is present");
		getNFKiosGestationalResetPasswordPassword().verifyPresent("Password is present");
		getNFKiosGestationalResetPasswordConfirmPassword().verifyPresent("Confirm Password is present");
		getNFKiosGestationalResetPasswordBirthDayField().verifyPresent("Birth day field is present");
		getNFKiosGestationalResetPasswordTermsAndPrivacyButton().verifyPresent("Term and Privacy Button is present");

		for (int i = 0; i < 4; i++) {
			getNFKiosGestationalResetPasswordCheckMarkImage().get(i).isPresent();
		}
		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosGestationalResetPasswordPassword().sendKeys("test1234");
		getNFKiosGestationalResetPasswordConfirmPassword().sendKeys("test1234");
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosGestationalResetPasswordTermsAndPrivacyButton().click();
		getNFKiosGestationalResetPasswordContinueButton().verifyPresent("Continue button is present");
	}

	public void editResetPwdscreen() {
		AccountPageIOS accountPage = new AccountPageIOS();
		String email = "mailinator.com";
		LFSUtilsIOS.swipeWithScreenPercent(50, 40, 50, 70, 1);
		getNFKiosGestationalResetPasswordFirstName().sendKeys("John");
		getNFKiosGestationalResetPasswordLastName().sendKeys("Smith");
		getNFKiosGestationalResetPasswordEmailAddress().sendKeys("testpatemail@testmail.com");
		getNFKiosGestationalResetPasswordConfirmEmailAddress().sendKeys("testpatemail@testmail.com");

	}

	public void resetpassdob() {
		getNFKiosGestationalResetPasswordBirthDayField().click();
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("worngbirthdate.title"))
				.verifyVisible("Wrong birth date? is present")) {
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			Reporter.logWithScreenShot("wrong birth date is visible ", MessageTypes.Pass);
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		} else {
			Reporter.logWithScreenShot("wrong birth date is Not visible ", MessageTypes.Fail);
		}
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("resetpassword.title"))
				.verifyVisible("Reset Password Screen is visible")) {
			Reporter.logWithScreenShot("Reset password  is visible ", MessageTypes.Pass);
		}
	}

	// Roshani
	public void cancelsetup() {
		try {
			getNFKiosloginpageCancelsetupbtn().isPresent();

			getNFKiosloginpageCancelsetupbtn().click();

			Reporter.logWithScreenShot("Cancel setup btn clicked sucessfully ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on cancel setup btn", MessageTypes.Fail);
		}
	}

	public void clickOnLogin_Btn_Verify_bluetooth_popup() {
		SignupPageIOS sign = new SignupPageIOS();
		try {
			getNFKiosLoginpageLoginBtn().getAttribute("enabled");
			if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				getNFKiosLoginpageLoginBtn().click();
			}
			Reporter.logWithScreenShot("The user clicked on Login button", MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			Reporter.logWithScreenShot("The Login button not enabled", MessageTypes.Pass);
		}
		sign.Verifybluethoothpopup("first");
		sign.getNFKiosSignuppageUpdateNoticeCheckbox().click();
		sign.getNFKiosSignuppageStaticlabel("Continue").click();
	}
//	 Auther-Pradnya
	// Description-Method to redirect login page
	public void userRedirectedLoginpage() {
		if (getNFKiosLoginpageYesLoginMebtn().isPresent()) {
			LFSUtilsIOS.click(getNFKiosLoginpageYesLoginMebtn());
		}
		LFSUtilsIOS.click(getNFKiosLoginpageMyOwnDatabtn());
	}

	public void userEnterdetail(String details) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (details instanceof String) {
			userBean.fillFromConfig(details);
		} else {
			userBean.fillData(details);
		}
		LFSUtilsIOS.enterText(getNFKiosLoginpageEmailadressTbox(), userBean.getExpiredusername());
		LFSUtilsIOS.enterText(getNFKiosLoginpagePasswordTbox(), userBean.getPassword());
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);

	}
	public void userEntersLogindetails(String details) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (details instanceof String) {
			userBean.fillFromConfig(details);
		} else {
			userBean.fillData(details);
		}
		LFSUtilsIOS.click(getNFKiosLoginpageEmailadressTbox());
		LFSUtilsIOS.enterText(getNFKiosLoginpageEmailadressTbox(), userBean.getHemailID());
		LFSUtilsIOS.enterText(getNFKiosLoginpagePasswordTbox(), userBean.getHpassword());
		
	}
	 public void userClicksLoginButton() {
		 getNFKiosLoginpageLoginBtn().waitForEnabled();
  	   if (getNFKiosLoginpageLoginBtn().isEnabled()) {
  		 LFSUtilsIOS.click(getNFKiosLoginpageLoginBtn());
			Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				}
  	   
     }
	 public void userVerifyResetPassword() {
			
			getNFKiosLoginpageHcpEmailText().verifyPresent("Email address");
			getNFKiosLoginpageHcpConfirmEmailText().verifyPresent("Enfirm Email");
			getNFKiosLoginpageHcpDOBText().verifyPresent("Date of birth");
			getNFKiosLoginpageHcpFirstNameText().verifyPresent("Firstname");
			getNFKiosLoginpageHcpLastNameText().verifyPresent("Last name");
			getNFKiosLoginpageHcpConfirmPasswordText().verifyPresent("Confirm Password");
			getNFKiosLoginpageHcpCheckBoxText().verifyPresent("check box");
			getNFKiosLoginpageHcpContinueBtn().verifyPresent("Continue button");
			Reporter.logWithScreenShot("User sucessfully verify reset password screen", MessageTypes.Pass);
	 }

public void userEntersDetailsOnResetPasswordScreen(String details) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (details instanceof String) {
			userBean.fillFromConfig(details);
		} else {
			userBean.fillData(details);

		}

		LFSUtilsIOS.clearText(getNFKiosLoginpageHcpFirstNameText());
		LFSUtilsIOS.enterText(getNFKiosLoginpageHcpFirstNameText(), userBean.getHcpfirstname());

		LFSUtilsIOS.clearText(getNFKiosLoginpageHcpLastNameText());
		LFSUtilsIOS.enterText(getNFKiosLoginpageHcpLastNameText(), userBean.getHcplastname());
		LFSUtilsIOS.clearText(getNFKiosLoginpageHcpEmailText());
		LFSUtilsIOS.enterText(getNFKiosLoginpageHcpEmailText(), userBean.gethcpemailID());
		LFSUtilsIOS.clearText(getNFKiosLoginpageHcpConfirmEmailText());
		LFSUtilsIOS.enterText(getNFKiosLoginpageHcpConfirmEmailText(), userBean.gethcpemailID());
		Reporter.logWithScreenShot("User sucessfully Edit reset password screen", MessageTypes.Pass);
		getNFKiosLoginpageHcpDOBText().click();
		Reporter.logWithScreenShot("User show the pop up msg", MessageTypes.Pass);
		LFSUtilsIOS.click(getNFKiosLoginpageHcpDOBOkPopup());
		LFSUtilsIOS.enterText(getNFKiosLoginpageHcpPasswordText(), userBean.gethcppassword());
		LFSUtilsIOS.enterText(getNFKiosLoginpageHcpConfirmPasswordText(), userBean.gethcppassword());
		LFSUtilsIOS.click(getNFKiosLoginpageHcpCheckBoxText());
		LFSUtilsIOS.click(getNFKiosLoginpageHcpContinueBtn());      
	}

//	 Shubham
//	 Method To Verify Login Tab And Error Message
	public void verifyLoginTabAndErrorMessage() {
		try {
			getNFKiosLoginpageDependentLoginBtn().verifyEnabled();
			LFSUtilsIOS.click(getNFKiosLoginpageDependentLoginBtn());
			getNFKiosDependentLoginErrorMessageTxt().verifyPresent();
			Reporter.logWithScreenShot("The Login button enabled and verify error message", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify error message", MessageTypes.Fail);
		}
	}		

	 public void userVerifyNoticeScreen() {
			getNFKiosLoginpageOnetouchLogo().verifyPresent("Onetouch Logo in bold");
			getNFKiosLoginpageHcpCheckBoxText().verifyPresent("check box");
			getNFKiosLoginpageHcpContinueBtn().verifyPresent("Continue button");
}
	 //AuthorName - Minal 
		//Description - method to click on Login button 
		public void clicksOnLoginAndNavigateToNoticescreen() {

			try {
				getNFKiosLoginpageLoginBtn().getAttribute("enabled");
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				LFSUtilsIOS.click(getNFKiosLoginpageLoginBtn());
				try {
					getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
				} catch (NoSuchElementException e) {
					Reporter.logWithScreenShot("Important popup not displayed", MessageTypes.Pass);
				}
				Reporter.logWithScreenShot("Login button enabled and user clicked on Login button", MessageTypes.Pass);
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("User is not able to click on Login button", MessageTypes.Fail);
			}
		}

		//AuthorName - Minal
		//Description - method to Verify fields on Notice Screen.
		public void verifyNoticeScreen() {
			try {
				getNFKiosnoticepagetitle().verifyPresent();
				getNFKiosnoticepagePleaseReviewandAgreeStatictext().verifyPresent();
				getNFKiosnoticepagePrivacyPolicyStatictext().verifyPresent();
				getNFKiosnoticepageTermsofUseStatictext().verifyPresent();
				getNFKiosnoticepageConsenttoProcessStatictext().verifyPresent();
				getNFKiosnoticepagecheckbox().verifyPresent();
				getNFKiosnoticepagecontinuebtn().verifyDisabled();
				Reporter.logWithScreenShot("User is on Notice Screen", MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Notice Screen not displayed", MessageTypes.Fail);
			}
		}
	    
		//AuthorName - Minal
		//Description - Method to Verify Continue Button Gets Enable on Clicking Read and Agree checkbox
		public void verifyContinueBtngetsEnabled() {
			try {
				LFSUtilsIOS.click(getNFKiosnoticepagecheckbox());
				getNFKiosnoticepagecontinuebtn().waitForEnabled();
				if (getNFKiosnoticepagecontinuebtn().isEnabled()) {
					Reporter.log("The Continue button got enabled ", MessageTypes.Pass);
				}
			} catch (Exception e) {
				Reporter.logWithScreenShot("The Continue button not enabled", MessageTypes.Fail);
			}
		}

	    //AuthorName - Minal 
		//Description - Method to click on Continue button on Notice Screen
		public void clickOnContinueBtn() {
				LFSUtilsIOS.click(getNFKiosnoticepagecontinuebtn());
				Reporter.logWithScreenShot("User clicked on Continue button ", MessageTypes.Pass);
				
		}

		//AuthorName - Minal 
		//Description - Method to Verify user is landed on First page of safety onboarding from Notice screen.
		public void verifySafetyOnBoardingPage() {
			try {
				getNFKiossignupPageSafetydoneWelcomeTitle().verifyPresent();
				Reporter.logWithScreenShot("User is navigated to Welcome screen of the Safety Onboarding",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("User is not navigated to Welcome screen of the Safety Onboarding",
						MessageTypes.Fail);
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
		try {

			if (getNFKiosLoginpageEmailadressTbox().getAttribute("name").equals("LoginViewController.emailLabel")) {
				Reporter.log("Username is already filled", MessageTypes.Pass);
			} else {
				LFSUtilsIOS.enterText(getNFKiosLoginpageEmailadressTbox(), email);
			}
			LFSUtilsIOS.enterText(getNFKiosLoginpagePasswordTbox(), userBean.getpassword());
			Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Failed to Re-Login", MessageTypes.Fail);

		}
	}
	
	/*
	 * Author: Yogesh 
	 * Description: Method to launch chrome browser and reset the passwords
	 */
	public void launchChromeBrowser(String Usertype) throws InterruptedException {
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		UserDetailBeans userBean = new UserDetailBeans();
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp?to="+ email);
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
	 * Description: Method to enter details on send forget password email field and click on send button
	 */
	public void fillSignUpDetails() {
		try {
			SignupPageIOS signupPageIOS = new SignupPageIOS();
			LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());
			getNFKiosLoginpageForgotpwdSendBtn().verifyDisabled("Send button is disable for blank email field");
			LFSUtilsIOS.enterText(getNFKiosLoginpageForgotpwdEmailfieldTxt(), email);
			LFSUtilsIOS.click(getNFKiosLoginpageForgotpwdSendBtn());
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.confirmation.checkYourEmail"))
					.assertPresent("Text of Email send");
			LFSUtilsIOS.click(signupPageIOS.getNFKiosSignuppageSingupOkBtn());
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
		getNFKiosLoginpageLoginBtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
		LFSUtilsIOS.clickIfEnabled(getNFKiosLoginpageLoginBtn());
		try {
			if (getNFKiosloginpageimportantpopup().isDisplayed()) {
				getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			} else if (getNFKiosNFKiosloginpageNoticeOkpopup().isDisplayed()) {
				LFSUtilsIOS.click(getNFKiosNFKiosloginpageNoticeOkpopup());
			}
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Important Popup not displayed", MessageTypes.Pass);
		}
		getNFKiosnoticepagetitle().verifyPresent();
		getNFKiosnoticepagePleaseReviewandAgreeStatictext().verifyPresent();
		getNFKiosnoticepagePrivacyPolicyStatictext().verifyPresent();
		getNFKiosnoticepageTermsofUseStatictext().verifyPresent();
		getNFKiosnoticepageConsenttoProcessStatictext().verifyPresent();
		getNFKiosnoticepagecheckbox().verifyPresent();
		getNFKiosnoticepagecontinuebtn().verifyDisabled();
		Reporter.logWithScreenShot("User verify the notice screen", MessageTypes.Pass);
	}
	
	/*
	 * Author: Yogesh 
	 * Description: Click on the Login Button and Verify the error pop-up for Incorrect username or password
	 */
	public void ClickOnLogin_BtnAndVerifyErrorMessage() {
		getNFKiosLoginpageLoginBtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button got Enabled", MessageTypes.Pass);
		LFSUtilsIOS.clickIfEnabled(getNFKiosLoginpageLoginBtn());
		getNFKiosLoginpageLoginBtnErrorTitle().waitForPresent(2000);
		getNFKiosLoginpageLoginBtnErrorTitle().verifyPresent("Error");
		getNFKiosLoginpageLoginBtnErrorTextMsg().verifyPresent("Username or password is incorrect. Please try again.");
		try {
			if (getNFKiosLoginpageLoginBtnErrorTitle().isDisplayed()) {
				getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			} else if (getNFKiosNFKiosloginpageNoticeOkpopup().isDisplayed()) {
				LFSUtilsIOS.click(getNFKiosLoginpageLoginBtnErrorOkBtn());
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
		getNFKiosLoginpagePasswordTbox().waitForPresent(2000);
		getNFKiosLoginpagePasswordTbox().clear();
		UserDetailBeans userBean = new UserDetailBeans();
		if (Password instanceof String) {
			userBean.fillFromConfig(Password);
		} else {
			userBean.fillData(Password);
		}
		LFSUtilsIOS.enterText(getNFKiosLoginpagePasswordTbox(), userBean.getpassword());
		Reporter.logWithScreenShot("User filled Login details", MessageTypes.Pass);
	}
}