package com.evs.vtiger.testScript;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class BaseClass {
	

	
	
	protected KishanWebUtil kw=	KishanWebUtil.getobject();
	public CommonResuableCode cd;
	private static ExtentReports extent;
	
	@BeforeSuite
	public void beforesuit()
	{
		extent =new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("test-output/VtigerExtentReports.html");
		extent.attachReporter(spark);
	}
	
	@Parameters({"browser"})
	@BeforeClass
	public void beforeClass(String browser)
	{	kw.browserlauch(browser);
	kw.hitUrl("http://localhost:8888");
	

	}
	//@Test(groups = "smoke")
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforemethod(String username,String password,Method mt) throws InterruptedException
	{ 
		ExtentTest  exTest=extent.createTest(mt.getName());
		kw.setExtTest(exTest);
		cd= new CommonResuableCode(kw);
	    cd.validLogin(username, password);	
	
	}
	@AfterMethod
	public void aftermethod(ITestResult result,Method mt)
	{
		if(result.getStatus()==result.FAILURE)
		{
		String snapshotPath=kw.takeSnapshot(mt.getName());	
	     kw.getExtTest().addScreenCaptureFromPath(snapshotPath);
		}
		cd.logout();
        extent.flush();
		
	}
	@AfterClass
	public void afterclass()
	{
		kw.myquite();
	}
	
	@AfterSuite
	public void aftersuit()
	{
		
		extent.flush();
	}


}
