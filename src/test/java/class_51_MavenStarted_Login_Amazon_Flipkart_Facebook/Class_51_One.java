package class_51_MavenStarted_Login_Amazon_Flipkart_Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//Login to Amazon
public class Class_51_One {

	@Test
	public void testcase1() {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		WebElement hoverover = driver.findElement(By.xpath("(//span[.='Hello, sign in'])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover).perform();
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])"));
		signin.click();
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys("chandanpandey1928@gmail.com");
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("mukul1928");
		WebElement signIn = driver.findElement(By.id("signInSubmit"));
		signIn.click();
	}

}
