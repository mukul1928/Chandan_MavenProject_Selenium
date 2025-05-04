package class_69_AssertClassInSelenium_SoftAssert_and_HardAssertInSeleniumWithMainMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass_In_TestNG {
	@Test(invocationCount = 10)
	public void testcase1() {
		System.out.println("Lgoin ");
		Assert.assertEquals(false, false);
	}

}
