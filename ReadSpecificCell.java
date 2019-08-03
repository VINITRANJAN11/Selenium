package ReadExelfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSpecificCell {

	public static void main(String[] args) throws Exception {
		
		Workbook workbook = WorkbookFactory.create(yourFile.getInputstream());

		 Sheet sheet = workbook.getSheet(0);//1,2,3

		 Iterator<Row> rowIterator = sheet.iterator();

		        while (rowIterator.hasNext()) {

		            Row row = rowIterator.next();

		            row.getCell(0);
		            row.getCell(1);
		}