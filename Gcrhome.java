package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Gcrhome {

	public static void main(String[] args) throws InterruptedException {
		
   //System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
   //System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");		
     System.setProperty("webdriver.edge.driver", "C:\\Seleniumjars\\MicrosoftWebDriver.exe");	
   
   //WebDriver driver = new ChromeDriver();

         WebDriver driver = new EdgeDriver();
        //driver.manage().window().maximize();
        String url = "http://www.gcrit.com/build3/login.php";
		driver.get(url);
		Thread.sleep(4000);
		
		 driver.findElement(By.name("email_address")).sendKeys("vinitranjan11@gmail.com"); 
		 driver.findElement(By.name("password")).sendKeys("IAMBACK@19"); 
		 driver.findElement(By.xpath("//*[@id=\"tdb5\"]/span[2]")).click();
		 Thread.sleep(4000);
		String url1 = driver.getCurrentUrl();  
		//System.out.println(url1);
		if (url1.equals("http://www.gcrit.com/build3/index.php"))
		{
			System.out.println("Admin login is successful - Pass");
		}
		else {
			System.out.println("Admin login is unsuccessful - Fail");
		}
		//driver.close();  
		  
	}

}
