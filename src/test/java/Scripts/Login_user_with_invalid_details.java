package Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.Login_user_with_invalid_details_page;

public class Login_user_with_invalid_details extends BaseClass {

	
	
	@Test
	public void verify_login() {
		SoftAssert softassert = new SoftAssert();
		Login_user_with_invalid_details_page login_user = new 	Login_user_with_invalid_details_page(driver);
		login_user.verify_login();
		login_user.login_email("vinnu@gmail.com");
		login_user.login_password("passowrd");
		login_user.login_button();
		//login_user.verify_error_message("Your email or password is incorrect!");
		WebElement error_text = login_user.getError();
		softassert.assertEquals(error_text.getText(),"Your email or password is incorrect!");
		softassert.assertAll();
	}
}
