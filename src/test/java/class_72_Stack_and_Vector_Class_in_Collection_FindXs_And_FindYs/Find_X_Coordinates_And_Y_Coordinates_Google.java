package class_72_Stack_and_Vector_Class_in_Collection_FindXs_And_FindYs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_X_Coordinates_And_Y_Coordinates_Google {
	WebDriver driver;

	@Test
	public void ScrollUp_Down_Google() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement ele = driver.findElement(By.linkText("//a[.='Gmail']"));
		// ele.click();

		Point p1 = ele.getLocation();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
	}

}
