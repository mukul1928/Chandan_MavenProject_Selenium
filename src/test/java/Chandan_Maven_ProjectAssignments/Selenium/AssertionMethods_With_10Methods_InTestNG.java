package Chandan_Maven_ProjectAssignments.Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionMethods_With_10Methods_InTestNG {
	@Test
	public void asserttrue() {
		Assert.assertTrue(false);
	}
	@Test
	public void assertfalse() {
		Assert.assertFalse(false);
	}
	@Test
	public void assertboolean() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void assertbooleanstring() {
		Assert.assertEquals(false, true, "Sorry expecting something and getting something else");
	}
	@Test
	public void assertbyte() {
		Assert.assertEquals(12, 500000000);
	}
	@Test
	public void assertbytestring() {
		Assert.assertEquals(1, 97531, "Sorry ! expecting something and getting nothing");
	}
	@Test
	public void assertlong() {
		Assert.assertEquals(67565675, 8867867);
	}
	@Test
	public void assertlongstring() {
		Assert.assertEquals(876867686, 563437535, "Sorry ! couldn't make it buddy");
	}
	@Test
	public void assertshortequals() {
		Assert.assertEquals(909909090, 787867659);
	}
	@Test
	public void shortstring() {
		Assert.assertEquals(342442343, 545353545, "Sorry ! Bro short stirng are not matching");
	}
	@Test
	public void intint() {
		Assert.assertEquals(5455, 5656);
	}
	@Test
	public void assertintstring() {
		Assert.assertEquals(9789, 67686, "What am I getting");
	}
	@Test
	public void assertchar() {
		Assert.assertEquals('m', 'M');
	}
	@Test
	public void charstring() {
		Assert.assertEquals('c', 'C', "Sorry ! expected 'c' but got 'C' ");
	}
	@Test
	public void object() {
		Assert.assertEquals(getClass(), getClass());
	}
	@Test
	public void objectstring() {
		Assert.assertEquals(getClass(), getClass(), "Wow ! finally got this");
	}
	@Test
	public void stringstring() {
		Assert.assertEquals("chandan", "Chandan");
	}
	@Test
	public void stringstringstring() {
		Assert.assertEquals("Mukul", "mukul", "Sorry ! both string are not equals");
	}
	

}
