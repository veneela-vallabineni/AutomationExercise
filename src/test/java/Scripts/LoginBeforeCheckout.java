package Scripts;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.*;

public class LoginBeforeCheckout extends BaseClass {

	@Test
	public void verifyLoginBeforeCheckOut() throws InterruptedException {
		Login_User_With_Valid_Details user = new Login_User_With_Valid_Details();
		Product_cart_page product_cart = new Product_cart_page(driver);
		RegisterCheckOutPage  checkout = new RegisterCheckOutPage(driver);
		card_details_page card = new card_details_page(driver);
		Logout_User  user_logout = new Logout_User();
		user_logout.verify_Logout();
		user.enter_login_details();
		user.VerifyUser();
		product_cart.get_first_two_products().get(0).getAddToCartButton();
		product_cart.get_first_two_products().get(1).getAddToCartButton();
		checkout.cart();
		//String cart_message = checkout.shopingCartMessage();
		//assert.assertEquals(cart_message ,"Shopping Cart");
		checkout.proceedToCheckOut();
		Thread.sleep(1000);
		checkout.CommentMessage("test");
		checkout.PlaceOrder();
		card.CardName("vineela");
		card.cardNumber("1234567890");
		card.cvc("123");
		card.ExpireyDate("21", "22");
		card.PayAndConform();
		card.OrderPlaced();
		user_logout.verify_Logout();

		
	}
	
	
	
}
