package com.eva.inventory;

import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.utils.KishanWebUtil;

public class InventoryClass extends InventoryORlayer{
  private KishanWebUtil kc;
	public InventoryClass(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
		
	}
	     CommonResuableCode cd=new CommonResuableCode(kc);
	
	public void createInvenotory()
	{

		kc.mySenkeys(getSubject(), "InventoryCreation");
		//cd.clickOnUniversalCreateButton();
		kc.myclick(getSaleorderplusBT());
		kc.switchtowindowTitle("");
		cd.searchUniversalAccount("Adarsh dubey", "Account Name");
		kc.myclick(getSalesperson());
		kc.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
		kc.myclick(getContactperson());
		kc.switchtowindowTitle("");
		cd.searchUniversalAccount("DUBEY JI", "Title");
		kc.myclick(getContactperson());
		kc.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
		kc.myclick(getAccountnameplusBT());
		kc.switchtowindowTitle("");
		cd.searchUniversalAccount("Adarsh dubey", "Account Name");
		kc.myclick(getAccountperson());
		kc.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
		//d.clickonorderplusBT();
		kc.switchtowindowTitle("");
		cd.searchUniversalAccount("abcd1234", "Product Name");
		kc.myclick(getOrderpeson());
		kc.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
		
		
	}

}
