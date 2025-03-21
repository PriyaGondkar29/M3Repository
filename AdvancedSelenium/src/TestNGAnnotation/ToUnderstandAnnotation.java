package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotation {
  @BeforeTest
  public void beforetestMethod() {
	  Reporter.log("This is before test method",true);  }
  
  @AfterMethod
  public void afterMethod()  
  {
	  Reporter.log("This is after method",true);  
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  Reporter.log("This is afterclass method",true);  
  }
  
  @AfterClass
	public void afterclassMehod()
  {
	  Reporter.log("This is afterclass method",true);
  }
  
  @AfterSuite
  public void aftersuite() 
  {
	  Reporter.log("This is aftersuite method",true);
  }
  
  @BeforeClass
  public void beforerclassMehod()
  {
	  Reporter.log("This is beforeclass method",true);
  }
  
  @BeforeMethod
  public void beforeMethod()  
  {
	  Reporter.log("This is before method",true);  
 }
  
  @AfterTest
  public void aftertestMethod() {
	  Reporter.log("This is after test method",true);  }
  
  

  @Test
  public void test1Method() {
	  Reporter.log("This is test1 method",true);  }
  
  

  @Test
  public void test2Method() {
	  Reporter.log("This is test2 method",true);  }
}
