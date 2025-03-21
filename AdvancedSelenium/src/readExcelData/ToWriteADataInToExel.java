package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteADataInToExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);//to make the file ready to read
		Sheet sheet = wb.getSheet("ipl1");//to get into the desired sheet
		Row row = sheet.getRow(1);//to get into the row
		Cell cell = row.createCell(2);//to create anew coloumn
		cell.setCellValue("Pune");//to set value of column
		FileOutputStream fos = new FileOutputStream("./testData/testdata.xlsx");
		wb.write(fos);//to write data in excel file(data automaticly written in excel testdata 
	}

}
