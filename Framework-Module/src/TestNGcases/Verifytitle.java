package TestNGcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Verifytitle {

	WebDriver driver;
	
	@Test
	public void verifytitle() {
	System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	String pageTitle = driver.getTitle();
	
		/*
		 * if(pageTitle.contains("Google")) { System.out.println("Pass"); } else {
		 * System.out.println("Fail"); }
		 */
    //Assert.assertEquals(pageTitle, "Google");
    Assert.assertEquals(pageTitle, "Yahoo");
	
	}
	@AfterMethod
	public void closeBrowser() {
	driver.close();	
	}
	
	
	
}
