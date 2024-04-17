package com.eva.marketing.Documents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class DocumentsOrlayer {
	public DocumentsOrlayer(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}

	@FindBy(xpath = "//input[@name='notes_title']")
	private WebElement title;
	
	@FindBy(xpath = "//body[@class='cke_show_borders']")
	private WebElement descriptiontextbox;
	
	@FindBy(xpath = "//select[@name='filelocationtype']")
	private WebElement fileupload;
	
	@FindBy(xpath = "//input[@name='filename']")
	private WebElement choosefile;
	

}
