package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_Class_Page {

	@FindBy(xpath = "//img[@alt = \"Website for automation practice\"]")
	private WebElement webpage_logo;
	
	@FindBy(xpath = "//a[@href = \"/test_cases\"]")
	private WebElement test_cases_button;
	
	@FindBy(xpath = "//h2/b[contains(text() , 'Test Cases')]")
	private WebElement test_case_header;
	
	public Test_Class_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement webpage_logo() {
		return webpage_logo;
	}
	
	public void  testcase_module() {
		test_cases_button.click();
	}
	
	public WebElement test_case_header() {
		return test_case_header;
	}
}
