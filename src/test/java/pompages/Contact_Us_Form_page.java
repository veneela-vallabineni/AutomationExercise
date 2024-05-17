package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Us_Form_page {
	
	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	private WebElement webpage_logo;
	
	@FindBy(xpath = "//a[@href = \"/contact_us\"]")
	private WebElement contact_us_button;
	
	@FindBy(xpath = "//h2[. = \"Get In Touch\"]")
	private WebElement contact_us_header;
	
	@FindBy(xpath = "//input[@name =\"name\"]")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name =\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name =\"subject\"]")
	private WebElement subject;
	
	//@FindBy(xpath = )

}
