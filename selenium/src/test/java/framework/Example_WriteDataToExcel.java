package framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_WriteDataToExcel {

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("‪C:\\Users\\Admin\\Desktop\\Book1(a).xlsx");
		Workbook book=WorkbookFactory.create(fis);
		
		//create a sheet
		Sheet sh = book.createSheet("Result");
		//create a row and shell
	
		
		
	
	
	}
}
