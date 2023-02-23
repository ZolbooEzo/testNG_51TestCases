package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class UserPage {

	public UserPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	/*
	 @FindBy (xpath = "")
	 public WebElement ;
	 */
	
	
	@FindBy (xpath = "//*[@class='woocommerce-MyAccount-content']/p/a")
	 public WebElement signOutLink;
	
	@FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li")
	 public WebElement dashboardLink;
	 
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[2]/a")
	 public WebElement ordersLink;
	 
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[3]/a")
	 public WebElement downloadsLink;

    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[4]/a")
	 public WebElement addressLink;
    
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[5]/a")
	 public WebElement accountDetails;
    
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[6]/a")
	 public WebElement logoutLink;
    
    @FindBy (xpath = "//*[@class='order-actions']/a")
	 public WebElement viewLink;
    
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-content']/h2")
	 public WebElement ordersDetailsText;
    
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-content']/header/h2")
	 public WebElement customerDetailsText;
    
    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-content']/header[2]/h3")
	 public WebElement billingAddressText;
    
    @FindBy (xpath = "//*[@class='order-number']")
	 public WebElement orderNumberText;
    
    @FindBy (xpath = "//*[@class='order-date']")
	 public WebElement orderDateText;
    
    @FindBy (xpath = "//*[@class='order-status']")
	 public WebElement orderStatusText;
    
    @FindBy (xpath = "//*[@class='woocommerce-Address-title title']/h3")
	 public WebElement billingAddress;
    
    @FindBy (xpath = "//*[@class='u-column2 col-2 woocommerce-Address']/header/h3")
	 public WebElement shippingAddress;
    
    @FindBy (xpath = "(//*[@class='woocommerce-Address-title title']/a)[2]")
    public WebElement shippingAddressEditButton;
    
    @FindBy (xpath = "//*[@name='save_address']")
    public WebElement saveAddressButton;
    
    @FindBy (xpath = "//*[@id='password_1']")
    public WebElement changePasswordBox;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
