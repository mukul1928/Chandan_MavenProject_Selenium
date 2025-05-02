package class_61_Work_With_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DDT_Program {
	WebDriver driver;
	@Test
	public void DDT() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\mukul\\eclipse-workspace\\Chandan_MavenProject_Selenium\\ExcelSheetForData\\Excel_data.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(un);
		String pwd = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(pwd);
		//String mobile = w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		
		String mobileno =  NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
		System.out.println(mobileno);
		
		//===========================================
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement hover = driver.findElement(By.xpath("(//span[.='Hello, sign in'])"));
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		WebElement sign = driver.findElement(By.xpath("(//span[.='Sign in'])"));
		sign.click();
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys(un);
		WebElement conti = driver.findElement(By.xpath("(//input[@class='a-button-input'])"));
		conti.click();
		WebElement pas = driver.findElement(By.id("ap_password"));
		pas.sendKeys(pwd);
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
	}

}
