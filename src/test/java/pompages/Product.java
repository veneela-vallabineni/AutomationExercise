package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// TODO Can actually be a sub class in one of the pages??
// But since it could be reused, it is better to keep it in a separate file

public class Product {
	
	private String productName;
	private String productAmount;
	private WebElement addToCartButton;
	
	public Product(WebElement productElement) {
		this.productAmount = productElement.findElement(By.tagName("H2")).getText();
		 this.productName = productElement.findElement(By.tagName("P")).getText();
		 this.addToCartButton = productElement.findElement(By.tagName("A"));
	}

	public String getProductName() {
		return productName;
	}

	public String getProductAmount() {
		return productAmount;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	
	
}
