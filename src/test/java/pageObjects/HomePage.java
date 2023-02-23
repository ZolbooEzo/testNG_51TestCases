package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	

	@FindBy (xpath = "//*[@id='menu-item-40']")
	public WebElement shopLink;
	
	@FindBy (xpath = "//*[@id='menu-item-50']")
	public WebElement myAccountLink;
	
	@FindBy (xpath = "//*[contains(text(),': the username ')]")
	public WebElement notRegisteredError;
	
	@FindBy (xpath = "//*[contains(text(),' Password is required.')]")
	public WebElement passwordRequiredError;
	
	@FindBy (xpath = "//*[contains(text(),'Username is required')]")
	public WebElement userNameRequiredError;
	
	@FindBy(xpath = "//*[@class='woocommerce-error']/li/a")
	public WebElement lostYourPasswordLink;
	
	@FindBy (xpath = "//*[@id='text-22-sub_row_1-0-2-2-0']")
	public WebElement javaScriptBookLink;

	@FindBy (xpath = "//*[@class='products']/li")
	public List <WebElement> numberOfBooksOnDisplay;
	
	@FindBy (xpath = "//*[@class='n2-padding']/div/div[3]")
	public List <WebElement> numberOfSliders;
	
	@FindBy (xpath = "//*[@class='single_add_to_cart_button button alt']")
	public WebElement addToBasket;
	
	@FindBy (xpath = "//*[contains(text(),'Product Description')]")
	public WebElement productDescription;
	
	@FindBy (xpath = "//*[@class='tabs wc-tabs']/li[2]")
	public WebElement reviewsClickable;
	
	@FindBy (xpath = "//*[@id='comments']/h2")
	public WebElement reviewsText;
	
	@FindBy (xpath = "//*[@id='content']/div/a")
	public WebElement viewCart;
	
	@FindBy (xpath = "//*[@class='cart_totals ']/table/tbody/tr/th")
	public WebElement subTotalText;
	
	@FindBy (xpath = "//*[@class='order-total']")
	public WebElement orderTotalText;
	
	@FindBy (xpath = "//*[@name='quantity']")
	public WebElement quantityInputBox;
	
	@FindBy (xpath = "//*[@class='input-text qty text']")
	public WebElement quantityInputBoxAfterAdding;
	
	@FindBy (xpath = "//*[@class='wc-proceed-to-checkout']/a")
	public WebElement proceedToCheckOutButton;
	
	@FindBy (xpath = "//*[@name='coupon_code']")
	public WebElement couponBox;
	
	@FindBy (xpath = "//*[@name='apply_coupon']")
	public WebElement couponApplyButton;
	
	@FindBy (xpath = "//*[@class='cart-discount coupon-krishnasakinala']")
	public WebElement couponClaimedMsg;
	
	@FindBy (xpath = "//*[@class='woocommerce-error']")
	public WebElement couponMinimum450Error;
	
	@FindBy (xpath = "//*[@class='remove']")
	public WebElement removeBookButton;
	
	@FindBy (xpath = "//*[@class='woocommerce-message']/a")
	public WebElement undoLink;
	
	@FindBy (xpath = "//*[@name='update_cart']")
	public WebElement updateBasketButton;
	
	@FindBy (xpath = "//*[@class='woocommerce-message']")
	public WebElement baskedUpdateConfirmation;

	@FindBy (xpath = "//*[@class='cart-subtotal']/td/span")
	public WebElement subtotalAmount;
	
	@FindBy (xpath = "//*[@class='order-total']/td/strong/span")
	public WebElement totalAmount;
	
	
	
	@FindBy (xpath = "//*[@id='menu-item-40']")
	public WebElement shopMenuLink;
	
	@FindBy (xpath = "//*[@class='product-categories']/li/a")
	public WebElement androidLink;
	
	@FindBy (xpath = "//*[@class='products masonry-done']/li/a/img")
	public List <WebElement> htmlCategoryBooks;
	
	@FindBy (xpath = "//*[@class='product-categories']/li[2]/a")
	public WebElement htmlLink;
	
	@FindBy (xpath = "//*[@class='products masonry-done']")
	public WebElement htmlCategoryWindows;
	
	@FindBy (xpath = "//*[@name='orderby']")
	public WebElement sortingDropDown;
	
	@FindBy (xpath = "//*[@class='products masonry-done']/li/a/img")
	public List<WebElement> sortingByPopularity;
	
	@FindBy (xpath = "//*[@class='products masonry-done']/li/a/img")
	public List<WebElement> newnessSortCategory;
	
	@FindBy (xpath = "//*[@class='products masonry-done']/li[3]/a")
	public WebElement readMoreButton;
	
	@FindBy (xpath = "//*[@class='stock out-of-stock']")
	public WebElement outOfStock;
	
	@FindBy (xpath = "//*[@class='products masonry-done']/li/a")
	public WebElement onSaleProduct;
	
	@FindBy (xpath = "//*[@class='price']/del/span")
	public WebElement bookOnSaleOldPrice;
	
	@FindBy (xpath = "//*[@class='price']/ins/span")
	public WebElement bookOnSaleNewPrice;
	
	
	
	
	
}
