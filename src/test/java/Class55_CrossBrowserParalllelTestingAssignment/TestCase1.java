package Class55_CrossBrowserParalllelTestingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit {
	@Test
	public void searchmobile() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);

	}

}
