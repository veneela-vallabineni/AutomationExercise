package Scripts;

import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.Logout_page;

public class Logout_User extends BaseClass {


	@Test
	public void verify_Logout() {
		
		Logout_page logout = new Logout_page(driver);
		logout.verify_Logout("Login to your account");
	}
	
	

}
