package pompages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Product_cart_page {

	@FindBy(xpath = "//li//a[@href = \"/products\"]")
	private WebElement product;
	
	@FindBy( xpath = "//div[contains(@class,'productinfo')]")
	private List<WebElement>  products;
	
	@FindBy(xpath = "//button[contains(text() , 'Continue Shopping')]")
	private WebElement Continue_shoping;
	
	@FindBy(xpath = "//u[contains(text() , 'View Cart')]")
	private WebElement view_cart;
	
	@FindBy(xpath = "//tr[contains(@id , 'product')]")
	private List<WebElement> products_list;
	
	
	public Product_cart_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void productButton() {
		product.click(); 
	}
	

	
	public ArrayList<Product> get_first_two_products() {
		ArrayList<Product> productList = new ArrayList<Product>();
  		for(WebElement productElem : products.subList(0, 2)) {
			productList.add(new Product(productElem));
		}
		
		return productList;
	}
	
	public void continueShoping() {
		Continue_shoping.click();
	}
	
	public void viewCart() {
		view_cart.click();
	}
	
	public ArrayList<Cart_items> verifyCartProducts() {
		
		ArrayList<Cart_items>  item_list = new ArrayList<Cart_items>();
		for(WebElement cartitem : products_list) {
			
			item_list.add(new Cart_items(cartitem));
			
		}
		return  item_list;
	}
	
	
	
	
	
}
