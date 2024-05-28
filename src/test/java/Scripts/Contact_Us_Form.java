package Scripts;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.Contact_Us_Form_page;

public class Contact_Us_Form extends BaseClass {

	@Test
	public void contact_details() throws InterruptedException
	{ SoftAssert softassert = new SoftAssert();
	Contact_Us_Form_page contact_us  =  new Contact_Us_Form_page(driver);
	softassert.assertTrue(contact_us.webpage_logo().isDisplayed());
	contact_us.contact_us();
	contact_us.name("vineela");
	contact_us.email("1996vineela@gmail.com");
	contact_us.subject("working on selinium");
	contact_us.message("this had helped me a lot thanks for the website");
	
	contact_us.choose_file().sendKeys("C:\\Users\\vkris\\Documents\\Veneela\\Job Prep Plan 2024.txt");
	File f = new File("C:\\\\Users\\\\vkris\\\\Documents\\\\Veneela\\\\Job Prep Plan 2024.txt");
	System.out.println("does file there?"+f.exists());
	contact_us.submit();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(alert.getText());
	alert.accept();
	softassert.assertEquals(contact_us.Success_message().getText(), "Success! Your details have been submitted successfully.");
	contact_us.Home_button();
	softassert.assertTrue(contact_us.webpage_logo().isDisplayed());
	softassert.assertAll();

	}

}
