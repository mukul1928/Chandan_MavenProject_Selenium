package class_75_Find_Dimensions_Of_Components_Find_XpathUsing_And_Or_Operators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Writing_Xpath_Using_And_Or_Operators {
	WebDriver driver;

	@Test
	public void google_xpath_and_or_operators() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement search = driver.findElement(By.xpath("(//textarea[@class='gLFyf'and @name='q'])"));// using and
																										// operator
		WebElement search = driver.findElement(By.xpath("(//textarea[@class='gLFyf' or @name='q'])"));// using Or
																										// operator
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}

}
