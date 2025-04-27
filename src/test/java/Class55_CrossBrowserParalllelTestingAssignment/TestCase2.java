package Class55_CrossBrowserParalllelTestingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit {
	@Test
	public void search_Google() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("amazon");
		search.sendKeys(Keys.ENTER);
	}

}
