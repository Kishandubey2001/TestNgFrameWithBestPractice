package com.evs.vtiger.testScript;

import org.testng.annotations.Test;

import com.eva.marketing.Leads.LeadsCreation;

public class MarketingLeads extends BaseClass {
     
		
	@Test(retryAnalyzer = RetryAnalyzer.class,invocationCount = 3)
	public void vt002LeadsCreation()
	{
	  cd.gotoMarketingLeadspage();
	  cd.clickOnUniversalCreateButton();
	  LeadsCreation ld=     new LeadsCreation(kw);
      ld.marketingLeadsCreation();  
	}
	
	     
	
	}


