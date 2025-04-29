package class_56_SystemLevelScenarioAmazon_Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void pre_condition(String nameofbrowser) {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void post_executions_steps() throws IOException, InterruptedException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\mukul\\eclipse-workspace\\Chandan_MavenProject_Selenium\\SCreenshot"+ Math.random() +".png");
		FileHandler.copy(source, destination);
		Thread.sleep(3000);
		//driver.close();

	}

}
