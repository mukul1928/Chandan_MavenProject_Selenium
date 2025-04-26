package class_51_MavenStarted_Login_Amazon_Flipkart_Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//login to flipkart
public class Class_51_Three {
	@Test
	public void testcase3() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.flipkart.com");
		WebElement login = driver.findElement(By.xpath("(//span[.='Login'])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(login).perform();
		login.click();
		WebElement enteremail = driver.findElement(By.xpath("(//input[@class='r4vIwl BV+Dqf'])"));
		enteremail.sendKeys("chandanpandey1928@gmail.com");
		WebElement requestOTP = driver.findElement(By.xpath("(//button[.='Request OTP'])"));
		requestOTP.click();
		
	}
}
