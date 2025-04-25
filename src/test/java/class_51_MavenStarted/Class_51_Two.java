package class_51_MavenStarted;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//login to Facebook
public class Class_51_Two {
	@Test
	public void testcase2() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("chandanpandey1928@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("mukul1928");
		WebElement Log_In = driver.findElement(By.xpath("(//button[.='Log in'])"));
		Log_In.click();
	}

}
