package com.NFK.version1.android.pages;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
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
import com.qmetry.qaf.automation.util.Validator;

public class AccountPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	SignupPageAndroid sign = new SignupPageAndroid();

	@FindBy(locator = "NFK.moremenu.accountpage.heading.lbl")
	private QAFWebElement NFKMoremenuAccountpageHeadingLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.accntdtls.lbl")
	private QAFWebElement NFKMoremenuAccountpageAccntdtlsLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.useremail.lbl")
	private QAFWebElement NFKMoremenuAccountpageUseremailLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.logout.btn")
	private QAFWebElement NFKMoremenuAccountpageLogoutBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.accountsync.lnk")
	private QAFWebElement NFKMoremenuAccountpageAccountsyncLnk;
	@FindBy(locator = "NFK.moremenu.accountpage.diabetes.optin.chkbx")
	private QAFWebElement NFKMoreMenuAccountpageDiabetesOptinChkbx;
	@FindBy(locator = "NFK.moremenu.accountpage.lastsync.lbl")
	private QAFWebElement NFKMoremenuAccountpageLastsyncLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.withmeter.lbl")
	private QAFWebElement NFKMoremenuAccountpageWithmeterLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.withaccount.lbl")
	private QAFWebElement NFKMoremenuAccountpageWithaccountLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.accountsync.datetime.lbl")
	private QAFWebElement NFKMoremenuAccountpageAccountsyncDatetimeLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.statictext.lbl")
	private QAFWebElement NFKMoremenuAccountpageStatictextLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.keepmeloggedin.lbl")
	private QAFWebElement NFKMoremenuAccountpageKeepmeloggedinLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.keepmeloggedin.switch")
	private QAFWebElement NFKMoremenuAccountpageKeepmeloggedinSwitch;
	@FindBy(locator = "NFK.moremenu.accountpage.touchid.switch")
	private QAFWebElement NFKMoremenuAccountpageTouchIDSwitch;
	@FindBy(locator = "NFK.moremenu.accountpage.edit.btn")
	private QAFWebElement NFKMoremenuAccountpageEditBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.suffix.txt")
	private QAFWebElement NFKMoremenuAccountpageSuffixTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.address1.txt")
	private QAFWebElement NFKMoremenuAccountpageAddress1Txt;
	@FindBy(locator = "NFK.moremenu.accountpage.address2.txt")
	private QAFWebElement NFKMoremenuAccountpageAddress2Txt;
	@FindBy(locator = "NFK.moremenu.accountpage.address3.txt")
	private QAFWebElement NFKMoremenuAccountpageAddress3Txt;
	@FindBy(locator = "NFK.moremenu.accountpage.city.txt")
	private QAFWebElement NFKMoremenuAccountpageCityTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.state.txt")
	private QAFWebElement NFKMoremenuAccountpageStateTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.select.state.radiobtn")
	private QAFWebElement NFKMoremenuAccountpageSelectStateRadiobtn;
	@FindBy(locator = "NFK.moremenu.accountpage.state.done.btn")
	private QAFWebElement NFKMoremenuAccountpageStateDoneBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.zipcode.txt")
	private QAFWebElement NFKMoremenuAccountpageZipcodeTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.phonenumber.txt")
	private QAFWebElement NFKMoremenuAccountpagePhonenumberTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.email.txt")
	private QAFWebElement NFKMoremenuAccountpageEmailTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.firstname.txt")
	private QAFWebElement NFKMoremenuAccountpageFirstnameTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.lastname.txt")
	private QAFWebElement NFKMoremenuAccountpageLastnameTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.middlename.txt")
	private QAFWebElement NFKMoremenuAccountpageMiddlenameTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.dateofbirth.txt")
	private QAFWebElement NFKMoremenuAccountpageDateofbirthTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.save.btn")
	private QAFWebElement NFKMoremenuAccountpageSaveBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.picker.year.pkr")
	private QAFWebElement NFKMoremenuAccountpagePickerYearPkr;
	@FindBy(locator = "NFK.moremenu.accountpage.picker.date.lbl")
	private QAFWebElement NFKMoremenuAccountpagePickerDateLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.dob.ok.btn")
	private QAFWebElement NFKMoremenuAccountpageDobOkBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.delete1.btn")
	private List<QAFWebElement> NFKMoremenuAccountpageDelete1Btn;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.btn")
	private QAFWebElement NFKMoremenuAccountpageDeleteBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.message.lbl")
	private QAFWebElement NFKMoremenuAccountpageDeleteMessageLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.email.txt")
	private QAFWebElement NFKMoremenuAccountpageDeleteEmailTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.password.txt")
	private QAFWebElement NFKMoremenuAccountpageDeletePasswordTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.ack.checkbox")
	private QAFWebElement NFKMoremenuAccountpageDeleteAckCheckbox;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.confirmdelete.checkbox")
	private QAFWebElement NFKMoremenuAccountpageDeleteConfirmdeleteCheckbox;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.deleteaccount.btn")
	private QAFWebElement NFKMoremenuAccountpageDeleteDeleteaccountBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.back.btn")
	private QAFWebElement NFKMoremenuAccountpageBackBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.optin.chkbx")
	private QAFWebElement NFKMoremenuAccountpageOptinChkbx;
	@FindBy(locator = "NFK.moremenu.accountpage.deleteaccount.btn")
	private QAFWebElement NFKMoremenuAccountpageDeleteaccountBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.iagree.btn")
	private QAFWebElement NFKMoremenuAccountpageIagreeBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.acknowledge.chkbx")
	private QAFWebElement NFKMoremenuAccountpageAcknowledgeChkbx;
	@FindBy(locator = "NFK.moremenu.accountpage.iassuredelete.chkbx")
	private QAFWebElement NFKMoremenuAccountpageIassuredeleteChkbx;
	@FindBy(locator = "NFK.moremenu.accountpage.revokeconsent.chkbx")
	private QAFWebElement NFKMoremenuAccountpageRevokeconsentChkbx;
	// Change password
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Title")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordTitle;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Current.Password.Field")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordCurrentPasswordField;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.New.Password.Field")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordNewPasswordField;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Confirm.Password.Field")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordConfirmPasswordField;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Save.Changes.Button")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordSaveChangesButton;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Cancel.Button")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordCancelButton;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Forgot.Your.Password.link")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordForgotYourPasswordLink;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Back.Button")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordBackButton;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.password.btn")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.Save.Changes.btn")
	private QAFWebElement NFKMoremenuAccountpageSaveChangesButton;
	@FindBy(locator = "NFK.moremenu.accountpage.Change.password.email.address")
	private QAFWebElement NFKMoremenuAccountpageChangePasswordemailaddress;
	@FindBy(locator = "NFK.moremenu.accountpage.Changed.password")
	private QAFWebElement NFKMoremenuAccountpageChangedPassword;
	@FindBy(locator="NFK.moremenu.account.editfield.option.text")
	private List<QAFWebElement> NFKMoremenuAccounteditfieldoptiontext;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.popup.title")
	private QAFWebElement NFKMoremenuAccountpageDeletePopupTitle;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.popup.text")
	private QAFWebElement NFKMoremenuAccountpageDeletePopupText;
	@FindBy(locator = "NFK.moremenu.accountpage.delete.requestUnsuccessful.popup.title")
	private QAFWebElement NFKMoremenuAccountpageDeleteRequestUnsuccessfulPopupTitle;
	
	public QAFWebElement getNFKMoremenuAccountpageDeleteRequestUnsuccessfulPopupTitle() {
		return NFKMoremenuAccountpageDeleteRequestUnsuccessfulPopupTitle;
	}
	public QAFWebElement getNFKMoremenuAccountpageDeletePopupText() {
		return NFKMoremenuAccountpageDeletePopupText;
	}
	public QAFWebElement getNFKMoremenuAccountpageDeletePopupTitle() {
		return NFKMoremenuAccountpageDeletePopupTitle;
	}
	
	public List<QAFWebElement> getNFKMoremenuAccounteditfieldoptiontext() {
		return NFKMoremenuAccounteditfieldoptiontext;
	}
	public QAFWebElement getNFKMoremenuAccountpageChangedPassword() {
		return NFKMoremenuAccountpageChangedPassword;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordButton() {
		return NFKMoremenuAccountpageChangePasswordBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordemailaddress() {
		return NFKMoremenuAccountpageChangePasswordemailaddress;
	}

	public QAFWebElement getNFKMoremenuAccountpageSaveChangesButton() {
		return NFKMoremenuAccountpageSaveChangesButton;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordBackButton() {
		return NFKMoremenuAccountpageChangePasswordBackButton;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordForgotYourPasswordLink() {
		return NFKMoremenuAccountpageChangePasswordForgotYourPasswordLink;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordCancelButton() {
		return NFKMoremenuAccountpageChangePasswordCancelButton;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordSaveChangesButton() {
		return NFKMoremenuAccountpageChangePasswordSaveChangesButton;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordConfirmPasswordField() {
		return NFKMoremenuAccountpageChangePasswordConfirmPasswordField;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordNewPasswordField() {
		return NFKMoremenuAccountpageChangePasswordNewPasswordField;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordCurrentPasswordField() {
		return NFKMoremenuAccountpageChangePasswordCurrentPasswordField;
	}

	public QAFWebElement getNFKMoremenuAccountpageChangePasswordTitle() {
		return NFKMoremenuAccountpageChangePasswordTitle;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteBtn() {
		return NFKMoremenuAccountpageDeleteBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteMessageLbl() {
		return NFKMoremenuAccountpageDeleteMessageLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteEmailTxt() {
		return NFKMoremenuAccountpageDeleteEmailTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeletePasswordTxt() {
		return NFKMoremenuAccountpageDeletePasswordTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteAckCheckbox() {
		return NFKMoremenuAccountpageDeleteAckCheckbox;
	}

	public QAFWebElement getNFKMoremenuAccountpageEditBtn() {
		return NFKMoremenuAccountpageEditBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox() {
		return NFKMoremenuAccountpageDeleteConfirmdeleteCheckbox;
	}

	public QAFWebElement getNFKMoremenuAccountpageSelectStateRadiobtn() {
		return NFKMoremenuAccountpageSelectStateRadiobtn;

	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteDeleteaccountBtn() {
		return NFKMoremenuAccountpageDeleteDeleteaccountBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpagePickerDateLbl() {
		return NFKMoremenuAccountpagePickerDateLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageStateDoneBtn() {
		return NFKMoremenuAccountpageStateDoneBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageEmailTxt() {
		return NFKMoremenuAccountpageEmailTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageFirstnameTxt() {
		return NFKMoremenuAccountpageFirstnameTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageLastnameTxt() {
		return NFKMoremenuAccountpageLastnameTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageMiddlenameTxt() {
		return NFKMoremenuAccountpageMiddlenameTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageSuffixTxt() {
		return NFKMoremenuAccountpageSuffixTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageAddress1Txt() {
		return NFKMoremenuAccountpageAddress1Txt;
	}

	public QAFWebElement getNFKMoremenuAccountpageAddress2Txt() {
		return NFKMoremenuAccountpageAddress2Txt;
	}

	public QAFWebElement getNFKMoremenuAccountpageCityTxt() {
		return NFKMoremenuAccountpageCityTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageStateTxt() {
		return NFKMoremenuAccountpageStateTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageZipcodeTxt() {
		return NFKMoremenuAccountpageZipcodeTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpagePhonenumberTxt() {
		return NFKMoremenuAccountpagePhonenumberTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageAddress3Txt() {
		return NFKMoremenuAccountpageAddress3Txt;
	}

	public QAFWebElement getNFKMoremenuAccountpageDateofbirthTxt() {
		return NFKMoremenuAccountpageDateofbirthTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageSaveBtn() {
		return NFKMoremenuAccountpageSaveBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpagePickerYearPkr() {
		return NFKMoremenuAccountpagePickerYearPkr;
	}

	public QAFWebElement getNFKMoremenuAccountpageTouchIDSwitch() {
		return NFKMoremenuAccountpageTouchIDSwitch;
	}

	public QAFWebElement getNFKMoreMenuAccountpageDiabetesOptinChkbx() {
		return NFKMoreMenuAccountpageDiabetesOptinChkbx;
	}

	public QAFWebElement getNFKMoremenuAccountpageAccountsyncLnk() {
		return NFKMoremenuAccountpageAccountsyncLnk;
	}

	public QAFWebElement getNFKMoremenuAccountpageLastsyncLbl() {
		return NFKMoremenuAccountpageLastsyncLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageWithmeterLbl() {
		return NFKMoremenuAccountpageWithmeterLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageWithaccountLbl() {
		return NFKMoremenuAccountpageWithaccountLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageAccountsyncDatetimeLbl() {
		return NFKMoremenuAccountpageAccountsyncDatetimeLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageStatictextLbl(String Text) {
		return LFSUtilsAndroid.getElement("NFK.moremenu.accountpage.statictext.lbl", Text);
	}

	public QAFWebElement getNFKMoremenuAccountpageKeepmeloggedinLbl() {
		return NFKMoremenuAccountpageKeepmeloggedinLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageKeepmeloggedinSwitch() {
		return NFKMoremenuAccountpageKeepmeloggedinSwitch;
	}

	public QAFWebElement getNFKSignuppageDobOkBtn() {
		return NFKMoremenuAccountpageDobOkBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKMoremenuAccountpageHeadingLbl() {
		return NFKMoremenuAccountpageHeadingLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageAccntdtlsLbl() {
		return NFKMoremenuAccountpageAccntdtlsLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageUseremailLbl() {
		return NFKMoremenuAccountpageUseremailLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageLogoutBtn() {
		return NFKMoremenuAccountpageLogoutBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageBackBtn() {
		return NFKMoremenuAccountpageBackBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteaccountBtn() {
		return NFKMoremenuAccountpageDeleteaccountBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageOptinChkbx() {
		return NFKMoremenuAccountpageOptinChkbx;
	}

	public QAFWebElement getNFKMoremenuAccountpageIagreeBtn() {
		return NFKMoremenuAccountpageIagreeBtn;
	}

	public List<QAFWebElement> getNFKMoremenuAccountpageDelete1Btn() {
		return NFKMoremenuAccountpageDelete1Btn;
	}

	public QAFWebElement getNFKMoremenuAccountpageAcknowledgeChkbx() {
		return NFKMoremenuAccountpageAcknowledgeChkbx;
	}

	public QAFWebElement getNFKMoremenuAccountpageIassuredeleteChkbx() {
		return NFKMoremenuAccountpageIassuredeleteChkbx;
	}

	public QAFWebElement getNFKMoremenuAccountpageRevokeconsentChkbx() {
		return NFKMoremenuAccountpageRevokeconsentChkbx;
	}

	// Method to verify opt-in checkbox
	public void OptinCheckBox() {
		try {
			LFSUtilsAndroid.swipePage();
			
			boolean isSelected = ("1".equals(getNFKMoreMenuAccountpageDiabetesOptinChkbx().getAttribute("value")));
			if (isSelected) {
				Reporter.logWithScreenShot("User has optin to receive diabetes related information", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("User has optout to receive diabetes related information",
						MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify optin selection", MessageTypes.Fail);
		}
	}

	// Method to verify Account Page
	public void verifyAccountPage(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		WebDriverTestCase.verifyTrue(
				getNFKMoremenuAccountpageUseremailLbl().getAttribute("text").equalsIgnoreCase(userBean.getEmailID()),
				userBean.getEmailID() + "Expected   Actual "
						+ getNFKMoremenuAccountpageUseremailLbl().getAttribute("text"),
				"Correct email ID");
		getNFKMoremenuAccountpageLogoutBtn().verifyPresent("Sign out button");
		getNFKMoremenuAccountpageAccountsyncDatetimeLbl().verifyPresent("Account last sync time");
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageKeepmeloggedinSwitch().verifyPresent("Keep me logged in switch");

	}

	public void selectOptin() {
		SignupPageAndroid android = new SignupPageAndroid();
		getNFKMoreMenuAccountpageDiabetesOptinChkbx().waitForPresent();
		if (getNFKMoreMenuAccountpageDiabetesOptinChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("false")) {
			getNFKMoreMenuAccountpageDiabetesOptinChkbx().click();
			android.getNFKSignuppageIagreeBtn().waitForPresent(2000);
			android.getNFKSignuppageIagreeBtn().click();

			Reporter.logWithScreenShot("Option is checked successfully", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Option is already checked", MessageTypes.Pass);
	}

	// method to enable keep me login btn on account screen
	public void enableKeepMeLoginSwitch() {
		if (!(getNFKMoremenuAccountpageKeepmeloggedinSwitch().getAttribute("checkble").contains("true"))) {
			getNFKMoremenuAccountpageKeepmeloggedinSwitch().click();
		}
	}

	// method to verify that keep me login is selected on account screen
	public void keepMeLoginSelected() {
		getNFKMoremenuAccountpageKeepmeloggedinSwitch().verifyPresent("Keep Me Login Button Present");
		getNFKMoremenuAccountpageKeepmeloggedinSwitch().verifyEnabled("Keep Me Login Button Enabled");
		Reporter.logWithScreenShot("Keep Me login button Present and enabled", MessageTypes.Pass);
	}

	// method to verify that Touch ID is selected on account screen
	public void touchIDSelected() {
		if (getNFKMoremenuAccountpageTouchIDSwitch().isDisplayed()) {
			getNFKMoremenuAccountpageTouchIDSwitch().verifyPresent("Keep Me Login Button Present");
			getNFKMoremenuAccountpageTouchIDSwitch().verifyEnabled("Keep Me Login Button Enabled");
			Reporter.logWithScreenShot("Keep Me login button Present and enabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("touch id is not ptresent ", MessageTypes.Pass);
		}
	}

	// Method to click on edit profile button on delete account page
	public void clickEditProfileButton() {
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageEditBtn());
		Reporter.logWithScreenShot("User clicked on edit profile button", MessageTypes.Pass);
	}

	public void selectBirthDate(UserDetailBeans userDetails) {
		SignupPageAndroid sign = new SignupPageAndroid();
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			Reporter.log("valid date");
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("sl-sl")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("pl-pl")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("cz-cz")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("fr-fr")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("en-ph")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("vi-vi")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			// LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
			// Integer.parseInt(userDetails.getBirthdayYear1()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		}

	}

	public QAFWebElement getNFKMoremenuaccountpageImportantmessageokBtn() {
		return NFKMoremenuaccountpageImportantmessageokBtn;
	}

	@FindBy(locator = "NFK.moremenu.accountpage.importantMessageOk.btn")
	private QAFWebElement NFKMoremenuaccountpageImportantmessageokBtn;

	public void editDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@testmail.com";
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Account details screen before entering details", MessageTypes.Pass);
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageEmailTxt(), email);
		ConfigurationManager.getBundle().setProperty("register.editemail.key", email);
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageFirstnameTxt(), userBean.getFirstName());
		ConfigurationManager.getBundle().setProperty("register.editfirstname.key", userBean.getFirstName());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageMiddlenameTxt(), userBean.getMiddleName());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageLastnameTxt(), userBean.getLastName());
		ConfigurationManager.getBundle().setProperty("register.editlastname.key", userBean.getLastName());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageSuffixTxt(), userBean.getSuffix());
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDateofbirthTxt());
		sign.enterYear();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageAddress1Txt(), userBean.getAddress1());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageAddress2Txt(), userBean.getAddress2());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageAddress3Txt(), userBean.getAddress3());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageCityTxt(), userBean.getCity());
		LFSUtilsAndroid.swipePage();
		selectState(userBean.getState());
		
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageZipcodeTxt());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageZipcodeTxt(), userBean.getZipCode());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpagePhonenumberTxt(), userBean.getPhoneNumber());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("The user updated the profile details", MessageTypes.Pass);
	}

	public void selectDOB(UserDetailBeans userBean) {
		// getNFKMoremenuaccountpagePickerDateLbl().waitForPresent();
		getNFKMoremenuAccountpagePickerYearPkr().isPresent();
		getNFKMoremenuAccountpagePickerYearPkr().click();
		//LFSUtilsAndroid.scrollToEleAndriodDOB(userBean.getBirthdayYear());
		LFSUtilsIOS.swipePage();
		LFSUtilsAndroid.clickWithText(userBean.getBirthdayYear());
		// getNFKsignuppageimportantmessageokbtn().click();
		getNFKSignuppageDobOkBtn().click();
	}

	public void selectState(String string) {
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageStateTxt());
		//LFSUtilsAndroid.scrollToEleAndriodDOB(string);
		LFSUtilsAndroid.clickWithText(string);
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageStateDoneBtn());
		Reporter.logWithScreenShot("User selected state", MessageTypes.Pass);

	}

	// Method to click on save button on delete account page to save the edited
	// profile
	public void clickSaveButton() {
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageSaveBtn());
		Reporter.logWithScreenShot("User clicked on save button", MessageTypes.Pass);
	}

	// Verify the profile after editing
	public void verifyAfterEditing() {
		try {
			String emailbeforeEditing = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
			String emailafterEditing = (String) ConfigurationManager.getBundle().getProperty("register.editemail.key");
			if (!emailbeforeEditing.equals(emailafterEditing)) {
				Validator.verifyThat("The user profile details edited successfully", emailbeforeEditing,
						Matchers.not(emailafterEditing));
			} else {
				Reporter.log("The user profile details not edited successfully !!", MessageTypes.Fail);
			}

			String FnamebeforeEditing = (String) ConfigurationManager.getBundle().getProperty("register.firstname.key");
			String FnameafterEditing = (String) ConfigurationManager.getBundle()
					.getProperty("register.editfirstname.key");
			if (!FnamebeforeEditing.equals(FnameafterEditing)) {

				Validator.verifyThat("The user profile details edited successfully", FnamebeforeEditing,
						Matchers.not(FnameafterEditing));
			} else {
				Reporter.log("The user profile details not edited successfully !!", MessageTypes.Fail);
			}
			String LnamebeforeEditing = (String) ConfigurationManager.getBundle().getProperty("register.lastname.key");
			String LnameafterEditing = (String) ConfigurationManager.getBundle()
					.getProperty("register.editlastname.key");
			if (!LnamebeforeEditing.equals(LnameafterEditing)) {

				Validator.verifyThat("The user profile details edited successfully", LnamebeforeEditing,
						Matchers.not(LnameafterEditing));
			} else {
				Reporter.log("The user profile details not edited successfully !!", MessageTypes.Fail);
			}
		} catch (Exception e) {
			Reporter.log("Fail to verify profile details", MessageTypes.Fail);
		}
	}

	public void clickBackButton() {
		if (getNFKMoremenuAccountpageBackBtn().isDisplayed()) {
			getNFKMoremenuAccountpageBackBtn().click();
		}
	}

	// GDPR methodds
	// TO DO: method to click on delete account button

	public void clickDeleteButton() {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageDeleteaccountBtn().verifyPresent("Delete account button is present on account page");
		getNFKMoremenuAccountpageDeleteaccountBtn().click();
	}

	public void verifyInvalidDetails() {

		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys("###@.com");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys("abcd@.com");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys("testmail+72@testmail.com");
		getNFKMoremenuAccountpageSaveBtn().click();

		if (getNFKMoremenuAccountpageStatictextLbl(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("email id already exist popup is displayed", MessageTypes.Pass);
			getNFKMoremenuAccountpageStatictextLbl(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		} else
			Reporter.logWithScreenShot("email id already exist popup is not displayed", MessageTypes.Pass);
		getNFKMoremenuAccountpageFirstnameTxt().clear();
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys("###$$%%%%^^^^(((++");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageFirstnameTxt().clear();
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageStatictextLbl(LFSUtilsAndroid.getPropString("account.fillFields"))
				.verifyPresent("First Name text field is blank. Kindly enter your first name");
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys("firstName");
		Reporter.logWithScreenShot("First name is valid", MessageTypes.Pass);

		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageLastnameTxt().sendKeys("###$$%%%%^^^^(((++");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageStatictextLbl(LFSUtilsAndroid.getPropString("account.fillFields"))
				.verifyPresent("Last Name text field is blank. Kindly enter your Last name");
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys("lastName");
		Reporter.logWithScreenShot("Last name is valid", MessageTypes.Pass);
		getNFKMoremenuAccountpageSaveBtn().click();

	}

	public void checkOptinOptionForMarketing() {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageOptinChkbx().verifyPresent("Marketing opt-in checkbox is present");
		getNFKMoremenuAccountpageOptinChkbx().click();
	}

	public void verifyOptionForMarketing() {
		if (getNFKMoremenuAccountpageOptinChkbx().getAttribute("checked").equals("false")) {
			Reporter.logWithScreenShot("Marketing opt-in checkbox is not selected", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Marketing opt-in checkbox is not selected", MessageTypes.Pass);
	}

	public void agreeOptinCheckbox() {
		if (getNFKMoremenuAccountpageIagreeBtn().isDisplayed()) {
			getNFKMoremenuAccountpageIagreeBtn().verifyPresent("I agree Button is Present");
			getNFKMoremenuAccountpageIagreeBtn().click();
		}
	}

	public void withdrawConsentForDelete() {
		if (getNFKMoremenuAccountpageAcknowledgeChkbx().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Checkbox is already checked", MessageTypes.Pass);
		} else {

			getNFKMoremenuAccountpageAcknowledgeChkbx().click();
			Reporter.logWithScreenShot("Acknowledge checkbox is checked successfully", MessageTypes.Pass);
		}

		if (getNFKMoremenuAccountpageIassuredeleteChkbx().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Checkbox is already checked", MessageTypes.Pass);
		} else {

			getNFKMoremenuAccountpageIassuredeleteChkbx().click();
			Reporter.logWithScreenShot("I Assure checkbox is checked successfully", MessageTypes.Pass);
		}

	}

	// Method to verify delete button is enabled or not
	public void verifyDeleteButtonEnable() {
		if (getNFKMoremenuAccountpageDeleteDeleteaccountBtn().isEnabled()) {
			Reporter.logWithScreenShot("Delete button is enabled", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Delete button is not enabled", MessageTypes.Fail);

	}

	public void uncheckConsentChkbx() {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageRevokeconsentChkbx().verifyPresent("Consent page checkbox is present");
		getNFKMoremenuAccountpageRevokeconsentChkbx().click();
		Reporter.logWithScreenShot("Delete Account page is displayed", MessageTypes.Pass);
	}

	// Method to agree consent and confirmation screen
	public void agreeConsentAndConfirmation() {
		getNFKMoremenuAccountpageDeleteAckCheckbox().verifyPresent("I Acknowledge checkbox is present");
		getNFKMoremenuAccountpageDeleteAckCheckbox().click();
		getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox()
				.verifyPresent("I assure permanent delete checkbox is present");
		getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox().click();
	}

	// Method to delete user account permanently
	public void deleteAccountPermnently() {
		getNFKMoremenuAccountpageDeleteDeleteaccountBtn().click();
		LFSUtilsAndroid.pause(2000);
		Reporter.logWithScreenShot("Delete account confirmation popup is displayed", MessageTypes.Pass);
		LFSUtilsAndroid.pause(2000);
		SignupPageAndroid sign = new SignupPageAndroid();
		sign.getNFKsignuppageimportantmessageokbtn().click();

	}

	public void verifyPatientPermanentDelete() {
		SignupPageAndroid sign = new SignupPageAndroid();

		if (sign.getNFKsignuppageimportantmessageokbtn().isDisplayed()) {
			Reporter.logWithScreenShot("Invalid username or password message popup is displayed", MessageTypes.Pass);
			sign.getNFKsignuppageimportantmessageokbtn().click();

		} else {
			Reporter.logWithScreenShot("Ok button is not clicked", MessageTypes.Pass);
		}

	}

	public void verifyDeletebtnonAccount() {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageDeleteBtn().isPresent();
		getNFKMoremenuAccountpageDeleteBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has clicked on Delete button", MessageTypes.Pass);
	}

	public void verifydeleteaccscreenAndroid() {
		getNFKMoremenuAccountpageDeleteMessageLbl().verifyPresent("Message on delete screen");
		getNFKMoremenuAccountpageDeleteEmailTxt().getAttribute("Email").isEmpty();
		getNFKMoremenuAccountpageDeletePasswordTxt().getAttribute("Password").isEmpty();
		getNFKMoremenuAccountpageDeleteAckCheckbox().verifyPresent("Acknowledgment checkbox");
		getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox().verifyPresent("confirm delete pop-up");
		getNFKMoremenuAccountpageDeleteDeleteaccountBtn().verifyPresent("Delete Account button is present");
	}

	public void editDependentDetails(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@testmail.com";
		if (userDetails instanceof String) {
			userBean.fillFromConfig(userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Account details screen before entering details", MessageTypes.Pass);
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageEmailTxt(), email);
		ConfigurationManager.getBundle().setProperty("register.editemail.key", email);
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageFirstnameTxt(), userBean.getDependentfname());
		ConfigurationManager.getBundle().setProperty("register.editfirstname.key", userBean.getDependentfname());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageMiddlenameTxt(), userBean.getDependentmname());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageLastnameTxt(), userBean.getDependentlname());
		ConfigurationManager.getBundle().setProperty("register.editlastname.key", userBean.getDependentlname());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageSuffixTxt(), userBean.getDependentsuffix());
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDateofbirthTxt());
		LFSUtilsAndroid.enterText(sign.getNFKSignupPagePickerYearLbl(), userBean.getDependentbirthyr());
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageAddress1Txt(), userBean.getDependentaddress1());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageAddress2Txt(), userBean.getDependentaddress2());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageAddress3Txt(), userBean.getDependentaddress3());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("User updated dependent deatils till address", MessageTypes.Pass);
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageCityTxt(), userBean.getDependentcity());
		LFSUtilsAndroid.hideKeyboard();
		String state = userBean.getDependentstate();
		selectState(userBean.getDependentstate());
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageZipcodeTxt(), userBean.getDependentzipcode());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpagePhonenumberTxt(), userBean.getDependentphone());
		Reporter.logWithScreenShot("The user updated the dependent profile details", MessageTypes.Pass);
	}

	private void selectDependentBirthDate(UserDetailBeans userDetails) {
		SignupPageAndroid sign = new SignupPageAndroid();
		sign.getNFKSignupPagePickerDateLbl().waitForPresent();
		// LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
		// Integer.parseInt(userDetails.getBirthdayYear1()));
		sign.getNFKSignupPagePickerYearLbl().click();
		sign.getNFKSignupPagePickerYearLbl().sendKeys(userDetails.getDependentDOByear());
		// LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
		// Integer.parseInt(userDetails.getDependentDOByear()));
		sign.getNFKsignuppageimportantmessageokbtn().click();

	}

	public void enterPasswordClickLogin() {
		LoginPageAndroid login = new LoginPageAndroid();
		LFSUtilsAndroid.enterText(login.getNFKloginpagepasswordtxt(),
				ConfigurationManager.getBundle().getPropertyValue("password"));
		LFSUtilsAndroid.click(login.getNFKForgotPasswordSenEmailBtn());
		Reporter.logWithScreenShot("User entered password and clicked on login button", MessageTypes.Pass);
	}

	public void verifyDependentDetailsAfterEdit(String userDetails) {
		try {
			UserDetailBeans userBean = new UserDetailBeans();
			if (userDetails instanceof String) {
				userBean.fillFromConfig(userDetails);
			} else {
				userBean.fillData(userDetails);
			}
			getNFKMoremenuAccountpageEmailTxt().getText()
					.equals(ConfigurationManager.getBundle().getString("register.editemail.key"));
			getNFKMoremenuAccountpageFirstnameTxt().getText()
					.equals(ConfigurationManager.getBundle().getString("register.editfirstname.key"));
			getNFKMoremenuAccountpageLastnameTxt().getText()
					.equals(ConfigurationManager.getBundle().getProperty("register.editlastname.key"));
			getNFKMoremenuAccountpageSuffixTxt().getText().equals(userBean.getDependentmname());
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.waitforLoad();
			getNFKMoremenuAccountpageAddress1Txt().getText().equals(userBean.getDependentaddress1());
			getNFKMoremenuAccountpageAddress2Txt().getText().equals(userBean.getDependentaddress2());
			getNFKMoremenuAccountpageAddress3Txt().getText().equals(userBean.getDependentaddress3());
			Reporter.logWithScreenShot("User verified dependent deatils till address", MessageTypes.Pass);
			LFSUtilsAndroid.swipePage();
			getNFKMoremenuAccountpageCityTxt().getText().equals(userBean.getDependentcity());
			getNFKMoremenuAccountpageZipcodeTxt().getText().equals(userBean.getDependentzipcode());
			getNFKMoremenuAccountpagePhonenumberTxt().getText().equals(userBean.getPhoneNumber());
			Reporter.logWithScreenShot("User verified dependent deatils", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify dependent deatils", MessageTypes.Fail);
		}
	}

	// Click on Change password and verify screen
	public void clickChangePasswordButton() {
		try {
		if (getNFKMoremenuAccountpageChangePasswordButton().isDisplayed()) {
			LFSUtilsAndroid.click(getNFKMoremenuAccountpageChangePasswordButton());
		}
		Reporter.logWithScreenShot("Sucessfully clicked on chnage password btn",MessageTypes.Pass);
		}catch (Exception e) {
		e.printStackTrace();
		Reporter.logWithScreenShot("Fail to click on chnage password btn ",MessageTypes.Fail);
	}
		}

	// Verfiy Change password screen
	public void clickChangePasswordScreen() {
try {
		getNFKMoremenuAccountpageChangePasswordTitle().isPresent();
		getNFKMoremenuAccountpageChangePasswordCurrentPasswordField().isPresent();
		getNFKMoremenuAccountpageChangePasswordNewPasswordField().isPresent();
		getNFKMoremenuAccountpageChangePasswordConfirmPasswordField().isPresent();
		getNFKMoremenuAccountpageChangePasswordSaveChangesButton().isPresent();
		getNFKMoremenuAccountpageChangePasswordCancelButton().isPresent();
		getNFKMoremenuAccountpageChangePasswordForgotYourPasswordLink().isPresent();
		getNFKMoremenuAccountpageChangePasswordBackButton().isPresent();
		Reporter.logWithScreenShot("Sucessfully verified Change password screen",MessageTypes.Pass);
}catch (Exception e) {
e.printStackTrace();
Reporter.logWithScreenShot("Fail to verify Change password screen ",MessageTypes.Fail);
}
	}

	// Click on Cancel button from Change password screen
	public void clickChangePasswordCancelBtn() {
try {
		getNFKMoremenuAccountpageChangePasswordCancelButton().isEnabled();
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageChangePasswordCancelButton());
		Reporter.logWithScreenShot("Account screen after clicling on Cancel button", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageChangePasswordButton());
}catch (Exception e) {
	e.printStackTrace();
	Reporter.logWithScreenShot("Fail to click change password cancel btn ",MessageTypes.Fail);
}	
}

	// Click on save button from Change password screen
	public void clickSaveChangesBtn() {

		getNFKMoremenuAccountpageSaveChangesButton().isEnabled();
		getNFKMoremenuAccountpageSaveChangesButton().click();
		Reporter.logWithScreenShot("Account screen after changing password", MessageTypes.Pass);
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
		String pass = (String) ConfigurationManager.getBundle().getProperty("register.pass");
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageChangePasswordCurrentPasswordField(),pass);
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageChangePasswordNewPasswordField(),userBean.getNewPassword());
		LFSUtilsAndroid.enterText(getNFKMoremenuAccountpageChangePasswordConfirmPasswordField(),userBean.getNewPassword());
		Reporter.logWithScreenShot("sucessfully Change password, After entering details", MessageTypes.Pass);
		}catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to fill chnage password",MessageTypes.Fail);
		}
	}

	// Save Change password detail
	public void saveChangePasswordDetail() {
		try {
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageSaveChangesButton());
		Reporter.logWithScreenShot("Sucessfully clicked save btn of chnage password screen",MessageTypes.Pass);
		}catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click save btn of chnage password screen ",MessageTypes.Fail);
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

		SignupPageAndroid sign = new SignupPageAndroid();
		getNFKMoremenuAccountpageChangePasswordemailaddress().click();
		String str = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		getNFKMoremenuAccountpageChangePasswordemailaddress().sendKeys(str);
		// Properties login =
		// ConfigurationManager.getBundle().getProperties("register.email.key");
		getNFKMoremenuAccountpageChangedPassword().click();
		getNFKMoremenuAccountpageChangedPassword().sendKeys(userBean.getNewPassword());
		Reporter.logWithScreenShot("login screen After entering details", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();

	}

	public void editUserDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@testmail.com";
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Account details screen before entering details", MessageTypes.Pass);
		getNFKMoremenuAccountpageEmailTxt().click();
		LFSUtilsIOS.pause(5000);
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys(email);

		// email stored in key
		ConfigurationManager.getBundle().setProperty("update.editemail.key", email);

		getNFKMoremenuAccountpageFirstnameTxt().click();
		getNFKMoremenuAccountpageFirstnameTxt().clear();
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys(userBean.getFirstName());
		// FirstName stored in FirstName
		ConfigurationManager.getBundle().setProperty("update.editfirstname.key", userBean.getFirstName());
		getNFKMoremenuAccountpageLastnameTxt().click();
		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageLastnameTxt().sendKeys(userBean.getLastName());
		// LastName stored in LastName
		ConfigurationManager.getBundle().setProperty("update.editlastname.key", userBean.getLastName());
		getNFKMoremenuAccountpageAddress1Txt().click();
		getNFKMoremenuAccountpageAddress1Txt().clear();
		getNFKMoremenuAccountpageAddress1Txt().sendKeys(userBean.getAddress1());
		ConfigurationManager.getBundle().setProperty("update.editAddress1.key", userBean.getAddress1());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageCityTxt().click();
		getNFKMoremenuAccountpageCityTxt().clear();
		getNFKMoremenuAccountpageCityTxt().sendKeys(userBean.getCity());
		ConfigurationManager.getBundle().setProperty("update.editCity.key", userBean.getCity());
		LFSUtilsAndroid.hideKeyboard();

		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);

	}

	public void verifyUserDetailsAfterEdit(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();

		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		getNFKMoremenuAccountpageEmailTxt().getText()
				.equals(ConfigurationManager.getBundle().getString("update.editemail.key"));
		getNFKMoremenuAccountpageFirstnameTxt().getText()
				.equals(ConfigurationManager.getBundle().getString("update.editfirstname.key"));
		getNFKMoremenuAccountpageLastnameTxt().getText()
				.equals(ConfigurationManager.getBundle().getProperty("update.editlastname.key"));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageAddress1Txt().getText()
				.equals(ConfigurationManager.getBundle().getString("update.editAddress1.key"));
		// LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageCityTxt().getText()
				.equals(ConfigurationManager.getBundle().getString("update.editCity.key"));
		Reporter.logWithScreenShot("Verified the deatils", MessageTypes.Pass);

	}
	
	public void verifyCountryOptions() {
		try {
		for(int i=0;i<=12;i++)
		{
			String str=getNFKMoremenuAccounteditfieldoptiontext().get(i).getText();
			if(!(str=="country"))	
				Reporter.logWithScreenShot("country option not present",MessageTypes.Pass);
	    }
		Reporter.logWithScreenShot("User successfully verified country option not present on edit account page",MessageTypes.Pass);
	 }catch(Exception e){
			Reporter.logWithScreenShot("Fail to verify country option not present on edit account screen", MessageTypes.Fail);
	 }
}	
	
	//Method to click on delete account button on account screen
	public void clickOnDeleteAccount() {
		try {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKMoremenuAccountpageDeleteBtn().verifyPresent();
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteBtn());
		Reporter.logWithScreenShot("Successfully clicked On Delete Account", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to click On Delete Account", MessageTypes.Fail);
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
		getNFKMoremenuAccountpageDeleteEmailTxt().sendKeys(userBean.getinvalidUserName());
		getNFKMoremenuAccountpageDeletePasswordTxt().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.password.key"));
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteAckCheckbox());
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox());
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteDeleteaccountBtn());
		getNFKMoremenuAccountpageDeletePopupTitle().verifyPresent();
		getNFKMoremenuAccountpageDeletePopupText().verifyPresent();
		getNFKMoremenuaccountpageImportantmessageokBtn().verifyPresent();
		LFSUtilsAndroid.click(getNFKMoremenuaccountpageImportantmessageokBtn());
		
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteEmailTxt());		
		getNFKMoremenuAccountpageDeleteEmailTxt().clear();
		getNFKMoremenuAccountpageDeleteEmailTxt().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.email.key"));	 
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeletePasswordTxt());		
		getNFKMoremenuAccountpageDeletePasswordTxt().clear();
		getNFKMoremenuAccountpageDeletePasswordTxt().sendKeys(userBean.getinvalidPassword());
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteDeleteaccountBtn());		
		getNFKMoremenuAccountpageDeletePopupTitle().verifyPresent();
		getNFKMoremenuAccountpageDeletePopupText().verifyPresent();
		LFSUtilsAndroid.click(getNFKMoremenuaccountpageImportantmessageokBtn());		
		Reporter.logWithScreenShot("Successfully verified Error Popup Using Field Validations", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify Error Popup Using Field Validations", MessageTypes.Fail);
		}
	}
	
	//Turn off wifi and verify delete screen account popUp
	public void turnOffWifiAndVerifyDeleteScreen() {
		try {
		LFSUtilsAndroid.turnWifiOff();
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteEmailTxt());		
		getNFKMoremenuAccountpageDeleteEmailTxt().clear();
		getNFKMoremenuAccountpageDeleteEmailTxt().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.email.key"));
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeletePasswordTxt());		
		getNFKMoremenuAccountpageDeletePasswordTxt().clear();
		getNFKMoremenuAccountpageDeletePasswordTxt().sendKeys((String) ConfigurationManager.getBundle().getProperty("register.password.key"));		
		LFSUtilsAndroid.click(getNFKMoremenuAccountpageDeleteDeleteaccountBtn());		
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageDeleteRequestUnsuccessfulPopupTitle().verifyPresent();
		LFSUtilsAndroid.click(getNFKMoremenuaccountpageImportantmessageokBtn());
		LFSUtilsAndroid.turnWifiOn();
		Reporter.logWithScreenShot("Successfully turned Off Wifi And Verify Delete Screen", MessageTypes.Pass);
		}catch (Exception e) {
			Reporter.logWithScreenShot("Failed to turned Off Wifi And Verify Delete Screen", MessageTypes.Fail);
		}
	}
}