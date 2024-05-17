package Scripts;

import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.Sign_Up_With_Registed_User_Page;

public class Sign_Up_With_Registered_User extends BaseClass{

	@Test
	public void Signup_with_registed_user() {
		
		Sign_Up_With_Registed_User_Page user =  new Sign_Up_With_Registed_User_Page(driver);
		
		user.SIgnUPOrLoginButton();
		user.signUpName("vineela");
		user.signUpEmail("vindf@gmail.com");
		user.signUp();
		user.verify_Registered_user("Email Address already exist!");
		
}}
