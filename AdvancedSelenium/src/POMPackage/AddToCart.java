package POMPackage;

import java.io.IOException;

import org.openqa.selenium.By;

import dataDrivenFramework.BaseTest;
import dataDrivenFramework.Flib;

public class AddToCart extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bt=new BaseTest();
		bt.browserSetUp();
		
	WelcomePage wp=new WelcomePage(driver);
	wp.getLoginLink().click();
	
	Flib flib=new Flib();
	String email=flip.readExelData(EXCEL_PATH,VALIDLOGINCREDS,1,0);
	String password=flip.readExelData(EXCEL_PATH,VALIDLOGINCREDS,1,1);
	
	driver.findElement(By.id(email)).sendKeys(email);

	}

}
