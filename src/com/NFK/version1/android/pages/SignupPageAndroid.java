package com.NFK.version1.android.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.NFK.support.ApiMethods;
import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.UserDetailBeans;
import com.NFK.version1.iOS.pages.LoginPageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import net.sf.antcontrib.logic.IfTask.ElseIf;

import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class SignupPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {
	// LFSUtilsAndroid a = new LFSUtilsAndroid();
	CountrySelectionPageAndroid country = new CountrySelectionPageAndroid();

	LFSUtilsAndroid baseReference = new LFSUtilsAndroid();
	@FindBy(locator = "NFK.safetyonboarding.onetouch.logo")
	private QAFWebElement NFKSafetyonboardingOnetouchLogo;
	@FindBy(locator = "NFK.safetyonboarding.next.btn")
	private QAFWebElement NFKSafetyonboardingNextBtn;
	@FindBy(locator = "NFK.safetyonboarding.bloodmeter.image")
	private QAFWebElement NFKSafetyonboardingBloodmeterImage;
	@FindBy(locator = "NFK.safetyonboarding.IUnderstand.checkbox")
	private QAFWebElement NFKSafetyonboardingIUnderstandCheckbox;
	@FindBy(locator = "NFK.safetyonboarding.AreaOfCaution.image")
	private QAFWebElement NFKSafetyonboardingAreaOfCautionImage;
	@FindBy(locator = "NFK.safetyonboarding.SupportedUOM.image")
	private QAFWebElement NFKSafetyonboardingSupportedUOMImage;
	@FindBy(locator = "NFK.safetyonboarding.currentreading.image")
	private QAFWebElement NFKSafetyonboardingCurrentreadingImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowRisingQuickly.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowRisingQuicklyImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowRising.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowRisingImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowRisingSlowly.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowRisingSlowlyImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowSteady.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowSteadyImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowFallingSlowly.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowFallingSlowlyImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowFalling.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowFallingImage;
	@FindBy(locator = "NFK.safetyonboarding.trendArrowFallingQuickly.image")
	private QAFWebElement NFKSafetyonboardingTrendArrowFallingQuicklyImage;
	@FindBy(locator = "NFK.safetyonboarding.back.btn")
	private QAFWebElement NFKSafetyonboardingBackBtn;
	@FindBy(locator = "NFK.safetyonboarding.highReading.image")
	private QAFWebElement NFKSafetyonboardingHighReadingImage;
	@FindBy(locator = "NFK.safetyonboarding.inRangeReading.image")
	private QAFWebElement NFKSafetyonboardingInRangeReadingImage;
	@FindBy(locator = "NFK.safetyonboarding.lowReading.image")
	private QAFWebElement NFKSafetyonboardingLowReadingImage;
	@FindBy(locator = "NFK.safetyonboarding.alert.image")
	private QAFWebElement NFKSafetyonboardingAlertImage;
	@FindBy(locator = "NFK.safetyonboarding.smartphone.image")
	private QAFWebElement NFKSafetyonboardingSmartphoneImage;
	@FindBy(locator = "NFK.safetyonboarding.urgentSoonContainer.image")
	private QAFWebElement NFKSafetyonboardingUrgentSoonContainerImage;
	@FindBy(locator = "NFK.safetyonboarding.urgentAlarmContainer.image")
	private QAFWebElement NFKSafetyonboardingUrgentAlarmContainerImage;
	@FindBy(locator = "NFK.safetyonboarding.setting.btn")
	private QAFWebElement NFKSafetyonboardingSettingBtn;
	@FindBy(locator = "NFK.safetyonboarding.setting.switch.btn")
	private QAFWebElement NFKSafetyonboardingSettingSwitchBtn;
	@FindBy(locator = "NFK.safetyonboarding.setting.allow.btn")
	private QAFWebElement NFKSafetyonboardingSettingAllowBtn;
	@FindBy(locator = "NFK.safetyonboarding.setting.deny.btn")
	private QAFWebElement NFKSafetyonboardingSettingDenyBtn;
	@FindBy(locator = "NFK.safetyonboarding.setting.back.btn")
	private QAFWebElement NFKSafetyonboardingSettingBackBtn;
	@FindBy(locator = "NFK.safetyonboarding.secondscreen.text")
	private QAFWebElement NFKSafetyonboardingSecondscreenText;
	@FindBy(locator = "NFK.safetyonboarding.fourthscreen.text")
	private QAFWebElement NFKSafetyonboardingFourthscreenText;
	@FindBy(locator = "NFK.safetyonboarding.fifthscreen.text")
	private QAFWebElement NFKSafetyonboardingFifthscreenText;
	@FindBy(locator = "NFK.safetyonboarding.seventhscreen.title")
	private QAFWebElement NFKSafetyonboardingSeventhscreenTitle;
	@FindBy(locator = "NFK.safetyonboarding.seventhscreen.text")
	private QAFWebElement NFKSafetyonboardingSeventhscreenText;
	@FindBy(locator = "NFK.safetyonboarding.DNDPopup.text")
	private QAFWebElement NFKSafetyonboardingDNDPopupText;
	@FindBy(locator = "NFK.safetyonboarding.DNDPopup.title")
	private QAFWebElement NFKSafetyonboardingDNDPopupTitle;

	@FindBy(locator = "NFK.signuppage.email.txt")
	private QAFWebElement NFKSignuppageEmailTxt;
	@FindBy(locator = "NFK.signuppage.confirmemail.txt")
	private QAFWebElement NFKSignuppageConfirmemailTxt;
	@FindBy(locator = "NFK.signuppage.password.txt")
	private QAFWebElement NFKSignuppagePasswordTxt;
	@FindBy(locator = "NFK.signuppage.signup.btn")
	private QAFWebElement NFKSignuppageSignupBtn;
	@FindBy(locator = "NFK.signuppage.termofservice.check.box")
	private QAFWebElement NFKSignuppageTermofserviceCheckBox;
	@FindBy(locator = "NFK.signuppage.onetouch.logo")
	private QAFWebElement NFKSignuppageOnetouchLogo;
	@FindBy(locator = "NFK.signuppage.back.btn")
	private QAFWebElement NFKSignuppageBackBtn;
	@FindBy(locator = "NFK.signuppage.login.lnk")
	private QAFWebElement NFKSignuppageLoginLnk;
	@FindBy(locator = "NFK.signuppage.termofservice.lnk")
	private QAFWebElement NFKSignuppageTermofserviceLnk;
	@FindBy(locator = "NFK.signuppage.skip.btn")
	private QAFWebElement NFKSignuppageSkipBtn;
	// NextBtn on safety onboarding screen
	@FindBy(locator = "NFK.signuppage.safety.next.btn")
	private QAFWebElement NFKSignuppageSafetyNextBtn;
	@FindBy(locator = "NFK.signuppage.safety.iunstd.check.box")
	private QAFWebElement NFKSignuppageSafetyIunstdCheckBox;
	@FindBy(locator = "NFK.signuppage.safety.done.btn")
	private QAFWebElement NFKSignuppageSafetyDoneBtn;
	@FindBy(locator = "NFK.signuppage.safety.allow.btn")
	private QAFWebElement NFKSignuppageSafetyAllowBtn;
	@FindBy(locator = "NFK.signuppage.importantMessage.txt")
	private QAFWebElement NFKSignuppageImportantmessageTxt;
	@FindBy(locator = "NFK.signuppage.safety.skip.btn")
	private QAFWebElement NFKSignuppageSensorSkipBtn;
	@FindBy(locator = "NFK.signuppage.importantMessageOk.btn")
	private QAFWebElement NFKSignuppageImportantmessageokBtn;
	@FindBy(locator = "NFK.signuppage.continueButton.btn")
	private QAFWebElement NFKSignuppageContinuebuttonBtn;
	@FindBy(locator = "NFK.signuppage.termsOfUse.txt")
	private QAFWebElement NFKSignuppageTermsofuseTxt;
	@FindBy(locator = "NFK.signuppage.termsAndPrivecy.txt")
	private QAFWebElement NFKSignuppageTermsandprivecyTxt;
	@FindBy(locator = "NFK.signuppage.firstname.txt")
	private QAFWebElement NFKSignuppageFirstnameTxt;
	@FindBy(locator = "NFK.signuppage.lastname.txt")
	private QAFWebElement NFKSignuppageLastnameTxt;
	@FindBy(locator = "NFK.signuppage.dob.txt")
	private QAFWebElement NFKSignuppageDobTxt;
	@FindBy(locator = "NFK.signuppage.dob.field1")
	private QAFWebElement NFKSignuppageDobField1;
	@FindBy(locator = "NFK.signupPage.confirmPassword.txt")
	private QAFWebElement NFKSignupPageConfirmPasswordTxt;
	@FindBy(locator = "NFK.signuppage.cliniccode.txt")
	private QAFWebElement NFKSignuppageCliniccodeTxt;
	@FindBy(locator = "NFK.signuppage.promotionalcode.chkbox")
	private QAFWebElement NFKSignuppagePromotionalcodeChkbox;
	@FindBy(locator = "NFK.signuppage.keepmeloggedin.chkbox")
	private QAFWebElement NFKSignuppageKeepmeloggedinChkbox;
	@FindBy(locator = "NFK.signuppage.calendar.year.btn")
	private QAFWebElement NFKSignupPageCalendarYearBtn;
	@FindBy(locator = "NFK.signuppage.calendar.next.btn")
	private QAFWebElement NFKSignupPageCalendarNextBtn;
	@FindBy(locator = "NFK.signuppage.calendar.previous.btn")
	private QAFWebElement NFKSignupPageCalendarPreviousBtn;
	@FindBy(locator = "NFK.email.validation.error.msg")
	private QAFWebElement NFKEmailValidationErrorMsg;
	@FindBy(locator = "NFK.confirm.email.validation.error.msg")
	private QAFWebElement NFKConfirmEmailValidationErrorMsg;
	@FindBy(locator = "NFK.password.validation.error.msg")
	private QAFWebElement NFKPasswordValidationErrorMsg;
	@FindBy(locator = "NFK.signuppage.clinic.code.txt")
	private QAFWebElement NFKSignuppageClinicCodeTxt;
	@FindBy(locator = "NFK.signuppage.firstNameError.txt")
	private QAFWebElement NFKSignuppageFirstNameErrorTxt;
	@FindBy(locator = "NFK.signuppage.lastNameError.txt")
	private QAFWebElement NFKSignuppageLastNameErrorTxt;

	@FindBy(locator = "NFK.signuppage.touchID.btn")
	private QAFWebElement NFKSignuppageTouchIDBtn;
	@FindBy(locator = "NFK.signuppage.optin.privecy.NFK.lbl")
	private QAFWebElement NFKSignuppageOptinPrivecyNFKLbl;
	@FindBy(locator = "NFK.signuppage.updatenotice.chck.btn")
	private QAFWebElement NFKSignuppageUpdatenoticeChckBtn;
	@FindBy(locator = "NFK.signuppage.updatenotice.continue.btn")
	private QAFWebElement NFKSignuppageUpdatenoticeContinueBtn;
	@FindBy(locator = "NFK.signupPage.optin.title.lbl")
	private QAFWebElement NFKSignuppageOptinTitleLbl;
	@FindBy(locator = "NFK.signuppage.dob.list.year")
	private QAFWebElement NFKSignuppageDobListYear;
	@FindBy(locator = "NFK.signupPage.optin.customer.service.link")
	private QAFWebElement NFKSignuppageOptinCustomerServiceLink;
	@FindBy(locator = "NFK.signupPage.optin.customer.service.link.redirects.newmail.txt")
	private QAFWebElement NFKSignuppageOptinCustomerServiceLinkNewEmailText;
	@FindBy(locator = "NFK.signupPage.gender.male.radio.btn")
	private QAFWebElement NFKSignupPageGenderMaleRadioBtn;
	@FindBy(locator = "NFK.signupPage.gender.female.radio.btn")
	private QAFWebElement NFKSignupPageGenderFemaleRadioBtn;
	@FindBy(locator = "NFK.signupPage.diabetes.type1.radio.btn")
	private QAFWebElement NFKSignupPageDiabetesType1RadioBtn;
	@FindBy(locator = "NFK.signupPage.diabetes.type2.radio.btn")
	private QAFWebElement NFKSignupPageDiabetesType2RadioBtn;
	@FindBy(locator = "NFK.signupPage.diabetes.gestational.radio.btn")
	private QAFWebElement NFKSignupPageDiabetesGestationalRadioBtn;
	@FindBy(locator = "NFK.signupPage.picker.date.pkr")
	private QAFWebElement NFKSignupPagePickerDateLbl;
	@FindBy(locator = "NFK.signupPage.picker.month.pkr")
	private QAFWebElement NFKSignupPagePickerMonthLbl;
	@FindBy(locator = "NFK.signupPage.picker.year.pkr")
	private QAFWebElement NFKSignupPagePickerYearLbl;
	@FindBy(locator = "NFK.signupPage.clinic.title.lbl")
	private QAFWebElement NFKSignupPageClinicTitleLbl;
	@FindBy(locator = "NFK.signupPage.clinic.consent.chkbox")
	private QAFWebElement NFKSignupPageClinicConsentChkbox;
	@FindBy(locator = "NFK.signupPage.clinicname.lbl")
	private QAFWebElement NFKSignupPageClinicNameLbl;
	@FindBy(locator = "NFK.signupPage.clinicphonenumber.lbl")
	private QAFWebElement NFKSignupPageClinicPhonenumberLbl;
	@FindBy(locator = "NFK.homepage.home.btn")
	private QAFWebElement NFKHomepageHomeBtn;
	@FindBy(locator = "NFK.signupPage.clinic.send.btn")
	private QAFWebElement NFKSignupPageClinicSendBtn;
	@FindBy(locator = "NFK.signuppage.clinic.info.btn")
	private QAFWebElement NFKSignuppageClinicInfoBtn;
	@FindBy(locator = "NFK.signuppage.dob.ok.btn")
	private QAFWebElement NFKSignuppageDobOkBtn;
	@FindBy(locator = "NFK.signuppage.clinic.close.info.btn")
	private QAFWebElement NFKSignuppageClinicCloseInfoBtn;
	@FindBy(locator = "NFK.applysensor.skip.btn")
	private QAFWebElement NFKApplysensorSkipBtn;
	@FindBy(locator = "NFK.signuppage.removeapp.txt")
	private QAFWebElement NFKrunAppInBackground;
	@FindBy(locator = "NFK.applysensor.title")
	private QAFWebElement NFKApplysensorTitle;

	@FindBy(locator = "NFK.signup.dependentpage.txt")
	private QAFWebElement NFKSignupDependentpageTxt;
	@FindBy(locator = "NFK.signup.dependent.guardian.fname")
	private QAFWebElement NFKSignupDependentGuardianFname;
	@FindBy(locator = "NFK.signup.dependent.guardian.lname")
	private QAFWebElement NFKSignupDependentGuardianLname;
	@FindBy(locator = "NFK.signup.dependent.emailAddress.txt")
	private QAFWebElement NFKSignupDependentEmailAddressTxt;
	@FindBy(locator = "NFK.signup.dependent.confemailaddress.txt")
	private QAFWebElement NFKSignupDependentConfemailaddressTxt;
	@FindBy(locator = "NFK.signup.dependent.password.txt")
	private QAFWebElement NFKSignupDependentPasswordTxt;
	@FindBy(locator = "NFK.signup.dependent.confpassword.txt")
	private QAFWebElement NFKSignupDependentConfpasswordTxt;
	@FindBy(locator = "NFK.signup.dependent.CheckAgreementTerm.btn")
	private QAFWebElement NFKSignupDependentCheckAgreementTermBtn;
	@FindBy(locator = "NFK.signup.dependent.checkPromotionalOffers.btn")
	private QAFWebElement NFKSignupDependentCheckPromotionalOffersBtn;
	@FindBy(locator = "NFK.signup.dependent.clinic.txt")
	private QAFWebElement NFKSignupDependentClinicTxt;

	@FindBy(locator = "NFK.signuppage.safety.settings.btn")
	private QAFWebElement NFKSignuppageSafetySettingsBtn;
	@FindBy(locator = "NFK.device.setting.onetouch.txt")
	private QAFWebElement NFKDeviceSettingOnetouchTxt;
	@FindBy(locator = "NFK.device.setting.switch.btn")
	private QAFWebElement NFKDeviceSettingSwitchBtn;
	@FindBy(locator = "NFK.device.setting.allow.btn")
	private QAFWebElement NFKDeviceSettingAllowBtn;

	@FindBy(locator = "NFK.signuppage.clinic.name")
	private QAFWebElement NFKSignuppageClinicName;
	@FindBy(locator = "NFK.signuppage.clinic.phone")
	private QAFWebElement NFKSignuppageClinicPhone;
	@FindBy(locator = "NFK.signuppage.clinic.info.name")
	private QAFWebElement NFKSignuppageClinicInfoName;
	@FindBy(locator = "NFK.signuppage.clinic.info.phone")
	private QAFWebElement NFKSignuppageClinicInfoPhone;
	@FindBy(locator = "NFK.signuppage.clinic.info.msgrequest")
	private QAFWebElement NFKSignuppageClinicInfoMsgrequest;
	@FindBy(locator = "NFK.signuppage.clinic.info.tikmark")
	private QAFWebElement NFKSignuppageClinicInfoTikmark;
	@FindBy(locator = "NFK.signuppage.clinic.info.close.btn")
	private QAFWebElement NFKSignuppageClinicInfoCloseBtn;
	// Validation X button
	@FindBy(locator = "NFK.validation.error.icon")
	private QAFWebElement NFKValidationErrorIcon;
	// Age Restriction Pop up
	@FindBy(locator = "NFK.signuppage.age.restriction.popup")
	private QAFWebElement NFKSignuppageAgeRestrictionPopup;
	@FindBy(locator = "NFK.signupPage.age.restriction.popup.cancel.btn")
	private QAFWebElement NFKSignupPageAgeRestrictionPopupCancelButton;
	@FindBy(locator = "NFK.signuppage.age.restriction.popup.signupdependent.btn")
	private QAFWebElement NFKSignuppageAgeRestrictionPopupSignupdependentButton;
	@FindBy(locator = "NFK.signuppage.emailexist.popup")
	private QAFWebElement NFKSignuppageEmailexistPpopup;
	@FindBy(locator = "NFK.signupPage.dateOfBirth.txt")
	private QAFWebElement NFKSignupPageDateOfBirthTxt;
	@FindBy(locator = "NFK.signupPage.greenLink.txt")
	private QAFWebElement NFKSignupPageGreenLinkTxt;
	@FindBy(locator = "NFK.signupPage.greenLink.btn")
	private QAFWebElement NFKSignupPageGreenLinkBtn;
	@FindBy(locator = "NFK.signupPage.cancel.btn")
	private QAFWebElement NFKSignupPageCancelBtn;
	@FindBy(locator = "NFK.signupPage.privacyPolicy.txt")
	private QAFWebElement NFKSignupPagePrivacyPolicyTxt;
	@FindBy(locator = "NFK.signupPage.privacyPolicyBack.btn")
	private QAFWebElement NFKSignupPagePrivacyPolicyBackBtn;
	@FindBy(locator = "NFK.signuppage.clinicodebox.btn")
	private QAFWebElement NFKSignuppageClinicodeboxBtn;
	@FindBy(locator = "NFK.signupPage.clinicCodeText.btn")
	private QAFWebElement NFKSignupPageClinicCodeTextBtn;
	@FindBy(locator = "NFK.signupPage.clinicCode.btn")
	private QAFWebElement NFKSignupPageClinicCodeBtn;
	@FindBy(locator = "NFK.signupPage.checkBox.btn")
	private QAFWebElement NFKSignupPageCheckBoxBtn;
	@FindBy(locator = "NFK.signupPage.send.btn")
	private QAFWebElement NFKSignupPageSendBtn;

	// Safety Onboarding

	public QAFWebElement getNFKSafetyonboardingOnetouchLogo() {
		return NFKSafetyonboardingOnetouchLogo;
	}

	public QAFWebElement getNFKSafetyonboardingNextBtn() {
		return NFKSafetyonboardingNextBtn;
	}

	public QAFWebElement getNFKSafetyonboardingBloodmeterImage() {
		return NFKSafetyonboardingBloodmeterImage;
	}

	public QAFWebElement getNFKSafetyonboardingIUnderstandCheckbox() {
		return NFKSafetyonboardingIUnderstandCheckbox;
	}

	public QAFWebElement getNFKSafetyonboardingAreaOfCautionImage() {
		return NFKSafetyonboardingAreaOfCautionImage;
	}

	public QAFWebElement getNFKSafetyonboardingSupportedUOMImage() {
		return NFKSafetyonboardingSupportedUOMImage;
	}

	public QAFWebElement getNFKSafetyonboardingCurrentreadingImage() {
		return NFKSafetyonboardingCurrentreadingImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowRisingQuicklyImage() {
		return NFKSafetyonboardingTrendArrowRisingQuicklyImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowRisingImage() {
		return NFKSafetyonboardingTrendArrowRisingImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowRisingSlowlyImage() {
		return NFKSafetyonboardingTrendArrowRisingSlowlyImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowSteadyImage() {
		return NFKSafetyonboardingTrendArrowSteadyImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowFallingSlowlyImage() {
		return NFKSafetyonboardingTrendArrowFallingSlowlyImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowFallingImage() {
		return NFKSafetyonboardingTrendArrowFallingImage;
	}

	public QAFWebElement getNFKSafetyonboardingTrendArrowFallingQuicklyImage() {
		return NFKSafetyonboardingTrendArrowFallingQuicklyImage;
	}

	public QAFWebElement getNFKSafetyonboardingBackBtn() {
		return NFKSafetyonboardingBackBtn;
	}

	public QAFWebElement getNFKSafetyonboardingHighReadingImage() {
		return NFKSafetyonboardingHighReadingImage;
	}

	public QAFWebElement getNFKSafetyonboardingInRangeReadingImage() {
		return NFKSafetyonboardingInRangeReadingImage;
	}

	public QAFWebElement getNFKSafetyonboardingLowReadingImage() {
		return NFKSafetyonboardingLowReadingImage;
	}

	public QAFWebElement getNFKSafetyonboardingAlertImage() {
		return NFKSafetyonboardingAlertImage;
	}

	public QAFWebElement getNFKSafetyonboardingSmartphoneImage() {
		return NFKSafetyonboardingSmartphoneImage;
	}

	public QAFWebElement getNFKSafetyonboardingUrgentSoonContainerImage() {
		return NFKSafetyonboardingUrgentSoonContainerImage;
	}

	public QAFWebElement getNFKSafetyonboardingUrgentAlarmContainerImage() {
		return NFKSafetyonboardingUrgentAlarmContainerImage;
	}

	public QAFWebElement getNFKSafetyonboardingSettingBtn() {
		return NFKSafetyonboardingSettingBtn;
	}

	public QAFWebElement getNFKSafetyonboardingSettingSwitchBtn() {
		return NFKSafetyonboardingSettingSwitchBtn;
	}

	public QAFWebElement getNFKSafetyonboardingSettingAllowBtn() {
		return NFKSafetyonboardingSettingAllowBtn;
	}

	public QAFWebElement getNFKSafetyonboardingSettingDenyBtn() {
		return NFKSafetyonboardingSettingDenyBtn;
	}

	public QAFWebElement getNFKSafetyonboardingSettingBackBtn() {
		return NFKSafetyonboardingSettingBackBtn;
	}

	public QAFWebElement getNFKSafetyonboardingSecondscreenText() {
		return NFKSafetyonboardingSecondscreenText;
	}

	public QAFWebElement getNFKSafetyonboardingFourthscreenText() {
		return NFKSafetyonboardingFourthscreenText;
	}

	public QAFWebElement getNFKSafetyonboardingFifthscreenText() {
		return NFKSafetyonboardingFifthscreenText;
	}

	public QAFWebElement getNFKSafetyonboardingSeventhscreenTitle() {
		return NFKSafetyonboardingSeventhscreenTitle;
	}

	public QAFWebElement getNFKSafetyonboardingSeventhscreenText() {
		return NFKSafetyonboardingSeventhscreenText;
	}

	public QAFWebElement getNFKSafetyonboardingDNDPopupText() {
		return NFKSafetyonboardingDNDPopupText;
	}

	public QAFWebElement getNFKSafetyonboardingDNDPopupTitle() {
		return NFKSafetyonboardingDNDPopupTitle;
	}

	// Emancipation
	@FindBy(locator = "NFK.signup.emancipation.title")
	private QAFWebElement NFKSignupEmancipationTitle;

	public QAFWebElement getNFKSignupEmancipationTitle() {
		return NFKSignupEmancipationTitle;
	}

	public QAFWebElement getNFKSignuppageDobField1() {
		return NFKSignuppageDobField1;
	}

	public QAFWebElement getNFKSignuppageEmailexistPpopup() {
		return NFKSignuppageEmailexistPpopup;
	}

	public QAFWebElement getNFKSignuppageClinicInfoName() {
		return NFKSignuppageClinicInfoName;
	}

	public QAFWebElement getNFKSignuppageClinicInfoPhone() {
		return NFKSignuppageClinicInfoPhone;
	}

	public QAFWebElement getNFKSignuppageClinicInfoMsgrequest() {
		return NFKSignuppageClinicInfoMsgrequest;
	}

	public QAFWebElement getNFKSignuppageClinicInfoTikmark() {
		return NFKSignuppageClinicInfoTikmark;
	}

	public QAFWebElement getNFKSignuppageClinicInfoCloseBtn() {
		return NFKSignuppageClinicInfoCloseBtn;
	}

	public QAFWebElement getNFKSignupDependentpageTxt() {
		return NFKSignupDependentpageTxt;
	}

	public QAFWebElement getNFKSignuppageClinicName() {
		return NFKSignuppageClinicName;
	}

	public QAFWebElement getNFKSignuppageClinicPhone() {
		return NFKSignuppageClinicPhone;
	}

	public QAFWebElement getNFKSignuppageSafetySettingsBtn() {
		return NFKSignuppageSafetySettingsBtn;
	}

	public QAFWebElement getNFKDeviceSettingOnetouchTxt() {
		return NFKDeviceSettingOnetouchTxt;
	}

	public QAFWebElement getNFKDeviceSettingSwitchBtn() {
		return NFKDeviceSettingSwitchBtn;
	}

	public QAFWebElement getNFKDeviceSettingAllowBtn() {
		return NFKDeviceSettingAllowBtn;
	}

	public QAFWebElement getNFKSignupDependentClinicTxt() {
		return NFKSignupDependentClinicTxt;
	}

	public QAFWebElement getNFKSignupDependentGuardianFname() {
		return NFKSignupDependentGuardianFname;
	}

	public QAFWebElement getNFKSignupDependentGuardianLname() {

		return NFKSignupDependentGuardianLname;
	}

	public QAFWebElement getNFKSignupDependentEmailAddressTxt() {
		return NFKSignupDependentEmailAddressTxt;
	}

	public QAFWebElement getNFKSignupDependentConfemailaddressTxt() {
		return NFKSignupDependentConfemailaddressTxt;
	}

	public QAFWebElement getNFKSignupDependentPasswordTxt() {
		return NFKSignupDependentPasswordTxt;
	}

	public QAFWebElement getNFKSignupDependentConfpasswordTxt() {
		return NFKSignupDependentConfpasswordTxt;
	}

	public QAFWebElement getNFKSignupDependentCheckAgreementTermBtn() {
		return NFKSignupDependentCheckAgreementTermBtn;
	}

	public QAFWebElement getNFKSignupDependentCheckPromotionalOffersBtn() {
		return NFKSignupDependentCheckPromotionalOffersBtn;
	}

	public QAFWebElement getNFKrunAppInBackground() {
		return NFKrunAppInBackground;
	}

	public QAFWebElement getNFKSignuppageClinicInfoBtn() {
		return NFKSignuppageClinicInfoBtn;
	}

	public QAFWebElement getNFKSignuppageClinicCloseInfoBtn() {
		return NFKSignuppageClinicCloseInfoBtn;
	}

	public QAFWebElement getNFKSignupPageClinicSendBtn() {
		return NFKSignupPageClinicSendBtn;
	}

	public QAFWebElement getNFKSignupPageClinicPhonenumberLbl() {
		return NFKSignupPageClinicPhonenumberLbl;
	}

	public QAFWebElement getNFKHomepageHomeBtn() {
		return NFKHomepageHomeBtn;
	}

	public QAFWebElement getNFKSignupPageClinicNameLbl() {
		return NFKSignupPageClinicNameLbl;
	}

	public QAFWebElement getNFKApplysensorTitle() {
		return NFKApplysensorTitle;
	}

	public QAFWebElement getNFKSignupPageClinicConsentChkbox() {
		return NFKSignupPageClinicConsentChkbox;
	}

	public QAFWebElement getNFKSignupPageClinicTitleLbl() {
		return NFKSignupPageClinicTitleLbl;
	}

	public QAFWebElement getNFKSignupPagePickerDateLbl() {
		return NFKSignupPagePickerDateLbl;
	}

	public QAFWebElement getNFKSignuppageDobOkBtn() {
		return NFKSignuppageDobOkBtn;
	}

	public QAFWebElement getNFKSignupPagePickerMonthLbl() {
		return NFKSignupPagePickerMonthLbl;
	}

	public QAFWebElement getNFKSignuppageDobListYear() {
		return NFKSignuppageDobListYear;
	}

	public QAFWebElement getNFKSignupPagePickerYearLbl() {
		return NFKSignupPagePickerYearLbl;
	}

	public QAFWebElement getNFKSignupPageGenderMaleRadioBtn() {
		return NFKSignupPageGenderMaleRadioBtn;
	}

	public QAFWebElement getNFKSignupPageGenderFemaleRadioBtn() {
		return NFKSignupPageGenderFemaleRadioBtn;
	}

	public QAFWebElement getNFKSignupPageDiabetesType1RadioBtn() {
		return NFKSignupPageDiabetesType1RadioBtn;
	}

	public QAFWebElement getNFKSignupPageDiabetesType2RadioBtn() {
		return NFKSignupPageDiabetesType2RadioBtn;
	}

	public QAFWebElement getNFKSignupPageDiabetesGestationalRadioBtn() {
		return NFKSignupPageDiabetesGestationalRadioBtn;
	}

	public QAFWebElement getNFKSignuppageOptinCustomerServiceLink() {
		return NFKSignuppageOptinCustomerServiceLink;
	}

	public QAFWebElement getNFKSignuppageOptinCustomerServiceLinkNewEmailText() {
		return NFKSignuppageOptinCustomerServiceLinkNewEmailText;
	}

	public QAFWebElement getNFKSignuppageOptinTitleLbl() {
		return NFKSignuppageOptinTitleLbl;
	}

	public QAFWebElement getNFKSignuppageUpdatenoticeContinueBtn() {
		return NFKSignuppageUpdatenoticeContinueBtn;
	}

	public QAFWebElement getNFKSignuppageUpdatenoticeChckBtn() {
		return NFKSignuppageUpdatenoticeChckBtn;
	}

	public QAFWebElement getNFKSignuppageOptinPrivecyNFKLbl() {
		return NFKSignuppageOptinPrivecyNFKLbl;
	}

	public QAFWebElement getNFKSignuppageTouchIDBtn() {
		return NFKSignuppageTouchIDBtn;
	}

	public QAFWebElement getNFKApplysensorSkipBtn() {
		return NFKApplysensorSkipBtn;
	}

	public QAFWebElement getNFKHcpsignuppageResetpasswordLbl() {
		return NFKHcpsignuppageResetpasswordLbl;
	}

	public QAFWebElement getNFKSignupPageCalendarYearBtn() {
		return NFKSignupPageCalendarYearBtn;
	}

	public QAFWebElement getNFKSignupPageCalendarNextBtn() {
		return NFKSignupPageCalendarNextBtn;
	}

	public QAFWebElement getNFKSignupPageCalendarPreviousBtn() {
		return NFKSignupPageCalendarPreviousBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKsignuppageemailtxt() {
		return NFKSignuppageEmailTxt;
	}

	public QAFWebElement getNFKsignuppageconfirmemailtxt() {
		return NFKSignuppageConfirmemailTxt;
	}

	public QAFWebElement getNFKsignuppagepasswordtxt() {
		return NFKSignuppagePasswordTxt;
	}

	public QAFWebElement getNFKsignuppagesignupbtn() {
		return NFKSignuppageSignupBtn;
	}

	public QAFWebElement getNFKsignuppagetermofservicecheckbox() {
		return NFKSignuppageTermofserviceCheckBox;
	}

	public QAFWebElement getNFKsignuppageonetouchlogo() {
		return NFKSignuppageOnetouchLogo;
	}

	public QAFWebElement getNFKsignuppagebackbtn() {
		return NFKSignuppageBackBtn;
	}

	public QAFWebElement getNFKsignuppageloginlnk() {
		return NFKSignuppageLoginLnk;
	}

	public QAFWebElement getNFKsignuppagetermofservicelnk() {
		return NFKSignuppageTermofserviceLnk;
	}

	public QAFWebElement getNFKsignuppageskipbtn() {
		return NFKSignuppageSkipBtn;
	}

	// next button safety onboarding
	public QAFWebElement getNFKsignuppagesafetynextbtn() {
		return NFKSignuppageSafetyNextBtn;
	}

	public QAFWebElement getNFKSignuppageSafetyIunstdCheckBox() {
		return NFKSignuppageSafetyIunstdCheckBox;
	}

	public QAFWebElement getNFKsignuppagesafetydonebtn() {
		return NFKSignuppageSafetyDoneBtn;
	}

	public QAFWebElement getNFKSignuppageSafetyAllowBtn() {
		return NFKSignuppageSafetyAllowBtn;
	}

	public QAFWebElement getNFKSignuppageSensorSkipBtn() {
		return NFKSignuppageSensorSkipBtn;
	}

	public QAFWebElement getNFKsignuppageimportantmessagetxt() {
		return NFKSignuppageImportantmessageTxt;
	}

	public QAFWebElement getNFKsignuppageimportantmessageokbtn() {
		return NFKSignuppageImportantmessageokBtn;
	}

	public QAFWebElement getNFKsignuppagecontinuebuttonbtn() {
		return NFKSignuppageContinuebuttonBtn;
	}

	public QAFWebElement getNFKsignuppagetermsofusetxt() {
		return NFKSignuppageTermsofuseTxt;
	}

	public QAFWebElement getNFKsignuppagetermsandprivecytxt() {
		return NFKSignuppageTermsandprivecyTxt;
	}

	public QAFWebElement getNFKsignuppagefirstnametxt() {
		return NFKSignuppageFirstnameTxt;
	}

	public QAFWebElement getNFKsignuppagelastnametxt() {
		return NFKSignuppageLastnameTxt;
	}

	public QAFWebElement getNFKSignuppageDobTxt() {
		return NFKSignuppageDobTxt;
	}

	public QAFWebElement getNFKSignupPageConfirmPasswordTxt() {
		return NFKSignupPageConfirmPasswordTxt;
	}

	public QAFWebElement getNFKSignuppageCliniccodeTxt() {
		return NFKSignuppageCliniccodeTxt;
	}

	public QAFWebElement getNFKsignuppagepromotionalcodechkbox() {
		return NFKSignuppagePromotionalcodeChkbox;
	}

	public QAFWebElement getNFKsignuppagekeepmeloggedinchkbox() {
		return NFKSignuppageKeepmeloggedinChkbox;
	}

	public QAFWebElement getNFKSignuppageTimeStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.signuppage.dynamic.txt", text);
	}

	public QAFWebElement getNFKSignuppageDynamicTxt() {
		return NFKSignuppageDynamicTxt;
	}

	public QAFWebElement getNFKSignuppageIagreeBtn() {
		return NFKSignuppageIagreeBtn;
	}

	public QAFWebElement getNFKEmailValidationErrorMsg() {
		return NFKEmailValidationErrorMsg;
	}

	public QAFWebElement getNFKConfirmEmailValidationErrorMsg() {
		return NFKConfirmEmailValidationErrorMsg;
	}

	public QAFWebElement getNFKPasswordValidationErrorMsg() {
		return NFKPasswordValidationErrorMsg;
	}

	public QAFWebElement getNFKSignuppageClinicCodeTxt() {
		return NFKSignuppageClinicCodeTxt;
	}

	public QAFWebElement getNFKSignuppageFirstNameErrorTxt() {
		return NFKSignuppageFirstNameErrorTxt;
	}

	public QAFWebElement getNFKSignuppageLastNameErrorTxt() {
		return NFKSignuppageLastNameErrorTxt;
	}

	public List<QAFWebElement> getNFKSignuppageWelcomepageNavigationTitleTxt() {
		return NFKSignuppageWelcomepageNavigationTitleTxt;
	}

	public List<QAFWebElement> getNFKSignuppageWelcomepageNavigationBtn() {
		return NFKSignuppageWelcomepageNavigationBtn;
	}

	public QAFWebElement getNFKValidationErrorIcon() {
		return NFKValidationErrorIcon;
	}

	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFK.signuppage.dynamic.txt")
	private QAFWebElement NFKSignuppageDynamicTxt;
	@FindBy(locator = "NFK.signuppage.iagree.btn")
	private QAFWebElement NFKSignuppageIagreeBtn;
	@FindBy(locator = "NFK.hcpsignuppage.resetpassword.lbl")
	private QAFWebElement NFKHcpsignuppageResetpasswordLbl;
	@FindBy(locator = "NFK.germansignuppage.uomselect.mgdl.btn")
	private QAFWebElement NFKGermansignuppageUomselectMgdlBtn;
	@FindBy(locator = "NFK.germansignuppage.uomselect.mmol.btn")
	private QAFWebElement NFKGermansignuppageUomselectMmolBtn;
	@FindBy(locator = "NFK.signuppage.welcomepage.navigation.btn")
	private List<QAFWebElement> NFKSignuppageWelcomepageNavigationBtn;
	@FindBy(locator = "NFK.signuppage.welcomepage.navigation.title.txt")
	private List<QAFWebElement> NFKSignuppageWelcomepageNavigationTitleTxt;
	@FindBy(locator = "NFK.signup.page.UOM.select.title")
	private QAFWebElement NFKsignuppageUomselecttitle;
	@FindBy(locator = "NFK.signup.page.UOM.select.text")
	private QAFWebElement NFKsignuppageUomselecttext;
	@FindBy(locator = "NFK.signup.page.UOM.select.mgdl.button.text")
	private QAFWebElement NFKsignuppageUomselectMgdlbuttontext;
	@FindBy(locator = "NFK.signup.page.UOM.select.mgdl.button")
	private QAFWebElement NFKsignuppageUomselectMgdlbutton;
	@FindBy(locator = "NFK.signup.page.UOM.select.mmol.button.text")
	private QAFWebElement NFKsignuppageUomselectMmolbuttontext;
	@FindBy(locator = "NFK.signup.page.UOM.select.mmol.button")
	private QAFWebElement NFKsignuppageUomselectMmolbutton;

	public QAFWebElement getNFKsignuppageUomselectMmolbutton() {
		return NFKsignuppageUomselectMmolbutton;
	}

	public QAFWebElement getNFKSignuppageBackBtn() {
		return NFKSignuppageBackBtn;
	}

	public QAFWebElement getNFKSignupPageAgeRestrictionPopupCancelButton() {
		return NFKSignupPageAgeRestrictionPopupCancelButton;
	}

	public QAFWebElement getNFKSignuppageAgeRestrictionPopupSignupdependentButton() {
		return NFKSignuppageAgeRestrictionPopupSignupdependentButton;
	}

	public QAFWebElement getNFKSignuppageAgeRestrictionPopup() {
		return NFKSignuppageAgeRestrictionPopup;
	}

	public QAFWebElement getNFKsignuppageUomselectMmolbuttontext() {
		return NFKsignuppageUomselectMmolbuttontext;
	}

	public QAFWebElement getNFKsignuppageUomselectMgdlbutton() {
		return NFKsignuppageUomselectMgdlbutton;
	}

	public QAFWebElement getNFKsignuppageUomselectMgdlbuttontext() {
		return NFKsignuppageUomselectMgdlbuttontext;
	}

	public QAFWebElement getNFKsignuppageUomselecttext() {
		return NFKsignuppageUomselecttext;
	}

	public QAFWebElement getNFKsignuppageUomselecttitle() {
		return NFKsignuppageUomselecttitle;
	}

	public QAFWebElement getNFKGermansignuppageUomselectMgdlBtn() {
		return NFKGermansignuppageUomselectMgdlBtn;
	}

	public QAFWebElement getNFKGermansignuppageUomselectMmolBtn() {
		return NFKGermansignuppageUomselectMmolBtn;
	}

	public QAFWebElement getNFKSignupPageDateOfBirthTxt() {
		return NFKSignupPageDateOfBirthTxt;
	}

	public QAFWebElement getNFKSignupPageGreenLinkTxt() {
		return NFKSignupPageGreenLinkTxt;
	}

	public QAFWebElement getNFKSignupPageGreenLinkBtn() {
		return NFKSignupPageGreenLinkBtn;
	}

	public QAFWebElement getNFKSignupPageCancelBtn() {
		return NFKSignupPageCancelBtn;
	}

	public QAFWebElement getNFKSignupPagePrivacyPolicyTxt() {
		return NFKSignupPagePrivacyPolicyTxt;
	}

	public QAFWebElement getNFKSignupPagePrivacyPolicyBackBtn() {
		return NFKSignupPagePrivacyPolicyBackBtn;
	}

	public QAFWebElement getNFKSignupPageClinicCodeTextBtn() {
		return NFKSignupPageClinicCodeTextBtn;
	}

	public QAFWebElement getNFKSignupPageClinicCodeBtn() {
		return NFKSignupPageClinicCodeBtn;
	}

	public QAFWebElement getNFKSignupPageCheckBoxBtn() {
		return NFKSignupPageCheckBoxBtn;
	}

	public QAFWebElement getNFKSignupPageSendBtn() {
		return NFKSignupPageSendBtn;
	}

	// Bluetooth Settings
	@FindBy(locator = "NFK.system.settings.conectedDevice")
	private QAFWebElement NFKSystemSettingsConectedDevice;

	@FindBy(locator = "NFK.system.settings.conectedPref")
	private QAFWebElement NFKSystemSettingsConectedPref;

	@FindBy(locator = "NFK.system.settings.Bluetooth")
	private QAFWebElement NFKSystemSettingsBluetooth;

	@FindBy(locator = "NFK.system.settings.Bluetooth.switch")
	private QAFWebElement NFKSystemSettingsluetoothSwitch;

	@FindBy(locator = "NFK.signuppage.sensor.next.btn")
	private static QAFWebElement NFKSignuppageSensorNextBtn;

	@FindBy(locator = "NFK.signuppage.sensor.location.permission.txt")
	private static QAFWebElement NFKSignuppageSensorLocationPermissionTxt;

	@FindBy(locator = "NFK.signuppage.sensor.location.permission.allowtime")
	private static QAFWebElement NFKSignuppageSensorLocationPermissionAllowtime;

	@FindBy(locator = "NFK.signuppage.sensor.location.permission.deny")
	private static QAFWebElement NFKSignuppageSensorLocationPermissionDeny;

	@FindBy(locator = "NFK.signuppage.sensor.bluetooth.txt")
	private static QAFWebElement NFKSignuppageSensorBluetoothTxt;

	@FindBy(locator = "NFK.signuppage.applySensor.btn")
	private QAFWebElement NFKSignuppageApplySensorBtn;
	@FindBy(locator = "NFK.signuppage.sensorWear.btn")
	private QAFWebElement NFKSignuppageSensorWearBtn;
	@FindBy(locator = "NFK.signuppage.helpfulTips.btn")
	private QAFWebElement NFKSignuppageHelpfulTipsBtn;
	@FindBy(locator = "NFK.signuppage.backUpperArm.btn")
	private QAFWebElement NFKSignuppageBackUpperArmBtn;
	@FindBy(locator = "NFK.signuppage.washAndDryHand.btn")
	private QAFWebElement NFKSignuppageWashAndDryHandBtn;
	@FindBy(locator = "NFK.signuppage.removePaperBacking.btn")
	private QAFWebElement NFKSignuppageRemovePaperBackingBtn;
	@FindBy(locator = "NFK.signuppage.adhesivePatch.btn")
	private QAFWebElement NFKSignuppageAdhesivePatchBtn;
	@FindBy(locator = "NFK.signuppage.rightAbdomenButton.btn")
	private QAFWebElement NFKSignuppageRightAbdomenButtonBtn;
	@FindBy(locator = "NFK.signuppage.leftAbdomenButton.btn")
	private QAFWebElement NFKSignuppageLeftAbdomenButtonBtn;
	@FindBy(locator = "NFK.signuppage.leftArm.btn")
	private QAFWebElement NFKSignuppageLeftArmBtn;
	@FindBy(locator = "NFK.signuppage.rightArm.lnk")
	private QAFWebElement NFKSignuppageRightArmLnk;
	@FindBy(locator = "NFK.signuppage.urgentLowText.btn")
	private QAFWebElement NFKSignuppageUrgentLowTextBtn;
	@FindBy(locator = "NFK.signuppage.applySensor.txt")
	private QAFWebElement NFKSignuppageApplySensorTxt;
	@FindBy(locator = "NFK.signuppage.helpfulTipsText.btn")
	private QAFWebElement NFKSignuppageHelpfulTipsTextBtn;
	@FindBy(locator = "NFK.signuppage.helpfulTipsCross.btn")
	private QAFWebElement NFKSignuppageHelpfulTipsCrossBtn;
	@FindBy(locator = "NFK.signuppage.helpfulTipsPair.btn")
	private QAFWebElement NFKSignuppageHelpfulTipsPairBtn;
	@FindBy(locator = "NFK.signuppage.whileUsingTheApp.txt")
	private QAFWebElement NFKSignuppageWhileUsingTheAppTxt;

	@FindBy(locator = "NFK.signuppage.sensorApplication.btn")
	private QAFWebElement NFKSignuppageSensorApplicationBtn;
	@FindBy(locator = "NFK.signuppage.howToApplyInHelpMenu.btn")
	private QAFWebElement NFKSignuppageHowToApplyInHelpMenuBtn;
	@FindBy(locator = "NFK.signuppage.healthcareInstructions.btn")
	private QAFWebElement NFKSignuppageHealthcareInstructionsBtn;
	@FindBy(locator = "NFK.signuppage.pairSensorHomeScreen.btn")
	private QAFWebElement NFKSignuppagePairSensorHomeScreenBtn;
	@FindBy(locator = "NFK.signuppage.helpfulTipsBelow6Year.lnk")
	private QAFWebElement NFKSignuppageHelpfulTipsBelow6YearLnk;
	@FindBy(locator = "NFK.signuppage.footerLabel.txt")
	private QAFWebElement NFKSignuppageFooterLabelTxt;

	@FindBy(locator = "NFK.signuppage.done.btn")
	private QAFWebElement NFKSignuppageDoneBtn;
	@FindBy(locator = "NFK.signuppage.cancelBelow6Year.btn")
	private QAFWebElement NFKSignuppageCancelBelow6YearBtn;
	@FindBy(locator = "NFK.signuppage.nextBelow6Year.btn")
	private QAFWebElement NFKSignuppageNextBelow6YearBtn;
	@FindBy(locator = "NFK.signuppage.important.popop")
	private QAFWebElement NFKSignuppageImportantPopop;

	public static QAFWebElement getNFKSignuppageSensorBluetoothTxt() {
		return NFKSignuppageSensorBluetoothTxt;
	}

	public static QAFWebElement getNFKSignuppageSensorLocationPermissionDeny() {
		return NFKSignuppageSensorLocationPermissionDeny;
	}

	public static QAFWebElement getNFKSignuppageSensorLocationPermissionAllowtime() {
		return NFKSignuppageSensorLocationPermissionAllowtime;
	}

	public static QAFWebElement getNFKSignuppageSensorLocationPermissionTxt() {
		return NFKSignuppageSensorLocationPermissionTxt;
	}

	public static QAFWebElement getNFKSignuppageSensorNextBtn() {
		return NFKSignuppageSensorNextBtn;
	}

	public QAFWebElement getNFKSystemSettingsConectedDevice() {
		return NFKSystemSettingsConectedDevice;
	}

	public QAFWebElement getNFKSystemSettingsConectedPref() {
		return NFKSystemSettingsConectedPref;
	}

	public QAFWebElement getNFKSystemSettingsBluetooth() {
		return NFKSystemSettingsBluetooth;
	}

	public QAFWebElement getNFKSystemSettingsluetoothSwitch() {
		return NFKSystemSettingsluetoothSwitch;
	}

	public QAFWebElement getNFKSignuppageApplySensorBtn() {
		return NFKSignuppageApplySensorBtn;
	}

	public QAFWebElement getNFKSignuppageSensorWearBtn() {
		return NFKSignuppageSensorWearBtn;
	}

	public QAFWebElement getNFKSignuppageHelpfulTipsBtn() {
		return NFKSignuppageHelpfulTipsBtn;
	}

	public QAFWebElement getNFKSignuppageBackUpperArmBtn() {
		return NFKSignuppageBackUpperArmBtn;
	}

	public QAFWebElement getNFKSignuppageWashAndDryHandBtn() {
		return NFKSignuppageWashAndDryHandBtn;
	}

	public QAFWebElement getNFKSignuppageRemovePaperBackingBtn() {
		return NFKSignuppageRemovePaperBackingBtn;
	}

	public QAFWebElement getNFKSignuppageAdhesivePatchBtn() {
		return NFKSignuppageAdhesivePatchBtn;
	}

	public QAFWebElement getNFKSignuppageRightAbdomenButtonBtn() {
		return NFKSignuppageRightAbdomenButtonBtn;
	}

	public QAFWebElement getNFKSignuppageLeftAbdomenButtonBtn() {
		return NFKSignuppageLeftAbdomenButtonBtn;
	}

	public QAFWebElement getNFKSignuppageLeftArmBtn() {
		return NFKSignuppageLeftArmBtn;
	}

	public QAFWebElement getNFKSignuppageRightArmLnk() {
		return NFKSignuppageRightArmLnk;
	}

	public QAFWebElement getNFKSignuppageUrgentLowTextBtn() {
		return NFKSignuppageUrgentLowTextBtn;
	}

	public QAFWebElement getNFKSignuppageApplySensorTxt() {
		return NFKSignuppageApplySensorTxt;
	}

	public QAFWebElement getNFKSignuppageHelpfulTipsTextBtn() {
		return NFKSignuppageHelpfulTipsTextBtn;
	}

	public QAFWebElement getNFKSignuppageHelpfulTipsCrossBtn() {
		return NFKSignuppageHelpfulTipsCrossBtn;
	}

	public QAFWebElement getNFKSignuppageHelpfulTipsPairBtn() {
		return NFKSignuppageHelpfulTipsPairBtn;
	}

	public QAFWebElement getNFKSignuppageWhileUsingTheAppTxt() {
		return NFKSignuppageWhileUsingTheAppTxt;
	}

	public QAFWebElement getNFKSignuppageDoneBtn() {
		return NFKSignuppageDoneBtn;
	}

	public QAFWebElement getNFKSignuppageCancelBelow6YearBtn() {
		return NFKSignuppageCancelBelow6YearBtn;
	}

	public QAFWebElement getNFKSignuppageNextBelow6YearBtn() {
		return NFKSignuppageNextBelow6YearBtn;
	}

	public QAFWebElement getNFKSignuppageImportantPopop() {
		return NFKSignuppageImportantPopop;
	}

	public QAFWebElement getNFKSignuppageSensorApplicationBtn() {
		return NFKSignuppageSensorApplicationBtn;
	}

	public QAFWebElement getNFKSignuppageHowToApplyInHelpMenuBtn() {
		return NFKSignuppageHowToApplyInHelpMenuBtn;
	}

	public QAFWebElement getNFKSignuppageHealthcareInstructionsBtn() {
		return NFKSignuppageHealthcareInstructionsBtn;
	}

	public QAFWebElement getNFKSignuppagePairSensorHomeScreenBtn() {
		return NFKSignuppagePairSensorHomeScreenBtn;
	}

	public QAFWebElement getNFKSignuppageHelpfulTipsBelow6YearLnk() {
		return NFKSignuppageHelpfulTipsBelow6YearLnk;
	}

	public QAFWebElement getNFKSignuppageFooterLabelTxt() {
		return NFKSignuppageFooterLabelTxt;
	}

	HomePageAndroid homePage = new HomePageAndroid();
	LoginPageAndroid android = new LoginPageAndroid();
	@FindBy(locator = "NFK.signupPage.optin.customer.service.link.redirects.compose.txt")
	private QAFWebElement NFKSignuppageOptinCustomerServiceLinkRedirectsComposeTxt;
	@FindBy(locator = "NFK.signuppage.welcomepage.skip.btn")
	private QAFWebElement NFKSignuppageWelcomepageSkipBtn;
	@FindBy(locator = "NFK.signuppage.welcomepage.yes.btn")
	private QAFWebElement NFKSignuppageWelcomepageYesBtn;

	public static String email;
	public static String email1 = "testt" + RandomStringUtils.randomAlphabetic(5) + "@mailinator.com";

	public AndroidDriver getDriver() {
		return androidDriver;
	}

	// Method to click Sign Up button
	public void clickSignUpButton() {
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
		Reporter.logWithScreenShot("The user clicked on signup button", MessageTypes.Pass);
	}

	// Method to click on skip button
	public void clickSkipBtn() {
		getNFKsignuppageskipbtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKsignuppageskipbtn());
		try {

			if (getNFKSignuppageTimeStaticText(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
					.isDisplayed()) {
				Reporter.logWithScreenShot("Unit of measurement selection page is displayed", MessageTypes.Pass);
				getNFKGermansignuppageUomselectMgdlBtn().waitForPresent();
				LFSUtilsAndroid.click(getNFKGermansignuppageUomselectMgdlBtn());
			} else {
				Reporter.logWithScreenShot("Unit of measurement selection page is not displayed", MessageTypes.Pass);
			}
		} catch (Exception e) {

		}
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageWelcomepageSkipBtn().verifyPresent("Welcome Page is displayed");
		LFSUtilsAndroid.click(getNFKSignuppageWelcomepageSkipBtn());
		getNFKSignuppageWelcomepageYesBtn().verifyPresent("Ready to See OneTouchReveal Page is displayed");
		LFSUtilsAndroid.click(getNFKSignuppageWelcomepageYesBtn());
		selectUOM("mmol/L");
		homePage.getNFKHomepageShareBtn().waitForPresent();
	}

	public void safetyOnboardingScreen() {
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.first"))
				.waitForPresent();
		try {
			if (getNFKSignuppageTimeStaticText(
					ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).isDisplayed()) {

				for (int i = 0; i < 10; i++) {
					Reporter.logWithScreenShot("Safety Onboarding screen " + i, MessageTypes.Pass);
					if (getNFKsignuppagesafetydonebtn().isPresent()) {
						LFSUtilsAndroid.click(getNFKsignuppagesafetydonebtn());
					} else if (getNFKSignuppageSafetyIunstdCheckBox().isDisplayed()) {
						LFSUtilsAndroid.click(getNFKSignuppageSafetyIunstdCheckBox());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to complete safety onboarding screen", MessageTypes.Pass);
		}

	}

	public void findAppname(String text) {
		boolean flag = true;
		int count = 1;
		while (flag) {
			try {
				Map<String, Object> params = new HashMap<>();
				params.put("content", text);
				String res = (String) driver.executeScript("mobile:touch:swipe", params);
				if (res.equals("true")) {
					flag = false;
					break;
				} else
					throw new Exception();
			} catch (Exception NoSuchElementException) {
				count = count + 1;
				Map<String, Object> params = new HashMap<>();
				params.put("start", "40%,90%");
				params.put("end", "40%,20%");
				params.put("duration", "2");
				Object res = driver.executeScript("mobile:touch:swipe", params);
				if (count == 5) {
					break;
				}
			}
		}
	}

//	public void setSettingsDND() {
//        LFSUtilsAndroid.waitforLoad();
//        LFSUtilsAndroid.click(getNFKSignuppageSafetySettingsBtn());
//        try {
//        	LFSUtilsAndroid.swipePage();
//			findAppname("OneTouch 24/7 MaxVue™");
//				if(getNFKSignuppageTimeStaticText("OneTouch 24/7 MaxVue™").isPresent()) {
//					getNFKSignuppageTimeStaticText("OneTouch 24/7 MaxVue™").click();
//				}
////            findAppname("OneTouch 24/7 MaxVue™");
////            if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("onetouch.txt")).isPresent()) {
////                getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("onetouch.txt"))
////                        .assertPresent("Text One touch 24/7");
////                LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("onetouch.txt")));
////            } else {
////                LFSUtilsAndroid.clickWithText("OneTouch 24/7 MaxVue™");
////            }
//            try {
//                if (getNFKDeviceSettingAllowBtn().isDisplayed()) {
//                    LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
//                    LFSUtilsAndroid.clickBackButton();
//                } else {
//                    if (getNFKDeviceSettingSwitchBtn().isDisplayed()) {
//                        getNFKDeviceSettingSwitchBtn().assertPresent("Switch button");
//                        LFSUtilsAndroid.click(getNFKDeviceSettingSwitchBtn());
//                        LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
//                        getNFKSignuppageTimeStaticText("Back").click();
//                        LFSUtilsAndroid.clickBackButton();
//                        LFSUtilsAndroid.clickBackButton();
//                    }
//                }
//            } catch (NoSuchElementException e) {
//                throw new RuntimeException("Unable to click on Switch ");
//            }
//        } catch (Exception e) {
//            LFSUtilsAndroid.click(getNFKDeviceSettingSwitchBtn());
//            LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
//            LFSUtilsAndroid.clickBackButton();
//        }
//        Reporter.logWithScreenShot("Sucessfully completed safety onboarding screen", MessageTypes.Pass);
//    }
	
	public void setSettingsDND() {
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.click(getNFKSignuppageSafetySettingsBtn());
		try {
			LFSUtilsAndroid.swipePage();
			//	findAppname("OneTouch 24/7 MaxVue™");
				if(getNFKSignuppageTimeStaticText("OneTouch 24/7 MaxVue™").isPresent()) {
					getNFKSignuppageTimeStaticText("OneTouch 24/7 MaxVue™").click();
				} else {
				LFSUtilsAndroid.clickWithText("OneTouch 24/7 MaxVue™");
			}
			try {
				if (getNFKDeviceSettingAllowBtn().isDisplayed()) {
					LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
					LFSUtilsAndroid.clickBackButton();
				} else {
					if (getNFKDeviceSettingSwitchBtn().isDisplayed()) {
						getNFKDeviceSettingSwitchBtn().assertPresent("Switch button");
						LFSUtilsAndroid.click(getNFKDeviceSettingSwitchBtn());
						LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
						LFSUtilsAndroid.clickBackButton();
						LFSUtilsAndroid.clickBackButton();
					}
				}
			} catch (NoSuchElementException e) {
				throw new RuntimeException("Unable to click on Switch ");
			}
		} catch (Exception e) {
			LFSUtilsAndroid.click(getNFKDeviceSettingSwitchBtn());
			LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
			LFSUtilsAndroid.clickBackButton();
		}
		Reporter.logWithScreenShot("Sucessfully completed safety onboarding screen", MessageTypes.Pass);
	}

	// Method to select UOM for German user
	public void selectUOM(String option) {
		try {
			if (getNFKSignuppageTimeStaticText(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
					.isDisplayed()) {
				Reporter.logWithScreenShot("Unit of measurement selection page for Users", MessageTypes.Pass);
				String uom = option.toLowerCase();
				switch (uom) {
				case "mg/dl":

					LFSUtilsAndroid.click(getNFKsignuppageUomselectMgdlbutton());
					break;

				case "mmol/l":

					LFSUtilsAndroid.click(getNFKsignuppageUomselectMmolbutton());
					break;
				}
			} else
				Reporter.logWithScreenShot("UOM is already selected", MessageTypes.Pass);
		} catch (Exception e) {

			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to select UOM", MessageTypes.Fail);
		}
	}

//Verify UOM screen 

	public void verifyUOMscreen() {
		try {
			getNFKsignuppageUomselecttitle().isPresent();
			getNFKsignuppageUomselectMgdlbuttontext().isPresent();
			getNFKsignuppageUomselectMgdlbutton().isPresent();
			getNFKsignuppageUomselectMmolbuttontext().isPresent();
			getNFKsignuppageUomselectMmolbutton().isPresent();
			Reporter.logWithScreenShot("Sucessfully verified UOM Screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify UOM Screen", MessageTypes.Fail);
		}
	}

	// Method to click TOU and PP link from SignUp page
	public void clickTerms(String option) {
		int fingers = 1;
		int duration = 1;
		LFSUtilsAndroid.swipeWithScreenPercent(50, 75, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();

		Point p1 = getNFKsignuppagetermsandprivecytxt().getLocation();
		Dimension d1 = getNFKsignuppagetermsandprivecytxt().getSize();

		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int startX = p1.getX();
		int startY = p1.getY();
		int endX = startX + d1.getWidth();
		int endy = startY + d1.getHeight();
		int perline = d1.getHeight() / 2;
		int middleX = startX + (d1.getWidth()) / 2;
		int middley = startY + (d1.getHeight()) / 2;

		option = option.toLowerCase();
		switch (option) {
		case "terms of use":
			tch.tap(point(middleX + 100, middley)).perform();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.terms"))
					.verifyPresent("Term of use title");
			getNFKsignuppagetermsofusetxt().waitForPresent();
			Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 4 is Displayed", MessageTypes.Pass);

			break;
		case "privacy policy":
			tch.tap(point(startX + 200, startY + 5 + perline)).perform();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.privacy"))
					.verifyPresent("Term of use title");
			getNFKsignuppagetermsofusetxt().waitForPresent();
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
			break;
		}

		LFSUtilsAndroid.clickBackButton();
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		getNFKsignuppagetermofservicecheckbox().verifyPresent("After clicking back button,Signup screen is displayed");

	}

	// Method to select Birthdate of User
	public void selectBirthDate(UserDetailBeans userDetails) {
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			Reporter.log("valid date");
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("sl-sl")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("pl-pl")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("cz-cz")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("fr-fr")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("en-ph")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else if (pageProps.getString("language.name").equalsIgnoreCase("vi-vi")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} else {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		}
	}

	// Method to select Birthdate of User
	public void selectBirthDateBelowAge(UserDetailBeans userDetails) {
		if (getNFKSignupPageCalendarYearBtn().isDisplayed())
			LFSUtilsAndroid.click(getNFKSignupPageCalendarYearBtn());
		getNFKSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getNFKSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getNFKSignuppageTimeStaticText(userDetails.getBirthdayYear()).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(startX + 10, startY - 300, startX + 10, startY, 500);
		}
		LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText(userDetails.getBirthdayYear()));
		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "01");
		monthmap.put("Feb", "02");
		monthmap.put("Mar", "03");
		monthmap.put("Apr", "04");
		monthmap.put("May", "05");
		monthmap.put("Jun", "06");
		monthmap.put("Jul", "07");
		monthmap.put("Aug", "08");
		monthmap.put("Sep", "09");
		monthmap.put("Oct", "10");
		monthmap.put("Nov", "11");
		monthmap.put("Dec", "12");

		DateFormat df = new SimpleDateFormat("MM");
		Date dateobj = new Date();

		int curMonth = Integer.parseInt(df.format(dateobj));
		int birthMonth = Integer.parseInt(monthmap.get("Feb"));
		try {
			if (birthMonth > curMonth) {
				int count = birthMonth - curMonth;
				while (count != 0) {

					LFSUtilsAndroid.click(getNFKSignupPageCalendarNextBtn());
					count--;
				}
			} else if (curMonth > birthMonth) {
				int count = curMonth - birthMonth;

				while (count != 0) {
					LFSUtilsAndroid.click(getNFKSignupPageCalendarPreviousBtn());
					count--;
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText(userDetails.getBirthdayDate()));
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		LFSUtilsAndroid.click(getNFKsignuppageonetouchlogo());
		Reporter.logWithScreenShot("Error message for date less than 18 years", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		LFSUtilsAndroid.waitforLoad();
	}

	// Method to fill registration details for New User
	public void fillSignUpDetails(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		if (userDetails instanceof String) {
			userBean.fillFromConfig(userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		LFSUtilsAndroid.enterText(getNFKsignuppageemailtxt(), email);
		ConfigurationManager.getBundle().setProperty("register.email.key", email);
		LFSUtilsAndroid.enterText(getNFKsignuppageconfirmemailtxt(), email);
		LFSUtilsAndroid.enterText(getNFKsignuppagepasswordtxt(), userBean.getPassword());
		ConfigurationManager.getBundle().setProperty("register.pass", userBean.getPassword());
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.enterText(getNFKSignupPageConfirmPasswordTxt(), userBean.getPassword());
		androidDriver.pressKeyCode(4);
		ConfigurationManager.getBundle().setProperty("register.password.key", userBean.getPassword());
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());

		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
	}

	public void enterYear() {
		driver.findElement(By.xpath(
				"//*[@resource-id=\"android:id/pickers\"]/android.widget.NumberPicker[3]/android.widget.EditText"))
				.click();
		Actions action = new Actions(driver);

		int year = Integer.parseInt(driver.findElement(By.xpath(
				"//*[@resource-id=\"android:id/pickers\"]/android.widget.NumberPicker[3]/android.widget.EditText"))
				.getText());
		int regyear = year - 18;
		action.sendKeys(Integer.toString(regyear)).perform();
		LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@resource-id=\"android:id/button1\"]")));
	}

	// Method to fill Signup details with First name field as blank
	public void selectDOB(UserDetailBeans userBean) {
		getNFKSignupPagePickerDateLbl().waitForPresent();
		getNFKSignupPagePickerYearLbl().isPresent();
		LFSUtilsAndroid.click(getNFKSignupPagePickerYearLbl());
		LFSUtilsAndroid.scrollToEleAndriodDOB(userBean.getBirthdayYear());
		LFSUtilsAndroid.clickWithText(userBean.getBirthdayYear());
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());

	}

	// Gunther 0/6 update
	public void doSignUpWithoutFirstName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("The signup screen before filling details", MessageTypes.Pass);
		getNFKsignuppagefirstnametxt().clear();
		getNFKsignuppagelastnametxt().clear();
		getNFKsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("Signup screen after filling last name", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKSignupPageGenderMaleRadioBtn());
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKSignupPageDiabetesType1RadioBtn());
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("The first name field is not blank", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("The first name field is blank", MessageTypes.Pass);
		}

	}

	// Method to fill Signup details with Last name field as blank
	public void doSignUpWithoutLastName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getNFKsignuppagefirstnametxt().clear();
		getNFKsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getNFKsignuppagelastnametxt().clear();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKSignupPageGenderMaleRadioBtn());
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKSignupPageDiabetesType1RadioBtn());
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("Last Name field is not blank", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Last Name field is blank", MessageTypes.Fail);
		}

	}

	// Method to fill Signup details with Birthdate below age
	public void doSignUpWithDateBelowAge(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling last name", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		Reporter.logWithScreenShot("Calendar is displayed", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		getNFKsignuppageimportantmessageokbtn().waitForPresent();
		Reporter.logWithScreenShot("Error message with Birthdate field below age", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
	}

	// Method to fill Signup details without Birthdate
	public void fillDetailsWithoutBirthday(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Complete form", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageonetouchlogo());
		LFSUtilsAndroid.swipePage();
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		LFSUtilsAndroid.swipePage();
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
		getNFKsignuppagetermofservicecheckbox().isDisplayed();

	}

	// Method to fill registration details for New User without checkbox checked
	public void fillSignUpDetailsWithoutChckbox(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Complete form", MessageTypes.Pass);
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
		getNFKsignuppagetermofservicecheckbox().isDisplayed();
		Reporter.logWithScreenShot("Cannot create account", MessageTypes.Pass);
	}

	// Method to fill first page details
	public void fillFirstPageDetails(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		LFSUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		Reporter.logWithScreenShot("After checking service check box", MessageTypes.Pass);
		getNFKsignuppagecontinuebuttonbtn().waitForEnabled();
		Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppagecontinuebuttonbtn());
	}

	// Method to fill details without email id
	public void fillRandomSignUpDetailsWithoutEmail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		getNFKsignuppageemailtxt().clear();
		Reporter.logWithScreenShot("Error message with blank email id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password", MessageTypes.Pass);
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		LFSUtilsAndroid.swipePage();
		Reporter.logWithScreenShot("After Filling Confirm password", MessageTypes.Pass);
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.swipePage();
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
			Reporter.logWithScreenShot("Error message for empty email text field", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Email text field is blank and thus signup button is disabled",
					MessageTypes.Pass);
	}

	// Method to verify invalid email ids entered
	public void fillDetailsWithInvalidEmails(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("abcd.gmail.com");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("@ is not present", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("abcdgmailcom");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Mail domain name is not entered", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("abcd@gmail");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot(".com/.co.in is not entered", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("@.gmail.com");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Prefix name is not entered", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(70) + "@testmail.com");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Email length exceeds the limit", MessageTypes.Pass);
		}
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(65) + "@testmail.com");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
		if (!(getNFKEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email length is within the limit", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
		if (!(getNFKEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email id is valid", MessageTypes.Pass);
		}

	}

	// Method to verify email validations
	public void emailValidations(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys("abcd@testmail.com");
		LFSUtilsAndroid.click(getNFKsignuppagepasswordtxt());

		if (getNFKConfirmEmailValidationErrorMsg().isPresent()
				&& getNFKConfirmEmailValidationErrorMsg().getText().contains("match")) {
			Reporter.logWithScreenShot("Email and confirm email fields do not match", MessageTypes.Pass);
		}
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.click(getNFKsignuppagepasswordtxt());

		if (!(getNFKConfirmEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email and Confirm email fields matched", MessageTypes.Pass);
		}

	}

	// Method to enter signup details without password
	public void noPasswordToFill(String userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());

		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 30, 1);
		if (getNFKsignuppagesignupbtn().isEnabled())
			Reporter.logWithScreenShot("All details are filled", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Error message with blank password field", MessageTypes.Pass);
	}

	// Method to enter signup details with invalid password
	public void invalidPasswordEntry(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcd1");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());

		if (getNFKPasswordValidationErrorMsg().isPresent()
				&& getNFKPasswordValidationErrorMsg().getText().contains("Passwords")) {
			Reporter.logWithScreenShot("Password field should contains min 6 alphanumeric values", MessageTypes.Pass);
		}

		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcdefg@123456789");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());

		if (getNFKPasswordValidationErrorMsg().isPresent()
				&& getNFKPasswordValidationErrorMsg().getText().contains("Passwords")) {
			Reporter.logWithScreenShot("Password field should contains max 16 aplhanumeric values", MessageTypes.Pass);
		}

		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcd@1234");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());

		if (!(getNFKPasswordValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Valid password field is entered", MessageTypes.Pass);
		}
	}

	// Method to verify already exist mail id flow
	public void repeatedMailIdSignupFlow(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password field", MessageTypes.Pass);
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm Password", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 75, 50, 30, 1);
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		getNFKsignuppagesignupbtn().waitForEnabled();
		LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
		Reporter.logWithScreenShot("after clicking sign up", MessageTypes.Pass);
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("network.error.registrationEmailNotUnique"))
				.verifyVisible("Email Exist");
	}

	// Sign up method with invalid clinic code
	public void signUpDetailsWithInvalidClinicCode(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password", MessageTypes.Pass);
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm password", MessageTypes.Pass);
		getNFKSignuppageClinicCodeTxt().sendKeys("");
		Reporter.logWithScreenShot("After Filling Invalid clinic code", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageonetouchlogo());

	}

	// Method to select optIn option
	public void selectionOfOptin(String option) {
		LFSUtilsAndroid.click(getNFKsignuppagepromotionalcodechkbox());
		Reporter.logWithScreenShot("After checking promotional check box", MessageTypes.Pass);
		if (option.equalsIgnoreCase("I Agree")) {
			LFSUtilsAndroid.click(getNFKSignuppageIagreeBtn());
			Reporter.logWithScreenShot("User is agree to receive diabetes related information", MessageTypes.Pass);
		} else if (option.equalsIgnoreCase("Cancel")) {
			LFSUtilsAndroid.click(getNFKSignupPageCancelBtn());
			Reporter.logWithScreenShot("User is not agree to receive diabetes related information", MessageTypes.Pass);
		}
	}

	public void signupsecondPageScreen(Object signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		fillFirstPageDetails(signupDetails);

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("tes1123@gmail");
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys("tes@testmail.com");
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcd");
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys("abcd1234");
		LFSUtilsAndroid.click(getNFKsignuppageonetouchlogo());
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(email);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(email);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("Sangram@55");
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys("Sangram@55");
		LFSUtilsAndroid.click(getNFKsignuppageonetouchlogo());
		getNFKsignuppagesignupbtn().waitForEnabled();
		LFSUtilsAndroid.swipeWithCoordinates(476, 932, 443, 831, 10);
		Reporter.logWithScreenShot("Signup button is present", MessageTypes.Pass);

	}

	public void fillHCPDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		if (getNFKHcpsignuppageResetpasswordLbl().isPresent()) {
			Reporter.logWithScreenShot("Reset Password page for new HCP user", MessageTypes.Pass);
			if (getNFKsignuppageemailtxt().isEnabled()) {
				getNFKsignuppageemailtxt().clear();
				getNFKsignuppageemailtxt().sendKeys("aaaa.com");
				LFSUtilsAndroid.click(getNFKHcpsignuppageResetpasswordLbl());
				Reporter.logWithScreenShot("Email id is invalid", MessageTypes.Pass);
				getNFKsignuppageemailtxt().clear();
				String typeName = RandomStringUtils.randomAlphanumeric(76);
				getNFKsignuppageemailtxt().sendKeys(typeName);
				Validator.verifyThat("Hcp reset page email field charcter length",
						getNFKsignuppageemailtxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(75));
				getNFKsignuppageemailtxt().clear();
				getNFKsignuppageemailtxt().clear();
				getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
			} else
				Reporter.logWithScreenShot("Email id already entered", MessageTypes.Pass);

			getNFKsignuppagepasswordtxt().clear();
			getNFKsignuppagepasswordtxt().sendKeys("aaaa");
			LFSUtilsAndroid.click(getNFKHcpsignuppageResetpasswordLbl());
			Reporter.logWithScreenShot("invalid Password", MessageTypes.Pass);
			getNFKsignuppagepasswordtxt().clear();
			String typeName = RandomStringUtils.randomAlphanumeric(17);
			getNFKsignuppagepasswordtxt().sendKeys(typeName);
			Validator.verifyThat("Hcp reset page password field charcter length",
					getNFKsignuppagepasswordtxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(16));
			getNFKsignuppagepasswordtxt().clear();
			getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
			getNFKSignupPageConfirmPasswordTxt().clear();
			getNFKSignupPageConfirmPasswordTxt().sendKeys("abcd!1234");
			LFSUtilsAndroid.click(getNFKSignuppageDobField1());
			Reporter.logWithScreenShot("Password and Confirm password field does not match error", MessageTypes.Pass);
			getNFKSignupPageConfirmPasswordTxt().clear();
			getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
			if (getNFKsignuppagesignupbtn().isEnabled()) {
				Reporter.logWithScreenShot("All details are filled", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
			} else
				Reporter.logWithScreenShot("I agree checkbox is not checked", MessageTypes.Pass);
		}
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("Done button is enabled", MessageTypes.Pass);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.hcp.dob.information.message"))
				.verifyVisible("Message for update DOB");

	}

	// Method to verify blank email field for HCP user
	public void verifyBlankMail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);

		}
		if (getNFKHcpsignuppageResetpasswordLbl().isPresent()) {
			Reporter.logWithScreenShot("Reset Password page for new HCp user", MessageTypes.Pass);
			if (getNFKsignuppageemailtxt().isEnabled()) {
				getNFKsignuppageemailtxt().clear();

			} else
				Reporter.logWithScreenShot("Email id already entered", MessageTypes.Pass);

			getNFKsignuppagepasswordtxt().clear();
			getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
			getNFKSignupPageConfirmPasswordTxt().clear();
			getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
			LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
			if (getNFKsignuppagesignupbtn().isEnabled()) {
				Reporter.logWithScreenShot("Done button is enabled", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("Email field is blank", MessageTypes.Pass);
		}

	}

	// Method to add password reset details for HCP user
	public void addresetPasswordDetailHCP(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillData(userDetails);
		getNFKHcpsignuppageResetpasswordLbl().waitForPresent();
		Reporter.logWithScreenShot("Reset password field is displayed", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().sendKeys("abcd1234");
		getNFKSignupPageConfirmPasswordTxt().sendKeys("abcd1234");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		if (getNFKsignuppagetermofservicecheckbox().getAttribute("checked").equalsIgnoreCase("false"))
			LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		Reporter.logWithScreenShot("Page displayed with all valid details", MessageTypes.Pass);
		clickSignUpButton();
		getNFKSignuppageUpdatenoticeChckBtn().waitForPresent();
		Reporter.logWithScreenShot("update notice screen", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKSignuppageUpdatenoticeChckBtn());
		LFSUtilsAndroid.click(getNFKSignuppageUpdatenoticeContinueBtn());
		getNFKsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("Skip page", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageskipbtn());
		homePage.getNFKHomepageShareBtn().waitForPresent();
		Reporter.logWithScreenShot("Home Page is Displayed", MessageTypes.Pass);
	}

	// Method to verify invalid clinic code entered
	public void verifyInvalidClinicCode(String signupDetails) {
		fillSignUpDetails(signupDetails);
		LFSUtilsAndroid.click(getNFKSignuppageCliniccodeTxt());
		getNFKSignuppageCliniccodeTxt().sendKeys("ttccxx");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
		getNFKSignuppageCliniccodeTxt().waitForPresent();
		LFSUtilsAndroid.click(getNFKSignuppageCliniccodeTxt());
		getNFKSignuppageCliniccodeTxt().clear();
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getNFKSignuppageCliniccodeTxt().sendKeys(clinicCode);
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("office.code.not.found"));
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
	}

	public void veriyFirstAndLastName() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().waitForPresent();
		getNFKsignuppagefirstnametxt().sendKeys("=<");
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		LFSUtilsAndroid.click(getNFKsignuppagelastnametxt());
		getNFKSignuppageFirstNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
		getNFKsignuppagefirstnametxt().clear();
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		LFSUtilsAndroid.click(getNFKsignuppagelastnametxt());
		getNFKSignuppageFirstNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
		getNFKsignuppagelastnametxt().sendKeys("=<");
		getNFKSignuppageLastNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid Last name is displayed", MessageTypes.Pass);
		getNFKsignuppagelastnametxt().clear();
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		LFSUtilsAndroid.click(getNFKsignuppagefirstnametxt());
		getNFKSignuppageLastNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
	}

	// Method to set year
	public void setYear() {
		int currentYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int requiredYear = currentYear - 18;
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		if (getNFKSignupPageCalendarYearBtn().isDisplayed())
			LFSUtilsAndroid.click(getNFKSignupPageCalendarYearBtn());
		getNFKSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getNFKSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getNFKSignuppageTimeStaticText("" + requiredYear).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(startX + 10, startY - 300, startX + 10, startY, 500);
		}
		LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("" + requiredYear));
		Reporter.logWithScreenShot("Selected Year", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("onboarding.ageRestriction.title"))
				.verifyNotVisible("Age restriction pop up");
	}

	// Method to clicking authentication type
	// Milan
	public void clickOnAuthenticationTypeSignup(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getNFKsignuppagekeepmeloggedinchkbox().getAttribute("checked").contains("false"))
				LFSUtilsAndroid.click(getNFKsignuppagekeepmeloggedinchkbox());
			else {
				Reporter.logWithScreenShot("Keep me login switch is on", MessageTypes.Pass);
			}
			break;
		case "TOUCH ID":
			LFSUtilsAndroid.click(getNFKSignuppageTouchIDBtn());
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	// Create account button on sign up first page
	public void clicksOnCreateAccountButton() {
		LFSUtilsAndroid.click(getNFKsignuppagecontinuebuttonbtn());
		Reporter.logWithScreenShot("The user clicks on continue button", MessageTypes.Pass);
	}

	// method to verify touch ID option is available on the screen
	public void verifiesTouchIDOption() {
		getNFKSignuppageTouchIDBtn().waitForPresent();
		getNFKSignuppageTouchIDBtn().verifyPresent("Enable touch ID");
	}

	// Method to select optIn option
	public void verificationOfOptin() {
		getNFKsignuppagepromotionalcodechkbox().isPresent();
		LFSUtilsAndroid.click(getNFKsignuppagepromotionalcodechkbox());
		getNFKSignuppageOptinTitleLbl().waitForPresent();
		getNFKSignuppageOptinTitleLbl().verifyPresent("Opt-In Title is present");
		getNFKSignuppageIagreeBtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKSignuppageIagreeBtn());

	}

	// method to verify signup first screen
	public void veriySignUpFirstPage() {
		getNFKsignuppageonetouchlogo().waitForPresent();
		getNFKsignuppageonetouchlogo().verifyPresent("One Touch Logo");
		getNFKsignuppagefirstnametxt().verifyPresent("First Name");
		getNFKsignuppagelastnametxt().verifyPresent("Last Name");
		getNFKSignuppageDobField1().verifyPresent("Date of Birth");
		getNFKsignuppagecontinuebuttonbtn().verifyPresent("Create Account button");
		getNFKsignuppagetermofservicecheckbox().verifyPresent("Terms of Service checkBox");

	}

	// Installation of app without sensor instrumentation
	public void installWithoutSensor() {
		String a = ConfigurationManager.getBundle().getProperty("appium.additional.capabilities").toString();

		String filePath = splitCapabilityString(a, "app':'");
		String appPackage = splitCapabilityString(a, "appPackage':'");
		LFSUtilsAndroid jnj = new LFSUtilsAndroid();
		jnj.getDriver().removeApp(appPackage);
		Map<String, Object> params = new HashMap<>();

		params.put("file", filePath);
		params.put("instrument", "noinstrument");
		driver.executeScript("mobile:application:install", params);
	}

	public String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

	// method to verify that Touch ID option is not present on sign up second
	// screen
	public void touchIDNotPresent() {
		getNFKSignuppageTouchIDBtn().verifyNotPresent();
		Reporter.logWithScreenShot("Touch ID is not Present", MessageTypes.Pass);
	}

	// method to verify that Keepme login option is not present on sign up
	// second
	// screen
	public void keepMeLoginNotPresent() {
		getNFKsignuppagekeepmeloggedinchkbox().verifyNotPresent();
		Reporter.logWithScreenShot("Keep Me Login  is not Present", MessageTypes.Pass);
	}

	// method to verify customer service link on opt in screen redirects to new
	// mail dialouge
	public void verifyCustomerServiceLink() {
		getNFKsignuppagepromotionalcodechkbox().waitForPresent();

		Point p1 = getNFKsignuppagepromotionalcodechkbox().getLocation();
		Dimension d1 = getNFKsignuppagepromotionalcodechkbox().getSize();
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int startX = p1.getX();
		int startY = p1.getY();
		int pointX = startX + d1.getWidth() / 2;
		int pointY = startY + d1.getHeight() / 2;
		tch.tap(point(pointX, pointY)).perform();

		getNFKSignuppageOptinTitleLbl().waitForPresent();
		if (getNFKSignuppageOptinCustomerServiceLink().isPresent()
				&& getNFKSignuppageOptinCustomerServiceLink().isDisplayed()) {
			getNFKSignuppageOptinCustomerServiceLink().waitForPresent();
			LFSUtilsAndroid.click(getNFKSignuppageOptinCustomerServiceLink());
			getNFKSignuppageOptinCustomerServiceLinkNewEmailText().waitForPresent();
			Reporter.logWithScreenShot("Clicked on customer service link", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Customer service link is not present", MessageTypes.Fail);
		}
	}

	public void verifyPrivacyPolicyOnUpdate() {

		getNFKsignuppagepromotionalcodechkbox().waitForPresent();

		Point p1 = getNFKsignuppagepromotionalcodechkbox().getLocation();
		Dimension d1 = getNFKsignuppagepromotionalcodechkbox().getSize();

		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int startX = p1.getX();
		int startY = p1.getY();
		int pointX = startX + d1.getWidth() / 2;
		int pointY = startY + d1.getHeight() / 2;
		tch.tap(point(pointX, pointY)).perform();

		getNFKSignuppageOptinTitleLbl().waitForPresent();
		if (getNFKSignuppageOptinCustomerServiceLink().isPresent()
				&& getNFKSignuppageOptinCustomerServiceLink().isDisplayed()) {
			getNFKSignuppageOptinCustomerServiceLink().waitForPresent();
			getNFKSignuppageOptinCustomerServiceLink().click();
			getNFKSignuppageOptinCustomerServiceLinkNewEmailText().waitForPresent();
			Reporter.logWithScreenShot("Clicked on customer service link", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Customer service link is not present", MessageTypes.Fail);
		}

	}

	// steveGunther
	public void enterFirstLastName() {
		String fname = "jon" + RandomStringUtils.randomAlphabetic(5);
		String lname = "Snow" + RandomStringUtils.randomAlphabetic(5);
		LFSUtilsAndroid.enterText(getNFKsignuppagefirstnametxt(), fname);
		ConfigurationManager.getBundle().setProperty("register.firstname.key", fname);
		LFSUtilsAndroid.enterText(getNFKsignuppagelastnametxt(), lname);
		ConfigurationManager.getBundle().setProperty("register.lastname.key", lname);
		androidDriver.pressKeyCode(4);
		Reporter.logWithScreenShot("User enetered first name nad last name", MessageTypes.Pass);
	}

	// Method to select gender and diabetes type
	public void selectGenderAndDiabetesType(String gender, String diabetesType) {
		enterFirstLastName();
		selectGender(gender);
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.gender", gender);
		selectDiabetesType(diabetesType);
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.diabetes type", diabetesType);
		Reporter.logWithScreenShot("The user selected the Gender and Diabetes type", MessageTypes.Pass);
	}

	public void selectGender(String option) {
		switch (option) {
		case "MALE":
			LFSUtilsAndroid.click(getNFKSignupPageGenderMaleRadioBtn());
			break;
		case "FEMALE":
			LFSUtilsAndroid.click(getNFKSignupPageGenderFemaleRadioBtn());
			break;
		}
		Reporter.logWithScreenShot("User selected the Gender-" + option, MessageTypes.Pass);
	}

	public void selectDiabetesType(String option) {
		switch (option) {
		case "TYPE 1":
			LFSUtilsAndroid.click(getNFKSignupPageDiabetesType1RadioBtn());
			break;
		case "TYPE 2":
			LFSUtilsAndroid.click(getNFKSignupPageDiabetesType2RadioBtn());
			break;
		case "GESTATIONAL":
			LFSUtilsAndroid.click(getNFKSignupPageDiabetesGestationalRadioBtn());
			break;
		}
		Reporter.logWithScreenShot("User selected the Diabetes type-" + option, MessageTypes.Pass);
	}

	public void verifyDiabetesType() {
		getNFKSignupPageDiabetesType1RadioBtn().isEnabled();
		getNFKSignupPageDiabetesType2RadioBtn().isEnabled();
		getNFKSignupPageDiabetesGestationalRadioBtn().isEnabled();
		Reporter.logWithScreenShot(" Diabetes type is enabled", MessageTypes.Pass);

	}

	// Method to verify gender and diabetes selection page
	public void verifyGenderAndDiabetesSelectionPage() {
		String genderDiabetesTypePageTitle = LFSUtilsAndroid.getPropString("onboarding.aboutme.title");
		getNFKSignuppageTimeStaticText(genderDiabetesTypePageTitle).waitForPresent();
		getNFKSignuppageTimeStaticText(genderDiabetesTypePageTitle).verifyPresent("Tell us about yourself");
		String genderDiabetesTypePageHeader = LFSUtilsAndroid.getPropString("onboarding.aboutme.message");
		getNFKSignuppageTimeStaticText(genderDiabetesTypePageHeader)
				.verifyPresent("To complete Sign Up, please tell us your gender and diabetes type.");
		String genderLabel = LFSUtilsAndroid.getPropString("more.aboutme.genderText");
		getNFKSignupPageGenderMaleRadioBtn().verifyPresent("Male");
		getNFKSignupPageGenderFemaleRadioBtn().verifyPresent("Female");
		getNFKSignupPageDiabetesType1RadioBtn().verifyPresent("Type 1");
		getNFKSignupPageDiabetesType2RadioBtn().verifyPresent("Type 2");
		getNFKSignupPageDiabetesGestationalRadioBtn().verifyPresent("Gestational");
		getNFKsignuppagesignupbtn().verifyPresent("Sign Up button");
	}

	// method to click on continue button on sign up second screen
	public void clickOnContinueBtn() {
		LFSUtilsAndroid.swipePage();
		getNFKsignuppagesignupbtn().waitForPresent();
		LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
		try {
			getNFKsignuppageimportantmessagetxt().waitForPresent(5000);
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		} catch (Exception e) {
		}
		Reporter.logWithScreenShot("Clicked on Continue button", MessageTypes.Pass);
	}

	public void verifyGestationalTypeForMale() {
		getNFKSignupPageDiabetesGestationalRadioBtn().waitForPresent();
		getNFKSignupPageDiabetesGestationalRadioBtn().verifyDisabled("Gestational type is disabled for Male Gender");
		Reporter.logWithScreenShot("Gestational type is disabled for Male gender", MessageTypes.Pass);

	}

	public void verifyUpdateNoticeCheckBox() {
		String checkBoxFlag = getNFKSignuppageUpdatenoticeChckBtn().getAttribute("checked");

		if (checkBoxFlag.equals("false")) {
			Reporter.logWithScreenShot("Update notice check box unchecked", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Update notice check box checked", MessageTypes.Fail);
		}
	}

	public void clickUpdateNoticeCheckBox() {
		String checkBoxFlag = getNFKSignuppageUpdatenoticeChckBtn().getAttribute("checked");

		if (checkBoxFlag.equals("false")) {
			LFSUtilsAndroid.click(getNFKSignuppageUpdatenoticeChckBtn());
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Update Notice check box already checked", MessageTypes.Pass);
		}

	}

	public void clickUpdateNoticeContinueBtn() {
		LFSUtilsAndroid.click(getNFKSignuppageUpdatenoticeContinueBtn());
		LFSUtilsAndroid.waitforLoad();
	}

	// Created by Biswa
	public void setTouchID() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		Boolean sensor = Boolean.valueOf(androidDriver.getCapabilities().getCapability("sensorInstrument").toString());
		Reporter.log("Sensor Instrument capability: " + sensor);
		if (Boolean.TRUE) {
			capabilities.setCapability("sensorInstrument", false);
		} else {
			Reporter.log("Sensor instrumentation is false");
		}

		androidDriver.launchApp();
	}

	public void clinicInfo() {
		LFSUtilsAndroid.click(getNFKSignuppageClinicInfoBtn());
		getNFKSignuppageClinicCloseInfoBtn().verifyPresent();
		Reporter.logWithScreenShot("Clinic Info", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKSignuppageClinicCloseInfoBtn());
		getNFKSignuppageClinicInfoBtn().verifyPresent();
	}

	// Method to add office from home screen
	public void addOffice(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();

		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.enterText(getNFKSignuppageCliniccodeTxt(), userBean.getClinicCode());
		androidDriver.pressKeyCode(66); // press done button on keyboard
	}

	public void verifyClinicTermsClinicInfo() {
		try {
			MoreMenuPageAndroid moremenu = new MoreMenuPageAndroid();
			Assert.assertEquals(getNFKSignuppageClinicName().getText(), LFSUtilsAndroid.getPropString("office.name"));
			Assert.assertEquals(getNFKSignuppageClinicPhone().getText(), LFSUtilsAndroid.getPropString("office.phone"));
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
			Reporter.logWithScreenShot("Clinic consent checkbox", MessageTypes.Pass);
			LFSUtilsAndroid.click(moremenu.getNFKHomepageMoremenuConnectionsOfficeacceptChkbox());
			LFSUtilsAndroid.click(moremenu.getNFKHomepageMoreMenuConnectionsSearchBtn());
			LFSUtilsAndroid.pause(100);
			verifyClinicInfoOnSignup();
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to check consent checkbox", MessageTypes.Fail);
		}
	}

	public void verifyClinicInfoOnSignup() {
		try {
			Assert.assertEquals(getNFKSignuppageClinicInfoName().getText(),
					LFSUtilsAndroid.getPropString("office.name"));
			Assert.assertEquals(getNFKSignuppageClinicInfoPhone().getText(),
					LFSUtilsAndroid.getPropString("office.phone"));
			Assert.assertEquals(getNFKSignuppageClinicInfoMsgrequest().getText(),
					LFSUtilsAndroid.getPropString("office.code.request.pending"));
			getNFKSignuppageClinicInfoTikmark().assertPresent("Tik option");
			getNFKSignuppageClinicInfoCloseBtn().assertPresent("Close button");
			Reporter.logWithScreenShot("Verified the Information of Clinic on Signup page", MessageTypes.Pass);

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify clinic info on signup page", MessageTypes.Fail);
		}
	}

	// verify send button for unfilled first and last and term check box
	public void verifySendButtonEnable(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		getNFKSignuppageCliniccodeTxt().sendKeys(userBean.getClinicCode());
		getNFKSignupPageClinicTitleLbl().waitForPresent();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (!getNFKsignuppagelastnametxt().isPresent()) {
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
		getNFKsignuppagefirstnametxt().sendKeys("NFK");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagelastnametxt().sendKeys("NFK");
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageClinicSendBtn().verifyDisabled("term checkbox not selected, send btn");
		getNFKsignuppagefirstnametxt().clear();
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKSignupPageClinicConsentChkbox());
		getNFKSignupPageClinicSendBtn().verifyDisabled("For emptry first name, send btn");
		getNFKsignuppagefirstnametxt().sendKeys("NFK");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagelastnametxt().clear();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageClinicSendBtn().verifyDisabled("For empty Last name, send button");

	}

	public void addOfficeCode(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		getNFKSignuppageCliniccodeTxt().sendKeys(userBean.getClinicCode());
		getNFKSignupPageClinicTitleLbl().waitForPresent();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (!getNFKsignuppagelastnametxt().isPresent()) {
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
	}

	public void clickTerm() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 75, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		Map<String, Object> params1 = new HashMap<>();
		params1.put("label", "Terms of Use");
		Object result1 = driver.executeScript("mobile:button-text:click", params1);
		WebDriverTestCase.verifyTrue(
				getNFKsignuppagetermsofusetxt().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.terms")),
				"Incorrecct terms title", "Correcct Terms title");
		getNFKsignuppagetermsofusetxt().waitForPresent();
		Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms of use Page 4 is Displayed", MessageTypes.Pass);
	}

	public void clickprivacy() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		Map<String, Object> params1 = new HashMap<>();
		params1.put("label", "Policy");
		Object result1 = driver.executeScript("mobile:button-text:click", params1);
		WebDriverTestCase.verifyTrue(
				getNFKsignuppagetermsofusetxt().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.privacy")),
				"Incorrecct Privecy title", "Correcct Privecy title");
		getNFKsignuppagetermsofusetxt().waitForPresent();
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
	}

	public void verifyNoInternetPopup() {
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("network.error.noNetworkConnection"))
				.verifyPresent("No internet connection popup is displayed");
		LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("appCommon.ok")));
	}

	public QAFWebElement getNFKSignuppageOptinCustomerServiceLinkRedirectsComposeTxt() {
		return NFKSignuppageOptinCustomerServiceLinkRedirectsComposeTxt;
	}

	public QAFWebElement getNFKSignuppageWelcomepageSkipBtn() {
		return NFKSignuppageWelcomepageSkipBtn;
	}

	public QAFWebElement getNFKSignuppageWelcomepageYesBtn() {
		return NFKSignuppageWelcomepageYesBtn;
	}

	public void verifyAppOverview() {
		getNFKsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("User Successfully Logged in", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageskipbtn());
		LFSUtilsAndroid.waitforLoad();
		QAFWebElement buttonEle = new QAFExtendedWebElement(String
				.format(ConfigurationManager.getBundle().getString("NFK.signuppage.welcomepage.navigation.btn"), 1));
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("welcome page is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyAppOverviewOverlay() {
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is  displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.navigation.title")).isPresent()) {
			Reporter.logWithScreenShot("Navigation page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Timeline page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Logbook page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Sharing page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Setting page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot("Ready to See OneTouch Reveal in Action page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageWelcomepageYesBtn().isPresent()) {
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.done.description"))
					.verifyPresent("Access the app overview from help is displayed");
		} else {
			Reporter.logWithScreenShot("Access the app overview from help is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyToAndFroOverview() {
		getNFKsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("User Successfully Logged in", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKsignuppageskipbtn());
		LFSUtilsAndroid.waitforLoad();
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is  displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.navigation.title")).isPresent()) {
			Reporter.logWithScreenShot("Navigation page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Timeline page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Logbook page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Sharing page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Setting page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot("Ready to See OneTouch Reveal in Action page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);

		}
		navigateBackOverviewOverlay();
		getNFKSignuppageWelcomepageSkipBtn().verifyPresent("Welcome Page for a new User is displayed");
		LFSUtilsAndroid.click(getNFKSignuppageWelcomepageSkipBtn());
		getNFKSignuppageWelcomepageYesBtn().verifyPresent("Welcome page Yes button is present");
		LFSUtilsAndroid.click(getNFKSignuppageWelcomepageYesBtn());
	}

	public void navigateBackOverviewOverlay() {
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Setting page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Sharing page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Logbook page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Timeline page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.navigation.title")).isPresent()) {
			Reporter.logWithScreenShot("Navigation page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is  displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void enterMaxAgeForDOB() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 126;
		int actualYear = currentYear - 125;
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		if (getNFKSignupPagePickerYearLbl().getAttribute("text").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond" + actualYear, MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to enter year beyond " + actualYear, MessageTypes.Fail);

	}

	public void clickonAllowbtnforpermission() {
		SensorPairPageAndroid sensor = new SensorPairPageAndroid();
		sensor.getNFKSensorpairpageApplysensorNextBtn().click();
		String str = "Allow";
		if (getNFKSignuppageSafetyAllowBtn().isPresent() && str.contains("Allow")) {
			LFSUtilsAndroid.click(getNFKSignuppageSafetyAllowBtn());
		} else {
			Reporter.log("Allow button is not present");
		}

	}

	public void skipTheSensorScreen() {
		LFSUtilsAndroid.clickWithText("ok");
		if (getNFKApplysensorTitle().isPresent()) {
			LFSUtilsAndroid.click(getNFKApplysensorSkipBtn());
			Reporter.logWithScreenShot("User skipped Sensor Pairing", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sensor pair screen is not displayed ", MessageTypes.Fail);
		}
	}

	public void fillDependentDetails(String userDetails) {
		getNFKSignupDependentpageTxt().isPresent();
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		String email = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";

		getNFKSignupDependentpageTxt().assertPresent("Guardian account screen");
		getNFKSignupDependentGuardianFname().assertPresent("Guardian first name");
		LFSUtilsAndroid.enterText(getNFKSignupDependentGuardianFname(), userBean.getGuardianfname());
		getNFKSignupDependentGuardianLname().assertPresent("Guardian last name");
		LFSUtilsAndroid.enterText(getNFKSignupDependentGuardianLname(), userBean.getGuardianlname());
		androidDriver.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentEmailAddressTxt().assertPresent("Email field on Dependent signup screen");
		LFSUtilsAndroid.enterText(getNFKSignupDependentEmailAddressTxt(), email);
		getNFKSignupDependentConfemailaddressTxt().assertPresent("Confirm email adress on dependent screen");
		LFSUtilsAndroid.enterText(getNFKSignupDependentConfemailaddressTxt(), email);
		getNFKSignupDependentPasswordTxt().assertPresent("Password field");
		LFSUtilsAndroid.enterText(getNFKSignupDependentPasswordTxt(), userBean.getGuardianpassword());
		ConfigurationManager.getBundle().setProperty("password", userBean.getGuardianpassword());
		getNFKSignupDependentConfpasswordTxt().assertPresent("Confirm password field");
		LFSUtilsAndroid.enterText(getNFKSignupDependentConfpasswordTxt(), userBean.getGuardianconfirmpassword());
		androidDriver.hideKeyboard();
		getNFKSignupDependentCheckAgreementTermBtn().verifyPresent("Terms and privacy policy check box");
		LFSUtilsAndroid.click(getNFKSignupDependentCheckAgreementTermBtn());
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckPromotionalOffersBtn().verifyPresent("opt in check box");
		Reporter.logWithScreenShot("Guardian has entered the details on signup page", MessageTypes.Pass);
	}

	public void enterDobFirstAndLastName(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		String dob = userBean.getDependentDOByear();
		String curentyr = getNFKSignupPagePickerYearLbl().getText();
		int yr = Integer.parseInt(curentyr) - Integer.parseInt(dob);
		if (yr < 18 && yr > 2) {
			LFSUtilsAndroid.enterText(getNFKSignupPagePickerYearLbl(), userBean.getDependentDOByear());
			LFSUtilsAndroid.enterText(getNFKSignupPagePickerDateLbl(), userBean.getDependentBirthdate());
			LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
			Reporter.logWithScreenShot("Guardian selected the DOB for Dependent", MessageTypes.Pass);
		} else {
			Reporter.log("The Dependent age should be in between 2 to 17");
		}
		enterFirstLastName();
		getNFKSignupDependentClinicTxt().verifyPresent("Clinic code field");
		Reporter.logWithScreenShot("Guardian has enetered depedent's details", MessageTypes.Pass);
	}

	public void fillCGMReadings() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password.key");
		ApiMethods apiObj = new ApiMethods();

		int noOfData = 10;
		int noofdays = 90;
		int[] cgmval = new int[] { 66, 68, 100, 102, 108, 202, 204, 206, 208, 210 };
		apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);

	}

	public void fillCGMReadingsReports() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password.key");
		ApiMethods apiObj = new ApiMethods();
		int[] val = new int[1440];
		int min = 70, max = 180;
		for (int i = 0; i < val.length; i++) {
			val[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
		}
		int noOfData = 1440;
		int noofdays = 15;
		apiObj.addLoginDetails(email, password, noOfData, noofdays, val);
	}

	// enter name and select DOB for 2-5 yr old child
	public void setchilddob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 4;
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has selected age", MessageTypes.Pass);
		enterFirstLastName();
	}

	// enter name and select DOB for 7-18 yr old kid
	public void setteenagedob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 8;
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		enterFirstLastName();
	}

	public void enterLowDataAPI() {
		ApiMethods apiObj = new ApiMethods();
		int noOfLowData = 31;
		int noofLowdays = 8;

		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);
		int[] cgmlowval = new int[] { 75, 76, 79, 80, 82, 83, 85, 88, 89, 105, 110, 111, 125, 126, 128, 64, 63, 62, 61,
				60, 63, 62, 61, 56, 58, 59, 60, 65, 57, 65, 63 };
		apiObj.addLoginDetailsLow("mrch315@mailinator.com", "test1234", noOfLowData, noofLowdays, cgmlowval);

	}

	public void verifyGuardianSignupPage() {
		getNFKSignupDependentpageTxt().assertPresent("Create guardian Account Title");
		getNFKSignupDependentGuardianFname().assertPresent("Guardian First Name");
		getNFKSignupDependentGuardianLname().assertPresent("Guardian Last Name");
		getNFKSignupDependentEmailAddressTxt().isPresent();
		getNFKSignupDependentConfemailaddressTxt().isPresent();
		getNFKSignupDependentPasswordTxt().assertPresent("Password");
		getNFKSignupDependentConfpasswordTxt().assertPresent("Confirm Password");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckAgreementTermBtn().assertPresent("Aggrement Check box");
		getNFKSignupDependentCheckPromotionalOffersBtn().assertPresent("promotional offers checkbox");
		Reporter.logWithScreenShot("Guardian Signup Page verified", MessageTypes.Pass);

	}

	public void clickOnLoginLink() {
		CountrySelectionPageAndroid country = new CountrySelectionPageAndroid();
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		if (country.getNFKDecisionPageYesBtn().isPresent())
			Reporter.logWithScreenShot("User has naviagted to Decision screen", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("User has not naviagted to Decision screen", MessageTypes.Fail);
	}

	public void verifySignupMyselfPage() {
		getNFKsignuppageemailtxt().sendKeys("stet<>+.com");
		LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKValidationErrorIcon());
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys("stet.com");
		LFSUtilsAndroid.click(getNFKsignuppagepasswordtxt());
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKValidationErrorIcon());
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys("acb@testmail.com");
		LFSUtilsAndroid.click(getNFKsignuppagepasswordtxt());
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKsignuppageemailtxt().clear();
			LFSUtilsAndroid.click(getNFKValidationErrorIcon());
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagepasswordtxt().sendKeys(".<+=");
		LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("Passwords must be between")) {
			Reporter.logWithScreenShot("Password error field verified", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKValidationErrorIcon());
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		getNFKSignupPageConfirmPasswordTxt().sendKeys(".<+=>");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.click(getNFKSignuppageCliniccodeTxt());
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Confirm password error field verified", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		LFSUtilsAndroid.click(getNFKSignuppageCliniccodeTxt());
		getNFKSignuppageCliniccodeTxt().sendKeys("ttccxx");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 18;
		int requiredYear1 = currentYear - 17;
		int requiredYear2 = currentYear - 2;
		getNFKSignuppageDobField1().click();
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear1));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		if (getNFKSignuppageAgeRestrictionPopup().isDisplayed()
				&& getNFKSignupPageAgeRestrictionPopupCancelButton().isDisplayed()) {
			Reporter.logWithScreenShot("Dob verified", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKSignupPageAgeRestrictionPopupCancelButton());
			LFSUtilsAndroid.click(getNFKValidationErrorIcon());
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear2));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		if (getNFKSignuppageAgeRestrictionPopup().isDisplayed()
				&& getNFKSignupPageAgeRestrictionPopupCancelButton().isDisplayed()) {
			Reporter.logWithScreenShot("Dob verified", MessageTypes.Pass);
			getNFKSignupPageAgeRestrictionPopupCancelButton().click();
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
	}

	public void clickonBackbutton() {
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageBackBtn().isPresent()) {
			getNFKSignuppageBackBtn().click();
			Reporter.logWithScreenShot("Clicked on back button", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Failed Clicked on back button", MessageTypes.Fail);
		}

	}

	public void verifySignupMyselfSecondPage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().sendKeys(".>+:");
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		getNFKsignuppagelastnametxt().sendKeys(".>+:");
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		clickonBackbutton();
		clickonBackbutton();
	}

	public void verifySignupDependentPage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().sendKeys("< > \" = +");
		getNFKsignuppagelastnametxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys("< > \" = +");
		getNFKsignuppageemailtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("LastName error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		LFSUtilsAndroid.hideKeyboard();

		getNFKsignuppageemailtxt().sendKeys("stet.com");
		getNFKsignuppageconfirmemailtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys("stet.com");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagepasswordtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagepasswordtxt().sendKeys(".<+=");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("Passwords must be between")) {
			Reporter.logWithScreenShot("Password error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKSignupPageConfirmPasswordTxt().sendKeys(".<+=>");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Confirm password error field verified", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
	}

	public void verifySignupDependentSecondPage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().sendKeys(".>+:");
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(".>+:");
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 2;
		int requiredYear1 = currentYear - 18;
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear1));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
		if (getNFKSignuppageAgeRestrictionPopup().isDisplayed()
				&& getNFKsignuppageimportantmessageokbtn().isDisplayed()) {
			Reporter.logWithScreenShot("Dob verified", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
			LFSUtilsAndroid.click(getNFKValidationErrorIcon());

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		LFSUtilsAndroid.click(getNFKSignuppageDobOkBtn());
	}

	public void fillexisitingUser(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().waitForVisible();
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageConfirmPasswordTxt().verifyPresent("The confirm password field is present");
		getNFKSignupPageConfirmPasswordTxt().clear();
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
	}

	public void verifyEmailExitPopup() {
		getNFKSignuppageEmailexistPpopup().isDisplayed();
		getNFKSignuppageEmailexistPpopup().assertPresent("Email already exist popup displayed");
		getNFKsignuppageimportantmessageokbtn().isDisplayed();
		Reporter.logWithScreenShot("Email Already Exist popup is displayed");
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
		LFSUtilsAndroid.clickBackButton();
	}

	public void fillexisitingGuardianUser(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		getNFKSignupDependentpageTxt().assertPresent("Guardian account screen");
		getNFKSignupDependentGuardianFname().assertPresent("Guardian first name");
		LFSUtilsAndroid.click(getNFKSignupDependentGuardianFname());
		getNFKSignupDependentGuardianFname().sendKeys(userBean.getGuardianfname());
		getNFKSignupDependentGuardianLname().assertPresent("Guardian last name");
		LFSUtilsAndroid.click(getNFKSignupDependentGuardianLname());
		getNFKSignupDependentGuardianLname().sendKeys(userBean.getGuardianlname());
		androidDriver.hideKeyboard();
		LFSUtilsAndroid.swipePage();
		getNFKsignuppageemailtxt().assertPresent("Email field on Dependent signup screen");
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().assertPresent("Confirm email adress on dependent screen");
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().assertPresent("Password field");
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getGuardianpassword());
		getNFKSignupPageConfirmPasswordTxt().assertPresent("Confirm password field");
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getGuardianconfirmpassword());
		androidDriver.hideKeyboard();
		getNFKSignupDependentCheckAgreementTermBtn().verifyPresent("Terms and privacy policy check box");
		LFSUtilsAndroid.click(getNFKSignupDependentCheckAgreementTermBtn());
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckPromotionalOffersBtn().verifyPresent("opt in check box");
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Guardian has entered the details on signup page", MessageTypes.Pass);
	}

	private QAFExtendedWebElement getNFKSignupPageConfpasswordTxt() {

		return null;
	}

	public void skipEmancipationScreen() {
		LFSUtilsAndroid.click(getNFKSignuppageSensorSkipBtn());
	}

	public void verifyEmancipationScreen() {
		getNFKSignupEmancipationTitle().waitForPresent();
		getNFKSignupEmancipationTitle().verifyPresent("Emancipation Title is present");
		getNFKsignuppageemailtxt().verifyPresent("Email-id Field Present");
		getNFKsignuppageconfirmemailtxt().verifyPresent("Confirm Email-id Field Present");
		getNFKsignuppagepasswordtxt().verifyPresent("Password Field is Present");
		getNFKSignupPageConfirmPasswordTxt().verifyPresent("confirm Password Field is Present");
		getNFKsignuppagetermofservicecheckbox().verifyPresent("Terms and Agreement checkbox present");
		getNFKsignuppagepromotionalcodechkbox().verifyPresent("promotional Offers Checkbox is present");
		Reporter.logWithScreenShot("Emancipation Screen verified");
	}

	public void verifyInvalidPasswordError() {
		try {
			if (getNFKEmailValidationErrorMsg().getText()
					.equals(LFSUtilsAndroid.getPropString("auth.passwordValidation.forbiddenChar"))) {
				Reporter.logWithScreenShot("Sucessfully verified password field error message. ", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify invalid password error message " + MessageTypes.Fail);
		}
	}

	public void validateEmancipationField(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillFromConfig((String) userDetails);
		switch (userDetails) {
		case "fieldValidations.emancipationEmail":
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKsignuppageemailtxt().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully entered the invalid email format:   " + charArray[i],
							MessageTypes.Pass);
					LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
					getNFKSignuppageTimeStaticText(
							LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
							.verifyPresent("Invalid Email Error displayed");
					LFSUtilsAndroid.click(getNFKValidationErrorIcon());
					LFSUtilsAndroid.click(getNFKsignuppageemailtxt());
					getNFKsignuppageconfirmemailtxt().clear();
					getNFKsignuppageemailtxt().clear();
				}
				Reporter.logWithScreenShot("Successfully verified email field with inavlid email format",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			try {
				getNFKsignuppageemailtxt().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot("Successfully entered email with minimum characters", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
				getNFKSignuppageTimeStaticText(
						LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyPresent("Invalid Email Error displayed");
				LFSUtilsAndroid.click(getNFKValidationErrorIcon());
				LFSUtilsAndroid.click(getNFKsignuppageemailtxt());
				getNFKsignuppageemailtxt().clear();

				getNFKsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(125) + "@testmail.com");
				Reporter.logWithScreenShot("Successfully entered email with maximum characters ", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKsignuppageconfirmemailtxt());
				getNFKSignuppageTimeStaticText(
						LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyPresent("Invalid Email Error displayed");
				LFSUtilsAndroid.click(getNFKValidationErrorIcon());
				getNFKsignuppageemailtxt().clear();
				Reporter.logWithScreenShot("Successfully verified email field with minimum and maximum characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}

			try {
				getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
				getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getConfirmEmail());
				LFSUtilsAndroid.click(getNFKsignuppagepasswordtxt());
				getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailsMustMatch"))
						.verifyPresent("Email NOt Match Error displayed");

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			clickonBackbutton();
			break;

		case "fieldValidations.emancipationPWD":
			try {
				String charArray[] = userBean.getNotAllowedCharacters().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKsignuppagepasswordtxt().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());
					verifyInvalidPasswordError();
					LFSUtilsAndroid.click(getNFKValidationErrorIcon());
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKsignuppagepasswordtxt().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());
					verifyInvalidPasswordError();
					LFSUtilsAndroid.click(getNFKValidationErrorIcon());
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKsignuppagepasswordtxt().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);

				LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());
				verifyInvalidPasswordError();
				LFSUtilsAndroid.click(getNFKValidationErrorIcon());
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
				getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getConfirmPassword());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKsignuppageemailtxt());
				getNFKSignuppageTimeStaticText(
						LFSUtilsAndroid.getPropString("auth.passwordValidation.passwordsMustMatch"))
						.verifyPresent("Password NOt Match Error displayed");
				LFSUtilsAndroid.click(getNFKValidationErrorIcon());
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			break;
		}
	}

	public void VerifyExistEmacipationEmail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppageemailtxt().verifyPresent("Email id is present");
		getNFKsignuppageemailtxt().sendKeys(userBean.getExistingEmail());
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getExistingEmail());
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getNFKSignupPageConfirmPasswordTxt().sendKeys(userBean.getPassword());
		androidDriver.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		getNFKsignuppagecontinuebuttonbtn().waitForEnabled();
		LFSUtilsAndroid.click(getNFKsignuppagecontinuebuttonbtn());
		Reporter.logWithScreenShot("Emancipation screen is Verified");
		getNFKSignuppageEmailexistPpopup().isDisplayed();
		getNFKSignuppageEmailexistPpopup().assertPresent("Email already exist popup displayed");
		getNFKsignuppageimportantmessageokbtn().isDisplayed();
		Reporter.logWithScreenShot("Email Already Exist popup is displayed");
		LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
	}

	public void fillLowCGMReadings() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
		ApiMethods apiObj = new ApiMethods();

		int noOfLowData = 31;
		int noofLowdays = 7;
		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);
		int[] cgmlowval = new int[] { 75, 76, 79, 80, 82, 83, 85, 88, 89, 105, 110, 111, 125, 126, 128, 64, 63, 62, 61,
				60, 63, 62, 61, 56, 58, 59, 60, 65, 57, 65, 63 };
		apiObj.addLoginDetailsLow(email, password, noOfLowData, noofLowdays, cgmlowval);
	}

	public void fillCGMReadingsAGP() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.pass");
		ApiMethods apiObj = new ApiMethods();
		int noOfData = 1440;
		int noofdays = 15;
		apiObj.addCGMforAGP(email, password, noOfData, noofdays);

	}

	public void verifyApplySensor() {
		HomePageAndroid homepage = new HomePageAndroid();
		homepage.getNFKHomepagePairSensorBtn().isDisplayed();
		LFSUtilsAndroid.click(homepage.getNFKHomepagePairSensorBtn());
		getNFKApplysensorTitle().waitForPresent();
		getNFKApplysensorTitle().getText().equals("Apply Sensor");
		LFSUtilsAndroid.click(getNFKSignuppageSensorNextBtn());
		Reporter.logWithScreenShot("Apply Sensor screen ", MessageTypes.Pass);
		getNFKApplysensorTitle().getText().equals("Start Pairing Sensor");
		LFSUtilsAndroid.click(getNFKSignuppageSensorNextBtn());
		Reporter.logWithScreenShot("Apply Sensor screen ", MessageTypes.Pass);

	}

	public void bluetoothoff() {
		LFSUtilsAndroid.startApp("com.android.settings", "identifier");
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.click(getNFKSystemSettingsConectedDevice());
		LFSUtilsAndroid.click(getNFKSystemSettingsConectedPref());
		LFSUtilsAndroid.click(getNFKSystemSettingsBluetooth());
		if (getNFKDeviceSettingSwitchBtn().getAttribute("checked").equals("true")) {
			LFSUtilsAndroid.click(getNFKDeviceSettingSwitchBtn());
			Reporter.logWithScreenShot("Bluetooth Turned off", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Bluetooth was already Turned off", MessageTypes.Pass);
		}
		androidDriver.launchApp();
	}

	public void AllowLocationPermission() {
		getNFKSignuppageSensorLocationPermissionTxt().verifyPresent("Location permission is present");
		getNFKSignuppageSensorLocationPermissionAllowtime().verifyPresent("Allow one time  is present");
		getNFKSignuppageSensorLocationPermissionDeny().verifyPresent("Allow one time  is present");
		LFSUtilsAndroid.click(getNFKSignuppageSensorLocationPermissionAllowtime());
	}

	public void VerifyAllowBluetooth() {
		getNFKSignuppageSensorBluetoothTxt().verifyPresent("Bluetooth popup is  displayed");
		getNFKDeviceSettingAllowBtn().verifyPresent("Allow option is present");
		Reporter.logWithScreenShot("Bluetooth permission popup is present", MessageTypes.Pass);
		LFSUtilsAndroid.click(getNFKDeviceSettingAllowBtn());
	}

	@FindBy(locator = "NFK.signuppage.optin.cancel.btn")
	private QAFWebElement NFKsignuppageoptincancelbtn;
	@FindBy(locator = "NFK.signuppage.optin.check.box")
	private QAFWebElement NFKsignuppageoptincheckbox;
	@FindBy(locator = "NFK.signuppage.optin.Iagree.btn")
	private QAFWebElement NFKsignuppageoptinIagreebtn;
	@FindBy(locator = "NFK.signuppage.optin.title")
	private QAFWebElement NFKsignuppageoptintitle;

	public QAFWebElement getNFKsignuppageoptincancelbtn() {
		return NFKsignuppageoptincancelbtn;
	}

	public QAFWebElement getNFKsignuppageoptincheckbox() {
		return NFKsignuppageoptincheckbox;
	}

	public QAFWebElement getNFKsignuppageoptinIagreebtn() {
		return NFKsignuppageoptinIagreebtn;
	}

	public QAFWebElement getNFKsignuppageoptintitle() {
		return NFKsignuppageoptintitle;
	}

	public void tapCancelVerifyOptinCheckbox() {
		try {
			LFSUtilsAndroid.click(getNFKsignuppageoptincancelbtn());
			getNFKsignuppageoptincheckbox().verifyNotSelected();
			Reporter.logWithScreenShot("User successfully clicked on cancel and verified optin check box de-selected",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click on cancel and verify optin checkbox", MessageTypes.Fail);
		}
	}

	public void userselectoptin() {
		try {
			LFSUtilsAndroid.click(getNFKsignuppageoptincheckbox());
			getNFKsignuppageoptintitle().isDisplayed();
			Reporter.logWithScreenShot("User successfully clicked optin checkbox selected and user is on optin screen",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click optin checkbox select", MessageTypes.Fail);
		}
	}

	public void VerifySignupfirstscreenOptinCheckbox() {
		try {
			LFSUtilsAndroid.verifyIfCheckboxChecked(getNFKsignuppageoptincheckbox());
			Reporter.logWithScreenShot("User successfully verified optin checkbox selected ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify optin checkbox select", MessageTypes.Fail);
		}
	}

	public void checkOptincheckbox() {
		try {
			LFSUtilsAndroid.click(getNFKsignuppageoptincheckbox());
			LFSUtilsAndroid.click(getNFKsignuppageoptinIagreebtn());
			Reporter.logWithScreenShot("User successfully clicked optin checkbox and clicked on i agree option",
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to click optin check box and i agree option", MessageTypes.Fail);
		}
	}

	public void DeselectOptincheckbox() {
		try {
			LFSUtilsAndroid.uncheckCheckBox(getNFKsignuppageoptincheckbox());
			Reporter.logWithScreenShot("User successfully de-select optin checkbox", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to de-select optin checkbox", MessageTypes.Fail);
		}
	}

//	Shubham
//	Method To Verify The Date
	public void userVerifyTheDate() {
		try {
			LFSUtilsAndroid.click(getNFKSignupPageDateOfBirthTxt());
			getNFKSignupPagePickerMonthLbl().verifyPresent("month");
			getNFKSignupPagePickerDateLbl().verifyPresent("date");
			getNFKSignupPagePickerYearLbl().verifyPresent("year");
			LFSUtilsAndroid.click(getNFKSignupPageAgeRestrictionPopupCancelButton());
			Reporter.logWithScreenShot("Date of birth", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify date", MessageTypes.Fail);
		}
	}

//	Shubham
//	Method To Verifies Second Screen Option
	public void userVerifiesSecondScreenOptIn() {
		try {
			LFSUtilsAndroid.click(getNFKSignupPageGreenLinkTxt());
			getNFKSignupPageGreenLinkBtn().verifyPresent();
			getNFKSignupPageCancelBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKSignupPagePrivacyPolicyTxt());
			LFSUtilsAndroid.click(getNFKSignupPagePrivacyPolicyTxt());
			getNFKSignupPagePrivacyPolicyTxt().verifyPresent();
			getNFKSignupPagePrivacyPolicyBackBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKSignupPagePrivacyPolicyBackBtn());
			LFSUtilsAndroid.click(getNFKSignupPageCancelBtn());
			Reporter.logWithScreenShot("Second screen option", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify option", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To Redirected To The Signup Screen
	public void userRedirectedToTheSignupScreen() {

		try {
			getNFKSignupPageClinicCodeBtn().sendKeys(ConfigurationManager.getBundle().getString("clinic.code"));
			LFSUtilsAndroid.click(getNFKSignupPageConfirmPasswordTxt());
			getNFKSignupPageClinicCodeTextBtn().verifyPresent();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.click(getNFKSignupPageCheckBoxBtn());
			LFSUtilsAndroid.click(getNFKSignupPageSendBtn());
			Reporter.logWithScreenShot("Redirected to the signup screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to Redirected to the signup screen", MessageTypes.Fail);

		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 1
	public void verifySefetyOnboardingScreen1() {
		try {
			LFSUtilsAndroid.click(getNFKsignuppagesignupbtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("welcome.title")).verifyPresent();
			getNFKSafetyonboardingNextBtn().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.first.content"))
					.verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen1", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen1", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 2
	public void verifySefetyOnboardingScreen2() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.second"))
					.verifyPresent();
			getNFKSafetyonboardingIUnderstandCheckbox().verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingSecondscreenText().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen2", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen2", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 3
	public void verifySefetyOnboardingScreen3() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingIUnderstandCheckbox());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.third"))
					.verifyPresent();
			getNFKSafetyonboardingAreaOfCautionImage().verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingIUnderstandCheckbox().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.third.discription"))
					.verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen3", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen3", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 4
	public void verifySefetyOnboardingScreen4() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingIUnderstandCheckbox());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.fourth"))
					.verifyPresent();
			getNFKSafetyonboardingSupportedUOMImage().verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingNextBtn().verifyPresent();
			getNFKSafetyonboardingFourthscreenText().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen4", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen4", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 5
	public void verifySefetyOnboardingScreen5() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.fifth"))
					.verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingIUnderstandCheckbox().verifyPresent();
			getNFKSafetyonboardingCurrentreadingImage().verifyPresent();
			getNFKSafetyonboardingFifthscreenText().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen5", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen5", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 6
	public void verifySefetyOnboardingScreen6() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingIUnderstandCheckbox());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.sixth"))
					.verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingNextBtn().verifyPresent();
			getNFKSafetyonboardingTrendArrowRisingQuicklyImage().verifyPresent();
			getNFKSafetyonboardingTrendArrowRisingImage().verifyPresent();
			getNFKSafetyonboardingTrendArrowRisingSlowlyImage().verifyPresent();
			getNFKSafetyonboardingTrendArrowSteadyImage().verifyPresent();
			getNFKSafetyonboardingTrendArrowFallingSlowlyImage().verifyPresent();
			getNFKSafetyonboardingTrendArrowFallingImage().verifyPresent();
			getNFKSafetyonboardingTrendArrowFallingQuicklyImage().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen6", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen6", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 7
	public void verifySefetyOnboardingScreen7() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSafetyonboardingSeventhscreenTitle().verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingNextBtn().verifyPresent();
			getNFKSafetyonboardingSeventhscreenText().verifyPresent();
			getNFKSafetyonboardingHighReadingImage().verifyPresent();
			getNFKSafetyonboardingInRangeReadingImage().verifyPresent();
			getNFKSafetyonboardingLowReadingImage().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen7", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen7", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 8
	public void verifySefetyOnboardingScreen8() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eighth"))
					.verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingIUnderstandCheckbox().verifyPresent();
			getNFKSafetyonboardingAlertImage().verifyPresent();
			getNFKSignuppageTimeStaticText(
					LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eighth.discription")).verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen8", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen8", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 9
	public void verifySefetyOnboardingScreen9() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingIUnderstandCheckbox());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.ninth"))
					.verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingNextBtn().verifyPresent();
			getNFKSafetyonboardingSmartphoneImage().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.ninth.discription"))
					.verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen9", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen9", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 10
	public void verifySefetyOnboardingScreen10() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.tenth"))
					.verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			getNFKSafetyonboardingNextBtn().verifyPresent();
			getNFKSignuppageTimeStaticText(
					LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.tenth.YouWillReceive.text"))
					.verifyPresent();
			getNFKSafetyonboardingUrgentSoonContainerImage().verifyPresent();
			getNFKSafetyonboardingUrgentAlarmContainerImage().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.tenth.text1"))
					.verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.tenth.text2"))
					.verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.tenth.text3"))
					.verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen10", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen10", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify safety onboarding screen 11
	public void verifySefetyOnboardingScreen11() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			getNFKSafetyonboardingOnetouchLogo().verifyPresent();
			getNFKSafetyonboardingSettingBackBtn().verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eleventh"))
					.verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eleventh.text1"))
					.verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eleventh.text2"))
					.verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eleventh.text3"))
					.verifyPresent();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.eleventh.text4"))
					.verifyPresent();
			getNFKSafetyonboardingSettingBtn().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen11", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen11", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to allow DND permission from device setting
	public void allowDNDPermission() {
		try {
			LFSUtilsAndroid.click(getNFKSafetyonboardingSettingBackBtn());
			LFSUtilsAndroid.click(getNFKSafetyonboardingNextBtn());
			LFSUtilsAndroid.click(getNFKSafetyonboardingSettingBtn());
			findAppname("OneTouch 24/7 MaxVue�");
			LFSUtilsAndroid.clickWithText("OneTouch 24/7 MaxVue™");
			getNFKSafetyonboardingDNDPopupTitle().verifyPresent();
			getNFKSafetyonboardingDNDPopupText().verifyPresent();
			getNFKSafetyonboardingSettingDenyBtn().verifyPresent();
			getNFKSafetyonboardingSettingAllowBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKSafetyonboardingSettingAllowBtn());
			Reporter.logWithScreenShot("Allow DND Permisson", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to click on allow button", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify pair sensor screen
	public void verifyPairSensorScreen() {
		try {
			SensorPairPageAndroid sensorpair = new SensorPairPageAndroid();

			LFSUtilsAndroid.clickBackButton();
			sensorpair.getNFKApplysensorTitle().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired Pair Sensor Screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifyPairSensorScreen", MessageTypes.Fail);
		}
	}

	// Rushikesh
	// Method to verify home screen
	public void verifyHomeScreen() {
		try {
			SensorPairPageAndroid sensorpair = new SensorPairPageAndroid();
			LFSUtilsAndroid.click(getNFKApplysensorSkipBtn());
			sensorpair.getNFKHomescreenPairsensorBtn().verifyPresent();
			Reporter.logWithScreenShot("Successfully verifired Home Screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verifyHomeScreen", MessageTypes.Fail);
		}
	}

//	Shubham
//	Method To Verify Apply Sensor Home Screen
	public void userVerifyApplySensorHomeScreen() {
		getNFKSignuppageApplySensorBtn().verifyPresent();
		LFSUtilsAndroid.click(getNFKSignuppageApplySensorBtn());
	}

//	Shubham
//	Method To How To Apply Sensor Screen
	public void userHowToApplyTheSensorScreen() {
		try {
			getNFKSignuppageSensorWearBtn().verifyPresent();
			getNFKSignuppageHelpfulTipsBtn().verifyPresent();
			getNFKSignuppageBackUpperArmBtn().verifyPresent();
			getNFKSignuppageWashAndDryHandBtn().verifyPresent();
			LFSUtilsAndroid.swipePage();
			getNFKSignuppageRemovePaperBackingBtn().verifyPresent();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			getNFKSignuppageAdhesivePatchBtn().verifyPresent();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.click(getNFKSafetyonboardingBackBtn());
			Reporter.logWithScreenShot("Verify how to apply sensor screen", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify how to apply sensor screen", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To Verify Left And Right Abdomen
	public void userVerifyRightandLeftAbdomen() {
		try {
			LFSUtilsAndroid.click(getNFKSignuppageRightAbdomenButtonBtn());
			getNFKSignuppageRightAbdomenButtonBtn().verifyEnabled();
			LFSUtilsAndroid.click(getNFKSignuppageRightAbdomenButtonBtn());
			getNFKSignuppageRightAbdomenButtonBtn().verifyNotSelected();
			LFSUtilsAndroid.click(getNFKSignuppageLeftAbdomenButtonBtn());
			getNFKSignuppageLeftAbdomenButtonBtn().verifyEnabled();
			Reporter.logWithScreenShot("Verify Right and left abdomen ", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify Right and left abdomen", MessageTypes.Fail);
		}
	}

//	Shubham
//	Method To Verify Left And Right Abdomen Upper Arm
	public void userVerifyRightAndLeftUpperArm() {
		try {
			LFSUtilsAndroid.click(getNFKSignuppageLeftArmBtn());
			getNFKSignuppageLeftAbdomenButtonBtn().verifyNotSelected();
			getNFKSignuppageLeftArmBtn().verifyEnabled();
			LFSUtilsAndroid.click(getNFKSignuppageRightArmLnk());
			getNFKSignuppageLeftArmBtn().verifyNotSelected();
			getNFKSignuppageRightArmLnk().verifyEnabled();
			LFSUtilsAndroid.click(getNFKSafetyonboardingBackBtn());
			getNFKSignuppageUrgentLowTextBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKsignuppagesafetydonebtn());
			Reporter.logWithScreenShot("Verify right and left arm", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify right and left arm", MessageTypes.Fail);
		}
	}

//	Shubham
//	Method To Verify The Start Pairing Sensor Screen Using Right Arm
	public void userVerifyTheStartPairingSensorScreenUsingRightArm() {
		try {
			LFSUtilsAndroid.click(getNFKSignuppageRightArmLnk());
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("Next"));
			getNFKSignuppageApplySensorTxt().verifyPresent();
			Reporter.logWithScreenShot("Start pairing sensor screen using right arm", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Start pairing sensor screen using right arm", MessageTypes.Fail);
		}
	}

//		Shubham
//		Method To Verify The Start Pairing Sensor Screen
	public void userVerifyTheStartPairingSensorScreen() {
		try {
			getNFKSignuppageRightArmLnk().verifyNotSelected();
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("Next"));
			getNFKSignuppageApplySensorTxt().verifyPresent();
			Reporter.logWithScreenShot("Start pairing sensor screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify pairing sensor screen", MessageTypes.Fail);
		}
	}

//	Shubham
//	Method To Verify User See Helpful Tips Screen
	public void userSeeHelpfulTipsScreen() {
		try {
			LFSUtilsAndroid.click(getNFKSignuppageApplySensorBtn());
			LFSUtilsAndroid.click(getNFKSignuppageHelpfulTipsBtn());
			getNFKSignuppageHelpfulTipsTextBtn().verifyPresent();
			getNFKSignuppageHelpfulTipsCrossBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKSignuppageHelpfulTipsCrossBtn());
			getNFKSignuppageHelpfulTipsBtn().verifyPresent();
			LFSUtilsAndroid.click(getNFKSignuppageHelpfulTipsPairBtn());
			LFSUtilsAndroid.click(getNFKSignuppageWhileUsingTheAppTxt());
			getNFKSignuppageTimeStaticText("Cancel").verifyPresent("cancel");
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("Cancel"));
			LFSUtilsAndroid.click(getNFKSafetyonboardingBackBtn());
			LFSUtilsAndroid.click(getNFKSignuppageRightArmLnk());
			Reporter.logWithScreenShot("Verify see helpful tips screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to verify see helpful tips screen", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method To Verify Skip Button And Verify Home Screen
	public void SkipButtonAndVerifyHomeScreen() {
		LFSUtilsAndroid.click(getNFKApplysensorSkipBtn());
	}

//	Shubham
//	Method To Apply Sensor Screen
	public void userApplySensorscreen() {
		try {
			getNFKApplysensorSkipBtn().verifyPresent();
			getNFKSignuppageApplySensorTxt().verifyPresent();
			getNFKSignuppageRightAbdomenButtonBtn().verifyPresent();
			getNFKSignuppageLeftAbdomenButtonBtn().verifyPresent();
			getNFKSignuppageLeftArmBtn().verifyPresent();
			getNFKSignuppageRightArmLnk().verifyPresent();
			getNFKsignuppagesafetynextbtn().verifyPresent();
			getNFKSafetyonboardingBackBtn().verifyPresent();
			Reporter.logWithScreenShot("Apply sensor screen", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify sensor screen", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method Back To Apply Sensor Screen
	public void backToApplySensorScreen() {
		try {
			LFSUtilsIOS.click(getNFKsignuppagesafetynextbtn());
			LFSUtilsIOS.click(getNFKsignuppagesafetynextbtn());
			LFSUtilsIOS.click(getNFKSignuppageTimeStaticText("Cancel"));
			LFSUtilsIOS.click(getNFKSignuppageTimeStaticText("Back"));
			Reporter.logWithScreenShot("Back to apply sensor screen", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to back to apply sensor screen", MessageTypes.Fail);

		}
	}
//Shubham
//	Method to verify sensor application screen in help menu
	public void verifySensorApplicationScreenInHelpMenu() {
		try {
			LFSUtilsAndroid.click(getNFKSignuppageSensorApplicationBtn());
			LFSUtilsAndroid.click(getNFKSignuppageHowToApplyInHelpMenuBtn());
			getNFKSignuppageHealthcareInstructionsBtn()
					.verifyPresent(LFSUtilsAndroid.getPropString("safetyOnboarding.applySensor.descriptionLabel"));
			Reporter.logWithScreenShot("Verify sensor application in help menu", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify sensor application in help menu", MessageTypes.Fail);
		}
	}

	public void verifyTapsOnPairSensorButton() {
		LFSUtilsIOS.click(getNFKSignuppagePairSensorHomeScreenBtn());

	}
//Shubham
//	Method to verify informative text
	public void verifyInformativeText() {
		try {
//			getNFKiosApplysensorTitle().verifyPresent(LFSUtilsAndroid.getPropString("help.sensor.apply.title"));
			getNFKSignuppageDoneBtn().verifyPresent(LFSUtilsAndroid.getPropString("appCommon.done"));
			getNFKSignuppageHealthcareInstructionsBtn()
					.verifyPresent(LFSUtilsAndroid.getPropString("safetyOnboarding.applySensor.descriptionLabel"));
			LFSUtilsAndroid.click(getNFKSignuppageDoneBtn());
			Reporter.logWithScreenShot("Verify information text", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify information text", MessageTypes.Fail);
		}
	}
	//Shubham
//	Method to verify clicks on pair sensor button and verify informative text
	public void clicksOnPairSensorButtonAndUserVerifyInformativeText() {
		try {
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("PAIR SENSOR"));
			getNFKSignuppageHealthcareInstructionsBtn()
					.verifyPresent(LFSUtilsAndroid.getPropString("safetyOnboarding.applySensor.descriptionLabel"));
			getNFKSignuppageHelpfulTipsBelow6YearLnk()
					.verifyPresent(LFSUtilsAndroid.getPropString("safetyOnboarding.applySensor.seeHelpfulTips.lnk"));
			getNFKSignuppageFooterLabelTxt()
					.verifyPresent(LFSUtilsAndroid.getPropString("safetyOnboarding.applySensor.footerLabel.txt"));
			getNFKSignuppageCancelBelow6YearBtn().verifyPresent(LFSUtilsAndroid.getPropString("appCommon.cancel"));
			getNFKSignuppageNextBelow6YearBtn().verifyPresent(LFSUtilsAndroid.getPropString("appCommon.next"));
			Reporter.logWithScreenShot("Verify clicks on pair sensor button and verify information text",
					MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify clicks on pair sensor button and verify information text",
					MessageTypes.Fail);

		}
	}
	//Shubham
//	Method to verify pair sensor application
	public void verifypairSensorTheApplication() {
		try {
			if (getNFKSignuppageImportantPopop().isPresent()) {
				LFSUtilsAndroid.click(getNFKsignuppageimportantmessageokbtn());
			} else {
			}
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("Next"));
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("Next"));
			LFSUtilsAndroid.click(getNFKSignuppageTimeStaticText("CONTINUE"));
			LFSUtilsAndroid.click(getNFKSignuppageWhileUsingTheAppTxt());

			Reporter.logWithScreenShot("Verify pair sensor the application", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify pair sensor the application", MessageTypes.Fail);
		}
	}

	public void verifyUserClicksOnTheCancelButton() {
		LFSUtilsAndroid.click(getNFKSignupPageCancelBtn());

	}
	/*
	 * Author: Yogesh Kumar
	 * Description: Method to fill sign up details of Adult patient
	 */
	public void fillAdultDetailsForSignUp(String signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();	
		try {
		if (signupDetails instanceof String) {
			userBean.fillFromConfig(signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
			LFSUtilsAndroid.click(getNFKSignuppageDobField1());
		enterYear();
		LFSUtilsAndroid.enterText(getNFKsignuppageemailtxt(), email1);
		ConfigurationManager.getBundle().setProperty("register.email.key", email1);
		LFSUtilsAndroid.enterText(getNFKsignuppageconfirmemailtxt(),email1);
		LFSUtilsAndroid.enterText(getNFKsignuppagepasswordtxt(), userBean.getPassword());
		ConfigurationManager.getBundle().setProperty("register.pass", userBean.getPassword());
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.enterText(getNFKSignupPageConfirmPasswordTxt(), userBean.getPassword());
		androidDriver.pressKeyCode(4);
		ConfigurationManager.getBundle().setProperty("register.password.key", userBean.getPassword());
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.click(getNFKsignuppagetermofservicecheckbox());
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
		}
	}
	/*
	 * Author: Yogesh Kumar
	 * Description: Method to fill sign up details of dependent
	 */
	public void fillDependentDetailsForSignUp(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		try {
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
			LFSUtilsAndroid.click(getNFKSignupDependentGuardianFname());
		getNFKSignupDependentGuardianFname()
				.sendKeys(userBean.getGuardianfname() + RandomStringUtils.randomAlphabetic(4));
				LFSUtilsAndroid.waitforLoad();
		getNFKSignupDependentGuardianLname().assertPresent("Guardian Last name field");
		getNFKSignupDependentGuardianLname()
				.sendKeys(userBean.getGuardianlname() + RandomStringUtils.randomAlphabetic(4));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKSignupDependentEmailAddressTxt().assertPresent("Email field of Dependent");
		getNFKSignupDependentEmailAddressTxt().click();
		LFSUtilsAndroid.enterText(getNFKSignupDependentEmailAddressTxt(),email1);
//		getNFKSignupDependentEmailAddressTxt().sendKeys(email1);
		Reporter.logWithScreenShot("Entered the email", MessageTypes.Pass);

		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsAndroid.waitforLoad();
		getNFKSignupDependentConfemailaddressTxt().click();
		getNFKSignupDependentConfemailaddressTxt().assertPresent("Confirm Email field of Dependent");
		getNFKSignupDependentConfemailaddressTxt().click();
		LFSUtilsAndroid.enterText(getNFKSignupDependentConfemailaddressTxt(),email1);
//		getNFKSignupDependentConfemailaddressTxt().sendKeys(email1);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 10, 10);
		getNFKSignupDependentPasswordTxt().click();
		getNFKSignupDependentPasswordTxt().assertPresent("Password field on Guardian screen");
		LFSUtilsAndroid.
		waitforLoad();
		LFSUtilsAndroid.enterText(getNFKSignupDependentPasswordTxt(), "Testing@12345");
		getNFKSignupDependentConfpasswordTxt().assertPresent("Confirm password field");
		LFSUtilsAndroid.enterText(getNFKSignupDependentConfpasswordTxt(),"Testing@12345");
		androidDriver.hideKeyboard();
		getNFKSignupDependentCheckAgreementTermBtn().verifyPresent("Terms and privacy policy check box");
		LFSUtilsAndroid.click(getNFKSignupDependentCheckAgreementTermBtn());
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckPromotionalOffersBtn().verifyPresent("opt in check box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("User has entered the Guardian details", MessageTypes.Pass);
		}
	}
}
