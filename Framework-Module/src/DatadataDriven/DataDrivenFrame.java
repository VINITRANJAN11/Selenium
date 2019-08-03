package DatadataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrame {
	
	ChromeDriver driver;

	@Test(dataProvider="GCRShop")
	public void loginGcrshop(String username, String password) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys(username); 
		 driver.findElement(By.name("password")).sendKeys(password); 
		 driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
		 
		 Thread.sleep(4000);
		 System.out.println(driver.getTitle());  
		 driver.quit();
	  }
	@DataProvider(name="GCRShop")
	public Object[][] passData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] ="admin";
		data[0][1] ="admin@123";
		
		data[1][0] ="admin22";
		data[1][1] ="admin128";
		
		data[2][0] ="admin";
		data[2][1] ="admin@123";
		return data;	
	}
	

	}


