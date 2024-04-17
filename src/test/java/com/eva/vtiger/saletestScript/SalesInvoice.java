package com.eva.vtiger.saletestScript;

import org.testng.annotations.Test;

import com.eva.inventory.InventoryClass;
import com.evs.vtiger.testScript.BaseClass;

public class SalesInvoice extends BaseClass{
	@Test()
	public void vt004salesinvoice()
	{
	   cd.gotoSalesInvoicepage();
	   cd.clickOnUniversalCreateButton();
	   InventoryClass ic=       new InventoryClass(kw);
	   ic.createInvenotory();
	}

}
