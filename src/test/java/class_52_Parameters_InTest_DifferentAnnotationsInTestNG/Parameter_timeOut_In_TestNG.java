package class_52_Parameters_InTest_DifferentAnnotationsInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameter_timeOut_In_TestNG {

	@Test(timeOut = 12000)
	public void testcase1() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search_tf = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])"));
		search_tf.sendKeys("shoes");
		Thread.sleep(2000);
		WebElement clickbutton = driver.findElement(By.xpath("(//input[@id='nav-search-submit-button'])"));
		clickbutton.click();
		WebElement clickonfirst = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		clickonfirst.click();
	}

}
