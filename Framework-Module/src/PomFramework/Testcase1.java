package PomFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        Loginclass login = new  Loginclass(driver);
        driver.get("http://www.gcrit.com/build3/admin/");
        driver.manage().window().maximize();
        login.typeusername("admin");
        login.typePassword("admin@123");
        login.clickLoginbutton();
        
        String url = driver.getCurrentUrl();
        
       if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
    	   System.out.println("Admin login is sucessful -Pass");
       }
       else {
    	   System.out.println("Admin login is unsuccessful -Fail");
       }
        
        driver.close();
        
        
        
        
        
        
        
        
        
        
        
	}

}
