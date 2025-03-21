package testPackage;

import org.testng.annotations.Test;





@Listeners(genericLibrary.MyListener.class)
public class Tc_BuyProduct extend BaseTest {
  @Test
   public void f() {
	  public void buyProductMethod() throws{
		  WelcomePage wp=new WelcomePage(driver);
		  wp.getElectronicsLink().click();
		  
		  ElectronicsPage ep=new ElectronicsPage(driver);
		  ep.getCellPhoneLink().click();
		  
		  ep.getSmartPhoneAddToCartButton().click();
		  wp.getShoppingCartLink().click();
		  
		  ShoppingCartPage sp=new ShoppingCartPage(driver);
		  
		  sp.getSmartphoneCheckBox().click();
		   
		  sp.getTermOfServiceCheckBox().click();
		  sp.getCheckoutButton().click();
		  
		  CheckoutPage cp = new CheckoutPage(driver);
		  cp.buyProduct();
  }
}
