package class_56_SystemLevelScenarioAmazon_Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Search for mobile->sort the product based on only 4 stars ratings and also sort it using brand name->
//->sort the result using newest arrivals->sort the mobile of 128gb capacity->select the 2nd product->
//increse the quantity to 2->add it to cart

public class Amazon_TestScenario_4 extends LaunchQuit {
	@Test
	public void SearchMobile_Sorting_4Star_Brand() throws InterruptedException {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement four_stars = driver.findElement(By.xpath("(//a[@class='a-link-normal s-navigation-item'])[65]"));
		four_stars.click();
		Thread.sleep(2000);
		WebElement apple = driver.findElement(By.xpath("(//a[@class='a-link-normal s-navigation-item'])[24]"));
		apple.click();
		Thread.sleep(2000);
		WebElement newestarrival = driver.findElement(By.xpath("(//span[.='Featured'])"));
		newestarrival.click();
		Thread.sleep(2000);
		WebElement clicknewarrival = driver.findElement(By.xpath("(//a[.='Newest Arrivals'])"));
		clicknewarrival.click();
		Thread.sleep(1000);
		WebElement storage = driver.findElement(By.xpath("(//a[@class='a-link-normal s-navigation-item'])[17]"));
		storage.click();
		Thread.sleep(3000);
		WebElement click2nd = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[2]"));
		click2nd.click();
		Thread.sleep(1000);
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();
		String s2 = g2.next();
		driver.switchTo().window(s2);
		WebElement addcart = driver.findElement(By.xpath("(//span[.='Add to Cart'])[6]"));
		addcart.click();
		
	}

}
