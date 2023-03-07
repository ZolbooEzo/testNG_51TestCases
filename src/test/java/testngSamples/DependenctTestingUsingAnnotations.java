package testngSamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenctTestingUsingAnnotations {

	@Test
	public void test1() {
		System.out.println("test 1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void test3() {
		System.out.println("test 3");
	}
}
