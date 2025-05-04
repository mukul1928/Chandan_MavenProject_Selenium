package class_69_AssertClassInSelenium_SoftAssert_and_HardAssertInSeleniumWithMainMethod;

import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertClassInSelenium {
	public static void main(String[] args) {
		SoftAssert s1 = new SoftAssert(); // Softassert is a class
		s1.assertEquals(true, false);

		// ========== Hard Assert =================//
		Assertion s2 = new Assertion(); //Assertion is a class
		s2.assertEquals(true, false);
	}

}
