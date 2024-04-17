package com.eva.inventory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class InventoryORlayer {
	
	public InventoryORlayer(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}
	@FindBy(name = "subject")
	private WebElement subject;
	
	@FindBy(xpath = "//a[text()='KrishanaRadha']")
	private WebElement salesperson;
	
	@FindBy(xpath = "//a[text()='Dubey Kishan']")
	private WebElement contactperson;
	
	@FindBy(xpath = "//a[text()='Adarsh dubey']")
	private WebElement accountperson;
	
	@FindBy(xpath = "//a[text()='abcd1234']")
	private WebElement orderpeson;
	
	@FindBy(xpath = "//input[@name='salesorder_name']/following-sibling::input/following-sibling::img[@title='Select']")
	private WebElement saleorderplusBT;
	
	@FindBy(xpath = "//input[@name='contact_name']/following-sibling::input/following-sibling::img[@title='Select']")
	private WebElement contactnameplusBT;
	
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::input/following-sibling::img[@title='Select']")
	private WebElement accountnameplusBT;
	
	@FindBy(xpath = "//input[@id='productName1']/following-sibling::input/following-sibling::input/following-sibling::img[@id='searchIcon1']")
    private WebElement productpluBt;
	
	
	
	

}
