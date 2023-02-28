package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class LoginTest extends CommonMethods{

	@Test (enabled = true, groups = {"login", "all", "login1"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void validUserNameAndValidPassword1() { 
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		assertDisplayed(up.dashboardLink);
	}
	@Test(enabled = true, groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void incorrectUserNameAndIncorrectPassword2() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("falseUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("falsePassword"));
		click(map.loginButton);
		assertDisplayed(hp.notRegisteredError);
	}
	
	@Test (enabled = true, groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void correctUserNameAndEmptyPassword3() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		click(map.loginButton);
		assertDisplayed(hp.passwordRequiredError);
	}
	
	@Test(enabled = true, groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyUserNameAndCorrectPassword4() {
		click(hp.myAccountLink);
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		assertDisplayed(hp.userNameRequiredError);
	}
	
	@Test(enabled = true, groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyUserNameAndemptyPassword5() {
		click(hp.myAccountLink);
		click(map.loginButton);
		assertDisplayed(hp.userNameRequiredError);
	}
	
	@Test(enabled = true, groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void passwordShouldBeMasked6() {
		click(hp.myAccountLink);
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		Assert.assertTrue(map.passwordBox.getAttribute("type").equals(BaseClass.getProperty("passwordType")));
	}
	
	@Test(enabled = true, groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void handlesCaseSensitive7() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName").toLowerCase());
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword").toLowerCase());
		click(map.loginButton);
		assertDisplayed(hp.lostYourPasswordLink);
	}
	
	@Test(enabled = true, groups = {"login", "all", "login8"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void loginAuthentication8() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		click(up.signOutLink);
		navigateBack();
		if(BaseClass.getProperty("browser").equals("firefox")) {
			assertDisplayed(hp.javaScriptBookLink);
		} else if(BaseClass.getProperty("browser").equals("chrome")) {
			assertDisplayed(map.userNameBox);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
