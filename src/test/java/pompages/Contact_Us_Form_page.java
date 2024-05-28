package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us_Form_page {
	
	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	private WebElement webpage_logo;
	
	@FindBy(xpath = "//a[@href = \"/contact_us\"]")
	private WebElement contact_us_button;
	
	@FindBy(xpath = "//h2[contains(text() , 'Contact ')]")
	private WebElement contact_us_header;
	
	@FindBy(xpath = "//input[@name =\"name\"]")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name =\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name =\"subject\"]")
	private WebElement subject;
	
	@FindBy(xpath = "//textarea[@name = \"message\"]" )
	private WebElement message;
	
	@FindBy(xpath = "//input[@name = \"upload_file\"]")
	private WebElement choosefile;
	
	@FindBy(xpath = "//input[@data-qa = 'submit-button']")
	private WebElement submit_button;
	
	@FindBy(xpath = "//div[contains(text() , 'Success! Your details have been submitted successfully.')][@class='status alert alert-success']")
	private WebElement success_message;
	
	@FindBy(xpath = "//span[contains(text() , ' Home')]")
	private WebElement home_button;
	
	
	
	
	public Contact_Us_Form_page(WebDriver driver) {
	PageFactory.initElements(driver , this);}

	public  WebElement webpage_logo() {
		return webpage_logo;
	}
	
	
	
	public void contact_us() {
		contact_us_button.click();
		
	}
	
	
	public void name(String username) {
		name.sendKeys(username);
	}
	
	public void email(String useremail) {
		email.sendKeys(useremail);
		
	}
	
	public void subject(String userSubject) {
		subject.sendKeys(userSubject);
		
	}
	
	public void message(String usermessage) {
		message.sendKeys(usermessage);
	}
	
	public WebElement choose_file() {
		return choosefile;
		
	}
	
	public WebElement Success_message() {
		return success_message;
		
	}
	
	public void submit() {
		submit_button.click();
	}
	
	public void Home_button() {
		home_button.click();
	}
}
