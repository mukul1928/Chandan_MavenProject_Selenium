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

public class Myntra_FindValidAndInvalidLinks {
	WebDriver driver;

	@Test
	public void Myntra_ValidAndInvalidLinks() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.myntra.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);

		for (int i = 0; i < countoflinks; i++) {
			WebElement linktext = links.get(i);
			String url = linktext.getAttribute("href");
			verifythelinks(url);
		}

	}

	static void verifythelinks(String url) throws IOException {
		try {
			URL u1 = new URL(url);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
			h1.connect();
			if (h1.getResponseCode() == 200) {
				System.out.println("Link is valid " + h1.getResponseCode() + h1.getResponseMessage() + url);
			} else {
				System.out.println("Link is Invalid" + h1.getResponseCode() + h1.getResponseMessage() + url);
			}

		} catch (MalformedURLException e) {

		} catch (NullPointerException a) {

		}
	}

}
