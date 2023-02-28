package testing;

import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class RegistrationTest extends CommonMethods{

	
	@Test(enabled = true, groups = {"registration", "all", "registration1"}, retryAnalyzer = ZRetryAnalyzer.class) // need to figure out a way to see password strength without sending password twice
	public void signInTest1() {
		click(hp.myAccountLink);
		sendKey(map.registerUserNameBox, mailGenerator());
		sendKeyPassword(map.registerPasswordBox, BaseClass.getProperty("validPassword"));
		click(map.registerButton);
		assertDisplayed(up.signOutLink);
	}
	
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void registrationWithInvalidEmailAddress2() {
		click(hp.myAccountLink);
		sendKey(map.registerUserNameBox, BaseClass.getProperty("falseUserName"));
		sendKeyPassword(map.registerPasswordBox, BaseClass.getProperty("validPassword"));
		click(map.registerButton);
		assertDisplayed(map.pleaseProvideValidEmaillError);
	}
	
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyEmailId3() {
		click(hp.myAccountLink);
		sendKeyPassword(map.registerPasswordBox, BaseClass.getProperty("validPassword"));
		click(map.registerButton);
		assertDisplayed(map.pleaseProvideValidEmaillError);
	}
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyPassword4() {
		click(hp.myAccountLink);
		sendKey(map.registerUserNameBox, mailGenerator());
		click(map.registerButton);
		assertDisplayed(map.pleaseEnterPasswordError);
	}
	
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyPasswordAndEmptyUserName5() {
		click(hp.myAccountLink);
		click(map.registerButton);
		assertDisplayed(map.pleaseProvideValidEmaillError);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
