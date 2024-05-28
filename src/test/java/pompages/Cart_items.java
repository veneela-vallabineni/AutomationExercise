package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cart_items {
private String product_name;
private String price;
private String quanity;
private String total;
private WebElement remove_item_cart;


Cart_items(WebElement cart_items){
this.product_name = cart_items.findElement(By.xpath("td[@class = \"cart_description\"]/h4/a")).getText();
this.price = cart_items.findElement(By.xpath("td[@class = \"cart_price\"]/p")).getText();
this.quanity = cart_items.findElement(By.xpath("//tr[contains(@id , 'product')]/td[@class = \"cart_quantity\"]/button")).getText();
this.total = cart_items.findElement(By.xpath("//tr[contains(@id , 'product')]/td[@class = \"cart_total\"]/p")).getText();
this.remove_item_cart = cart_items.findElement(By.xpath("td[@class = \"cart_delete\"]"));
}


public String productName() {
	return product_name;
}

public String  price() {
	return price;
}

public String  quantity() {
	return quanity;
}

public String total() {
	return total;
}

public void removeItemCart() {
   remove_item_cart.click();
}
}
