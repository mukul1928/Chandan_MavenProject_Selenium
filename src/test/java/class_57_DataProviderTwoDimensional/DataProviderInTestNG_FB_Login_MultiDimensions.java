package class_57_DataProviderTwoDimensional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG_FB_Login_MultiDimensions {
	WebDriver driver;

	@DataProvider(name = "login_data")
	public Object[][] method1() {
		Object data[][] = new Object[2][2];
		data[0][0] = "rachana@gmail.com";// right un
		data[0][1] = "rachana@123";// right pwd
		data[1][0] = "sree@gmail.com";// right un
		data[1][1] = "shre@412";// wrong pwd
		return data;
	}

	@Test(dataProvider = "login_data")
	public void Login_to_amazon(String un, String Pwd) {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(un);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(Pwd);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		System.out.println(un + Pwd);
	}

}
