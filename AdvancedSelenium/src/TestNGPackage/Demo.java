package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
 @Test
  public void Method1() {
	  Reporter.log("This is TestNG Method 1", true);
  }
 @Test
 public void Method2() {
	  Reporter.log("This is TestNG Method 2", true);
 }
}
