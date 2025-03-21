package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements AutoConstant {
	//private static final String url = null;
	protected static WebDriver driver;
	@BeforeClass
	public void browserSetUp() throws IOException
	{
		Flib flib= new Flib();
		String browserValue=flib.readPropertyData(PROP_PATH_MAIN, "firefox");
		String url =flib.readPropertyData(PROP_PATH_MAIN, " url");
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid Browser name");
		}
		
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	}
	@AfterClass

	public void browserTearDown() {
		driver.quit();
	}
	

	
}
