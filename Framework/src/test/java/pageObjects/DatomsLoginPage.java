package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DatomsLoginPage {
	
	public WebDriver driver;
	
	public DatomsLoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	//*[@class="form"]
	@FindBy(xpath="//*[@class=\"form\"]")
	@CacheLookup
	WebElement LoginForm;
	
	public boolean InLoginFormPage() {
		return LoginForm.isDisplayed();
	}
	
	
	@FindBy(xpath="//*[@class=\"head\"]")
	@CacheLookup
	WebElement LoginHeader;
	
	public boolean LoginHeaderPresent() {
		return LoginHeader.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"email\"]")
	@CacheLookup
	WebElement EmailInputBox;
	
	public boolean EmailInputBoxPresent() {
		return EmailInputBox.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	WebElement PasswordInputBox;
	
	public boolean PasswordInputBoxPresent() {
		return PasswordInputBox.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"form_submit_btn\"]")
	@CacheLookup
	WebElement LoginButton;
	
	public boolean LoginButtonPresent() {
		return LoginButton.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"forgot_pswd\"]/a")
	@CacheLookup
	WebElement ForgotPasswordLink;
	
	public boolean ForgotPasswordLinkPresent() {
		return ForgotPasswordLink.isDisplayed();
	}
	
	
}
