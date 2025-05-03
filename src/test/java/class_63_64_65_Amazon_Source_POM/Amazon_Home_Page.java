package class_63_64_65_Amazon_Source_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page {
	WebDriver driver;
	// step 1

	@FindBy(xpath = "(//span[@class='nav-line-2 '])")
	WebElement hoveraccountlists;

	@FindBy(xpath = "(//span[.='Sign Out'])")
	WebElement signout_link;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement search_tf;
	
	

	// step 2
	public void hoveroveraccountlist() {
		Actions a = new Actions(driver);
		a.moveToElement(hoveraccountlists).perform();
		
	}
	
	public void search_the_product() {
		search_tf.sendKeys("shoes");
		search_tf.sendKeys(Keys.ENTER);
	}
	

	public void clicksignout() {
		signout_link.click();
	}

	// step 3
	public Amazon_Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
