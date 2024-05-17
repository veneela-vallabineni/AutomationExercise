
package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Login_User_with_Valid_details_page {
	
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
	
	@FindBy(xpath = "//b[.='Account Created!']")
	private WebElement login_created;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement contine_to_next_page;
	
	@FindBy(xpath = "//i[@class = 'fa fa-user']/following-sibling::b")
	private WebElement logged_in_user;
	
	 @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
	    private WebElement account_deleted;
	    
	 
	    @FindBy(xpath = " //a[@href='/delete_account']")
	    private WebElement  delete_account; 
	  
	
	public Login_User_with_Valid_details_page(WebDriver driver)
	{
		PageFactory.initElements(driver , this );
	}
	
	public void  verify_login() {
		signup_or_login_button.click();
		softassert.assertTrue(login_header.isDisplayed());
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
	
	
	
	public void verify_user_logged_in(String username) {
		softassert.assertEquals(logged_in_user.getText(), username);
		System.out.println(logged_in_user.getText()+"logged in first user actual" + username);
		softassert.assertAll();
		}
	
	public void delete_account() {
		delete_account.click();
		softassert.assertTrue(account_deleted.isDisplayed());
		contine_to_next_page.click();
		softassert.assertAll();
		
	}
	
	
	
	
	
	
}




