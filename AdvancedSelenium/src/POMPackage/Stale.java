package POMPackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Stale {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		WebElement email = driver.findElement(By.id("Email"));
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("priyagondkar12@gmail.com");
		Thread.sleep(1000);
		
		WebElement pass =driver.findElement(By.id("Password"));
		pass.sendKeys("Priya12@");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginbutton.click();
	}

}
