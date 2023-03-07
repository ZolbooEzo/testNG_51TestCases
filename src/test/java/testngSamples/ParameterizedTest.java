package testngSamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	
	@Test
	@Parameters("myName")
	public void paraMeterTest(String myName) {
		System.out.println("Parameterized name is 1111 " + myName);
	}
	
	@Test
	@Parameters("myName")
	public void paraMeterTest2(String myName) {
		System.out.println("Parameterized name is 2222" + myName);
		
	}
	
	
	@Test
	@Parameters("myName")
	public void paraMeterTest3(String myName) {
		System.out.println("Parameterized name is3333 " + myName);
	}
	
	
	@Test
	@Parameters("myName")
	public void paraMeterTes4t(String myName) {
		System.out.println("Parameterized name is44444 " + myName);
	}
}
