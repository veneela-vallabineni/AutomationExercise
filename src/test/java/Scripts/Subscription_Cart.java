package Scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.Subscrpition_Cart_Page;

public class Subscription_Cart extends BaseClass{

	@Test
	public void subscription() throws InterruptedException {
		
		Subscrpition_Cart_Page cart_page = new Subscrpition_Cart_Page(driver);
		SoftAssert asert = new SoftAssert();
		cart_page.cart();
		Actions action = new Actions(driver);
		action.moveToElement(cart_page.footer());
		Thread.sleep(1000);
		action.perform();
		cart_page.email_text("1996vineela@gmail.com");
		Thread.sleep(1000);
		cart_page.subscribe_button();
		Thread.sleep(1000);
		asert.assertEquals(cart_page.success_message().getText(), "You have been successfully subscribed!");
		
		
		
		
	}
}
