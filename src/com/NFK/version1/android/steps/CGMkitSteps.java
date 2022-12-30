package com.NFK.version1.android.steps;


import com.NFK.version1.android.pages.CountrySelectionPageAndroid;


import com.qmetry.qaf.automation.step.QAFTestStep;


public class CGMkitSteps {

	CountrySelectionPageAndroid countrySelectionPAge = new CountrySelectionPageAndroid();

	@QAFTestStep(description="user opens the cgmkit app and verifies home screen")
	public void userOpensTheCgmkitApp(){
		countrySelectionPAge.openNFKApp();
		countrySelectionPAge.clickOnHam();
		countrySelectionPAge.verifyNavigation();
	}
}