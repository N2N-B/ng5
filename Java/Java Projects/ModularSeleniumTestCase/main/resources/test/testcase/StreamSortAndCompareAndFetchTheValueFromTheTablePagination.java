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

public class StreamSortAndCompareAndFetchTheValueFromTheTablePagination {

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
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		compareOriginalListAndSortedListInTable(driver);
	}

	private static void compareOriginalListAndSortedListInTable(WebDriver driver) {
		String vegFruitNameColumnXpathLocator = "//tr/th[1]";
		String capturevegFruitNameColumnXpathLocator = "//tr/td[1]";

		// 1.Click on column Veg/fruit name. Find the locator and store it into a string
		// datatype variable.
		WebElement vegFruitNameColumn = driver.findElement(By.xpath(vegFruitNameColumnXpathLocator));
		vegFruitNameColumn.click();

		// 2.Capture all webelements in the list.
		List<WebElement> elementsList = driver.findElements(By.xpath(capturevegFruitNameColumnXpathLocator));

		// 3.Capture text of all webelements in the original list in the column.
		List<String> originalList = elementsList.stream().map(o -> o.getText()).collect(Collectors.toList());
		System.out.println(originalList);

		// 4.Sort the original list of step 3 -> Sorted List
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// 5.Compare Original and Sorted List.
		Assert.assertTrue(originalList.equals(sortedList));

		// 6.Scan the name column with getText -> Rice -> get the price of the rice in
		// the next column. and if not present pagination performed using do while loop
		List<String> price;

		// Pagination performed searching for rice
		do {
			elementsList = driver.findElements(By.xpath(capturevegFruitNameColumnXpathLocator));
			price = elementsList.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));

			String nextButtonCssSelector = "[aria-label='Next']";
			if (price.size() < 1) {
				WebElement nextButton = driver.findElement(By.cssSelector(nextButtonCssSelector));
				nextButton.click();
			}
		} while (price.size() < 1);

	}

	// get the price of the rice in the next column.
	private static String getPriceVeggie(WebElement s) {
		String priceValueXpathLocator = "following-sibling::td[1]";
		String priceValue = s.findElement(By.xpath(priceValueXpathLocator)).getText();
		return priceValue;
	}

}
