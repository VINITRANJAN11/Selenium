package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
      //*[@id="credit2"]/a
        String url = "http://demo.guru99.com/test/drag_drop.html";
        driver.get(url);
      //WebElement on which drag and drop operation needs to be performed 	
        WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));  
        
        //WebElement to which the above object is dropped  
            WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));  
               
        //Creating object of Actions class to build composite actions  
            Actions act = new Actions(driver);  
               
        //Performing the drag and drop action  
            act.dragAndDrop(from,to).build().perform();  

	}

}
