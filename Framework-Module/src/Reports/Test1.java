package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
			
	//@BeforeMetheod
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}
	@AfterClass
	//@AfterMethod
	public void closeBrowser() {
			driver.close();
	}
	
	@Test (priority=1)
	public void verifygoogleTitle	() {
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Google");	
	}
	
	@Test (priority=3)
	public void verifygcrTitle() {
		driver.get("http://www.gcrit.com/build3/admin/");
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "GCR Shop");
			
	      }
	
	@Test (priority=2)
	public void verifyYahooTitle() {
		driver.get("https://in.yahoo.com ");
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Yahoo India");
			
	}
	
	
	
	
	
	
	
	
	

}
