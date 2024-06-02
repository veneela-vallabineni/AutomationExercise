package pompages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_product_Page {

	@FindBy(xpath = "//a[@href = \"/products\"]")
	private WebElement Products_button;
	
	@FindBy(xpath = "//input[@name = \"search\"]")
	private WebElement search;
	
	@FindBy(xpath = "//button[@id = \"submit_search\"]")
	private WebElement submit_search;
	
	@FindBy( xpath = "//div[contains(@class,'productinfo')]/p")
	private List<WebElement>  Searched_Product_names;
	
	@FindBy( xpath = "//div[contains(@class,'productinfo')]")
	private List<WebElement>  products;
	
	
	public Search_product_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void product_button() {
		Products_button.click();
	}
	
	public void search() {
		search.sendKeys("blue");
	}
	
	public void submit_search() {
		submit_search.click();
	}
	
	public List<WebElement> Searched_Product_names() {
		return Searched_Product_names;
	}
	
	
}
