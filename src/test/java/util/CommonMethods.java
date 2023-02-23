package util;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer{

	
	
	public static void click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
	
	}
	
	public static void sendKey(WebElement element, String str ) {
		element.clear();
		element.sendKeys(str);
	}
	
	public static void refresh(WebElement element) {
		BaseClass.getDriver().navigate().refresh();
		click(element);
	}
	
	public static String mailGenerator() {
		Random random = new Random();
		String letters = "abcdefghijklmnpoqrstuwvxyz";
		int len = 8;
		String storage = "";
		for(int i = 0; i < len; i++) {
			storage += letters.charAt(random.nextInt(letters.length()));
		}
		return storage + "@gmail.com";
	}
	
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sendKeyPassword(WebElement element, String password) {
		element.clear();
		element.sendKeys(password);
		wait(1);
		element.sendKeys("1");
	}
	
	
	
	
}
