package com.eva.sales.Invoice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class InvoiceOrLayer {
	public InvoiceOrLayer(KishanWebUtil kw)
	{
	  PageFactory.initElements(kw.getDriver(), this);
	  
	}
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subject;
	
	@FindBy(xpath = "//td[text()='Sales Order 			']/following-sibling::td//img[@title='Select']")
    private WebElement salesplusbutton;
	
	@FindBy(xpath = "//a[text()='KrishanaRadha']")
	private WebElement salescontext;
	
	@FindBy(xpath = "//td[text()='Contact Name 			']/following-sibling::td//img[@title='Select']")
	private WebElement contactplusbutton;
	
	@FindBy(xpath = "//a[text()='Dubey Kishan']")
	private WebElement contact_context;
	
	@FindBy(xpath = "//td[text()='Account Name 			']/following-sibling::td//img[@title='Select']")
	private WebElement accountplusbutton;
	
	@FindBy(xpath = "//a[text()='Adarsh dubey']")
	private WebElement accountText;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement ShippingAddress;
	
	@FindBy(xpath = "//img[@id='searchIcon1']")
	private WebElement toolItembutton;
	
	@FindBy(xpath = "//a[text()='abcd1234']")
	private WebElement itemcontext;
	
	@FindBy(xpath = "//input[@id='qty1']")
	private WebElement itemquantity;
	
	
	
}
