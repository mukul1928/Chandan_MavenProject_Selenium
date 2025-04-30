package class_57_DataProviderTwoDimensional;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG_SingleDimension {

	@DataProvider(name = "data1")
	public Object[][] methodfor_verifyingname() {
		return (Object[][]) new Object[][] { { "Vaibhav" }, { "Priyanka" }, { "Kavita" }, { "Chandan" }, { "Piyush" } };
	}

	@DataProvider(name = "data2")
	public Object[][] methodfor_verifyingname1() {
		return (Object[][]) new Object[][] { { 908 }, { 987 }, { 123 }, { 985 }, { 9876 } };
	}

	@Test(dataProvider = "data1")
	public void testcase1(String names) {
		System.out.println(names.concat(" is Indian"));
	}

	@Test(dataProvider = "data2")
	public void testcase2(int rollno) {
		System.out.println(rollno + 100);
	}

}
