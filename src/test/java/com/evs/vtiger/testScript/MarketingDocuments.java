package com.evs.vtiger.testScript;

import org.testng.annotations.Test;

import com.eva.marketing.document.DocumentsClass;

public class MarketingDocuments extends BaseClass {
     
		@Test(retryAnalyzer = RetryAnalyzer.class,invocationCount = 3)
	public void vt003Documentcreation()
	{
		cd.gotoMarketingDocumentspage();
		cd.clickOnUniversalCreateButton();
		DocumentsClass  docu=   new DocumentsClass(kw);
	      docu.createDocuments();
	     // kw.switchoutFromeFrame();
	      cd.savebutton();
	}
     
	
	}


