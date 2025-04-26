package class_53_UseTwoAnnotationTogether_Grouping_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit {
	@Test
	public void searching_the_product() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("I phone 16 pro max");
		search.sendKeys(Keys.ENTER);
	}

}
