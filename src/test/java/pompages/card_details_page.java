package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v122.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class card_details_page {
	@FindBy(xpath = "//input[@name = \"name_on_card\"]")
	private WebElement card_name;
	
	@FindBy(xpath = "//input[@name = \"card_number\"]")
	private WebElement card_number;
	
	@FindBy(xpath = "//input[@name = \"cvc\"]")
	private WebElement cvc ;
	
	@FindBy(xpath = "//input[@name = \"expiry_month\"]")
	private WebElement expirey_month;
	
	@FindBy(xpath = "//input[@name = \"expiry_year\"]")
	private WebElement expirey_year;
	
	@FindBy(xpath = "//button[@data-qa='pay-button']")
	private WebElement pay_and_conform;
	
	@FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
	private WebElement orderplaced_message;
	
	public card_details_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CardName(String name) {
		card_name.sendKeys(name);
	}
	
	public  void cardNumber(String number) {
		card_number.sendKeys(number);
	}
	
	public void cvc(String cvcnumber) {
		cvc.sendKeys(cvcnumber);
	}
	
	public void ExpireyDate(String month , String year) {
		expirey_month.sendKeys(month);
		expirey_year.sendKeys(year);
	}
	
	public void PayAndConform() {
		pay_and_conform.click();
	}
	
	public String OrderPlaced() {
		return orderplaced_message.getText();
	}
	
	
	
}
