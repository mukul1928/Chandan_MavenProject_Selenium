package class_56_SystemLevelScenarioAmazon_Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//Login->Add a new address->search a new product->add it to cart with the new address added->
//-->reach till payment page->select the net banking payment page
public class Amazon_TestScenario_2 extends LaunchQuit {
	
	@Test
	public void Login_add_newAddress_searchproduct_reachpayment_netbanking() throws InterruptedException {
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
		WebElement update_location = driver.findElement(By.id("glow-ingress-line2"));
		update_location.click();
		WebElement addapickuppoint = driver.findElement(By.xpath("(//a[@href='gp/aw/address-book/ref=locux_manage_address_book'])"));
		addapickuppoint.click();
		WebElement addaddress = driver.findElement(By.id("ya-myab-plus-address-icon"));
		addaddress.click();
		WebElement full_name = driver.findElement(By.xpath("(//input[@id='address-ui-widgets-enterAddressFullName'])"));
		full_name.sendKeys("Chandan Pandey");
		WebElement mobile = driver.findElement(By.xpath("(//input[@id='address-ui-widgets-enterAddressPhoneNumber'])"));
		mobile.sendKeys("9807717171");
		WebElement pincode = driver.findElement(By.xpath("(//input[@id='address-ui-widgets-enterAddressPostalCode'])"));
		pincode.sendKeys("273014");
		WebElement flatno = driver.findElement(By.xpath("(//input[@id='address-ui-widgets-enterAddressLine1'])"));
		flatno.sendKeys("250/D");
		WebElement area = driver.findElement(By.xpath("(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[5]"));
		area.sendKeys("Jangl Tinkonia No2, Jangl Hakeem No2");
		Thread.sleep(2000);
		WebElement landmark = driver.findElement(By.xpath("(//input[@id='address-ui-widgets-landmark'])"));
		landmark.sendKeys("Ramjanki Temple");
		//WebElement Town = driver.findElement(By.xpath("(//input[@id='address-ui-widgets-enterAddressCity'])"));
		//Town.sendKeys("Noida");
		//WebElement state = driver.findElement(By.xpath("(//span[.='Choose a state'])[1]"));
		//state.click();
		Thread.sleep(2000);
		WebElement add_address = driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]"));
		add_address.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement click_5th = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[4]"));
		click_5th.click();
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Thread.sleep(2000);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();
		String s2 = g2.next();
		driver.switchTo().window(s2);
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		//WebElement changeaddress = driver.findElement(By.xpath("(//a[@class='a-link-normal expand-panel-button celwidget'])"));
		//changeaddress.click();
		Thread.sleep(2000);
		WebElement delivertonewaddress = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		delivertonewaddress.click();
		Thread.sleep(2000);
		//WebElement changepayment = driver.findElement(By.xpath("(//a[@href='/checkout/p/p-404-1657931-7370751/pay?pipelineType=Chewbacca&referrer=spc&ref_=chk_spc_chg_payselect'])"));
		WebElement changepayment = driver.findElement(By.xpath("(//a[@class='a-link-normal expand-panel-button celwidget'])[2]"));
		changepayment.click();
		Thread.sleep(1000);
		WebElement netbanking = driver.findElement(By.xpath("//input[@id='pp-xKLfeh-107']"));
		//WebElement netbanking = driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		netbanking.click();
		WebElement chooseanoption = driver.findElement(By.xpath("(//span[.='Choose an Option'])[1]"));
		chooseanoption.click();
		WebElement sbi = driver.findElement(By.xpath("(//a[.='State Bank of India'])"));
		sbi.click();
	}
}
