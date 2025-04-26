package class_54_LaunchBrowserInGeneric_ParametersAnnotationInTestNG;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	@Test
	public void testcase1() {
		//EdgeDriver driver = new EdgeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

}
