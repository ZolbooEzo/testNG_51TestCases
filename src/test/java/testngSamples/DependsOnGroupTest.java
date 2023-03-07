package testngSamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupTest {

	
	@Test(groups = "smokeTestSuite")
	public void test1() {
		System.out.println("test   1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnGroups = "smokeTestSuite")
	public void test2() {
		System.out.println("this is the depends on one");
	}
	
	@Test(groups = "regressionTest")
	public void test3() {
		System.out.println("this is the only regression");
	}
}
