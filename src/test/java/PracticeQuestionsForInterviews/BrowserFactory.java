package PracticeQuestionsForInterviews;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//Polymorphism example

public class BrowserFactory
{
	@Test
	public static WebDriver getDriver(String browserType) 
	{
		if(browserType.equalsIgnoreCase("chrome"))
		{
			return new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			return new FirefoxDriver();
		}
		else 
		{
			return new EdgeDriver();
		}
	}
}
