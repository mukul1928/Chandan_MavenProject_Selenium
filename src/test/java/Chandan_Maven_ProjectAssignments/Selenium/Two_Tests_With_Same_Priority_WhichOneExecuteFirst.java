package Chandan_Maven_ProjectAssignments.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Two_Tests_With_Same_Priority_WhichOneExecuteFirst {
	
	@Test(priority=10)
	public void AmazonLogin() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		WebElement hoverover = driver.findElement(By.xpath("(//span[.='Hello, sign in'])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover).perform();
		WebElement sign = driver.findElement(By.xpath("(//span[.='Sign in'])"));
		sign.click();
	}
	@Test(priority=10) 
	public void FlipkartLogin() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hoverover = driver.findElement(By.xpath("(//span[.='Login'])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover).perform();
		hoverover.click();
		
	}

}
