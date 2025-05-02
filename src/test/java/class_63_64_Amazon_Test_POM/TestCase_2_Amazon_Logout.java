package class_63_64_Amazon_Test_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import class_63_64_Amazon_Source_POM.Amazon_Home_Page;
import class_63_64_Amazon_Source_POM.Amazon_Login_Page;

public class TestCase_2_Amazon_Logout {
	WebDriver driver;
	@Test
	public void Amazon_login_then_logout() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Amazon_Login_Page a = new Amazon_Login_Page(driver);
		a.emailid();
		a.click_continue();
		a.password();
		a.clickonsignin();
		Amazon_Home_Page a1 = new Amazon_Home_Page(driver);
		a1.hoveroveraccountlist();
		a1.clicksignout();
		
	}

}
