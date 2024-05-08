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
		user.signUpName("vineela");
		user.signUpEmail("1996vineela@gmail.com");
		user.signUp();
		user.AccountInfo();
		user.genderSelection();
		
	Thread.sleep(10000);
		user.CalenderDaysSelection();
		Thread.sleep(10000);

	}

}
