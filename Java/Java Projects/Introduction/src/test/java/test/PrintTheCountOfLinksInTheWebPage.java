package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.SeleniumConfigurationPropertiesFile;

public class PrintTheCountOfLinksInTheWebPage {

	// Class variables or global variables or instance variables.
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Calling seperate functionalities or methods
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
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		getTheCountOfLinksInTheWebPages(driver);
	}

	private static void getTheCountOfLinksInTheWebPages(WebDriver driver) throws InterruptedException {

		String tagNameToGetTheCountOfLinksInTheWebPages = "a";
		String idForFooter = "gf-BIG";
		String xpathToGetTheCountOfLinksInTheColumn = "//table/tbody/tr/td[1]/ul";

		// Get the count of links in the web page
		System.out.println(driver.findElements(By.tagName(tagNameToGetTheCountOfLinksInTheWebPages)).size());

		// Get the count of footer links in the web page
		WebElement footerDriver = driver.findElement(By.id(idForFooter));
		footerDriver.findElements(By.tagName(tagNameToGetTheCountOfLinksInTheWebPages)).size();

		// Get the count of footer links in the web page
		WebElement columnDriver = driver.findElement(By.xpath(xpathToGetTheCountOfLinksInTheColumn));
		columnDriver.findElements(By.tagName(tagNameToGetTheCountOfLinksInTheWebPages)).size();

		// Click on each link in the column and check if the pages are opening
		for (int i = 1; i<columnDriver.findElements(By.tagName(tagNameToGetTheCountOfLinksInTheWebPages)).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName(tagNameToGetTheCountOfLinksInTheWebPages)).get(i)
					.sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}

		// Get the title of the child tab with optimized while loop
		Set<String> windows = driver.getWindowHandles(); // 4 tabs or windows are opened.
		Iterator<String> iterate_windows = windows.iterator();
		while (iterate_windows.hasNext()) {
			driver.switchTo().window(iterate_windows.next());
			System.out.println(driver.getTitle());
		}
	}
}
