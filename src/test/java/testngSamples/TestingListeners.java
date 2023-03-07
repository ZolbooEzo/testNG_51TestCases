package testngSamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersTestNG.class)
public class TestingListeners {

	
	
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String expectedTitle = "dwadawda";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	}
	
	@Test(priority =2)
	public void close() {
		
		driver.quit();
		Reporter.log("Driver closed after Testing");
	}
	
	
	
}
