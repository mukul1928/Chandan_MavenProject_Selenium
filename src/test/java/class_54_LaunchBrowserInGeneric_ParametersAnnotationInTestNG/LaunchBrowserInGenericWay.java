package class_54_LaunchBrowserInGeneric_ParametersAnnotationInTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserInGenericWay {
	WebDriver driver;
	@Test
	public void testcase1() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("how to make yourself calm in every situations?");
		search.sendKeys(Keys.ENTER);
				
	}

}
