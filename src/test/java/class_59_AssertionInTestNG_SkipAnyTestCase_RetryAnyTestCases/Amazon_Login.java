package class_59_AssertionInTestNG_SkipAnyTestCase_RetryAnyTestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Login {
	WebDriver driver;
	@Test
	public void amazonLogin_is_displayed() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
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
		
	}
}
