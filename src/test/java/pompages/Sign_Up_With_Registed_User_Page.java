package pompages;import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Sign_Up_With_Registed_User_Page {

	SoftAssert softassert = new SoftAssert();

	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	private  WebElement logo;


	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	private  WebElement signuplogin;


	@FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
	private WebElement NewUserSignup;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement signupName;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement signUpEmail;

	@FindBy(xpath = "//button[normalize-space()='Signup']")
	private WebElement signupButton;

	@FindBy(xpath = "//input[@name='form_type']/following-sibling::p[. = \"Email Address already exist!\"]")
	private WebElement actual_error_message;



	public	Sign_Up_With_Registed_User_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	
	 public void SIgnUPOrLoginButton()
	    {
	    	signuplogin.click();
	    }
	    
	    public void NewUserSignUP(String text)
	    {
	    	
	    	assertEquals(NewUserSignup.getText(),text);
	    }
	    
	    
	   
	    public void signUpName(String name)
	    {
	    	signupName.sendKeys(name);;
	    }
	    
	    
	    public void signUpEmail(String email)
	    {
	    	signUpEmail.sendKeys(email);;
	    }
	    
	    
	    
	    public void signUp()
	    {
	    	signupButton.click();    }
	    
	    
	

	public void verify_Registered_user(String error_message)
	{
	
		softassert.assertEquals(actual_error_message.getText(), error_message);
		softassert.assertAll();
	}









}
