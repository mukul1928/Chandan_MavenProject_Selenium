package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterInTest_InvocationCount {
	@Test(invocationCount=10)
	public void testcase1() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
	}
	

}
