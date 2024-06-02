package Scripts;

import org.testng.annotations.Test;
import generics.BaseClass;
import pompages.*;

public class RemoveProductsFromCart extends BaseClass {
	@Test
	public void verifyRemoveProductFromCart() throws InterruptedException {
		Product_cart_page product_cart = new Product_cart_page(driver);
		product_cart.productButton();
		product_cart.get_first_two_products().get(0).getAddToCartButton().click();
		product_cart.continueShoping();
		product_cart.get_first_two_products().get(1).getAddToCartButton().click();
		product_cart.continueShoping();
		product_cart.cartButton();
		product_cart.verifyCartProducts().get(0).removeItemCart();
		product_cart.verifyCartProducts().get(1).removeItemCart();
	}



 



}