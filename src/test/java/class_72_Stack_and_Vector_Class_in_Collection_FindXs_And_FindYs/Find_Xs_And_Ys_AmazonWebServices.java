package class_72_Stack_and_Vector_Class_in_Collection_FindXs_And_FindYs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_Xs_And_Ys_AmazonWebServices {
	WebDriver driver;

	@Test
	public void amazon_xs_ys() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement el = driver.findElement(By.xpath("(//a[@class='nav_a'])[24]"));
		Point p1 = el.getLocation();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
	}

}
