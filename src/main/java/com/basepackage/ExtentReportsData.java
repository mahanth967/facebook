package com.basepackage;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsData implements IReporter {
	public static ExtentReports extent;
	public static ExtentSparkReporter  report;
	public static ExtentTest test;
	public void generateReport()
	{
		extent = new ExtentReports();
		report= new ExtentSparkReporter("facebook_report.html");
		extent.attachReporter(report);
		
	}
	
	public void exitReport()
	{
		extent.flush();
	}
			
	
	public void extentCreateLog(String TestName) {
		test=extent.createTest(TestName);
	}
	


	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	
}
