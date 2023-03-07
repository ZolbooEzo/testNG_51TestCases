package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class LoginTest extends CommonMethods{
	
	@Test (groups = {"login", "all", "login1"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void validUserNameAndValidPassword1() { 
		map.doLogin();
		assertDisplayed(up.dashboardLink);
	}
	@Test(groups = {"login", "all", "login2"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void incorrectUserNameAndIncorrectPassword2() {
		map.doLogin(BaseClass.getProperty("falseUserName"), BaseClass.getProperty("falsePassword"));
		assertDisplayed(hp.notRegisteredError);
	}
	
	@Test (groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void correctUserNameAndEmptyPassword3() {
		map.fillUserNameLogin(BaseClass.getProperty("validUserName"));
		assertDisplayed(hp.passwordRequiredError);
	}
	
	@Test(groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyUserNameAndCorrectPassword4() {
		map.fillPasswordLogin(BaseClass.getProperty("validPassword"));
		assertDisplayed(hp.userNameRequiredError);
	}
	
	@Test(groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyUserNameAndemptyPassword5() {
		click(hp.myAccountLink);
		click(map.loginButton);
		assertDisplayed(hp.userNameRequiredError);
	}
	
	@Test(groups = {"login", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void passwordShouldBeMasked6() {
		click(hp.myAccountLink);
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		Assert.assertTrue(map.passwordBox.getAttribute("type").equals(BaseClass.getProperty("passwordType")));
	}
	
	@Test(groups = {"login", "all", "login7"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void handlesCaseSensitive7() {
		map.doLogin(BaseClass.getProperty("validUserName").toLowerCase(), BaseClass.getProperty("validPassword").toLowerCase());
		assertDisplayed(hp.lostYourPasswordLink);
	}
	
	@Test(groups = {"login", "all", "login8"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void loginAuthentication8() {
		map.doLogin(true);
		navigateBack();
		if(BaseClass.getProperty("browser").equals("firefox")) {
			assertDisplayed(hp.javaScriptBookLink);
		} else if(BaseClass.getProperty("browser").equals("chrome")) {
			assertDisplayed(map.userNameBox);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
