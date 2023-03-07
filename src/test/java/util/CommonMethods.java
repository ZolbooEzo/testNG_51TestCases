package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods extends PageInitializer {

	public static void click(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public static void sendKey(WebElement element, String str) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element)).clear();
		element.sendKeys(str);
	}
	public static void sendKeyEnter(WebElement element, String str) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element)).clear();
		element.sendKeys(str, Keys.ENTER);
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
		for (int i = 0; i < len; i++) {
			storage += letters.charAt(random.nextInt(letters.length()));
		}
		return storage + "@gmail.com";
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendKeyPassword(WebElement element, String password) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element)).clear();
		element.sendKeys(password);
		wait(1);
		element.sendKeys("1");
	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 7);
		return wait;
	}

	public static Actions getActionsClass() {
		Actions action = new Actions(BaseClass.getDriver());
		return action;
	}

	public static void dragAndDrop(WebElement element, int x, int y) {
		getActionsClass().dragAndDropBy(element, x, y).perform();
		
	}

	public static ArrayList<Double> justPrice(List<WebElement> elements, ArrayList<Double> list) {
		for (WebElement el : elements) {
			Double p = Double.parseDouble(el.getText().substring(1, el.getText().length()));
			list.add(p);
		}
		return list;
	}

	public static Double justPrice(WebElement element) {
		String s = element.getText().substring(1, element.getText().length());
		Double d = Double.parseDouble(s);
		return d;
	}
	
	public static void dropDown(String value) {
		Select select = new Select(hp.sortingDropDown);
		select.selectByValue(value);
	}
	
	public static void scrollDown(int value) {
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
		js.executeScript("window.scrollBy(0, "+value+")");
	}
	
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	public static void javaClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public static void assertDisplayed(WebElement e) {
		waitForVisibility(e);
		Assert.assertTrue(e.isDisplayed());
	}
	
	
	
	public static void assertDisplayed(WebElement e, WebElement e2) {
		waitForVisibility(e);
		waitForVisibility(e2);
		Assert.assertTrue(e.isDisplayed() && e2.isDisplayed());
	}
	
	public static void assertDisplayed(WebElement e, WebElement e2, WebElement e3) {
		waitForVisibility(e);
		waitForVisibility(e2);
		waitForVisibility(e3);
		Assert.assertTrue(e.isDisplayed() && e2.isDisplayed() && e3.isDisplayed());
	}
	
	
	
	
	public static void navigateBack() {
		wait(1);
		BaseClass.getDriver().navigate().back();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
