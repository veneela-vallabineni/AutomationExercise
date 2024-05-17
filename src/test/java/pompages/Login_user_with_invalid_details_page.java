package pompages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Login_user_with_invalid_details_page {
	
	SoftAssert softassert = new SoftAssert();
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	private WebElement signup_or_login_button;
	
	@FindBy(xpath = "//h2[.='Login to your account']")
	private WebElement login_header;

	@FindBy(xpath = "//input[@name = 'email'][@data-qa='login-email']" )
	private WebElement login_email;
	
	@FindBy(xpath = "//input[@name = 'password'][@data-qa='login-password']")
	private WebElement login_password;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement login_button;
	
	@FindBy(xpath = "//input[@data-qa='login-email']/following-sibling::p[contains(text(),'Your email or password is incorrect!')]")
	private WebElement error_text;
	
	

	public Login_user_with_invalid_details_page(WebDriver driver)
	{
		PageFactory.initElements(driver , this );
	}
	
	
	public void  verify_login() {
		signup_or_login_button.click();
		softassert.assertEquals(login_header.getText(),"Login to your account");
		softassert.assertAll();
	}
	
	public void  login_email(String email) {
		login_email.sendKeys(email);
		
	}
	
	public void  login_password (String password) {
		login_password.sendKeys(password);
	}
	
	
	public void login_button() {
		login_button.click();
		
		}
	
//	public void verify_error_message(String error_msg) {
//		softassert.assertEquals(error_text.getText(),error_msg);
//		softassert.assertAll();
//		
//	}

	
	public WebElement getError() {
		return this.error_text;
	}
}
