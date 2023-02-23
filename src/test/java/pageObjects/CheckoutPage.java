package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class CheckoutPage {

	
	public CheckoutPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	/*
	@FindBy (xpath = "")
	public WebElement ;
	*/
	
	@FindBy (xpath = "//*[@id='billing_first_name']")
	public WebElement firstNameBox;

	@FindBy (xpath = "//*[@id='billing_last_name']")
	public WebElement lastNameBox;
	
	@FindBy (xpath = "//*[@id='billing_email']")
	public WebElement emailBox;
	
	@FindBy (xpath = "//*[@id='billing_phone']")
	public WebElement phoneBox;
	
	@FindBy (xpath = "//*[@class='select2-choice']")
	public WebElement countryDrop;
	
	@FindBy (id = "s2id_autogen1_search")
	public WebElement countryBoxSearch;
	
	@FindBy (xpath = "//*[@id='billing_address_1']")
	public WebElement addressLine1;
	
	@FindBy (xpath = "//*[@id='billing_city']")
	public WebElement townDistrict;
	
	@FindBy (id = "s2id_billing_state")
	public WebElement regionDropDown;
	
	@FindBy (id = "s2id_autogen2_search")
	public WebElement stateSearchBox;
	
	@FindBy (xpath = "//*[contains(text(),'Billing Details')]")
	public WebElement billingDetails;

	@FindBy (xpath = "//*[contains(text(),'Additional Information')]")
	public WebElement additionalInfo;
	
	@FindBy (xpath = "//*[contains(text(),'Your order')]")
	public WebElement yourOrderInfo;
	
	@FindBy (xpath = "//*[@name='billing_postcode']")
	public WebElement postCode;
	
	@FindBy (xpath = "//input[@id='place_order']")
	public WebElement placeOrder;
	
	@FindBy (xpath = "//*[@id='page-35']/div/div/ul/li[1]")
	public WebElement orderConfirmationNumber;
	
	
}
