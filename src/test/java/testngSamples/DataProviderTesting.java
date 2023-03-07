package testngSamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {

	
	@DataProvider(name = "names")
	public Object[][] dpMethod() {
		return new Object[][] {{"gold"}, {"fish"}, {false}, {4.44}};
	}
	
	@Test(dataProvider = "names")
	public void myTest(Object val) {
		System.out.println("Parameter than passed is " + val);
	}
	
	
	
	
}
