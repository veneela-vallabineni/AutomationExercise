package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Logout_page {
	SoftAssert softassert = new SoftAssert();

	@FindBy(xpath = "//a[@href = '/logout']")
	private WebElement logout_button;
	
	@FindBy(xpath = "//h2[. = 'Login to your account']")
	private WebElement login_header;
	
	public Logout_page(WebDriver driver)
	{
		PageFactory.initElements(driver , this );
	}
	
	public void verify_Logout(String login_header_text) {
		
		logout_button.click();
		softassert.assertEquals(login_header.getText(), login_header_text);
		
		softassert.assertAll();
		
	}
}
