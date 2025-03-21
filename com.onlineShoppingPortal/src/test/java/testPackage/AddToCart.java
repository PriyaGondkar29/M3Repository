package testPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dataDrivenFramework.BaseTest;
import dataDrivenFramework.Flib;

public class AddToCart extends BaseTest{
@Test

	public  void AddToCart throws IOException {
		BaseTest bt=new BaseTest();
		bt.browserSetUp();
		
	WelcomePage wp=new WelcomePage(driver);
	wp.getLoginLink().click();
	
	Flib flib=new Flib();
	String email=flip.readExelData(EXCEL_PATH,VALIDLOGINCREDS,1,0);
	String password=flip.readExelData(EXCEL_PATH,VALIDLOGINCREDS,1,1);
	
     LoginPage lp=new LoginPage(driver);
     lp.validLoginMethod(email,password);
     wp.getElectronicsLink().click();
     
     ElectronicPage ep =new ElectronicsPage(driver);
     ep.getCellPhonesLink().click();
     
     
     

	}

}
