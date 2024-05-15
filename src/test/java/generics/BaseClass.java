package generics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.google.common.io.Files;
import com.google.j2objc.annotations.Property;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static  WebDriver driver;

	@BeforeTest
	@Parameters({"browser"})
	public void openApplication(@Optional("chrome") String browser ) throws InterruptedException {
		switch(browser.toLowerCase()) {
		case "chrome": {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver(); 
		break;
		}
		case "firefox": {
			WebDriverManager.firefoxdriver().setup();
			driver =  new FirefoxDriver(); 
			break;
		}
		
		
		}
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://automationexercise.com");

	}

	@AfterTest
	public void closeApllication() {
		driver.close();

	}
	
	public void getScreenShot(String filename)
	{
		System.out.println("file name" + filename );
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		File destFile = new File("./test-output/screenshot/"+filename);
		System.out.println("does file exist or not"+filename+ destFile.exists());
		try {
			Files.copy(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
