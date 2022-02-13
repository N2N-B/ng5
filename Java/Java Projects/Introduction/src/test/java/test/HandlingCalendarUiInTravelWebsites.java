package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.SeleniumConfigurationPropertiesFile;

public class HandlingCalendarUiInTravelWebsites {

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
		String url = "https://www.path2usa.com/travel-companions";
		driver.get(url);
		driver.manage().window().maximize();
		checkTheCalendarWithThePresentAndFutureDate(driver);
	}

	@SuppressWarnings("deprecation")
	private static void checkTheCalendarWithThePresentAndFutureDate(WebDriver driver) throws InterruptedException {
		// 23 needs to be checked and then check month and year 23,April
		String xPathForTravelDate = ".//*[@id='travel_date']";
		String className = "day";
		String cssSelectorForMonthAndYear = "[class='datepicker-days'] [class='datepicker-switch']";
		String cssSelectorForNextMonthAndYear = "[class='datepicker-days'] th[class='next']";

		// Implicit Wait
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Checking Year April to be false in a while loop
		while (!driver.findElement(By.cssSelector(cssSelectorForMonthAndYear)).getText().contains("April")) {
			driver.findElement(By.cssSelector(cssSelectorForNextMonthAndYear)).click();
		}

		// Grab the common attribute put into list and iterate
		driver.findElement(By.xpath(xPathForTravelDate)).click();
		List<WebElement> dates = driver.findElements(By.cssSelector(className));
		int count_The_Number_Of_Dates_In_The_Travel_Calendar = driver.findElements(By.className(className)).size();

		for (int i = 0; i < count_The_Number_Of_Dates_In_The_Travel_Calendar; i++) {
			String text = driver.findElements(By.className(className)).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className(className)).get(i).click();
				break;
			}
		}
	}
}
