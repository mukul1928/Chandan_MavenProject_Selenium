package Chandan_Maven_ProjectAssignments.Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartLogin_With_Assertion_in_TestNG {
	WebDriver driver;
	@Test
	public void Flipkart_Login_Using_Assertion() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement hover = driver.findElement(By.xpath("(//span[.='Login'])"));
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		WebElement login = driver.findElement(By.xpath("(//span[.='Login'])"));
		login.click();
		WebElement sign = driver.findElement(By.xpath("(//input[@class='r4vIwl BV+Dqf'])"));
		sign.sendKeys("mukulpandey89@gmail.com");
		WebElement otp = driver.findElement(By.xpath("(//button[.='Request OTP'])"));
		otp.click();
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}

}
