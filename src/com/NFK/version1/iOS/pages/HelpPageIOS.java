package com.NFK.version1.iOS.pages;

import java.util.List;
import java.util.Locale;

import org.testng.Assert;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class HelpPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.helpPage.search.box")
	private QAFWebElement NFKiosHelppageSearchBox;
	@FindBy(locator = "NFKios.helpPage.back.btn")
	private QAFWebElement NFKiosHelppageBackBtn;
	@FindBy(locator = "NFKios.helpPage.back.btn")
	private List<QAFWebElement> NFKiosHelppageBackBtns;

	@FindBy(locator = "NFKios.helpPage.title.lbl")
	private QAFWebElement NFKiosHelppageTitleLbl;

	@FindBy(locator = "NFKios.helpPage.appoverview.btn")
	private QAFWebElement NFKiosHelppageAppoverviewBtn;
	@FindBy(locator = "NFKios.helpPage.Navigation.btn")
	private QAFWebElement NFKiosHelppageNavigationBtn;
	@FindBy(locator = "NFKios.helpPage.logbook.btn")
	private QAFWebElement NFKiosHelppageLogbookBtn;
	@FindBy(locator = "NFKios.helpPage.patterns.btn")
	private QAFWebElement NFKiosHelppagePatternsBtn;
	@FindBy(locator = "NFKios.helpPage.average.btn")
	private QAFWebElement NFKiosHelppageAverageBtn;
	@FindBy(locator = "NFKios.helpPage.aboutme.btn")
	private QAFWebElement NFKiosHelppageAboutmeBtn;
	@FindBy(locator = "NFKios.helpPage.mymeter.btn")
	private QAFWebElement NFKiosHelppageMymeterBtn;
	@FindBy(locator = "NFKios.helpPage.moremenu.btn")
	private QAFWebElement NFKiosHelppageMoreMenuBtn;
	@FindBy(locator = "NFKios.helpPage.goals.btn")
	private QAFWebElement NFKiosHelppageGoalsBtn;
	@FindBy(locator = "NFKios.helpPage.mentor.btn")
	private QAFWebElement NFKiosHelppageMentorBtn;
	@FindBy(locator = "NFKios.helpPage.tutorial.btn")
	private QAFWebElement NFKiosHelppageTutorialBtn;
	@FindBy(locator = "NFKios.helpPage.contactus.btn")
	private QAFWebElement NFKiosHelppageContactusBtn;
	@FindBy(locator = "NFKios.helpPage.termsofuse.btn")
	private QAFWebElement NFKiosHelppageTermsofuseBtn;
	@FindBy(locator = "NFKios.helpPage.troubleshoot.btn")
	private QAFWebElement NFKiosHelppageTroubleshootBtn;
	@FindBy(locator = "NFKios.helpPage.hcp.btn")
	private QAFWebElement NFKiosHelppageHcpBtn;
	@FindBy(locator = "NFKios.helpPage.about.btn")
	private QAFWebElement NFKiosHelppageAboutBtn;
	// SG 2/14 Updates
	@FindBy(locator = "NFKios.helpPage.Introduction.NFKMobileApp.btn")
	private QAFWebElement NFKiosHelppageIntroductionNFKMobileAppBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.NFKMobileApp.txt")
	private QAFWebElement NFKiosHelppageIntroductionNFKMobileAppTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.body.txt")
	private QAFWebElement NFKiosHelppageIntroductionBodyTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.backButton.txt")
	private QAFWebElement NFKiosHelppageIntroductionBackButtonTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.supportedDevices.btn")
	private QAFWebElement NFKiosHelppageIntroductionSupportedDevicesBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.supportedDevices.txt")
	private QAFWebElement NFKiosHelppageIntroductionSupportedDevicesTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.appleLegalNotice.btn")
	private QAFWebElement NFKiosHelppageIntroductionAppleLegalNoticeBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.appleLegalNotice.txt")
	private QAFWebElement NFKiosHelppageIntroductionAppleLegalNoticeTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.appleLegalNotice.body.txt")
	private QAFWebElement NFKiosHelppageIntroductionAppleLegalNoticeBodyTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.androidLegal.Notice.btn")
	private QAFWebElement NFKiosHelppageIntroductionAndroidLegalNoticeBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.googleLegal.Notice.btn")
	private QAFWebElement NFKiosHelppageIntroductionGoogleLegalNoticeBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.bluetooth.trademark.btn")
	private QAFWebElement NFKiosHelppageIntroductionBluetoothTrademarkBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.intendedUse.btn")
	private QAFWebElement NFKiosHelppageIntroductionIntendedUseBtn;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.gettingstarted.btn")
	private QAFWebElement NFKiosHelppageGettingstartedGettingStartedBtn;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.createaccount.btn")
	private QAFWebElement NFKiosHelppageGettingstartedCreateAccountBtn;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.pairing.btn")
	private QAFWebElement NFKiosHelppageGettingstartedPairingBtn;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.pairingFlexMeter.btn")
	private QAFWebElement NFKiosHelppageGettingstartedPairingFlexMeterBtn;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.unpairing.btn")
	private QAFWebElement NFKiosHelppageGettingstartedUnpairingBtn;

	@FindBy(locator = "NFKios.helpPage.Introduction.androidLegal.Noice.txt")
	private QAFWebElement NFKiosHelppageIntroductionAndroidLegalNoticeTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.googleLegal.Noice.txt")
	private QAFWebElement NFKiosHelppageIntroductionGoogleLegalNoticeTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.BluetoothTrademark.txt")
	private QAFWebElement NFKiosHelppageIntroductionBluetoothTrademarkTxt;

	@FindBy(locator = "NFKios.helpPage.Introduction.IntendedUse.txt")
	private QAFWebElement NFKiosHelppageIntroductionIntendedUseTxt;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.gettingstarted.txt")
	private QAFWebElement NFKiosHelppageGettingStartedGettingStartedTxt;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.createaccount.txt")
	private QAFWebElement NFKiosHelppageGettingStartedCreateAccountTxt;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.pairing.txt")
	private QAFWebElement NFKiosHelppageGettingStartedPairingTxt;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.pairingFlexMeter.txt")
	private QAFWebElement NFKiosHelppageGettingStartedPairingFlexMeterTxt;

	@FindBy(locator = "NFKios.helpPage.gettingstarted.unpairing.txt")
	private QAFWebElement NFKiosHelppageGettingStartedUnpairingTxt;

	// Help page NFK
	@FindBy(locator = "NFKios.moremenu.helppage.options")
	private List<QAFWebElement> NFKiosMoremenuHelppageOptions;
	@FindBy(locator = "NFKios.moremenu.helppage.done.btn")
	private QAFWebElement NFKiosMoremenuHelppageDoneBtn;
	@FindBy(locator = "NFKios.moremenu.helppage.removesensor.done.btn")
	private QAFWebElement NFKiosMoremenHelppageRemovesensorDoneBtn;
	@FindBy(locator = "NFKios.helpPage.Introduction.btn")
	private QAFWebElement NFKiosHelppageIntroductionBtn;
	@FindBy(locator = "NFKios.helpPage.gettingstarted.btn")
	private QAFWebElement NFKiosHelppageGettingstartedBtn;
	@FindBy(locator = "NFKios.helpPage.account.btn")
	private QAFWebElement NFKiosHelpPageAccountBtn;
	@FindBy(locator = "NFKios.helpPage.homescreen.btn")
	private QAFWebElement NFKiosHelpPageHomescreenBtn;
	@FindBy(locator = "NFKios.helpPage.Introduction.btn")
	private QAFWebElement NFKiosHelpPageIntroductionBtn;
	@FindBy(locator = "NFKios.helpPage.license.back.btn")
	private QAFWebElement NFKiosHelpPageLicenseBackBtn;
	@FindBy(locator = "NFKios.helppage.backButton")
	private QAFWebElement NFKiosHelppageBackButton;

	@FindBy(locator = "NFKios.helppage.about.backButton")
	private QAFWebElement NFKiosHelppageAboutBackButton;

	public QAFWebElement getNFKiosHelppageAboutBackButton() {
		return NFKiosHelppageAboutBackButton;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosHelppageBackButton() {
		return NFKiosHelppageBackButton;
	}

	public QAFWebElement getNFKiosHelpPageLicenseBackBtn() {
		return NFKiosHelpPageLicenseBackBtn;
	}

	public List<QAFWebElement> getNFKiosMoremenuHelppageOptions() {
		return NFKiosMoremenuHelppageOptions;
	}

	public QAFWebElement getNFKiosMoremenuHelppageDoneBtn() {
		return NFKiosMoremenuHelppageDoneBtn;
	}

	public QAFWebElement getNFKiosHelpPageIntroductionBtn() {
		return NFKiosHelpPageIntroductionBtn;
	}

	public QAFWebElement getNFKiosMoremenHelppageRemovesensorDoneBtn() {
		return NFKiosMoremenHelppageRemovesensorDoneBtn;
	}

	public QAFWebElement getNFKiosHelppageSearchBox() {
		return NFKiosHelppageSearchBox;
	}

	public List<QAFWebElement> getNFKiosHelppageBackBtns() {
		return NFKiosHelppageBackBtns;
	}

	public QAFWebElement getNFKiosHelppageBackBtn() {
		return NFKiosHelppageBackBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionBtn() {
		return NFKiosHelppageIntroductionBtn;
	}

	public QAFWebElement getNFKiosHelppageTitleLbl() {
		return NFKiosHelppageTitleLbl;
	}

	public QAFWebElement getNFKiosHelppageGettingstartedBtn() {
		return NFKiosHelppageGettingstartedBtn;
	}

	public QAFWebElement getNFKiosHelppageAppoverviewBtn() {
		return NFKiosHelppageAppoverviewBtn;
	}

	public QAFWebElement getNFKiosHelppagenNavigationBtn() {
		return NFKiosHelppageNavigationBtn;
	}

	public QAFWebElement getNFKiosHelppageLogbookBtn() {
		return NFKiosHelppageLogbookBtn;
	}

	public QAFWebElement getNFKiosHelppagePatternsBtn() {
		return NFKiosHelppagePatternsBtn;
	}

	public QAFWebElement getNFKiosHelppageAverageBtn() {
		return NFKiosHelppageAverageBtn;
	}

	public QAFWebElement getNFKiosHelppageAboutmeBtn() {
		return NFKiosHelppageAboutmeBtn;
	}

	public QAFWebElement getNFKiosHelppageMymeterBtn() {
		return NFKiosHelppageMymeterBtn;
	}

	public QAFWebElement getNFKiosHelppageMoreMenuBtn() {
		return NFKiosHelppageMoreMenuBtn;

	}

	public QAFWebElement getNFKiosHelppageGoalsBtn() {
		return NFKiosHelppageGoalsBtn;
	}

	public QAFWebElement getNFKiosHelppageMentorBtn() {
		return NFKiosHelppageMentorBtn;
	}

	public QAFWebElement getNFKiosHelppageTutorialBtn() {
		return NFKiosHelppageTutorialBtn;
	}

	public QAFWebElement getNFKiosHelppageContactusBtn() {
		return NFKiosHelppageContactusBtn;
	}

	public QAFWebElement getNFKiosHelppageTermsofuseBtn() {
		return NFKiosHelppageTermsofuseBtn;
	}

	public QAFWebElement getNFKiosHelppageTroubleshootBtn() {
		return NFKiosHelppageTroubleshootBtn;
	}

	public QAFWebElement getNFKiosHelppageHcpBtn() {
		return NFKiosHelppageHcpBtn;
	}

	public QAFWebElement getNFKiosHelppageAboutBtn() {
		return NFKiosHelppageAboutBtn;
	}

	// 2/14 SG updates
	public QAFWebElement getNFKiosHelppageIntroductionNFKMobileAppBtn() {
		return NFKiosHelppageIntroductionNFKMobileAppBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionNFKMobileAppTxt() {
		return NFKiosHelppageIntroductionNFKMobileAppTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionBodyTxt() {
		return NFKiosHelppageIntroductionBodyTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionBackButtonTxt() {
		return NFKiosHelppageIntroductionBackButtonTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionSupportedDevicesBtn() {
		return NFKiosHelppageIntroductionSupportedDevicesBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionSupportedDevicesTxt() {
		return NFKiosHelppageIntroductionSupportedDevicesTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionAppleLegalNoticeBtn() {
		return NFKiosHelppageIntroductionAppleLegalNoticeBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionAppleLegalNoticeTxt() {
		return NFKiosHelppageIntroductionAppleLegalNoticeTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionAppleLegalNoticeBodyTxt() {
		return NFKiosHelppageIntroductionAppleLegalNoticeBodyTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionAndroidLegalNoticeBtn() {
		return NFKiosHelppageIntroductionAndroidLegalNoticeBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionGoogleLegalNoticeBtn() {
		return NFKiosHelppageIntroductionGoogleLegalNoticeBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionBluetoothTrademarkBtn() {
		return NFKiosHelppageIntroductionBluetoothTrademarkBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionIntendedUseBtn() {
		return NFKiosHelppageIntroductionIntendedUseBtn;
	}

	public QAFWebElement getNFKiosHelppageGettingstartedGettingStartedBtn() {
		return NFKiosHelppageGettingstartedGettingStartedBtn;
	}

	public QAFWebElement getNFKiosHelppageGettingstartedCreateAccountBtn() {
		return NFKiosHelppageGettingstartedCreateAccountBtn;
	}

	public QAFWebElement getNFKiosHelppageGettingstartedPairingBtn() {
		return NFKiosHelppageGettingstartedPairingBtn;
	}

	public QAFWebElement getNFKiosHelppageGettingstartedPairingFlexMeterBtn() {
		return NFKiosHelppageGettingstartedPairingFlexMeterBtn;
	}

	public QAFWebElement getNFKiosHelppageGettingstartedUnpairingBtn() {
		return NFKiosHelppageGettingstartedUnpairingBtn;
	}

	public QAFWebElement getNFKiosHelppageIntroductionAndroidLegalNoticeTxt() {
		return NFKiosHelppageIntroductionAndroidLegalNoticeTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionGoogleLegalNoticeTxt() {
		return NFKiosHelppageIntroductionGoogleLegalNoticeTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionBluetoothTrademarkTxt() {
		return NFKiosHelppageIntroductionBluetoothTrademarkTxt;
	}

	public QAFWebElement getNFKiosHelppageIntroductionIntendedUseTxt() {
		return NFKiosHelppageIntroductionIntendedUseTxt;
	}

	public QAFWebElement getNFKiosHelppageGettingStartedGettingStartedTxt() {
		return NFKiosHelppageGettingStartedGettingStartedTxt;
	}

	public QAFWebElement getNFKiosHelppageGettingStartedCreateAccountTxt() {
		return NFKiosHelppageGettingStartedCreateAccountTxt;
	}

	public QAFWebElement getNFKiosHelppageGettingStartedPairingTxt() {
		return NFKiosHelppageGettingStartedPairingTxt;
	}

	public QAFWebElement getNFKiosHelppageGettingStartedPairingFlexMeterTxt() {
		return NFKiosHelppageGettingStartedPairingFlexMeterTxt;
	}

	public QAFWebElement getNFKiosHelppageGettingStartedUnpairingTxt() {
		return NFKiosHelppageGettingStartedUnpairingTxt;
	}

	public QAFWebElement getNFKiosHelpPageStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.helpPage.static.txt", text);
	}

	// Method to click on visible back button
	public void clickOnBackButton() {
		getNFKiosHelppageBackBtns().get(0).waitForPresent();
		for (QAFWebElement ele : getNFKiosHelppageBackBtns()) {
			if (LFSUtilsIOS.tryMethod(ele))
				ele.click();
		}
		Reporter.logWithScreenShot("After clicking on back button", MessageTypes.Pass);
	}

	// Method to verify available option on help screen
	public void verifyHelpPage() {
		try {
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_HELP).assertPresent("help.title");
			Reporter.logWithScreenShot("Help Page available menus on first page", MessageTypes.Pass);
			getNFKiosMoremenuHelppageDoneBtn().isPresent();
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_SAFETY_ONBOARDING).assertPresent("Saftey OnBoarding");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_SENSOR_APPLICATION).assertPresent("Sensor Application");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_APP_TOUR).assertPresent("App Tour");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_APP_USER_GUIDE).assertPresent("App Uer Guide");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT).assertPresent("About");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LICENSE).assertPresent("License");
			Reporter.logWithScreenShot("Sucessfully verified help page", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify help page", MessageTypes.Fail);
		}
	}

	public void verifyHelpIntroductionPage() {
		if (getNFKiosHelppageIntroductionBtn().isPresent()) {
			getNFKiosHelppageIntroductionBtn().click();
		}
		getNFKiosHelppageIntroductionNFKMobileAppBtn().verifyPresent("NFK Mobile button");
		getNFKiosHelppageIntroductionSupportedDevicesBtn().verifyPresent("Supported devices button");
		getNFKiosHelppageIntroductionAppleLegalNoticeBtn().verifyPresent("Apple Legal Notice button");
		getNFKiosHelppageIntroductionAndroidLegalNoticeBtn().verifyPresent("Android Legal Notice button");
		getNFKiosHelppageIntroductionGoogleLegalNoticeBtn().verifyPresent("Google Legal Notice button");
		getNFKiosHelppageIntroductionBluetoothTrademarkBtn().verifyPresent("Bluetooth Trademark button");
		getNFKiosHelppageIntroductionIntendedUseBtn().verifyPresent("Intended Use button");
	}

	public void verifyNFKMobilePage() {
	LFSUtilsIOS.click(getNFKiosHelppageIntroductionNFKMobileAppBtn());
		getNFKiosHelppageIntroductionNFKMobileAppTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifySupportedDevicePage() {
		getNFKiosHelppageIntroductionSupportedDevicesBtn().click();

		getNFKiosHelppageIntroductionSupportedDevicesTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifyAppleLegalNoticePage() {
		getNFKiosHelppageIntroductionAppleLegalNoticeBtn().click();
		getNFKiosHelppageIntroductionAppleLegalNoticeTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifyAndroidLegalNoticePage() {
		getNFKiosHelppageIntroductionAndroidLegalNoticeBtn().click();

		getNFKiosHelppageIntroductionAndroidLegalNoticeTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifyGoogleLegalNoticePage() {
		getNFKiosHelppageIntroductionGoogleLegalNoticeBtn().click();

		getNFKiosHelppageIntroductionGoogleLegalNoticeTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifyBluetoothTrademarkPage() {
		getNFKiosHelppageIntroductionBluetoothTrademarkBtn().click();

		getNFKiosHelppageIntroductionBluetoothTrademarkTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifyIntendedage() {
		getNFKiosHelppageIntroductionIntendedUseBtn().click();

		getNFKiosHelppageIntroductionIntendedUseTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}

	public void verifyGettingStartedPage() {
		getNFKiosHelppageGettingstartedBtn().click();
		getNFKiosHelppageGettingstartedGettingStartedBtn().verifyPresent("Getting Started button is present");
		getNFKiosHelppageGettingstartedCreateAccountBtn().verifyPresent("Create Account button is Present");
		getNFKiosHelppageGettingstartedPairingBtn().verifyPresent("Pairing button is present");
		getNFKiosHelppageGettingstartedUnpairingBtn().verifyPresent("Unpairing button is present");
	}

	public void verifyGettingStartedGettingStartedPage() {
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_GETSRT).click();
		Reporter.logWithScreenShot("Getting started help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyGettingStartedCreateAccountPage() {
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT).click();
		Reporter.logWithScreenShot("Create account help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyGettingStartedPairingPage() {
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_PAIRING).click();
		Reporter.logWithScreenShot("Pairing help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyGettingStartedPairingFlexMeterPage() {
		getNFKiosHelppageGettingStartedPairingFlexMeterTxt().click();
		Reporter.logWithScreenShot("Getting started help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyGettingStartedUnpairingPage() {
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_UNPAIR).click();
		Reporter.logWithScreenShot("Unpair help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppOverView() {
		getNFKiosHelppageAppoverviewBtn().click();
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED).verifyPresent("Symbol and icon button");
		getNFKiosHelppageMoreMenuBtn().verifyPresent("More button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC).verifyPresent("Meter sync button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES)
				.verifyPresent("Speclial message button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION)
				.verifyPresent("Synchronization button");

	}

	public void verifySymbolPage() {

		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED));
		Reporter.logWithScreenShot("Symbol and icon  help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyOverviewMorePage() {
		LFSUtilsIOS.click(getNFKiosHelppageMoreMenuBtn());
		Reporter.logWithScreenShot("More menu help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpMeterSyncPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC));
		Reporter.logWithScreenShot("Syncing meter help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpSpecilaMessagePage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES));
		Reporter.logWithScreenShot("Special message help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpSynchronizingDataPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION));
		Reporter.logWithScreenShot("Synchronization help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	// METHODS FOR HELP NAVIGATION

	public void clickOnAppNavigation() {
		getNFKiosHelppagenNavigationBtn().click();
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_HOME).verifyPresent("navigation Home button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK)
				.verifyPresent("navigation logbook button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LASTREADING)
				.verifyPresent("navigation lastreading button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS)
				.verifyPresent("navigation pattern button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_AVARAGES)
				.verifyPresent("navigation Avarage button");

	}

	public void verifyHelpNavigationHomePage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_HOME));
		Reporter.logWithScreenShot("Home help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpNavigationLogbookPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK));
		Reporter.logWithScreenShot("Logbook help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpNavigationLastreadingPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LASTREADING));
		Reporter.logWithScreenShot("Lastreading help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpNavigationPatternPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS));
		Reporter.logWithScreenShot("Pattern help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpNavigationAvaragePage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_AVARAGES));
		Reporter.logWithScreenShot("Avarage help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	// Method for logbook all option verification
	public void clickOnAppLogbookHelp() {
		getNFKiosHelppageLogbookBtn().click();
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWDATA).verifyPresent("View date button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWDATA).verifyPresent("View date button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MEAL).verifyPresent("Add meal tag button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_READING_NOTE)
				.verifyPresent("Add reading Note button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADDING_EVENT).verifyPresent("Adding event button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_CARB).verifyPresent("Add carb button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_INSULIN).verifyPresent("Add insulin button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_ACTIVITY).verifyPresent("Add activity button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MANUALBG)
				.verifyPresent("Add manual glucose button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY)
				.verifyPresent("Viewing and adding detail for each day button");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN)
				.verifyPresent("View pattern from logbook button");

	}

	public void verifyHelpLogbokLogbookViewdatepage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK));
		Reporter.logWithScreenShot("Logbook logbook help ", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbokveiewAddmealPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MEAL));
		Reporter.logWithScreenShot("Add meal help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbokveiewReadingNotePage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_READING_NOTE));
		Reporter.logWithScreenShot("Reading note to your reading page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbokveiewAddCarbPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_CARB));
		Reporter.logWithScreenShot("Add carb help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbookAddInsulinPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_INSULIN));
		Reporter.logWithScreenShot("Add carb help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbookAddActivityPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_ACTIVITY));
		Reporter.logWithScreenShot("Add activity help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbookAddManualBGPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MANUALBG));
		Reporter.logWithScreenShot("Add reading Manual Glucose help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbookAddingEachdayBGPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY));
		Reporter.logWithScreenShot("Adding each day help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpLogbookViewingPetternPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN));
		Reporter.logWithScreenShot("viewing day help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	// SG Method for Patterns options
	public void clickOnAppPatternsHelp() {
		LFSUtilsIOS.click(getNFKiosHelppagePatternsBtn());
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS)
				.verifyPresent("Detecting patterns present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS)
				.verifyPresent("Viewing patterns present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES)
				.verifyPresent("Receiving pattern messages present");
	}

	public void verifyHelpPatternsDetctingPatterns() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS));
		Reporter.logWithScreenShot("detecting patterns page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpPatternsViewingPatterns() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS));
		Reporter.logWithScreenShot("viewing patterns page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpPatternsReceivingPatternMessages() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES));
		Reporter.logWithScreenShot("receiving pattern messages page", MessageTypes.Pass);
		clickOnBackButton();
	}

//SG Methods for Help Averges page

	public void clickOnAppAveragesHelp() {
		LFSUtilsIOS.click(getNFKiosHelppageAverageBtn());
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_AVERAGES).verifyPresent("Averages present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_USING_AVERAGES_WITH_MEAL_TAGGING)
				.verifyPresent("Using Averages with Meal Tagging present");

	}

	public void verifyHelpAveragesAveragesPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_AVERAGES));
		Reporter.logWithScreenShot("averages page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifyHelpAveragesUsingAveragesWithMealTaggingPage() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_USING_AVERAGES_WITH_MEAL_TAGGING));
		Reporter.logWithScreenShot("averages with meal tagging page", MessageTypes.Pass);
		clickOnBackButton();
	}

	// SG Methods for Help More Menu
	public void clickOnMoreMenuHelp() {
		getNFKiosHelppageMoreMenuBtn().click();
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MORE_MENU).verifyPresent("More Menu present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_SETTINGS).verifyPresent("Settings present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_RANGE)
				.verifyPresent("My range high and low limits present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_SETTING_YOUR_HIGH_AND_LOW_LIMITS)
				.verifyPresent("Setting your high and low limits present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_METERS).verifyPresent("My Meters present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_AUTO_UPDATE_TIME)
				.verifyPresent("Auto update time present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_REMINDERS)
				.verifyPresent("My Reminders present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_ACCOUNT).verifyPresent("My Account present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOGIN_PREFERENCES)
				.verifyPresent("Log-in preferences present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_OPTIN_PREFERENCES)
				.verifyPresent("Opt-in preferences present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_CONNECTIONS).verifyPresent("Connections present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_APPS).verifyPresent("Apps present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_HELP).verifyPresent("Help present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_TERMS_OF_SERVICE)
				.verifyPresent("Terms of Service present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_PRIVACY_POLICY)
				.verifyPresent("Privacy Policy present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOG_OUT).verifyPresent("Log out present");

	}

	public void clickOnAppMoreMenuMoreMenu() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MORE_MENU));
		Reporter.logWithScreenShot("more menu page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuMySettings() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_SETTINGS));
		Reporter.logWithScreenShot("my settings page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuMyRange() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_RANGE));
		Reporter.logWithScreenShot("my range page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuYourHighLowLimits() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_SETTING_YOUR_HIGH_AND_LOW_LIMITS));
		Reporter.logWithScreenShot("high and low limits page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuMyMeters() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_METERS));
		Reporter.logWithScreenShot("my meters page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuAutoUpdateTime() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_AUTO_UPDATE_TIME));
		Reporter.logWithScreenShot("auto update time page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuMyReminders() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_REMINDERS));
		Reporter.logWithScreenShot("my reminders page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuMyAccount() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_ACCOUNT));
		Reporter.logWithScreenShot("my account page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuLogInPreferences() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOGIN_PREFERENCES));
		Reporter.logWithScreenShot("login preferences page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuOptInPreferences() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_OPTIN_PREFERENCES));
		Reporter.logWithScreenShot("optin preferences page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuConnections() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_CONNECTIONS));
		Reporter.logWithScreenShot("Connections page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuApps() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_APPS));
		Reporter.logWithScreenShot("Apps page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuHelp() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_HELP));
		Reporter.logWithScreenShot("Help page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreTermsOfService() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_TERMS_OF_SERVICE));
		Reporter.logWithScreenShot("terms of service page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMorePrivacyPolicy() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_PRIVACY_POLICY));
		Reporter.logWithScreenShot("privacy policy page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreLogOut() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOG_OUT));
		Reporter.logWithScreenShot("log out page", MessageTypes.Pass);
		clickOnBackButton();
	}

//SG Help Reminders Methods
	public void clickOnMoreMenuReminders() {
		LFSUtilsIOS.click(getNFKiosHelppageGoalsBtn());
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_REMINDERS).verifyPresent("Reminders present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER)
				.verifyPresent("Adding a reminder present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS)
				.verifyPresent("Deleting reminders present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS)
				.verifyPresent("Receiving reminders present");
	}

	public void clickOnRemindersReminders() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_REMINDERS));
		Reporter.logWithScreenShot("reminders page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnRemindersAddingAReminder() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER));
		Reporter.logWithScreenShot("adding a reminder page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnRemindersDeletingAReminder() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS));
		Reporter.logWithScreenShot("deleting a reminder page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnRemindersReceivingReminders() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS));
		Reporter.logWithScreenShot("receiving reminders page", MessageTypes.Pass);
		clickOnBackButton();
	}

//SG Help Troubleshooting page methods
	public void clickOnMoreMenuTroubleshooting() {
		LFSUtilsIOS.click(getNFKiosHelppageTroubleshootBtn());
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS)
				.verifyPresent("Frequently asked questions present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES)
				.verifyPresent("App error and other messages present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR)
				.verifyPresent("Data access error present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH)
				.verifyPresent("App will not launch present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE)
				.verifyPresent("App and meter use differnt units of measure present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE)
				.verifyPresent("Different range error present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE)
				.verifyPresent("Improper blood sugar value present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE)
				.verifyPresent("Improper carbohydrate value present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE)
				.verifyPresent("Improper insulin value present");
		getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE)
				.verifyPresent("Improper manual blood sugar value present");
	}

	public void clickOnTroubleshootingFAQ() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS));
		Reporter.logWithScreenShot("frequently asked questions", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingAppErrorAndOtherMessages() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES));
		Reporter.logWithScreenShot("app error and other messages", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingDataAccessError() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR));
		Reporter.logWithScreenShot("data access errors", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingAppWillNotLaunch() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH));
		Reporter.logWithScreenShot("app will not launch", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingAppAndMeterUseDifferntUnitsOfMeasure() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE));
		Reporter.logWithScreenShot("app meter use and different units of measure", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingDifferentRange() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE));
		Reporter.logWithScreenShot("different range", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingImproperBloodSugarValue() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE));
		Reporter.logWithScreenShot("improper blood sugar value", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingImproperCarbohydrateValue() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE));
		Reporter.logWithScreenShot("improper carbohydrate value", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingImproperInsulinValue() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE));
		Reporter.logWithScreenShot("improper insulin value", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnTroubleshootingImproperManualBloodSugarValue() {
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE));
		Reporter.logWithScreenShot("improper manual blood sugar value", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void verifiesAboutHelpPage() {
		try {
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT_UDI).assertPresent("UDI of Mobile");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED).verifyPresent("Manufacture by");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS)
					.verifyPresent("Company Name");
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS1).isPresent();
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS2).isPresent();
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS)
					.verifyPresent("Address of Lifescan");
			Reporter.logWithScreenShot("Sucessfully verified About page", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify click on about page", MessageTypes.Fail);
		}

	}

	public void clickAbout() {
		try {
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_ABOUT));
			Reporter.logWithScreenShot("Sucessfully clicked on about", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on about", MessageTypes.Fail);
		}
	}

	public void clickSafteyOnboarding() {
		try {
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_SAFETY_ONBOARDING));
			Reporter.logWithScreenShot("Sucessfully clicked on safety onboarding option", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on saftey onboarding option", MessageTypes.Fail);
		}
	}

	public void clickAppTour() {
		try {
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_APP_TOUR));
			Reporter.logWithScreenShot("Sucessfully clicked on App Tour", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on app tour", MessageTypes.Fail);
		}
	}

	public void verifyAppTourScreen() {
		try {
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t1")).assertPresent("Your sensor Readings");
			clickNextBtn();
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t2"))
					.assertPresent("Sensor Life Countdown");
			clickNextBtn();
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t3")).assertPresent("Trend Graph");
			clickNextBtn();
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t4")).assertPresent("Navigation");
			clickNextBtn();
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t5")).assertPresent("Adding an Event");
			clickNextBtn();
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t6")).assertPresent("Your Event Log");
			clickNextBtn();
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.tour.t7")).assertPresent("Your Progress");
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("appCommon.done")));
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_APP_TOUR).isPresent();
			Reporter.logWithScreenShot("Sucessfully verified App Tour page", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify verify App Tour", MessageTypes.Fail);
		}
	}

	private void clickNextBtn() {
		LFSUtilsIOS.waitforLoad();
		LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("appCommon.next")));
	}

	public void verifySensorAppScreen() {
		try {
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.apply.sensor"))
					.assertPresent("Apply Sensor");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.remove.sensor"))
					.assertPresent("Remove Sensor");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.help.tips")).assertPresent("Help Tips");
			Reporter.logWithScreenShot("Sucessfully verified sensor Application", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify sensor Application", MessageTypes.Fail);
		}
	}

	public void clickSensorApp() {
		try {
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_SENSOR_APPLICATION));
			Reporter.logWithScreenShot("Sucessfully clicked on sensor application", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on sensor application", MessageTypes.Fail);
		}
	}

	public void validateOptions() {
		try {
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.apply.sensor")));
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.apply.title"))
					.assertPresent("Apply Sensor title");
			LFSUtilsIOS.click(getNFKiosMoremenuHelppageDoneBtn());
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.remove.sensor")));
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.remove.title"))
					.assertPresent("Remove Sensor title");
			LFSUtilsIOS.click(getNFKiosMoremenHelppageRemovesensorDoneBtn());
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.help.tips")));
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("help.sensor.helptip.title"))
					.assertPresent("Help tip title");
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("appCommon.done")));
			Reporter.logWithScreenShot("Sucessfully validated sensor application options", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to validate sensor application options", MessageTypes.Fail);
		}
	}

	public void clickAppUserGuide() {
		try {
			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_APP_USER_GUIDE));
			Reporter.logWithScreenShot("Sucessfully clicked on app user guide", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to click on app user guide", MessageTypes.Fail);
		}
	}

	public void verifyUserGuide() {
		try {
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.intro")).assertPresent("Intoduction");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.getting.started"))
					.assertPresent("Getting Started");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.account")).assertPresent("Account");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.home")).assertPresent("Home");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.event.log"))
					.assertPresent("Event Log");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.progress"))
					.assertPresent("Progress page");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.alert")).assertPresent("Alert");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.device")).assertPresent("Device");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.reminder")).assertPresent("Reminders");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.share")).assertPresent("Share");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.connection"))
					.assertPresent("Connectioon");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.setting")).assertPresent("Setting");
			getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("app.userguide.term")).assertPresent("Terms");
			Reporter.log("User Guide screen");
			Reporter.logWithScreenShot("Sucessfully verified app user guide page", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify app user guide page", MessageTypes.Fail);
		}
	}

	public void clickLicense() {
		try {

			LFSUtilsIOS.click(getNFKiosHelpPageStaticText(LFSUtilsIOS.getPropString("appCommon.licenses")));
			Reporter.logWithScreenShot("Sucessfully clicked on licence", MessageTypes.Pass);
		} catch (Exception e) {
			LFSUtilsIOS.clickWithText("Licenses");
		}
	}

	public void verifyLicensePage() {
		try {
			getNFKiosHelpPageStaticText(ConstantUtils.HELP_APP_LICENSE).assertPresent("Title of License Screen");

			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			Reporter.logWithScreenShot("License screen", MessageTypes.Pass);
			Reporter.logWithScreenShot("Sucessfully verified licence page", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.logWithScreenShot("Fail to verify licence page", MessageTypes.Fail);
		}
	}

	public void clickOnBackButton1(String page) {
		try {
			switch (page) {
			case "SensorApp":
				LFSUtilsIOS.click(getNFKiosHelppageBackButton());
				break;
			case "About":
				LFSUtilsIOS.click(getNFKiosHelppageAboutBackButton());
				break;
			case "AppuserGuide":
				LFSUtilsIOS.click(getNFKiosHelppageBackButton());

				break;
			case "Licenses":
				LFSUtilsIOS.click(getNFKiosHelpPageLicenseBackBtn());
				break;
			default:
				break;
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Back button is not present", MessageTypes.Fail);
		}
	}

}