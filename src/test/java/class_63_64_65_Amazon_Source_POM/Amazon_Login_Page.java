package class_63_64_65_Amazon_Source_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page {
	WebDriver driver;
	// a) Finding the element using @FindBy annotation

	@FindBy(name = "email")
	WebElement email_tf;

	@FindBy(xpath = "(//input[@class='a-button-input'])")
	WebElement continue_button;

	@FindBy(id = "ap_password")
	WebElement password_tf;

	@FindBy(id = "signInSubmit")
	WebElement clicktoSignin;

	// b) Seperate methods for each components to perform its actions

	public void emailid() {
		email_tf.sendKeys("chandanpandey1928@gmail.com");
	}

	public void click_continue() {
		continue_button.click();
	}

	public void password() {
		password_tf.sendKeys("mukul1928");
	}

	public void clickonsignin() {
		clicktoSignin.click();
	}

	// c) Initialiting the elements using PageFactory class inside the constructor

	public Amazon_Login_Page(WebDriver driver) {
		//driver = this.driver;
		PageFactory.initElements(driver, this);
	}
}
