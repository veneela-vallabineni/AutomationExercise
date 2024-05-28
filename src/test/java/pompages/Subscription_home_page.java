package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscription_home_page {

	@FindBy(xpath = "//p[contains(normalize-space(),'Copyright © 2021 All rights reserved')]")
	private WebElement footer;
	
	@FindBy(xpath = "//h2[contains(text(),'Subscription')]")
	private WebElement subscription_text;
	
	@FindBy(xpath = "//input[@id = \"susbscribe_email\"]")
	private WebElement email_text;
	
	@FindBy(xpath = "//button[@id = \"subscribe\"]")
	private WebElement subscribe;
	
	@FindBy(xpath = "//div[@class='alert-success alert']")
	private WebElement success_message;
	
	
	public Subscription_home_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement footer() {   		return subscription_text;
	}
	
	public void  email_text(String  email) {
		 email_text.sendKeys(email);
	}
	
	public void subscribe() {
		 subscribe.click();
	}
	
	public WebElement Success_message() {
		return success_message;
	}
	
	
}
