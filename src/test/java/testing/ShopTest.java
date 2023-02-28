package testing;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class ShopTest extends CommonMethods{

	@Test(enabled = true, groups = {"all", "shop"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void filterByPriceFinctionality1() {
		
		click(hp.shopMenuLink);
		dragAndDrop(hp.rightSlider, -28, 0);
		click(hp.filterButton);
		ArrayList<Double> pricesAmount = new ArrayList<>();
		justPrice(hp.newPrices, pricesAmount);
		justPrice(hp.prices, pricesAmount);
		Double low = justPrice(hp.fromPrice);
		Double high = justPrice(hp.toPrice);
		
		for (Double unit : pricesAmount) {
			Assert.assertTrue(unit >= low && unit <= high);
		}
		
	}
	
	@Test(enabled = true, groups = {"shop", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkPriceRange2() {
		String actual = "html";
		click(hp.shopMenuLink);
		click(hp.htmlLink);
		for (WebElement element : hp.bookTitles) {
			Assert.assertTrue(element.getText().toLowerCase().contains(actual));
		}
	}
	
	@Test(enabled = true, groups = {"shop", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void sortByPopularity3() {
		click(hp.shopMenuLink);
		dropDown("popularity");
		for (WebElement element : hp.popularBooks) {
			assertDisplayed(element);
		}
	}
	@Test(enabled = true, groups = {"shop", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void sortByAverage4() {
		click(hp.shopMenuLink);
		dropDown("rating");
		for (WebElement element : hp.popularBooks) {
			assertDisplayed(element);
		}
	}
	
	@Test(enabled = true, groups = {"shop", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void sortByDate5() {
		click(hp.shopMenuLink);
		dropDown("date");
		for (WebElement element : hp.popularBooks) {
			assertDisplayed(element);
		}
	}
	
	@Test(enabled = true, groups = {"shop", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void highToLow6() {
		click(hp.shopMenuLink);
		dropDown("price");
		for (WebElement element : hp.popularBooks) {
			assertDisplayed(element);
		}
	}
	
	@Test(enabled = true, groups = {"shop", "all", "shop7"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void readMoreFunctionality7() {
		click(hp.shopMenuLink);
		scrollDown(400);
		click(hp.readMoreButton);
		assertDisplayed(hp.outOfStock);
	}
	
	@Test(enabled = true, groups = {"shop", "all", "shop8"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void saleFunctionality8() {
		click(hp.shopMenuLink);
		click(hp.onSaleProduct);
		assertDisplayed(hp.bookOnSaleNewPrice, hp.bookOnSaleOldPrice);
	}
	
	@Test(enabled = true, groups = {"shop", "all", "shop9"})
	public void baskedFunctionality9() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		String totalAmountInText = hp.totalAmount.getText().substring(1, hp.totalAmount.getText().length() -1);
		String subtotalAmountInText = hp.subtotalAmount.getText().substring(1, hp.subtotalAmount.getText().length() -1);
		double total = Double.parseDouble(totalAmountInText);
		double subtotal = Double.parseDouble(subtotalAmountInText);
		Assert.assertTrue(total > subtotal);
		click(hp.proceedToCheckOutButton);
		assertDisplayed(cp.billingDetails, cp.additionalInfo, cp.yourOrderInfo);
		sendKey(cp.firstNameBox, BaseClass.getProperty("fname"));
		sendKey(cp.lastNameBox, BaseClass.getProperty("lname"));
		sendKey(cp.emailBox, BaseClass.getProperty("email"));
		sendKey(cp.phoneBox, BaseClass.getProperty("phone"));
		click(cp.countryDrop);
		sendKeyEnter(cp.countryBoxSearch, BaseClass.getProperty("country"));
		sendKey(cp.addressLine1, BaseClass.getProperty("address"));
		sendKey(cp.townDistrict, BaseClass.getProperty("city"));
		click(cp.regionDropDown);
		sendKeyEnter(cp.stateSearchBox, BaseClass.getProperty("region"));
		sendKey(cp.postCode, BaseClass.getProperty("zip"));
		javaClick(cp.cashOnDelivery);
		scrollToElement(cp.placeOrder);
		wait(3);
		click(cp.placeOrder);
		assertDisplayed(cp.orderConfirmationNumber);
	}
	
	@Test(enabled = true, groups = {"shop", "all", "shop10"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void orderConfirmation10() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		click(hp.proceedToCheckOutButton);
		sendKey(cp.firstNameBox, BaseClass.getProperty("fname"));
		sendKey(cp.lastNameBox, BaseClass.getProperty("lname"));
		sendKey(cp.emailBox, BaseClass.getProperty("email"));
		sendKey(cp.phoneBox, BaseClass.getProperty("phone"));
		click(cp.countryDrop);
		sendKeyEnter(cp.countryBoxSearch, BaseClass.getProperty("country"));
		sendKey(cp.addressLine1, BaseClass.getProperty("address"));
		scrollDown(400);
		sendKey(cp.townDistrict, BaseClass.getProperty("city"));
		click(cp.regionDropDown);
		sendKeyEnter(cp.stateSearchBox, BaseClass.getProperty("region"));
		sendKey(cp.postCode, BaseClass.getProperty("zip"));
		javaClick(cp.cashOnDelivery);
		scrollToElement(cp.placeOrder);
		wait(3);
		click(cp.placeOrder);
		assertDisplayed(cp.finalOrderDetails);
		
	}
	
	@Test(enabled = true, groups = {"all", "shop","shop11"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void calculateTaxRate11() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.viewCart);
		waitForVisibility(hp.tax);
		Double taxAmountIndia = justPrice(hp.tax);
		Double subTotalIndia = justPrice(hp.subtotalAmount);
		int taxRateIndia = (int) ((taxAmountIndia / subTotalIndia) * 100);
		click(hp.proceedToCheckOutButton);
		click(cp.countryDrop);
		sendKeyEnter(cp.countryBoxSearch, BaseClass.getProperty("country"));
		waitForVisibility(hp.roamingTax);
		Double taxAmountAbroad = justPrice(hp.roamingTax);
		Double subTotalAbroad = justPrice(hp.subtotalAmount);
		int taxRateAbroad = (int)((taxAmountAbroad / subTotalAbroad) * 100);
		Assert.assertEquals(2, taxRateIndia);
		Assert.assertEquals(5, taxRateAbroad);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
