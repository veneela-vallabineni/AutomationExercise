package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Scripts.product_cart;

public class Product_quantity_cart_page {

@FindBy(xpath = "//a[@href = \"/product_details/1\"]")
private WebElement viewProduct;

@FindBy(xpath = "//div[@class = \"product-information\"]/h2")
private WebElement product_name;

@FindBy(xpath = "//input[@id = \"quantity\"]")
private WebElement quantity;

@FindBy(xpath = "//button[contains(.,\"Add to cart\")]")
private WebElement addToCart;

@FindBy(xpath = "//a/u[contains(text(),'View Cart')]")
private WebElement viewCart;

@FindBy(xpath = "//tr[@id = \"product-1\"]/child::td[@class = \"cart_description\"]/h4/a")
private WebElement product_name_cart;

@FindBy(xpath = "//tr[@id = \"product-1\"]//td[@class= \"cart_quantity\"]/button")
private WebElement product_quantity_cart;

public Product_quantity_cart_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void viewProduct() {
	viewProduct.click();
}

public WebElement element() {
	return viewProduct;
}


public String firstProductName() {
	return product_name.getText();
}

public void quantity(String number) {
	quantity.clear();
	quantity.sendKeys(number);
	

}

public void addToCart() {
	addToCart.click();
}

public void viewCart() {
	viewCart.click();
}

public String firstProductInCartName() {
	return product_name_cart.getText();
}

public String first_productQuantity() {
	return product_quantity_cart.getText();
	
}

}
