package testcase;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class InvokingMultipleWindowsSelenium {

	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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

	private static void runTest() throws InterruptedException {

		invokeMultipleWindowsAndGrabTextFromChildWindowAndPasteItOntheParentWindowNameEditBox(driver);
	}

	private static void invokeMultipleWindowsAndGrabTextFromChildWindowAndPasteItOntheParentWindowNameEditBox(
			WebDriver driver) throws InterruptedException {

		String url = "https://rahulshettyacademy.com/angularpractice/";
		String url1 = "https://rahulshettyacademy.com/";
		String nameCssLocator = "input[name='name']";
		String linkCssSelector = "a[href*='https://courses.rahulshettyacademy.com/p']";

		driver.get(url);
		String tabTitle = driver.getTitle();
		System.out.println(tabTitle);
		driver.manage().window().maximize();

		// Switch to new tab
		WebElement newTab = driver.switchTo().newWindow(WindowType.WINDOW);

		// Window Handler parent to child switch & child to parent switch
		Set<String> windowHandler = driver.getWindowHandles();
		Iterator<String> iterate_windows = windowHandler.iterator();
		String parentWindow = iterate_windows.next();
		String childWindow = iterate_windows.next();
		driver.switchTo().window(childWindow);
		driver.get(url1);
		String courseName = driver.findElements(By.cssSelector(linkCssSelector)).get(1).getText();
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.cssSelector(nameCssLocator));
		name.sendKeys(courseName);

		// Take Partial Screenshot
		File source = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("E:\\partialscreenshot.png"));
		driver.quit();

	}

}
