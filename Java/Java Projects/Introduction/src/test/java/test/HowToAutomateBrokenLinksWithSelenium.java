package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class HowToAutomateBrokenLinksWithSelenium {

	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException {
		setBrowserConfig();
		runTest();
	}

	private static void setBrowserConfig() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	private static void runTest() throws MalformedURLException, IOException {
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		automateBrokenLinksWithSelenium(driver);
	}

	private static void automateBrokenLinksWithSelenium(WebDriver driver) throws MalformedURLException, IOException {
		String hrefAttribute = "href";
		String xpathForBrokenLinkLocator = "//a[text()='Broken Link']";
		String regularExpressionUrlForSoapUILocator = "a[href*='soapui']";
		String cssSelectorForFooterUrlLocator = "li[class='gf-li'] a";
		String header = "HEAD";

		List<WebElement> links = driver.findElements(By.cssSelector(cssSelectorForFooterUrlLocator));
		SoftAssert softAssert = new SoftAssert();

		int countTheNumber_Of_ResponseCodes = 0;
		for (WebElement link : links) {
			String url = link.getAttribute(hrefAttribute);
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod(header);
			connection.connect();
			int responseCode = connection.getResponseCode();
			System.out.println(responseCode);
			softAssert.assertTrue(responseCode < 400,
					"The link with text " + link.getText() + " is broken with code" + responseCode);
		}
		System.out.println("Total Number Of Response Codes: " + countTheNumber_Of_ResponseCodes++);
		softAssert.assertAll();

	}

}
