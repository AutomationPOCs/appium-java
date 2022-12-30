package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.AccountPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class AccountIOSStep {

	AccountPageIOS account = new AccountPageIOS();

	@QAFTestStep(description = "user verify account screen using {0}")
	public void verifyAccountScreen(Object userDetail) {
		account.verifyAccountPage(userDetail);
	}

	@QAFTestStep(description = "user select opt-in in account screen")
	public void selectOptIn() {
		account.selectOptin();
	}

	@QAFTestStep(description = "user verifies Opt-in selection account page")
	public void verifyCheckBoxselection() {
		account.optinCheckBox();
	}

	//GDPR Test Steps
	@QAFTestStep(description="user clicks delete account button")
	public void clickDelete() {
		account.clickDeleteButton();
	}
	
	@QAFTestStep(description="user agrees the consent and confirmation for delete")
	public void agreesConsent() {
		account.agreeConsentAndConfirmation();
	}
	
	@QAFTestStep(description="user verifies delete button is enabled or not")
	public void verifyDeleteButton() {
		account.verifyDeleteButtonEnable();
	}
	
	@QAFTestStep(description="user clicks edit profile button")
	public void clickEditProfile() {
		account.clickEditProfileButton();
	}
	
	@QAFTestStep(description="user edits the profile details using {0}")
	public void updateProfile(String userDetail) {
		account.updateProfileDetails(userDetail);
	}
	
	@QAFTestStep(description = "user edits the dependents profile details using {0}")
	public void enterDependentDetails(Object userDetail) {
		account.updateDependentProfileDetails(userDetail);

	}
	@QAFTestStep(description = "user verifies profile details after editing")
	public void verifyAfterEdit() {
		account.verifyAfterEditing();
	}
	@QAFTestStep(description="user enters password and clicks on login")
	public void userEntersPasswordAndClicksOnLogin(){
       account.enterPasswordClickLogin();
	}
	
	@QAFTestStep(description="user verifies dependents edited {0} details")
	public void userVerifiesDependentsEditedDetails(String str0){
		account.verifyDepenedentEditedDetails(str0);
	}
	@QAFTestStep(description="user verifies Delete Account button and clicks on Delete")
	public void userVerifyDeleteAccountButtonOnAccountScreen(){
		account.verifyDeletebtnonAcc();
	}
	@QAFTestStep(description="user verifies Delete Account screen")
	public void userVerifyDeleteAccscreen(){
		account.verifydeleteaccscreen();
	}
	
	@QAFTestStep(description="user clicks on save button")
	public void clickSave() {
		account.clickSaveButton();
	}
	@QAFTestStep(description="user verify email and enters the password")
	public void userVerifyEmailAndEntersThePassword(){
		
	}
	
	
	@QAFTestStep(description="user enters invalid user details and verify")
	public void enterWrongMail() {
		account.enterWrongEmailId();
	}
	
	@QAFTestStep(description = "user enters wrong login details and verify error message")
	public void userEnterWrongLoginDetails() {
		account.loginWithGDPRInvalidUsername();
	}
	
	@QAFTestStep(description="user deletes account permanently")
	public void deleteAccount() {
		account.deleteAccountPermnently();
	}
	
	@QAFTestStep(description="user enters login credentials")
	public void enterCredentials() {
		account.enterDeleteCredentials();
	}
	@QAFTestStep(description="user enters login details")
	public void enterlogindetails() {
		account.enterLogindetail();
	}
	
	
	@QAFTestStep(description="user unchecks consent to process sensitive data checkbox")
	public void unchecksConsent() {
		account.uncheckConsentChkbx();
	}
	
	@QAFTestStep(description="user verifies and clicks on marketing optin checkbox")
	public void clicksMarketingOptin() {
		account.checkOptinOptionForMarketing();
	}
	
	@QAFTestStep(description="user agrees for opt-in option")
	public void agreeOptIn() {
		account.agreeOptinCheckbox();
	}
	
	@QAFTestStep(description="user again clicks to opt-out")
	public void clickToOptOut() {
		account.checkOptinOptionForMarketing();
	}
	
	@QAFTestStep(description = "user clicks on back button")
	public void clickBack() {
		account.clickBackButton();
	}
	
	@QAFTestStep(description = "user gets redirected to Change Password screen")
	public void clickChangePasswordBtn() {
	account.clickChangePasswordButton();
	account.clickChangePasswordScreen();
	}

	@QAFTestStep(description = "user clicks Cancel button verifies App displays Account screen")
	public void clickChangePasswordCancelButton() {
	account.clickChangePasswordCancelBtn();
	}

	@QAFTestStep(description = "user enters details using {0} on Change Password screen")
	public void enterChangePasswordDetails(Object userDetails) {
	account.enterChangePasswordDetail(userDetails);
	}

	@QAFTestStep(description = "user clicks on Save Changes button")
	public void saveChangePasswordDetails() {
	account.saveChangePasswordDetail();
	}
	@QAFTestStep(description = "user enters login detail using {0}")
	public void saveChangePasswordDetail(Object userDetail) {
	account.enterchangepasswordlogindetails(userDetail);
	}
	@QAFTestStep(description = "user edits the user profile details using {0}")
	public void enterUserDetails(Object userDetail) {
		account.updateUserProfileDetails(userDetail);

	}
	@QAFTestStep(description = "user verifies edited {0} details")
	public void verifyUpdatedUserDetails(Object userDetail) {
		account.verifyupdatedUserProfileDetails(userDetail);
		
	}
	@QAFTestStep(description = "user verify last sync section With Sensor field is empty")
	public void verifylastSync() {
		account.verifylastsyncwithsensorvalue();
		
	}
	@QAFTestStep(description = "user clicks back and navigates to home page")
	public void clickbacknavihome() {
		account.clickbacknadnavihome();
		
	}
	@QAFTestStep(description = "user verify last sync section With Sensor field value")
	public void verifylastsyncvalue() {
		account.verifylastsyncvalue();
		
	}
	@QAFTestStep(description="user verify app doesnt display country field on edit screen")
	public void verifycountryedit() {
		account.verifyCountryOptions();
	}
	@QAFTestStep(description="user clicks on delete account")
	public void userClicksOnDeleteAccount() {
		account.clickOnDeleteAccount();
	}
	@QAFTestStep(description="user verifies field validation on delete account screen using {0}")
	public void userVerifiesFieldValidationOnDeleteAccountScreen(String fieldValidations) {
		account.verifyErrorPopupUsingFieldValidations(fieldValidations);
	}
	@QAFTestStep(description="user turned off wifi and verifies delete account screen using {0}")
	public void userTurnedOffWifiAndVerifiesDeleteAccountScreen() {
		account.turnOffWifiAndVerifyDeleteScreen();
	}
}
