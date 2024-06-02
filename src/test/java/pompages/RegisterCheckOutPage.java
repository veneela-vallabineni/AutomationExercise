package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterCheckOutPage {

	@FindBy(xpath = "//a[@href='/view_cart'][contains(text(),'Cart')]")
	private WebElement cart;
	
	@FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
	private WebElement shoping_cart;
	
	@FindBy(xpath = "//a[contains(text() , 'Proceed To Checkout')]")
	private WebElement proceed_to_checkout;
	
	@FindBy(xpath = "//a[@href = \"/login\"]/u[contains(text() , 'Register / Login')]")
	private WebElement register_or_login;
	
	@FindBy(xpath = "//textarea[@name = \"message\"]")
	private WebElement comment;
	
	@FindBy(xpath = "//a[@href = \"/payment\"]")
	private WebElement place_order;

	public RegisterCheckOutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void cart() {
		cart.click();
	}
	
	public String shopingCartMessage() {
		return shoping_cart.getText();
	}
	
	public void proceedToCheckOut() {
		proceed_to_checkout.click();
	}
	
	public void registerOrLogin() {
		register_or_login.click();
	}
	
	public void CommentMessage(String message) {
		comment.sendKeys(message);
	}
	
	public void PlaceOrder() {
		place_order.click();
	}
	
	
	
	
	
	
}
