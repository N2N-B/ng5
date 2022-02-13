package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import config.SeleniumConfigurationPropertiesFile;

public class FramesTest {
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
		String url = "http://jqueryui.com/droppable/";
		driver.get(url);
		driver.manage().window().maximize();
		dragAndDropUsingFrames(driver);
	}

	private static void dragAndDropUsingFrames(WebDriver driver) {
		String idForDraggable = "draggable";
		String idForDroppable = "droppable";

		String tagNameForFrame = "iframe";
		String cssSelectorForFrame = "iframe[class='demo-frame']";

		// driver.switchTo().frame(1);
		System.out.println(driver.findElements(By.tagName(tagNameForFrame)).size());
		//driver.switchTo().frame(0);

		 driver.switchTo().frame(driver.findElement(By.cssSelector(cssSelectorForFrame)));
		 driver.findElement(By.id(idForDraggable)).click();

		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id(idForDraggable));
		WebElement target = driver.findElement(By.id(idForDroppable));
		actions.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}
}
