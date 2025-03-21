package POMPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import genericLibray .SelectUtility;
import genericLibray.BaseTest;
import testNGListeners.Flib;

public class CheckOutPage extends BaseTest {
	
	private static final String EXCEL_PATH_MAIN = null;
	private static final String buyproductdetails = null;
	private static final WebElement billingAddressContinueButton1 = null;
	//declaration
	@FindBy(id="BillingNewAddress_CountryId")private WebElement countryDD;
	@FindBy(id="BillingNewAddress_City")private WebElement cityTB;
	@FindBy(id="BillingNewAddresS_Address1")private WebElement address1TB;
	@FindBy(id="BillingNewAddress_ZipPostalCode")private WebElement pincodeTB;
	@FindBy(id="BillingNewAddress_PhoneNumber")private WebElement phoneNOTB;
	@FindBy(xpath="//input[@onClick='Billing.save()']")private WebElement billingAddressContinueButton1;
	@FindBy(xpath="//input[@onClick='Shipping.save()']")private WebElement shippingAddressContinueButton;
	@FindBy(xpath="//input[@onClick='ShippingMethod.save()']")private WebElement shippingMethodAddressContinueButton;
	@FindBy(xpath="//input[@onClick='PaymentMethod.save()']")private WebElement paymentMethodContinueButton;
	@FindBy(xpath="//input[@onClick='PaymentInfo.save()']")private WebElement paymentInfoContinueButton;
	@FindBy(xpath="//input[@onClick='ConfirmOrder.save()']")private WebElement confirmOrderContinueButton;
	@FindBy(xpath="//strong[text()=''Your order has been successfully processed!']")private WebElement orderProcessedText;
	@FindBy(id="billing-address-select")private WebElement billingAddressOldAddressDD;
	
	
	
	//initializer
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


//Utilization

	public WebElement getCountryDD() {
		return countryDD;
	}




	public WebElement getCityTB() {
		return cityTB;
	}




	public WebElement getAddress1TB() {
		return address1TB;
	}




	public WebElement getPincodeTB() {
		return pincodeTB;
	}




	public WebElement getPhoneNOTB() {
		return phoneNOTB;
	}




	public WebElement getBillingAddressContinueButton1() {
		return billingAddressContinueButton1;
	}




	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}




	public WebElement getShippingMethodAddressContinueButton() {
		return shippingMethodAddressContinueButton;
	}




	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}




	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}




	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}




	public WebElement getOrderProcessedText() {
		return orderProcessedText;
	}
	

	//operational Method 
	
	public static String getExcelPathMain() {
		return EXCEL_PATH_MAIN;
	}


	public static String getBuyproductdetails() {
		return buyproductdetails;
	}


	public static WebElement getBillingaddresscontinuebutton1() {
		return billingAddressContinueButton1;
	}


	public WebElement getBillingAddressOldAddressDD() {
		return billingAddressOldAddressDD;
	}


	public void buyProduct()throws EncryptedDocumentException,IOException
	{
		SelectUtility su =new SelectUtility()
			try
		{
				
		if(billingAddressOldAddressDD.isDisplayed()==true)
		{
		 su.selectByVisibleTextMethod(billingAddressOldAddressDD,"New Address");
		}
		}
		catch(Exception e)
		{
			
		
		su.selectByVisibleTextMethod(countryDD,"India");
	}
		su.selectByVisibleTextMethod(countryDD,"India");
  
		Flib flib=new Flib();
	    int rn = flib.randomNumber();
		String city = flib.readExelData(EXCEL_PATH_MAIN, "buyproductdetails",1,0);
		String address1 = flib.readExelData(EXCEL_PATH_MAIN, buyproductdetails, 1, 1);
		 long pin=flib.readExelData1(EXCEL_PATH_MAIN," buyproductdetails" , 1, 2);
		 long phone=flib.readExelData1(EXCEL_PATH_MAIN," buyproductdetails" , 1, 3);

		//String pin = flib.readExelData(EXCEL_PATH_MAIN, buyproductdetails, 1, 2);
		//String phone = flib.readExelData(EXCEL_PATH_MAIN, buyproductdetails, 1, 3);
		String phoneNo = phone+""+rn;
		
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		pincodeTB.sendKeys(pin);
		phoneNOTB.sendKeys(phoneNo);
		billingAddressContinueButton1.click();
		shippingAddressContinueButton.click();
		shippingMethodAddressContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderContinueButton.click();
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(orderProcessedText.isDisplayed(),true,"Order not placed!!");
		sa.assertAll();
		
	}
	
}
