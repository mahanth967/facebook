package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BrowserOpen;
import com.utility.PageFactorys;


public class GooglePage  {
	

	static WebDriver driver;
	

	@FindBy(how=How.XPATH,using="//input[@class='gLFyf gsfi']")
	private WebElement google_search_bar;
		
	public GooglePage(WebDriver driver) {
			this.driver=driver;
	       PageFactory.initElements(driver, this);
	}
	
	public void googleSearchBar(String text) throws InterruptedException {
		Thread.sleep(3000);
		google_search_bar.click();
		google_search_bar.sendKeys(text);
	
	}
	

}
