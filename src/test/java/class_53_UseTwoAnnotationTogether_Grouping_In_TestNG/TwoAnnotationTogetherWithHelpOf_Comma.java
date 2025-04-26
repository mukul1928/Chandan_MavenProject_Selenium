package class_53_UseTwoAnnotationTogether_Grouping_In_TestNG;

import org.testng.annotations.Test;

public class TwoAnnotationTogetherWithHelpOf_Comma {
	@Test(priority = 10, invocationCount = 10)
	public void testcase1() {
		System.out.println("Priority,invocationCount");
	}

	@Test(priority = -1, enabled = false)
	public void testcase2() {
		System.out.println("priority,enabled");
	}

}
