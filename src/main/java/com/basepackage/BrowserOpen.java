package com.basepackage;


import java.time.Duration;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utility.ExtentReportsData;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserOpen{
	
	public static  WebDriver driver;



	@BeforeSuite
	public static WebDriver browserConfiguration()
	{
		
		ExtentReportsData.generateReport();
		ExtentReportsData.extentCreateLog("intializing browser");
		ChromeOptions options = new ChromeOptions();	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
			
		return driver;
	}

	
	
	@AfterSuite(alwaysRun=true)
	public static  void tearDown() {
		ExtentReportsData.extentCreateLog("closing browser");
		ExtentReportsData.exitReport();
		driver.quit();
		
	}

}
