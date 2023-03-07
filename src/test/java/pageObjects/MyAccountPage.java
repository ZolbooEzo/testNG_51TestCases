package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;
import util.CommonMethods;

public class MyAccountPage extends CommonMethods {

	public MyAccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='username']")
	public WebElement userNameBox;

	@FindBy(xpath = "//*[@id='password']")
	public WebElement passwordBox;

	@FindBy(xpath = "//*[@name='login']")
	public WebElement loginButton;

	@FindBy(xpath = "//*[@id='reg_password']")
	public WebElement registerPasswordBox;

	@FindBy(xpath = "//*[@id='reg_email']")
	public WebElement registerUserNameBox;

	@FindBy(xpath = "//*[@name='register']")
	public WebElement registerButton;

	@FindBy(xpath = "//*[contains(text(),'Please provide a valid email address.')]")
	public WebElement pleaseProvideValidEmaillError;

	@FindBy(xpath = "//*[contains(text(),'Username is required')]")
	public WebElement userNameRequiredError;

	@FindBy(xpath = "//*[contains(text(),'Please enter an account password.')]")
	public WebElement pleaseEnterPasswordError;

	public void doLogin(boolean signOut) {
		if (signOut) {
			click(hp.myAccountLink);
			sendKey(userNameBox, BaseClass.getProperty("validUserName"));
			sendKey(passwordBox, BaseClass.getProperty("validPassword"));
			click(loginButton);
			click(up.signOutLink);
		}
	}

	public void doLogin() {
		click(hp.myAccountLink);
		sendKey(userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(passwordBox, BaseClass.getProperty("validPassword"));
		click(loginButton);
	}

	public void doLogin(String userName, String password) {
		click(hp.myAccountLink);
		sendKey(userNameBox, userName);
		sendKey(passwordBox, password);
		click(loginButton);
	}

	public void fillUserNameLogin(String userName) {
		click(hp.myAccountLink);
		sendKey(userNameBox, userName);
		click(loginButton);
	}

	public void fillPasswordLogin(String password) {
		click(hp.myAccountLink);
		sendKey(passwordBox, password);
		click(loginButton);
	}

	public void doRegistration(String userName, String password) {
		click(hp.myAccountLink);
		sendKey(registerUserNameBox, userName);
		sendKeyPassword(registerPasswordBox, password);
		click(registerButton);
	}

	public void fillUserNameRegistration(String userName) {
		click(hp.myAccountLink);
		sendKey(registerUserNameBox, userName);
		click(registerButton);
	}

	public void fillPasswordRegistration(String password) {
		click(hp.myAccountLink);
		sendKeyPassword(registerPasswordBox, password);
		click(registerButton);
	}

}
