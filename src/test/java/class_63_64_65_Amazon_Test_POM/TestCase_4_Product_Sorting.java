package class_63_64_65_Amazon_Test_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import class_63_64_65_Amazon_Source_POM.Amazon_Home_Page;
import class_63_64_65_Amazon_Source_POM.Amazon_Searchresults_Page;

public class TestCase_4_Product_Sorting {
	WebDriver driver;
	@Test
	public void searching_sorting_new_Arrival_4plus_ratings() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		Amazon_Home_Page a = new Amazon_Home_Page(driver);
		a.search_the_product();
		Amazon_Searchresults_Page a1 = new Amazon_Searchresults_Page(driver);
		//a1.click_first_product();
		a1.sorting_the_product_new_Arrivals();
	}

}
