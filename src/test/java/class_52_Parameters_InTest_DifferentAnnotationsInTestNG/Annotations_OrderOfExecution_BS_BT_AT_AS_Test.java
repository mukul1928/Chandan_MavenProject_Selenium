package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* OutPut--> 
 * 
 * BeforeSuite
 * BeforeTest
 * Test
 * AfterTest
 * AfterSuite
 */

public class Annotations_OrderOfExecution_BS_BT_AT_AS_Test {
	
	
	@BeforeSuite
	public void BS() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void BT() {
		System.out.println("@BeforeTest");
	}
	@AfterTest
	public void AT() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite");
	}
	@Test
	public void test1() {
		System.out.println("@Test");
	}

}
