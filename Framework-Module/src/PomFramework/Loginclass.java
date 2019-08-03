package PomFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginclass {
	WebDriver driver;
	
	By user = By.name("username");
	By pwd = By.name("password");
	By Loginbutton = By.id("tdb1");
	
	public Loginclass(WebDriver vinit) {
		this.driver	=vinit;	
	}
	//Create user action
	public void typeusername(String uname) {
		driver.findElement(user).sendKeys(uname);
	}
	public void Captureusername() {
		driver.findElement(user).getAttribute("value");
	}
	
	public void clearusername() {
		driver.findElement(user).clear();
	}
	public void typePassword(String Password) {
		driver.findElement(pwd).sendKeys(Password);	
	}
	public void clickLoginbutton() {
		driver.findElement(Loginbutton).click();
	}
	
	
	
	
	
	
	
}
