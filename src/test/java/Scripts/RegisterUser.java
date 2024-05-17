package Scripts;


import org.testng.annotations.Test;
import generics.BaseClass;

import pompages.RegisterUserpage;
public class RegisterUser extends BaseClass{
	private String name = "";
	private String email = "";
	public RegisterUser(String name ,String email){
		this.name = name;
		this.email= email;
	}

	

	@Test
	public  void signUpUser() throws Exception {

		RegisterUserpage user = new RegisterUserpage(driver);
		user.SIgnUPOrLoginButton();
		user.NewUserSignUP("New User Signup!");
		user.signUpName(name);
		user.signUpEmail(email);
		user.signUp();
		user.AccountInfo();}

	@Test(dependsOnMethods = "signUpUser" )
	public void accountDetails()
	{RegisterUserpage user = new RegisterUserpage(driver);
	
	user.genderSelection();
	user.enterPassword("name");
	user.CalenderSelection();
	user.sign_up_newslatter();
	user.recive_special_offers();
	user.address_info_first_name("email");
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
	}


	@Test(dependsOnMethods = {"signUpUser" , "accountDetails"})
	public void verifyaccount() {
		RegisterUserpage user = new RegisterUserpage(driver);
		user.continue_signup();
		user.logged_in_user();
	}

	@Test( dependsOnMethods = {"verifyaccount"})
	public void deleteAccount()
	{RegisterUserpage user = new RegisterUserpage(driver);
	user.delete_account();
	user.account_deleted();
	user.contine_with_other_activity();
	}

}
