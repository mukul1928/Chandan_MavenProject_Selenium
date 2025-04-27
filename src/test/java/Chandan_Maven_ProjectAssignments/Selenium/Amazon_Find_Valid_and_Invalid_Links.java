package Chandan_Maven_ProjectAssignments.Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Find_Valid_and_Invalid_Links {
	WebDriver driver;

	@Test
	public void AmazonValidAndInvalidLinks() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);
		for (int i = 0; i < countoflinks; i++) {
			WebElement linktext = links.get(i);
			String url = linktext.getAttribute("href");
			verify_the_links(url);
		}
	}

	static void verify_the_links(String url) throws IOException {
		try {
			URL u1 = new URL(url);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
			h1.connect();
			if (h1.getResponseCode() == 200) {
				System.out.println("Link is valid " + h1.getResponseCode() + h1.getResponseMessage() + url);
			} else {
				System.out.println("The Link is invalid" + h1.getResponseCode() + h1.getResponseMessage() + url);
			}
		} catch (NullPointerException a1) {

		} catch (MalformedURLException e1) {

		}
	}

}
