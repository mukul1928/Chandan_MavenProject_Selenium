package class_54_LaunchBrowserInGeneric_ParametersAnnotationInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchCase {
	WebDriver driver;

	@Test
	public void testcase1() {
		switch (2) // switch will decide which browser I will launch if i write 1 in switch (1)
					// then chrome browser will launch
		{
		case 1: {
			System.out.println("Google Chrome Launch");
			driver = new ChromeDriver();
			break;
		}
		case 2: {
			System.out.println("FireFox Launch");
			driver = new FirefoxDriver();
			break;
		}
		case 3: {
			System.out.println("Edge Browser Launch");
			driver = new EdgeDriver();
			break;
		}
		default: {
			System.out.println("The selection you have made is wrong");
		}
		}
	}

}
