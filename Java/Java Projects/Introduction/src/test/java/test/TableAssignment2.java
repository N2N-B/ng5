package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.SeleniumConfigurationPropertiesFile;

public class TableAssignment2 {

	// Class variables or global variables or instance variables.
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumConfigurationPropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();

	}

	private static void setBrowserConfig() {
		// This condition block sets config for firefox browser
		if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// This condition block sets config for chrome browser
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	private static void runTest() throws InterruptedException {
		// WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		calculateTheSumOfTheTablePriceColumnValues(driver);
	}

	private static void calculateTheSumOfTheTablePriceColumnValues(WebDriver driver) throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// 1.Identify the locators and store it into a string variable
		String windowScrollLocator = "window.scrollBy(0,500)";
		String tablePriceValueCssLocator = "table.table-display td:nth-child(3)";

		// 2.Scroll windows to the bottom using
		// JavascriptExecutor
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript(windowScrollLocator);
		Thread.sleep(5000);

		// 3.Calculate the sum of the values in the 3rd column
		List<WebElement> values = driver.findElements(By.cssSelector(tablePriceValueCssLocator));

		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}

		System.out.println(sum);

		// Print the number of rows and columns in the table.
		String totalNoOfRowsCsslocator = "table.table-display tr";
		int $Number_Of_Rows = driver.findElements(By.cssSelector(totalNoOfRowsCsslocator)).size();
		System.out.println($Number_Of_Rows);

		String totalNoOfColumnsCsslocator = "table.table-display th";
		int $Number_Of_Columns = driver.findElements(By.cssSelector(totalNoOfColumnsCsslocator)).size();
		System.out.println($Number_Of_Columns);

		// Get the 2nd row data from the table.
		String $2_Row_Text_Csslocator = "table.table-display tr:nth-child(3)";
		String $get_The_Second_Row_Data_From_The_Table = driver.findElement(By.cssSelector($2_Row_Text_Csslocator))
				.getText();
		System.out.println($get_The_Second_Row_Data_From_The_Table);

		// AutoSuggestion
		String idForAutoSuggestionbox = "autocomplete";

		String country = "ind";

		driver.findElement(By.id(idForAutoSuggestionbox)).sendKeys(country);

		Thread.sleep(2000);

		driver.findElement(By.id(idForAutoSuggestionbox)).sendKeys(Keys.DOWN);

		driver.findElement(By.id(idForAutoSuggestionbox)).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id(idForAutoSuggestionbox)).getAttribute("value"));

	}

}
