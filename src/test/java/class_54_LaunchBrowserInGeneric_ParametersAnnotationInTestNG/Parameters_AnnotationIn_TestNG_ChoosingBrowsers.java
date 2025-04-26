package class_54_LaunchBrowserInGeneric_ParametersAnnotationInTestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_AnnotationIn_TestNG_ChoosingBrowsers {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void google_search(String nameofbrowser) {
		if(nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}

}
