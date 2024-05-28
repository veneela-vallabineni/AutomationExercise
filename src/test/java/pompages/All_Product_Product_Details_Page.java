package pompages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Product_Product_Details_Page {

	@FindBy(xpath = "//img[@alt = \"Website for automation practice\"]")
	private WebElement web_page_logo;
	
	@FindBy(xpath = "//a[@href = \"/products\"]")
	private WebElement Products_button;
	
	@FindBy(xpath = "//h2[contains(text() , 'All Products')]")
	private WebElement all_products_header;
	
	@FindBy(xpath = "//i[@class = \"fa fa-plus-square\"]")
	private WebElement all_products;
	
	@FindBy(xpath = "//img[@alt =  \"ecommerce website products\"]/following-sibling::h2")
	private WebElement product_name;
	
	@FindBy(xpath = "//img[@alt =  \"ecommerce website products\"]/following-sibling::p[contains(text() ,'Category')]")
	private WebElement category;
	
	@FindBy(xpath = "//img[@alt =  \"ecommerce website products\"]/following-sibling::span/span[contains(text(),'Rs')]")
	private WebElement price;
	
	@FindBy(xpath = "//img[@alt =  \"ecommerce website products\"]/following-sibling::p[contains(.,'Availability:')]")
	private WebElement availability;
	
	@FindBy(xpath = "//img[@alt =  \"ecommerce website products\"]/following-sibling::p[contains(.,'Condition:')]")
	private WebElement condition;
	
	@FindBy(xpath = "//img[@alt =  \"ecommerce website products\"]/following-sibling::p[contains(.,'Brand:')]")
	private WebElement brand;
	
	
	public All_Product_Product_Details_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement web_page_logo() {
		return web_page_logo;
		
	}
	
	public void product_module() {
		Products_button.click();
		
	}
	
	public WebElement product_header() {
		return all_products_header;
	}
	
	public void Allproducts() {
		all_products.click();
	}
	
	public String  product_name() {
	return	product_name.getText();
			}
	
	public String product_categoryr() {
		return category.getText();
	}
	
	public String price() {
		return price.getText();
	}
	
	public String avaliability() {
		return availability.getText();
	}
	
	public String condition() {
		return condition.getText();
	}
	
	public String brand() {
		return brand.getText();
	}
	

	
}
