package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//initialization
	@FindBy(xpath="//h1[text()='Shpping cart']/../..//img[@title='Show details for Smartphones']")private WebElement smartPhoneCartProduct;
//declaration
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSmartPhoneCartProduct() {
		return smartPhoneCartProduct;
	}

}
