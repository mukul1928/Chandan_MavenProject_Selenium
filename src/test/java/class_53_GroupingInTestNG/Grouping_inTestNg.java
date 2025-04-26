package class_53_GroupingInTestNG;

import org.testng.annotations.Test;

public class Grouping_inTestNg {
	@Test(groups = { "smoke" })
	public void TSID_01() {

	}

	@Test(groups = { "smoke", "system" })
	public void TSID_02() {

	}

	@Test(groups = { "smoke", "system" })
	public void TSID_03() {

	}

	@Test(groups = { "system", "regression" })
	public void TSID_04() {

	}

}
