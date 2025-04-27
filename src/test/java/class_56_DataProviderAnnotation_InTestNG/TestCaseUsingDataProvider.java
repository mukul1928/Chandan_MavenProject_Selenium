package class_56_DataProviderAnnotation_InTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseUsingDataProvider {
	@DataProvider(name = "data1")
	public Object[][] method1() {
		return new Object[][] { { 17 }, { 24 }, { 50 }, { 63 } };
	}

	@Test(dataProvider = "data1")
	public void testcase1(int age) {
		System.out.println(age + 10);
	}

}
