package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "http://demo.guru99.com/test/radio.html";
        driver.get(url);
        WebElement 	radio1 = driver.findElement(By.xpath("datb1"));
        radio1.click();
        //driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();  
		/*
		 * int a = driver.findElements(By.xpath("//*[@id=\"u_0_15\"]")).size();
		 * System.out.println(a); for(int i=1;i<=a;i++) {
		 * driver.findElements(By.xpath("//*[@id=\"u_0_15\"]")).get(0).click(); }
		 */

	}
           
}
