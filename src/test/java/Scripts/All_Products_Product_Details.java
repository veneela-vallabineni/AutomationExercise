package Scripts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.All_Product_Product_Details_Page;

public class All_Products_Product_Details extends BaseClass{

	@Test
	public void  verify_Products() {
		All_Product_Product_Details_Page product = new All_Product_Product_Details_Page(driver);
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(product.web_page_logo().isDisplayed());
		product.product_module();
		softassert.assertEquals(product.product_header().getText(), "ALL PRODUCTS");
		product.Allproducts();
		
		System.out.println("product name  "+product.product_name());
		System.out.println("product category   "+product.product_categoryr());
		System.out.println("product price  " +product.price());
		System.out.println("product availability  "+product.avaliability());
		System.out.println("product brand  "+product.brand());
		System.out.println("product condition  "+product.condition());
		
	}
	
	
}
