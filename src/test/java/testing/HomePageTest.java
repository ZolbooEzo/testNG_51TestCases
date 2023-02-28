package testing;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class HomePageTest extends CommonMethods {

	@Test(enabled = true, groups = { "all", "homePage" })
	public void threeSlidersOnly1() {
		click(hp.shopMenuLink);
		click(hp.homeMenu);
		Assert.assertTrue(hp.sliders.size() == 3);
	}

	@Test(enabled = true, groups = { "all", "homePage", "homePage2" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void threeArrivalsOnly2() {
		click(hp.shopMenuLink);
		click(hp.homeMenu);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < hp.arrivals.size(); i++) {
			click(hp.arrivals.get(i));
			wait(1);
			list.add(hp.bookTitle.getText());
			navigateBack();
		}
		Assert.assertTrue(list.size() == 3);
	}

	@Test(enabled = true, groups = { "all", "homePage", "homePage3" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void arrivalsShouldNavigate3() {
		click(hp.shopMenuLink);
		click(hp.homeMenu);
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.viewCart);
		assertDisplayed(hp.proceedToCheckOutButton);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void arrivalsImageDescription4() {
		click(hp.javaScriptBookLink);
		click(hp.reviewsClickable);
		click(hp.productDescriptionClickable);
		assertDisplayed(hp.productDescriptionText);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void arrivalImageReview() {
		click(hp.javaScriptBookLink);
		click(hp.reviewsClickable);
		assertDisplayed(hp.reviewsText);
		wait(4);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void addToBasket() {
		click(hp.shopMenuLink);
		click(hp.homeMenu);
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		assertDisplayed(hp.proceedToCheckOutButton);
	}

	@Test(enabled = true, groups = { "all", "homePage", "homePage7"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkOverLoadedOrder7() {
		click(hp.shopMenuLink);
		click(hp.homeMenu);
		click(hp.javaScriptBookLink);
		sendKey(hp.quantityInputBox, "5000");
		click(hp.addToBasket);
		if (BaseClass.getProperty("browser").equals("firefox")) {
			Assert.assertTrue(hp.quantityInputBox.getAttribute("validationMessage").contains(BaseClass.getProperty("quantityInputWarningFirefox")));
		} else if (BaseClass.getProperty("browser").equals("chrome")) {
			Assert.assertTrue(hp.quantityInputBox.getAttribute("validationMessage").contains(BaseClass.getProperty("quantityInputWarningChrome")));
		}
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkOutTitle() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		click(hp.proceedToCheckOutButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains(BaseClass.getProperty("checkOutPageTitle")));
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void couponApply() {
		click(hp.javaScriptBookLink);
		sendKey(hp.quantityInputBox, "2");
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		sendKey(hp.couponBox, BaseClass.getProperty("couponCode"));
		click(hp.couponApplyButton);
		assertDisplayed(hp.couponClaimedMsg);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void couponApplyLessThan450() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		sendKey(hp.couponBox, BaseClass.getProperty("couponCode"));
		click(hp.couponApplyButton);
		assertDisplayed(hp.couponMinimum450Error);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void removeItem() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		click(hp.removeBookButton);
		assertDisplayed(hp.bookSuccessRemoved);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void updatebasket() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		sendKey(hp.quantityInputBoxAfterAdding, "2");
		click(hp.updateBasketButton);
		assertDisplayed(hp.baskedUpdateConfirmation);
	}

	@Test(enabled = true, groups = { "all", "homePage" }, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkTotalAtCheckoutPage() {
		click(hp.javaScriptBookLink);
		click(hp.addToBasket);
		click(hp.cartLinkInMenu);
		click(hp.proceedToCheckOutButton);
		assertDisplayed(hp.totalAmount);
	}

}
