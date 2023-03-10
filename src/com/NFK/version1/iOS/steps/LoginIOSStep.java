package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.DecisionPageIOS;
import com.NFK.version1.iOS.pages.LoginPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class LoginIOSStep {

	LoginPageIOS loginPage = new LoginPageIOS();
	DecisionPageIOS decisionPage = new DecisionPageIOS();
	SignupPageIOS signupPageIOS = new SignupPageIOS();

	@QAFTestStep(description = "user verify login page")
	public void userVerifyLoginPage() {
		loginPage.verifyLoginPage();
	}

	@QAFTestStep(description = "user verifies the Log-in page")
	public void userVerifyLoginScreen() {
		loginPage.verifyLoginPage();
	}

	@QAFTestStep(description = "user enters login details using {0}")
	public void userfillLoginForm(String userDetail) {
		loginPage.fillLoginDetail(userDetail);

	}

	@QAFTestStep(description = "user clicks on login button")
	public void clickOnLoginBtn() {
		loginPage.clickOnLogin_Btn();
//		loginPage.clickOnImportanPopup();
		loginPage.UpdateNoticeCheckbox();
	}

	@QAFTestStep(description = "user enters newly created details to Login")
	public void userRequest() {
		loginPage.doLogin1();
	}

	/*@QAFTestStep(description = "user select authentication type as {0}")
	public void selectAuthanticationTypeIos(String option) {
		loginPage.clickOnAuthenticationType(option);
	}*/

	@QAFTestStep(description = "user click on forgot password link")
	public void clickOnForgotPasswordLnk() {
		loginPage.clickOnforgotpass();
	}

	@QAFTestStep(description = "user verify forgot password page")
	public void verifyForgotpassPage() {
		loginPage.verifyForgotpwdPage();
	}

	/*@QAFTestStep(description = "user validate email with special characters")
	public void verifyEmailCharacters() {
		loginPage.verifyEmailWithSplChars();
	}*/

	/*@QAFTestStep(description = "user verify reset password with registered mail ID")
	public void verifyForgotpassvalidEmail() {
		loginPage.verifyFGPWDValidEmailID();
	}*/

	/*@QAFTestStep(description = "user verify reset password with invalid mail ID")
	public void verifyForgotpassInvalidEmail() {
		loginPage.verifyFGPWDInvalidEmailID();
	}

	@QAFTestStep(description = "user enters login details without password or incorrect password")
	public void loginWithoutPswrd() {
		loginPage.loginWithoutPasswordField();
	}*/

/*	@QAFTestStep(description = "user enters login details with unregistered user")
	public void loginWithUnregisteredUser() {
		loginPage.loginUnregisteredUser();
	}

	@QAFTestStep(description = "user enters login details with invalid username and password")
	public void loginInvalidUser() {
		loginPage.loginWithInvalidUsername();
	}

	@QAFTestStep(description = "user verify email and password field allowed charcter range login page")
	public void allowedCharacterRange() {
		loginPage.verifyLengthLoginFields();
	}

	@QAFTestStep(description = "user enter {0} fingerprint details")
	public void fingerprintEnter(String msg) {
		loginPage.verifyFingerPrint(msg);
	}*/

	@QAFTestStep(description = "user verify email field is non editable login screen")
	public void verifyemilFieldDisable() {
		loginPage.verifyDisableEmailField();
	}

	@QAFTestStep(description = "user verify keep me login switch disable")
	public void verifyKeepMeLoginSwitchDisable() {
		loginPage.verifyKeepMeLoginSwtchDisable();
	}

	@QAFTestStep(description = "user click on login button only")
	public void clicksOnLoginBtnOnlyIos() {
		loginPage.clickOnLoginBtnOnly();
	}

	@QAFTestStep(description = "user select update notice")
	public void selectsUpdateNoticeIos() {
		loginPage.selectUpdateNotice();
	}

	/*@QAFTestStep(description = "user click skip button on select meter screen")
	public void clicskOnSkipSelecctMeterScreenIos() {
		loginPage.clickOnSkipSelectMeterScreen();
	}

	@QAFTestStep(description = "user click skip button on turn on meter screen")
	public void clicskOnSkipTurnOnMeterScreenIos() {
		loginPage.clickOnSkipTurnOnMeterScreen();
	}

	@QAFTestStep(description = "user click skip button on turn on bluetooth screen")
	public void clicskOnSkipTurnOnMeteBluetoothScreenIos() {
		loginPage.clickOnSkipTurnOnBluetoothScreen();
	}

	@QAFTestStep(description = "user click skip button on search meter screen")
	public void clicskOnSkipSearchScreenIos() {
		loginPage.clickOnSkipSearchScreen();
	}

	@QAFTestStep(description = "user click skip button on turn on meter screen VerioSync")
	public void clicskOnSkipTurnOnMeterScreenVerioSyncIos() {
		loginPage.clickOnSkipTurnOnMeterVerioSyncScreen();
	}

	@QAFTestStep(description = "user click skip button on turn on bluetooth screen VerioSync")
	public void clicskOnSkipTurnOnMeteBluetoothScreenVerioSyncIos() {
		loginPage.clickOnSkipTurnOnBluetoothVerioSyncScreen();
	}*/

	/*@QAFTestStep(description = "user verify Touch ID image")
	public void verifyLoginTouchIdOption() {
		loginPage.verifyTouchIdImageOnLogin();
	}

	@QAFTestStep(description = "user verify no Touch Id button login screen")
	public void noTouchIDBtn() {
		loginPage.noTouchIDPresent();
	}
*/
	@QAFTestStep(description = "user clicks on login button to verify account")
	public void clicksLoginToDelete() {
		loginPage.clickLoginButtonToVerifyDelete();
	}

	/*@QAFTestStep(description = "user verifies that account is deleted permanently")
	public void verifyDeletion() {
		loginPage.verifyAccountDeletePermanent();
	}*/

	@QAFTestStep(description = "user enters valid login dependent details using {0}")
	public void userEntersValidLoginDependentDetailsUsing(String userdata) {
		loginPage.doDependentLogin(userdata);
	}

	@QAFTestStep(description = "user handles error pop-up")
	public void userHandlesErrorPopUp() {
		loginPage.clickOnLogin_Btn();
		loginPage.handleErrorPopup();
		decisionPage.redirectToPreviousPage();
	}

	@QAFTestStep(description = "user verifies app should displays Create a Guardian Account pop-up")
	public void userVerifiesguardianAccountPopup() {
		loginPage.verifyCreateGuardianAccountPopup();
	}

	@QAFTestStep(description = "user clicks Cancel button verifies App displays redirected to login page")
	public void userVerifiesLoginPage() {
		loginPage.ClickonCancelButton();
		loginPage.verifyLoginPage();
	}

	@QAFTestStep(description = "user clicks on signup button for guardian account")
	public void userClickonSignupButton() {
		loginPage.ClickonSignup();
	}

	@QAFTestStep(description = "user click on login button")
	public void clickOnLoginBtnforminor() {
		loginPage.clickOnLogin_BtnforMinor();
	}

	@QAFTestStep(description = "user enters invalid details in email-id field")
	public void ValidatesInvalidDetails() {
		loginPage.validatesInvalidEmailForgotPass();
	}

	@QAFTestStep(description = "user click on back button and click on My Dependent data")
	public void ClickBackandMydependentData() {
		loginPage.ClickBackandMydepedentData();
	}

	@QAFTestStep(description = "user enters invalid login details with incorrect password")
	public void LoginIncorrectPassword() {
		loginPage.LoginIncorrectPassword();
	}

	@QAFTestStep(description = "user verifies gestational screen")
	public void userVerifiesGestScreen() {
		loginPage.verifyGestationalScreen();

	}

	@QAFTestStep(description = "user verifies continue button gets enabled when selects diabetes type as {0}")
	public void userSelectDiabtestType(String diabetesType) {
		SignupPageIOS sign = new SignupPageIOS();
		sign.selectDiabetesType(diabetesType);

	}

	@QAFTestStep(description = "user clicks on cancel button and navigates to Notice screen")
	public void userClicksCancelAndNaviLoginScreen() {
		loginPage.clickCancelNavLogin();
	}

	@QAFTestStep(description = "user clicks on login button for gestationaluser")
	public void userClicksOnLoginButtonForGestationaluser() {
		loginPage.clickOnLogin_Btn();
	}

	@QAFTestStep(description = "user verifies reset password screen with prepopulated data")
	public void userVerifiesResetPasswordScreenWithPrepopulatedData() {
		loginPage.VerifyResetPwd();
	}
	@QAFTestStep(description="user able to edit prepopulated data fields")
	public void userAbleToEditPrepopulatedDataFields() {
		loginPage.editResetPwdscreen();
	}
	@QAFTestStep(description="user not update dateofbirth field and redirects to reset password screen")
	public void userNotUpdateDateofBirthFieldandRedirectToResetPassword() {
		loginPage.resetpassdob();
	}
	
	@QAFTestStep(description="user clicks on cancel setup button")
	public void userClicksOnCancelsetupbtn(){
		loginPage.cancelsetup();
	}
	@QAFTestStep(description="user clicks on login button and verify that bluetooth popup displayed")
	public void user_click_login_button_verify_bluetooth_popup() {
		loginPage.clickOnLogin_Btn_Verify_bluetooth_popup();
	}
	@QAFTestStep(description = "user enters login details {0}")
	public void userEntersLogindetails(String details) {
		loginPage.userEntersLogindetails(details);
	}  
	@QAFTestStep(description = "user clicks login button")
	public void userClicksLoginButton() {
		loginPage.userClicksLoginButton();
	} 
	@QAFTestStep(description = "user verifies reset password screen")
	public void userVerifyResetPassword() {
		loginPage.userVerifyResetPassword();
	}
	@QAFTestStep(description = "user enters details on reset password screen using {0}")
	public void userEntersDetailsOnResetPasswordScreen(String details) {
		loginPage.userEntersDetailsOnResetPasswordScreen(details);
	} 
	@QAFTestStep(description = "user minimize the app and open setting")
	public void minimizeAppAndOpenSetting() {
			LFSUtilsIOS.appBackground();
			signupPageIOS.navigateToSettingSceenFromTrustScreen();

		}
	@QAFTestStep(description = "user verifies notice screen")
	public void userVerifyNoticeScreen() {
		loginPage.userVerifyNoticeScreen();
	}
		
	@QAFTestStep(description = "user enter required details and click on send button")
	public void userEnterRequiredDetailsAndClickOnSendButton() {
		loginPage.fillSignUpDetails();
	}

	@QAFTestStep(description="user enter email and password {0} on login page")
	public void enterEmailForForgotPass(String Password) {
		loginPage.enterEmailandPassword(Password);
	}
	
	@QAFTestStep(description="user click on login button and verify notice screen")
	public void clickOnLogin_Btn_VerifyNoticeScreen() {
		loginPage.ClickOnLogin_BtnAndVerifyNotice();
	}
	
	@QAFTestStep(description = "user launches the Chrome browser and {0} reset password")
	public void userLunahcTheWebBrowser(String Usertype) throws InterruptedException {
		loginPage.launchChromeBrowser(Usertype);
	}
	
	@QAFTestStep(description = "user click on login button and verify error message")
	public void clickOnLogin_Btn_VerifyErrorMessage() {
		loginPage.ClickOnLogin_BtnAndVerifyErrorMessage();
	}
	@QAFTestStep(description = "user clear the password field and enter password as {0}")
	public void clearFieldEnterPassword(String password) {
		loginPage.clearField_EnterPassword(password);
	}
}
