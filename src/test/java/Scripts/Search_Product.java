package Scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseClass;
import pompages.Product;
import pompages.Search_product_Page;

public class Search_Product extends BaseClass{

	@Test
	public void get_product_names() {
		Search_product_Page search_product = new Search_product_Page(driver);
		search_product.product_button();
		search_product.search();
		search_product.submit_search();
	List<WebElement> a = 	search_product.Searched_Product_names();
	
	 for(WebElement a1 : a) {
		 a1.getText();
		 System.out.println(a1.getText());
	 }
		
		
		
	}
	

	
}
