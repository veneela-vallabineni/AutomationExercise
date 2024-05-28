 package Scripts;

 import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.Subscription_home_page;

public class Subscription_home extends BaseClass {
	SoftAssert asert = new SoftAssert();
	@Test
	public void Verify_subscription() throws InterruptedException {
		
		Subscription_home_page hp = new Subscription_home_page(driver);
	    
		WebElement element = hp.footer();
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		Thread.sleep(1000);
		
		hp.email_text("1996vineela@gmail.com");
		Thread.sleep(1000);
		hp.subscribe();
		Thread.sleep(1000);
		asert.assertEquals(hp.Success_message().getText(), "You have been successfully subscribed!");
		
		asert.assertAll();
		
		
	}
}
