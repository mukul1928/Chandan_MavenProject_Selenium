package class_62_Reporter.log_Listeners_In_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Log {
	@Test
	public void testcase1() {
		System.out.println("Test case pass");
		Reporter.log("Test Case Pass");
	}

}
