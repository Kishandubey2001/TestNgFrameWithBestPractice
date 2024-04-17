package com.evs.vtiger.commonCodes;


import com.evs.vtiger.commonCodesORlayer.CommonOrReuseableCodes;
import com.evs.vtiger.utils.KishanWebUtil;

public class CommonResuableCode extends CommonOrReuseableCodes{
	private KishanWebUtil kc;
	
	public CommonResuableCode(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}

	public void validLogin(String username,String password) throws InterruptedException
	{  
		kc.mySenkeys(getUserNameTB(), username);
		kc.mySenkeys(getUserPasswordTB(), password);
		kc.myclick(getClickOnLoginBT());
		
	}
	public void invalidLogin(String username,String userpassword)
	{  
		kc.mySenkeys(getUserNameTB(), username);
		kc.mySenkeys(getUserPasswordTB(), userpassword);
		kc.myclick(getClickOnLoginBT());
	String actualmessage=	kc.mygetText(getWrongemessage());
	String expected="You must specify a valid username and password.";
	if(actualmessage.equals(expected))
	{
	System.out.println("Passed after putting wronge credential message is showing");	
	}else
	{
		System.out.println("Failed after putting wronge credential message is not showing");	
	
	}
		
	}
	
	public void invalidLogin()
	{
	    kc.mySenkeys(getUserPasswordTB(), "admin123");
	    kc.mySenkeys(getUserPasswordTB(), "admin356");
	    kc.myclick(getClickOnLoginBT());
	
	}
	
	public void gotoMyHomePageHomepage()
	{
		kc.mymouseover(getMouseoverMyhomepageMM());
		kc.myclick(getClickonhomeSM());	
	}
	public void gotoHomepageDashBoard()
	{
		kc.mymouseover(getMouseoverMyhomepageMM());
		
	}
	
	public void gotoMyHomePageWebmailpage()
	{
		kc.mymouseover(getMouseoverMyhomepageMM());
		kc.myclick(getClickonhomewebmail());	
	}
	public void gotoMarketingCampaignspage()
	{
		kc.mymouseover(getMauseOverMarketingMM());
		kc.myclick(getClickonMarketingCompaignSM());
	}
	
	public void gotoMarketingAccountpage()
	{
		kc.mymouseover(getMauseOverMarketingMM());
		kc.myclick(getClickonMarketingAccountSM());	
	}
	
	public void gotoMarketingContactspage()
	{
		kc.mymouseover(getMauseOverMarketingMM());
		kc.myclick(getClickonMarketingContactsSM());	
	}
	
	public void gotoMarketingWebmailpage()
	{
		kc.mymouseover(getMauseOverMarketingMM());
		kc.myclick(getClickonMarketingWebmailSM());	
	}
	
	public void gotoMarketingLeadspage()
	{
		kc.mymouseover(getMauseOverMarketingMM());
		kc.myclick(getClickonMarketingLeadsSM());		
	}
	
	public void gotoMarketingDocumentspage()
	{
		kc.mymouseover(getMauseOverMarketingMM());
		kc.myclick(getClickonMarketingDocumentsSM());		
	}
	
	public void gotoSalesLeadspage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesLeadsSM());		
	}
	
	public void gotoSalesAccountspage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesAccountSM());		
	}
	
	public void gotoSalesContactspage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesContactsSM());			
	}
	public void gotoSalesPotentialspage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesPotentialsSM());			
	}
	
	public void gotoSalesQuotespage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesQuotesSM());		
	}
	
	public void gotoSalesSales_Orderpage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesSales_OrderSM());	
	}
	
	public void gotoSalesInvoicepage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesInvoicepageSM());
	}
	
	public void gotoSalesPrice_Bookspage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesPrice_BooksSM());
	}
	public void gotoSalesDocumentspage()
	{
		kc.mymouseover(getMouseoverSalesMM());
		kc.myclick(getClickonSalesDocumentsSM());
	}
	
	public void gotoSupportTrouble_Ticketspage()
	{
		kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportTrouble_TicketsSM());
	}
	
	public void gotoSupportFAQpage()
	{
		kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportFAQSM());
	}
	
	public void gotoSupportAccountspage()
	{
		kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportAccountsSM());	
	}
	
	public void gotoSupportContactspage()
	{
		kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportContactsSM());		
	}
	
	public void gotoSupportDocumentspage()
	{
		kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportDocumentsSM());		
	}
	
	public void gotoSupportWebmailpage()
	{
		kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportWebmailSM());	
	}
	
   public void gotoSupportService_Contractspage()
   {
	   kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportService_ContractsSM());	   
   }
   
   public void gotoSupport_Project_Milestonespage()
   {
	   kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupport_Project_MilestonesSM());	   
   
   }
   
   public void gotoSupportProject_Taskspage()
   {
	   kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportProject_TasksSM());	      
   }
   
   public void gotoSupportProjectspage()
   {
	   kc.mymouseover(getMauseoverSupportMM());
		kc.myclick(getClickonSupportProjectsSM());	   
   }
	
	public void gotoAnalyticsReportspage()
	{
		kc.mymouseover(getMauseoverAnalyticsMM());
		kc.myclick(getClickonAnalyticsReportsSM());	
	}
	
	public void gotoAnalyticsDashboardpage()
	{
		kc.mymouseover(getMauseoverAnalyticsMM());
		kc.myclick(getClickonAnalyticsDashboardSM());
	}
	
	public void gotoInventoryProductspage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryProductsSM());
	
	}
	public void gotoInventoryVendorspage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryVendorsSM());
	
	}
	public void gotoInventoryPriceBookspage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryPriceBooksSM());	
	}
	public void gotoInventorySales_Orderpage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventorySales_OrderSM());		
	}
	
	public void gotoInventoryQuotespage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryQuotesSM());	
	}
	
	public void gotoInventoryInvoicepage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryInvoiceSM());		
	}
	
	public void gotoInventoryServicespage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryServicesSM());		
	}
	
	public void gotoInventoryAssetspage()
	{
		kc.mymouseover(getMauseoverInventoryMM());
		kc.myclick(getClickonInventoryAssetsSM());
	}
	
	public void gotoToolsOur_Sitespage()
	{
		kc.mymouseover(getMauseoverToolsMM());
		kc.myclick(getClickonToolsOur_SitesSM());	
	}
	public void gotoToolsDocumentspage()
	{
		kc.mymouseover(getMauseoverToolsMM());
		kc.myclick(getClickonToolsDocumentsSM());	
	
	}
	public void gotoToolsPBX_Managerpage()
	{
		kc.mymouseover(getMauseoverToolsMM());
		kc.myclick(getClickonToolsPBX_ManagerSM());	
	}
	public void gotoToolsCommentspage()
	{
		kc.mymouseover(getMauseoverToolsMM());
		kc.myclick(getClickonToolsCommentsSM());		
	}
	public void gotoToolsRecycle_Binpage()
	{
		kc.mymouseover(getMauseoverToolsMM());
		kc.myclick(getClickonToolsRecycle_BinSM());		
	}
	
	public void gotoToolsSMSNotifierpage()
	{
		kc.mymouseover(getMauseoverToolsMM());
		kc.myclick(getClickonToolsSMSNotifierSM());	
	}
	
	public void gotoSettingsSettingspage()
	{
		kc.mymouseover(getMauseoverSettingsMM());
		kc.myclick(getClickonSettingsSettingsSM());		
	}
	
	public void gotoSettingsModule_Managerpage()
	{
		kc.mymouseover(getMauseoverSettingsMM());
		kc.myclick(getClickonSettingsModule_ManagerSM());		
	}
	
	public void searchUniversalAccount(String searchAccount,String AccountSeachValue)
	{
		kc.mySenkeys(getSearchTB(), searchAccount);
		kc.mydropdownByVisibleText(getSearchDD(),  AccountSeachValue);
		kc.myclick(getClickSearchBT());
	
	}
	public void clickOnUniversalCreateButton()
	{
		kc.myclick(getClickonUniverSalCreateBT());
	}
	public void clickonUniversalExportButton()
	{
	kc.myclick(getClickonUniverSalExportBT());	
	}
	public void clickonUniversalImportButton()
	{
		kc.myclick(getClickonUniverSalImportBT());
	}
	public void clickonUniversalChatButton()
	{
		kc.myclick(getClickonUniverSalChatBT());
	}
	public void savebutton()
	{
	  kc.myclick(getSaveBT());	
	}
	
	public void deleteTitle()
	{
	  kc.myclick(getDeleteTitle());	
	}
	
	public void deleteDashboard()
	{
		kc.myclick(getDeletedashBoard());
	}
	
	public void username(String username,String password)
	{
		kc.mySenkeys(getUserNameTB(), username);
		kc.mySenkeys(getUserPasswordTB(), password);
	}
	public void userpassword(String userpassword)
	{
		kc.mySenkeys(getUserPasswordTB(), userpassword);
	}
	public void loginbutton()
	{
		kc.myclick(getClickOnLoginBT());
	}
	
	public void verifyusername(String expectedget)
	{
	 String actual=	kc.mygetText(getUserNameTB());
	 String expected=expectedget;
	}
	
	public void logout()
	{
		kc.myclick(getLogout());
	}
	
		
	  
	
	
	


}
