package class_75_Find_Dimensions_Of_Components_Find_XpathUsing_And_Or_Operators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindDimensions {
	WebDriver driver;

	@Test
	public void FindDimension() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.name("q"));
		if (search.isDisplayed() == false || search.isEnabled()) {
			search.sendKeys("India");
		}
		// search.sendKeys(Keys.ENTER);

		Dimension d1 = search.getSize();
		System.out.println(d1.getHeight());
		System.out.println(d1.getWidth());
	}

}
