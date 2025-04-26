package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
/*
 * Output-->
 * BeforeSuite
 * Test
 * AfterClass
 * AfterTest
 * AfterSuite
 */
public class Annotations_OrderOfExecution_BS_AT_AC_AS_Test {

	@BeforeSuite
	public void BS() {
		System.out.println("@BeforeSuite");
	}

	@AfterTest
	public void AT() {
		System.out.println("@AfterTest");
	}

	@AfterClass
	public void AC() {
		System.out.println("@AfterClass");
	}

	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite");
	}

	@Test
	public void test() {
		System.out.println("@Test");
	}

}
