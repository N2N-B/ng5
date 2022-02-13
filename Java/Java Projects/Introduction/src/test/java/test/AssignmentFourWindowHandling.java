package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.SeleniumConfigurationPropertiesFile;

/**
 * @author NAREN BAGAVATHY
 *
 */
public class AssignmentFourWindowHandling {
	// Class variables or global variables or instance variables.
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
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

	private static void runTest() {
		// Browser gets controlled by selenium and automation such as opening and
		// closing browser is done.
		// Built-in logging that means you can put System.out.println("Chrome browser
		// gets opened")
		String url = "https://the-internet.herokuapp.com";
		driver.get(url);
		driver.manage().window().maximize();
		multipleWindows(driver);
	}

	private static void multipleWindows(WebDriver driver) {
		String xpathForMultipleWindows = "//a[text()='Multiple Windows']";
		String xpathForClickHere = "//a[text()='Click Here']";
		String tagNameForChildWindowHeader = "h3";
		String tagNameForParentWindowHeader = "h3";
		driver.findElement(By.xpath(xpathForMultipleWindows)).click();
		driver.findElement(By.xpath(xpathForClickHere)).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate_Windows = windows.iterator();
		String parentWindow = iterate_Windows.next();
		String ChildWindow = iterate_Windows.next();
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.findElement(By.tagName(tagNameForChildWindowHeader)).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.tagName(tagNameForParentWindowHeader)).getText());
	}

}
