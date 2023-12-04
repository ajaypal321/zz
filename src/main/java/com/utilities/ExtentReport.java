package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReport {
	// method to create for extentreport
		public static ExtentReports getExtentReport() {
		// define a path where extentreport should be generated
		String extentReportPath= System.getProperty("user.dir")+"\\Spicejet\\ExtentReport\\exentReport.html";
		// create an object of extentSparkReport object specified path
		ExtentSparkReporter reporter =new ExtentSparkReporter(extentReportPath);
		//set the report name and document title for generated
		reporter.config().setReportName("Spicejet Automation Result :name");
		reporter.config().setDocumentTitle("Spicejet Automation Result: document");	
		//create an object of extentreport obj
		ExtentReports extentReport= new ExtentReports();
		// attach that report
		extentReport.attachReporter(reporter);
		return extentReport;
	}
}
