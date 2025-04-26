package class_53_UseTwoAnnotationTogether_Grouping_In_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit {
	@Test
	public void searching_click_1stproduct() throws InterruptedException {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("I phone 16 pro max");
		search.sendKeys(Keys.ENTER);
		WebElement click_first = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		click_first.click();
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Thread.sleep(2000);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();
		String s2 = g2.next();
		driver.switchTo().window(s2);
		Thread.sleep(2000);
	}

}
