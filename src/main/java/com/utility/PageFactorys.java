package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BrowserOpen;
import com.webelements.GooglePage;


public class PageFactorys {
	
	private WebDriver driver;
	
	private GooglePage googlepage;
	
	
	public PageFactorys(WebDriver driver) {
		this.driver=driver;
	}


	public GooglePage getGooglePage() {

		return (googlepage == null) ? googlepage = new GooglePage(driver) : googlepage;
	}
	
	
	

}
