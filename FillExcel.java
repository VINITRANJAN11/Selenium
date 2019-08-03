package ReadExelfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FillExcel {

	public static void main(String[] args) throws IOException {
		
		// Create a workbook instances 
        Workbook wb = new XSSFWorkbook(); 
  
        FileOutputStream os = new FileOutputStream("C:\\Users\\Dell\\Desktop\\VINIT\\Geeks.xlsx"); 
  
        // Creating a sheet using predefined class provided by Apache POI 
        Sheet sheet = wb.createSheet("Company Prepration"); 
  
        // Creating a row at specific position 
        // using predefined class provided by Apache POI 
  
        // Specific row number 
        Row row = sheet.createRow(3); 
  
        // Specific cell number 
        Cell cell = row.createCell(3); 
  
        // putting value at specific position 
        cell.setCellValue("VINITR"); 
  
        // writing the content to Workbook 
        wb.write(os); 
  
        System.out.println("given cell is created at position (3, 3)"); 
    

	}

}
