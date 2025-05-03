package class_63_64_65_Amazon_Test_POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
		driver.navigate().refresh();
		Amazon_Home_Page a = new Amazon_Home_Page(driver);
		a.search_the_product();
		Amazon_Searchresults_Page a1 = new Amazon_Searchresults_Page(driver);
		a1.sorting_the_product_new_Arrivals();
		a1.select_product_4plus_customerreviews();
		a1.click_first_product();
		
		//=====Get Window Handles for switiching from parent window to child window======//
		
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Thread.sleep(2000);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();
		String s2 = g2.next();
		driver.switchTo().window(s2);
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Shoes - 4 Stars & Up","Sorry !");
	}

}
