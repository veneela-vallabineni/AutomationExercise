package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static  WebDriver driver;

	@BeforeMethod
	public void openApplication() throws InterruptedException {
		System.out.println("xzzxc");
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://automationexercise.com");

	}

	@AfterMethod
	public void closeApllication() {
		driver.close();

	}

}
