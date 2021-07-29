package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pageObjects.DatomsLoginPage;

public class DatomsSteps {
	
	public WebDriver driver;
	public DatomsLoginPage dlp;
	
	@Given("^User launches the chrome browser$")
	public void user_launches_the_chrome_browser() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		dlp = new DatomsLoginPage(driver);
	}
	
	@When("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String URL) throws Throwable {
	    driver.get(URL);
	}
	
	@Then("^User should be in the login page$")
	public void user_should_be_in_the_login_page() throws Throwable {
		Assert.assertTrue(dlp.InLoginFormPage());
	}
	
	@Then("^User closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	    driver.close();
	}
	
	@Then("^Login Header is present$")
	public void login_Header_is_present() throws Throwable {
	    Assert.assertTrue(dlp.LoginHeaderPresent());
	}
	
	@Then("^Email input box is present$")
	public void email_input_box_is_present() throws Throwable {
		Assert.assertTrue(dlp.EmailInputBoxPresent());
	}
	
	@Then("^Password input box is present$")
	public void password_input_box_is_present() throws Throwable {
		Assert.assertTrue(dlp.PasswordInputBoxPresent());
	}
	
	@Then("^LoginButton is present$")
	public void LoginButton_is_present() throws Throwable{
		Assert.assertTrue(dlp.LoginButtonPresent());
	}
	
	@Then("^Forgot password link is present$")
	public void forgot_password_link_is_present() throws Throwable {
		Assert.assertTrue(dlp.ForgotPasswordLinkPresent());
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	
}
