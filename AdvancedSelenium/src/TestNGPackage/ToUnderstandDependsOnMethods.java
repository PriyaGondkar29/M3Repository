package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethods {
  @Test(dependsOnMethods = "register")
  public void login()
  {
	  Reporter.log("This Is login Method",true);
  }
  
  
  @Test(dependsOnMethods = "login")
  public void checkAccountBalance()
  {
	  Reporter.log("This Is check Account Balance Method",true);

}
  
  @Test 
  public void register()
  {
	  Reporter.log("This Is register Method",true);

  }
  
  
  @Test(dependsOnMethods = {"login","moneytransfer"})
  public void logout()
  {
	  Reporter.log("This Is logout Method",true);

  }

  @Test(dependsOnMethods = {"login","register"})
  public void moneytransfer()
  {
	  Reporter.log("This Is register Method",true);

  
  }
  }
