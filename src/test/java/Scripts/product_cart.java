package Scripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.Product;
import pompages.Product_cart_page;

public class product_cart extends BaseClass{
		
	
	
	
	
	@Test
	public void add_items_to_cart_and_verify() {
		Product_cart_page product = new Product_cart_page(driver);
		
		product.productButton();
		
		
		
		ArrayList<Product> first_two_products = product.get_first_two_products();
		System.out.println(first_two_products.get(0).getProductName());
		
	String	first_product_name =  first_two_products.get(0).getProductName();
	
	String first_product_price = first_two_products.get(0).getProductAmount();
	
	first_two_products.get(0).getAddToCartButton().click();
	
	product.continueShoping();
	
	
	System.out.println(first_two_products.get(0).getProductName());
	
	String	secound_product_name =  first_two_products.get(1).getProductName();
	
	String secound_product_price = first_two_products.get(1).getProductAmount();
	
	
	first_two_products.get(1).getAddToCartButton().click();
	
	product.viewCart();
	
	
	
	
		
		
		
		
		
	}
	
	
	
}
