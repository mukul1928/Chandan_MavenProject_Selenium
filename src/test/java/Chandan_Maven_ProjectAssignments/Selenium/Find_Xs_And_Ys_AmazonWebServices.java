package Chandan_Maven_ProjectAssignments.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Find_Xs_And_Ys_AmazonWebServices {
	WebDriver driver;

	@Test
	public void amazon_xs_ys() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement el = driver.findElement(By.xpath("(//a[@class='nav_a'])[24]"));
		Point p1 = el.getLocation();
		int x = p1.getX();
		System.out.println(x);
		int y = p1.getY();
		System.out.println(y);
		JavascriptExecutor j1 =  (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,"+y+")");//to scroll downward
		Thread.sleep(3000);
		j1.executeScript("window.scrollBy(0,-3000)");// to scroll upward
		
	}

}
