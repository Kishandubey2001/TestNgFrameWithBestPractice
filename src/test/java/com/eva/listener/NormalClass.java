package com.eva.listener;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalClass {
	@DataProvider
	public Object [][] mobileEmulation(){
		return new Object[][] {
			{"BlackBerry Z30",60,640},
			{"Blackberry PlayBook",600,1024},
			{"Galaxy Note 3",360,640},
			{"Galaxy Note II",360,640},
		};
	}
	@Test(dataProvider = "mobileEmulation")
	public void m1(String emulation,int w,int h)
	{
		//System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		Map<String, String>  deviceMobEmu=new HashMap<>();
		deviceMobEmu.put("deviceName", emulation);
		ChromeOptions chromeOpt=new ChromeOptions();
		chromeOpt.setExperimentalOption("mobileEmulation", deviceMobEmu);
	WebDriver driver=	new ChromeDriver(chromeOpt);
	Dimension d=new Dimension(w, h);
	driver.manage().window().setSize(d);
	driver.manage().window().maximize();
	driver.navigate().to("http://localhost:8888");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='Login']")).click();

	
//	Dimension d = new Dimension(150,300);
//	driver.manage().window().setSize(d);
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();

//	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
//	driver.findElement(By.xpath("//input[@name='Login']")).sendKeys(Keys.RETURN);
        
	}
	

}
