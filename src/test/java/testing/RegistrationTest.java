package testing;

import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class RegistrationTest extends CommonMethods{

	
	@Test(enabled = true, groups = {"registration", "all", "registration1"}, retryAnalyzer = ZRetryAnalyzer.class) // need to figure out a way to see password strength without sending password twice
	public void signInTest1() {
		map.doRegistration(mailGenerator(), BaseClass.getProperty("validPassword"));
		assertDisplayed(up.signOutLink);
	}
	
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void registrationWithInvalidEmailAddress2() {
		map.doRegistration(BaseClass.getProperty("falseUserName"), BaseClass.getProperty("validPassword"));
		assertDisplayed(map.pleaseProvideValidEmaillError);
	}
	
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyEmailId3() {
		map.fillPasswordRegistration(BaseClass.getProperty("validPassword"));
		assertDisplayed(map.pleaseProvideValidEmaillError);
	}
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyPassword4() {
		map.fillUserNameRegistration(mailGenerator());
		assertDisplayed(map.pleaseEnterPasswordError);
	}
	
	@Test(enabled = true, groups = {"registration", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void emptyPasswordAndEmptyUserName5() {
		click(hp.myAccountLink);
		click(map.registerButton);
		assertDisplayed(map.pleaseProvideValidEmaillError);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
