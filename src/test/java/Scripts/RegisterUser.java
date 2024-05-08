package Scripts;

import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.RegisterUserpage;

public class RegisterUser extends BaseClass{



	@Test
	public  void userRegistration() throws InterruptedException {

		RegisterUserpage user = new RegisterUserpage(driver);

		user.HomePageVisible();
		user.SIgnUPOrLoginButton();
		user.NewUserSignUP();
		user.signUpName("viqne1ela");
		user.signUpEmail("19q196vineela@gmail.com");
		user.signUp();
		user.AccountInfo();
		user.genderSelection();
		user.enterPassword("vineela");
		user.CalenderSelection();
		user.sign_up_newslatter();
		user.recive_special_offers();
		user.address_info_first_name("vineela");
		user.address_info_last_name("vallabineni");
		user.company("bosch");
		user.address1("adugodi");
		user.address2("kormangla");
		user.country();
		user.state("banglore");
		user.city("banglore");
		user.Zipcode("23456");
		user.mobilenumber("12345");
		user.create_Account();
		user.account_created();
		user.continue_signup();
		user.logged_in_user();
		user.delete_account();
		user.account_deleted();
		user.contine_with_other_activity();
		
	}

}
