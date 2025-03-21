package testNGexecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kawasaki {
  @Test(groups ="Smoke ")
  public void launchkawasaki() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.bikewale.com/kawasaki-bikes/");
	  Thread.sleep(2000);
	  driver.close();
  }
}
