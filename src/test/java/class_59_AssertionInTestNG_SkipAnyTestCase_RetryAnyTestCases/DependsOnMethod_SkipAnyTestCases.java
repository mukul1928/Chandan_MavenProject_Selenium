package class_59_AssertionInTestNG_SkipAnyTestCase_RetryAnyTestCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod_SkipAnyTestCases {
	WebDriver driver;
	@Test
	public void logintoamazon() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hover = driver.findElement(By.xpath("(//span[.='Hello, sign in'])"));
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		WebElement sign = driver.findElement(By.xpath("(//span[.='Sign in'])"));
		sign.click();
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys("chandanpandey1928@gmail.com");
		WebElement conti = driver.findElement(By.xpath("(//input[@class='a-button-input'])"));
		conti.click();
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("mukul1928");
		Assert.assertTrue(pass.isDisplayed());
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Assert.assertFalse(true);
	}
	@Test(priority=1,dependsOnMethods="logintoamazon")
	public void logoutfromamazon() {
		WebElement logout = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a = new Actions(driver);
		a.moveToElement(logout).perform();
		WebElement signout = driver.findElement(By.xpath("(//span[.='Sign Out'])"));
		signout.click();
		
	}

}
