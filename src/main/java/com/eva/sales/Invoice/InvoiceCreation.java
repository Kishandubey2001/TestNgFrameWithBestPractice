package com.eva.sales.Invoice;

import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.utils.KishanWebUtil;

public class InvoiceCreation extends InvoiceOrLayer{
   private KishanWebUtil kc;
   protected KishanWebUtil kw=	KishanWebUtil.getobject();
   public CommonResuableCode cd;           
	public InvoiceCreation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
		
	}
	
	public void salesinvoiceCreation()
	{
		kc.mySenkeys(getSubject(), "SalesInvoice");
		
		kc.myclick(getSalesplusbutton());
		kw.switchtowindowTitle("");
		
	cd.searchUniversalAccount("KrishanaRadha", "Subject");
//		kw.myclick(getSalescontext());
//		kw.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
//		
//		kc.myclick(getContactplusbutton());
//		kw.switchtowindowTitle("");
//		cd.searchUniversalAccount("DUBEY JI", "Title");
//		kw.myclick(getContact_context());
//		kw.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
//		
//		kc.myclick(getAccountplusbutton());
//		kw.switchtowindowTitle("");
//		cd.searchUniversalAccount("Adarsh dubey", "Account Name");
//		kw.myclick(getAccountText());
//		kw.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
//		kw.mySenkeys(getBillingAddress(), "BillingAddress");
//		kw.mySenkeys(getShippingAddress(), "ShippingAddress");
//		
//		kw.myclick(getToolItembutton());
//		kw.switchtowindowTitle("");
//		cd.searchUniversalAccount("abcd1234", "Product Name");
//		kw.myclick(getItemcontext());
//		kw.switchtowindowTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
//		kw.mySenkeys(getItemquantity(), "2");
//		
		
		
		
		
		
		
		
		
		
		
		
	}

}
