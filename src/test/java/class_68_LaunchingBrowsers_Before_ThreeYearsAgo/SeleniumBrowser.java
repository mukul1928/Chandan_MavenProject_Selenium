package class_68_LaunchingBrowsers_Before_ThreeYearsAgo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
/*
 * This is how we were launching the chrome browser before 4.6 version of selenium 
 */
public class SeleniumBrowser {
	
	@Test
	public void launch_browsers() {
		System.setProperty("webdriver.chrome.driver", "E:\\AT_39_Batch\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\AT_39_Batch\\geckodriver-v0.36.0-win-aarch64\\firefoxdriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
	}

}
