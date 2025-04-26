package class_53_UseTwoAnnotationTogether_Grouping_In_TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
	ChromeDriver driver;
	@BeforeMethod
	public void pre_condition() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void post_exe_steps() throws IOException, InterruptedException {
		TakesScreenshot tss = driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\mukul\\eclipse-workspace\\Chandan_MavenProject_Selenium\\Screenshots\\TestCase"+Math.random()+".png");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		driver.close();
	}

}
