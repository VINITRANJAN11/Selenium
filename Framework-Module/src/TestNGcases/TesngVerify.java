package TestNGcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TesngVerify {
	
		WebDriver driver;
		
	@Test (priority=1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test (priority=2)
	public void verifyTite() {
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Google");
	}
	@Test (priority=3)
	public void closeBrowser() {
		driver.close();	

	}

}
