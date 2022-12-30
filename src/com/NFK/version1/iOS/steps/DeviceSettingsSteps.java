package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.DeviceSettingsPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class DeviceSettingsSteps {
	
	DeviceSettingsPageIOS devicePage = new DeviceSettingsPageIOS();
	
	@QAFTestStep(description = "user switch on automatic time update")
	public void switchOnAutomaticTimeUpdate() {
		devicePage.switchOnAutomaticTimeUpdateSwitch();
	}
	@QAFTestStep(description="user minimize the app and navigate to Device settings and click on Time Sensitive Notifications")
	public void userMinimizeAppAndTurnOffTimeSensitiveNotifications(){
		LFSUtilsIOS.appBackground();
		LFSUtilsIOS.turnOffTimeSensitiveNotification();
	}
	 
		@QAFTestStep(description = "User set time to {0}")
		public void UpdateTime(String str) {
			devicePage.UpdateTime(str);
		}
		
		@QAFTestStep(description = "user set time to Setautomatic")
		public void UserSetTimeToSetAutomatic() {
			devicePage.SetTimeAutomatic();
		}
		@QAFTestStep(description = "user turn off wifi and open the application")
		public void userTurnOffWifiAndOpenTheApplication() {
			devicePage.turnOffWifi();
		}
		@QAFTestStep(description = "user turn on wifi and open the application")
		public void userTurnOnWifiAndOpenTheApplication() {
			devicePage.turnOnWifi();
		}
		@QAFTestStep(description = "User enables Do Not Disturb setting")
		public void UserenablesDoNotDisturbSetting() {

			LFSUtilsIOS.turnonDoNotDisturb();

		}  

		

		@QAFTestStep(description = "User disables Do Not Disturb setting")
		public void UserDisablesDoNotDisturbSetting() {

			LFSUtilsIOS.turnOFFDoNotDisturb();
		}
	
}
