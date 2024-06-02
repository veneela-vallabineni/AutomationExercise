package Scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.*;

public class RegisterBeforeCheckout extends BaseClass{

	@Test
	public void verifyRegisterBeforeCheckout() {
		SoftAssert asert = new SoftAssert();
	RegisterCheckOutPage register_checkout = new RegisterCheckOutPage(driver);
	RegisterUserpage register_user = new RegisterUserpage(driver);
	Product_cart_page product_cart = new Product_cart_page(driver);
	card_details_page card_details = new card_details_page(driver);
	register_user.SIgnUPOrLoginButton();
	register_user.signUpName("bindhu");
	register_user.signUpEmail("bindhu@gmail.com");
	register_user.signUp();
	register_user.genderSelection();
	register_user.enterPassword("Aa@1234567");
	register_user.CalenderSelection();
	register_user.sign_up_newslatter();
	register_user.address_info_first_name("vineela");
	register_user.address_info_last_name("vallabineni");
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
	
	product_cart.get_first_two_products().get(0).getAddToCartButton();
	product_cart.continueShoping();
	product_cart.get_first_two_products().get(1).getAddToCartButton();
	product_cart.continueShoping();
	
	register_checkout.cart();
	register_checkout.proceedToCheckOut();
	register_checkout.CommentMessage("test");
	register_checkout.PlaceOrder();
	
	card_details.CardName("hdfc");
	card_details.cardNumber("1234567890");
	card_details.cvc("500");
	card_details.ExpireyDate("21", "22");
	card_details.PayAndConform();
	asert.assertEquals(card_details.OrderPlaced(), "Congratulations! Your order has been confirmed!");
	
	}
	
	

}
