package class_56_SystemLevelScenarioAmazon_Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
 * login->searching->selecting->adding to wishlist->adding to cart->reach till payment page and select credit card payment method
 */
@Listeners(Listeners_Class.class)
public class Amazon_TestScenario_1 extends LaunchQuit {
	@Test
	public void Login_to_payment() throws InterruptedException {
		WebElement hoverover = driver.findElement(By.xpath("(//span[.='Hello, sign in'])"));
		Actions a = new Actions(driver);
		a.moveToElement(hoverover).perform();
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])"));
		signin.click();
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys("chandanpandey1928@gmail.com");
		WebElement continue_button = driver.findElement(By.id("continue"));
		continue_button.click();
		WebElement pas = driver.findElement(By.id("ap_password"));
		pas.sendKeys("mukul1928");
		WebElement clickonsignin = driver.findElement(By.id("signInSubmit"));
		clickonsignin.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		WebElement select_first = driver
				.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		select_first.click();
		// Get Window Handles
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Thread.sleep(2000);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();// 1st time it will give you the parent ID
		String s2 = g2.next();// 2nd time it will give you the child ID
		driver.switchTo().window(s2);
		WebElement wishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
		wishlist.click();
		WebElement viewyourlist = driver.findElement(By.xpath("(//a[.='View Your List'])"));
		viewyourlist.click();
		Thread.sleep(2000);
		WebElement addtocart = driver.findElement(By.xpath("(//a[@class='a-button-text a-text-center'])"));
		// WebElement addtocart = driver.findElement(By.id("pab-IMD0FHVRJVYNQ"));
		addtocart.click();
		WebElement gotocart = driver.findElement(By.xpath("(//a[@href='/cart?ref_=ewc_gtc'])"));
		gotocart.click();
		WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		WebElement delivertoaddress = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		delivertoaddress.click();
		Thread.sleep(3000);
		WebElement cc = driver.findElement(By.name("ppw-instrumentRowSelection"));
		cc.click();
		WebElement cc_click = driver.findElement(By.xpath("(//div[@class='a-row pmts-add-cc-default-trigger'])[1]"));
		cc_click.click();
		// driver.switchTo().frame(driver.findElement(By.id("pp-4Doano-105")));
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		Thread.sleep(2000);
		WebElement addccnumber = driver.findElement(By.xpath("(//input[@name='addCreditCardNumber'])"));
		addccnumber.sendKeys("42084012602520");
		Thread.sleep(2000);
		WebElement Nickname = driver.findElement(By.id("(//input[@id='pp-knpvR8-18'])"));
		Nickname.sendKeys("Chandu");
		Thread.sleep(1000);
		WebElement expiry_date = driver.findElement(By.name("ppw-expirationDate_month"));
		Select s = new Select(expiry_date);
		s.selectByIndex(10);
		Thread.sleep(1000);
		WebElement expiry_year = driver.findElement(By.name("ppw-expirationDate_year"));
		Select s3 = new Select(expiry_year);
		s3.selectByValue("2031");
	}

}
