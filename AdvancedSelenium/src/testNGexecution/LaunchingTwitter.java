package testNGexecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingTwitter {
  @Test(groups ="Functional ")
  public void launchingtwitterTc() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://x.com/i/flow/login");
	  Thread.sleep(2000);
	  driver.close(); 
  }
}
