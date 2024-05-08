package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserpage {
	
	

	
//		//declaration
//		@FindBy(id="username")
//		private WebElement unTB;
//		
//		@FindBy(name="pwd")
//		private WebElement pwTB;
//		
//		@FindBy(xpath="//div[.='Login ']")
//		private WebElement loginBtn;
//		
//		
//		//initialisation
//		public LoginPage(WebDriver driver){
//			PageFactory.initElements(driver, this);
//		}
//		
//		
//		
//		//Utilisation
//		public void setUsername(String un){
//			unTB.sendKeys(un);
//		}
//		public void setPassword(String pw){
//			pwTB.sendKeys(pw);
//		}
//		public void clickLogin(){
//			loginBtn.click();
//		}
//	}

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
    
  
    @FindBy(xpath = " //b[normalize-space()='Enter Account Information']")
    private WebElement accountInfoVisibility ;
    
    
    @FindBy(xpath = " //input[@id = 'id_gender2']")
    private WebElement gender ;
    
  
    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement password;
    
  
    @FindBy(xpath = "//select[@id = 'days']//option[@value = '6']")
    private WebElement calender_days ;
    
  //select[@id='months']//option[contains(text(),'June')]
    
  //select[@id='years']//option[contains(text(),'2018')]
    
    
   // newsletter
    
   // optin
    
  //input[@id='first_name']
    
  //input[@id='last_name']
    
  //input[@id='company']
    
  //input[@id='address1']
    
  //input[@id='address2']
    
  //select[@id='country']//option[contains(text(),'Australia')]
    
  //input[@id='state']
    
  //input[@id='city']
    
  //input[@id='mobile_number']
    
  //button[normalize-space()='Create Account']
    
  //b[normalize-space()='Account Created!']
    
  //a[contains(text(),'Continue')]
    
  //li[contains(.,'Logged in as vineela')]
    
  
    
    
    public RegisterUserpage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    
    public void HomePageVisible()
    {
    	System.out.println(logo.isDisplayed());
    }
    
    
    public void SIgnUPOrLoginButton()
    {
    	signuplogin.click();
    }
    
    public void NewUserSignUP()
    {
    	
    	System.out.println(NewUserSignup.isDisplayed());
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
    
    
    public void AccountInfo()
    {
    	System.out.println(accountInfoVisibility.isDisplayed());
    }
    
    public void genderSelection()
    {
    	gender.click();
    }
    
    
    public void enterPassword(String passcode)
    {
    	password.sendKeys(passcode);
    }
    
    
    public void CalenderDaysSelection()
    {
    	calender_days.click();
    }
    
 
    
    
    
    

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

