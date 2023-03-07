package testing;

import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;

public class MyAccountTest extends CommonMethods{

	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkDashboardLink1() {
		map.doLogin();
		assertDisplayed(up.dashboardLink);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all", "myAccount2"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkViewOrderLink2() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.ordersLink);
		click(up.viewLink);
		assertDisplayed(up.ordersDetailsText);
	}
	
	
	@Test(enabled = true, groups = {"myAccount", "all", "myAccount3"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkViewOrderLinkDetails3() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.ordersLink);
		click(up.viewLink);
		assertDisplayed(up.ordersDetailsText, up.billingAddressText, up.customerDetailsText);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all", "myAccount4"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void checkStatusDateDetails4() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.ordersLink);
		click(up.viewLink);
		assertDisplayed(up.orderNumberText, up.orderDateText, up.orderStatusText);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void addressFunctionalityCheck5() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.addressLink);
		assertDisplayed(up.billingAddress, up.shippingAddress);
	}
	
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void editShippingAddressCheck6() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.addressLink);
		click(up.shippingAddressEditButton);
		assertDisplayed(up.saveAddressButton);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void accountDetailsFunctionCheck7() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.accountDetails);
		assertDisplayed(up.changePasswordBox);
	}
	
	@Test(enabled = true, groups = {"myAccount", "all"}, retryAnalyzer = ZRetryAnalyzer.class)
	public void logoutCheck8() {
		map.doLogin(BaseClass.getProperty("validUserNameWithOrder"), BaseClass.getProperty("validPasswordWithOrder"));
		click(up.logoutLink);
		assertDisplayed(map.userNameBox);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
