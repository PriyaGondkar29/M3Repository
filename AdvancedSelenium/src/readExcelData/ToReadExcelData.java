package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//to specify the path of excel
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		//to make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		//to go to desired sheet
		Sheet sheet = wb.getSheet("ipl1");
		//to go to desired  row
		Row row = sheet.getRow(3);
		//to go desired cell
		Cell cell = row.getCell(1);
		//to read the data 
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		
	}

}
