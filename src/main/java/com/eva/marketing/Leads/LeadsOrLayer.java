package com.eva.marketing.Leads;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class LeadsOrLayer {
	public  LeadsOrLayer(KishanWebUtil kw)
	{
	  PageFactory.initElements(kw.getDriver(), this);
	}
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement firstnameDropDown;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyname;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description;
	

}
