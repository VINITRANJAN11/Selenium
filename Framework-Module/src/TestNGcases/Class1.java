package TestNGcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	WebDriver driver;
	
  @Test (priority=1)
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }
  @Test (priority=2)
  public void verifyGoogle() {
	  driver.get("https://www.google.com/");
	  Assert.assertEquals(driver.getTitle(), "Google");
  }
  @Test (priority=4)
  public void closeBrowser() {
	  driver.close();
  }
  @Test (priority=3)
  public void verifyYahoo() {
	  driver.get("https://in.yahoo.com");
	  Assert.assertEquals(driver.getTitle(), "Yahoo India");
  }
  
  }

