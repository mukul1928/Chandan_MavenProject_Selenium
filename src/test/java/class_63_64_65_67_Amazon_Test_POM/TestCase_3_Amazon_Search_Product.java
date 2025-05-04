package class_63_64_65_67_Amazon_Test_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import class_63_64_65_67_Amazon_Source_POM.Amazon_Home_Page;
import class_63_64_65_67_Amazon_Source_POM.Amazon_Searchresults_Page;

public class TestCase_3_Amazon_Search_Product {// without login
	WebDriver driver;

	@Test
	public void searching_product_selecting_the_first() {// home page, search result page these all pages that we
															// require here
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		Amazon_Home_Page a = new Amazon_Home_Page(driver);
		a.search_the_product();
		Amazon_Searchresults_Page a1 = new Amazon_Searchresults_Page(driver);
		a1.click_first_product();
	}

}
