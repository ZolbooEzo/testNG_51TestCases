package testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ZRetryAnalyzer implements IRetryAnalyzer{

	int counter = 0;
	int testLimit = 3;
	
	

	@Override
	public boolean retry(ITestResult result) {
		if(counter < testLimit) {
			counter ++;
			return true;
		}		return false;
	}
}
