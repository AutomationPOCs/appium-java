package com.NFK.version1.android.pages;


import org.openqa.selenium.By;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;


public class SensorPairPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage>{
	@FindBy(locator="NFK.Sensorpairpage.StartPairingPage.Allowusingapp.btn")
	private QAFWebElement NFKSensorpairpageStartPairingPageAllowusingappbtn;    
	public QAFWebElement getNFKSensorpairpageStartPairingPageAllowusingappbtn()
	{
		return NFKSensorpairpageStartPairingPageAllowusingappbtn;
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		
	}
	@FindBy(locator = "NFK.applysensor.skip.btn")
	private QAFWebElement NFKApplysensorSkipBtn;
	@FindBy(locator = "NFK.homescreen.pairsensor.btn")
	private QAFWebElement NFKHomescreenPairsensorBtn;
	
	
	@FindBy(locator="NFK.sensorpairpage.title")
	private QAFWebElement NFKsensorpairpagetitle;
	@FindBy(locator="NFK.sensorpairpage.sensorpairpage.sensor.skip.btn")
	private QAFWebElement NFKSensorpairpageSensorpairpageSensorSkipBtn; 
	@FindBy(locator="NFK.sensorpairpage.code.field")
	private QAFWebElement NFKSensorpairpageCodeField ;
	@FindBy(locator="NFK.sensorpairpage.next.button")
	private QAFWebElement NFKSensorpairpageNextButton ;
	@FindBy(locator="NFK.sensorpairpage.applysensor.title")
	private QAFWebElement NFKSensorpairpageApplysensorTitle;
	@FindBy(locator="NFK.sensorpairpage.applysensor.next.button")
	private QAFWebElement NFKSensorpairpageApplysensorNextButton;
	@FindBy(locator="NFK.sensorpairpage.applysensor.rightabdomen.btn")
	private QAFWebElement NFKSensorpairpageApplysensorRightabdomenBtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.leftabdomen.btn")
	private QAFWebElement NFKSensorpairpageApplysensorLeftabdomenBtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.leftarm.btn")
	private QAFWebElement NFKSensorpairpageApplysensorLeftarmBtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.rightarm.btn")
	private QAFWebElement NFKSensorpairpageApplysensorRightarmBtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.howtoapply.btn")
	private QAFWebElement NFKSensorpairpageApplysensorHowtoapplyBtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.footer.lbl")
	private QAFWebElement NFKSensorpairpageApplysensorFooterLbl;
	@FindBy(locator="NFK.sensorpairpage.start.session.btn")
	private QAFWebElement NFKSensorpairpageStartSessionBtn;
	@FindBy(locator="NFK.apply.sensor.scrn.back.btn")
	private QAFWebElement NFKApplysensorbackbtn;
	@FindBy(locator="NFK.apply.sensor.title")
	private QAFWebElement NFKApplysensorTitle;
	@FindBy(locator="NFK.apply.sensor.text1")
	private QAFWebElement NFKApplysensorText1;
	@FindBy(locator="NFK.apply.sensor.how.to.apply.sensor.link")
	private QAFWebElement NFKApplysensorHowtoapplysensorlink;
	@FindBy(locator="NFK.apply.sensor.text2")
	private QAFWebElement NFKApplysensorText2;
	@FindBy(locator="NFK.how.to.apply.sensor.scrn.back.btn")
	private QAFWebElement NFKhowtoapplysenorbackbtn;
	@FindBy(locator="NFK.how.to.apply.sensor.title")
	private QAFWebElement NFKhowtoapplysensorTitle;
	@FindBy(locator="NFK.how.to.apply.sensor.pair.btn")
	private QAFWebElement NFKhowtoapplysensorpairbtn;
	@FindBy(locator="NFK.how.to.apply.sensor.helpful.tips.link")
	private QAFWebElement NFKhowtoapplysensorhelpfultiplink;
	@FindBy(locator="NFK.how.to.apply.sensor.helpful.tips.scrn.title")
	private QAFWebElement NFKhowtoapplysensorhelpfultiplinktitle;
	@FindBy(locator="NFK.how.to.apply.sensor.helpful.tips.scrn.X.btn")
	private QAFWebElement NFKhowtoapplysensorhelpfultiplinkXbtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.leftbuttock.btn")
	private QAFWebElement NFKSensorpairpageApplysensorleftbuttockBtn;
	@FindBy(locator="NFK.sensorpairpage.applysensor.rightbuttock.btn")
	private QAFWebElement getNFKSensorpairpageApplysensorRightbuttockBtn;
    @FindBy(locator="NFK.location.deny.btn")
    private QAFWebElement NFKLocationDenyBtn;
    @FindBy(locator="NFK.location.allow.btn")
    private QAFWebElement NFKLocationAllowBtn;
    @FindBy(locator="NFK.location.message.txt")
    private QAFWebElement NFKLocationMessageTxt;
    @FindBy(locator="NFK.location.permission.icon")
    private QAFWebElement NFKLocationPermissionIcon;
	@FindBy(locator="NFK.sensorpairpage.applysensor.next.btn")
	private QAFWebElement NFKSensorpairpageApplysensorNextBtn;
	@FindBy(locator="NFK.sensorpairpage.sensorPair.cancel.btn")
	private QAFWebElement NFKSensorpairpageSensorPairCancelBtn;   
	@FindBy(locator="NFK.sensorpairpage.sensorPair.tryAgain.btn")
	private QAFWebElement NFKSensorpairpageSensorPairTryAgainBtn;
	@FindBy(locator="NFK.sensorpairpage.sensorWarmUp.title")
	private QAFWebElement NFKSensorpairpageSensorWarmUpTitle; 
	@FindBy(locator="NFK.sensorpairpage.sensorWarmUp.ok.btn")
	private QAFWebElement NFKSensorpairpageSensorWarmUpOkBtn; 
	@FindBy(locator="NFK.sensorPairPage.lowGlucoseAlert.popup")
	private QAFWebElement NFKSensorPairPageLowGlucoseAlertPopup; 
	public QAFWebElement getNFKSensorPairPageLowGlucoseAlertPopup()
	{
		return NFKSensorPairPageLowGlucoseAlertPopup;
	}
	
	public QAFWebElement getNFKSensorpairpageSensorWarmUpOkBtn()
	{
		return NFKSensorpairpageSensorWarmUpOkBtn;
	}
	public QAFWebElement getNFKSensorpairpageSensorWarmUpTitle()
	{
		return NFKSensorpairpageSensorWarmUpTitle;
	}
	public QAFWebElement getNFKSensorpairpageSensorPairTryAgainBtn()     
	{
		return NFKSensorpairpageSensorPairTryAgainBtn;
	}
	public QAFWebElement getNFKSensorpairpageSensorPairCancelBtn()     
	{
		return NFKSensorpairpageSensorPairCancelBtn;
	}
	
	public QAFWebElement getNFKApplysensorSkipBtn() {
		return NFKApplysensorSkipBtn;
	}
	
	public QAFWebElement getNFKHomescreenPairsensorBtn() {
		return NFKHomescreenPairsensorBtn;
	}
	
	
	
	
	public QAFWebElement getNFKSensorpairpageApplysensorNextBtn()
	{
		return NFKSensorpairpageApplysensorNextBtn;
	}
    public QAFWebElement getNFKLocationDenyBtn() {
    	return NFKLocationDenyBtn;
    }
    public QAFWebElement getNFKLocationAllowBtn() {
    	return NFKLocationAllowBtn;
    }
    public QAFWebElement getNFKLocationMessageTxt() {
    	return NFKLocationMessageTxt;
    }
    public QAFWebElement getNFKLocationPermissionIcon() {
    	return NFKLocationPermissionIcon;
    }
	public QAFWebElement getNFKSensorpairpageApplysensorRightbuttockBtn() {
		return getNFKSensorpairpageApplysensorRightbuttockBtn;
	 }
	
	
	 public QAFWebElement getNFKsensorpairpagetitle() {
		return NFKsensorpairpagetitle;
	 }
	 public QAFWebElement getNFKSensorpairpageSensorpairpageSensorSkipBtn() {
		return NFKSensorpairpageSensorpairpageSensorSkipBtn;
	  }
	  public QAFWebElement getNFKSensorpairpageCodeField() {
		return NFKSensorpairpageCodeField;
	  }
	  public QAFWebElement getNFKSensorpairpageStartSessionBtn()
	  {
		  return NFKSensorpairpageStartSessionBtn;
	  }
	  public QAFWebElement getNFKSensorpairpageNextButton() {
		return NFKSensorpairpageNextButton;
	  }
	  public QAFWebElement getNFKSensorpairpageApplysensorRightabdomenBtn() {
		 return NFKSensorpairpageApplysensorRightabdomenBtn;
	  }
	  public QAFWebElement getNFKSensorpairpageApplysensorLeftabdomenBtn() {
		 return NFKSensorpairpageApplysensorLeftabdomenBtn;
	  }
	  public QAFWebElement getNFKSensorpairpageApplysensorLeftarmBtn() {
		 return NFKSensorpairpageApplysensorLeftarmBtn;
	  }
	  public QAFWebElement getNFKSensorpairpageApplysensorRightarmBtn() {
		return NFKSensorpairpageApplysensorRightarmBtn;
	  }
	   public QAFWebElement getNFKSensorpairpageApplysensorHowtoapplyBtn() {
		 return NFKSensorpairpageApplysensorHowtoapplyBtn;
	  }
	  public QAFWebElement getNFKSensorpairpageApplysensorFooterLbl() {
		  return NFKSensorpairpageApplysensorFooterLbl;
	  }
	
	 public QAFWebElement getNFKSensorpairpageApplysensorTitle() {
		 return NFKSensorpairpageApplysensorTitle;
	 }
	 public QAFWebElement getNFKSensorpairpageApplysensorNextButton() {
		 return NFKSensorpairpageApplysensorNextButton;
	 }
	public QAFWebElement getNFKSensorpairpageApplysensorleftbuttockBtn() {
			return NFKSensorpairpageApplysensorleftbuttockBtn;
		 }

	public QAFWebElement getNFKhowtoapplysensorhelpfultiplinkXbtn() {
		return NFKhowtoapplysensorhelpfultiplinkXbtn;
	 }
	public QAFWebElement getNFKhowtoapplysensorhelpfultiplinktitle() {
		return NFKhowtoapplysensorhelpfultiplinktitle;
	 }
	public QAFWebElement getNFKhowtoapplysensorhelpfultiplink() {
		return NFKhowtoapplysensorhelpfultiplink;
	 }
	public QAFWebElement getNFKhowtoapplysensorpairbtn() {
		return NFKhowtoapplysensorpairbtn;
	 }
	public QAFWebElement getNFKhowtoapplysensorTitle() {
		return NFKhowtoapplysensorTitle;
	 }
	public QAFWebElement getNFKhowtoapplysenorbackbtn() {
		return NFKhowtoapplysenorbackbtn;
	 }
	public QAFWebElement getNFKApplysensorText2() {
		return NFKApplysensorText2;
	 }
	public QAFWebElement getNFKApplysensorHowtoapplysensorlink() {
		return NFKApplysensorHowtoapplysensorlink;
	 }
	public QAFWebElement getNFKApplysensorText1() {
		return NFKApplysensorText1;
	 }
	public QAFWebElement getNFKApplysensorTitle() {
		return NFKApplysensorTitle;
	 }
	public QAFWebElement getNFKApplysensorbackbtn() {
		return NFKApplysensorbackbtn;
	 }
	@FindBy(locator = "NFK.sensorpairpage.OK.btn")
	private QAFWebElement NFKSensorpairpageOKBtn;
	

	public QAFWebElement getNFKSensorpairpageOKBtn() {
		return NFKSensorpairpageOKBtn;
	}
	//Nearby Device popup locators
	@FindBy(locator="NFK.nearbydevice.permission.msg")
	private QAFWebElement NFKNearbydevicePermissionMsg; 
	@FindBy(locator="NFK.nearbydevice.allow.btn")
	private QAFWebElement NFKNearbydeviceAllowBtn; 
	@FindBy(locator="NFK.nearbydevice.deny.btn")
	private QAFWebElement NFKNearbydeviceDenyBtn; 
	@FindBy(locator="NFK.nearbydevice.title.txt")
	private QAFWebElement NFKNearbydeviceTitleTxt; 
	@FindBy(locator="NFK.nearbydevice.desc.txt")
	private QAFWebElement NFKNearbydeviceDescTxt; 
	@FindBy(locator="NFK.nearbydevice.apppermission.btn")
	private QAFWebElement NFKNearbydeviceApppermissionBtn; 
	@FindBy(locator="NFK.nearbydevice.settings.permission.txt")
	private QAFWebElement NFKNearbydeviceSettingsPermissionTxt; 
	@FindBy(locator="NFK.nearbydevice.settings.nearby.txt")
	private QAFWebElement NFKNearbydeviceSettingsNearbyTxt; 
	@FindBy(locator="NFK.nearbydevice.settings.allow.btn")
	private QAFWebElement NFKNearbydeviceSettingsAllowBtn; 
	
	@FindBy(locator = "NFK.sensorpairpage.reading")
	private QAFWebElement NFKSensorpairpageReading;
	@FindBy(locator = "NFK.sensorpairpage.unPairSensor.title")
	private QAFWebElement NFKSensorpairpageUnPairSensorTitle;
	@FindBy(locator = "NFK.sensorpairpage.unPairSensor.popup")
	private QAFWebElement NFKSensorpairpageUnPairSensorPopup;
	
	
	public QAFWebElement getNFKSensorpairpageReading() {
		return NFKSensorpairpageReading;
	}
	public QAFWebElement getNFKNearbydevicePermissionMsg() {
		return NFKNearbydevicePermissionMsg;
	 }
	public QAFWebElement getNFKNearbydeviceAllowBtn() {
		return NFKNearbydeviceAllowBtn;
	 }
	public QAFWebElement getNFKNearbydeviceDenyBtn() {
		return NFKNearbydeviceDenyBtn;
	 }
	public QAFWebElement getNFKNearbydeviceTitleTxt() {
		return NFKNearbydeviceTitleTxt;
	 }
	public QAFWebElement getNFKNearbydeviceDescTxt() {
		return NFKNearbydeviceDescTxt;
	 }
	public QAFWebElement getNFKNearbydeviceApppermissionBtn() {
		return NFKNearbydeviceApppermissionBtn;
	 }
	public QAFWebElement getNFKNearbydeviceSettingsPermissionTxt() {
		return NFKNearbydeviceSettingsPermissionTxt;
	 }
	public QAFWebElement getNFKNearbydeviceSettingsNearbyTxt() {
		return NFKNearbydeviceSettingsNearbyTxt;
	 }
	public QAFWebElement getNFKNearbydeviceSettingsAllowBtn() {
		return NFKNearbydeviceSettingsAllowBtn;
	 }
	public QAFWebElement getNFKSensorpairpageUnPairSensorTitle() {
		return NFKSensorpairpageUnPairSensorTitle;
	}
	public QAFWebElement getNFKSensorpairpageUnPairSensorPopup() {
		return NFKSensorpairpageUnPairSensorPopup;
	}
	
	
	 HomePageAndroid homebtn= new HomePageAndroid();
	 
		public void entersensorCode() {
			LFSUtilsAndroid.waitforLoad();
		    	getNFKsensorpairpagetitle().isDisplayed();
			    	  getNFKSensorpairpageCodeField().assertPresent("Code field");
			    	  LFSUtilsAndroid.waitforLoad();
			     	  getNFKSensorpairpageCodeField().click();
			    	  getNFKSensorpairpageCodeField().sendKeys("123456789");
			    	
			    	if(getNFKSensorpairpageNextButton().isEnabled())
			    	  getNFKSensorpairpageNextButton().click();
			    	else
			    	{
			    		getNFKSensorpairpageNextButton().waitForEnabled(200);
			    	    getNFKSensorpairpageNextButton().click();
			    	}
			    	Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
			  	
		}

		public void selectbodyLocation(String location) {
			System.out.println("Selecttt body loc" +location);
			getNFKSensorpairpageApplysensorTitle().waitForPresent();
			getNFKSensorpairpageApplysensorTitle().isPresent();
			switch(location) {
			case "LEFTABDOMEN":
			  getNFKSensorpairpageApplysensorLeftabdomenBtn().waitForPresent();
			  getNFKSensorpairpageApplysensorLeftabdomenBtn().click();
			break;
			
			case "RIGHTABDOMEN":			
			 getNFKSensorpairpageApplysensorRightabdomenBtn().waitForPresent();
			 getNFKSensorpairpageApplysensorRightabdomenBtn().click();
			break;
			
			case "LEFTARM":
			 getNFKSensorpairpageApplysensorLeftarmBtn().waitForPresent();
			 getNFKSensorpairpageApplysensorLeftarmBtn().click();
			break;
			
			case "RIGHTARM":
			 getNFKSensorpairpageApplysensorRightarmBtn().waitForPresent();
			 getNFKSensorpairpageApplysensorRightarmBtn().click();
			break;
			
			case "LEFTBUTTOCK":
				 getNFKSensorpairpageApplysensorleftbuttockBtn().waitForPresent();
				 getNFKSensorpairpageApplysensorleftbuttockBtn().click();
				break;
			
			case "RIGHTBUTTOCK":
				 getNFKSensorpairpageApplysensorRightbuttockBtn().waitForPresent();
				 getNFKSensorpairpageApplysensorRightbuttockBtn().click();
				break;
			}
			Reporter.logWithScreenShot("The user selected the body location ", MessageTypes.Pass);
			SignupPageAndroid sign= new SignupPageAndroid();
			sign.getNFKSignuppageTimeStaticText("Next").click();
		}

		public void connectingtoSensor() {
			
			try {
				//wait until sensor connects
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			homebtn.getNFKHomepageHomeBtn().waitForVisible(1000);
			
		}
		public void selectSensorSession() {
			getNFKSensorpairpageStartSessionBtn().isPresent();
			getNFKSensorpairpageStartSessionBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("User has selected the Start Session",MessageTypes.Pass);
		}
		public void clickEditText() {
			
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//getNFKSensorpairpageCodeField().assertPresent("Code field");
			getNFKsensorpairpagetitle().isPresent();
			getNFKSensorpairpageCodeField().click();
		}
		
		//Verfiy apply sesnsor screen
		
			public void verifyapplysensor() 
			{
		    	getNFKApplysensorbackbtn().isPresent();
		    	getNFKApplysensorTitle().isDisplayed();
		    	getNFKApplysensorText1().isPresent();
		    	getNFKSensorpairpageApplysensorRightabdomenBtn().assertPresent("RightAbdomen");
		    	getNFKSensorpairpageApplysensorLeftabdomenBtn().assertPresent("leftAbdomen");
		    	getNFKSensorpairpageApplysensorRightarmBtn().assertPresent("rightarm");
		    	getNFKSensorpairpageApplysensorLeftarmBtn().assertPresent("Leftarm");;
		    	getNFKApplysensorHowtoapplysensorlink().assertPresent("How to Apply Sensor Link");
		    	getNFKApplysensorText2().assertPresent();
		    	LFSUtilsAndroid.waitforLoad();
		    	Reporter.logWithScreenShot("Apply Sensor screen", MessageTypes.Pass);
		    }
			
			//Verfiy how to apply sensor link screen
			
			public void verifyhowtoapplysensorlink() 
			{
		    	getNFKApplysensorHowtoapplysensorlink().click();
		    	getNFKhowtoapplysenorbackbtn().isPresent();
		    	getNFKhowtoapplysensorTitle().isDisplayed();
		    	getNFKhowtoapplysensorpairbtn().isPresent();
		    	Reporter.logWithScreenShot("How to apply senor screen with images1", MessageTypes.Pass);
		    	LFSUtilsAndroid.waitforLoad();
		    	Reporter.logWithScreenShot("How to apply senor screen with images2", MessageTypes.Pass);
		    	getNFKhowtoapplysensorhelpfultiplink().isPresent();
		    	LFSUtilsAndroid.waitforLoad();
		    }
			
			
			public void verifyhelpfultipslink() 
			{
		    	getNFKhowtoapplysensorhelpfultiplink().click();
		    	Reporter.logWithScreenShot("HelpFul tips screen", MessageTypes.Pass);
		    	getNFKhowtoapplysensorhelpfultiplinktitle().isPresent();
		    	getNFKhowtoapplysensorhelpfultiplinkXbtn().isPresent();
		    	getNFKhowtoapplysensorhelpfultiplinkXbtn().isEnabled();
		    	getNFKhowtoapplysensorhelpfultiplinkXbtn().click();
		    	LFSUtilsAndroid.waitforLoad();
		    	getNFKhowtoapplysenorbackbtn().click();
		    	Reporter.logWithScreenShot("User is on apply sensor screen", MessageTypes.Pass);
		    	LFSUtilsAndroid.waitforLoad();
		    }
			
			
			
			public void verifyapplysensor2to6yrold() 
			{
		    	getNFKApplysensorbackbtn().isPresent();
		    	getNFKApplysensorTitle().isDisplayed();
		    	getNFKApplysensorText1().isPresent();
		    	getNFKSensorpairpageApplysensorleftbuttockBtn().assertPresent("Rightbuttock");
		    	getNFKSensorpairpageApplysensorRightbuttockBtn().assertPresent("leftbuttock");
		    	getNFKApplysensorHowtoapplysensorlink().assertPresent("");
		    	getNFKApplysensorText2().assertPresent();
		    	LFSUtilsAndroid.waitforLoad();
		    	Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
		    }

			public void checkLocationAccessPOpup() throws InterruptedException {
				SignupPageAndroid sign= new SignupPageAndroid();
				LFSUtilsAndroid.waitforLoad();	
				LFSUtilsAndroid.findText("Don't Allow");
				LFSUtilsAndroid.findText("Allow");
				sign.getNFKSignuppageTimeStaticText("Allow").click();
			LFSUtilsAndroid.waitforLoad();	
			Reporter.logWithScreenShot("After click on Allow Popup",MessageTypes.Pass);
	
			}
			SignupPageAndroid sign= new SignupPageAndroid();
			public void verifyNearbyDevicePopup() {
				
			
				sign.getNFKSignuppageTimeStaticText("Next").click();
				System.out.println("clicked nexxtttt");
				LFSUtilsAndroid.waitforLoad();	
				LFSUtilsAndroid.findText("Don't allow");
				LFSUtilsAndroid.findText("Allow");
				driver.findElementByXPath("//*[starts-with(@text,'Don')]").click();
				
			LFSUtilsAndroid.waitforLoad();	
			Reporter.logWithScreenShot("After click on Don't Allow Popup",MessageTypes.Pass);
				
			}
			public void enableAccess() {
				sign.getNFKSignuppageTimeStaticText("App Permissions").click();
				getNFKNearbydeviceSettingsPermissionTxt().waitForPresent();
				getNFKNearbydeviceSettingsPermissionTxt().click();
				Reporter.logWithScreenShot("User is on Device Setting permission screen",MessageTypes.Pass);
				getNFKNearbydeviceSettingsNearbyTxt().click();
				getNFKNearbydeviceSettingsAllowBtn().click();
				Reporter.logWithScreenShot("User has clicked on Allow option for Near by devices", MessageTypes.Pass);
				LFSUtilsAndroid.clickBackButton();
				LFSUtilsAndroid.clickBackButton();
				LFSUtilsAndroid.clickBackButton();
				
			}
			public void selectsNextButtonStartPairing() {
				getNFKSensorpairpageApplysensorNextButton().click();
				if(sign.getNFKSignuppageTimeStaticText("CONTINUE").isPresent()) {
				sign.getNFKSignuppageTimeStaticText("CONTINUE").click();
				}
				LFSUtilsAndroid.clickWithText("While using the app");	
			}
			public void verifyLowAlertAndAcknowledge() {
				try {
					sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").waitForPresent(300000);
					if (sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").isDisplayed()) {
						sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").verifyPresent("Low Glucose Alert title");
						getNFKSensorpairpageOKBtn().verifyPresent("Low Glucose alert OK Button");
						getNFKSensorpairpageOKBtn().click();
						Reporter.logWithScreenShot("Successfully verified Urgent Low Glucose alert and closed it",
								MessageTypes.Pass);
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Low Glucose alert not displayed", MessageTypes.Pass);
				}
			}
			public void verifySensorReadingOnHomeScreen() {
				try {
					getNFKSensorpairpageReading().waitForPresent(250000);
					getNFKSensorpairpageReading().verifyPresent();
					Reporter.logWithScreenShot("In Range Reading displayed successfully on homescreen", MessageTypes.Pass);
				} catch (Exception e) {
					Reporter.logWithScreenShot("In range Glucose not displayed", MessageTypes.Pass);
				}
			}
			public void verifyHighAlertAndAcknowledge() {
				try {
					sign.getNFKSignuppageTimeStaticText("High Glucose Alert").waitForPresent(320000);
					if (sign.getNFKSignuppageTimeStaticText("High Glucose Alert").isDisplayed()) {
						sign.getNFKSignuppageTimeStaticText("High Glucose Alert").verifyPresent("High Glucose Alert title");
						getNFKSensorpairpageOKBtn().verifyPresent("High Glucose alert OK Button");
						getNFKSensorpairpageOKBtn().click();
						Reporter.logWithScreenShot("Successfully verified High Glucose alert and closed it", MessageTypes.Pass);
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("UrgentHigh Glucose alert not displayed", MessageTypes.Pass);
				}
			}
			//Auther-Pradnya
			//Description-Method to click on cancel button of sensor page
			public void userClicksOnCancelButton() {
				if(getNFKSensorpairpageSensorPairCancelBtn().isPresent()) {
					LFSUtilsAndroid.click(getNFKSensorpairpageSensorPairCancelBtn());
					Reporter.logWithScreenShot("User able to click cancel button", MessageTypes.Pass);
				}
				
			}
			public void userClicksOnTryagainButton() {
				try {
				LFSUtilsAndroid.click(getNFKSensorpairpageSensorPairTryAgainBtn());
				Reporter.logWithScreenShot("User able to click tryagain button", MessageTypes.Pass);
			        }catch(Exception e) {
			        	Reporter.logWithScreenShot("User not able to click tryagain button", MessageTypes.Pass);
			        }
			}
			//Auther-Pradnya
			//Description- Method to close sensor warmup alert 
			public void userClosesSensorWarmupAlert() {
				try {
					if (getNFKSensorpairpageSensorWarmUpTitle().getText().contains("Sensor Warming Up")) {
						getNFKSensorpairpageSensorWarmUpOkBtn().isPresent();
						LFSUtilsAndroid.click(getNFKSensorpairpageSensorWarmUpOkBtn());
						Reporter.logWithScreenShot("Closed sensor warm up popup", MessageTypes.Pass);
						
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Sensor warm up popup not displayed", MessageTypes.Fail);
				}
			}
			//Auther-Pradnya
			//Description-Method to verify alert on push notification
			public void verifyAlertOnPushNotification(String notification) {
			switch (notification) {
			case "High Glucose Alert":
				try {
					sign.getNFKSignuppageTimeStaticText("High Glucose Alert").waitForPresent(720000);
					if (sign.getNFKSignuppageTimeStaticText("High Glucose Alert").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see High Glucose Alert Notification", MessageTypes.Pass);
						LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("High Glucose Alert"));
						LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@text='OK']")));
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see High Glucose Alert Notification", MessageTypes.Fail);
				}
				break;
			case "Sensor Expiring":
				try {
					sign.getNFKSignuppageTimeStaticText("Sensor Expiring").waitForPresent(720000);
					if (sign.getNFKSignuppageTimeStaticText("Sensor Expiring").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see Sensor Expiration Notification", MessageTypes.Pass);
						LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Sensor Expiring"));
						LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@text='OK']")));
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see Sensor Expiration Notification", MessageTypes.Fail);
				}
				break;
			case "No Readings Alert":
				try {
					sign.getNFKSignuppageTimeStaticText("No Readings Alert").waitForPresent(720000);
					if (sign.getNFKSignuppageTimeStaticText("No Readings Alert").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see No reading Alert Notification", MessageTypes.Pass);
						LFSUtilsAndroid.pause(3000);
						LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("No Readings Alert"));
//						LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@text='OK']")));
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
				}
				break;
			case "Urgent Low Glucose Alarm":
				try {
					sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").waitForPresent(720000);
					if (sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see Urgent Low Glucose Alarm Notification", MessageTypes.Pass);
						LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm"));
						LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@text='OK']")));
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
				}
				break;
			case "Low Glucose Alert":
				try {
					getNFKSensorPairPageLowGlucoseAlertPopup().waitForPresent(720000);
//					sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").waitForPresent(720000);
//					if (sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").isDisplayed()) 
					if(getNFKSensorPairPageLowGlucoseAlertPopup().isDisplayed()){
						Reporter.logWithScreenShot("User able to see low Glucose Alert Notification", MessageTypes.Pass);
						LFSUtilsAndroid.pause(3000);
//						LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Low Glucose Alert"));
						LFSUtilsAndroid.click(getNFKSensorPairPageLowGlucoseAlertPopup());
//						LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@text='OK']")));
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see Low Glucose Alert Notification", MessageTypes.Fail);
				}
				break;
			case "BluetoothOff":
				try {
					sign.getNFKSignuppageTimeStaticText("Bluetooth").waitForPresent(720000);
					if (sign.getNFKSignuppageTimeStaticText("Bluetooth").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see Bluetooth Off Notification", MessageTypes.Pass);
						LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Bluetooth"));
						LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@label='Open']")));
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see Bluetooth Off Notification", MessageTypes.Fail);
				}
				break;
			default:
				break;
			}
			}
			//Auther-Pradnya
			//Description-Method to verify alert on homescreen
			public void VerifyAlertOnHomeScreenWithoutAck(String alert) {
			switch (alert) {
			case "High Glucose Alert":
				try {
					sign.getNFKSignuppageTimeStaticText("High Glucose Alert").waitForPresent(4500000);
					if (sign.getNFKSignuppageTimeStaticText("High Glucose Alert").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see High glucose Aler", MessageTypes.Pass);
					}
					

				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see high glucose Alet", MessageTypes.Fail);
				}
				break;
			case "Low Glucose Alert":
				try {
					sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").waitForPresent(3500000);
					if (sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see Low glucose Alert", MessageTypes.Pass);
					}
					
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see Low glucose Alert", MessageTypes.Fail);
				}
				break;

			case "Urgent Low Glucose Alarm":
				try {
					sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").waitForPresent(200000);
					if (sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see Urgent Low Glucose Sensor Alarm", MessageTypes.Pass);
					}
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to see Urgent Low Glucose Sensor Alarm", MessageTypes.Fail);
				}	break;

			default:
				break;
			}
		}
			public void waitForALerts(String alertType, long time) {
				try {
					sign.getNFKSignuppageTimeStaticText(alertType).waitForPresent(time);	
				} catch (Exception e) {
					Reporter.logWithScreenShot(alertType+" notification not displayed", MessageTypes.Pass);
				}
			}
			//Pradnya
			//Method to verify alert on home screen
			public void VerifyAlertOnHomeScreen(String alertType) {
				switch (alertType) {
				case "High Glucose Alert":
					try {
						sign.getNFKSignuppageTimeStaticText("High Glucose Alert").waitForPresent(4500000);
						if (sign.getNFKSignuppageTimeStaticText("High Glucose Alert").isDisplayed()) {
							LFSUtilsAndroid.clickWithText("OK");
						}
						Reporter.logWithScreenShot("User able to see High glucose readings", MessageTypes.Pass);

					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see high glucose readings", MessageTypes.Fail);
					}
					break;
				case "Low Glucose Alert":
					try {
						sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").waitForPresent(54000);
						if (sign.getNFKSignuppageTimeStaticText("Low Glucose Alert").isDisplayed()) {
							LFSUtilsAndroid.clickWithText("OK");
						}
						Reporter.logWithScreenShot("User able to see Low glucose readings", MessageTypes.Pass);
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see Low glucose readings", MessageTypes.Fail);
					}
					break;

				case "Urgent Low Glucose Alarm":
					try {
						sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").waitForPresent(200000);
						if (sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see Urgent Low Glucose Sensor Alarm", MessageTypes.Pass);
							LFSUtilsAndroid.clickWithText("OK");
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see Urgent Low Glucose Sensor Alarm", MessageTypes.Fail);
					}
					break;

				case "No Readings Alert":
					try {
						sign.getNFKSignuppageTimeStaticText("No Readings Alert").waitForPresent(200000);
						if (sign.getNFKSignuppageTimeStaticText("No Readings Alert").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see No Readings Alert", MessageTypes.Pass);
							LFSUtilsAndroid.clickWithText("OK");
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see No Readings Alert", MessageTypes.Fail);
					}
					break;
				default:
					break;
				}
			}
			//Pradnya
			//Method to verify high sensor reading not displayed
			public void verifyHighSensorReadingNotDisplayed() {
				try {
					sign.getNFKSignuppageTimeStaticText("High Glucose Alert").waitForPresent(4000);
					if (sign.getNFKSignuppageTimeStaticText("High Glucose Alert").isDisplayed()) {
						Reporter.logWithScreenShot("User able to see High glucose Alert", MessageTypes.Fail);
					}

				} catch (Exception e) {
					Reporter.logWithScreenShot("user not able to see High glucose Alert", MessageTypes.Pass);
				}
			}
			//Rushikesh
			//Method to verify push notifications on lock screen without acknowladge
			public void verifyPushNotificationOnLockScreen(String notification) {
				switch (notification) {
				case "High Glucose Alert":
					try {
						sign.getNFKSignuppageTimeStaticText("High Glucose Alert").waitForPresent(720000);
						if (sign.getNFKSignuppageTimeStaticText("High Glucose Alert").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see High Glucose Alert Notification", MessageTypes.Pass);
							LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("High Glucose Alert"));
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see High Glucose Alert Notification", MessageTypes.Fail);
					}
					break;
				case "Sensor Expiring":
					try {
						sign.getNFKSignuppageTimeStaticText("Sensor Expiring").waitForPresent(720000);
						if (sign.getNFKSignuppageTimeStaticText("Sensor Expiring").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see Sensor Expiration Notification", MessageTypes.Pass);
							LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Sensor Expiring"));
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see Sensor Expiration Notification", MessageTypes.Fail);
					}
					break;
				case "No Readings Alert":
					try {
						sign.getNFKSignuppageTimeStaticText("No Readings Alert").waitForPresent(720000);
						if (sign.getNFKSignuppageTimeStaticText("No Readings Alert").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see No reading Alert Notification", MessageTypes.Pass);
							LFSUtilsAndroid.pause(3000);
							LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("No Readings Alert"));
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
					}
					break;
				case "Urgent Low Glucose Alarm":
					try {
						sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").waitForPresent(720000);
						if (sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see Urgent Low Glucose Alarm Notification", MessageTypes.Pass);
							LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Urgent Low Glucose Alarm"));
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see No reading Alert Notification", MessageTypes.Fail);
					}
					break;
				case "Low Glucose Alert":
					try {
						getNFKSensorPairPageLowGlucoseAlertPopup().waitForPresent(720000);
						if(getNFKSensorPairPageLowGlucoseAlertPopup().isDisplayed()){
							Reporter.logWithScreenShot("User able to see low Glucose Alert Notification", MessageTypes.Pass);
							LFSUtilsAndroid.pause(3000);
							LFSUtilsAndroid.click(getNFKSensorPairPageLowGlucoseAlertPopup());
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see Low Glucose Alert Notification", MessageTypes.Fail);
					}
					break;
				case "BluetoothOff":
					try {
						sign.getNFKSignuppageTimeStaticText("Bluetooth").waitForPresent(720000);
						if (sign.getNFKSignuppageTimeStaticText("Bluetooth").isDisplayed()) {
							Reporter.logWithScreenShot("User able to see Bluetooth Off Notification", MessageTypes.Pass);
							LFSUtilsAndroid.click(sign.getNFKSignuppageTimeStaticText("Bluetooth"));
							LFSUtilsAndroid.click(driver.findElement(By.xpath("//*[@label='Open']")));
						}
					} catch (Exception e) {
						Reporter.logWithScreenShot("Fail to see Bluetooth Off Notification", MessageTypes.Fail);
					}
					break;
				default:
					break;
				}
			}
//			Shubham
//			Method to verify unpair sensor screen
			public void verifyUnpairSensorScreen() {
				try {
					getNFKSensorpairpageUnPairSensorTitle().isPresent();

					Reporter.logWithScreenShot("User verified unpair sensor screen", MessageTypes.Pass);
					LFSUtilsAndroid.click(getNFKSensorpairpageUnPairSensorPopup());
					LFSUtilsAndroid.click(getNFKApplysensorbackbtn());
				} catch (Exception e) {
					Reporter.logWithScreenShot("Fail to unpair sensor screen", MessageTypes.Fail);
				}
			}
}