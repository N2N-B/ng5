package seleniumtothecore.mavenseleniumproject;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class HowToTakeScreenshotsInSelenium {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
	}

	private static void setBrowserConfig() {
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.driver.chrome", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.contains("FireFox")) {
			System.setProperty("webdriver.driver.chrome", "src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	private static void runTest() throws IOException {
		String url = "https://www.google.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.getTitle();
		takeScreenShotInSeleniumAndHowToKillTheProcessRunningInBackground(driver);
	}

	private static void takeScreenShotInSeleniumAndHowToKillTheProcessRunningInBackground(WebDriver driver)
			throws IOException {
		// 1.Store locators in a string variable.

		// 2.Initialize WebElement

		// 3.Take screenshot using selenium
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("E://screenshot.png"));

	}

}

