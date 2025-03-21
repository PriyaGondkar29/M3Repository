package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class ValidLogin extends BaseTest  implements AutoConstant {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Flib flib = new Flib();
		
		String url = flib.readPropertyData(PROP_PATH,URL);

		String email = flib.readExelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		Object password = flib.readExelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);
		
		BaseTest bt = new BaseTest();
		bt.browserSetUp();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		bt.browserTearDown();

		

			}

}
