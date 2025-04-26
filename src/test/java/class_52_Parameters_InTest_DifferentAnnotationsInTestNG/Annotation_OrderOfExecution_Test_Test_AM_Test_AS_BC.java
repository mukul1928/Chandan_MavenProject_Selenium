package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * Output-->
 * BeforeClass
 * Test1
 * AfterMethod
 * Test2
 * AfterMethod
 * Test3
 * AfterMethod
 * AfterSuite
 */

public class Annotation_OrderOfExecution_Test_Test_AM_Test_AS_BC {
	@Test
	public void test1() {
		System.out.println("@Test1");
	}
	@Test
	public void test2() {
		System.out.println("@Test2");
	}
	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}
	@Test
	public void test3() {
		System.out.println("@Test3");
	}
	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite");
	}
	@BeforeClass
	public void BC() {
		System.out.println("@BeforeClass");
	}

}
