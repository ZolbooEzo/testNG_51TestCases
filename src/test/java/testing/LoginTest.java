package testing;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class LoginTest extends CommonMethods{

	@Test (groups = {"login", "all"}, enabled = true)
	public void validUserNameAndValidPassword1() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		AssertJUnit.assertTrue(up.signOutLink.isDisplayed());
	}
	@Test(enabled = true, groups = {"login", "all"})
	public void incorrectUserNameAndIncorrectPassword2() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("falseUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("falsePassword"));
		click(map.loginButton);
		AssertJUnit.assertTrue(hp.notRegisteredError.isDisplayed());
	}
	
	@Test (enabled = true, groups = {"login", "all"})
	public void correctUserNameAndEmptyPassword3() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		click(map.loginButton);
		AssertJUnit.assertTrue(hp.passwordRequiredError.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"login", "all"})
	public void emptyUserNameAndCorrectPassword4() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		AssertJUnit.assertTrue(hp.userNameRequiredError.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"login", "all"})
	public void emptyUserNameAndemptyPassword5() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		click(map.loginButton);
		AssertJUnit.assertTrue(hp.userNameRequiredError.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"login", "all"})
	public void passwordShouldBeMasked6() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		AssertJUnit.assertTrue(map.passwordBox.getAttribute("type").equals(BaseClass.getProperty("passwordType")));
	}
	
	@Test(enabled = true, groups = {"login", "all"})
	public void handlesCaseSensitive7() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName").toLowerCase());
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword").toLowerCase());
		click(map.loginButton);
		AssertJUnit.assertTrue(hp.lostYourPasswordLink.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"login", "all"})
	public void loginAuthentication8() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		click(up.signOutLink);
		BaseClass.getDriver().navigate().back();
		AssertJUnit.assertTrue(map.userNameBox.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
