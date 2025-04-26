package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
/*
 * Output-->
 * Test1
 * AfterMethod
 * Test2
 * AfterMethod
 * Test3
 * AfterMethod
 */

public class Annotation_OrderOfExecution_Test_Test_AM_Test {
	
	@Test
	public void Test1() {
		System.out.println("@Test1");
	}
	@Test
	public void Test2() {
		System.out.println("@Test2");
	}
	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}
	@Test
	public void Test3() {
		System.out.println("@Test3");
	}
	
	

}
