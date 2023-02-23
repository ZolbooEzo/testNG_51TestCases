package util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	private static WebDriver driver;
	private static Properties pro;
	
	@BeforeMethod
	public static WebDriver getDriver() {
		
		if(driver == null) {
			String browser = BaseClass.getProperty("browser");
			
			switch(browser) {
			
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			default:
				throw new IllegalArgumentException("Please prove correct browser name!");
			}
			
			driver.manage().window().maximize();
			driver.get(BaseClass.getProperty("baseUrl"));
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			PageInitializer.initialize();
		}
		return driver;
	}
	
	@AfterMethod
	public static void closeDriver() {
		if(driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
	
	
	static {
		try {
			
			String filePath = "src/test/resources/files/configurations.properties";
			FileInputStream fis = new FileInputStream(filePath);
			
			pro = new Properties();
			pro.load(fis);
			fis.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getProperty(String keyName) {
		return pro.getProperty(keyName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
