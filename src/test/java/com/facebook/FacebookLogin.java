package com.facebook;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.basepackage.BrowserOpen;
import com.webelements.GooglePage;
import com.utility.*;
	

public class FacebookLogin {
	
	PageFactorys pagefactory=new PageFactorys(BrowserOpen.browserConfiguration());
	GooglePage googlepage=pagefactory.getGooglePage();
	
	@Test
	public void Login() throws InterruptedException
	{
		
		System.out.println("searching facebook");
		ExtentReportsData.extentCreateLog("Searching facebook in google page");
		googlepage.googleSearchBar("facebook");
		BrowserOpen.tearDown();
		
	}

}
