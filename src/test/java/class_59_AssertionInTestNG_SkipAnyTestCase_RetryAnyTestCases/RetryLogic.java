package class_59_AssertionInTestNG_SkipAnyTestCase_RetryAnyTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
	int initial_count = 0;
	int actual_count = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(initial_count<actual_count) {
			initial_count++;
			return true;
		}
		return false;
	}
	

}
