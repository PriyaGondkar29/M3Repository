package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);//to make the file ready to read
		Sheet sheet = wb.getSheet("ipl1");
		int rowCount= sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		
		String[][] ipl1Arr=new String[rowCount][cellCount];
		
		for(int i=0;i<rowCount;i++) {
			for (int j =0;j<cellCount;j++)
			{
				ipl1Arr[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		for(String[]arr2:ipl1Arr) 
		{
			for(String data:arr2)
			{
				System.out.println(data+" ");
			}
			System.out.println();
		}
	}

}
