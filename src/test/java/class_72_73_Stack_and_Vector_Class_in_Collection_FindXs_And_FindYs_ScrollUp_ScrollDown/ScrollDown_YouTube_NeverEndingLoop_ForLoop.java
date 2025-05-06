package class_72_73_Stack_and_Vector_Class_in_Collection_FindXs_And_FindYs_ScrollUp_ScrollDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown_YouTube_NeverEndingLoop_ForLoop {

	WebDriver driver;

	@Test
	public void YouTubeScrollDown() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.youtube.com");
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("Neffex songs for jimming");
		search.sendKeys(Keys.ENTER);

		for (int i = 0; i > -1; i++) {
			JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);

		}
	}

}
