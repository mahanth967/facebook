

import java.util.Timer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserOpen {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void browserConfiguration() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.google.coma/");
		Thread.sleep(3000);
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
