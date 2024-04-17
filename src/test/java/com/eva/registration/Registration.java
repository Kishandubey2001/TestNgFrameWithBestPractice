package com.eva.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;


public class Registration {
	public WebDriver driver=null;
	@Test
	public void registration()
	{
	   driver=new ChromeDriver();
	   driver.get("https://automationexercise.com/");
	WebElement actualHomeTitle=   driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a"));
String actualH=	actualHomeTitle.getText();
	Assert.assertEquals(actualH, "Home");
WebElement regLogin=	driver.findElement(By.xpath("//a[@href='/login']"));
regLogin.click();
WebElement newuser=    driver.findElement(By.xpath("//h2[text()='New User Signup!']"));	
 String  Actualnewuser=  newuser.getText();	
 Assert.assertEquals(Actualnewuser, "New User Signup!");
  WebElement username=  driver.findElement(By.xpath("//input[@placeholder='Name']"));
  username.sendKeys("Kishan");
 WebElement email= driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input[@placeholder='Email Address']"));
 String randomstring= RandomString.make(2);
 email.sendKeys("Kishan2001@yopmail.com"+randomstring);
 WebElement weenteraccountinfo=    driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
  String actualaccountInfo=  weenteraccountinfo.getText();
  Assert.assertEquals(actualaccountInfo, "Enter Account Information");
  driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kishan@12345");
 WebElement days= driver.findElement(By.xpath("//select[@id='days']"));
   Select daydrop= new Select(days);
   daydrop.selectByValue("1");
   
   WebElement months= driver.findElement(By.xpath("//select[@id='months']"));
   Select monthsdrop= new Select(months);
   monthsdrop.selectByValue("9");
   
   WebElement year= driver.findElement(By.xpath("//select[@id='years']"));
   Select yeardrop= new Select(year);
   yeardrop.selectByValue("2001");
   
 driver.findElement(By.xpath("//input[@id='newsletter']")).click();
 driver.findElement(By.xpath("//input[@id='optin']")).click();
 driver.findElement(By.id("first_name")).sendKeys("Kisha");
 driver.findElement(By.id("last_name")).sendKeys("kumar");
 driver.findElement(By.id("company")).sendKeys("KishanCompany");
 driver.findElement(By.id("address1")).sendKeys("Bankat");
 driver.findElement(By.id("address2")).sendKeys("BhikhariRampur");
 WebElement countrydrop=   driver.findElement(By.id("country"));
   Select countrydropdown=    new Select(countrydrop);
   countrydropdown.selectByValue("India");
 driver.findElement(By.id("zipcode")).sendKeys("221401");
 driver.findElement(By.id("mobile_number")).sendKeys("8963993939");
 driver.findElement(By.xpath("//button[text()='Create Account']")).click();
 
 
 
 
 
 
 
 
  
   
  
  
	
	
    
	}

}
