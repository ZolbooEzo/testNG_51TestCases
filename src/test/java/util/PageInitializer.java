package util;

import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.UserPage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static MyAccountPage map;
	public static UserPage up;
	public static CheckoutPage cp;
	
	
	public static void initialize() {
		hp = new HomePage();
		map = new MyAccountPage();
		up = new UserPage();
		cp = new CheckoutPage();
	}
}
