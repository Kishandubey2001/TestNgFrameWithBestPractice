package com.evs.vtiger.commonCodesORlayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class CommonOrReuseableCodes {
	public CommonOrReuseableCodes(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}

	@FindBy(xpath ="//input[@name='user_name']" )
	private WebElement userNameTB;

	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement userPasswordTB ;
	
	
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement clickOnLoginBT;
	
	@ FindBy(xpath = "//a[text()='My Home Page']")
	private WebElement mouseoverMyhomepageMM;
	
	@FindBy(xpath = "//div[@id='My Home Page_sub']//a[text()='Home']")
	private WebElement clickonhomeSM ;
	
	@FindBy(xpath = "//div[@id='My Home Page_sub']//a[text()='Webmail']")
	private WebElement clickonhomewebmail;
	
	@FindBy(xpath = "//a[text()='Marketing']")
	private WebElement mauseOverMarketingMM;
	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Campaigns']")
	private WebElement clickonMarketingCompaignSM ;

	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Accounts']")
	private WebElement clickonMarketingAccountSM ;
	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Contacts']")
	private WebElement clickonMarketingContactsSM;
	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Webmail']")
	private WebElement clickonMarketingWebmailSM;
	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Leads']")
	private WebElement clickonMarketingLeadsSM ;

	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Documents']")
	private WebElement clickonMarketingDocumentsSM;

	
	@FindBy(xpath = "//a[text()='Sales']")
	private WebElement mouseoverSalesMM;

	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Leads']")
	private WebElement clickonSalesLeadsSM;
	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Accounts']")
	private WebElement clickonSalesAccountSM;
	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Contacts']")
	private WebElement clickonSalesContactsSM;

	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Potentials']")
	private WebElement clickonSalesPotentialsSM;

	
	@FindBy(xpath ="//div[@id='Sales_sub']//a[text()='Quotes']" )
	private WebElement clickonSalesQuotesSM;

	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Sales Order']")
	private WebElement clickonSalesSales_OrderSM;

	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Invoice']")
	private WebElement clickonSalesInvoicepageSM;

	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Price Books']")
	private WebElement clickonSalesPrice_BooksSM;

	
	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Documents']")
	private WebElement clickonSalesDocumentsSM;

	
	@FindBy(xpath = "//a[text()='Support']")
	private WebElement mauseoverSupportMM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Trouble Tickets']")
	private WebElement clickonSupportTrouble_TicketsSM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='FAQ']")
	private WebElement clickonSupportFAQSM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Accounts']")
	private WebElement clickonSupportAccountsSM;
	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Contacts']")
	private WebElement clickonSupportContactsSM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Documents']")
	private WebElement clickonSupportDocumentsSM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Webmail']")
	private WebElement clickonSupportWebmailSM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Service Contracts']")
	private WebElement clickonSupportService_ContractsSM;
	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Project Milestones']")
	private WebElement clickonSupport_Project_MilestonesSM;

	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Project Tasks']")
	private WebElement clickonSupportProject_TasksSM;
	
	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Projects']")
	private WebElement clickonSupportProjectsSM;
	
	@FindBy(xpath = "//a[text()='Analytics']")
	private WebElement mauseoverAnalyticsMM;

	
	@FindBy(xpath ="//div[@id='Analytics_sub']//a[text()='Reports']" )
	private WebElement clickonAnalyticsReportsSM;

	
	@FindBy(xpath = "//div[@id='Analytics_sub']//a[text()='Dashboard']")
	private WebElement clickonAnalyticsDashboardSM;
	
	@FindBy(xpath = "//a[text()='Inventory']")
	private WebElement mauseoverInventoryMM;
	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Products']")
	private WebElement clickonInventoryProductsSM;

	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Vendors']")
	private WebElement clickonInventoryVendorsSM;

	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Price Books']")
	private WebElement clickonInventoryPriceBooksSM;

	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Sales Order']")
	private WebElement clickonInventorySales_OrderSM;

	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Quotes']")
	private WebElement clickonInventoryQuotesSM;

	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Invoice']")
	private WebElement clickonInventoryInvoiceSM;

	
	@FindBy(xpath ="//div[@id='Inventory_sub']//a[text()='Services']" )
	private WebElement clickonInventoryServicesSM;

	
	@FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Assets']")
	private WebElement clickonInventoryAssetsSM;
	
	@FindBy(xpath = "//a[text()='Tools']")
	private WebElement mauseoverToolsMM;
	
	@FindBy(xpath = "//div[@id='Tools_sub']//a[text()='Our Sites']")
	private WebElement clickonToolsOur_SitesSM;

	
	@FindBy(xpath = "//div[@id='Tools_sub']//a[text()='Documents']")
	private WebElement clickonToolsDocumentsSM;
	
	@FindBy(xpath = "//div[@id='Tools_sub']//a[text()='PBX Manager']")
	private WebElement clickonToolsPBX_ManagerSM;

	
	@FindBy(xpath = "//div[@id='Tools_sub']//a[text()='Comments']")
	private WebElement clickonToolsCommentsSM;
	
	@FindBy(xpath = "//div[@id='Tools_sub']//a[text()='Recycle Bin']")
	private WebElement clickonToolsRecycle_BinSM;
	
	@FindBy(xpath = "//div[@id='Tools_sub']//a[text()='SMSNotifier']")
	private WebElement clickonToolsSMSNotifierSM;
	
	@FindBy(xpath ="//a[text()='Settings']" )
	private WebElement mauseoverSettingsMM;
	
	@FindBy(xpath = "//div[@id='Settings_sub']//a[text()='Settings']")
	private WebElement clickonSettingsSettingsSM;

	
	@FindBy(xpath = "//div[@id='Settings_sub']//a[text()='Module Manager']")
	private WebElement clickonSettingsModule_ManagerSM;

	
	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement searchTB;
	
	@FindBy(xpath = "//select[@name='search_field']")
	private WebElement searchDD;

	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement clickSearchBT;
	
	@FindBy(xpath = "//img[contains(@title,'Create')]")
	private WebElement clickonUniverSalCreateBT;
	
	@FindBy(xpath = "//img[contains(@title,'Export')]")
	private WebElement clickonUniverSalExportBT;
	
	@FindBy(xpath = "//img[contains(@title,'Import')]")
	private WebElement clickonUniverSalImportBT;
	
	@FindBy(xpath = "//img[contains(@title,'Chat')]")
	private WebElement clickonUniverSalChatBT;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBT;
	
	@FindBy(xpath = "//b[contains(text(),'Title')]/parent::td/following-sibling::td/following-sibling::td//a/following-sibling::a/img[@title='Close']")
	private WebElement deleteTitle;
	
	@FindBy(xpath = "//b[contains(text(),'DashBoardBoard')]/parent::td/following-sibling::td/following-sibling::td//a/following-sibling::a/img[@title='Close']")
	private WebElement deletedashBoard;
	
	@FindBy(xpath="//font[contains(text(),'You must specify a valid username and password.')]")
	private WebElement wrongemessage;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement logout;
	
	@FindBy(xpath = "//a[@id='adddash']")
	private WebElement dashboard;
	
	
	
	
	


	
}
