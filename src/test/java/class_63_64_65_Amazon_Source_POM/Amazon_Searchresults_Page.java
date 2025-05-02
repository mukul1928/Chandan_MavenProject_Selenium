package class_63_64_65_Amazon_Source_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Searchresults_Page {
	WebDriver driver;

	// step 1

	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement select_first_product;
	
	@FindBy(xpath = "(//span[.='Featured'])")
	WebElement sort_newarrival;

	// step 2

	public void click_first_product() {
		select_first_product.click();
	}
	
	public void sorting_the_product_new_Arrivals() throws InterruptedException {
		sort_newarrival.click();
		Thread.sleep(1000);
		sort_newarrival.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sort_newarrival.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sort_newarrival.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sort_newarrival.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sort_newarrival.sendKeys(Keys.ENTER);
	}

	// step 3
	public Amazon_Searchresults_Page(WebDriver driver) {
		//driver = this.driver;
		PageFactory.initElements(driver, this);
	}

}
