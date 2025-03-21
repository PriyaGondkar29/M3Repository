package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


		//DeCLARATION
		
		@FindBy(id="Email") private WebElement emailTB;
		@FindBy(id="Password") private WebElement passwordTB;
		@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;
		@FindBy(id="RememberMe")private WebElement rememberMeCheckbox;
		
		@FindBy(linkText ="Forgot password?")private WebElement forgotPasswordLink;
		
		//intilization
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization

		public WebElement getEmailTB() {
			return emailTB;
		}

		public WebElement getPasswordTB() {
			return passwordTB;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getRememberMeCheckbox() {
			return rememberMeCheckbox;
		}

		public WebElement getForgotPasswordLink() {
			return forgotPasswordLink;
		}
		
		
		
		
	}


