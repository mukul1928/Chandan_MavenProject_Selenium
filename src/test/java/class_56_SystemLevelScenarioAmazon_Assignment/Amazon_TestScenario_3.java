package class_56_SystemLevelScenarioAmazon_Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//Login->Go to wishlist->remove 2 product from wishlist->search for shoes->
//->add the shoes to newly created wishlist->add those two shoes to the cart->logout


public class Amazon_TestScenario_3 extends LaunchQuit {
	@Test
	public void Login_RemoveProductFromWishlist_Cart_Logout() throws InterruptedException {
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
		Thread.sleep(2000);
		WebElement hover = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover).perform();
		WebElement Yourwishlist = driver.findElement(By.xpath("(//span[.='Your Wish List'])"));
		Yourwishlist.click();
		WebElement delete1 = driver.findElement(By.xpath("(//input[@name='submit.deleteItem'])[1]"));
		delete1.click();
		WebElement delete2 = driver.findElement(By.xpath("(//input[@name='submit.deleteItem'])[2]"));
		delete2.click();
		
		WebElement searchshoes = driver.findElement(By.id("twotabsearchtextbox"));
		searchshoes.sendKeys("shoes");
		searchshoes.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement select_third = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
		select_third.click();
		//Get Window Handles
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
		WebElement addtocart = driver.findElement(By.xpath("(//a[@class='a-button-text a-text-center'])[1]"));
		addtocart.click();
		WebElement addtocart1 = driver.findElement(By.xpath("(//a[@class='a-button-text a-text-center'])[2]"));
		addtocart1.click();
		WebElement logout = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(logout).perform();
		WebElement Signout = driver.findElement(By.xpath("(//span[.='Sign Out'])"));
		Signout.click();
	}

}
