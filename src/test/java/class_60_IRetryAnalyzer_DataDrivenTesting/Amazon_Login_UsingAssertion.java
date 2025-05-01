package class_60_IRetryAnalyzer_DataDrivenTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Login_UsingAssertion {
	WebDriver driver;
	@Test(retryAnalyzer=class_60_IRetryAnalyzer_DataDrivenTesting.RetryLogic.class)
	public void amazon_login() {
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
		WebElement pas = driver.findElement(By.id("ap_password"));
		pas.sendKeys("mukul1928");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "Sorry ! the title are not matching");
	}

}
