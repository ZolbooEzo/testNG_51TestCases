package testing;

import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import util.CommonMethods;

public class ShopTest extends CommonMethods{

	
	@Test(enabled = true)
	public void checkPriceRange() {
		click(hp.shopMenuLink);
		refresh(hp.shopLink);
		click(hp.htmlLink);
		for (WebElement element : hp.htmlCategoryBooks) {
			AssertJUnit.assertTrue(element.isDisplayed());
		}
	}
}
