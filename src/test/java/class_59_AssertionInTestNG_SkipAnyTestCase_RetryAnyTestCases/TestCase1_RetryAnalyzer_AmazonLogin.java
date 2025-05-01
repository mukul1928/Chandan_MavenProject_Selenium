package class_59_AssertionInTestNG_SkipAnyTestCase_RetryAnyTestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_RetryAnalyzer_AmazonLogin {
	@Test(retryAnalyzer=class_59_AssertionInTestNG_SkipAnyTestCase_RetryAnyTestCases.RetryLogic.class)
	public void amazon_login() {
		Assert.assertTrue(false);
	}

}
