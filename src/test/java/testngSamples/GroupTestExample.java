package testngSamples;

import org.testng.annotations.Test;

public class GroupTestExample {

	
	@Test(groups = "smokeTestSuite", enabled = true)
	public void test1() {
		System.out.println("test 1 - this is the one");
	}
}
