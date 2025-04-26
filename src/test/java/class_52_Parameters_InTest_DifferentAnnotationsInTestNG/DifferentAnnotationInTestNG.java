package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotationInTestNG {
	@Test
	public void testcase1() {
		System.out.println("@Test");
	}
	@BeforeTest
	public void BT() {
		System.out.println("@BeforeTest");
	}
	@AfterTest
	public void AT() {
		System.out.println("@AfterTest");
	}
	@BeforeSuite
	public void BS() {
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite");
	}
	@BeforeClass
	public void BC() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public void AC() {
		System.out.println("@AfterClass");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}
}
