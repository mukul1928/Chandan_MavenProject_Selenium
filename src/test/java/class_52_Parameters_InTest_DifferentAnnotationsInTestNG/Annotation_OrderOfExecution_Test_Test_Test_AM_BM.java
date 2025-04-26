package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Output-->
 * BeforeMethod
 * Test1
 * AfterMethod
 * BeforeMethod
 * Test2
 * AfterMethod
 * BeforeMethod
 * Test3
 * AfterMethod
 */

public class Annotation_OrderOfExecution_Test_Test_Test_AM_BM {

	@Test
	public void test1() {
		System.out.println("@Test1");
	}

	@Test
	public void test2() {
		System.out.println("@Test2");
	}

	@Test
	public void test3() {
		System.out.println("@Test3");
	}

	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("@BeforeMethod");
	}

}
