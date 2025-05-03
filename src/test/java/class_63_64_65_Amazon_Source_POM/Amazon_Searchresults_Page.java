package class_63_64_65_Amazon_Source_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Searchresults_Page {
	WebDriver driver;

	// step 1

	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement select_first_product;
	
	@FindBy(id = "s-result-sort-select")
	WebElement sort_newarrival;
	
	@FindBy(xpath = "(//i[@class='a-icon a-icon-star-medium a-star-medium-4'])")
	WebElement clickon4stars;


	// step 2

	public void click_first_product() {
		select_first_product.click();
	}
	
	public void sorting_the_product_new_Arrivals() throws InterruptedException {
		Select s = new Select(sort_newarrival);
		s.selectByVisibleText("Newest Arrivals");
		//sort_newarrival.click();
	}
	
	public void select_product_4plus_customerreviews() {
		clickon4stars.click();
	}

	// step 3
	public Amazon_Searchresults_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
