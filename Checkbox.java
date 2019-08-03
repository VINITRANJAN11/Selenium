package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://www.spicejet.com/	";
        driver.get(url);
        
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());  
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();  
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());  

	}

}
