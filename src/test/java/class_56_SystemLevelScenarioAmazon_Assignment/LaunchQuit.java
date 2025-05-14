package class_56_SystemLevelScenarioAmazon_Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit extends Listeners_Class {
	WebDriver driver;

	@BeforeMethod

	@Parameters("browser")
	public void pre_condtition(String nameofbrowser) {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
			// driver.manage().window().maximize();
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
			// driver.manage().window().maximize();
		}

		driver.navigate().to("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void post_exe_steps() throws IOException {
		driver.quit();
	}

}
