package class_55_FindTheBrokenLinksOfAnyWebSites;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLink {
	WebDriver driver;

	@Test
	public void amazon_brokenlinks() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);

		for (int i = 0; i < countoflinks; i++) {
			WebElement linkText = links.get(i);
			String url = linkText.getAttribute("href");

			verify_the_link(url);
		}

	}

	static void verify_the_link(String url) throws IOException {
		URL ul = new URL(url);
		HttpURLConnection h1 = (HttpURLConnection) ul.openConnection();
		h1.connect();
		if (h1.getResponseCode() == 200) {
			System.out.println("Link is valid " + url);
		} else {
			System.out.println("Invalid links " + url);
		}

	}

}
