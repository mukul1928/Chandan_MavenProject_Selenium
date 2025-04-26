package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.testng.annotations.Test;

public class ParameterInTestNG_enabled {
	@Test(enabled=false)
	public void testcase1() {
		System.out.println("Login");
	}
	@Test
	public void testcase2() {
		System.out.println("Searhcing the product and logout");
	}

}
