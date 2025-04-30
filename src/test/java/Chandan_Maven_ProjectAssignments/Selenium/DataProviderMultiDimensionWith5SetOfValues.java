package Chandan_Maven_ProjectAssignments.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMultiDimensionWith5SetOfValues {
	WebDriver driver;

	@DataProvider(name = "login_data")
	public Object[][] method1() {
		Object[][] data = new Object[6][2];
		data[0][0] = "rachana@gmail.com";
		data[0][1] = "rachana@123";
		data[1][0] = "sree@gmail.com";
		data[1][1] = "shre@412";
		data[2][0] = "shiva@gmail.com";
		data[2][1] = "shiva@4221";
		data[3][0] = "chandan@gmail.com";
		data[3][1] = "chandan@321";
		data[4][0] = "stbymkt@gmail.com";
		data[4][1] = "Manish!232";
		data[5][0] = "stbymukul@gmail.com";
		data[5][1] = "Manis65433";
		return data;
	}

	@Test(dataProvider = "login_data")
	public void fb_login(String un, String Pwd) {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(un);
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(Pwd);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		System.out.println(un + Pwd);
	}

}
