package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserpage {
	
	
//declaration

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
    @FindBy(xpath = "//select[@id='months']//option[contains(text(),'June')]")
    private WebElement  calender_month;
    		
    
  //select[@id='years']//option[contains(text(),'2018')]
    @FindBy(xpath = "//select[@id='years']//option[contains(text(),'2018')]")
    private WebElement  calender_years;
    
   // newsletter
    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement sign_up_newslatter;
    
   // optin
    @FindBy(xpath = "//input[@id='optin']")
    private WebElement special_offers;
    
  
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement first_name;
    
  
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement last_name;
    
  
    @FindBy(xpath = "//input[@id='company']")
    private WebElement  company;
    
  //input[@id='address1']
    @FindBy(xpath = "//input[@id='address1']")
    private WebElement  address1;
    
 
    @FindBy(xpath = "//input[@id='address2']")
    private WebElement  address2;
    
  //select[@id='country']//option[contains(text(),'Australia')]
    @FindBy(xpath = "//select[@data-qa = 'country']//option[contains(.,'India')]")
    private WebElement country; 
    
  //input[@id='state']
    @FindBy(xpath = "//input[@id='state']")
    private WebElement state; 
    
  //input[@id='city']
    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;
    
  
    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement mobile_number;
    
  //button[normalize-space()='Create Account']
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    private WebElement create_account;
    
  //b[normalize-space()='Account Created!']
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    private WebElement account_created;
    
  //a[contains(text(),'Continue')]
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement continue_signup;
    
  
    @FindBy(xpath = "//li[contains(.,'Logged in as')]")
    private WebElement Loggeed_in_as_user;
    
    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipcode;
    
  //b[contains(text(),'Account Deleted!')]
    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    private WebElement account_deleted;
    
 
    @FindBy(xpath = " //a[@href='/delete_account']")
    private WebElement  delete_account; 
  
    
 //initialization   
    public RegisterUserpage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
  //Utilization   
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
    
    
    public void CalenderSelection()
    {
    	calender_days.click();
    	calender_month.click();
    	calender_years.click();
    	
    }
    
    public void sign_up_newslatter()
    {
    	sign_up_newslatter.click();
    }
    
    public void recive_special_offers()
    {
    	special_offers.click();
    }
    
    public void address_info_first_name(String name){
    	
    	first_name.sendKeys(name);
    }
    
    public void address_info_last_name(String name) {
    	
    last_name.sendKeys(name);
    }
    
    public void company(String name) {
    	
    company.sendKeys(name);
    }
    
    
    public void address1(String name) {
    	
    address1.sendKeys(name);
    }
    
    
    public void address2(String name) {
    	
    	address2.sendKeys(name);
    }
    
    public void country() {
    	
    country.click();
    }
    
    public void state(String name) {
    	
    state.sendKeys(name);
    }
    
    public void city(String name) {
    	
    	city.sendKeys(name);
    }
    
    public void Zipcode(String number) {
    	zipcode.sendKeys(number);
    	
    }
    
    public void mobilenumber(String number) {
    	mobile_number.sendKeys(number);
    }
    
    public void create_Account() {
    	create_account.click();
    }
    
    public void account_created()
    {
  System.out.println(account_created.isDisplayed()+"account created is displayed or not");  	
    }
    
    
    public void continue_signup()
    {
    	
    continue_signup.click();
    }
    
    public void logged_in_user() {
    	
    System.out.println(Loggeed_in_as_user.isDisplayed()+"logged in as user");
    }
    
    public void delete_account()
    {
    	delete_account.click();
    }
    
    public void account_deleted()
    {
    	
    	System.out.println("account is deleted"+account_deleted.isDisplayed());
    }
    
    public void contine_with_other_activity() {
    	continue_signup.click();
    }
    

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

