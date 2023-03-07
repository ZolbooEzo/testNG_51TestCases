package testngSamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryAnalyzer {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
}
