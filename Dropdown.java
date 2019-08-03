package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("https://www.facebook.com");   
  
  
//Using Select class for selecting value from dropdown  
      
Select dropdown = new Select(driver.findElement(By.id("day")));  
dropdown.selectByVisibleText("29");  
  
    // Close the Browser  

	}

}
