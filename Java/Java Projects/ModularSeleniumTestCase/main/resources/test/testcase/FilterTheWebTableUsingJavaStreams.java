package testcase;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import config.PropertiesFile;

public class FilterTheWebTableUsingJavaStreams {
	static WebDriver driver;
	public static String browser;

	public static void main(String[] args) {
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
	}

	private static void setBrowserConfig() {
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "lib/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	private static void runTest() {
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
		driver.get(url);
		driver.manage().window().maximize();
		searchFilterTheTableUsingJavaStreams(driver);
	}

	private static void searchFilterTheTableUsingJavaStreams(WebDriver driver) {
		String searchFilterLocator = "search-field";
		String itemsInfo = "Rice";
		String xPathForElementsInTheFirstColumn = "//tr/td[1]";

		WebElement searchFilter = driver.findElement(By.id(searchFilterLocator));
		searchFilter.sendKeys(itemsInfo);

		// 1 result => Rice Before filter is applied
		List<WebElement> beforeFilteractualList = driver.findElements(By.xpath(xPathForElementsInTheFirstColumn));
		System.out.println(beforeFilteractualList.size());

		// 1 result => Rice After filter is applied
		List<WebElement> filteredList = beforeFilteractualList.stream().filter(s -> s.getText().contains("Rice"))
				.collect(Collectors.toList());
		System.out.println(filteredList.size());

		// Checking using assert whether the actual list and filtered list matches
		Assert.assertEquals(beforeFilteractualList.size(), filteredList.size());

	}

}
