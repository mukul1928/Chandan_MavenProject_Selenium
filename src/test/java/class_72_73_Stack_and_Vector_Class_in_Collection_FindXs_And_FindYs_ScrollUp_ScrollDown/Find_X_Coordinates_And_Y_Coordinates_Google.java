package class_72_73_Stack_and_Vector_Class_in_Collection_FindXs_And_FindYs_ScrollUp_ScrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_X_Coordinates_And_Y_Coordinates_Google {
	WebDriver driver;

	@Test
	public void Find_Coordinates_Xs_Ys_Flipkart() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement ele = driver.findElement(By.xpath("//a[.='Myntra']"));

		Point p1 = ele.getLocation();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(1000,3000)");// for scroll downward
		Thread.sleep(3000);
		j1.executeScript("window.scrollBy(1000,-3000)");// for ccroll upward

	}

}
