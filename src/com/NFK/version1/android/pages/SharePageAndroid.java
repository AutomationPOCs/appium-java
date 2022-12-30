package com.NFK.version1.android.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;

import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.UserDetailBeans;
import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import io.appium.java_client.android.AndroidDriver;
import javassist.NotFoundException;

public class SharePageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {
	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFK.sharepage.sharelogo.lbl")
	private QAFWebElement NFKSharepageSharelogoLbl;
	@FindBy(locator = "NFK.sharepage.lastreadingshare.lbl")
	private QAFWebElement NFKSharepageLastreadingshareLbl;
	@FindBy(locator = "NFK.sharepage.sharewithtext.btn")
	private QAFWebElement NFKSharepageSharewithtextBtn;
	@FindBy(locator = "NFK.sharepage.sharewithemail.btn")
	private QAFWebElement NFKSharepageSharewithemailBtn;
	@FindBy(locator = "NFK.sharepage.sharereport.lbl")
	private QAFWebElement NFKSharepageSharereportLbl;
	@FindBy(locator = "NFK.sharepage.sharereport.pdfformat.btn")
	private QAFWebElement NFKSharepageSharereportPdfformatBtn;
	@FindBy(locator = "NFK.sharepage.exportdata.lbl")
	private QAFWebElement NFKSharepageExportdataLbl;
	@FindBy(locator = "NFK.sharepage.exportdata.csvformat.btn")
	private QAFWebElement NFKSharepageExportdataCsvformatBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.pdf.lbl")
	private QAFWebElement NFKSharepageShareReportPagePDFLbl;
	@FindBy(locator = "NFK.sharepage.sharereportpage.timeframeselect.14days.lbl")
	private QAFWebElement NFKSharepageShareReportPageTimeFrameSelect14DaysLbl;
	@FindBy(locator = "NFK.sharepage.sharereportpage.text.newmsg.lbl")
	private QAFWebElement NFKSharePageShareReportPageTextNewmsgLbl;
	@FindBy(locator = "NFK.sharepage.sharereportpage.text.recipient.txt")
	private QAFWebElement NFKSharePageShareReportPageTextRecipientTxt;
	@FindBy(locator = "NFK.sharepage.sharereportpage.text.send.btn")
	private QAFWebElement NFKSharepageShareReportPageTextSendBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.text.discard.txt")
	private QAFWebElement NFKSharepageShareReportPageTextDiscardTxt;
	@FindBy(locator = "NFK.sharepage.sharereportpage.OK.btn")
	private QAFWebElement NFKSharepageSharereportpageOKBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.appopenWindow")
	private QAFWebElement NFKSharepageSharereportappPopup;
	@FindBy(locator = "NFK.sharepage.sharereportpage.printoption.saveaspdf.btn")
	private QAFWebElement NFKSharepagesharereportPrintOptionSaveAsPdfBtn;

	@FindBy(locator = "NFK.sharepage.share.lbl")
	private QAFWebElement NFKsharepageShareLbl;

	@FindBy(locator = "NFK.sharepage.sharedata.lbl")
	private QAFWebElement NFKSharepageShareDataLbl;

	@FindBy(locator = "NFK.sharepage.invitefollower.lbl")
	private QAFWebElement NFKSharepageInviteFollowersLbl;

	@FindBy(locator = "NFK.sharepage.addfollower.btn")
	private QAFWebElement NFKsharepageAddFollowerBtn;

	@FindBy(locator = "NFK.sharepage.invite.btn")
	private QAFWebElement NFKSharepageInviteBtn;

	@FindBy(locator = "NFK.sharepage.addfollower.lbl")
	private QAFWebElement NFKSharepageAddFollowerLbl;

	@FindBy(locator = "NFK.sharepage.name.lbl")
	private QAFWebElement NFKSharepageNameLbl;

	@FindBy(locator = "NFK.sharepage.emailaddress.lbl")
	private QAFWebElement NFKSharepageEmailAddressLbl;

	@FindBy(locator = "NFK.sharepage.next.btn")
	private QAFWebElement NFKSharepageNextBtn;

	@FindBy(locator = "NFK.sharepage.setfollower.lbl")
	private QAFWebElement NFKSharepageSetFollowerLbl;

	@FindBy(locator = "NFK.sharepage.trendgraph.switch.btn")
	private QAFWebElement NFKSharePageTrendGraphSwitchBtn;

	@FindBy(locator = "NFK.sharepage.sensorexpiration.switch.btn")
	private QAFWebElement NFKSharePageSensorExpirationSwitchBtn;

	@FindBy(locator = "NFK.sharepage.urgentlow.btn")
	private QAFWebElement NFKSharePageUrgentLowBtn;

	@FindBy(locator = "NFK.sharepage.low.btn")
	private QAFWebElement NFKSharePageLowBtn;

	@FindBy(locator = "NFK.sharepage.low.below.lbl")
	private QAFWebElement NFKSharePageReadingBelowLbl;

	@FindBy(locator = "NFK.sharepage.low.morethan.lbl")
	private QAFWebElement NFKSharePageLowMoreThanLbl;

	@FindBy(locator = "NFK.sharepage.high.btn")
	private QAFWebElement NFKSharePageHighBtn;

	@FindBy(locator = "NFK.sharepage.high.readingbelow.lbl")
	private QAFWebElement NFKSharePageHighReadingBelowLbl;

	@FindBy(locator = "NFK.sharepage.high.morethan.lbl")
	private QAFWebElement NFKSharePageHighMoreThanLbl;

	@FindBy(locator = "NFK.sharepage.nodata.btn")
	private QAFWebElement NFKiosSharePageNoDataBtn;

	@FindBy(locator = "NFK.sharepage.nodata.more.lbl")
	private QAFWebElement NFKSharePageNoDataMoreThanLbl;

	@FindBy(locator = "NFK.sharepage.setup.invite.btn")
	private QAFWebElement NFKiosSharepageSetupInviteBtn;

	@FindBy(locator = "NFK.sharepage.added.follower.lbl")
	private QAFWebElement NFKiosSharepageAddedFollowerNameLbl;
    @FindBy(locator = "NFK.sharepage.shareData.txt")
	private QAFWebElement NFKSharepageShareDataTxt;
    @FindBy(locator = "NFK.sharepage.description.txt")
	private QAFWebElement NFKSharepageDescriptionTxt;
    @FindBy(locator = "NFK.sharepage.visitTheHelp.txt")
	private QAFWebElement NFKSharepageVisitTheHelpTxt;
    @FindBy(locator = "NFK.sharepage.backbutton.btn")
	private QAFWebElement NFKSharepageBackButtonBtn;
	@FindBy(locator = "NFK.sharepage.nextbutton.btn")
	private QAFWebElement NFKSharepageNextButtonBtn;
	@FindBy(locator = "NFK.sharepage.inviteFollower.btn")
	private QAFWebElement NFKSharepageInviteFollowerBtn;
	@FindBy(locator = "NFK.sharepage.nameTextBox.txt")
	private QAFWebElement NFKSharepageNameTextBoxTxt;
	@FindBy(locator = "NFK.sharepage.emailidTextBox.txt")
	private QAFWebElement NFKSharepageEmailidTextBoxTxt;
	@FindBy(locator = "NFK.sharepage.addFollowerNext.btn")
	private QAFWebElement NFKSharepageAddFollowerNextBtn;
	@FindBy(locator = "NFK.sharepage.setFollower.invite.btn")
	private QAFWebElement NFKSharepageSetFollowerInviteBtn; 
	@FindBy(locator = "NFK.sharepage.sharepage.invitedFollowerName.btn")
	private QAFWebElement NFKSharepageSharepageInvitedFollowerNameBtn;
	@FindBy(locator = "NFK.sharepage.removeFollower.txt")
	private QAFWebElement NFKSharepageRemoveFollowerTxt;
	@FindBy(locator = "NFK.sharepage.removeFollowerCancel.btn")
	private QAFWebElement NFKSharepageRemoveFollowerCancelBtn;
	@FindBy(locator = "NFK.Moremenu.addFollower.back.btn")
	private QAFWebElement NFKMoremenuAddFollowerBackBtn; 
	@FindBy(locator = "NFK.sharepage.followerName.txt")
	private QAFWebElement NFKSharepageFollowerNameTxt;
	@FindBy(locator = "NFK.sharepage.resentInvitation.text")
	private QAFWebElement NFKSharepageResentInvitationText;
	@FindBy(locator = "NFK.sharepage.toggle.btn")
	private QAFWebElement NFKSharepageToggleBtn;
	@FindBy(locator = "NFK.moremenu.share.btn")
	private QAFWebElement NFKMoremenuShareBtn;
	@FindBy(locator = "NFK.sharepage.addFollowerBack.btn")
	private QAFWebElement NFKSharepageAddFollowerBackbtn;
	@FindBy(locator = "NFK.sharepage.removeFollowerCancel.btn")
	private QAFWebElement NFKSharepageRemoveFollowerCancelbtn;
	@FindBy(locator = "NFK.sharepage.followerSetting.save.txt")
	private QAFWebElement NFKSharepageFollowerSettingSavetxt; 
	@FindBy(locator = "NFK.sharePage.lowGlucoseEvent.timePeriod")
	private QAFWebElement NFKSharePageLowGlucoseEventTimePeriod;
	@FindBy(locator = "NFK.sharePage.lowGlucoseEvent.timePeriod.days")
	private List<QAFWebElement> NFKSharePageLowGlucoseEventTimePeriodDays;
	@FindBy(locator = "NFK.sharePage.email.message")
	private QAFWebElement NFKSharePageEmailMessage;
	
	
	
	public QAFWebElement getNFKSharePageEmailMessage() {
		return NFKSharePageEmailMessage;
	}	
	public QAFWebElement getNFKSharePageLowGlucoseEventTimePeriod() {
		return NFKSharePageLowGlucoseEventTimePeriod;
	}
	public List<QAFWebElement> getNFKSharePageLowGlucoseEventTimePeriodDays() {
	    return NFKSharePageLowGlucoseEventTimePeriodDays;
	}
	
	public QAFWebElement getNFKSharepageFollowerSettingSavetxt() {
		return NFKSharepageFollowerSettingSavetxt;
		}
	public QAFWebElement getNFKSharepageRemoveFollowerCancelbtn() {
		return NFKSharepageRemoveFollowerCancelbtn;
		}
	public QAFWebElement getNFKSharepageAddFollowerBackbtn() {
		return NFKSharepageAddFollowerBackbtn;
		}
	public QAFWebElement getNFKMoremenuShareBtn() {
		return NFKMoremenuShareBtn;
	}
	public QAFWebElement getNFKSharepageToggleBtn() {
		return NFKSharepageToggleBtn;
	}
	public QAFWebElement getNFKSharepageResentInvitationText() {
		return NFKSharepageResentInvitationText;
		}
	public QAFWebElement getNFKSharepageFollowerNameTxt() {
		return NFKSharepageFollowerNameTxt;
	}
	public QAFWebElement getNFKMoremenuAddFollowerBackBtn() {
		return NFKMoremenuAddFollowerBackBtn;
		}
	public QAFWebElement getNFKSharepageRemoveFollowerTxt() {
		return NFKSharepageRemoveFollowerTxt;
	}
	public QAFWebElement getNFKSharepageRemoveFollowerCancelBtn() {
		return NFKSharepageRemoveFollowerCancelBtn;
	}
	public QAFWebElement getNFKSharepageSharepageInvitedFollowerNameBtn() {
		return NFKSharepageSharepageInvitedFollowerNameBtn;
		}
	public QAFWebElement getNFKSharepageSetFollowerInviteBtn(){
		return NFKSharepageSetFollowerInviteBtn;
		}
	public QAFWebElement getNFKSharepageAddFollowerNextBtn() {
		return NFKSharepageAddFollowerNextBtn;
		}
	public QAFWebElement getNFKSharepageEmailidTextBoxTxt() {
		return  NFKSharepageEmailidTextBoxTxt;
		}
	public QAFWebElement getNFKSharepageNameTextBoxTxt() {
		return  NFKSharepageNameTextBoxTxt;
		}
	public QAFWebElement getNFKSharepageInviteFollowerBtn() {
		return  NFKSharepageInviteFollowerBtn;
		}
    public QAFWebElement getNFKSharepageNextButtonBtn() {
		return  NFKSharepageNextButtonBtn;
		}
 public QAFWebElement getNFKSharepageBackButtonBtn() {
		return  NFKSharepageBackButtonBtn;
		}
    public QAFWebElement getNFKSharepageVisitTheHelpTxt() {
		return  NFKSharepageVisitTheHelpTxt;
	}
    public QAFWebElement getNFKSharepageDescriptionTxt() {
		return  NFKSharepageDescriptionTxt;
	}	
	
	 public QAFWebElement getNFKSharepageShareDataTxt() {
			return NFKSharepageShareDataTxt;
		}	
	public QAFWebElement getNFKsharepageAddFollowerBtn() {
		return NFKsharepageAddFollowerBtn;
	}
	public QAFWebElement getNFKSharepageSharereportappPopup() {
		return NFKSharepageSharereportappPopup;
	}

	public QAFWebElement getNFKSharepagesharereportPrintOptionSaveAsPdfBtn() {
		return NFKSharepagesharereportPrintOptionSaveAsPdfBtn;
	}

	public QAFWebElement getNFKSharePageShareReportPageTextNewmsgLbl() {
		return NFKSharePageShareReportPageTextNewmsgLbl;
	}

	public QAFWebElement getNFKSharepageSharereportpageOKBtn() {
		return NFKSharepageSharereportpageOKBtn;
	}

	public QAFWebElement getNFKSharePageShareReportPageTextRecipientTxt() {
		return NFKSharePageShareReportPageTextRecipientTxt;
	}

	public QAFWebElement getNFKSharepageShareReportPageTextSendBtn() {
		return NFKSharepageShareReportPageTextSendBtn;
	}

	public QAFWebElement getNFKSharepageShareReportPageTimeFrameSelect14DaysLbl() {
		return NFKSharepageShareReportPageTimeFrameSelect14DaysLbl;
	}

	public QAFWebElement getNFKSharepageSharereportPdfformatBtn() {
		return NFKSharepageSharereportPdfformatBtn;
	}

	public QAFWebElement getNFKSharepageShareReportPagePDFLbl() {
		return NFKSharepageShareReportPagePDFLbl;
	}

	public QAFWebElement getNFKSharepageSharereportPageTimeFormateSelectBtn() {
		return NFKSharepageSharereportPageTimeFormateSelectBtn;
	}

	public QAFWebElement getNFKSharepageShareReportPageEmailReportBtn() {
		return NFKSharepageShareReportPageEmailReportBtn;
	}

	public QAFWebElement getNFKSharePageShareeReportPagePrintReportBtn() {
		return NFKSharePageShareeReportPagePrintReportBtn;
	}

	public QAFWebElement getNFKSharepageShareReportPageTextDiscardTxt() {
		return NFKSharepageShareReportPageTextDiscardTxt;
	}

	public List<QAFWebElement> getNFKSharepageSharereportpageTimeframeselectList() {
		return NFKSharepageSharereportpageTimeframeselectList;
	}

	@FindBy(locator = "NFK.sharepage.sharereportpage.timeframeselct.btn")
	private QAFWebElement NFKSharepageSharereportPageTimeFormateSelectBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.emailreport.btn")
	private QAFWebElement NFKSharepageShareReportPageEmailReportBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.printreport.btn")
	private QAFWebElement NFKSharePageShareeReportPagePrintReportBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.openinreport.btn")
	private QAFWebElement NFKSharePageShareReportPageOpenInReportBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.timeframeselect.list")
	private List<QAFWebElement> NFKSharepageSharereportpageTimeframeselectList;

	@FindBy(locator = "NFK.sharepage.popup.nodata.title")
	private QAFWebElement NFKSharepagePopupNodataTitle;
	@FindBy(locator = "NFK.sharepage.popup.nodata.message")
	private QAFWebElement NFKSharepagePopupNodataMessage;
	@FindBy(locator = "NFK.sharepage.popup.nodata.ok.btn")
	private QAFWebElement NFKSharepagePopupNodataOkBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.timeperiod.lbl")
	private QAFWebElement NFKSharepageSharereportpageTimeperiodLbl;
	@FindBy(locator = "NFK.sharepage.sharereportpage.timeframeselct.btn")
	private QAFWebElement NFKSharepageSharereportpageTimeframeselctBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.emailreport.btn")
	private QAFWebElement NFKSharepageSharereportpageEmailreportBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.printreport.btn")
	private QAFWebElement NFKSharepageSharereportpagePrintreportBtn;
	@FindBy(locator = "NFK.sharepage.sharereportpage.openinreport.btn")
	private QAFWebElement NFKSharepageSharereportpageOpeninreportBtn;
	@FindBy(locator = "NFK.sharepage.back.btn")
	private QAFWebElement NFKSharepageBackBtn;
	@FindBy(locator = "NFK.share.page.follower.status")
	private QAFWebElement NFKSharePageFollowerStatus;
	@FindBy(locator = "NFK.follower.remove.txt")
	private QAFWebElement NFKFollowerRemoveTxt;
	@FindBy(locator = "NFK.follower.resend.txt")
	private QAFWebElement NFKFollowerResendTxt;
	@FindBy(locator = "NFK.share.page.followerlist.status")
	private List<QAFWebElement> NFKSharePageFollowerlistStatus;
	@FindBy(locator = "NFK.sharePage.email.loadingSpinner")
	private QAFWebElement NFKSharePageEmailLoadingSpinner;
	@FindBy(locator = "NFK.sharepage.toggle.btn")
	private QAFWebElement NFKSharepageTogglebtn;
	@FindBy(locator = "NFK.sharepage.expiredFollowerName.txt")
	private QAFWebElement NFKSharepageExpiredFollowerNametxt;
	@FindBy(locator = "NFK.sharepage.resentInvitation.text")
	private QAFWebElement NFKSharepageResentInvitationtext;
	@FindBy(locator = "NFK.sharepage.sharepage.acceptedFollowerName.btn")
	private QAFWebElement NFKSharepageSharepageAcceptedFollowerNameBtn;
	@FindBy(locator = "NFK.sharepage.sharepage.pauseSharing.btn")
	private QAFWebElement NFKSharepageSharepagePauseSharingbtn;
	@FindBy(locator = "NFK.sharepage.pauseFollowerName.txt")
	private QAFWebElement NFKSharepagePauseFollowerNametxt; 
	@FindBy(locator = "NFK.sharepage.sharepage.resumeSharing.btn")
	private QAFWebElement NFKSharepageSharepageResumeSharingBtn; 
	@FindBy(locator = "NFK.sharepage.sharepage.followername.txt")
	private QAFWebElement  NFKSharepageSharePageFollowernametxt;
	@FindBy(locator = "NFK.sharePage.email.to.field")
	private QAFWebElement NFKSharePageEmailToField;
	@FindBy(locator = "NFK.sharePage.email.send.btn")
	private QAFWebElement NFKSharePageEmailSendBtn;
	@FindBy(locator = "NFK.sharePage.email.from.label")
	private QAFWebElement NFKSharePageEmailfromLabel; 
	@FindBy(locator = "NFK.sharePage.email.pdf")
	private QAFWebElement NFKSharePageEmailPdf;
	@FindBy(locator = "NFK.sharePage.lowGlucoseEvent.printSection.pagePreview")
	private QAFWebElement NFKSharePageLowGlucoseEventPrintSectionPagePreview;
	@FindBy(locator = "NFK.sharePage.lowGlucoseEvent.printSection.printButton")
	private QAFWebElement NFKSharePageLowGlucoseEventPrintSectionPrintButton;
	@FindBy(locator = "NFK.sharepage.lowGlucoseEvent.printSection.printerOption")
	private QAFWebElement NFKSharepageLowGlucoseEventPrintSectionPrinterOption;
	@FindBy(locator = "NFK.sharePage.lowGlucoseEvent.printSection.printerSelection.dropDown")
	private QAFWebElement NFKSharePageLowGlucoseEventPrintSectionPrinterSelectionDropDown;
	
	
	public QAFWebElement getNFKSharePageLowGlucoseEventPrintSectionPagePreview() {
		return NFKSharePageLowGlucoseEventPrintSectionPagePreview;
	}
	public QAFWebElement getNFKSharePageLowGlucoseEventPrintSectionPrintButton() {
		return NFKSharePageLowGlucoseEventPrintSectionPrintButton;
	}
	public QAFWebElement getNFKSharepageLowGlucoseEventPrintSectionPrinterOption() {
		return NFKSharepageLowGlucoseEventPrintSectionPrinterOption;
	}
	public QAFWebElement getNFKSharePageLowGlucoseEventPrintSectionPrinterSelectionDropDown() {
		return NFKSharePageLowGlucoseEventPrintSectionPrinterSelectionDropDown;
	}
	
	public QAFWebElement getNFKSharePageEmailPdf() {
		return NFKSharePageEmailPdf;
	}
	public QAFWebElement getNFKSharePageEmailfromLabel() {
		return NFKSharePageEmailfromLabel;
	}
	public QAFWebElement getNFKSharePageEmailSendBtn() {
		return NFKSharePageEmailSendBtn;
	}
	public QAFWebElement getNFKSharePageEmailToField() {
		return NFKSharePageEmailToField;
	}


	public QAFWebElement getNFKSharePageEmailLoadingSpinner() {
		return NFKSharePageEmailLoadingSpinner;
	}
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	public QAFWebElement getNFKSharepageSharePageFollowernametxt() {
		return NFKSharepageSharePageFollowernametxt;
		}
	public QAFWebElement getNFKSharepageSharepageResumeSharingBtn() {
		return NFKSharepageSharepageResumeSharingBtn;
		}
	public QAFWebElement getNFKSharepageSharepagePauseSharingbtn() {
		return NFKSharepageSharepagePauseSharingbtn;
		}
	public QAFWebElement getNFKSharepagePauseFollowerNametxt() {
		return NFKSharepagePauseFollowerNametxt;
		}
	public QAFWebElement getNFKSharepageSharepageAcceptedFollowerNameBtn() {
		return NFKSharepageSharepageAcceptedFollowerNameBtn;
		}
	public QAFWebElement getNFKSharepageResentInvitationtext() {
		return  NFKSharepageResentInvitationtext;
		}
	public QAFWebElement getNFKSharepageExpiredFollowerNametxt() {
		return NFKSharepageExpiredFollowerNametxt;
		}
	public QAFWebElement getNFKSharepageTogglebtn() {
		return NFKSharepageTogglebtn;
		}

	public QAFWebElement getNFKSharePageFollowerStatus() {
		return NFKSharePageFollowerStatus;
	}

	public QAFWebElement getNFKFollowerRemoveTxt() {
		return NFKFollowerRemoveTxt;
	}

	public QAFWebElement getNFKFollowerResendTxt() {
		return NFKFollowerResendTxt;
	}

	public QAFWebElement getNFKSharepagePopupNodataTitle() {
		return NFKSharepagePopupNodataTitle;
	}

	public QAFWebElement getNFKSharepageBackBtn() {
		return NFKSharepageBackBtn;
	}

	public QAFWebElement getNFKSharepagePopupNodataMessage() {
		return NFKSharepagePopupNodataMessage;
	}

	public QAFWebElement getNFKSharepagePopupNodataOkBtn() {
		return NFKSharepagePopupNodataOkBtn;
	}

	public QAFWebElement getNFKSharepageSharereportpageTimeperiodLbl() {
		return NFKSharepageSharereportpageTimeperiodLbl;
	}

	public QAFWebElement getNFKSharepageSharereportpageTimeframeselctBtn() {
		return NFKSharepageSharereportpageTimeframeselctBtn;
	}

	public QAFWebElement getNFKSharepageSharereportpageEmailreportBtn() {
		return NFKSharepageSharereportpageEmailreportBtn;
	}

	public QAFWebElement getNFKSharepageSharereportpagePrintreportBtn() {
		return NFKSharepageSharereportpagePrintreportBtn;
	}

	public QAFWebElement getNFKSharepageSharereportpageOpeninreportBtn() {
		return NFKSharepageSharereportpageOpeninreportBtn;
	}

	public QAFWebElement getNFKsharepagesharelogolbl() {
		return NFKSharepageSharelogoLbl;
	}

	public QAFWebElement getNFKsharepagelastreadingsharelbl() {
		return NFKSharepageLastreadingshareLbl;
	}

	public QAFWebElement getNFKsharepagesharewithtextbtn() {
		return NFKSharepageSharewithtextBtn;
	}

	public QAFWebElement getNFKsharepagesharewithemailbtn() {
		return NFKSharepageSharewithemailBtn;
	}

	public QAFWebElement getNFKsharepagesharereportlbl() {
		return NFKSharepageSharereportLbl;
	}

	public QAFWebElement getNFKsharepagesharereportpdfformatbtn() {
		return NFKSharepageSharereportPdfformatBtn;
	}

	public QAFWebElement getNFKsharepageexportdatalbl() {
		return NFKSharepageExportdataLbl;
	}

	public QAFWebElement getNFKsharepageexportdatacsvformatbtn() {
		return NFKSharepageExportdataCsvformatBtn;
	}

	public QAFWebElement getNFKsharepagesharelbl() {
		return NFKsharepageShareLbl;
	}

	public QAFWebElement getNFKSharepageAddFollowerBtn() {
		return NFKsharepageAddFollowerBtn;
	}

	public QAFWebElement getNFKSharepageShareDataLbl() {
		return NFKSharepageShareDataLbl;
	}

	public QAFWebElement getNFKSharepageInviteFollowersLbl() {
		return NFKSharepageInviteFollowersLbl;
	}

	public QAFWebElement getNFKSharepageInviteBtn() {
		return NFKSharepageInviteBtn;
	}

	public QAFWebElement getNFKSharepageAddFollowerLbl() {
		return NFKSharepageAddFollowerLbl;
	}

	public QAFWebElement getNFKSharepageNameLbl() {
		return NFKSharepageNameLbl;
	}

	public QAFWebElement getNFKSharepageStaticlabel(String text) {
		return LFSUtilsAndroid.getElement("NFK.sharepage.statictext.lbl", text);
	}

	public QAFWebElement getNFKSharepageEmailAddressLbl() {
		return NFKSharepageEmailAddressLbl;
	}

	public QAFWebElement getNFKSharepageNextBtn() {
		return NFKSharepageNextBtn;
	}

	public QAFWebElement getNFKSharepageSetFollowerLbl() {
		return NFKSharepageSetFollowerLbl;
	}

	public QAFWebElement getNFKSharePageTrendGraphSwitchBtn() {
		return NFKSharePageTrendGraphSwitchBtn;
	}

	public QAFWebElement getNFKSharePageSensorExpirationSwitchBtn() {
		return NFKSharePageSensorExpirationSwitchBtn;
	}

	public QAFWebElement getNFKSharePageUrgentLowBtn() {
		return NFKSharePageUrgentLowBtn;
	}

	public QAFWebElement getNFKSharePageLowBtn() {
		return NFKSharePageLowBtn;
	}

	public QAFWebElement getNFKSharePageReadingBelowLbl() {
		return NFKSharePageReadingBelowLbl;
	}

	public QAFWebElement getNFKSharePageLowMoreThanLbl() {
		return NFKSharePageLowMoreThanLbl;
	}

	public QAFWebElement getNFKSharePageHighBtn() {
		return NFKSharePageHighBtn;
	}

	public QAFWebElement getNFKSharePageHighReadingBelowLbl() {
		return NFKSharePageHighReadingBelowLbl;
	}

	public QAFWebElement getNFKSharePageHighMoreThanLbl() {
		return NFKSharePageHighMoreThanLbl;
	}

	public QAFWebElement getNFKiosSharePageNoDataBtn() {
		return NFKiosSharePageNoDataBtn;
	}

	public QAFWebElement getNFKSharePageNoDataMoreThanLbl() {
		return NFKSharePageNoDataMoreThanLbl;
	}

	public QAFWebElement getNFKSharepageSetupInviteBtn() {
		return NFKiosSharepageSetupInviteBtn;
	}

	public QAFWebElement getNFKSharepageAddedFollowerNameLbl() {
		return NFKiosSharepageAddedFollowerNameLbl;
	}

	public List<QAFWebElement> getNFKSharePageFollowerlistStatus() {
		return NFKSharePageFollowerlistStatus;
	}

	// Method to verify Share page
	public void verifyShare() {
		LFSUtilsAndroid.waitforLoad();
		getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("share.navTitle")).assertPresent("Title Share screen");
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text"))
				.assertPresent("Text field");
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email"))
				.assertPresent("Email field");
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).assertPresent("AGP");
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("my.progress.low.lbl"))
				.assertPresent("Low Glucose Events");
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv")).assertPresent("CSV");
	}

	// Method to verify Timeframe Sequence
	public void verifyPDFtimeFrameSequence() {
		getNFKsharepagesharereportpdfformatbtn().click();
		getNFKSharepageShareReportPagePDFLbl().verifyPresent("Share Report in PDF format Page is displayed");
		getNFKSharepageSharereportPageTimeFormateSelectBtn().click();
		LFSUtilsAndroid.waitforLoad();
		if (getNFKSharepageSharereportpageTimeframeselectList().get(0).toString().equalsIgnoreCase("14 Days")
				|| getNFKSharepageSharereportpageTimeframeselectList().get(1).toString().equalsIgnoreCase("30 Days")
				|| getNFKSharepageSharereportpageTimeframeselectList().get(2).toString().equalsIgnoreCase("90 Days")) {
			Reporter.logWithScreenShot("Time Frame is in expected sequence", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Time Frame is not in expected sequence", MessageTypes.Pass);
		}
		getNFKSharepageSharereportpageOKBtn().click();
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify share report in PDF format
	public void sharePDFFile() {
		getNFKsharepagesharereportpdfformatbtn().click();
		getNFKSharepageShareReportPagePDFLbl().verifyPresent("Share Report in PDF format Page is displayed");
		getNFKSharepageSharereportPageTimeFormateSelectBtn().click();
		Reporter.logWithScreenShot("After clicking time frame", MessageTypes.Pass);
		getNFKSharepageShareReportPageTimeFrameSelect14DaysLbl().waitForPresent();
		getNFKSharepageShareReportPageTimeFrameSelect14DaysLbl().click();
		Reporter.logWithScreenShot("After Selecting time frame", MessageTypes.Pass);
		getNFKSharepageShareReportPageEmailReportBtn().verifyPresent("Email report option is present");
		getNFKSharepageSharereportpageOpeninreportBtn().verifyPresent("Open report options in present");
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify time Frame sequence for CSV share
	public void verifyCSVTimeFrameSequence() {
		getNFKsharepageexportdatacsvformatbtn().waitForPresent();
		getNFKsharepageexportdatacsvformatbtn().click();
		getNFKSharepageSharereportPageTimeFormateSelectBtn().click();
		LFSUtilsAndroid.waitforLoad();
		if (getNFKSharepageSharereportpageTimeframeselectList().get(0).toString().equalsIgnoreCase("14 Days")
				|| getNFKSharepageSharereportpageTimeframeselectList().get(1).toString().equalsIgnoreCase("30 Days")
				|| getNFKSharepageSharereportpageTimeframeselectList().get(2).toString().equalsIgnoreCase("90 Days")) {
			Reporter.logWithScreenShot("Time Frame is in expected sequence", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Time Frame is not in expected sequence", MessageTypes.Pass);
		}

		getNFKSharepageSharereportpageOKBtn().click();
	}

	// Method to click on Export Button to share in CSV format
	public void clickExportButtonToShare() {
		getNFKsharepageexportdatacsvformatbtn().waitForPresent();
		getNFKsharepageexportdatacsvformatbtn().click();
		getNFKSharepageSharereportPageTimeFormateSelectBtn().click();
		Reporter.logWithScreenShot("After clicking time frame", MessageTypes.Pass);
		getNFKSharepageShareReportPageTimeFrameSelect14DaysLbl().waitForPresent();
		getNFKSharepageShareReportPageTimeFrameSelect14DaysLbl().click();
		getNFKSharepageShareReportPageEmailReportBtn().verifyPresent("Email report option is present");
		getNFKSharepageSharereportpageOpeninreportBtn().verifyPresent("Open report options in present");
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to click on share using text
	public void shareUsingText() {
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text")).waitForPresent(100);
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text")).click();

		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Select contact to share", MessageTypes.Pass);

		LFSUtilsAndroid.waitforLoad();
		if (!getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text")).isPresent()) {
			LFSUtilsAndroid.clickBackButton();
			try {
				getNFKSharepageShareReportPageTextDiscardTxt().waitForPresent(3000);
				getNFKSharepageShareReportPageTextDiscardTxt().click();
			} catch (Exception e) {
				Reporter.logWithScreenShot("Discard button is not present", MessageTypes.Pass);
			}
		} else {

			try {
				getNFKSharepageShareReportPageTextDiscardTxt().waitForPresent(3000);
				getNFKSharepageShareReportPageTextDiscardTxt().click();
			} catch (Exception e) {
				Reporter.logWithScreenShot("Discard button is not present", MessageTypes.Pass);
			}
		}
	}

	@FindBy(locator = "NFK.sharepage.gmail.txt")
	private QAFWebElement NFKSharepageGmailTxt;

	public QAFWebElement getNFKSharepageGmailTxt() {
		return NFKSharepageGmailTxt;
	}

	// Method to share report via Email
	public void shareUsingEmail() {
		waitForPageToLoad();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		LoginPageAndroid login = new LoginPageAndroid();
		if (pageProps.getString("language.name").equalsIgnoreCase("sl-sl")) {
			login.getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("share.email"))
					.verifyPresent("Email button");
			login.getNFKForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("share.email")).click();
		} else {
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email"))
					.assertPresent("Email Button");
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).click();
		}
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Email options to share report", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		try {
			getNFKSharepageShareReportPageTextDiscardTxt().waitForPresent(3000);
			getNFKSharepageShareReportPageTextDiscardTxt().click();
		} catch (Exception e) {
			Reporter.logWithScreenShot("Discard button is not present", MessageTypes.Pass);
		}
	}

	// Method to click on share types
	public void clickOnFromShareType(String type) {
		type = type.toUpperCase();
		switch (type) {
		case "TEXT":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text")).click();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "EMAIL":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).click();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "AGP":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).click();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "CSV":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).click();
			LFSUtilsAndroid.waitforLoad();
			break;
		case "Low Glucose Events":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("my.progress.low.lbl")).click();
			LFSUtilsAndroid.waitforLoad();
			break;
		}
		Reporter.logWithScreenShot("After selecting time share type as " + type, MessageTypes.Pass);
	}

	public void verifyNoDataPopup() {
		Assert.assertEquals(getNFKSharepagePopupNodataTitle().getText(),
				ConfigurationManager.getBundle().getString("share.noReadingsAlertTitle"));
		Assert.assertEquals(getNFKSharepagePopupNodataMessage().getText(),
				ConfigurationManager.getBundle().getString("share.noReadingsAlertMessage"));
		getNFKSharepagePopupNodataOkBtn().isPresent();
		getNFKSharepagePopupNodataOkBtn().click();
	}

	public void verifyNoEnoughPopup() {
		Assert.assertEquals(getNFKSharepagePopupNodataTitle().getText(),
				ConfigurationManager.getBundle().getString("share.notenoughdatatitle"));
		Assert.assertEquals(getNFKSharepagePopupNodataMessage().getText(),
				ConfigurationManager.getBundle().getString("my.progress.agp.nodata.txt"));
		getNFKSharepagePopupNodataOkBtn().isPresent();
		getNFKSharepagePopupNodataOkBtn().click();
	}

	// Method to verify share text screen
	public void verifyShareTextScreen() {
		LFSUtilsAndroid.clickBackButton();
		Reporter.logWithScreenShot("Share text screen is displayed", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		if (getNFKSharepageShareReportPageTextDiscardTxt().isPresent()) {
			getNFKSharepageShareReportPageTextDiscardTxt().click();
		} else {
			getNFKsharepagesharelogolbl().verifyPresent();
			Reporter.logWithScreenShot("Share screen after clicking on cancel button", MessageTypes.Pass);
		}
		getNFKsharepagesharelogolbl().verifyPresent();
		Reporter.logWithScreenShot("Share screen after clicking on cancel button", MessageTypes.Pass);

	}

	public void createReportium() {
		PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
				.withProject(new Project("Lemonade Reportium", "1.0")).withJob(new Job("IOS tests", 45))
				.withContextTags("Regression").withWebDriver(driver).build();
		ReportiumClient reportiumClient = new ReportiumClientFactory()
				.createPerfectoReportiumClient(perfectoExecutionContext);

		try {
			reportiumClient.testStart("Lemonade open app scenario", new TestContext("Test1 tag1"));

			reportiumClient.testStep("User open app");
			CountrySelectionPageAndroid countrySelectionPAge = new CountrySelectionPageAndroid();
			countrySelectionPAge.openNFKApp();
			reportiumClient.testStop(TestResultFactory.createSuccess());
			driver.get(reportiumClient.getReportUrl());
		} catch (Exception e) {
			reportiumClient.testStop(TestResultFactory.createFailure(e.getMessage(), e));
			e.printStackTrace();
		}

	}

	// Method to click on PDF and Verify the options
	public void clickOnPDF() {
		getNFKsharepagesharereportpdfformatbtn().click();
		getNFKSharepageShareReportPagePDFLbl().verifyPresent("Share Report in PDF format Page is displayed");
		getNFKSharepageSharereportPageTimeFormateSelectBtn().verifyPresent("Time Farme label Present");
		getNFKSharepageShareReportPageEmailReportBtn().verifyPresent("Email report option is present");
		getNFKSharePageShareeReportPagePrintReportBtn().verifyPresent("Print Report option is present");
		getNFKSharepageSharereportpageOpeninreportBtn().verifyPresent("Open In  report options in present");
	}

	// method to verify Share a report by Email option
	public void clickOnPDFByEmail() {
		getNFKSharepageShareReportPageEmailReportBtn().waitForPresent();
		getNFKSharepageShareReportPageEmailReportBtn().click();
		getNFKSharepageSharereportappPopup().waitForPresent();
		getNFKSharepageSharereportappPopup()
				.verifyPresent("Clicked on Email and redirected to application open pop up");
		Reporter.logWithScreenShot("Application pop up window", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	// method to verify share a report by print option
	public void clickOnPDFByPrint() {
		getNFKsharepagesharereportpdfformatbtn().click();
		getNFKSharePageShareeReportPagePrintReportBtn().waitForPresent();
		getNFKSharePageShareeReportPagePrintReportBtn().click();
		getNFKSharepagesharereportPrintOptionSaveAsPdfBtn().waitForPresent();
		getNFKSharepagesharereportPrintOptionSaveAsPdfBtn()
				.verifyPresent("Clicked on Print option and redirected to Save As PDF page");
		Reporter.logWithScreenShot("Print PDF page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	// method to verify share open in option
	public void clickOnPDFByOpenIn() {
		getNFKsharepagesharereportpdfformatbtn().click();
		getNFKSharepageSharereportpageOpeninreportBtn().waitForPresent();
		getNFKSharepageSharereportpageOpeninreportBtn().click();
		getNFKSharepageSharereportappPopup().waitForPresent();
		getNFKSharepageSharereportappPopup()
				.verifyPresent("Clicked on Open In option and redirected to application open pop up window");
		Reporter.logWithScreenShot("Application pop up window", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to click on Export data CSV
	public void clickOnCSV() {
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv")).click();
		getNFKSharepageSharereportPageTimeFormateSelectBtn().assertPresent("Time Period");
		getNFKSharepageShareReportPageEmailReportBtn().assertPresent("Email report option is present");
		getNFKSharepageSharereportpageOpeninreportBtn().assertPresent("Open in report options in present");
		Reporter.logWithScreenShot("Verified the CSV Screen", MessageTypes.Pass);
	}

	public void verifyShareUI() {
		try {
			getNFKsharepagesharelbl().verifyPresent("Share label");
			AlertsPageAndroid alert = new AlertsPageAndroid();
			alert.getNFKAlertSuboptionsScreensSwitchBtn().assertPresent("Sharing Toggle button");
			Assert.assertTrue(alert.getNFKAlertSuboptionsScreensSwitchBtn().isEnabled());
			Reporter.logWithScreenShot("User verified Share screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify Share screen", MessageTypes.Fail);
		}
	}

	public void clicksOnAddFollowerBtn() {
		LFSUtilsAndroid.click(getNFKSharepageAddFollowerBtn());
		Reporter.logWithScreenShot("User clicked on Add Follwer button", MessageTypes.Pass);
	}

	public void clicksOnInviteFollowerBtn() {
		try {
			if (getNFKSharepageInviteFollowersLbl().isDisplayed()) {
				LFSUtilsAndroid.click(getNFKSharepageInviteBtn());
			}
			Reporter.logWithScreenShot("User clicked on Invite Follwer button", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Invite Follwer screen not displayed", MessageTypes.Fail);
		}
	}

	public void verifyAddFollowerUI() {
		try {
			getNFKSharepageAddFollowerLbl().verifyVisible("Add Follower screen title");
			getNFKSharepageNameLbl().verifyVisible("Name Field");
			getNFKSharepageEmailAddressLbl().verifyVisible("Email Address Field");
			getNFKSharepageNextBtn().verifyDisabled("Next Button");
			Reporter.logWithScreenShot("User verified Add follower screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify Add follower screen", MessageTypes.Fail);
		}
	}

	public void addFollowersDetails() {
		String email = "testmail+" + RandomStringUtils.randomAlphabetic(6) + "@testmail.com";
		String name = "Jon" + RandomStringUtils.randomAlphabetic(6);
		ConfigurationManager.getBundle().setProperty("addfollower.name", name);
		LFSUtilsAndroid.enterText(getNFKSharepageNameLbl(), name);
		LFSUtilsAndroid.enterText(getNFKSharepageEmailAddressLbl(), email);
		LFSUtilsAndroid.click(getNFKSharepageNextBtn());
		Reporter.logWithScreenShot("User entered follower details", MessageTypes.Pass);
	}

	@FindBy(locator = "NFK.sharepage.nexttutorial.btn")
	private QAFWebElement NFKSharepageNexttutorialBtn;

	public QAFWebElement getNFKSharepageNexttutorialBtn() {
		return NFKSharepageNexttutorialBtn;
	}

	public void completeFirstUseStatements() {
		if (getNFKSharepageShareDataLbl().isDisplayed()) {
			Reporter.logWithScreenShot("Share Your Data screen displayed", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKSharepageNexttutorialBtn());
		} else {
			Reporter.logWithScreenShot("Share Your Data screen is not displayed", MessageTypes.Fail);
		}
	}

	public void MaximumFollowersReachedPopup() {
		try {
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.maximum.follower.popup.title"))
					.verifyPresent("Maximum Followers Reached popup");
			getNFKSharepageStaticlabel(
					ConfigurationManager.getBundle().getString("share.maximum.follower.popup.message"))
							.verifyPresent("Maximum Followers Reached popup message");
			Reporter.logWithScreenShot("Maximum followers popup displayed successfully", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Maximum followers popup not displayed", MessageTypes.Fail);
		}
	}

	public void verifySetFollowerUI() {
		try {
			getNFKSharepageSetFollowerLbl().verifyVisible("Set Up Follower screen");
			if (getNFKSharePageTrendGraphSwitchBtn().getAttribute("checked").equals("true")) {
				Reporter.logWithScreenShot("Trend Graph switch is enabled", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Trend Graph switch is disabled", MessageTypes.Fail);
			}
			if (getNFKSharePageSensorExpirationSwitchBtn().getAttribute("checked").equals("false")) {
				Reporter.logWithScreenShot("SensorExpiration switch is disabled", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("SensorExpiration switch is enabled", MessageTypes.Fail);
			}
			if (getNFKSharePageUrgentLowBtn().getAttribute("text").equals("On")) {
				Reporter.log("Urgent Low is On");
			} else {
				Reporter.logWithScreenShot("Urgent Low is Off", MessageTypes.Fail);
			}
			if (getNFKSharePageLowBtn().getAttribute("text").equals("On")) {
				Reporter.log("Low Status is On");
			} else {
				Reporter.logWithScreenShot("Low Status is Off", MessageTypes.Fail);
			}
			if (getNFKSharePageHighBtn().getAttribute("text").equals("On")) {
				Reporter.log("High Status is On");
			} else {
				Reporter.logWithScreenShot("High Status is Off", MessageTypes.Fail);
			}
			Reporter.logWithScreenShot("User verified Set Up Follower screen", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify Set Up Follower screen", MessageTypes.Fail);
		}

	}

	public void setNotifications(String option) {
		switch (option) {
		case "Low":
			if (getNFKSharePageLowBtn().getAttribute("text").equals("OFF")) {
				getNFKSharePageLowBtn().waitForPresent();
				getNFKSharePageLowBtn().click();
			}
			verifyLowToggle();
			break;

		case "High":
			LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);
			if (getNFKSharePageHighBtn().getAttribute("checked").equals("false")) {

				getNFKSharePageHighBtn().waitForPresent();
				getNFKSharePageHighBtn().click();
			}
			verifyHighToggle();
			break;

		case "NoData":
			LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);
			if (getNFKiosSharePageNoDataBtn().getAttribute("checked").equals("false")) {
				getNFKiosSharePageNoDataBtn().waitForPresent();
				getNFKiosSharePageNoDataBtn().click();
			}
			verifyNoDataToggle();
			break;

		}
	}

	public void verifyLowToggle() {
		if (getNFKSharePageLowBtn().getAttribute("checked").equals("true")) {
			String lowReadingBelow = ConfigurationManager.getBundle().getPropertyValue("low.reading.below");
			WebDriverTestCase.verifyTrue(
					getNFKSharePageReadingBelowLbl().getAttribute("text").contains(lowReadingBelow),
					"Different value of Readings Below is displayed",
					"Displaying Low Readings Below value as " + lowReadingBelow);

			String lowMoreThan = ConfigurationManager.getBundle().getPropertyValue("low.more.than");
			WebDriverTestCase.verifyTrue(getNFKSharePageLowMoreThanLbl().getAttribute("text").contains(lowMoreThan),
					"Different value of Low For More Than is displayed",
					"Displaying value of Low For More Than as " + lowMoreThan);

		} else {
			Reporter.logWithScreenShot("Low switch is disabled");
		}
	}

	public void verifyHighToggle() {
		if (getNFKSharePageHighBtn().getAttribute("checked").equals("true")) {
			String highReadingAbove = ConfigurationManager.getBundle().getPropertyValue("high.reading.above");
			WebDriverTestCase.verifyTrue(
					getNFKSharePageHighReadingBelowLbl().getAttribute("text").contains(highReadingAbove),
					"Different value of High for Readings above is displayed",
					"Displaying High Readings Above value as" + highReadingAbove);

			String highMoreThan = ConfigurationManager.getBundle().getPropertyValue("high.more.than");
			WebDriverTestCase.verifyTrue(getNFKSharePageHighMoreThanLbl().getAttribute("text").contains(highMoreThan),
					"Different value of High For More Than is displayed",
					"Displaying value of For More Than as " + highMoreThan);
		} else {
			Reporter.logWithScreenShot("High switch is disabled");
		}

	}

	public void verifyNoDataToggle() {
		if (getNFKiosSharePageNoDataBtn().getAttribute("checked").equals("true")) {
			String noDataMoreThan = ConfigurationManager.getBundle().getPropertyValue("nodata.more.than");

			WebDriverTestCase.verifyTrue(
					getNFKSharePageNoDataMoreThanLbl().getAttribute("text").contains(noDataMoreThan),
					"Different Readings of No Data value is displayed",
					"Displaying For More Than value as " + noDataMoreThan);

		} else {
			Reporter.logWithScreenShot("No Data switch is disabled");
		}

	}

	public void clicksOnInviteBtn() {
		LFSUtilsAndroid.click(getNFKSharepageSetupInviteBtn());
		Reporter.logWithScreenShot("User clicked on Invite button", MessageTypes.Pass);
	}

	public void verifyFollowerOnShare() {
		try {
			getNFKsharepagesharelbl().verifyPresent("Share screen");
			String follower = ConfigurationManager.getBundle().getPropertyValue("addfollower.name");
			WebDriverTestCase.verifyTrue(getNFKSharepageAddedFollowerNameLbl().getAttribute("text").contains(follower),
					"No follower to display", "Displaying follower's name");
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			Reporter.logWithScreenShot("User verified added follwer", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify added follwer", MessageTypes.Fail);
		}
	}

	public void addTwentyFollowersDetails() {
		try {
			for (int i = 1; i <= 20; i++) {
				LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 0, 200);
				clicksOnAddFollowerBtn();
				addFollowersDetails();
				clicksOnInviteBtn();
				getNFKsharepagesharelbl().waitForPresent();
				LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 0, 200);
				LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 0, 200);
			}
			Reporter.logWithScreenShot("User added 20 follwers", MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to add 20 followers", MessageTypes.Fail);
		}
	}

	public void clickOnLowGlucose() {
		waitForPageToLoad();
		LFSUtilsAndroid.waitforLoad();
		getNFKSharepageSharereportPageTimeFormateSelectBtn().waitForPresent(3000);
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("my.progress.low.lbl")).click();
		getNFKSharepageSharereportPageTimeFormateSelectBtn().assertPresent("Time Period");
		getNFKSharepageShareReportPageEmailReportBtn().assertPresent("Email report option is present");
		getNFKSharepageSharereportpageOpeninreportBtn().assertPresent("Open in report options in present");
		Reporter.logWithScreenShot("Verified the Low Glucose Event Screen", MessageTypes.Pass);

	}

	public void verifyPOPupTimeFrame() {
		getNFKSharepageShareReportPageEmailReportBtn().click();
		verifyNoDataAvailablePopup();
		getNFKSharepageSharereportpageOpeninreportBtn().click();
		verifyNoDataAvailablePopup();
	}

	public void selectTimeFrame(String day) {
		LFSUtilsIOS.waitforLoad();
		switch (day) {
		case "7":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame14")).click();
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame7")).click();
			break;
		case "30":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame7")).click();
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame30")).click();
			break;
		case "60":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame30")).click();
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame60")).click();
			break;
		case "90":
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame60")).click();
			getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame90")).click();
			break;
		}
		Reporter.logWithScreenShot("After selecting time frame", MessageTypes.Pass);
	}

	public void verifyNoDataAvailablePopup() {
		LFSUtilsAndroid.pause(10000);
		Assert.assertEquals(getNFKSharepagePopupNodataTitle().getText(),
				ConfigurationManager.getBundle().getString("share.nodataAlertTitle"));
		Assert.assertEquals(getNFKSharepagePopupNodataMessage().getText(),
				ConfigurationManager.getBundle().getString("share.nodataAlertMessage"));
		getNFKSharepagePopupNodataOkBtn().isPresent();
		getNFKSharepagePopupNodataOkBtn().click();
	}

	public void shareLastReadingUsingAGP() {
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).waitForPresent(100);
		getNFKSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).click();
		shareUsingEmail();
	}

	public void openInReport() {

	}

	public void verifyNoLowGlucoseEvents() {
		LFSUtilsAndroid.pause(30000);
		Assert.assertEquals(getNFKSharepagePopupNodataTitle().getText(),
				ConfigurationManager.getBundle().getString("share.nolow.events"));
		Assert.assertEquals(getNFKSharepagePopupNodataMessage().getText(),
				ConfigurationManager.getBundle().getString("share.nolow.events.msg"));
		getNFKSharepagePopupNodataOkBtn().isPresent();
		getNFKSharepagePopupNodataOkBtn().click();

	}

	public void verifyTimeFrameForLowEvents() {
		getNFKSharepageShareReportPageEmailReportBtn().click();
		verifyNoLowGlucoseEvents();
		getNFKSharepageSharereportpageOpeninreportBtn().click();
		verifyNoLowGlucoseEvents();
	}

	public void clickBack() {
		getNFKSharepageBackBtn().waitForPresent(100);
		getNFKSharepageBackBtn().click();

	}

	public void checkStaus() {
		waitForPageToLoad();
		getNFKSharePageFollowerStatus().getText().equals(LFSUtilsAndroid.getPropString("invite.status"));
	}

	public void checkRemoveResendBtn() {
		verifyFollowerOnShare();
		getNFKSharepageAddedFollowerNameLbl().click();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		LFSUtilsAndroid.swipePage();
		getNFKFollowerRemoveTxt().assertPresent("Remove button");
		getNFKFollowerResendTxt().assertPresent("Resend Link");
		Reporter.log("Remove button and Resend Link");
	}

	public void clickOnRemovebtn() {
		getNFKFollowerRemoveTxt().isPresent();
		getNFKFollowerRemoveTxt().click();
		LFSUtilsAndroid.waitforLoad();
	}

	public void verifyPopup() {
		getNFKSharepagePopupNodataTitle().assertPresent("Title Are you sure?");
		getNFKSharepagePopupNodataMessage().assertPresent("User will be removed from List");
		getNFKSharepagePopupNodataOkBtn().isPresent();
		getNFKSharepageShareReportPageTextDiscardTxt().isPresent();
		Reporter.logWithScreenShot("Remove Follower popup", MessageTypes.Pass);
	}

	public void verifyfollowername() {
		getNFKSharepageShareReportPageTextDiscardTxt().click();
		getNFKSharepageAddedFollowerNameLbl().click();
		getNFKFollowerRemoveTxt().click();
		getNFKSharepagePopupNodataOkBtn().click();
	}

	public void verifyNoFollowerName() {
		String follower = ConfigurationManager.getBundle().getPropertyValue("addfollower.name");
		getNFKSharepageAddedFollowerNameLbl().assertNotPresent("Name field");
		try {
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyfollowerStatus() {
		waitForPageToLoad();
		if (getNFKSharePageFollowerlistStatus().get(0).getText().contains("Expired")) {
			Reporter.logWithScreenShot("Follower status is expired", MessageTypes.Pass);
		}
		;
		if (getNFKSharePageFollowerlistStatus().get(1).getText().contains("Expired")) {
			Reporter.logWithScreenShot("Follower status is expired", MessageTypes.Pass);
		}
		;
	}
	public void toggleSwitchFollwerSettings() {
		getNFKSharePageTrendGraphSwitchBtn().click();
		if (getNFKSharePageTrendGraphSwitchBtn().getAttribute("checked").equals("false")) {
			Reporter.logWithScreenShot("Trend Graph switch is disabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Trend Graph switch is not disabled", MessageTypes.Fail);
		}
		getNFKSharePageSensorExpirationSwitchBtn().click();
		if (getNFKSharePageSensorExpirationSwitchBtn().getAttribute("checked").equals("true")) {
			Reporter.logWithScreenShot("SensorExpiration switch is enabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("SensorExpiration switch is not enabled", MessageTypes.Fail);
		}
		getNFKSharePageTrendGraphSwitchBtn().click();
		if (getNFKSharePageTrendGraphSwitchBtn().getAttribute("checked").equals("true")) {
			Reporter.logWithScreenShot("Trend Graph switch is enabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Trend Graph switch is not enabled", MessageTypes.Fail);
		}
		getNFKSharePageSensorExpirationSwitchBtn().click();
		if (getNFKSharePageSensorExpirationSwitchBtn().getAttribute("checked").equals("false")) {
			Reporter.logWithScreenShot("SensorExpiration switch is disabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("SensorExpiration switch is not disable", MessageTypes.Fail);
		}
	}

	//Auther-Pradnya
	//Description-Method to turn off toggle button
			public void userTurnOffToggleButton() {
				try {
				LFSUtilsAndroid.click(getNFKSharepageTogglebtn());
				Reporter.logWithScreenShot("User sucessfully tap on toggle button", MessageTypes.Pass);
				}catch(Exception e) {
					Reporter.log("User should not tap on toggle button", MessageTypes.Fail);
				}
			}
			//Auther-Pradnya
			//Description-Method to click on follower name status as expired
			public void userClickExpiredFollowerName() {
				try {
					LFSUtilsAndroid.click(getNFKSharepageExpiredFollowerNametxt());
					Reporter.logWithScreenShot("User sucessfully tap followername with satus expired ", MessageTypes.Pass);
					LFSUtilsAndroid.swipePage();
					LFSUtilsAndroid.swipePage();
					LFSUtilsAndroid.click(getNFKSharepageResentInvitationtext());
				}catch(Exception e)
				{
					Reporter.logWithScreenShot("User should not tap on expired follower name", MessageTypes.Fail);
				}
			}
			//Auther-Pradnya
			//Description-Method to click on follower name
			public void userClickOnFollowerName() {
				LFSUtilsAndroid.click(getNFKSharepageFollowerNameTxt());
				LFSUtilsAndroid.swipePage();
				LFSUtilsAndroid.swipePage();
				LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerTxt());
				LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerCancelBtn());
				Reporter.logWithScreenShot("User sucessfully click on cancel button", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerTxt());
			}
			

	//Author Name-Pradnya,Date-29/6/22
	//Description-Method To click on Add Follower and verify share data screen
	public void clickOnAddFollowersToVerifyShareDataScreen()
	{
		if(getNFKsharepageAddFollowerBtn().isPresent()) {
			LFSUtilsAndroid.click(getNFKsharepageAddFollowerBtn());
			getNFKSharepageShareDataTxt().verifyPresent("Share your data text");
			getNFKSharepageDescriptionTxt().verifyPresent("information text");
			getNFKSharepageVisitTheHelpTxt().verifyPresent("Visit the Help text");
			getNFKSharepageBackButtonBtn().verifyPresent("Back button");
			getNFKSharepageNextButtonBtn().verifyPresent("Next button");
			Reporter.logWithScreenShot("User sucessfully verify Share your data screen", MessageTypes.Pass);
			
		}
		
	}
	//Author Name-Pradnya,Date-29/6/22
	//Description- Method to click on Invite follower button of invite follower screen
	 public void clickInviteFollowersButtonofInviteFollowersScreen() {
		 try {
			if(getNFKSharepageNextButtonBtn().isPresent()) {
				LFSUtilsAndroid.click(getNFKSharepageNextButtonBtn());}
			 if(getNFKSharepageInviteFollowerBtn().isPresent())
			 {
				 LFSUtilsAndroid.click(getNFKSharepageInviteFollowerBtn());
				 }
		    } catch(Exception e) {
		    	Reporter.logWithScreenShot("User sucessfully nevigate to add follower details", MessageTypes.Pass);
		    }
	 }
	 //Author Name-Pradnya,Date-29/6/22
	 //Description-Method to enter follower details
	 public void userEnterAddFollowersDetails(String details)
	 {  UserDetailBeans userBean = new UserDetailBeans();
		if (details instanceof String) {
			userBean.fillFromConfig(details);
		} else {
			userBean.fillData(details);
		}
	 	
	 	LFSUtilsAndroid.enterText(getNFKSharepageNameTextBoxTxt(),userBean.getfollowerName());
	 	LFSUtilsAndroid.enterText(getNFKSharepageEmailidTextBoxTxt(),userBean.getfollowerEmail());
	 	if(getNFKSharepageAddFollowerNextBtn().isPresent()){
	 	LFSUtilsAndroid.click(getNFKSharepageAddFollowerNextBtn());
	 	}
	 	Reporter.logWithScreenShot("User entered follower details", MessageTypes.Pass);
	 	LFSUtilsAndroid.click(getNFKSharepageSetFollowerInviteBtn());
	 	Reporter.logWithScreenShot("User nevigate to share screen", MessageTypes.Pass);
	 	
	 } 
	//Author Name-pradnya,Date-29/6/22
	//Description- Method to click follower name status as a invited
		public void userClickOnInvitedFollowerName() {
			getNFKSharepageSharepageInvitedFollowerNameBtn().click();
			Reporter.logWithScreenShot("User sucessfully nevigate to follower details screen", MessageTypes.Pass);
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerTxt());
			LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerCancelBtn());
			Reporter.logWithScreenShot("User sucessfully click on cancel button", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKMoremenuAddFollowerBackBtn());
		}
		//Author Name-Pradnya,Date-29/6/22
		//Description- Method to click on Add follower button
		public void userClickAddFollowerButton() {
			LFSUtilsAndroid.swipePage();
		    LFSUtilsAndroid.swipePage();
			if(getNFKSharepageAddFollowerBtn().isPresent()) {
				LFSUtilsAndroid.click(getNFKSharepageAddFollowerBtn());}
			}
		
		//Author Name-Pradnya,Date-29/6/22
		//Description-Method to add follower details
		public void addDetails(String details) {
			UserDetailBeans userBean = new UserDetailBeans();
			if (details instanceof String) {
				userBean.fillFromConfig(details);
			} else {
				userBean.fillData(details);
			}
			LFSUtilsAndroid.enterText(getNFKSharepageNameTextBoxTxt(),userBean.getFollowerName());
			LFSUtilsAndroid.enterText(getNFKSharepageEmailidTextBoxTxt(),userBean.getFollowerEmail());
			if(getNFKSharepageAddFollowerNextBtn().isPresent())
			{
				LFSUtilsAndroid.click(getNFKSharepageAddFollowerNextBtn());
			}
			Reporter.logWithScreenShot("User entered follower details", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKSharepageSetFollowerInviteBtn());
			Reporter.logWithScreenShot("User nevigate to share screen", MessageTypes.Pass);
			}
		
		//Author Name-Pradnya,Date-29/6/22
		//Description-Method to click on follower name
		public void userClickFollowerName() {
			try {
			LFSUtilsAndroid.click(getNFKSharepageFollowerNameTxt());
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.swipePage();
			LFSUtilsAndroid.click(getNFKSharepageResentInvitationText());
			Reporter.logWithScreenShot("User sucessfully send the invitation link", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKSharepageFollowerNameTxt());
			Reporter.logWithScreenShot("User sucessfully display follower details", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKMoremenuAddFollowerBackBtn());
			LFSUtilsAndroid.click(getNFKSharepageToggleBtn());
			LFSUtilsAndroid.click(getNFKSharepageToggleBtn());
			Reporter.logWithScreenShot("User sucessfully tap on toggle button", MessageTypes.Pass);
			LFSUtilsAndroid.click(getNFKMoremenuAddFollowerBackBtn());
			LFSUtilsAndroid.turnWifiOff();
			LFSUtilsAndroid.click(getNFKMoremenuShareBtn());
			Reporter.logWithScreenShot("User sucessfully nevigate to share screen", MessageTypes.Pass);
			} catch(Exception e) {
				Reporter.log("User sucessfully nevigate to share screen", MessageTypes.Fail);
			}
			
		}  

	    //Method to verify loading spinner and agp details on email screen
	    public void verifyAGPDetailsOnEmailScreen() {
	    	try {
	    		getNFKSharePageEmailLoadingSpinner().verifyPresent();
	    		LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")));
	    		getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.AGP.emailScreen")).verifyPresent();
	    		Reporter.logWithScreenShot("Successfully verified AGP details on  email screen", MessageTypes.Pass);
	    	}catch(Exception e) {
	    		Reporter.logWithScreenShot("Failed to verify AGP details on  email screen", MessageTypes.Fail);
	    	}
	    }
	    
	    //Method to verify CSV details on email screen
	    public void verifyCSVDetails() {
	    	try {
	    		LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")));
	    		getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.CSV.emailScreen")).verifyPresent();
	    		Reporter.logWithScreenShot("Successfully verified CSV details on  email screen", MessageTypes.Pass);
	    	}catch(Exception e) {
	    		Reporter.logWithScreenShot("Failed to verify CSV details on  email screen", MessageTypes.Fail);
	    	}
	    }
	    
	    //Method to verify low glucose event details on email screen
	    public void lowGlucoseEventEmailScreen() {
	    	try {
	    		getNFKSharePageEmailLoadingSpinner().verifyPresent();
	    		LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")));
	    		getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.low.glucose.event.emailScreen")).verifyPresent();
	    		Reporter.logWithScreenShot("Successfully verified low glucose event email screen", MessageTypes.Pass);
	    	}catch(Exception e) {
	    		Reporter.logWithScreenShot("Failed to verify low glucose event email screen", MessageTypes.Fail);
	    	}
	    }

		//Pradnya
		//Method to click on follower name status as accepted
		public void userClickAcceptedFollowername() {
	    	try {
	    		LFSUtilsAndroid.swipePage();
	    	if(getNFKSharepageSharepageAcceptedFollowerNameBtn().isPresent()) {
	    		LFSUtilsAndroid.click(getNFKSharepageSharepageAcceptedFollowerNameBtn()); 
	        	}
	            LFSUtilsAndroid.swipePage();
	        	LFSUtilsAndroid.swipePage();
	        	LFSUtilsAndroid.click(getNFKSharepageSharepagePauseSharingbtn()); 
	        	Reporter.logWithScreenShot("User sucessfully click on pause sharing button", MessageTypes.Pass);
	        	LFSUtilsAndroid.click(getNFKSharepageAddFollowerBackbtn());
	    	} catch(Exception e) {
	    		Reporter.log("User not able to click on pause sharing button", MessageTypes.Fail);
	    	}
	        	
	    }
		 //Author Name-Pradnya,Date-30/6/22
	    //Description-Method to click on add follower button
	  	public void userClickOnAddFollowerButton() {
	  		LFSUtilsAndroid.click(getNFKSharepageAddFollowerBackbtn());
	  		LFSUtilsAndroid.click(getNFKSharepageToggleBtn());
	  		LFSUtilsAndroid.click(getNFKSharepageToggleBtn());
	  		LFSUtilsIOS.click(getNFKsharepageAddFollowerBtn());
	  		LFSUtilsIOS.click(getNFKsharepageAddFollowerBtn());
	  		LFSUtilsIOS.click(getNFKMoremenuAddFollowerBackBtn());
	  		LFSUtilsIOS lfsUtilsIOS = new LFSUtilsIOS();
			lfsUtilsIOS.turnOffWiFi();
	  		LFSUtilsIOS.click(getNFKMoremenuShareBtn());
	  		Reporter.logWithScreenShot("User sucessfully nevigate to share screen", MessageTypes.Pass);
	  		
	  	}
		 public void userClickPausedFollowerName(String details) {
		    	
		    	UserDetailBeans userBean = new UserDetailBeans();
				if (details instanceof String) {
					userBean.fillFromConfig(details);
				} else {
					userBean.fillData(details);
				}
		    	try {
		        LFSUtilsAndroid.click(getNFKSharepagePauseFollowerNametxt()); 
		    	Reporter.logWithScreenShot("User sucessfully nevigate to follower setting screen", MessageTypes.Pass);
		    	LFSUtilsAndroid.scrollDown();
		    	LFSUtilsAndroid.click(getNFKSharepageSharepageResumeSharingBtn());
		    	LFSUtilsAndroid.scrollUp();;
		    	LFSUtilsAndroid.click(getNFKSharepageSharePageFollowernametxt());
		    	LFSUtilsAndroid.enterText(getNFKSharepageSharePageFollowernametxt(),userBean.getFollowerName1());
		    	LFSUtilsAndroid.hideKeyboard();
		    	LFSUtilsAndroid.scrollDown();;
		        LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerTxt());
		    	LFSUtilsAndroid.click(getNFKSharepageRemoveFollowerCancelbtn()); 
		    	LFSUtilsAndroid.scrollUp();
		    	LFSUtilsAndroid.click(getNFKSharepageFollowerSettingSavetxt());
		    	Reporter.logWithScreenShot("User able to click on save button", MessageTypes.Pass);
		    	}catch(Exception e) {
		    		Reporter.log("User not able to click on save button", MessageTypes.Fail);
		    	}
		    	
		    }

		 //Pradnya
		 //Method to click on sharing toggle button
		 public void userTurnOffSharingToggleButton() {
			 try{
		    	LFSUtilsAndroid.click(getNFKSharepageTogglebtn());
		    	LFSUtilsAndroid.click(getNFKSharepageTogglebtn());
			    Reporter.logWithScreenShot("User sucessfully tap on toggle button", MessageTypes.Pass);
				LFSUtilsAndroid.click(getNFKSharepageBackBtn());
				LFSUtilsAndroid.turnWifiOff();
			 }catch(Exception e)
			 {
				 Reporter.logWithScreenShot("User not able to tap on toggle button", MessageTypes.Pass);
			 }
		    }
		    
		    //Method to verify AGP email section on share screen
		    public void verifyAGPEmailSection() {
		    	try {
		    		LFSUtilsAndroid.waitforLoad();
		    		LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")));
		    		LFSUtilsAndroid.waitforLoad();
		    		LFSUtilsAndroid.hideKeyboard();
		    		getNFKSharePageEmailSendBtn().verifyPresent();
		    		getNFKSharePageEmailfromLabel().verifyPresent();
		    		getNFKSharePageEmailToField().verifyPresent();
		    		getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.AGP.emailScreen")).verifyPresent();
		    		Reporter.logWithScreenShot("Successfully verified AGP email screen", MessageTypes.Pass);
		    	}catch(Exception e) {
		    		Reporter.logWithScreenShot("Failed to verify AGP email screen", MessageTypes.Fail);
		    	}
		    }
		   
		    //Method to verify pdf report attached to mail
		    public void verifyPDFReportAttachedToMail() {
		    	try {
		    		LFSUtilsAndroid.swipePage();
		    		LFSUtilsAndroid.swipePage();
		    		getNFKSharePageEmailPdf().verifyPresent();
		    		Reporter.logWithScreenShot("PDF is attched to mail", MessageTypes.Pass);
		    	}catch (Exception e) {
		    		Reporter.logWithScreenShot("PDF is not attched to mail", MessageTypes.Fail);
		    	}
		    }
			
			// Method to select time period
			public void selectTimePeriod(String days) {
				try {
					LFSUtilsAndroid.waitforLoad();
					switch (days) {
					case "7":
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriod());
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriodDays().get(0));
						break;
					case "14":
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriod());
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriodDays().get(1));
						break;
					case "30":
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriod());
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriodDays().get(2));
						break;
					case "60":
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriod());
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriodDays().get(3));
						break;
					case "90":
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriod());
						LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventTimePeriodDays().get(4));
						break;
					}
					Reporter.logWithScreenShot("Successfully selected time period", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to select time period", MessageTypes.Fail);
				}
			}
			
			// Method to verify email section on low glucose event screen
			public void verifyEmailSectionOnLowGlucoseEventScreen() {
				try {
		    		getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")).waitForPresent(300000);
		    		LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")));
		    		LFSUtilsAndroid.waitforLoad();
		    		LFSUtilsAndroid.hideKeyboard();
					getNFKSharePageEmailSendBtn().verifyPresent();
					getNFKSharePageEmailToField().verifyPresent();
					getNFKSharePageEmailfromLabel().verifyPresent();
					getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.low.glucose.event.emailScreen")).verifyPresent();
					getNFKSharePageEmailMessage().verifyPresent();
					Reporter.logWithScreenShot("Successfully verified email section on LGE screen", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to verify  email section on LGE screen", MessageTypes.Fail);
				}
			}
			
			// Method to send an email of low glucose event
			public void sendAnEmail() {
				try {
					LFSUtilsAndroid.enterText(getNFKSharePageEmailToField(), LFSUtilsAndroid.getPropString("sharePage.mailId"));
					LFSUtilsAndroid.click(getNFKSharePageEmailSendBtn());
					Reporter.logWithScreenShot("Successfully send an email", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to send an email", MessageTypes.Fail);
				}
			}
			
			// Method to verify request unsuccessful popup
			public void verifyRequestUnsuccessfulPopup() {
				try {
					getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("requestUnsuccessful.popup")).verifyPresent();
					LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("appCommon.ok")));
					Reporter.logWithScreenShot("Successfully verified request unsuccessful popup", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to verify request unsuccessful popup", MessageTypes.Fail);
				}
			}
			
			//Method to click on back button on mail and navigate to rt app
			public void clickOnBackButtonOnMail() {
				try {
					getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")).waitForPresent(300000);
					LFSUtilsAndroid.click(getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("sharePage.gmail.option")));
					LFSUtilsAndroid.waitforLoad();
					LFSUtilsAndroid.clickBackButton();
					androidDriver.launchApp();
					Reporter.logWithScreenShot("Successfully clicked on back button on email screen", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to click on back button on email screen", MessageTypes.Fail);
				}
			}
			// Method to click on options present on share screen
			public void clickOnOptionsPresentOnShareScreen(String option) {
				try {
					LFSUtilsAndroid.waitforLoad();
					switch (option) {
					case "Email":
						LFSUtilsAndroid.click(getNFKSharepageShareReportPageEmailReportBtn());
						break;
					case "Print":
						LFSUtilsAndroid.click(getNFKSharePageShareeReportPagePrintReportBtn());
						break;
					case "OpenIn":
						LFSUtilsAndroid.click(getNFKSharepageSharereportpageOpeninreportBtn());
						break;
					}
					Reporter.logWithScreenShot("Successfully clicked on options present on low glucose event screen",
							MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to click on options present on low glucose event screen",
							MessageTypes.Fail);
				}
			}
			// Method to verify print section on low glucose event screen
			public void verifyPrintSectionOnLowGlucoseEventScreen() {
				try {
					getNFKSharepageStaticlabel(
							LFSUtilsAndroid.getPropString("sharePage.lowGlucoseEvent.printSection.noOfCopies"))
							.waitForPresent(120000);
					if (getNFKSharepageStaticlabel(
							LFSUtilsAndroid.getPropString("sharePage.lowGlucoseEvent.printSection.noOfCopies")).isPresent()) {
						Reporter.logWithScreenShot("Copy text is present", MessageTypes.Pass);
					}
					if (getNFKSharepageStaticlabel(
							LFSUtilsAndroid.getPropString("sharePage.lowGlucoseEvent.printSection.paperSize")).isPresent()) {
						Reporter.logWithScreenShot("paper size text is present", MessageTypes.Pass);
					}
					getNFKSharePageLowGlucoseEventPrintSectionPagePreview().verifyPresent();
					getNFKSharePageLowGlucoseEventPrintSectionPrintButton().verifyPresent();
					LFSUtilsAndroid.click(getNFKSharePageLowGlucoseEventPrintSectionPrinterSelectionDropDown());
					getNFKSharepageLowGlucoseEventPrintSectionPrinterOption().verifyPresent();
					LFSUtilsAndroid.click(getNFKSharepageLowGlucoseEventPrintSectionPrinterOption());
					LFSUtilsAndroid.clickBackButton();
					Reporter.logWithScreenShot("Successfully verified print section on low glucose event screen",
							MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to verify print section on low glucose event screen",
							MessageTypes.Fail);
				}
			}
			
			// Method to click on cancel button and navigate to low glucose event screen
			public void clickOnCancelButtonAndNavToLGEScreen() {
				try {
					getNFKSharepageStaticlabel(
							LFSUtilsAndroid.getPropString("sharePage.lowGlucoseEvent.printSection.noOfCopies"))
							.waitForPresent(120000);
					LFSUtilsAndroid.clickBackButton();
					getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("share.low.events")).verifyPresent();
					Reporter.logWithScreenShot("Successfully clicked on cancel button and navigate to LGE screen",
							MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to click on cancel button and navigate to LGE screen",
							MessageTypes.Fail);
				}
			}
			// Method to click on low glucose event screen back button nav to share screen
			public void clickOnBackButtonOnLGEAndNavToShareScreen() {
				try {
					LFSUtilsAndroid.clickBackButton();
					getNFKSharepageStaticlabel(LFSUtilsAndroid.getPropString("share.low.events")).verifyPresent();
					Reporter.logWithScreenShot("Successfully clicked on back button and navigate to share screen",
							MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("Failed to click on back button and navigate to share screen",
							MessageTypes.Fail);
				}
			}

}