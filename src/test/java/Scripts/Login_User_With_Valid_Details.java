package Scripts;

import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.Login_User_with_Valid_details_page;

public class Login_User_With_Valid_Details extends BaseClass{

	
	

	@Test(priority = 1)
public void enter_login_details() {
		Login_User_with_Valid_details_page login_user = new Login_User_with_Valid_details_page(driver);
	login_user.verify_login();
	login_user.login_email("somu@gmail.com1234567890");
	login_user.login_password("1234");
	login_user.login_button();
	
	}
	
	@Test(priority = 2)
	public void VerifyUser() {
		Login_User_with_Valid_details_page login_user = new Login_User_with_Valid_details_page(driver);
		login_user.verify_user_logged_in("vinnu");
		
	}
	
	@Test(priority = 3)
	public void delete_account() {
		Login_User_with_Valid_details_page login_user = new Login_User_with_Valid_details_page(driver);
		login_user.delete_account();
		
	}
}
