package testing;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class MyAccountTest extends CommonMethods{

	@Test(enabled = true, groups = {"myAccount", "all"})
	public void checkDashboardLink1() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserName"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPassword"));
		click(map.loginButton);
		AssertJUnit.assertTrue(up.dashboardLink.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void checkViewOrderLink() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.ordersLink);
		click(up.viewLink);
		AssertJUnit.assertTrue(up.ordersDetailsText.isDisplayed());
	}
	
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void checkViewOrderLinkDetails() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.ordersLink);
		click(up.viewLink);
		AssertJUnit.assertTrue(up.ordersDetailsText.isDisplayed() && up.billingAddressText.isDisplayed() && up.customerDetailsText.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void checkStatusDateDetails() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.ordersLink);
		click(up.viewLink);
		AssertJUnit.assertTrue(up.orderNumberText.isDisplayed() && up.orderDateText.isDisplayed() && up.orderStatusText.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void addressFunctionalityCheck() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.addressLink);
		AssertJUnit.assertTrue(up.billingAddress.isDisplayed() && up.shippingAddress.isDisplayed());
	}
	
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void editShippingAddressCheck() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.addressLink);
		click(up.shippingAddressEditButton);
		AssertJUnit.assertTrue(up.saveAddressButton.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void accountDetailsFunctionCheck() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.accountDetails);
		AssertJUnit.assertTrue(up.changePasswordBox.isDisplayed());
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"})
	public void logoutCheck() {
		click(hp.myAccountLink);
		refresh(hp.myAccountLink);
		sendKey(map.userNameBox, BaseClass.getProperty("validUserNameWithOrder"));
		sendKey(map.passwordBox, BaseClass.getProperty("validPasswordWithOrder"));
		click(map.loginButton);
		click(hp.myAccountLink);
		click(up.logoutLink);
		AssertJUnit.assertTrue(map.userNameBox.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
