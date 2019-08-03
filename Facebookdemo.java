package Seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://www.facebook.com";
        driver.get(url);
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vinitranjan11@gmail.com");             

        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("IAMBACK@2019");

        driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
	}
	//*[@id="u_0_3"]
}
