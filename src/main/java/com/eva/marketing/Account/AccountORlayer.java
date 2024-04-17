package com.eva.marketing.Account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class AccountORlayer {
	public AccountORlayer(KishanWebUtil kw)
	{
	  PageFactory.initElements(kw.getDriver(), this);	
	}
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accountname;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;
	

	@FindBy(xpath = "//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description;
}
