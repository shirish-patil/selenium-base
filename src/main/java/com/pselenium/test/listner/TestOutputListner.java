package com.pselenium.test.listner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pselenium.ScreenShotHelper;
import com.pselenium.reports.ExtentReporterNG;
import com.pselenium.test.google.GoogleHomePageTestService;

public class TestOutputListner implements ITestListener {
	private final Logger logger = LogManager.getLogger(GoogleHomePageTestService.class);
	
	ExtentTest testResult;
	ExtentReports extent= ExtentReporterNG.generateReportObject();
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		testResult= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(testResult);		
	}

	@Override
	public void onTestSuccess(ITestResult result) {		
		extentTest.get().log(Status.PASS, "Test case passed successfully...");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		extentTest.get().fail(result.getThrowable());
		WebDriver driver= null;
		String testCaseName= result.getMethod().getMethodName();
		
		try {
			driver= (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("********DRIVER "+driver);
		try {
			extentTest.get().addScreenCaptureFromPath(ScreenShotHelper.takeScreenShotAndReturnFilePath(testCaseName, driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			logger.error("Unable to take screenshot.", e);
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		extent.flush();
		
	}
}
