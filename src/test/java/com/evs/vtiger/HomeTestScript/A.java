package com.evs.vtiger.HomeTestScript;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class A {

	public static void main(String[] args) {
     ExtentReports extent =new ExtentReports();
     ExtentSparkReporter spark=new ExtentSparkReporter("test-output/VtigerExtentReports.html");
     extent.attachReporter(spark);
    

     
 ExtentTest extest1=extent.createTest("Testcase1");
 extest1.log(Status.INFO, "I am TestCase1");
 
 ExtentTest extest2=   extent.createTest("Testcase2");
 extest2.log(Status.INFO, "I am testcase2");   
 
 System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 driver.get("http://localhost:8888");
 TakesScreenshot tss=(TakesScreenshot)driver;
	File snapshotSourceFileobj=	 tss.getScreenshotAs(OutputType.FILE);
DateFormat df=	new SimpleDateFormat("MM-dd-yyyy hh_mm_ss a");
String timeStamp=df.format(new Date());
	File SnapshotDestinationFileObj=new File("test-output"+"xyz"+timeStamp+".png");
	try {
		Files.copy(snapshotSourceFileobj, SnapshotDestinationFileObj);
	} catch (IOException e) {
		
		e.printStackTrace();
	}

 

   ExtentTest extest3=  extent.createTest("Testcase3");
   extest3.log(Status.FAIL, "I am fail testcase");
   extest3.log(Status.INFO, "I am testcase3");
   extest3.log(Status.PASS, "I am testCase3");
   extest3.addScreenCaptureFromPath(SnapshotDestinationFileObj.getAbsolutePath());
   
     extent.flush();
     
     
		
		
		
	}

}
