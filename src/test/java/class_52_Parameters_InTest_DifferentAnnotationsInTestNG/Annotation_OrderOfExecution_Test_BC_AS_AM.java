package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*
 * Output-->
 * 
 * BeforeClass
 * Test
 * AfterMethod
 * AfterSuite
 */

public class Annotation_OrderOfExecution_Test_BC_AS_AM {
	@Test
	public void test() {
		System.out.println("@Test");
	}
	@BeforeClass
	public void BC() {
		System.out.println("@BeforeClass");
	}
	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite");
	}
	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}

}
