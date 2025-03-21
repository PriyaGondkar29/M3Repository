package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandAssertion {
	
	
@Test
	  public void validLoginTC() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
			String expectedWelcomepageTitle= "Demo Web Shop";
			String expectedLoginPageTitle="Demo Web Shop. Login";
			Assert.assertEquals(driver.getTitle(), expectedWelcomepageTitle, "Welcome Page is found !!");
			
			
			
			driver.findElement(By.linkText("Log in")).click();
			Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Welcome page not found!!");
			//Assert.assertEquals(driver.getTitle().equalsIgnoreCase(expectedLoginPageTitle) , "LOGIN page not found!!");

			driver.findElement(By.id("Email")).sendKeys("priyagondkar12@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Priya12@");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(1000);
}
}
