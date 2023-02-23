package testing;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class RegistrationTest extends CommonMethods{

	
	@Test(enabled = true, groups = {"registration", "all"}) // need to figure out a way to see password strength without sending password twice
	public void signInTest1() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.registerUserNameBox, mailGenerator());
		sendKeyPassword(map.registerPasswordBox, BaseClass.getProperty("validPassword"));
		click(map.registerButton);
		AssertJUnit.assertTrue(up.signOutLink.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"registration", "all"})
	public void registrationWithInvalidEmailAddress2() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.registerUserNameBox, BaseClass.getProperty("falseUserName"));
		sendKeyPassword(map.registerPasswordBox, BaseClass.getProperty("validPassword"));
		click(map.registerButton);
		AssertJUnit.assertTrue(map.invalidEmailError.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"registration", "all"})
	public void emptyEmailId3() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKeyPassword(map.registerPasswordBox, BaseClass.getProperty("validPassword"));
		click(map.registerButton);
		AssertJUnit.assertTrue(map.invalidEmailError.isDisplayed());
	}
	@Test(enabled = true, groups = {"registration", "all"})
	public void emptyPassword4() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.registerUserNameBox, mailGenerator());
		click(map.registerButton);
		AssertJUnit.assertTrue(map.pleaseEnterPasswordError.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"registration", "all"})
	public void emptyPasswordAndEmptyUserName5() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		click(map.registerButton);
		AssertJUnit.assertTrue(map.pleaseProvideValidPasswordError.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
