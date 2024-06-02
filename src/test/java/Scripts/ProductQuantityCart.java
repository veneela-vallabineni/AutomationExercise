package Scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompages.*;

import generics.BaseClass;

public class ProductQuantityCart extends BaseClass{
@Test
public void verifyProductQuantity() {
	Product_quantity_cart_page product_quantity = new Product_quantity_cart_page(driver);
	Actions action = new Actions(driver);
	//action.moveToElement(product_quantity.element()).click().perform();
	product_quantity.viewProduct();
	String product_name =product_quantity.firstProductName();
	
	product_quantity.quantity("10");
	product_quantity.addToCart();
	product_quantity.viewCart();
	String product_name_cart = product_quantity.firstProductInCartName();
	String quantity_cart = product_quantity.first_productQuantity();
	
	SoftAssert asert = new SoftAssert();
	asert.assertEquals(product_name_cart, product_name);
	asert.assertEquals(quantity_cart, "10");
	asert.assertAll();
}
}
