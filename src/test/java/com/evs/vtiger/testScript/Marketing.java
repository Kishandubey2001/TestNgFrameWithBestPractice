package com.evs.vtiger.testScript;

import org.testng.annotations.Test;

import com.eva.marketing.Account.AcccountCreation;

public class Marketing extends BaseClass {
     
	@Test(retryAnalyzer = RetryAnalyzer.class, invocationCount = 3)
	public void vt001AccountCreation() throws InterruptedException {
		cd.gotoMarketingAccountpage();
		cd.clickOnUniversalCreateButton();
		AcccountCreation acobj = new AcccountCreation(kw);
		acobj.marketingAccountCreation();
		cd.savebutton();
		Thread.sleep(5000);
		//System.out.println(1/0);
	}
	
	     
	
	}


