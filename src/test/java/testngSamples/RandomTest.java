package testngSamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RandomTest {




	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod-----------------------");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod------------------------");
	}

	@Test
	public void testing() {
		System.out.println("Test # 1");
	}
	@Test
	public void testing2() {
		System.out.println("this # 2");
	}

}
