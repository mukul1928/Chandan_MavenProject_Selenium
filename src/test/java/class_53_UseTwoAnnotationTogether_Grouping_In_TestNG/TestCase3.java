package class_53_UseTwoAnnotationTogether_Grouping_In_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase3 extends LaunchQuit {
	@Test
	public void Searching_1st_Product_Cart() throws InterruptedException {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("I phone 16 pro max");
		search.sendKeys(Keys.ENTER);
		WebElement click_first = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		click_first.click();
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Thread.sleep(2000);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();
		String s2 = g2.next();
		driver.switchTo().window(s2);
		Thread.sleep(2000);
		WebElement add_to_cart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		add_to_cart.click();
		Thread.sleep(2000);
		WebElement proceedtocheckout = driver.findElement(By.xpath("(//input[@class='a-button-input'])[32]"));
		proceedtocheckout.click();
		WebElement enter_Email = driver.findElement(By.id("ap_email_login"));
		enter_Email.sendKeys("chandanpandey1928@gmail.com");
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
		WebElement enter_Pwd = driver.findElement(By.id("ap_password"));
		enter_Pwd.sendKeys("mukul1928");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		WebElement chooseaddress = driver.findElement(By.xpath("(//input[@class='a-button-input'])[4]"));
		chooseaddress.click();
	}

}
