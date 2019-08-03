package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlegcrit {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

         String url = "http://www.gcrit.com/build3/login.php";
         driver.get(url);
         String browserUrl =driver.getCurrentUrl();
         System.out.println(browserUrl);
         Thread.sleep(4000);
         //driver.quit();
         
         //driver.findElement(By.linkText("create an account")).click();
         //Thread.sleep(2000);
         driver.findElement(By.className("ui-button-text")).click();
    
         
         //driver.close();
         
		/*
		 * driver.findElement(By
		 * .cssSelector("#bodyContent > div:nth-child(3) > div > form > " +
		 * "table > tbody > tr:nth-child(1) > td.fieldValue > " +
		 * "input[type=text]")).sendKeys("vinitranjan11"); driver.navigate().refresh();
		 */
        
		/*
		 * driver.navigate().to("http://gcrit.com/"); String bw =driver.getCurrentUrl();
		 * System.out.println(bw);
		 */
         
		/*
		 * driver.navigate().back(); String bw1 =driver.getCurrentUrl();
		 * System.out.println(bw1);
		 * 
		 * driver.navigate().forward(); String bw12 =driver.getCurrentUrl();
		 * System.out.println(bw12);
		 */
         
         
         
         
         

	}

}
