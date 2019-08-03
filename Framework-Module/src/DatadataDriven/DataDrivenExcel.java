package DatadataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenExcel {
	
	public class DataDrivenTest {
		 WebDriver driver;
		    XSSFWorkbook workbook;
		    XSSFSheet sheet;
		    XSSFCell cell;
		  @BeforeTest
		 public void initialization(){
		     // To set the path of the Chrome driver.
         System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe");
		 driver = new ChromeDriver();
		     driver.get("http://www.gcrit.com/build3/admin/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    }
		  
		 @Test
		 public void fbLoginLogout() throws IOException, InterruptedException{
		 // Import excel sheet.
			 
			 File src=new File("C:\\Users\\Dell\\eclipse-workspace\\Framework-Module\\src\\ExcelData\\Input1.xlsx");   
		 // Load the file.
		 FileInputStream fis = new FileInputStream(src);
		 // Load he workbook.
		 workbook = new XSSFWorkbook(fis);
		 // Load the sheet in which data is stored.
		 sheet= workbook.getSheetAt(0);
		 for(int i=0; i<=sheet.getLastRowNum(); i++){
		 
		 // Import data for Email.
		 cell = sheet.getRow(i).getCell(0);
		 
		 switch (cell.getCellType()) {
         case STRING:
        	 
		 driver.findElement(By.name("username")).clear();
		 driver.findElement(By.name("username")).sendKeys(cell.getStringCellValue());
		 
		 // Import data for password.
		 cell = sheet.getRow(i).getCell(1);
		 
		 switch (cell.getCellType()) {
         case STRING:
            
         driver.findElement(By.name("password")).clear();          
         driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
         //driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
         
		 Thread.sleep(4000);
		 }
		 }
		 }
		 }
		  @AfterTest
		    public void closebrowser() {      
		    	driver.quit();
		                              }  
		 } 
		}