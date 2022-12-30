package com.NFK.version1.iOS.pages;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.NFK.support.ApiMethods;
import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.google.common.collect.ImmutableMap;
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
import io.appium.java_client.ios.IOSDriver;

public class SignupPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
    
	
	@FindBy(locator = "NFKios.signupPage.oneTouch.logo")
	private QAFWebElement NFKiosSignupPageOneTouchLogo;
	@FindBy(locator = "NFKios.safetyonboarding.next.btn")
	private QAFWebElement NFKiosSafetyonboardingNextBtn;
	@FindBy(locator = "NFKios.safetyonboarding.back.btn")
	private QAFWebElement NFKiosSafetyonboardingBackBtn;
	@FindBy(locator = "NFKios.safetyonboarding.bloodmeter.image")
	private QAFWebElement NFKiosSafetyonboardingBloodmeterImage;
	@FindBy(locator = "NFKios.safetyonboarding.TrustHowYouFeel.checkbox")
	private QAFWebElement NFKiosSafetyonboardingTrustHowYouFeelCheckbox;
	@FindBy(locator = "NFKios.safetyonboarding.secondscreen.text")
	private QAFWebElement NFKiosSafetyonboardingSecondscreenText;
	@FindBy(locator = "NFKios.safetyonboarding.areaOfCaution.image")
	private QAFWebElement NFKiosSafetyonboardingAreaOfCautionImage;
	@FindBy(locator = "NFKios.safetyonboarding.SupportedUOM.image")
	private QAFWebElement NFKiosSafetyonboardingSupportedUOMImage;
	@FindBy(locator = "NFKios.safetyonboarding.currentReading.image")
	private QAFWebElement NFKiosSafetyonboardingCurrentReadingImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowRisingQuickly.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowRisingQuicklyImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowRising.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowRisingImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowRisingSlowly.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowRisingSlowlyImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowSteady.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowSteadyImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowFallingSlowly.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowFallingSlowlyImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowFalling.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowFallingImage;
	@FindBy(locator = "NFKios.safetyonboarding.trendArrowFallingQuickly.image")
	private QAFWebElement NFKiosSafetyonboardingTrendArrowFallingQuicklyImage;
	@FindBy(locator = "NFKios.safetyonboarding.highReading.image")
	private QAFWebElement NFKiosSafetyonboardingHighReadingImage;
	@FindBy(locator = "NFKios.safetyonboarding.inRangeReading.image")
	private QAFWebElement NFKiosSafetyonboardingInRangeReadingImage;
	@FindBy(locator = "NFKios.safetyonboarding.lowReading.image")
	private QAFWebElement NFKiosSafetyonboardingLowReadingImage;
	@FindBy(locator = "NFKios.signuppage.birthday.month.pkr")
	private QAFWebElement NFKiosSignuppageBirthdayMonthPkr;
	@FindBy(locator = "NFKios.safetyonboarding.seventhScreen.title")
	private QAFWebElement NFKiosSafetyonboardingSeventhScreenTitle;
	@FindBy(locator = "NFKios.signuppage.birthday.date.pkr")
	private QAFWebElement NFKiosSignuppageBirthdayDatePkr;
	@FindBy(locator = "NFKios.safetyonboarding.lowimageview.image")
	private QAFWebElement NFKiosSafetyonboardingLowimageviewImage;
	@FindBy(locator = "NFKios.safetyonboarding.highimageview.image")
	private QAFWebElement NFKiosSafetyonboardingHighimageviewImage;
	@FindBy(locator = "NFKios.signuppage.timingPicker.year.pkr")
	private QAFWebElement NFKiosSignuppageTimingpickerYearPkr;
	@FindBy(locator = "NFKios.safetyonboarding.alertNotificationScreen.text2")
	private QAFWebElement NFKiosSafetyonboardingAlertNotificationScreenText2;
	@FindBy(locator = "NFKios.safetyonboarding.ok.btn")
	private QAFWebElement NFKiosSafetyonboardingOkBtn;
	@FindBy(locator = "NFKios.safetyonboarding.alert.image")
	private QAFWebElement NFKiosSafetyonboardingAlertImage;
	@FindBy(locator = "NFKios.safetyonboarding.smartphone.image")
	private QAFWebElement NFKiosSafetyonboardingSmartphoneImage;
	@FindBy(locator = "NFKios.safetyonboarding.moreMenuAlert.label")
	private QAFWebElement NFKiosSafetyonboardingMoreMenuAlertLabel;
	@FindBy(locator = "NFKios.safetyonboarding.urgentLowGlucoseAlert.image")
	private QAFWebElement NFKiosSafetyonboardingUrgentLowGlucoseAlertImage;
	@FindBy(locator = "NFKios.safetyonboarding.urgentLowGlucoseAlarm.image")
	private QAFWebElement NFKiosSafetyonboardingUrgentLowGlucoseAlarmImage;
	@FindBy(locator = "NFKios.safetyonboarding.setting.btn")
	private QAFWebElement NFKiosSafetyonboardingSettingBtn;
	@FindBy(locator = "NFKios.safetyonboarding.popup.text1")
	private QAFWebElement NFKiosSafetyonboardingPopupText1;
	@FindBy(locator = "NFKios.safetyonboarding.popup.text2")
	private QAFWebElement NFKiosSafetyonboardingPopupText2;
	@FindBy(locator = "NFKios.safetyonboarding.popup.allow.btn")
	private QAFWebElement NFKiosSafetyonboardingPopupAllowBtn;
	@FindBy(locator = "NFKios.safetyonboarding.popup.DontAllow.btn")
	private QAFWebElement NFKiosSafetyonboardingPopupDontAllowBtn;
	@FindBy(locator = "NFKios.safetyonboarding.AreasOfCaution.checkbox")
	private QAFWebElement NFKiosSafetyonboardingAreasOfCautionCheckbox;
	@FindBy(locator = "NFKios.safetyonboarding.TreatmentDecisions.checkbox")
	private QAFWebElement NFKiosSafetyonboardingTreatmentDecisionsCheckbox;
	@FindBy(locator = "NFKios.safetyonboarding.AlertNotificationsPageView.checkbox")
	private QAFWebElement NFKiosSafetyonboardingAlertNotificationsPageViewCheckbox;
	@FindBy(locator = "NFKios.safetyonboarding.Applysensor.skip.btn")
	private QAFWebElement NFKiosSafetyonboardingApplysensorSkipBtn;
	@FindBy(locator = "NFKios.safetyonboarding.firstscreen.text1")
	private QAFWebElement NFKiosSafetyonboardingFirstscreenText1;
	@FindBy(locator = "NFKios.safetyonboarding.firstscreen.text2")
	private QAFWebElement NFKiosSafetyonboardingFirstscreenText2;
	@FindBy(locator = "NFKios.safetyonboarding.thirdscreen.text1")
	private QAFWebElement NFKiosSafetyonboardingThirdscreenText1;
	@FindBy(locator = "NFKios.safetyonboarding.thirdscreen.text2")
	private QAFWebElement NFKiosSafetyonboardingThirdscreenText2;
	@FindBy(locator = "NFKios.safetyonboarding.eightscreen.text1")
	private QAFWebElement NFKiosSafetyonboardingEightscreenText1;
	@FindBy(locator = "NFKios.safetyonboarding.eightscreen.text2")
	private QAFWebElement NFKiosSafetyonboardingEightscreenText2;
	
	
	
	@FindBy(locator = "NFKios.signupPage.oneTouch.icon")
	private QAFWebElement NFKiosSignuppageOnetouchIcon;
	@FindBy(locator = "NFKios.signupPage.termOfService.lbl")
	private QAFWebElement NFKiosSignuppageTermofserviceLbl;
	@FindBy(locator = "NFKios.signupPage.termOfService.cBox")
	private QAFWebElement NFKiosSignuppageTermofserviceCbox;
	@FindBy(locator = "NFKios.signupPage.countryTerms.lbl")
	private QAFWebElement NFKiosSignuppageCountrytermsLbl;
	@FindBy(locator = "NFKios.signupPage.countryTerms.cBox")
	private QAFWebElement NFKiosSignuppageCountrytermsCbox;
	@FindBy(locator = "NFKios.signupPage.emailAdress.tBox")
	private QAFWebElement NFKiosSignuppageEmailadressTbox;
	@FindBy(locator = "NFKios.signupPage.confirmEmailAdress.tBox")
	private QAFWebElement NFKiosSignuppageConfirmemailadressTbox;
	@FindBy(locator = "NFKios.signupPage.password.tBox")
	private QAFWebElement NFKiosSignuppagePasswordTbox;
	@FindBy(locator = "NFKios.signupPage.dateOfBirth.tBox")
	private QAFWebElement NFKiosSignupPageDateOfBirthTBox;
	@FindBy(locator = "NFKios.signupPage.signUp.btn")
	private QAFWebElement NFKiosSignuppageSignupBtn;
	@FindBy(locator = "NFKios.signupPage.login.lnk")
	private QAFWebElement NFKiosSignuppageLoginLnk;
	@FindBy(locator = "NFKios.signupPage.enableTouchID.btn")
	private QAFWebElement NFKiosSignuppageEnabletouchidBtn;
	@FindBy(locator = "NFKios.signupPage.keepMeLogIn.btn")
	private QAFWebElement NFKiosSignuppageKeepmeloginBtn;
	@FindBy(locator = "NFKios.signupPage.requirLogin.btn")
	private QAFWebElement NFKiosSignuppageRequirloginBtn;
	@FindBy(locator = "NFKios.signuppage.firstname.txt")
	private QAFWebElement NFKiosSignuppageFirstNameTxt;
	@FindBy(locator = "NFKios.signuppage.lastname.txt")
	private QAFWebElement NFKiosSignuppageLastNameTxt;
	@FindBy(locator = "NFKios.signuppage.confirmpassword.txt")
	private QAFWebElement NFKiosSignuppageConfirmPasswordTxt;
	@FindBy(locator = "NFKios.signuppage.officecode.txt")
	private QAFWebElement NFKiosSignuppageOfficeCodeTxt;
	@FindBy(locator = "NFKios.signuppage.clinicinfo.txt")
	private QAFWebElement NFKiosSignuppageClinicinfoTxt;
	@FindBy(locator = "NFKios.signuppage.birthday.month.pkr")
	private QAFWebElement NFKiosSignupPageBirthdayMonthPkr;
	@FindBy(locator = "NFKios.signupPage.birthday.date.pkr")
	private QAFWebElement NFKiosSignupPageBirthdayDatePkr;
	@FindBy(locator = "NFKios.signuppage.timingPicker.year.pkr")
	private QAFWebElement NFKiosSignupPageTimingPickerYearPkr;
	@FindBy(locator = "NFKios.signuppage.signup.ok.btn")
	private QAFWebElement NFKiosSignuppageSingupOkBtn;
	@FindBy(locator = "NFKios.signuppage.optin.iagree.lbl")
	private QAFWebElement NFKiosSignuppageOptinIagreeLbl;
	@FindBy(locator = "NFKios.signuppage.optin.cancel.lbl")
	private QAFWebElement NFKiosSignuppageOptinCancelLbl;
	@FindBy(locator = "NFKios.signuppage.optin.title.lbl")
	private QAFWebElement NFKiosSignuppageOptinTitleLbl;
	@FindBy(locator = "NFKios.signuppage.greeCheck.img")
	private QAFWebElement NFKiosSignuppagegreenCheckImg;
	@FindBy(locator = "NFKios.signuppage.checkebox")
	private QAFWebElement NFKiosSignuppageCheckebox;
	@FindBy(locator = "NFKios.signuppage.Agree.lbl")
	private QAFWebElement NFKiosSignuppageAgreeLbl;
	@FindBy(locator = "NFKios.signuppage.hcp.email.txt")
	private QAFWebElement NFKiosSignuppageHcpEmailTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.pass.txt")
	private QAFWebElement NFKiosSignuppageHcpPassTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.confirmpass.txt")
	private QAFWebElement NFKiosSignuppageHcpConfirmpassTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.datofbirth.txt")
	private QAFWebElement NFKiosSignuppageHcpDatofbirthTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.term.chk")
	private QAFWebElement NFKiosSignuppageHcpTermChk;
	@FindBy(locator = "NFKios.signupPage.option.cancel.btn")
	private QAFWebElement NFKiosSignupPageOptionCancelBtn;
	@FindBy(locator = "NFKios.signuppage.optin.check.box")
	private QAFWebElement NFKiossignuppageoptincheckbox;
	@FindBy(locator = "NFKios.signuppage.optin.Iagree.btn")
	private QAFWebElement NFKiossignuppageoptinIagreebtn;
	@FindBy(locator = "NFKios.signuppage.optin.title")
	private QAFWebElement NFKiossignuppageoptintitle;
	// SG Locators for German Unit of Measure Page

	@FindBy(locator = "NFKios.signuppage.term.lnk")
	private QAFWebElement NFKiosSignupPageTermLnk;
	@FindBy(locator = "NFKios.signuppage.privecy.lnk")
	private QAFWebElement NFKiosSignupPagePrivecyLnk;
	@FindBy(locator = "NFKios.signupPage.meterskip.btn")
	private QAFWebElement NFKiosSignupPageMeterskipBtn;
	@FindBy(locator = "NFKios.signupPage.errorMessage.txt")
	private QAFWebElement NFKiosSignupPageErrorMessageTxt;
	@FindBy(locator = "NFKios.signupPage.errorCancel.img")
	private QAFWebElement NFKiosSignupPageErrorCancelImg;
	@FindBy(locator = "NFKios.signupPage.optin.customer.service.link")
	private QAFWebElement NFKiosSignupPageOptinCustomerServiceLink;
	@FindBy(locator = "NFKios.signupPage.notification.allow.popup")
	private QAFWebElement NFKiosSignupPageNotificationAllowPopup;
	@FindBy(locator = "NFKios.signupPage.notification.dontallow.popup")
	private QAFWebElement NFKiosSignupPageNotificationDontallowPopup;
	@FindBy(locator = "NFKios.signupPage.optin.privecy.lnk")
	private QAFWebElement NFKiosSignupPageOptinPrivecylnk;
	@FindBy(locator = "NFKios.signupPage.updateNotice.check.img")
	private QAFWebElement NFKiosSignupPageUpdateNoticeCheckBoxImg;
	@FindBy(locator = "NFKios.signupPage.updateNotice.continue.btn")
	private QAFWebElement NFKiosSignupPageUpdateNoticeContinueBtn;
	@FindBy(locator = "NFKios.signupPage.invalidClinicCode.close.btn")
	private QAFWebElement NFKiosSignupPageInvalidClinicCodeClosebtn;
	@FindBy(locator = "NFKios.signup.gender.selection.male.btn")
	private QAFWebElement NFKiosSignupGenderSelectionMaleBtn;
	@FindBy(locator = "NFKios.signup.gender.selection.female.btn")
	private QAFWebElement NFKiosSignupGenderSelectionFemaleBtn;
	@FindBy(locator = "NFKios.signup.diabetestype.type1.btn")
	private QAFWebElement NFKiosSignupDiabetesTypeType1btn;
	@FindBy(locator = "NFKios.signup.diabetestype.type2.btn")
	private QAFWebElement NFKiosSignupDiabetesTypeType2btn;
	@FindBy(locator = "NFKios.signup.diabetestype.gestational.btn")
	private QAFWebElement NFKiosSignupDiabetesTypeGestationalbtn;
	@FindBy(locator = "NFKios.signuppage.secondscreen.continue.btn")
	private QAFWebElement NFKiosSignupPageSecondScreenContinueBtn;
	@FindBy(locator = "NFKios.signuppage.back.button")
	private QAFWebElement NFKiosSignupPageBackButton;
	@FindBy(locator = "NFKios.signuppage.addclinic.send.btn")
	private QAFWebElement NFKiosSignuppageAddclinicSendBtn;
	@FindBy(locator = "NFKios.signuppage.addclinic.cancel.btn")
	private QAFWebElement NFKiosSignuppageAddclinicCancelBtn;
	@FindBy(locator = "NFKios.signuppage.addclinic.termchk.btn")
	private QAFWebElement NFKiosSignuppageAddclinicTermchkBtn;
	@FindBy(locator = "NFKios.signuppage.addedclinic.no.txt")
	private QAFWebElement NFKiosSignuppageAddedclinicNoTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.button")
	private QAFWebElement NFKiosDecisionPageSignupButton;
	@FindBy(locator = "NFKios.decisionpage.yes.login.button")
	private QAFWebElement NFKiosDecisionPageYesLoginButton;
	@FindBy(locator = "NFKios.signuppage.back.btn")
	private QAFWebElement NFKiosSignUpPageBackBtn;
	@FindBy(locator = "NFKios.signupPage.safetynext.btn")
	private QAFWebElement NFKiosSignUpPageSafetyNextBtn;
	@FindBy(locator = "NFKios.signupPage.safetyboard.TrustHowYouFeel.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardTrustHowYouFeelCBox;
	@FindBy(locator = "NFKios.signupPage.safetyonboarding.alertok.btn")
	private QAFWebElement NFKiosSignupPageSafetyonboardingAlertokBtn;
	@FindBy(locator = "NFKios.signupPage.safetyboard.NoMR.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardNoMRCBox;
	@FindBy(locator = "NFKios.signupPage.safetyboard.TreatmentDecisions.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardTreatmentDecisionsCBox;
	@FindBy(locator = "NFKios.signupPage.safetyboard.AlertNotifications.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardAlertNotificationsCBox;
	@FindBy(locator = "NFKios.signupPage.safetyboard.Notifications.popup")
	private QAFWebElement NFKiosSignupPageSafetyboardNotificationsPopup;
	@FindBy(locator = "NFKios.signupPage.safetyboard.Notifications.allow.popup")
	private QAFWebElement NFKiosSignupPageSafetyboardNotificationsAllowPopup;
	@FindBy(locator = "NFKios.safteyonboarding.settings.btn")
	private QAFWebElement NFKiosSafteyonboardingSettingsBtn;
	@FindBy(locator = "NFKios.settings.notification.btn")
	private QAFWebElement NFKiosSettingsNotificationBtn;
	@FindBy(locator = "NFKios.signupPage.pair.sensor.title")
	private QAFWebElement NFKiosSignupPagePairSensorTitle;
	@FindBy(locator = "NFKios.settings.back.btn")
	private QAFWebElement NFKiosSettingsBackBtn;
	@FindBy(locator = "NFKios.signupPage.pair.sensor.skip.btn")
	private QAFWebElement NFKiosSignupPagePairSensorSkipBtn;
	@FindBy(locator = "NFKios.signupPage.safetydone.btn")
	private QAFWebElement NFKiosSignUpPageSafetyDoneBtn;
	@FindBy(locator = "NFKios.signupPage.start.sensor.title")
	private QAFWebElement NFKiosSignupPageStartSensorTitle;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.btn")
	private QAFWebElement NFKiosDecisionPageSignupMyselfBtn;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.btn")
	private QAFWebElement NFKiosDecisionPageSignupDependentBtn;
	@FindBy(locator = "NFKios.decisionpage.login.own.btn")
	private QAFWebElement NFKiosDecisionPageLoginOwnBtn;
	@FindBy(locator = "NFKios.decisionpage.login.dependent.btn")
	private QAFWebElement NFKiosDecisionPageLoginDependentBtn;

	@FindBy(locator = "NFKios.signuppage.dependent.guardian.fname")
	private QAFWebElement NFKiosSignuppageDependentGuardianFname;
	@FindBy(locator = "NFKios.signuppage.dependent.guardian.lname")
	private QAFWebElement NFKiosSignuppageDependentGuardianLname;
	@FindBy(locator = "NFKios.signuppage.dependent.email")
	private QAFWebElement NFKiosSignuppageDependentEmail;
	@FindBy(locator = "NFKios.signuppage.dependent.confirm.email")
	private QAFWebElement NFKiosSignuppageDependentConfirmEmail;
	@FindBy(locator = "NFKios.signuppage.dependent.continue")
	private QAFWebElement NFKiosSignuppageDependentContinue;
	@FindBy(locator = "NFKios.signuppage.dependent.terms.checkbox")
	private QAFWebElement NFKiosSignuppageDependentTermsCheckbox;
	@FindBy(locator = "NFKios.signuppage.dependent.marketing.checkbox")
	private QAFWebElement NFKiosSignuppageDependentMarketingCheckbox;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.fname")
	private QAFWebElement NFKiosSignuppageDependentFname;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.lname")
	private QAFWebElement NFKiosSignuppageDependentLname;
	@FindBy(locator = "NFKios.signuppage.dependent.Clinic")
	private QAFWebElement NFKiosSignuppageDependentClinic;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonMale")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonMale;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonFemale")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonFemale;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonTypeOne")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonTypeOne;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonTypeTwo")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonTypeTwo;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.signUpButton")
	private QAFWebElement NFKiosSignuppageDependentSignUpButton;
	@FindBy(locator = "NFKios.signuppage.dependent.guardianaccount.text")
	private QAFWebElement NFKiosSignuppageDependentGuardianaccountText;
	@FindBy(locator = "NFKios.signuppage.dependent.password")
	private QAFWebElement NFKiosSignuppageDependentPassword;
	@FindBy(locator = "NFKios.signuppage.dependent.confirm.password")
	private QAFWebElement NFKiosSignuppageDependentConfirmPassword;


	@FindBy(locator = "NFKios.signup.page.UOM.select.title")
	private QAFWebElement NFKsignuppageUomselecttitle;
	@FindBy(locator = "NFKios.signup.page.UOM.select.text")
	private QAFWebElement NFKsignuppageUomselecttext;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mgdl.button.text")
	private QAFWebElement NFKsignuppageUomselectMgdlbuttontext;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mgdl.button")
	private QAFWebElement NFKsignuppageUomselectMgdlbutton;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mmol.button.text")
	private QAFWebElement NFKsignuppageUomselectMmolbuttontext;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mmol.button")
	private QAFWebElement NFKsignuppageUomselectMmolbutton;
	@FindBy(locator = "NFKios.signup.page.UOM.select.text1")
	private QAFWebElement NFKsignuppageUomselecttext1;

	@FindBy(locator = "NFKios.signuppage.clinic.name")
	private QAFWebElement NFKiosSignuppageClinicName;
	@FindBy(locator = "NFKios.signuppage.clinic.phone")
	private QAFWebElement NFKiosSignuppageClinicPhone;
	@FindBy(locator = "NFKios.signuppage.clinic.msg.txt")
	private QAFWebElement NFKiosSignuppageClinicMsgTxt;
	@FindBy(locator = "NFKios.signuppage.clinic.cancel.btn")
	private QAFWebElement NFKiosSignuppageClinicCancelBtn;
	@FindBy(locator = "NFKios.signuppage.update.notice.checkbox")
	private QAFWebElement NFKiosSignuppageUpdateNoticeCheckbox;

	@FindBy(locator = "NFKios.settings.backToApp.btn")
	private QAFWebElement NFKiosSettingsBackToAppBtn;

	@FindBy(locator = "NFKios.signupPage.safetyboard.UrgentLowNotification.txt")
	private QAFWebElement NFKiosSignupPageSafetyboardUrgentLowNotificationtxt;
	@FindBy(locator = "NFKios.safteyonboarding.back.btn")
	private QAFWebElement NFKiosSafteyboardingBackBtn;
	@FindBy(locator = "NFKios.signupPage.safetyboard.PairSensorScreen.txt")
	private QAFWebElement NFKiosSignupPageSafetyboardPairSensorScreentxt;

	// new screen after saftey onboarding
	@FindBy(locator = "NFKios.applysensor.title")
	private QAFWebElement NFKiosApplysensorTitle;
	@FindBy(locator = "NFKios.applysensor.skip.btn")
	private QAFWebElement NFKiosApplysensorSkipBtn;
	// Invalid Email Message
	@FindBy(locator = "NFKios.signupPage.error.msg.email")
	private QAFWebElement NFKiosSignupPageErrorMsgEmail;

	@FindBy(locator = "NFKios.signupPage.error.icon")
	private QAFWebElement NFKiosSignupPageErrorIcon;

	@FindBy(locator = "NFKios.signupPage.error.msg.password")
	private QAFWebElement NFKiosSignupPageErrorMsgPassword;

	@FindBy(locator = "NFKios.signupPage.error.msg.comfirm.password")
	private QAFWebElement NFKiosSignupPageErrorMsgComfirmPassword;

	@FindBy(locator = "NFKios.signupPage.errorLabel")
	private QAFWebElement NFKiosSignupPageErrorLabel;

	@FindBy(locator = "NFKios.signupPage.age.restriction.popup.title")
	private QAFWebElement NFKiosSignupPageAgeRestrictionPopupTitle;

	@FindBy(locator = "NFKios.signupPage.age.restriction.popup.close")
	private QAFWebElement NFKiosSignupPageAgeRestrictionPopupClose;
	@FindBy(locator = "NFKios.signuppage.tellUsAbout.txt")
	private QAFWebElement NFKiosSignuppageTellUsAboutTxt;

	public QAFWebElement getNFKiosSignuppageTellUsAboutTxt() {
		return NFKiosSignuppageTellUsAboutTxt;
	}
	@FindBy(locator = "NFKios.signupPage.age.restriction.popup.ok")
	private QAFWebElement NFKiosSignupPageAgeRestrictionPopupOK;
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
	@FindBy(locator = "NFKios.signupPage.emancipation.email")
	private QAFWebElement NFKiosSignupPageEmancipationEmail;

	@FindBy(locator = "NFKios.signupPage.emancipation.confirmEmail")
	private QAFWebElement NFKiosSignupPageEmancipationConfirmEmail;

	@FindBy(locator = "NFKios.signupPage.emancipation.password")
	private QAFWebElement NFKiosSignupPageEmancipationPassword;

	@FindBy(locator = "NFKios.signupPage.emancipation.confirmPassword")
	private QAFWebElement NFKiosSignupPageEmancipationConfirmPassword;

	@FindBy(locator = "NFKios.signupPage.emancipation.termsAndPrivacy")
	private QAFWebElement NFKiosSignupPageEmancipationTermsAndPrivacy;

	@FindBy(locator = "NFKios.signupPage.emancipation.marketingAgreement")
	private QAFWebElement NFKiosSignupPageEmancipationMarketingAgreement;

	@FindBy(locator = "NFKios.signupPage.emancipation.continue")
	private QAFWebElement NFKiosSignupPageEmancipationContinueBtn;

	@FindBy(locator = "NFKios.signupPage.dependentprofile.title")
	private QAFWebElement NFKiosSignupPageDependentprofileTitle;
	@FindBy(locator = "NFKios.signupPage.logo")
	private QAFWebElement NFKiosSignupPageLogo;

	@FindBy(locator = "NFKios.signuppage.dependent.emailLabel")
	private QAFWebElement NFKiosSignuppageDependentEmailLabel;

	@FindBy(locator = "NFKios.signupPage.notification.bluetooth.popup.setting")
	private QAFWebElement NFKiosSignupPageNotificationBluetoothPopupSetting;

	@FindBy(locator = "NFKios.signupPage.notification.bluetooth.popup.close")
	private QAFWebElement NFKiosSignupPageNotificationBluetoothPopupClose;
	@FindBy(locator = "NFKios.signupPage.sensorpage.nextbtn")
	private QAFWebElement NFKiosSignupPageSensorpageNextbtn;
	@FindBy(locator = "NFKios.signupPage.dobCancel.btn")
	private QAFWebElement NFKiosSignupPageDobCancelBtn;
	@FindBy(locator = "NFKios.signupPage.greenLink.btn")
	private QAFWebElement NFKiosSignupPageGreenLinkBtn;
	@FindBy(locator = "NFKios.signupPage.greenLinkText.btn")
	private QAFWebElement NFKiosSignupPageGreenLinkTextBtn;
	@FindBy(locator = "NFKios.signupPage.privacy.lnk")
	private QAFWebElement NFKiosSignupPagePrivacyLnk;
	@FindBy(locator = "NFKios.signupPage.privacyPolicy.txt")
	private QAFWebElement NFKiosSignupPagePrivacyPolicyTxt;
	@FindBy(locator = "NFKios.signupPage.clinicCode.btn")
	private QAFWebElement NFKiosSignupPageClinicCodeBtn;
	@FindBy(locator = "NFKios.signupPage.clinicCode.txt")
	private QAFWebElement NFKiosSignupPageClinicCodeTxt;
	@FindBy(locator = "NFKios.signupPage.checkBox.btn")
	private QAFWebElement NFKiosSignupPageCheckBoxBtn;
	@FindBy(locator = "NFKios.signupPage.send.btn")
	private QAFWebElement NFKiosSignupPageSendBtn;
	@FindBy(locator = "NFKios.signupPage.applySensor.btn")
	private QAFWebElement NFKiosSignupPageApplySensorBtn;
	@FindBy(locator = "NFKios.signupPage.sensorWear.btn")
	private QAFWebElement NFKiosSignupPageSensorWearBtn;
	@FindBy(locator = "NFKios.signupPage.helpfulTips.btn")
	private QAFWebElement NFKiosSignupPageHelpfulTipsBtn;
	@FindBy(locator = "NFKios.signupPage.backUpperArm.btn")
	private QAFWebElement NFKiosSignupPageBackUpperArmBtn;
	@FindBy(locator = "NFKios.signupPage.washAndDryHand.btn")
	private QAFWebElement NFKiosSignupPageWashAndDryHandBtn;
	@FindBy(locator = "NFKios.signupPage.removePaperBacking.btn")
	private QAFWebElement NFKiosSignupPageRemovePaperBackingBtn;
	@FindBy(locator = "NFKios.signupPage.removeApplicator.btn")
	private QAFWebElement NFKiosSignupPageRemoveApplicatorBtn;
	@FindBy(locator = "NFKios.signupPage.adhesivePatch.btn")
	private QAFWebElement NFKiosSignupPageAdhesivePatchBtn;
	@FindBy(locator = "NFKios.safetyOnBoarding.back.btn")
	private QAFWebElement NFKiosSafetyOnBoardingBackBtn;
	@FindBy(locator = "NFKios.signupPage.rightAbdomenButton.btn")
	private QAFWebElement NFKiosSignupPageRightAbdomenButtonBtn;
	@FindBy(locator = "NFKios.signupPage.leftAbdomenButton.btn")
	private QAFWebElement NFKiosSignupPageLeftAbdomenButtonBtn;
	@FindBy(locator = "NFKios.signupPage.leftArmButton.btn")
	private QAFWebElement NFKiosSignupPageLeftArmButtonBtn;
	@FindBy(locator = "NFKios.signupPage.rightArmButton.btn")
	private QAFWebElement NFKiosSignupPageRightArmButtonBtn;
	@FindBy(locator = "NFKios.signupPage.rightArm.lnk")
	private QAFWebElement NFKiosSignupPageRightArmLnk;
	@FindBy(locator = "NFKios.signupPage.safetyOnBoardingLastScreen.btn")
	private QAFWebElement NFKiosSignupPageSafetyOnBoardingLastScreenBtn;
	@FindBy(locator = "NFKios.signupPage.next.btn")
	private QAFWebElement NFKiosSignupPageNextBtn;
	@FindBy(locator = "NFKios.signupPage.startPairSensor.btn")
	private QAFWebElement NFKiosSignupPageStartPairSensorBtn;
	@FindBy(locator = "NFKios.signupPage.pairSensor.btn")
	private QAFWebElement NFKiosSignupPagePairSensorBtn;
	@FindBy(locator = "NFKios.signupPage.sensorWearText.btn")
	private QAFWebElement NFKiosSignupPageSensorWearTextBtn;
	@FindBy(locator = "NFKios.signupPage.helpfulTipsText.btn")
	private QAFWebElement NFKiosSignupPageHelpfulTipsTextBtn;
	@FindBy(locator = "NFKios.signupPage.helpfulTipsCross.btn")
	private QAFWebElement NFKiosSignupPageHelpfulTipsCrossBtn;
	@FindBy(locator = "NFKios.signupPage.pairSensorCancel.btn")
	private QAFWebElement NFKiosSignupPagePairSensorCancelBtn;
	public QAFWebElement getNFKiossettingsMainScreenButtonBtn() {
		return NFKiossettingsMainScreenButton;
	}
	@FindBy(locator = "NFKios.applySensor.title")
	private QAFWebElement NFKiosApplySensorTitle;
	@FindBy(locator = "NFKios.signuppage.approveLocation.txt")
	private QAFWebElement NFKiosSignuppageApproveLocationTxt;
	@FindBy(locator = "NFKios.signupPage.applyLink.btn")
	private QAFWebElement NFKiosSignupPageApplyLinkBtn;
	@FindBy(locator = "NFKios.signupPage.cleanDisinfect.txt")
	private QAFWebElement NFKiosSignupPageCleanDisinfectTxt;
	@FindBy(locator = "NFKios.signupPage.cancel.btn")
	private QAFWebElement NFKiosSignupPageCancelBtn;

	@FindBy(locator = "NFKios.signuppage.footerLabel.txt")
	private QAFWebElement NFKiosSignuppageFooterLabelTxt;
	@FindBy(locator = "NFKios.signuppage.sensorApplication.txt")
	private QAFWebElement NFKiosSignuppageSensorApplicationTxt;
	@FindBy(locator = "NFKios.signuppage.pairSensor.btn")
	private QAFWebElement NFKiosSignuppagePairSensorBtn;
	@FindBy(locator = "NFKios.signuppage.applySensor.txt")
	private QAFWebElement NFKiosSignuppageApplySensorTxt;
	@FindBy(locator = "NFKios.signupPage.healthcareInstructions.btn")
	private QAFWebElement NFKiosSignupPageHealthcareInstructionsBtn;
	@FindBy(locator = "NFKios.signuppage.unpairSensor.txt")
	private QAFWebElement NFKiosSignuppageUnpairSensorTxt;
	@FindBy(locator = "NFKios.signupPage.done.btn")
	private QAFWebElement NFKiosSignupPageDoneBtn;
	@FindBy(locator = "NFKios.safetyOnBoarding.stopSensor.btn")
	private QAFWebElement NFKiossafetyOnBoardingStopSensorBtn;
	@FindBy(locator = "NFKios.safetyOnBoarding.2to5YearsPageSkip.btn")
	private QAFWebElement NFKiosSafetyOnBoarding2to5YearsPageSkipBtn;
	@FindBy(locator = "NFKios.safetyOnBoarding.sensorApplication.howToApply.lnk")
	private QAFWebElement NFKiosSafetyOnBoardingSensorApplicationHowToApplyLnk;
	@FindBy(locator = "NFKios.signuppage.importantPopup.txt")
	private QAFWebElement NFKiosSignuppageImportantPopupTxt;
	@FindBy(locator = "NFKios.mobileSetting.settingsMainScreen")
	private QAFWebElement NFKiossettingsMainScreenButton;
	
	public QAFWebElement getNFKiosNFKiosSettingGeneralBtn() {
		return NFKiosSettingGeneralBtn;
	}
	@FindBy(locator = "NFKios.mobileSetting.General")
	private QAFWebElement NFKiosSettingGeneralBtn;
	
	public QAFWebElement getNFKiosSettingvpnDeviceManagementBtn() {
		return NFKiosSettingvpnDeviceManagement;
	}
	@FindBy(locator = "NFKios.mobileSetting.vpnDeviceManagement")
	private QAFWebElement NFKiosSettingvpnDeviceManagement;
	
	public QAFWebElement getNFKiosSettingDeviceManagementBtn() {
		return NFKiosSettingDeviceManagement;
	}
	@FindBy(locator = "NFKios.mobileSetting.deviceManagement")
	private QAFWebElement NFKiosSettingDeviceManagement;
//
	@FindBy(locator = "NFKios.browser.connect")
	private QAFWebElement browserConnectButton;
	
	public QAFWebElement getBrowserConnectButton() {
		return browserConnectButton;
	}
	
	@FindBy(locator = "NFKios.browser.welcome")
	private QAFWebElement webBrowserWelcomeButton;
	public QAFWebElement getWebBrowserWelcomeButton() {
		return webBrowserWelcomeButton;
	}
	@FindBy(locator = "NFKios.browser.glucoseInformation")
	private QAFWebElement webBrowserGlucoseInformationButton;
	public QAFWebElement getwebBrowserGlucoseInformationButton() {
		return webBrowserGlucoseInformationButton;
	}
	@FindBy(locator = "NFKios.browser.DownloadTheApp")
	private QAFWebElement webBrowserDownloadTheAppButton;
	public QAFWebElement getwebBrowserDownloadTheAppButton() {
		return webBrowserDownloadTheAppButton;
	}
	@FindBy(locator = "NFKios.browser.startFollowingDSPLPatient")
	private QAFWebElement webBrowserStartFollowingDSPLPatientButton;
	public QAFWebElement getWebBrowserStartFollowingDSPLPatientButton() {
		return webBrowserStartFollowingDSPLPatientButton;
	}
	@FindBy(locator = "NFKios.browser.SetUpNotificationsForInformation")
	private QAFWebElement webBrowserSetUpNotificationsForInformationButton;
	public QAFWebElement getWebBrowserSetUpNotificationsForInformationButton() {
		return webBrowserSetUpNotificationsForInformationButton;
	}
	@FindBy(locator = "NFKios.browser.mostRecentlyAvailableData")
	private QAFWebElement webBrowserMostRecentlyAvailableDataButton;
	public QAFWebElement getWebBrowserMostRecentlyAvailableDataButton() {
		return webBrowserMostRecentlyAvailableDataButton;
	}
	public void verifyOnBrowserContain(String followEmail, String webURL ) {
		LFSUtilsIOS.openBrowser(followEmail, webURL);
		LFSUtilsIOS.click(getBrowserConnectButton());
		getWebBrowserWelcomeButton().isDisplayed();
		getwebBrowserGlucoseInformationButton().isDisplayed();
		getwebBrowserDownloadTheAppButton().isDisplayed();
		getWebBrowserStartFollowingDSPLPatientButton().isDisplayed();
		getWebBrowserSetUpNotificationsForInformationButton().isDisplayed();
		getWebBrowserMostRecentlyAvailableDataButton().isDisplayed();	

	}	
	
	public QAFWebElement getNFKiosSignupPageOneTouchLogo() {
		return NFKiosSignupPageOneTouchLogo;
	}
	
    public QAFWebElement getNFKiosSafetyonboardingNextBtn() {
		return NFKiosSafetyonboardingNextBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingBackBtn() {
		return NFKiosSafetyonboardingBackBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingBloodmeterImage() {
		return NFKiosSafetyonboardingBloodmeterImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingTrustHowYouFeelCheckbox() {
		return NFKiosSafetyonboardingTrustHowYouFeelCheckbox;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingSecondscreenText() {
		return NFKiosSafetyonboardingSecondscreenText;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingAreaOfCautionImage() {
		return NFKiosSafetyonboardingAreaOfCautionImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingSupportedUOMImage() {
		return NFKiosSafetyonboardingSupportedUOMImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingCurrentReadingImage() {
		return NFKiosSafetyonboardingCurrentReadingImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingTrendArrowRisingQuicklyImage() {
		return NFKiosSafetyonboardingTrendArrowRisingQuicklyImage;
	}

	public QAFWebElement getNFKiosSafetyonboardingTrendArrowRisingImage() {
		return NFKiosSafetyonboardingTrendArrowRisingImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingTrendArrowRisingSlowlyImage() {
		return NFKiosSafetyonboardingTrendArrowRisingSlowlyImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingTrendArrowSteadyImage() {
		return NFKiosSafetyonboardingTrendArrowSteadyImage;
	}

	public QAFWebElement getNFKiosSafetyonboardingTrendArrowFallingSlowlyImage() {
		return NFKiosSafetyonboardingTrendArrowFallingSlowlyImage;
	}

	public QAFWebElement getNFKiosSafetyonboardingTrendArrowFallingImage() {
		return NFKiosSafetyonboardingTrendArrowFallingImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingTrendArrowFallingQuicklyImage() {
		return NFKiosSafetyonboardingTrendArrowFallingQuicklyImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingHighReadingImage() {
		return NFKiosSafetyonboardingHighReadingImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingInRangeReadingImage() {
		return NFKiosSafetyonboardingInRangeReadingImage;
	}

	public QAFWebElement getNFKiosSafetyonboardingLowReadingImage() {
		return NFKiosSafetyonboardingLowReadingImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingSeventhScreenTitle() {
		return NFKiosSafetyonboardingSeventhScreenTitle;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingLowimageviewImage() {
		return NFKiosSafetyonboardingLowimageviewImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingHighimageviewImage() {
		return NFKiosSafetyonboardingHighimageviewImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingAlertNotificationScreenText2() {
		return NFKiosSafetyonboardingAlertNotificationScreenText2;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingOkBtn() {
		return NFKiosSafetyonboardingOkBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingAlertImage() {
		return NFKiosSafetyonboardingAlertImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingSmartphoneImage() {
		return NFKiosSafetyonboardingSmartphoneImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingMoreMenuAlertLabel() {
		return NFKiosSafetyonboardingMoreMenuAlertLabel;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingUrgentLowGlucoseAlertImage() {
		return NFKiosSafetyonboardingUrgentLowGlucoseAlertImage;
	}
	
	
	public QAFWebElement getNFKiosSafetyonboardingUrgentLowGlucoseAlarmImage() {
		return NFKiosSafetyonboardingUrgentLowGlucoseAlarmImage;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingSettingBtn() {
		return NFKiosSafetyonboardingSettingBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingPopupText1() {
		return NFKiosSafetyonboardingPopupText1;
	}

	public QAFWebElement getNFKiosSafetyonboardingPopupText2() {
		return NFKiosSafetyonboardingPopupText2;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingPopupAllowBtn() {
		return NFKiosSafetyonboardingPopupAllowBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingPopupDontAllowBtn() {
		return NFKiosSafetyonboardingPopupDontAllowBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingAreasOfCautionCheckbox() {
		return NFKiosSafetyonboardingAreasOfCautionCheckbox;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingTreatmentDecisionsCheckbox() {
		return NFKiosSafetyonboardingTreatmentDecisionsCheckbox;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingAlertNotificationsPageViewCheckbox() {
		return NFKiosSafetyonboardingAlertNotificationsPageViewCheckbox;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingApplysensorSkipBtn() {
		return NFKiosSafetyonboardingApplysensorSkipBtn;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingFirstscreenText1() {
		return NFKiosSafetyonboardingFirstscreenText1;
	}

	public QAFWebElement getNFKiosSafetyonboardingFirstscreenText2() {
		return NFKiosSafetyonboardingFirstscreenText2;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingThirdscreenText1() {
		return NFKiosSafetyonboardingThirdscreenText1;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingThirdscreenText2() {
		return NFKiosSafetyonboardingThirdscreenText2;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingEightscreenText1() {
		return NFKiosSafetyonboardingEightscreenText1;
	}
	
	public QAFWebElement getNFKiosSafetyonboardingEightscreenText2() {
		return NFKiosSafetyonboardingEightscreenText2;
	}

	public QAFWebElement getNFKiosSignupPageSensorpageNextbtn() {
		return NFKiosSignupPageSensorpageNextbtn;
	}

	public QAFWebElement getNFKiosSignupPageNotificationBluetoothPopupSetting() {
		return NFKiosSignupPageNotificationBluetoothPopupSetting;
	}

	public QAFWebElement getNFKiosSignupPageNotificationBluetoothPopupClose() {
		return NFKiosSignupPageNotificationBluetoothPopupClose;
	}

	public QAFWebElement getNFKiosSignuppageDependentEmailLabel() {
		return NFKiosSignuppageDependentEmailLabel;
	}

	public QAFWebElement getNFKiosSignupPageLogo() {
		return NFKiosSignupPageLogo;
	}

	public QAFWebElement getNFKiosSignupPageDependentprofileTitle() {
		return NFKiosSignupPageDependentprofileTitle;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationContinueBtn() {
		return NFKiosSignupPageEmancipationContinueBtn;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationEmail() {
		return NFKiosSignupPageEmancipationEmail;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationConfirmEmail() {
		return NFKiosSignupPageEmancipationConfirmEmail;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationPassword() {
		return NFKiosSignupPageEmancipationPassword;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationConfirmPassword() {
		return NFKiosSignupPageEmancipationConfirmPassword;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationTermsAndPrivacy() {
		return NFKiosSignupPageEmancipationTermsAndPrivacy;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationMarketingAgreement() {
		return NFKiosSignupPageEmancipationMarketingAgreement;
	}

	public QAFWebElement getNFKiosGestationalTitle() {
		return NFKiosGestationalTitle;
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

	public QAFWebElement getNFKiosGestationalCancelBtn() {
		return NFKiosGestationalCancelBtn;
	}

	public QAFWebElement getNFKiosGestationalFotterPart() {
		return NFKiosGestationalFotterPart;
	}

	public QAFWebElement getNFKiosSignupPageAgeRestrictionPopupTitle() {
		return NFKiosSignupPageAgeRestrictionPopupTitle;
	}

	public QAFWebElement getNFKiosSignuppageBirthdayMonthPkr() {
		return NFKiosSignuppageBirthdayMonthPkr;
	}
	
	public QAFWebElement getNFKiosSignuppageBirthdayDatePkr() {
		return NFKiosSignuppageBirthdayDatePkr;
	}
	
	public QAFWebElement getNFKiosSignupPageAgeRestrictionPopupOK() {
		return NFKiosSignupPageAgeRestrictionPopupOK;
	}

	public QAFWebElement getNFKiosSignupPageAgeRestrictionPopupClose() {
		return NFKiosSignupPageAgeRestrictionPopupClose;
	}

	public QAFWebElement getNFKiosSignupPageErrorLabel() {
		return NFKiosSignupPageErrorLabel;
	}
	
	public QAFWebElement getNFKiosSignuppageTimingpickerYearPkr() {
		return NFKiosSignuppageTimingpickerYearPkr;
	}

	public QAFWebElement getNFKiosSignupPageErrorMsgComfirmPassword() {
		return NFKiosSignupPageErrorMsgComfirmPassword;
	}

	public QAFWebElement getNFKiosSignupPageErrorMsgPassword() {
		return NFKiosSignupPageErrorMsgPassword;
	}

	public QAFWebElement getNFKiosSignupPageErrorIcon() {
		return NFKiosSignupPageErrorIcon;
	}

	public QAFWebElement getNFKiosSignupPageErrorMsgEmail() {
		return NFKiosSignupPageErrorMsgEmail;
	}

	public QAFWebElement getNFKiosApplysensorTitle() {
		return NFKiosApplysensorTitle;
	}

	public QAFWebElement getNFKiosApplysensorSkipBtn() {
		return NFKiosApplysensorSkipBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardPairSensorScreentxt() {
		return NFKiosSignupPageSafetyboardPairSensorScreentxt;
	}

	public QAFWebElement getNFKiosSettingsBackToAppBtn() {
		return NFKiosSettingsBackToAppBtn;
	}

	public QAFWebElement getNFKiosSafteyboardingBackBtn() {
		return NFKiosSafteyboardingBackBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardUrgentLowNotificationtxt() {
		return NFKiosSignupPageSafetyboardUrgentLowNotificationtxt;
	}

	public QAFWebElement getNFKiosSignuppageUpdateNoticeCheckbox() {
		return NFKiosSignuppageUpdateNoticeCheckbox;
	}

	public QAFWebElement getNFKiosSettingsBackBtn() {
		return NFKiosSettingsBackBtn;
	}

	public QAFWebElement getNFKiosSafteyonboardingSettingsBtn() {
		return NFKiosSafteyonboardingSettingsBtn;
	}

	public QAFWebElement getNFKiosSettingsNotificationBtn() {
		return NFKiosSettingsNotificationBtn;
	}

	public QAFWebElement getNFKiosSignuppageClinicName() {
		return NFKiosSignuppageClinicName;
	}

	public QAFWebElement getNFKiosSignuppageClinicPhone() {
		return NFKiosSignuppageClinicPhone;
	}

	public QAFWebElement getNFKiosSignuppageClinicMsgTxt() {
		return NFKiosSignuppageClinicMsgTxt;
	}

	public QAFWebElement getNFKiosSignuppageClinicCancelBtn() {
		return NFKiosSignuppageClinicCancelBtn;
	}

	public QAFWebElement getNFKiossignuppageUomselecttext1() {
		return NFKsignuppageUomselecttext1;
	}

	public QAFWebElement getNFKiossignuppageUomselectMmolbutton() {
		return NFKsignuppageUomselectMmolbutton;
	}

	public QAFWebElement getNFKiossignuppageUomselectMmolbuttontext() {
		return NFKsignuppageUomselectMmolbuttontext;
	}

	public QAFWebElement getNFKiossignuppageUomselectMgdlbutton() {
		return NFKsignuppageUomselectMgdlbutton;
	}

	public QAFWebElement getNFKiossignuppageUomselectMgdlbuttontext() {
		return NFKsignuppageUomselectMgdlbuttontext;
	}

	public QAFWebElement getNFKiossignuppageUomselecttext() {
		return NFKsignuppageUomselecttext;
	}

	public QAFWebElement getNFKiossignuppageUomselecttitle() {
		return NFKsignuppageUomselecttitle;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosSignuppageDependentGuardianFname() {
		return NFKiosSignuppageDependentGuardianFname;
	}

	public QAFWebElement getNFKiosSignuppageDependentGuardianLname() {
		return NFKiosSignuppageDependentGuardianLname;
	}

	public QAFWebElement getNFKiosSignuppageDependentEmail() {
		return NFKiosSignuppageDependentEmail;
	}

	public QAFWebElement getNFKiosSignuppageClinicinfoTxt() {
		return NFKiosSignuppageClinicinfoTxt;
	}

	public QAFWebElement getNFKiosSignuppageDependentPassword() {
		return NFKiosSignuppageDependentPassword;
	}

	public QAFWebElement getNFKiosSignuppageDependentConfirmPassword() {
		return NFKiosSignuppageDependentConfirmPassword;
	}

	public QAFWebElement getNFKiosSignuppageDependentConfirmEmail() {
		return NFKiosSignuppageDependentConfirmEmail;
	}

	public QAFWebElement getNFKiosSignuppageDependentContinue() {
		return NFKiosSignuppageDependentContinue;
	}

	public QAFWebElement getNFKiosSignuppageDependentTermsCheckbox() {
		return NFKiosSignuppageDependentTermsCheckbox;
	}

	public QAFWebElement getNFKiosSignuppageAddedclinicNoTxt() {
		return NFKiosSignuppageAddedclinicNoTxt;
	}

	public QAFWebElement getNFKiosSignuppageAddclinicSendBtn() {
		return NFKiosSignuppageAddclinicSendBtn;
	}

	public QAFWebElement getNFKiosSignuppageAddclinicCancelBtn() {
		return NFKiosSignuppageAddclinicCancelBtn;
	}

	public QAFWebElement getNFKiosSignuppageAddclinicTermchkBtn() {
		return NFKiosSignuppageAddclinicTermchkBtn;
	}

	public QAFWebElement getNFKiosSignuppageDependentMarketingCheckbox() {
		return NFKiosSignuppageDependentMarketingCheckbox;
	}

	public QAFWebElement getNFKiosSignuppageDependentFname() {
		return NFKiosSignuppageDependentFname;
	}

	public QAFWebElement getNFKiosSignuppageDependentLname() {
		return NFKiosSignuppageDependentLname;
	}

	public QAFWebElement getNFKiosSignuppageDependentClinic() {
		return NFKiosSignuppageDependentClinic;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonMale() {
		return NFKiosSignuppageDependentRadioButtonMale;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonFemale() {
		return NFKiosSignuppageDependentRadioButtonFemale;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonTypeOne() {
		return NFKiosSignuppageDependentRadioButtonTypeOne;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonTypeTwo() {
		return NFKiosSignuppageDependentRadioButtonTypeTwo;
	}

	public QAFWebElement getNFKiosSignuppageDependentSignUpButton() {
		return NFKiosSignuppageDependentSignUpButton;
	}

	public QAFWebElement getNFKiosSignuppageDependentGuardianaccountText() {
		return NFKiosSignuppageDependentGuardianaccountText;
	}

	public QAFWebElement getNFKiosSignupPageOptinCustomerServiceLink() {
		return NFKiosSignupPageOptinCustomerServiceLink;
	}

	// SG Elements for German Unit of Measure Page
	public QAFWebElement getNFKiosSignupPageBackButton() {
		return NFKiosSignupPageBackButton;
	}

	public QAFWebElement getNFKiosDecisionPageSignupMyselfBtn() {
		return NFKiosDecisionPageSignupMyselfBtn;
	}

	public QAFWebElement getNFKiosDecisionPageLoginOwnBtn() {
		return NFKiosDecisionPageLoginOwnBtn;
	}

	public QAFWebElement getNFKiosDecisionPageSignupDependentBtn() {
		return NFKiosDecisionPageSignupDependentBtn;
	}

	public QAFWebElement getNFKiosSignupPageInvalidClinicCodeClosebtn() {
		return NFKiosSignupPageInvalidClinicCodeClosebtn;
	}

	public QAFWebElement getNFKiosSignupPageUpdateNoticeContinueBtn() {
		return NFKiosSignupPageUpdateNoticeContinueBtn;
	}

	public QAFWebElement getNFKiosSignUppageBackBtn() {
		return NFKiosSignUpPageBackBtn;
	}

	public QAFWebElement getNFKiosSignupPageUpdateNoticeCheckBoxImg() {
		return NFKiosSignupPageUpdateNoticeCheckBoxImg;
	}

	public QAFWebElement getNFKiosSignupPageOptinPrivecylnk() {
		return NFKiosSignupPageOptinPrivecylnk;
	}

	public QAFWebElement getNFKiosSignuppageSkipBtn() {
		return NFKiosSignupPageMeterskipBtn;
	}

	public QAFWebElement getNFKiosDecisionPageLoginDependentBtn() {
		return NFKiosDecisionPageLoginDependentBtn;
	}

	public QAFWebElement getNFKiosSignupPagePrivecyLnk() {
		return NFKiosSignupPagePrivecyLnk;
	}

	public QAFWebElement getNFKiosSignupPageTermLnk() {
		return NFKiosSignupPageTermLnk;
	}

	public QAFWebElement getNFKiosSignuppageHcpEmailTxt() {
		return NFKiosSignuppageHcpEmailTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpPassTxt() {
		return NFKiosSignuppageHcpPassTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpConfirmpassTxt() {
		return NFKiosSignuppageHcpConfirmpassTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpDatofbirthTxt() {
		return NFKiosSignuppageHcpDatofbirthTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpTermChk() {
		return NFKiosSignuppageHcpTermChk;
	}

	public QAFWebElement getNFKiosSignuppagegreenCheckImg() {
		return NFKiosSignuppagegreenCheckImg;
	}

	public QAFWebElement getNFKiosSignuppageOptinTitleLbl() {
		return NFKiosSignuppageOptinTitleLbl;
	}

	public QAFWebElement getNFKiosSignupPageSafetyonboardingAlertokBtn() {
		return NFKiosSignupPageSafetyonboardingAlertokBtn;
	}

	public QAFWebElement getNFKiosSignupPageBirthdayMonthPkr() {
		return NFKiosSignupPageBirthdayMonthPkr;
	}

	public QAFWebElement getNFKiosSignupPageBirthdayDatePkr() {
		return NFKiosSignupPageBirthdayDatePkr;
	}

	public QAFWebElement getNFKiosSignupPageTimingPickerYearPkr() {
		return NFKiosSignupPageTimingPickerYearPkr;
	}

	public QAFWebElement getNFKiosSignuppageFirstNameTxt() {
		return NFKiosSignuppageFirstNameTxt;
	}

	public QAFWebElement getNFKiosSignuppageLastNameTxt() {
		return NFKiosSignuppageLastNameTxt;
	}

	public QAFWebElement getNFKiosSignuppageConfirmPasswordTxt() {
		return NFKiosSignuppageConfirmPasswordTxt;
	}

	public QAFWebElement getNFKiosSignuppageOfficeCodeTxt() {
		return NFKiosSignuppageOfficeCodeTxt;
	}

	public QAFWebElement getNFKiosSignuppageOnetouchIcon() {
		return NFKiosSignuppageOnetouchIcon;
	}

	public QAFWebElement getNFKiosSignuppageTermofserviceLbl() {
		return NFKiosSignuppageTermofserviceLbl;
	}

	public QAFWebElement getNFKiosSignuppageTermofserviceCbox() {
		return NFKiosSignuppageTermofserviceCbox;
	}

	public QAFWebElement getNFKiosSignuppageCountrytermsCbox() {
		return NFKiosSignuppageCountrytermsCbox;
	}

	public QAFWebElement getNFKiosSignuppageEmailadressTbox() {
		return NFKiosSignuppageEmailadressTbox;
	}

	public QAFWebElement getNFKiosSignuppageConfirmemailadressTbox() {
		return NFKiosSignuppageConfirmemailadressTbox;
	}

	public QAFWebElement getNFKiosSignuppagePasswordTbox() {
		return NFKiosSignuppagePasswordTbox;
	}

	public QAFWebElement getNFKiosSignupPageDateOfBirthTBox() {
		return NFKiosSignupPageDateOfBirthTBox;
	}

	public QAFWebElement getNFKiosSignuppageSignupBtn() {
		return NFKiosSignuppageSignupBtn;
	}

	public QAFWebElement getNFKiosSignuppageLoginLnk() {
		return NFKiosSignuppageLoginLnk;
	}

	public QAFWebElement getNFKiosSignuppageEnabletouchidBtn() {
		return NFKiosSignuppageEnabletouchidBtn;
	}

	public QAFWebElement getNFKiosSignuppageKeepmeloginBtn() {
		return NFKiosSignuppageKeepmeloginBtn;
	}

	public QAFWebElement getNFKiosSignuppageRequirloginBtn() {
		return NFKiosSignuppageRequirloginBtn;
	}

	public QAFWebElement getNFKiosSignuppageCheckebox() {
		return NFKiosSignuppageCheckebox;
	}

	public QAFWebElement getNFKiosSignuppageAgreeLbl() {
		return NFKiosSignuppageAgreeLbl;
	}

	public QAFWebElement getNFKiosDecisionPageSignupButton() {
		return NFKiosDecisionPageSignupButton;
	}

	public QAFWebElement getNFKiosDecisionPageYesLoginButton() {
		return NFKiosDecisionPageYesLoginButton;
	}

	public QAFWebElement getNFKiosSignuppageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", text);
	}

	public QAFWebElement getNFKiosSignuppagesafetynextbtn() {
		return NFKiosSignUpPageSafetyNextBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox() {
		return NFKiosSignupPageSafetyboardTrustHowYouFeelCBox;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardNoMRCBox() {
		return NFKiosSignupPageSafetyboardNoMRCBox;
	}

	public QAFWebElement getNFKiosSignupPagePairSensorSkipBtn() {
		return NFKiosSignupPagePairSensorSkipBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox() {
		return NFKiosSignupPageSafetyboardTreatmentDecisionsCBox;
	}

	public QAFWebElement getNFKiosSignupPagePairSensorTitle() {
		return NFKiosSignupPagePairSensorTitle;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardAlertNotificationsCBox() {
		return NFKiosSignupPageSafetyboardAlertNotificationsCBox;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardNotificationsPopup() {
		return NFKiosSignupPageSafetyboardNotificationsPopup;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardNotificationsAllowPopup() {
		return NFKiosSignupPageSafetyboardNotificationsAllowPopup;
	}

	public QAFWebElement getNFKiosSignuppagesafetydonebtn() {
		return NFKiosSignUpPageSafetyDoneBtn;
	}

	public QAFWebElement getNFKiosSignuppageOptinIagreeLbl() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", LFSUtilsIOS.getPropString("termsAndCond.agree"));
	}

	public QAFWebElement getNFKiosSignupPageStartSensorTitle() {
		return NFKiosSignupPageStartSensorTitle;
	}

	public QAFWebElement getNFKiosSignuppageOptinCancelLbl() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl",
				LFSUtilsIOS.getPropString("common.actions.cancel"));
	}

	public QAFWebElement getNFKiosSignuppageSingupOkBtn() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", LFSUtilsIOS.getPropString("appCommon.ok"));
	}

	public QAFWebElement getNFKiosSignuppageHcpDoneBtn() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", LFSUtilsIOS.getPropString("appCommon.done"));
	}

	public QAFWebElement getNFKiosSignupPageNotificationAllowPopup() {
		return NFKiosSignupPageNotificationAllowPopup;
	}

	public QAFWebElement getNFKiosSignupPageNotificationDontallowPopup() {
		return NFKiosSignupPageNotificationDontallowPopup;
	}

	public QAFWebElement getNFKiosSignupPageErrorMessageTxt() {
		return NFKiosSignupPageErrorMessageTxt;
	}

	public QAFWebElement getNFKiosSignupPageErrorCancelImg() {
		return NFKiosSignupPageErrorCancelImg;
	}

	public QAFWebElement getNFKiosSignupGenderSelectionMaleBtn() {
		return NFKiosSignupGenderSelectionMaleBtn;
	}

	public QAFWebElement getNFKiosSignupGenderSelectionFemaleBtn() {
		return NFKiosSignupGenderSelectionFemaleBtn;
	}

	public QAFWebElement getNFKiosSignupDiabetesTypeType1btn() {
		return NFKiosSignupDiabetesTypeType1btn;
	}

	public QAFWebElement getNFKiosSignupDiabetesTypeType2btn() {
		return NFKiosSignupDiabetesTypeType2btn;
	}

	public QAFWebElement getNFKiosSignupDiabetesTypeGestationalbtn() {
		return NFKiosSignupDiabetesTypeGestationalbtn;
	}
	public QAFWebElement getNFKiosSignupPageOptionCancelBtn(){
		return NFKiosSignupPageOptionCancelBtn;
	}
	public QAFWebElement getNFKiossignuppageoptincheckbox() {
			return NFKiossignuppageoptincheckbox;
	}	
	public QAFWebElement getNFKiossignuppageoptinIagreebtn() {
				return NFKiossignuppageoptinIagreebtn;
	}
	public QAFWebElement getNFKiossignuppageoptintitle() {
		return NFKiossignuppageoptintitle;
    }

	public QAFWebElement getNFKiosSignupPageSecondScreenContinueBtn() {
		return NFKiosSignupPageSecondScreenContinueBtn;
	}
	public QAFWebElement getNFKiosSignupPageDobCancelBtn(){
		return NFKiosSignupPageDobCancelBtn;
	}
	public QAFWebElement getNFKiosSignupPageGreenLinkBtn() {
		return NFKiosSignupPageGreenLinkBtn;
	}
	public QAFWebElement getNFKiosSignupPageGreenLinkTextBtn(){
		return NFKiosSignupPageGreenLinkTextBtn;
	}
	public QAFWebElement getNFKiosSignupPagePrivacyLnk() {
		return NFKiosSignupPagePrivacyLnk;
	}
	public QAFWebElement getNFKiosSignupPagePrivacyPolicyTxt() {
		return NFKiosSignupPagePrivacyPolicyTxt;
	}
	public QAFWebElement getNFKiosSignupPageClinicCodeBtn() {
		return NFKiosSignupPageClinicCodeBtn;
	}
	public QAFWebElement getNFKiosSignupPageClinicCodeTxt() {
		return NFKiosSignupPageClinicCodeTxt;
	}
	public QAFWebElement getNFKiosSignupPageCheckBoxBtn() {
		return NFKiosSignupPageCheckBoxBtn;
	}
	public QAFWebElement getNFKiosSignupPageSendBtn() {
		return NFKiosSignupPageSendBtn;
	}
	public QAFWebElement getNFKiosSignupPageApplySensorBtn() {
		return NFKiosSignupPageApplySensorBtn;
	}

	public QAFWebElement getNFKiosSignupPageSensorWearBtn() {
		return NFKiosSignupPageSensorWearBtn;
	}

	public QAFWebElement getNFKiosSignupPageHelpfulTipsBtn() {
		return NFKiosSignupPageHelpfulTipsBtn;
	}

	public QAFWebElement getNFKiosSignupPageBackUpperArmBtn() {
		return NFKiosSignupPageBackUpperArmBtn;
	}

	public QAFWebElement getNFKiosSignupPageWashAndDryHandBtn() {
		return NFKiosSignupPageWashAndDryHandBtn;
	}

	public QAFWebElement getNFKiosSignupPageRemovePaperBackingBtn() {
		return NFKiosSignupPageRemovePaperBackingBtn;
	}

	public QAFWebElement getNFKiosSignupPageRemoveApplicatorBtn() {
		return NFKiosSignupPageRemoveApplicatorBtn;
	}

	public QAFWebElement getNFKiosSignupPageAdhesivePatchBtn() {
		return NFKiosSignupPageAdhesivePatchBtn;
	}

	public QAFWebElement getNFKiosSafetyOnBoardingBackBtn() {
		return NFKiosSafetyOnBoardingBackBtn;
	}

	public QAFWebElement getNFKiosSignupPageRightAbdomenButtonBtn() {
		return NFKiosSignupPageRightAbdomenButtonBtn;
	}

	public QAFWebElement getNFKiosSignupPageLeftAbdomenButtonBtn() {
		return NFKiosSignupPageLeftAbdomenButtonBtn;
	}

	public QAFWebElement getNFKiosSignupPageLeftArmButtonBtn() {
		return NFKiosSignupPageLeftArmButtonBtn;
	}
	public QAFWebElement getNFKiosSignupPageRightArmLnk() {
		return NFKiosSignupPageRightArmLnk;
	}

	public QAFWebElement getNFKiosSignupPageRightArmButtonBtn() {
		return NFKiosSignupPageRightArmButtonBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyOnBoardingLastScreenBtn() {
		return NFKiosSignupPageSafetyOnBoardingLastScreenBtn;
	}

	public QAFWebElement getNFKiosSignupPageNextBtn() {
		return NFKiosSignupPageNextBtn;
	}

	public QAFWebElement getNFKiosSignupPageStartPairSensorBtn() {
		return NFKiosSignupPageStartPairSensorBtn;
	}

	public QAFWebElement getNFKiosSignupPagePairSensorBtn() {
		return NFKiosSignupPagePairSensorBtn;
	}

	public QAFWebElement getNFKiosSignupPageSensorWearTextBtn() {
		return NFKiosSignupPageSensorWearTextBtn;
	}

	public QAFWebElement getNFKiosSignupPageHelpfulTipsTextBtn() {
		return NFKiosSignupPageHelpfulTipsTextBtn;
	}

	public QAFWebElement getNFKiosSignupPageHelpfulTipsCrossBtn() {
		return NFKiosSignupPageHelpfulTipsCrossBtn;
	}

	public QAFWebElement getNFKiosSignupPagePairSensorCancelBtn() {
		return NFKiosSignupPagePairSensorCancelBtn;
	}
	public QAFWebElement getNFKiosApplySensorTitle() {
		return NFKiosApplySensorTitle;
	}

	public QAFWebElement getNFKiosSignuppageApproveLocationTxt() {
		return NFKiosSignuppageApproveLocationTxt;
	}

	public QAFWebElement getNFKiosSignupPageApplyLinkBtn() {
		return NFKiosSignupPageApplyLinkBtn;
	}

	public QAFWebElement getNFKiosSignupPageCleanDisinfectTxt() {
		return NFKiosSignupPageCleanDisinfectTxt;
	}

	public QAFWebElement getNFKiosSignupPageCancelBtn() {
		return NFKiosSignupPageCancelBtn;
	}

	public QAFWebElement getNFKiosSignuppageFooterLabelTxt() {
		return NFKiosSignuppageFooterLabelTxt;
	}

	public QAFWebElement getNFKiosSignuppageSensorApplicationTxt() {
		return NFKiosSignuppageSensorApplicationTxt;
	}

	public QAFWebElement getNFKiosSignuppagePairSensorBtn() {
		return NFKiosSignuppagePairSensorBtn;
	}

	public QAFWebElement getNFKiosSignuppageApplySensorTxt() {
		return NFKiosSignuppageApplySensorTxt;
	}

	public QAFWebElement getNFKiosSignupPageHealthcareInstructionsBtn() {
		return NFKiosSignupPageHealthcareInstructionsBtn;
	}

	public QAFWebElement getNFKiosSignuppageUnpairSensorTxt() {
		return NFKiosSignuppageUnpairSensorTxt;
	}

	public QAFWebElement getNFKiosSignupPageDoneBtn() {
		return NFKiosSignupPageDoneBtn;
	}

	public QAFWebElement getNFKiossafetyOnBoardingStopSensorBtn() {
		return NFKiossafetyOnBoardingStopSensorBtn;
	}

	public QAFWebElement getNFKiosSafetyOnBoarding2to5YearsPageSkipBtn() {
		return NFKiosSafetyOnBoarding2to5YearsPageSkipBtn;
	}

	public QAFWebElement getNFKiosSafetyOnBoardingSensorApplicationHowToApplyLnk() {
		return NFKiosSafetyOnBoardingSensorApplicationHowToApplyLnk;
	}

	public QAFWebElement getNFKiosSignuppageImportantPopupTxt() {
		return NFKiosSignuppageImportantPopupTxt;
	}
	@FindBy(locator = "NFKios.signupPage.static.lbl")
	private QAFWebElement NFKiosSignuppageStaticLbl;

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	public static String email;

	public void openNFKiosApp1() {
		LFSUtilsIOS ios = new LFSUtilsIOS();
		ios.openNFKApp();
	}

	// method to open NFKios app
	public void openNFKiosApp() {
		launchPage(null);
		try {
			if (getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("Notification pop up", MessageTypes.Pass);
				getNFKiosSignupPageNotificationAllowPopup().click();
				getNFKiosSignupPageNotificationAllowPopup().click();
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("Notification pop up was not displayed", MessageTypes.Pass);
		}
		try {
			iosDriver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			iosDriver.launchApp();
			LFSUtilsIOS.pause(3000);
			if (getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
				getNFKiosSignupPageNotificationAllowPopup().click();
				getNFKiosSignupPageNotificationAllowPopup().click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// method to open NFK app
	public void lunchApp() {
		try {
			iosDriver.launchApp();

			if (getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("Notification pop up", MessageTypes.Pass);
				driver.switchTo().alert().accept();
			}

			Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openAppWithoutNotification() {
		launchPage(null);

		try {
			iosDriver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			iosDriver.launchApp();

			getNFKiosSignupPageNotificationDontallowPopup().waitForPresent();
			getNFKiosSignupPageNotificationDontallowPopup().click();
			getNFKiosSignupPageNotificationAllowPopup().click();
			Reporter.logWithScreenShot("App is launched and Dont allow pop up selected", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// method to verify sign up page elements

	public void veriySignUpPage() {
		getNFKiosSignuppageTermofserviceLbl().waitForPresent();
		getNFKiosSignuppageTermofserviceLbl().verifyPresent("Sign up page terms of service label");
		getNFKiosSignuppageEmailadressTbox().verifyPresent("Email text box");
		getNFKiosSignuppageConfirmemailadressTbox().verifyPresent("Confirm email text box");
		getNFKiosSignuppagePasswordTbox().verifyPresent("Password text box");
		getNFKiosSignupPageSecondScreenContinueBtn().verifyPresent("Continue button");
		getNFKiosSignuppageLoginLnk().verifyPresent("Login link on sign up page");
	}

	// method to verify sign up first page elements
	// Varsha
	public void veriySignUpFirstPage() {
		getNFKiosSignuppageOnetouchIcon().waitForPresent();
		getNFKiosSignuppageOnetouchIcon().verifyPresent("One Touch Logo");
		getNFKiosSignupPageDateOfBirthTBox().verifyPresent("Date of Birth");
		getNFKiosSignupPageSecondScreenContinueBtn().verifyPresent("Create Account button");
		getNFKiosSignuppageCheckebox().verifyPresent("Terms of Service checkBox");

	}

	// Method to select diabetes check box
	public void selectionOfOptin(String option) {
		LFSUtilsIOS.click(getNFKiosSignuppageOptinTitleLbl());
		if (option.equalsIgnoreCase("I Agree")) {
			LFSUtilsIOS.click(getNFKiosSignuppageOptinIagreeLbl());
			Reporter.logWithScreenShot("User selected I Agree option", MessageTypes.Pass);
		} else if (option.equalsIgnoreCase("Cancel")) {
			LFSUtilsIOS.click(getNFKiosSignuppageOptinCancelLbl());
			Reporter.logWithScreenShot("User selected Cancel option", MessageTypes.Pass);
		}
	}

	// Method to fill sign up details
	public void fillRandomSignUpDetails(String signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {
			userBean.fillFromConfig(signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		email = "testmail+" + RandomStringUtils.randomAlphabetic(5) + "@testmail.com";
		ConfigurationManager.getBundle().setProperty("register.email", email);
		LFSUtilsIOS.enterText(getNFKiosSignuppageEmailadressTbox(), email);
		LFSUtilsIOS.enterText(getNFKiosSignuppageConfirmemailadressTbox(), email);
		ConfigurationManager.getBundle().setProperty("register.password", userBean.getPassword());
		LFSUtilsIOS.enterText(getNFKiosSignuppagePasswordTbox(), userBean.getPassword());
		LFSUtilsIOS.enterText(getNFKiosSignuppageConfirmPasswordTxt(), userBean.getPassword());
		LFSUtilsIOS.click(getNFKiosSignupPageDateOfBirthTBox());
		setDateOfBirth(userBean);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		LFSUtilsIOS.click(getNFKiosSignuppageCountrytermsCbox());
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
	}

	// Method to verify invalid email ids entered
	public void fillDetailsWithInvalidEmails(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		String email = "@testmail.com";

		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Prefix name is not entered", MessageTypes.Pass);
		getNFKiosSignuppageEmailadressTbox().clear();
		email = "abc.gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("@ is not entered", MessageTypes.Pass);
		getNFKiosSignuppageEmailadressTbox().clear();
		email = "abc@.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Mail domain name is not entered", MessageTypes.Pass);
		getNFKiosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(70) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		// Added by Sangram NFKIOS-2603
		getNFKiosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(125) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Large amount of text is entered", MessageTypes.Pass);

		if (getNFKiosSignuppageEmailadressTbox().getText().toString().length() > 75) {
			Reporter.logWithScreenShot("Email Length exceeds the limit", MessageTypes.Pass);
			getNFKiosSignuppageEmailadressTbox().clear();
			email = RandomStringUtils.randomAlphanumeric(65) + "@testmail.com";
			getNFKiosSignuppageEmailadressTbox().sendKeys(email);
			getNFKiosSignuppageConfirmemailadressTbox().click();
			Reporter.logWithScreenShot("Email Length is within given limit", MessageTypes.Pass);
		}
		email = "july2019+" + RandomStringUtils.randomAlphabetic(5) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		Reporter.logWithScreenShot("Valid Email is entered", MessageTypes.Pass);
	}

	// Method to fill details without email id
	public void fillRandomSignUpDetailsWithoutEmail(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		String email = "july2019" + RandomStringUtils.randomNumeric(3) + "@mailinator.com";
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("test1234");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("test1234");
		getNFKiosSignuppageStaticlabel(
				ConfigurationManager.getBundle().getString(("auth.emailValidation.emailsMustMatch")))
						.verifyPresent("Both email address fields must match error message");
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getNFKiosSignupPageSecondScreenContinueBtn().verifyDisabled("Sign up button");
	}

	// Method to click on sign up button when enabled
	public void clickOnSignUpBtn() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
		LFSUtilsIOS.clickIfEnabled(getNFKiosSignuppageSignupBtn());
		Reporter.logWithScreenShot("User clicked on signup button ", MessageTypes.Pass);
	}

	public void RedirectToDecisionScreenFromSignUpScreen() {
		getNFKiosSignUppageBackBtn().click();
	}

//modify the code for decision screen
	public void redirectToPage(String pageName) {
		LoginPageIOS loginPage = new LoginPageIOS();
		pageName = pageName.toUpperCase();
		switch (pageName) {

		case "SIGN-UP MYSELF":
			try {
				if (getNFKiosDecisionPageSignupButton().isPresent()
						&& getNFKiosDecisionPageSignupButton().isDisplayed()) {
					LFSUtilsIOS.click(getNFKiosDecisionPageSignupButton());
					LFSUtilsIOS.click(getNFKiosDecisionPageSignupMyselfBtn());
					Reporter.logWithScreenShot("User clicked on Signup for Myself button", MessageTypes.Pass);

				} else {
					Reporter.logWithScreenShot("Signup button not present on Decision screen", MessageTypes.Fail);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!getNFKiosSignuppageCountrytermsCbox().isPresent()) {
				loginPage.getNFKiosLoginpageSignupLnk().waitForPresent();
				LFSUtilsIOS.click(loginPage.getNFKiosLoginpageSignupLnk());
				getNFKiosSignuppageCountrytermsCbox().waitForPresent();
			}
			Reporter.logWithScreenShot("The user is on Sign Up Page", MessageTypes.Pass);
			break;

		case "LOG-IN OWN":
			if (getNFKiosDecisionPageYesLoginButton().isPresent()
					&& getNFKiosDecisionPageYesLoginButton().isDisplayed()) {
				LFSUtilsIOS.click(getNFKiosDecisionPageYesLoginButton());
				LFSUtilsIOS.click(getNFKiosDecisionPageLoginOwnBtn());
				Reporter.logWithScreenShot("User redirected to Login Page", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("User was unable to find the My own data button", MessageTypes.Pass);
			}
			break;

		case "SIGN-UP DEPENDENT":
			try {
				if (getNFKiosDecisionPageSignupButton().isPresent()) {
					LFSUtilsIOS.click(getNFKiosDecisionPageSignupButton());
					getNFKiosDecisionPageSignupDependentBtn().waitForPresent();
					getNFKiosDecisionPageSignupDependentBtn().verifyPresent("Sign up for a dependent");
					LFSUtilsIOS.click(getNFKiosDecisionPageSignupDependentBtn());
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for a dependent button", MessageTypes.Pass);

				} else {
					LFSUtilsIOS.waitforLoad();
					getNFKiosDecisionPageSignupDependentBtn().waitForPresent();
					LFSUtilsIOS.click(getNFKiosDecisionPageSignupDependentBtn());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (getNFKiosSignuppageDependentGuardianaccountText().isPresent()) {
				getNFKiosSignuppageDependentGuardianaccountText().verifyPresent("Create your guardian account");
				getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing check box is present");
				Reporter.logWithScreenShot("User is on Create account screen for guardian", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("User is not on Signup page of Guardian ", MessageTypes.Fail);
			break;
		case "LOG-IN DEPENDENT":
			try {
				if (getNFKiosDecisionPageYesLoginButton().isPresent()) {
					getNFKiosDecisionPageYesLoginButton().waitForPresent();
					getNFKiosDecisionPageYesLoginButton().click();
					getNFKiosDecisionPageLoginDependentBtn().assertPresent("Login Dependent button");
					getNFKiosDecisionPageLoginDependentBtn().click();
					loginPage.verifyLoginDependentscreen();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

// Method to click on skip button

	public void clickSkipBtn() {
		SignupPageIOS signup = new SignupPageIOS();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip")).waitForPresent();
		Reporter.logWithScreenShot("Skip meter Page");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip"))
				.verifyPresent("Welcome Page is displayed");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.yes"))
				.verifyPresent("Ready to See OneTouchReveal Page is displayed");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.yes")).click();
	}
	public void selectAccessType(String option) {
		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			getNFKiosSignuppageKeepmeloginBtn().click();
			break;
		case "TOUCH ID":
			getNFKiosSignuppageEnabletouchidBtn().click();
			break;

		case "REQUIR LOGIN":
			getNFKiosSignuppageRequirloginBtn().click();
			break;
		}
	}

	/*
	 * Method fill sign up first screen details milan
	 */

	@FindBy(locator = "NFKios.signuppage.bdpicker.done.btn")
	private QAFWebElement NFKiosSignupPageBdPickerDoneBtn;

	public QAFWebElement getNFKiosSignupPageBdPickerDoneBtn() {
		return NFKiosSignupPageBdPickerDoneBtn;
	}

	public void enterSignupFirstScreenDetails(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageConfirmPasswordTxt().verifyPresent("confirm password is present");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	public void enterSignupDetailsWithoutBirthdate(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		LFSUtilsIOS lfs = new LFSUtilsIOS();

		getNFKiosSignupPageSecondScreenContinueBtn().verifyDisabled("Sign up button");

		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageCountrytermsCbox().click();

		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	public void doSignUpWithoutCheckBox(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {
			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		String email = "testNFK@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignupPageSecondScreenContinueBtn().verifyDisabled("Sign up button");
	}

	public void enterSignupFirstScreenBelowAgeBirthdate(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		getNFKiosSignuppageEmailadressTbox().click();
		String ageRestrictionString = LFSUtilsIOS.getPropString("onboarding.ageRestriction.title");
		getNFKiosSignuppageStaticlabel(ageRestrictionString).waitForPresent();
		getNFKiosSignuppageStaticlabel(ageRestrictionString).verifyPresent("Age restriction pop up");
		ClickOKBtn();

	}

	// Method to set date of birth from picker
	public void setDateOfBirth(UserDetailBeans userBean) {
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			try {
				getNFKiosSignupPageBirthdayMonthPkr().sendKeys(userBean.getBirthdayYear());
			} catch (Exception e) {
				LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageBirthdayMonthPkr(),
						Integer.parseInt(userBean.getBirthdayYear()));
			}
		} else {
			try {
				getNFKiosSignupPageTimingPickerYearPkr().sendKeys(userBean.getBirthdayYear());
				getNFKiosSignupPageBdPickerDoneBtn().click();

			} catch (Exception e) {
				LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(),
						Integer.parseInt(userBean.getBirthdayYear()));
			}
		}

	}

	public void emailValidations(String signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}

		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("abc@testmail.com");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.accountInfoPage.haveAccountTitle")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
				.verifyPresent("Both email address fields must match error message");
		getNFKiosSignuppageEmailadressTbox().clear();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().clear();
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppagegreenCheckImg().verifyPresent("Green correct icon ,Email field matched");
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.accountInfoPage.haveAccountTitle")).click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		getNFKiosSignupPageSecondScreenContinueBtn().click();

		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

	}

	// Method to fill details without password field
	public void noPasswordToFill(String signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd@123");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.accountInfoPage.haveAccountTitle")).click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.verifyPresent("Passwords do not match error message");
	}

	// Method to enter invalid password and verify
	public void invalidPasswordEntry(String signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcdssas");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		WebDriverTestCase.verifyTrue(passworErrorMsg(),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for non numeric");

		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd1");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		WebDriverTestCase.verifyTrue(passworErrorMsg(),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for less length");
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcdefg@123456789");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		Validator.verifyThat("Password field charcter length",
				getNFKiosSignuppagePasswordTbox().getAttribute("value").length(), Matchers.lessThanOrEqualTo(16));
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd@1234");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		Reporter.logWithScreenShot("Valid password field is entered", MessageTypes.Pass);

	}

	// method to verify error message
	public boolean passworErrorMsg() {
		boolean flag = false;
		if (LFSUtilsIOS.getPropString("Country.name").equalsIgnoreCase("United States")) {
			flag = getNFKiosSignuppageStaticlabel(
					LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
							.getAttribute("label")
							.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar"));
		} else {
			flag = getNFKiosSignuppageStaticlabel(
					LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
							.getAttribute("label").contains(LFSUtilsIOS
									.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40));
		}
		return flag;
	}

	public void repeatedMailIdSignupFlow(String userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosSignuppageEmailadressTbox().sendKeys("sagunther+neo1@testmail.com");
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("sagunther+neo1@testmail.com");
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().clear();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		getNFKiosSignuppageOnetouchIcon().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		getNFKiosSignupPageSecondScreenContinueBtn().click();
		Reporter.logWithScreenShot("Error Message for using already registered mail id", MessageTypes.Pass);

	}

	public void uninstallApp() {
		try {
			String a = ConfigurationManager.getBundle().getProperty("appium.additional.capabilities").toString();
			String filePath = splitCapabilityString(a, "app':'");
			Map<String, Object> params = new HashMap<>();
			params.put("file", filePath);
			driver.executeScript("mobile:application:install", params);
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.trustiOSAppCertificate("LifeScan, Inc.");// trust certificate from settings
			Reporter.logWithScreenShot("App got reset", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to reset app", MessageTypes.Fail);
		}
	}

	public String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

	// Method to verify clinic code

	public void verifyInvalidClinicCode(String signupDetails) {
		fillRandomSignUpDetails(signupDetails);
		getNFKiosSignuppageOfficeCodeTxt().click();
		getNFKiosSignuppageOfficeCodeTxt().sendKeys("ttccxx");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message");
		getNFKiosSignupPageInvalidClinicCodeClosebtn().waitForPresent();
		getNFKiosSignupPageInvalidClinicCodeClosebtn().click();
		if (getNFKiosSignuppageOfficeCodeTxt().getAttribute("value")
				.contains(LFSUtilsIOS.getPropString("office.code.hint")))
			Reporter.logWithScreenShot("Clinic code field is cleared", MessageTypes.Pass);
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getNFKiosSignuppageOfficeCodeTxt().sendKeys(clinicCode);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found")).verifyPresent();
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
	}

	// Method to take screen shot for negetive sceen

	public void signupsecondPageScreen(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		getNFKiosSignuppageEmailadressTbox().sendKeys("tes1123@gmail");
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("tes1223@testmail.com");
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd1234");

		getNFKiosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

		String email1 = userBean.getEmailID();
		getNFKiosSignuppageEmailadressTbox().clear();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email1);
		getNFKiosSignuppageConfirmemailadressTbox().clear();
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email1);
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().clear();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");

		getNFKiosSignuppageOnetouchIcon().click();

		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		Reporter.logWithScreenShot("Signup button is present", MessageTypes.Pass);

		getNFKiosSignupPageSecondScreenContinueBtn().click();
		Reporter.logWithScreenShot("Exist user", MessageTypes.Pass);
		ClickOKBtn();

		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().clear();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().clear();
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().clear();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");

		getNFKiosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	// Method to clickOnOkButton

	public void ClickOKBtn() {
		String ok = LFSUtilsIOS.getPropString("appCommon.ok");
		try {
			getNFKiosSignuppageStaticlabel(ok).waitForPresent();
			getNFKiosSignuppageStaticlabel(ok).click();
		} catch (Exception e) {

		}
	}

	// Method to verify Hcp reset password screen when keeping email field blank

	public void noEmailResetPassword() {
		getNFKiosSignuppageHcpPassTxt().waitForPresent();
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageHcpTermChk().click();
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getNFKiosSignuppageHcpDoneBtn().verifyDisabled("Done button is disable when term check box not selected");
	}
	// Method to click and verify terms and Privacy policy screen

	public void clickAndVerifyTermAndPrivecy(String option) {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		option = option.toLowerCase();
		switch (option) {
		case "terms of use":
			getNFKiosSignupPageTermLnk().waitForPresent();
			getNFKiosSignupPageTermLnk().click();
			try {
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.done")).waitForPresent(8000);
			} catch (Exception e) {

			}
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.terms"))
					.verifyPresent("Term of use title");
			Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
			break;
		case "privacy policy":

			getNFKiosSignupPagePrivecyLnk().waitForPresent();
			getNFKiosSignupPagePrivecyLnk().click();
			try {
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.done")).waitForPresent(8000);
			} catch (Exception e) {

			}
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
					.verifyPresent("Privacy Policy title");
			Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);

			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
			break;
		}
	}

	// Method to select UOM for German/vietnam user

	public void selectUOM(String option) {

		if (getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Unit of measurement selection page for German Users", MessageTypes.Pass);
			option = option.toLowerCase();
			switch (option) {
			case "mg/dl":
				LFSUtilsIOS.click(getNFKiossignuppageUomselectMgdlbutton());
				break;

			case "mmol/l":
				LFSUtilsIOS.click(getNFKiossignuppageUomselectMmolbutton());
				break;
			}
		} else
			Reporter.logWithScreenShot("UOM is already selected", MessageTypes.Pass);
	}

	// gunther1
	public void verifyInvalidCharactersInFirstsNameandLastName() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().sendKeys("=<");
		getNFKiosSignuppageLastNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
		getNFKiosSignuppageFirstNameTxt().clear();
		getNFKiosSignuppageFirstNameTxt().sendKeys(typeName);
		getNFKiosSignuppageLastNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
		getNFKiosSignupPageErrorCancelImg().waitForPresent();
		getNFKiosSignupPageErrorCancelImg().click();
		getNFKiosSignuppageLastNameTxt().waitForPresent();
		getNFKiosSignuppageLastNameTxt().sendKeys("=<");
		getNFKiosSignuppageFirstNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid Last name is displayed", MessageTypes.Pass);
		getNFKiosSignuppageLastNameTxt().clear();
		getNFKiosSignuppageLastNameTxt().sendKeys(typeName1);
		getNFKiosSignuppageFirstNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in last name field",
				MessageTypes.Pass);
		getNFKiosSignupPageErrorCancelImg().waitForPresent();
		getNFKiosSignupPageErrorCancelImg().click();
	}

	// Method to set year
	public void setYear() {
		int currentYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int requiredYear = currentYear - 18;
		getNFKiosSignupPageDateOfBirthTBox().click();
		LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("onboarding.ageRestriction.title"))
				.verifyNotVisible("Age restriction pop up");
	}

	// Create account button on sign up first page
	public void clicksOnCreateAccountButton() {
		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		getNFKiosSignupPageSecondScreenContinueBtn().click();

	}

	public QAFWebElement getNFKiosSignuppageStaticLbl() {
		return NFKiosSignuppageStaticLbl;
	}

	// Method to verify opt-in screen on create account second screen

	public void verificationOfOptin() {
		getNFKiosSignuppageOptinTitleLbl().waitForPresent();

		getNFKiosSignuppageOptinTitleLbl().click();
		getNFKiosSignuppageOptinTitleLbl().verifyPresent("Opt-In Page Header Label Present");
		getNFKiosSignuppageOptinIagreeLbl().verifyPresent("I agree Label on Opt-In screen");
		getNFKiosSignuppageOptinCancelLbl().verifyPresent("Cancel button on Opt-In SCreen");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
				.waitForPresent();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
				.isDisplayed() && getNFKiosSignupPageOptinPrivecylnk().isPresent()) {
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
					.click();
			Reporter.logWithScreenShot("Clicked on Privacy Policy link From Opt-In screen", MessageTypes.Pass);
		}
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext"))
				.verifyPresent("privecy screen");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
		if (getNFKiosSignuppageOptinTitleLbl().isDisplayed() && getNFKiosSignuppageOptinTitleLbl().isPresent()) {
			Reporter.logWithScreenShot("Clicked back button and user is on Opt-In SCreen", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Not Clicked back button and user is on Privacy Policy Screen",
					MessageTypes.Fail);
		}

	}

	// method to verify customer service link on opt in screen redirects to new
	// mail dialouge
	public void verifyCustomerServiceLink() {
		Point p1 = getNFKiosSignuppageEmailadressTbox().getLocation();
		LFSUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY(), p1.getX(), p1.getY() - 100, 50);
		getNFKiosSignuppageOptinTitleLbl().click();
		if (getNFKiosSignuppageStaticlabel(ConstantUtils.SERVICE_LINK).isPresent()) {
			getNFKiosSignuppageStaticlabel(ConstantUtils.SERVICE_LINK).click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("Clicked on customer service link", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Cutomer service link is not present");
		}
	}
	

	public QAFWebElement getNFKiosSignuppageAboutmeTitleTxt(String string) {
		return LFSUtilsIOS.getElement("onboarding.aboutme.title", string);
	}

	public void enterFirstAndLastName() {
		String fname = "jon" + RandomStringUtils.randomAlphabetic(3);
		String lname = "Snow" + RandomStringUtils.randomAlphabetic(3);
		LFSUtilsIOS.enterText(getNFKiosSignuppageFirstNameTxt(), fname);
		LFSUtilsIOS.enterText(getNFKiosSignuppageLastNameTxt(), lname);
		iosDriver.hideKeyboard();
		Reporter.logWithScreenShot("User enetered first name nad last name", MessageTypes.Pass);
	}

	public void selectGenderAndDiabetesType(String gender, String diabetesType) {
		MoremenuPageIOS morePageObj = new MoremenuPageIOS();
		switch (gender) {
		case "MALE":
			LFSUtilsIOS.click(getNFKiosSignupGenderSelectionMaleBtn());
			break;
		case "FEMALE":
			LFSUtilsIOS.click(getNFKiosSignupGenderSelectionFemaleBtn());
			break;

		}
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.gender", gender);
		switch (diabetesType) {
		case "TYPE 1":
			LFSUtilsIOS.click(getNFKiosSignupDiabetesTypeType1btn());
			break;
		case "TYPE 2":
			LFSUtilsIOS.click(getNFKiosSignupDiabetesTypeType2btn());
			break;
		case "GESTATIONAL":
			LFSUtilsIOS.click(morePageObj
					.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("more.aboutme.diabetesType.gestational")));
			break;
		}
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.diabetes type", diabetesType);
		Reporter.logWithScreenShot("User selected the Gender and Diabetes type", MessageTypes.Pass);
	}

	// Method to verify gender and diabetes selection page
	public void verifyGenderAndDiabetesSelectionPage() {
		String genderDiabetesTypePageTitle = LFSUtilsIOS.getPropString("onboarding.aboutme.title");
		getNFKiosSignuppageStaticlabel(genderDiabetesTypePageTitle).waitForPresent();
		getNFKiosSignuppageStaticlabel(genderDiabetesTypePageTitle).verifyPresent("Tell us about yourself");
		String genderDiabetesTypePageHeader = LFSUtilsIOS.getPropString("onboarding.aboutme.message");
		getNFKiosSignuppageStaticlabel(genderDiabetesTypePageHeader)
				.verifyPresent("To complete Sign Up, please tell us your gender and diabetes type.");
		String genderLabel = LFSUtilsIOS.getPropString("more.aboutme.genderText");
		getNFKiosSignuppageStaticlabel(genderLabel).verifyPresent("Gender");
		String MaleLabel = LFSUtilsIOS.getPropString("more.aboutme.gender.male");
		getNFKiosSignuppageStaticlabel(MaleLabel).verifyPresent("Male");
		String FemaleLabel = LFSUtilsIOS.getPropString("more.aboutme.gender.female");
		getNFKiosSignuppageStaticlabel(FemaleLabel).verifyPresent("Female");
		String diabetesTypeLabel = LFSUtilsIOS.getPropString("more.aboutme.diabetesTypeText");
		getNFKiosSignuppageStaticlabel(diabetesTypeLabel).verifyPresent("Diabetes Type");
		String Type1Label = LFSUtilsIOS.getPropString("more.aboutme.diabetesType.type1");
		getNFKiosSignuppageStaticlabel(Type1Label).verifyPresent("Type 1");
		String Type2Label = LFSUtilsIOS.getPropString("more.aboutme.diabetesType.type2");
		getNFKiosSignuppageStaticlabel(Type2Label).verifyPresent("Type 2");
		String gestationalLabel = LFSUtilsIOS.getPropString("more.aboutme.diabetesType.gestational");
		getNFKiosSignuppageStaticlabel(gestationalLabel).verifyPresent("Gestational");
		getNFKiosSignuppageSignupBtn().verifyPresent("Sign Up button");
	}

	// method to click on continue button on sign up second screen
	public void clickOnContinueBtn() {
		if (getNFKiosSignuppageDependentGuardianaccountText().isPresent()) {
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
			LFSUtilsIOS.click(getNFKiosSignuppageDependentContinue());
			Reporter.logWithScreenShot("User clicked on continue button of Dependent screen", MessageTypes.Pass);
		} else {
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
			LFSUtilsIOS.click(getNFKiosSignupPageSecondScreenContinueBtn());
			Reporter.logWithScreenShot("User clicked on continue button", MessageTypes.Pass);
		}
	}

	// method to verify gestational type when male gender is selected
	public void verifyGestationalTypeForMale() {
		getNFKiosSignupDiabetesTypeGestationalbtn().waitForPresent();
		getNFKiosSignupDiabetesTypeGestationalbtn().verifyDisabled("Gestational type is disabled for Male Gender");
		Reporter.logWithScreenShot("Gestational type is disabled for Male gender", MessageTypes.Pass);

	}

	// Method to add office from home screen
	public void addOffice(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsIOS.enterText(getNFKiosSignuppageOfficeCodeTxt(), userBean.getClinicCode());
		Reporter.logWithScreenShot("Clinic code added", MessageTypes.Pass);

		Reporter.logWithScreenShot("Clinic consent", MessageTypes.Pass);

	}

	public void verifyClinicTermsClinicInfo() {
		try {
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.name")).assertPresent("Clinic name");
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.phone")).assertPresent("Clinic Phone No.");
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 1);
			if (!getNFKiosSignuppageLastNameTxt().isPresent()) {
				LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 1);
			}
			Reporter.logWithScreenShot("Clinic consent checkbox", MessageTypes.Pass);
			LFSUtilsIOS.click(getNFKiosSignuppageAddclinicTermchkBtn());
			LFSUtilsIOS.click(getNFKiosSignuppageAddclinicSendBtn());
			getNFKiosSignuppageOfficeCodeTxt().assertPresent("Clinic Info field");
			verifyClinicInfo();
			Reporter.logWithScreenShot("Sucessfully verified Clinic Terms of clinic info", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify clinic Terms of clinic info", MessageTypes.Fail);
		}
	}

	public void verifyClinicInfo() {
		try {

			Assert.assertEquals(getNFKiosSignuppageClinicName().getText(), LFSUtilsIOS.getPropString("office.name"));
			Assert.assertEquals(getNFKiosSignuppageClinicPhone().getText(), LFSUtilsIOS.getPropString("office.phone"));
			Assert.assertEquals(getNFKiosSignuppageClinicMsgTxt().getText(),
					LFSUtilsIOS.getPropString("office.code.request.pending"));
			getNFKiosSignuppageClinicCancelBtn().assertPresent("Cancel button");

			Reporter.logWithScreenShot("Sucessfully verified clinic info", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify clinic info", MessageTypes.Fail);
		}
	}

	public void setMaxAgeForDOB() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 126;
		int actualYear = currentYear - 125;
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		}
		if (getNFKiosSignupPageTimingPickerYearPkr().getAttribute("value").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond" + actualYear, MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to enter year beyond " + actualYear, MessageTypes.Fail);
	}

	public void safetyOnboardingScreen() {
		try {
			HomePageIOS home = new HomePageIOS();
			swipeToSafteyOnboardingsScreen();
			if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
				Reporter.log("Critical Alert Pop-up displayed");
				LFSUtilsIOS.click(getNFKiosSignupPageSafetyboardNotificationsAllowPopup());
			} else
				Reporter.log("Critical Alert pop-up not displayed");
			if (getNFKiosApplysensorTitle().isPresent()) {
				LFSUtilsIOS.click(getNFKiosApplysensorSkipBtn());
				Reporter.logWithScreenShot("The user skips the Sensor Pair screen", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("Sensor pair screen is not displayed", MessageTypes.Fail);
			if (home.getNFKiosHomepageTipContainer().isPresent()) {
				LFSUtilsIOS.clickWithText(LFSUtilsIOS.getPropString("startsensor.title"));
			} else {
				Reporter.log("No tip is present");
			}
			Reporter.logWithScreenShot("User completed safety onboarding", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to complete safety onboarding", MessageTypes.Fail);
		}
	}

	public void verifySendButtonEnable(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosSignuppageOfficeCodeTxt().sendKeys(userBean.getClinicCode());
		getNFKiosSignuppageAddclinicSendBtn().waitForPresent();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (getNFKiosSignuppageAddclinicTermchkBtn().getAttribute("visible").equals("false")) {
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
		getNFKiosSignuppageFirstNameTxt().sendKeys("NFK");
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageLastNameTxt().sendKeys("NFK");
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageAddclinicSendBtn().verifyDisabled("term checkbox not selected, send btn");
		getNFKiosSignuppageFirstNameTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageAddclinicTermchkBtn().click();
		getNFKiosSignuppageAddclinicSendBtn().verifyDisabled("For emptry first name, send btn");
		getNFKiosSignuppageFirstNameTxt().sendKeys("NFK");
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageLastNameTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageAddclinicSendBtn().verifyDisabled("For empty Last name, send button");

	}

	public void swipeToSafteyOnboardingsScreen() {
		if (getNFKiosSignuppageStaticlabel(
				ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).isDisplayed()) {
			for (int i = 1; i < 11; i++) {
				if (getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().isPresent()) {
					LFSUtilsIOS.click(getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox());
				} else if (getNFKiosSignupPageSafetyboardNoMRCBox().isPresent()) {
					LFSUtilsIOS.click(getNFKiosSignupPageSafetyboardNoMRCBox());
				} else if (getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().isPresent()) {
					LFSUtilsIOS.click(getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox());
				} else if (getNFKiosSignupPageSafetyboardAlertNotificationsCBox().isPresent()) {
					LFSUtilsIOS.click(getNFKiosSignupPageSafetyboardAlertNotificationsCBox());
				} else if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
					LFSUtilsIOS.click(getNFKiosSignupPageSafetyboardNotificationsAllowPopup());
				} else {
					LFSUtilsIOS.swipeWithScreenPercent(95, 80, 5, 80, 7);
				}
				Reporter.logWithScreenShot("Safety Onboarding screen " + (i), MessageTypes.Pass);
			}
			LFSUtilsIOS.click(getNFKiosSignuppagesafetydonebtn());
		}
	}

	public void verifyAppOverviewWelcome() {
		if (getNFKiosSignuppageSkipBtn().isPresent())
			Reporter.logWithScreenShot("Skip button is present", MessageTypes.Pass);
		getNFKiosSignuppageSkipBtn().click();

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome page is displayed with forward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);

		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.waitForPresent();

	}

	public void verifyAppOverviewOverlayAllInfo() {
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.isPresent()) {
			Reporter.logWithScreenShot("Navigate your app page is displayed with forward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Timeline page is displayed with forward navigation",
					MessageTypes.Pass);
		}

		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Logbook page is displayed with forward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Share your Data page is displayed with forward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Adjust your settings page is displayed with forward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with forward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot(
					"Ready to See OneTouch Reveal in Action page is displayed with forward navigation",
					MessageTypes.Pass);
		}
	}

	EventLogPageIOS logbook = new EventLogPageIOS();

	public void userVerifyToAndFroNavigation() {
		if (getNFKiosSignuppageSkipBtn().isPresent())
			Reporter.logWithScreenShot("Skip button is present", MessageTypes.Pass);
		getNFKiosSignuppageSkipBtn().click();

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome Title", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(80, 50, 30, 50, 2);
		LFSUtilsIOS.swipeWithScreenPercent(80, 50, 30, 50, 2);
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.isPresent()) {
			Reporter.logWithScreenShot("Navigate your app", MessageTypes.Pass);
		}

		LFSUtilsIOS.swipeWithScreenPercent(20, 50, 70, 50, 2);
		LFSUtilsIOS.swipeWithScreenPercent(20, 50, 70, 50, 2);
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome Title", MessageTypes.Pass);
		}

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("common.actions.skip")).isPresent()) {
			logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("common.actions.skip")).click();
		}

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot("Ready to See OneTouch Reveal in Action page is present", MessageTypes.Pass);
		}

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.description"))
				.isPresent()) {
			Reporter.logWithScreenShot("Access this App Overview at any time in More > Help text is present",
					MessageTypes.Pass);
		}
	}

	public void verifyForwardNavigation() {
		verifyAppOverviewWelcome();
		verifyAppOverviewOverlayAllInfo();
	}

	public void verifyBackwardNavigation() {

		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with backward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Adjust your settings page is displayed with backward navigation",
					MessageTypes.Pass);
		}

		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Share your Data page is displayed with backward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Logbook page is displayed with backward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Timeline page is displayed with backward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.isPresent()) {
			Reporter.logWithScreenShot("Navigate your app page is displayed with backward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);

		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome Title is displayed with backward navigation", MessageTypes.Pass);
		}
	}

	public void sensoronboardpages() {
		try {

			if (getNFKiosSignuppageStaticlabel(
					ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).isDisplayed()) {
				for (int i = 1; i <= 11; i++) {
					if (getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().click();
					} else if (getNFKiosSignupPageSafetyboardNoMRCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardNoMRCBox().click();
					} else if (getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().click();
					} else if (getNFKiosSignupPageSafetyboardAlertNotificationsCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardAlertNotificationsCBox().click();
					} else if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
						getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
					} else {
						LFSUtilsIOS.swipeWithScreenPercent(95, 80, 5, 80, 7);
					}
					Reporter.logWithScreenShot("Safety Onboarding screen " + i, MessageTypes.Pass);
				}

				getNFKiosSignuppagesafetydonebtn().waitForPresent();
				getNFKiosSignuppagesafetydonebtn().click();
				getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fillDependentDetails(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKiosSignuppageDependentGuardianFname().click();
		getNFKiosSignuppageDependentGuardianFname()
				.sendKeys(userBean.getGuardianfname() + RandomStringUtils.randomAlphabetic(4));
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentGuardianLname().assertPresent("Guardian Last name field");
		getNFKiosSignuppageDependentGuardianLname()
				.sendKeys(userBean.getGuardianlname() + RandomStringUtils.randomAlphabetic(4));
		String email1 = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		iosDriver.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKiosSignuppageDependentEmail().assertPresent("Email field of Dependent");
		getNFKiosSignuppageDependentEmail().click();
		getNFKiosSignuppageDependentEmail().sendKeys(email1);
		Reporter.logWithScreenShot("Entered the email", MessageTypes.Pass);

		iosDriver.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentConfirmEmail().click();
		getNFKiosSignuppageDependentConfirmEmail().assertPresent("Confirm Email field of Dependent");
		getNFKiosSignuppageDependentConfirmEmail().click();
		getNFKiosSignuppageDependentConfirmEmail().sendKeys(email1);

		getNFKiosSignuppageDependentGuardianaccountText().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 10, 10);
		getNFKiosSignuppageDependentPassword().click();
		getNFKiosSignuppageDependentPassword().assertPresent("Password field on Guardian screen");
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentPassword().sendKeys(userBean.getGuardianpassword());
		ConfigurationManager.getBundle().setProperty("dependent.password", userBean.getGuardianconfirmpassword());
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm password field");
		getNFKiosSignuppageDependentConfirmPassword().sendKeys(userBean.getGuardianconfirmpassword());
		iosDriver.hideKeyboard();
		getNFKiosSignuppageDependentTermsCheckbox().assertPresent("Terms and condition check box");
		getNFKiosSignuppageDependentTermsCheckbox().click();
		getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing check box");
		Reporter.logWithScreenShot("User has entered the Guardian details", MessageTypes.Pass);

	}

	public void enterDobFirstAndLastName(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		getNFKiosSignupPageTimingPickerYearPkr().sendKeys(userBean.getDependentDOByear());
		getNFKiosSignupPageBdPickerDoneBtn().click();
		enterFirstAndLastName();
		Reporter.logWithScreenShot("Guardian has enetered depedent's details", MessageTypes.Pass);
	}

	public void setDependentDateOfBirth(UserDetailBeans userBean) {
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(userBean.getBirthdayYear());
			getNFKiosSignupPageBdPickerDoneBtn().click();

		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(),
					Integer.parseInt(userBean.getBirthdayYear()));

		}

	}

	// Verify UOM screen
	public void verifyUOMscreen() {
		try {
			getNFKiossignuppageUomselecttitle().isPresent();
			getNFKiossignuppageUomselecttext().isPresent();
			getNFKiossignuppageUomselecttext1().isPresent();
			getNFKiossignuppageUomselectMgdlbuttontext().isPresent();
			getNFKiossignuppageUomselectMgdlbutton().isPresent();
			getNFKiossignuppageUomselectMmolbuttontext().isPresent();
			getNFKiossignuppageUomselectMmolbutton().isPresent();
			Reporter.logWithScreenShot("Sucessfully verified UOM Screen", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify UOM screen ", MessageTypes.Fail);
		}
	}

	// data set to check the Avergae of 90 days and compare
	public void fillCGMReadings() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		ApiMethods apiObj = new ApiMethods();

		int noOfData = 10;
		int noofdays = 90;
		int[] cgmval = new int[] { 66, 68, 100, 102, 108, 202, 204, 206, 208, 210 };
		apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
	}

	public void fillCGMReadingsReports() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		ApiMethods apiObj = new ApiMethods();
		int noOfData = 1440;
		int noofdays = 15;
		apiObj.addCGMforAGP(email, password, noOfData, noofdays);
	}

	public void fillCGMReadingsAGP() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password.key");
		ApiMethods apiObj = new ApiMethods();

		int noOfData = 40;
		int noofdays = 90;
		int[] cgmval = new int[] { 90, 87, 86, 82, 76, 70, 78, 81, 77, 74, 77, 69, 62, 60, 60, 57, 61, 65, 58, 61, 68,
				68, 62, 54, 58, 55, 63, 71, 73, 74, 77, 72, 74, 69, 74, 80, 76, 72, 77, 89 };
		apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);

	}

	public void fillLowCGMReadings() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		ApiMethods apiObj = new ApiMethods();

		int noOfLowData = 31;
		int noofLowdays = 7;
		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);
		int[] cgmlowval = new int[] { 75, 76, 79, 80, 82, 83, 85, 88, 89, 105, 110, 111, 125, 126, 128, 64, 63, 62, 61,
				60, 63, 62, 61, 56, 58, 59, 60, 65, 57, 65, 63 };
		apiObj.addLoginDetailsLow(email, password, noOfLowData, noofLowdays, cgmlowval);
	}

	// enter name and select DOB for 2-5 yr old child
	public void setchilddob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 4;
		int actualYear = currentYear - 125;
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		}
		if (getNFKiosSignupPageTimingPickerYearPkr().getAttribute("value").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to enter age between 2-5 year", MessageTypes.Pass);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		enterFirstAndLastName();
	}

	// enter name and select DOB for 7-18 yr old kid
	public void setteenagedob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 8;
		int actualYear = currentYear - 125;
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		}
		if (getNFKiosSignupPageTimingPickerYearPkr().getAttribute("value").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond", MessageTypes.Fail);
		} else
			Reporter.logWithScreenShot("User is able to enter age between 6-17 year", MessageTypes.Pass);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		enterFirstAndLastName();
	}

	public void enterLowDataAPI() {
		ApiMethods apiObj = new ApiMethods();

		int noOfLowData = 30;
		int noofLowdays = 90;
		// 9 days 16 days
		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);

		int[] cgmlowval = new int[] { 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 69, 69, 69, 69, 69,
				69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69 };

		apiObj.addLoginDetailsLow("testlowevent@mailinator.com", "test1234", noOfLowData, noofLowdays, cgmlowval);

	}

	// 8 days LGE and 6 days in range reading - 14 days
	public void createDatasets() {

		ApiMethods apiObj = new ApiMethods();

		int noOfLowData = 30;
		int noofLowdays = 8;
		int noOfInRangeData = 10;
		int noofInRangedays = 6;
		LocalDate startdateforlow = LocalDate.of(2021, 12, 15);
		LocalDate startdateforinrange = startdateforlow.minusDays(noofLowdays);

		int[] cgmlowval = new int[] { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 64, 63, 62, 61, 60,
				63, 62, 61, 56, 58, 59, 60, 65, 57, 65 };
		int[] cgminrangeval = new int[] { 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 };

		int[][] values = { cgmlowval, cgminrangeval };
		LocalDate[] date = { startdateforlow, startdateforinrange };
		int[] days = { noofLowdays, noofInRangedays };
		int[] noOfData = { noOfLowData, noOfInRangeData };
		for (int i = 0; i < values.length; i++) {
			apiObj.addDetailsforDataSet("testlowevent@mailinator.com", "test1234", date[i], noOfData[i], days[i],
					values[i]);
		}
	}

	public void completeSafetyOnboardingScreen() {
		HomePageIOS home = new HomePageIOS();
		try {
			swipeToSafteyOnboardingsScreen();
			LFSUtilsIOS.clickWithText("Skip");

			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}

		getNFKiosSignupPagePairSensorSkipBtn().click();
		Reporter.logWithScreenShot("The user skips the Sensor Pair screen", MessageTypes.Pass);

		try {
			if (home.getNFKiosHomepageTipContainer().isPresent()) {
				home.getNFKiosHomepageTipContainer().isPresent();
				LFSUtilsIOS.clickWithText(LFSUtilsIOS.getPropString("startsensor.title"));
				LFSUtilsIOS.pause(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickDontAllowpopupbutton() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		LFSUtilsIOS.clickWithText("Don�t Allow");
	}

	public void clickonBackbutton() {
		if (getNFKiosSafteyboardingBackBtn().isPresent()) {
			getNFKiosSafteyboardingBackBtn().click();
			getNFKiosSafteyboardingBackBtn().click();
			Reporter.logWithScreenShot("Navigated Back ", MessageTypes.Pass);
		}

	}

	public void clickonBackbutton1() {
		if (getNFKiosSafteyboardingBackBtn().isPresent()) {
			getNFKiosSafteyboardingBackBtn().click();
			Reporter.logWithScreenShot("Navigated Back ", MessageTypes.Pass);
		}

	}

	public void ClickNotificationSettingButton() {
		if (getNFKiosSettingsNotificationBtn().isPresent()) {
			getNFKiosSettingsNotificationBtn().click();
			Reporter.logWithScreenShot("Notification Setting Button is present", MessageTypes.Pass);
		}
	}

	public void clickonDoneButton() {
		if (getNFKiosSignuppagesafetydonebtn().isPresent()) {
			getNFKiosSignuppagesafetydonebtn().click();
			LFSUtilsIOS.waitforLoad();
		}
	}

	public void VerifyCriticalAlertScreen() {
		if (getNFKiosSafteyonboardingSettingsBtn().isPresent()) {
			Reporter.logWithScreenShot("Setting Button is present", MessageTypes.Pass);
		}

	}

	public void verifyUrgentLowNotificationScreen() {
		getNFKiosSignupPageSafetyboardUrgentLowNotificationtxt().waitForPresent(10);
		getNFKiosSignupPageSafetyboardUrgentLowNotificationtxt().verifyPresent("Urgent Low Notifications");

	}

	public void ClickSettingButton() {
		if (getNFKiosSafteyonboardingSettingsBtn().isPresent()) {
			getNFKiosSafteyonboardingSettingsBtn().click();
			Reporter.logWithScreenShot("Clicked on Setting Button", MessageTypes.Pass);
		}

	}

	public void ClickBackBtn() {
		if (getNFKiosSettingsBackToAppBtn().isPresent()) {
			getNFKiosSettingsBackToAppBtn().click();
			Reporter.logWithScreenShot("Redirected Back to app", MessageTypes.Pass);
		}
	}

	public void verifyPairSensorScreen() {
		getNFKiosSignupPageSafetyboardPairSensorScreentxt().verifyPresent("Start Sensor Session");
	}

	public void verifyGuardianSignupPage() {
		getNFKiosSignuppageDependentGuardianFname().assertPresent("Guardian First Name Field");
		getNFKiosSignuppageDependentGuardianLname().assertPresent("Guardian Last Name Field");
		getNFKiosSignuppageDependentEmail().assertPresent("Email field ");
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm Email Field");
		getNFKiosSignuppageDependentPassword().assertPresent("Password Field");
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm Password Field");
		getNFKiosSignuppageDependentTermsCheckbox().assertPresent("Term and agreement checkbox");
		getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing CheckBox");
		LFSUtilsIOS.scrollDown();
		;
		getNFKiosSignuppageDependentContinue().assertPresent("Continue button");
		Reporter.logWithScreenShot(" Verified Guardian Signup page ", MessageTypes.Pass);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
	}

	public void clickOnLoginLink() {
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();

		if (getNFKiosDecisionPageLoginDependentBtn().isPresent()) {
			Reporter.logWithScreenShot("Select Login Dependent", MessageTypes.Pass);
			getNFKiosDecisionPageLoginDependentBtn().assertPresent("Login Dependent button");
			getNFKiosDecisionPageLoginDependentBtn().click();
		} else
			Reporter.logWithScreenShot("User has not navigated to Login to see page", MessageTypes.Fail);

	}

	public void ValidatesSignupMyselfPage() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 8;
		int actualYear = currentYear - 2;

		getNFKiosSignuppageEmailadressTbox().sendKeys(".<+");
		getNFKiosSignuppageConfirmemailadressTbox().click();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Email Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(".<+");
		getNFKiosSignuppagePasswordTbox().click();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Email Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(125) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Large amount of text is entered", MessageTypes.Pass);

		if (getNFKiosSignuppageEmailadressTbox().getText().toString().length() > 75) {
			Reporter.logWithScreenShot("Email Length exceeds the limit", MessageTypes.Pass);
			getNFKiosSignuppageEmailadressTbox().clear();
			email = RandomStringUtils.randomAlphanumeric(65) + "@testmail.com";
			getNFKiosSignuppageEmailadressTbox().sendKeys(email);
			getNFKiosSignuppageConfirmemailadressTbox().click();
			Reporter.logWithScreenShot("Email Length is within given limit", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		}
		String email = RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("abc@testmail.com");
		getNFKiosSignuppagePasswordTbox().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
				.verifyPresent("Both email address fields must match error message");
		getNFKiosSignupPageErrorIcon().click();
		getNFKiosSignupPageErrorIcon().click();
		getNFKiosSignuppagePasswordTbox().sendKeys(".<+");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		getNFKiosSignupPageErrorIcon().click();
		LFSUtilsIOS.scrollDown();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys(".<+");
		getNFKiosSignuppageDependentClinic().click();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Confrim Password Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageOfficeCodeTxt().click();
		getNFKiosSignuppageOfficeCodeTxt().sendKeys("ttccxx");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message");
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		if (getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed()
				&& getNFKiosSignupPageAgeRestrictionPopupClose().isDisplayed()) {
			Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
			getNFKiosSignupPageAgeRestrictionPopupClose().click();
		}
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(actualYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		if (getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed()
				&& getNFKiosSignupPageAgeRestrictionPopupClose().isDisplayed()) {
			Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
			getNFKiosSignupPageAgeRestrictionPopupClose().click();
		}
	}

	public void validatesignupDepedentPage() {
		getNFKiosSignuppageDependentGuardianFname().waitForPresent();
		getNFKiosSignuppageDependentGuardianFname().sendKeys("=<");
		getNFKiosSignuppageDependentGuardianLname().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentGuardianLname().sendKeys("=<");
		getNFKiosSignuppageDependentEmail().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentEmailLabel().click();
		LFSUtilsIOS.scrollDown();
		getNFKiosSignuppageDependentEmail().sendKeys("<>+.com");
		getNFKiosSignuppageDependentConfirmEmail().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Invalid email address format")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentConfirmEmail().sendKeys("<>+.com");
		getNFKiosSignuppageDependentPassword().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Invalid email address format")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentPassword().sendKeys("<>+:");
		getNFKiosSignuppageDependentConfirmPassword().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Passwords must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentConfirmPassword().waitForPresent();
		getNFKiosSignuppageDependentConfirmPassword().sendKeys(".<+=");
		getNFKiosSignuppageDependentPassword().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Passwords do not match")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}

	}

	public void validatessignupmyselfsecondpage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().sendKeys("=<");
		getNFKiosSignuppageLastNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Invalid Confrim Password Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageLastNameTxt().sendKeys("=<");
		getNFKiosSignuppageFirstNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Invalid Confrim Password Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		clickonBackbutton();
		getNFKiosSafteyboardingBackBtn().click();
	}

	public void validatesSignupDepedentSecondPage() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 18;
		int actualYear = currentYear - 1;
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().sendKeys("<+=.");
		getNFKiosSignuppageLastNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageLastNameTxt().sendKeys("<+=.");
		getNFKiosSignuppageFirstNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentClinic().click();
		getNFKiosSignuppageDependentClinic().sendKeys("ttccxx");
		getNFKiosSignuppageLastNameTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message");
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), requiredYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed();
		getNFKiosSignupPageAgeRestrictionPopupOK().isDisplayed();
		Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
		getNFKiosSignupPageAgeRestrictionPopupOK().click();
		getNFKiosSignupPageDateOfBirthTBox().click();
		try {
			getNFKiosSignupPageTimingPickerYearPkr().sendKeys(Integer.toString(actualYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignupPageTimingPickerYearPkr(), actualYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed();
		getNFKiosSignupPageAgeRestrictionPopupOK().isDisplayed();
		Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
		getNFKiosSignupPageAgeRestrictionPopupOK().click();
	}

	public void clickonSignupDepedent(String page) {
		switch (page) {
		case "SIGN-UP MYSELF":
			try {
				if (getNFKiosDecisionPageSignupMyselfBtn().isPresent()) {
					getNFKiosDecisionPageSignupMyselfBtn().click();
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for Myself button", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("Signup button not present on Decision screen", MessageTypes.Fail);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "SIGN-UP DEPENDENT":
			try {
				if (getNFKiosDecisionPageSignupDependentBtn().isPresent()) {
					getNFKiosDecisionPageSignupDependentBtn().waitForPresent();
					getNFKiosDecisionPageSignupDependentBtn().click();
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for a dependent button", MessageTypes.Pass);

				} else {
					Reporter.logWithScreenShot("User was not able to click on signup dependent button",
							MessageTypes.Fail);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void selectDiabetesType(String diabetesType) {
		LoginPageIOS login = new LoginPageIOS();
		switch (diabetesType) {
		case "TYPE 1":
		
			login.getNFKiosGestationalTypeOneRadioBtn().waitForPresent();
			login.getNFKiosGestationalTypeOneRadioBtn().click();
			break;
		case "TYPE 2":
			
			login.getNFKiosGestationalTypeTwoRadioBtn().waitForPresent();
			login.getNFKiosGestationalTypeTwoRadioBtn().click();
			break;
		}
		continueEnabled();
	}

	private void continueEnabled() {
		LoginPageIOS login = new LoginPageIOS();
		login.getNFKiosGestationalContinueBtn().isPresent();
		login.getNFKiosGestationalContinueBtn().isEnabled();
	}

	public void fillexisitingUser(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageEmailadressTbox().click();
		getNFKiosSignuppageEmailadressTbox().sendKeys(userBean.getEmailID());
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(userBean.getEmailID());
		getNFKiosSignuppagePasswordTbox().click();

		getNFKiosSignuppagePasswordTbox().sendKeys("test@1234");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("test@1234");
		getNFKiosSignupPageDateOfBirthTBox().click();
		setDateOfBirth(userBean);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
	}

	public void verifyEmailExitPopup() {
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
				.assertPresent("Ok button on error popup");
		Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).isDisplayed();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
	}

	public void fillexisitingGuardianUser(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsIOS.enterText(getNFKiosSignuppageDependentGuardianFname(), userBean.getGuardianfname());
		LFSUtilsIOS.enterText(getNFKiosSignuppageDependentEmail(), userBean.getEmailID());
		LFSUtilsIOS.enterText(getNFKiosSignuppageDependentConfirmEmail(), userBean.getEmailID());

		LFSUtilsIOS.enterText(getNFKiosSignuppageDependentPassword(), userBean.getGuardianpassword());
		LFSUtilsIOS.enterText(getNFKiosSignuppageDependentConfirmPassword(), userBean.getGuardianconfirmpassword());

		LFSUtilsIOS.enterText(getNFKiosSignuppageDependentGuardianLname(), userBean.getGuardianlname());
		getNFKiosSignuppageDependentTermsCheckbox().click();
	}

	public void SafetyOnboardingScreenSkipEmancipation() {
		swipeToSafteyOnboardingsScreen();
		if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
			getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
			Reporter.log("Critical Alert Pop-up");
		} else {
			Reporter.log("Critical Alert pop-up not displayed");
		}
		LFSUtilsIOS.clickWithText("Skip");
	}

	public void verifyEmancipationscreen() {
		getNFKiosSignuppageStaticlabel("Happy 18th birthday!").isPresent();
		getNFKiosSignupPageEmancipationEmail().verifyPresent("Email id is present");
		getNFKiosSignupPageEmancipationConfirmEmail().verifyPresent("Confirm Email id is present");
		getNFKiosSignupPageEmancipationPassword().verifyPresent("Password is present");
		getNFKiosSignupPageEmancipationConfirmPassword().verifyPresent("Confirm Password is present");
		getNFKiosSignupPageEmancipationTermsAndPrivacy().verifyPresent("Terms and Privacy is present");
		getNFKiosSignupPageEmancipationMarketingAgreement().verifyPresent("Marketing Agreementis present");
		Reporter.logWithScreenShot("Emancipation screen is Verified");
	}

	public void verifyInvalidPasswordError() {
		try {
			if (getNFKiosSignupPageErrorLabel().getText()
					.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar"))) {
				Reporter.logWithScreenShot("Sucessfully verified password field error message. ", MessageTypes.Pass);
				getNFKiosSignupPageErrorIcon().click();
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify invalid password error message " + MessageTypes.Fail);
		}
	}

	public void validateEmancipationfield(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		String userData = userDetails.toString();
		switch (userData) {
		case "fieldValidations.emancipationEmail":
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKiosSignupPageEmancipationEmail().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully entered the invalid email format", MessageTypes.Pass);
					getNFKiosSignupPageEmancipationConfirmEmail().click();
					getNFKiosSignuppageStaticlabel(
							LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
									.verifyPresent("Invalid Email Error displayed");
					getNFKiosSignupPageErrorIcon().click();
					getNFKiosSignupPageEmancipationEmail().click();
					getNFKiosSignupPageEmancipationConfirmEmail().clear();
					getNFKiosSignupPageEmancipationEmail().clear();
				}
				Reporter.logWithScreenShot("Successfully verified email field with inavlid email format",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationEmail().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot(
						"Successfully entered email with minimum characters " + userBean.getMinCharacters(),
						MessageTypes.Pass);
				getNFKiosSignupPageEmancipationConfirmEmail().click();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyPresent("Invalid Email Error displayed");
				getNFKiosSignupPageErrorIcon().click();
				getNFKiosSignupPageEmancipationEmail()
						.sendKeys(RandomStringUtils.randomAlphanumeric(125) + "@testmail.com");
				getNFKiosSignupPageEmancipationConfirmEmail().click();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyPresent("Invalid Email Error displayed");
				Reporter.logWithScreenShot("Successfully entered email with maximum characters "
						+ RandomStringUtils.randomAlphanumeric(125) + "@testmail.com", MessageTypes.Pass);
				getNFKiosSignupPageEmancipationConfirmEmail().click();
				getNFKiosSignupPageErrorIcon().click();
				getNFKiosSignupPageEmancipationEmail().clear();
				Reporter.logWithScreenShot("Successfully verified email field with minimum and maximum characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationEmail().sendKeys(userBean.getEmailID());
				getNFKiosSignupPageEmancipationConfirmEmail().sendKeys(userBean.getConfirmEmail());
				getNFKiosSignupPageEmancipationPassword().click();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
						.verifyPresent("Email NOt Match Error displayed");

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.cancel")).click();
			break;
		case "fieldValidations.emancipationPWD":
			try {
				String charArray[] = userBean.getNotAllowedCharacters().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKiosSignupPageEmancipationPassword().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					getNFKiosSignupPageEmancipationConfirmPassword().click();
					verifyInvalidPasswordError();
					getNFKiosSignupPageEmancipationPassword().clear();
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKiosSignupPageEmancipationPassword().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					getNFKiosSignupPageEmancipationConfirmPassword().click();
					verifyInvalidPasswordError();
					getNFKiosSignupPageEmancipationPassword().clear();
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationPassword().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				getNFKiosSignupPageEmancipationConfirmPassword().click();
				verifyInvalidPasswordError();
				getNFKiosSignupPageEmancipationPassword().clear();
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationPassword().sendKeys(userBean.getPassword());
				getNFKiosSignupPageEmancipationConfirmPassword().sendKeys(userBean.getConfirmPassword());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				getNFKiosSignupPageEmancipationEmail().click();
				verifyInvalidPasswordError();
				getNFKiosSignupPageEmancipationPassword().clear();
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
		getNFKiosSignupPageEmancipationEmail().verifyPresent("Email id is present");
		getNFKiosSignupPageEmancipationEmail().sendKeys(userBean.getExistingEmail());
		getNFKiosSignupPageEmancipationConfirmEmail().sendKeys(userBean.getExistingEmail());
		getNFKiosSignupPageEmancipationPassword().sendKeys(userBean.getPassword());
		getNFKiosSignupPageEmancipationConfirmPassword().sendKeys(userBean.getPassword());
		getNFKiosSignupPageEmancipationTermsAndPrivacy().click();
		getNFKiosSignupPageEmancipationContinueBtn().verifyEnabled();
		getNFKiosSignupPageEmancipationContinueBtn().click();
		Reporter.logWithScreenShot("Emancipation screen is Verified");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
				.assertPresent("Ok button on error popup");
		Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		getNFKiosSignuppageStaticlabel("Happy 18th birthday!").isPresent();
	}

	public void Verifybluethoothpopup1() throws InterruptedException {
		LFSUtilsIOS util = new LFSUtilsIOS();
		if (getNFKiosSignupPageNotificationBluetoothPopupClose().isDisplayed()) {
			getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("onboarding.bluetooth.popup"))
					.verifyPresent("Bluetooth");
			getNFKiosSignupPageNotificationBluetoothPopupSetting().verifyPresent("Settings options on popup");
			Reporter.logWithScreenShot("Bluetooth popup is displayed", MessageTypes.Pass);
			getNFKiosSignupPageNotificationBluetoothPopupSetting().click();
			util.turnOnBluetooth();
		}

	}

	public void Verifybluethoothpopup(String step) {
		switch (step) {
		case "first":

			if (getNFKiosSignupPageNotificationBluetoothPopupClose().isDisplayed()) {
				getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("onboarding.bluetooth.popup"))
						.verifyPresent("Bluetooth");
				getNFKiosSignupPageNotificationBluetoothPopupSetting().verifyPresent("Settings options on popup");
				Reporter.logWithScreenShot("Bluetooth popup is displayed", MessageTypes.Pass);
				getNFKiosSignupPageNotificationBluetoothPopupClose().click();
			}
			break;
		case "final":
			if (getNFKiosSignupPageNotificationBluetoothPopupClose().isDisplayed()) {
				getNFKiosSignupPageNotificationBluetoothPopupSetting().verifyPresent("Settings options on popup");
				Reporter.logWithScreenShot("Bluetooth popup is displayed", MessageTypes.Pass);
				getNFKiosSignupPageNotificationBluetoothPopupSetting().click();
				LFSUtilsIOS.waitforLoad();
				Reporter.logWithScreenShot("get value"
						+ driver.findElementByXPath("//*[@type='XCUIElementTypeSwitch']").getAttribute("value"));
				driver.findElementByXPath("//*[@type='XCUIElementTypeSwitch']").click();
				Reporter.logWithScreenShot("Bluetooth on", MessageTypes.Pass);

			}
			break;

		default:
			break;
		}
	}

	public void startApplySensor() {
		HomePageIOS homepage = new HomePageIOS();
		homepage.getNFKiosHomepagePairSensorBtn().click();
		getNFKiosSignupPageSensorpageNextbtn().click();
		getNFKiosSignupPageSensorpageNextbtn().click();
	}

	public void createDatasetsAGP() {
		ApiMethods apiObj = new ApiMethods();
		int noOfData = 1440;
		int noofdays = 15;
		apiObj.addCGMforAGP("dnd24@mailinator.com", "test1234", noOfData, noofdays);
	}

	public static void unPairSensor() {
		try {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='Device Management']").click();
		} catch (Exception e) {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label='VPN & Device Management']").click();
		}
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='General']").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//XCUIElementTypeButton[@label='Settings']").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='Bluetooth']").click();
		try {
			LFSUtilsIOS.waitforLoad();
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label='MY DEVICES']").waitForPresent();
			if (LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label='MY DEVICES']").isPresent()) {
				LFSUtilsIOS.waitforLoad();
				List<WebElement> elements = LFSUtilsIOS.getQAFDriver()
						.findElementsByXPath("//*[starts-with(@label,'S')]//*[@label='More Info']");
				int elesize = elements.size();
				for (int i = 0; i < elesize; i++) {
					LFSUtilsIOS.getQAFDriver()
							.findElementByXPath("//*[starts-with(@label,'S')]//*[@label='More Info']").click();
					LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='FORGET_BUTTON']").click();
					LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='Forget Device']").click();
					Reporter.logWithScreenShot("User has removed the device", MessageTypes.Pass);
				}
			} else {
				Reporter.logWithScreenShot("No devices found", MessageTypes.Pass);
				LFSUtilsIOS.waitforLoad();
				LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
			}
		} catch (NoSuchElementException e) {
			Reporter.logWithScreenShot("No devices found", MessageTypes.Pass);
		}
		LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
	}

	public void skipsSensorPairing() {
		if (getNFKiosApplysensorTitle().isPresent()) {
			LFSUtilsIOS.click(getNFKiosApplysensorSkipBtn());
			Reporter.logWithScreenShot("The user skips the Sensor Pair screen", MessageTypes.Pass);
		}

	}

	public void tapCancelVerifyOptinCheckbox() {
		try {
		getNFKiosSignupPageOptionCancelBtn().click();
		getNFKiossignuppageoptincheckbox().verifyNotSelected();
		Reporter.logWithScreenShot("User successfully clicked on cancel and verified optin check box de-selected",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to click on cancel and verify optin checkbox", MessageTypes.Fail);
		 }
	}
	public void userselectoptin() {
		try {
		getNFKiossignuppageoptincheckbox().click();
		getNFKiossignuppageoptintitle().isDisplayed();
		Reporter.logWithScreenShot("User successfully clicked optin checkbox selected and user is on optin screen",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to click optin checkbox select", MessageTypes.Fail);
		 }
	}
	public void VerifySignupfirstscreenOptinCheckbox() {
		try {
		getNFKiossignuppageoptincheckbox().isSelected();
		Reporter.logWithScreenShot("User successfully verified optin checkbox selected ",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to verify optin checkbox select", MessageTypes.Fail);
		 }
	}
	public void checkOptincheckbox() {
		try {
		getNFKiossignuppageoptincheckbox().click();
		getNFKiossignuppageoptinIagreebtn().click();
		Reporter.logWithScreenShot("User successfully clicked optin checkbox and clicked on i agree option",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to click optin check box and i agree option", MessageTypes.Fail);
		 }
	}
	public void DeselectOptincheckbox() {
		try {
	    getNFKiossignuppageoptincheckbox().click();
	    getNFKiossignuppageoptincheckbox().verifyNotSelected();
		Reporter.logWithScreenShot("User successfully de-select optin checkbox",MessageTypes.Pass);
		 }catch(Exception e){
				Reporter.logWithScreenShot("Fail to de-select optin checkbox", MessageTypes.Fail);
		 }
	}
//	Method To Verify The Date
	public void userVerifyTheDate() {
		try {
		  LFSUtilsIOS.click(getNFKiosSignupPageDateOfBirthTBox());	
	      getNFKiosSignupPageBirthdayMonthPkr().verifyPresent("month");
	      getNFKiosSignupPageBirthdayDatePkr().verifyPresent("date");
	      getNFKiosSignupPageTimingPickerYearPkr().verifyPresent("year");
	      LFSUtilsIOS.click(getNFKiosSignupPageDobCancelBtn());
		  Reporter.logWithScreenShot("Verify date of birth", MessageTypes.Pass);
		} catch (Exception e) {
			
		  Reporter.logWithScreenShot("Fail to verify date", MessageTypes.Fail);
		}
		}
//	Method To Verifies Second Screen Option
	public void userVerifiesSecondScreenOptIn() {
		try {
		 LFSUtilsIOS.click(getNFKiosSignupPageGreenLinkBtn());
		 getNFKiosSignupPageGreenLinkTextBtn().verifyPresent();
		 getNFKiosSignupPageOptionCancelBtn().verifyPresent();
		 LFSUtilsIOS.click(getNFKiosSignupPageOptionCancelBtn());
		 LFSUtilsIOS.click(getNFKiosSignupPagePrivacyLnk());
		 LFSUtilsIOS.click(getNFKiosSignupPagePrivacyLnk());
		 Reporter.logWithScreenShot("Verify screen option", MessageTypes.Pass);
		} catch (Exception e) {
		 Reporter.logWithScreenShot("Fail to verify option", MessageTypes.Fail);

		}
		}
//	Method To Redirected To The Signup Screen
	public void userRedirectedToTheSignupScreen() {
		try {
		getNFKiosSignupPagePrivacyPolicyTxt().verifyPresent();
		getNFKiosSignupPageOptionCancelBtn().verifyPresent();
		LFSUtilsIOS.click(getNFKiosSignupPageOptionCancelBtn());
		getNFKiosSignupPageClinicCodeBtn().sendKeys(ConfigurationManager.getBundle().getString("clinic.code"));
		getNFKiosSignupPageClinicCodeTxt().verifyPresent();
		LFSUtilsIOS.click(getNFKiosSignupPageCheckBoxBtn());
		LFSUtilsIOS.click(getNFKiosSignupPageSendBtn());
		Reporter.logWithScreenShot("Signup screen", MessageTypes.Pass);
		} catch (Exception e) {
			
		Reporter.logWithScreenShot("Fail to Redirected to the signup screen", MessageTypes.Fail);

		}
	}
	//Method to verify safety onboarding screen 1
	public void verifySefetyOnboardingScreen1() {
		try {
		LFSUtilsIOS.click(getNFKiosSignuppageSignupBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).verifyPresent();
        getNFKiosSafetyonboardingNextBtn().verifyPresent();
        getNFKiosSafetyonboardingFirstscreenText1().verifyPresent();
        getNFKiosSafetyonboardingFirstscreenText2().verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen1", MessageTypes.Pass);
        } catch(Exception e) {
        	Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen1",MessageTypes.Fail);
             }
	    }	
	//Method to verify safety onboarding screen 2
	public void verifySefetyOnboardingScreen2() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingNextBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.second")).verifyPresent();
		getNFKiosSafetyonboardingTrustHowYouFeelCheckbox().verifyPresent();
        getNFKiosSafetyonboardingSecondscreenText().verifyPresent();
		Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen2", MessageTypes.Pass);
		} catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen2",MessageTypes.Fail);
		}
	}
	//Method to verify safety onboarding screen 3
	public void verifySefetyOnboardingScreen3() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingTrustHowYouFeelCheckbox());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.third")).verifyPresent();
		getNFKiosSafetyonboardingAreaOfCautionImage().verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingAreasOfCautionCheckbox().verifyPresent();
		getNFKiosSafetyonboardingThirdscreenText1().verifyPresent();
		getNFKiosSafetyonboardingThirdscreenText2().verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen3", MessageTypes.Pass);
		} catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen3",MessageTypes.Fail);
		}
	}
	//Method to verify safety onboarding screen 4
	public void verifySefetyOnboardingScreen4() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingAreasOfCautionCheckbox());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.fourth")).verifyPresent();
		getNFKiosSafetyonboardingSupportedUOMImage().verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingNextBtn().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.fourth")).verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen4", MessageTypes.Pass);
        } catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen4",MessageTypes.Fail);
        }
	}
	//Method to verify safety onboarding screen 5
	public void verifySefetyOnboardingScreen5() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingNextBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.fifth")).verifyPresent();
        getNFKiosSafetyonboardingBackBtn().verifyPresent();
        getNFKiosSafetyonboardingCurrentReadingImage().verifyPresent();
        getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.fifth.text1")).verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen5", MessageTypes.Pass);
        } catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen5",MessageTypes.Fail);
        }
	}
	//Method to verify safety onboarding screen 6
	public void verifySefetyOnboardingScreen6() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingTreatmentDecisionsCheckbox());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.sixth")).verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingNextBtn().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.sixth.text1")).verifyPresent();
        getNFKiosSafetyonboardingTrendArrowRisingQuicklyImage().verifyPresent();
		getNFKiosSafetyonboardingTrendArrowRisingImage().verifyPresent();
		getNFKiosSafetyonboardingTrendArrowRisingSlowlyImage().verifyPresent();
		getNFKiosSafetyonboardingTrendArrowSteadyImage().verifyPresent();
		getNFKiosSafetyonboardingTrendArrowFallingSlowlyImage().verifyPresent();
		getNFKiosSafetyonboardingTrendArrowFallingImage().verifyPresent();
		getNFKiosSafetyonboardingTrendArrowFallingQuicklyImage().verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen6", MessageTypes.Pass);
        }catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen6",MessageTypes.Fail);
        }
	}
	//Method to verify safety onboarding screen 7
	public void verifySefetyOnboardingScreen7() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingNextBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSafetyonboardingSeventhScreenTitle().verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingNextBtn().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.seventh.text1")).verifyPresent();
        getNFKiosSafetyonboardingHighReadingImage().verifyPresent();
		getNFKiosSafetyonboardingInRangeReadingImage().verifyPresent();
		getNFKiosSafetyonboardingLowReadingImage().verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen7", MessageTypes.Pass);
        }catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen7",MessageTypes.Fail);
        }
	}
	//Method to verify safety onboarding screen 8
	public void verifySefetyOnboardingScreen8() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingNextBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.eighth")).verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingAlertNotificationsPageViewCheckbox().verifyPresent();
        getNFKiosSafetyonboardingLowimageviewImage().verifyPresent();
        getNFKiosSafetyonboardingHighimageviewImage().verifyPresent();
        getNFKiosSafetyonboardingEightscreenText1().verifyPresent();
        getNFKiosSafetyonboardingEightscreenText2().verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen8", MessageTypes.Pass);
        }catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen8",MessageTypes.Fail);
        }
	}
	//Method to verify Notification popUp After Safety onboarding screen 8
	public void verifiyNotificationPopup() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingAlertNotificationsPageViewCheckbox());
		getNFKiosSafetyonboardingPopupText1().isPresent();
		getNFKiosSafetyonboardingPopupText2().verifyPresent();
		getNFKiosSafetyonboardingPopupAllowBtn().verifyPresent();
		getNFKiosSafetyonboardingPopupDontAllowBtn().verifyPresent();
		Reporter.logWithScreenShot("Successfully verified NotificationPopup",MessageTypes.Pass);
        } catch (Exception e) {
    		Reporter.logWithScreenShot("Failed to verify NotificationPopup",MessageTypes.Fail);
        }
	}
	//Method to verify alert notification popUp screen
	public void verifiyAlertNotificationPopupScreen() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingPopupDontAllowBtn());
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.alertnotification.title")).verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.alertnotification.text1")).verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.alertnotification.text2")).verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.alertnotification.text3")).verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.alertnotification.text4")).verifyPresent();
		getNFKiosSafetyonboardingAlertNotificationScreenText2().verifyPresent();
		Reporter.logWithScreenShot("Successfully verified AlertNotificationPopupScreen",MessageTypes.Pass);
        } catch (Exception e) {
    		Reporter.logWithScreenShot("Failed to verify AlertNotificationPopupScreen",MessageTypes.Fail);
        }
	}
	//Method to verify safety onboarding screen 9
	public void verifySefetyOnboardingScreen9() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingOkBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.ninth")).verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingNextBtn().verifyPresent();
		getNFKiosSafetyonboardingSmartphoneImage().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.ninth.text1")).verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen9", MessageTypes.Pass);
        }catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen9",MessageTypes.Fail);
        }
	}
	//Method to verify safety onboarding screen 10
	public void verifySefetyOnboardingScreen10() {
		try {
		LFSUtilsIOS.click(getNFKiosSafetyonboardingNextBtn());
		getNFKiosSignupPageOneTouchLogo().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.tenth")).verifyPresent();
		getNFKiosSafetyonboardingBackBtn().verifyPresent();
		getNFKiosSafetyonboardingNextBtn().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.tenth.text1")).verifyPresent();
		getNFKiosSafetyonboardingUrgentLowGlucoseAlertImage().verifyPresent();
		getNFKiosSafetyonboardingUrgentLowGlucoseAlarmImage().verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.tenth.text2")).verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.tenth.text3")).verifyPresent();
		getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.tenth.text4")).verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired SefetyOnboardingScreen10", MessageTypes.Pass);
        } catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifySefetyOnboardingScreen10",MessageTypes.Fail);
        }
	}
	//Method to verify apply sensro screen
	public void verifyApplySensorScreen() {
		try {
		SensorPairPageIOS sensorPair = new SensorPairPageIOS();
		LFSUtilsIOS.click(getNFKiosSafetyonboardingNextBtn());
		LFSUtilsIOS.click(getNFKiosSafetyonboardingPopupAllowBtn());
		sensorPair.getNFKiosApplysensorTitle().verifyPresent();
        Reporter.logWithScreenShot("Successfully verifired Apply Sensor Screen", MessageTypes.Pass);
        } catch(Exception e) {
			Reporter.logWithScreenShot("Failed to verifyApplySensorScreen",MessageTypes.Fail);
        }
	}
	//Method to verify home screen
	 public void verifyHomeScreen() {
	    	try {
	    	SensorPairPageIOS sensorPair = new SensorPairPageIOS();
			LFSUtilsIOS.click(getNFKiosSafetyonboardingApplysensorSkipBtn());			
	    	sensorPair.getNFKiosHomescreenPairsensorBtn().verifyPresent();
	        Reporter.logWithScreenShot("Successfully verifired Home Screen", MessageTypes.Pass);
	        } catch(Exception e) {
				Reporter.logWithScreenShot("Failed to verifyHomeScreen",MessageTypes.Fail);
	        }
	    }
//		Method To Verify Apply Sensor Home Screen
	public void userVerifyApplySensorHomeScreen() {
		getNFKiosSignupPageApplySensorBtn().verifyPresent();
		LFSUtilsIOS.click(getNFKiosSignupPageApplySensorBtn());
	}
//		Method To How To Apply Sensor Screen
	public void userHowToApplyTheSensorScreen() {
		try {
			getNFKiosSignupPageSensorWearBtn().verifyPresent();
			getNFKiosSignupPageHelpfulTipsBtn().verifyPresent();
			getNFKiosSignupPageBackUpperArmBtn().verifyPresent();
			getNFKiosSignupPageWashAndDryHandBtn().verifyPresent();
			getNFKiosSignupPageRemovePaperBackingBtn().verifyPresent();
			LFSUtilsIOS.scrollDown();
			getNFKiosSignupPageRemoveApplicatorBtn().verifyPresent();
			getNFKiosSignupPageAdhesivePatchBtn().verifyPresent();
			getNFKiosSafetyOnBoardingBackBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSafetyOnBoardingBackBtn());
			Reporter.logWithScreenShot("How to apply sensor screen", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to apply sensor screen", MessageTypes.Fail);
		}
	}
//		Method To Verify Left And Right Abdomen
	public void userVerifyLeftAndRightAbdomen() {
		try {
			LFSUtilsIOS.click(getNFKiosSignupPageRightAbdomenButtonBtn());
			getNFKiosSignupPageRightAbdomenButtonBtn().verifyEnabled();
			LFSUtilsIOS.click(getNFKiosSignupPageRightAbdomenButtonBtn());
			getNFKiosSignupPageRightAbdomenButtonBtn().verifyNotSelected();
			LFSUtilsIOS.click(getNFKiosSignupPageLeftAbdomenButtonBtn());
			getNFKiosSignupPageLeftAbdomenButtonBtn().verifyEnabled();
			Reporter.logWithScreenShot("Right and left abdomen ", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Verify Right and Left Abdomen", MessageTypes.Fail);
		}
	}
//		Method To Verify Left And Right Abdomen Upper Arm
	public void userVerifyRightAndLeftUpperArm() {
		try {
			LFSUtilsIOS.click(getNFKiosSignupPageLeftArmButtonBtn());
			getNFKiosSignupPageLeftAbdomenButtonBtn().verifyNotSelected();
			getNFKiosSignupPageLeftArmButtonBtn().verifyEnabled();
			LFSUtilsIOS.click(getNFKiosSignupPageRightArmButtonBtn());
			getNFKiosSignupPageLeftArmButtonBtn().verifyNotSelected();
			getNFKiosSignupPageRightArmButtonBtn().verifyEnabled();
			LFSUtilsIOS.click(getNFKiosSafteyboardingBackBtn());
			getNFKiosSignupPageSafetyOnBoardingLastScreenBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSignuppagesafetydonebtn());
			Reporter.logWithScreenShot("Right and left arm", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Verify Right and Left Arm", MessageTypes.Fail);

		}
	}
//		Method To Verify The Start Pairing Sensor Screen
	public void userVerifyTheStartPairingSensorScreen() {
		try {
			LFSUtilsIOS.click(getNFKiosSignupPageRightArmButtonBtn());
			LFSUtilsIOS.click(getNFKiosSignupPageNextBtn());
			getNFKiosSignupPageStartPairSensorBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSafteyboardingBackBtn());
			getNFKiosSignupPageRightArmButtonBtn().verifyNotSelected();
			LFSUtilsIOS.click(getNFKiosSignupPageNextBtn());
			getNFKiosSignupPageStartPairSensorBtn().verifyPresent();
			getNFKiosSignupPagePairSensorBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSafteyboardingBackBtn());
			getNFKiosSignupPageLeftAbdomenButtonBtn().verifyPresent();
			Reporter.logWithScreenShot("Start pairing sensor screen", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to Verify Right and Left Arm", MessageTypes.Fail);

		}
	}

//		Shubham
//		Method To Verify User See Helpful Tips Screen
	public void userSeeHelpfulTipsScreen() {
		try {
			LFSUtilsIOS.click(getNFKiosSignupPageSensorWearTextBtn());
			LFSUtilsIOS.click(getNFKiosSignupPageHelpfulTipsBtn());
			getNFKiosSignupPageHelpfulTipsTextBtn().verifyPresent();
			getNFKiosSignupPageHelpfulTipsCrossBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSignupPageHelpfulTipsCrossBtn());
			getNFKiosSignupPageHelpfulTipsBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSignupPagePairSensorBtn());
			getNFKiosSignupPagePairSensorCancelBtn().verifyPresent();
			LFSUtilsIOS.click(getNFKiosSignupPagePairSensorCancelBtn());
			LFSUtilsIOS.click(getNFKiosSafteyboardingBackBtn());
			LFSUtilsIOS.click(getNFKiosSignupPageRightArmButtonBtn());
			Reporter.logWithScreenShot("See helpful tips screen", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Failed to see helpful tips screen", MessageTypes.Fail);

		}
	}

//		Method To Verify Skip Button And Verify Home Screen
	public void SkipButtonAndVerifyHomeScreen() {		
			LFSUtilsIOS.click(getNFKiosApplysensorSkipBtn());		
	}
//	Shubham
//	Method To Apply Sensor Screen
	public void userApplySensorscreen() {
		try {
			getNFKiosApplysensorSkipBtn().verifyPresent();
			getNFKiosApplySensorTitle().verifyPresent();
			getNFKiosSignuppageApproveLocationTxt().verifyPresent();
			getNFKiosSignupPageRightAbdomenButtonBtn().verifyPresent();
			getNFKiosSignupPageLeftAbdomenButtonBtn().verifyPresent();
			getNFKiosSignupPageLeftArmButtonBtn().verifyPresent();
			getNFKiosSignupPageRightArmLnk().verifyPresent();
			getNFKiosSignupPageApplyLinkBtn().verifyPresent();
			getNFKiosSignupPageCleanDisinfectTxt().verifyPresent();
			getNFKiosSignupPageNextBtn().verifyPresent();
			getNFKiosSafetyOnBoardingBackBtn().verifyPresent();
			Reporter.logWithScreenShot("Apply sensor screen", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify sensor screen", MessageTypes.Fail);

		}
	}

//	Shubham
//	Method Back To Apply Sensor Screen
	public void backToApplySensorScreen() {
		try {
			LFSUtilsIOS.click(getNFKiosSignupPageNextBtn());
			LFSUtilsIOS.click(getNFKiosSignupPageNextBtn());
			LFSUtilsIOS.click(getNFKiosSignupPageCancelBtn());
			LFSUtilsIOS.click(getNFKiosSafetyOnBoardingBackBtn());
			Reporter.logWithScreenShot("Back to apply sensor screen", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to back to apply sensor screen", MessageTypes.Fail);

		}
	}

	public void verifyInformativeText() {
		try {
//			getNFKiosApplysensorTitle().verifyPresent(LFSUtilsIOS.getPropString("help.sensor.apply.title"));
			getNFKiosSignupPageDoneBtn().verifyPresent(LFSUtilsIOS.getPropString("appCommon.done"));
			getNFKiosSignupPageHealthcareInstructionsBtn()
					.verifyPresent(LFSUtilsIOS.getPropString("safetyOnboarding.applySensor.descriptionLabel"));
			LFSUtilsIOS.click(getNFKiosSignupPageDoneBtn());
			Reporter.logWithScreenShot("Verify information text", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify information text", MessageTypes.Fail);

		}
	}

	public void clicksOnPairSensorButtonAndUserVerifyInformativeText() {
		try {
			LFSUtilsIOS.click(getNFKiosSignuppagePairSensorBtn());
			getNFKiosSignuppageApplySensorTxt().verifyPresent(LFSUtilsIOS.getPropString("help.sensor.apply.title"));
			getNFKiosSignupPageHealthcareInstructionsBtn()
					.verifyPresent(LFSUtilsIOS.getPropString("safetyOnboarding.applySensor.descriptionLabel"));
			getNFKiosSignupPageHelpfulTipsBtn()
					.verifyPresent(LFSUtilsIOS.getPropString("safetyOnboarding.applySensor.seeHelpfulTips.lnk"));
			getNFKiosSignuppageFooterLabelTxt()
					.verifyPresent(LFSUtilsIOS.getPropString("safetyOnboarding.applySensor.footerLabel.txt"));
			getNFKiosSignupPagePairSensorCancelBtn().verifyPresent(LFSUtilsIOS.getPropString("appCommon.cancel"));
			getNFKiosSignupPageNextBtn().verifyPresent(LFSUtilsIOS.getPropString("appCommon.next"));
			Reporter.logWithScreenShot("Verify clicks on pair sensor button and verify information text",
					MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify clicks on pair sensor button and verify information text",
					MessageTypes.Fail);

		}
	}

	public void verifySensorApplicationScreenInHelpMenu() {
		try {
			LFSUtilsIOS.click(getNFKiosSignuppageSensorApplicationTxt());
			LFSUtilsIOS.click(getNFKiosSafetyOnBoardingSensorApplicationHowToApplyLnk());
			getNFKiosSignuppageApplySensorTxt().verifyPresent(LFSUtilsIOS.getPropString("help.sensor.apply.title"));
			getNFKiosSignupPageHealthcareInstructionsBtn()
					.verifyPresent(LFSUtilsIOS.getPropString("safetyOnboarding.applySensor.descriptionLabel"));
			Reporter.logWithScreenShot("Verify sensor application in help menu", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify sensor application in help menu", MessageTypes.Fail);

		}
	}

	public void verifyUnpairTheSensor() {
		try {
			LFSUtilsIOS.clickWithText("Unpair Sensor");
			LFSUtilsIOS.clickWithText("Unpair Sensor");
			Reporter.logWithScreenShot("Verify sensor pair the sensor", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify sensor pair the sensor", MessageTypes.Fail);

		}

	}

	public void verifyTapsOnPairSensorButton() {
		LFSUtilsIOS.click(getNFKiosSignuppagePairSensorBtn());

	}
	public void navigateToSettingSceenFromTrustScreen() {   	 
		LFSUtilsIOS.launchSettings();
		if (getNFKiosSettingDeviceManagementBtn().isDisplayed()) {
			LFSUtilsIOS.click(getNFKiosSettingDeviceManagementBtn());
		}else if (getNFKiosSettingvpnDeviceManagementBtn().isDisplayed()) {
			LFSUtilsIOS.click(getNFKiosSettingvpnDeviceManagementBtn());
		}else if (getNFKiosNFKiosSettingGeneralBtn().isDisplayed()) {
			LFSUtilsIOS.click(getNFKiosNFKiosSettingGeneralBtn());
		}else if (getNFKiossettingsMainScreenButtonBtn().isDisplayed()) {
			LFSUtilsIOS.click(getNFKiossettingsMainScreenButtonBtn());
		}
	}
		public void verifyStopSensorPairing() {
		try {
			LFSUtilsIOS.click(getNFKiossafetyOnBoardingStopSensorBtn());
			LFSUtilsIOS.click(getNFKiossafetyOnBoardingStopSensorBtn());
			LFSUtilsIOS.click(getNFKiossafetyOnBoardingStopSensorBtn());
			Reporter.logWithScreenShot("Verify stop sensor pairing", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify stop sensor pairing", MessageTypes.Fail);

		}
	}

	public void verifypairSensorTheApplication() {
		try {
			LFSUtilsIOS.click(getNFKiosSignupPageNextBtn());
			LFSUtilsIOS.click(getNFKiosSignupPageNextBtn());
			LFSUtilsIOS.click(getNFKiosSignuppageDependentContinue());
			Reporter.logWithScreenShot("Verify pair sensor the application", MessageTypes.Pass);
		} catch (Exception e) {

			Reporter.logWithScreenShot("Failed to verify pair sensor the application", MessageTypes.Fail);

		}

	}
	public void verifyUserTapsOnSkipButton() {
		LFSUtilsIOS.click(getNFKiosSafetyOnBoarding2to5YearsPageSkipBtn());
	}

	public void verifyUserClicksOnTheCancelButton() {
		LFSUtilsIOS.click(getNFKiosSignupPageCancelBtn());
	}
	
	// Method to fill sign up details
	public void fillAdultDetailsForSignUp(String signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {
			userBean.fillFromConfig(signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		LoginPageIOS loginPage = new LoginPageIOS();
		try {
		ConfigurationManager.getBundle().setProperty("register.email", loginPage.email);
		LFSUtilsIOS.enterText(getNFKiosSignuppageEmailadressTbox(), loginPage.email);
		LFSUtilsIOS.enterText(getNFKiosSignuppageConfirmemailadressTbox(), loginPage.email);
		ConfigurationManager.getBundle().setProperty("register.password", userBean.getPassword());
		LFSUtilsIOS.enterText(getNFKiosSignuppagePasswordTbox(), userBean.getPassword());
		LFSUtilsIOS.enterText(getNFKiosSignuppageConfirmPasswordTxt(), userBean.getPassword());
		LFSUtilsIOS.click(getNFKiosSignupPageDateOfBirthTBox());
		setDateOfBirth(userBean);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		LFSUtilsIOS.click(getNFKiosSignuppageCountrytermsCbox());
		} catch(Exception e){
			e.printStackTrace();
			Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
		}
	}
	
	public void fillDependentDetailsForSignUp(String userDetails) {
		LoginPageIOS loginPage = new LoginPageIOS();
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKiosSignuppageDependentGuardianFname().click();
		getNFKiosSignuppageDependentGuardianFname()
				.sendKeys(userBean.getGuardianfname() + RandomStringUtils.randomAlphabetic(4));
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentGuardianLname().assertPresent("Guardian Last name field");
		getNFKiosSignuppageDependentGuardianLname()
				.sendKeys(userBean.getGuardianlname() + RandomStringUtils.randomAlphabetic(4));
		iosDriver.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKiosSignuppageDependentEmail().assertPresent("Email field of Dependent");
		getNFKiosSignuppageDependentEmail().click();
		getNFKiosSignuppageDependentEmail().sendKeys(loginPage.email);
		Reporter.logWithScreenShot("Entered the email", MessageTypes.Pass);

		iosDriver.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentConfirmEmail().click();
		getNFKiosSignuppageDependentConfirmEmail().assertPresent("Confirm Email field of Dependent");
		getNFKiosSignuppageDependentConfirmEmail().click();
		getNFKiosSignuppageDependentConfirmEmail().sendKeys(loginPage.email);

		getNFKiosSignuppageDependentGuardianaccountText().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 10, 10);
		getNFKiosSignuppageDependentPassword().click();
		getNFKiosSignuppageDependentPassword().assertPresent("Password field on Guardian screen");
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentPassword().sendKeys("Testing@1234");
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm password field");
		getNFKiosSignuppageDependentConfirmPassword().sendKeys("Testing@1234");
		iosDriver.hideKeyboard();
		getNFKiosSignuppageDependentTermsCheckbox().assertPresent("Terms and condition check box");
		getNFKiosSignuppageDependentTermsCheckbox().click();
		getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing check box");
		Reporter.logWithScreenShot("User has entered the Guardian details", MessageTypes.Pass);

	}

}


