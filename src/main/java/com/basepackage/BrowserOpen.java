package com.basepackage;


import java.util.Timer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;


import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserOpen extends ExtentReportsData {
	
	public WebDriver driver;
	public ExtentReportsData reportsdata = new ExtentReportsData();
	
	@BeforeSuite
	public void extentReports()
	{
		reportsdata.generateReport();
	}
	
	
	
	@Test
	public void browserConfiguration() throws InterruptedException
	{
		reportsdata.extentCreateLog("Opening browser");
		ChromeOptions options = new ChromeOptions();	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		reportsdata.exitReport();
		driver.quit();
	}

}
