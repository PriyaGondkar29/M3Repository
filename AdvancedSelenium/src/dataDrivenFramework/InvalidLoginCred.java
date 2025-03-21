package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginCred implements AutoConstant {

	private static final String INVALIDLOGINCREDS = null;

	//private static final String INVALIDLOGINCREDS = null;

	//private static final String INVALIDLOGINCREDS = null;
	//private static final By driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {

		Flib flib = new Flib();
		BaseTest bt=new BaseTest();
		bt.browserSetUp();
		
		WebDriver driver= new ChromeDriver();
		driver. manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    
	    int rc= flib.lastRowCount(EXCEL_PATH, INVALIDLOGINCREDS);
	    for(int i=1; i<=rc;i++)
	    {
	    	String email=flib.readExelData(EXCEL_PATH,INVALIDLOGINCREDS,i,0);
	    	String password = flib.readExelData(EXCEL_PATH,INVALIDLOGINCREDS, i, 1);
	    	
	    	driver.findElement(By.id("Email")).sendKeys(email);
	    	driver.findElement(By.id("Password")).sendKeys(password);
	    	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("Email")).clear();
	    	driver.findElement(By.id("Password")).clear();

	    }
	}

	
	
	
}
