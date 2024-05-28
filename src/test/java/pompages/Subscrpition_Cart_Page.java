package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v122.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscrpition_Cart_Page {

	@FindBy(xpath = "//a[@href = \"/view_cart\"]")
	private WebElement cart;
	
	@FindBy(xpath = "//p[contains(text(),'Copyright © 2021 All rights reserved')]")
	private WebElement footer;
	
	@FindBy(xpath = "//input[@id = \"susbscribe_email\"]")
	private WebElement email_text;
	
	@FindBy(xpath = "//button[@id = \"subscribe\"]")
	private WebElement subscrpibe_button;
	
	@FindBy(xpath = "//div[contains(text(),'You have been successfully subscribed!')]")
	private WebElement Success_message;
	
	
	public Subscrpition_Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void cart() {
		cart.click();
	}
	
	public WebElement footer() {
		return footer;
	}
	
	public void email_text(String email) {
		email_text.sendKeys(email);
	}
	
	public void subscribe_button() {
		subscrpibe_button.click(); 
	}
	
	public WebElement success_message() {
		return Success_message;
	}
	
	
}
