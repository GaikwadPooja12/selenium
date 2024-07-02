package framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_MultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("‪C:\\Users\\Admin\\Desktop\\Book1(a).xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet3");
		
		//Last Row Number
		int LastRowNum=sh.getPhysicalNumberOfRows();
		System.out.println("last row no is:"+ LastRowNum);
		
		int LastCellNum=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("last cell no is:"+ LastCellNum);
		
		/*for (int i = 0; i < LastRowNum; i++)
		{
			For (int j=0; j<LastCellNum; j++)
			{
				System.out.print(sh.getRow(i).getCell(j).toString());
				System.out.println();
			}
			
		}*/
		
		
	}

}
