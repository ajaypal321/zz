package com.listens;

import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utilities.ExternalReport;

public class Listeners extends BaseClass implements ITestListener {

	WebDriver driver=null;
	ExtentReports extentReport=ExternalReport.getExtentReport();
	ExtentTest extentTest;


	// method which invoked before each test method execution
	@Override
	public void onTestStart(ITestResult result) {
		extentTest=extentReport.createTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS,"Test Passed");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.fail(result.getThrowable());
	
	// get the name of failed test case
	String testName=result.getName();

	//Logic for screenshot capture
	try{
	driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	}catch ( IllegalAccessException|IllegalArgumentException|NoSuchFieldException|SecurityException e) { 
		e.printStackTrace();
		}
	
	try {
		String screenshotPath=takescreenshot(testName, driver);//calling method
		extentTest.addScreenCaptureFromPath(screenshotPath,testName);

	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	@Override
	public void onFinish(ITestContext context) {
		//flush the extent  to write the data to report file
		extentReport.flush();
	}
	}


	






