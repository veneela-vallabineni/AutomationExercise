package Scripts;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.*;

public class RegisterWhileCheckOut extends BaseClass{
	
	@Test
	public void VerifyPlaceOrderRegisterWhileCheckout() throws InterruptedException {
		SoftAssert asert = new SoftAssert();
		Product_cart_page product_Cart= new Product_cart_page(driver);
		RegisterCheckOutPage register_checkout = new RegisterCheckOutPage(driver);
		RegisterUserpage register_user = new RegisterUserpage(driver);
		card_details_page card_details = new card_details_page(driver);
		product_Cart.productButton();
		Thread.sleep(10000);
		product_Cart.get_first_two_products().get(0).getAddToCartButton().click();
		Thread.sleep(10000);
		product_Cart.continueShoping();
		Thread.sleep(10000);
		product_Cart.get_first_two_products().get(1).getAddToCartButton().click();
		product_Cart.continueShoping();
		
		register_checkout.cart();
		String cart_message =register_checkout.shopingCartMessage();
		asert.assertEquals(cart_message, "Shopping Cart");
		register_checkout.proceedToCheckOut();
		register_checkout.registerOrLogin();
		register_user.signUpName("susmittha");
		register_user.signUpEmail("susmittha@gmail.com");
		register_user.signUp();
		register_user.genderSelection();
		register_user.enterPassword("Aa@1234567");
		register_user.CalenderSelection();
		register_user.sign_up_newslatter();
		register_user.recive_special_offers();
		register_user.address_info_first_name("khammam");
		register_user.address_info_last_name("raparthi nagar");
		register_user.company("bosch");
		register_user.address1("hyderabad");
		register_user.address2("manikonda");
		register_user.country();
		register_user.state("telangana");
		register_user.city("hyderabad");
		register_user.Zipcode("507002");
		register_user.mobilenumber("9701787403");
		register_user.create_Account();
		register_user.continue_signup();
		register_user.logged_in_user();
		register_checkout.cart();
		register_checkout.proceedToCheckOut();
		register_checkout.CommentMessage("test");
		register_checkout.PlaceOrder();
		card_details.CardName("hdfc");
		card_details.cardNumber("1234567890");
		card_details.cvc("123");
		card_details.ExpireyDate("22", "21");
		card_details.PayAndConform();
		asert.assertEquals(card_details.OrderPlaced(),"Congratulations! Your order has been confirmed!" );
		register_user.delete_account();
		asert.assertAll();
	
		
		
	}

}
