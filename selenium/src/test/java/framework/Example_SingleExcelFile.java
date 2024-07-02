package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_SingleExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
	     
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sh=book.getSheet("Sheet1");
		
		Row row=sh.getRow(0);
		
		Cell cell= row.getCell(0);
		
		/*String value1=cell.getStringCellValue();
		System.out.println(value1);
		
		double value2 = sh.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value2);
		*/
		
		String value1=sh.getRow(0).getCell(0).toString();
		System.out.println(value1);
		
		String value2=sh.getRow(1).getCell(0).toString();
		System.out.println(value2);
		
		System.out.println("........done.......");
		
		
		
	
	}

}
