package testing;

import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class MyAccountTest extends CommonMethods{

	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkDashboardLink1() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		assertDisplayed(up.dashboardLink);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkViewOrderLink2() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(up.ordersLink);
		click(up.viewLink);
		assertDisplayed(up.ordersDetailsText);
	}
	
	
	@Test(enabled = true, groups = {"myAccount", "all", "myAccount3"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkViewOrderLinkDetails3() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(up.ordersLink);
		click(up.viewLink);
		assertDisplayed(up.ordersDetailsText, up.billingAddressText, up.customerDetailsText);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all", "myAccount4"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkStatusDateDetails4() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(up.ordersLink);
		click(up.viewLink);
		assertDisplayed(up.orderNumberText, up.orderDateText, up.orderStatusText);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void addressFunctionalityCheck5() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(up.addressLink);
		assertDisplayed(up.billingAddress, up.shippingAddress);
	}
	
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void editShippingAddressCheck6() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.addressLink);
		click(up.shippingAddressEditButton);
		assertDisplayed(up.saveAddressButton);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void accountDetailsFunctionCheck7() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(up.accountDetails);
		assertDisplayed(up.changePasswordBox);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void logoutCheck8() {
		click(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(up.logoutLink);
		assertDisplayed(map.userNameBox);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
