package com.NFK.version1.android.steps;

import com.NFK.support.APICnfing;
import com.NFK.support.ApiMethods;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class APISteps {
	@QAFTestStep(description = "user get response data {0}")
	 public void verifyResponseAtt(String responseAttribute) {
	 APICnfing.response_value_Attribute(responseAttribute);
	 }
	@QAFTestStep(description = "Random userdetail generation for {0} days in past")
	 public void randomUserDetailsGenPast(String days) {
		APICnfing tst=new APICnfing();
		tst.generateRandomUserDetails(days);
	 }
	@QAFTestStep(description = "Random userdetail generation for {0} days in future")
	 public void randomUserDetailsGenfuture(String days) {
		APICnfing tst=new APICnfing();
		tst.generateRandomUserDetailsFuture(days);
	 }
	@QAFTestStep(description = "Random userdetail generation for today {0}")
	 public void randomUserDetaGernerationForToday(String days) {
		APICnfing tst=new APICnfing();
		tst.generateRandomUserDetailsToday(days);
	 }
	@QAFTestStep(description = "get the GUID")
	 public void randomGetGUID() {
		ApiMethods tst=new ApiMethods();
		tst.get_GuId();
	 }
	

	@QAFTestStep(description = "get the AuthToken from GUID")
	 public void getAuthTokenForGUID() {
		ApiMethods tst=new ApiMethods();
		tst.getAuthenticationToken();
	 }


	@QAFTestStep(description = "Emancipate the user now")
	 public void emancipateTheUser() {
		ApiMethods tst=new ApiMethods();
		tst.emancipateUser();
	 }
	
	
}
