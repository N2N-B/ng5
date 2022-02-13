package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import config.SeleniumConfigurationPropertiesFile;



/**
 * @author NAREN BAGAVATHY
 *
 */

public class TableExcercisesChallenge1 {

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
		calculateTheSumOfTheTableColumnValues(driver);
	}

	private static void calculateTheSumOfTheTableColumnValues(WebDriver driver) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// 1.Identify the locators and store it into a string variable
		String windowScrollLocator = "window.scrollBy(0,500)";
		String tableScrollJavaScriptDomCssLocator = "document.querySelector('.tableFixHead').scrollTop";
		String tableAmountValueCssLocator = ".tableFixHead td:nth-child(4)";
		String string_To_Parse_Total_Amount_Collected_Css_Locator = ".totalAmount";

		// 2.Scroll windows to the bottom and Scroll Table to the top using
		// JavascriptExecutor
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript(windowScrollLocator);
		Thread.sleep(5000);
		javaScriptExecutor.executeScript(tableScrollJavaScriptDomCssLocator);

		// 3.Calculate the sum of the values in the 4th column
		List<WebElement> values = driver.findElements(By.cssSelector(tableAmountValueCssLocator));

		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		// 4.Get the sum from the string and parse it compare static string sum on the
		// window with generated sum
		System.out.println(sum);
		int stringTotal = Integer
				.parseInt(driver.findElement(By.cssSelector(string_To_Parse_Total_Amount_Collected_Css_Locator))
						.getText().split(":")[1].trim());
		Assert.assertEquals(sum, stringTotal);
	}

}
