package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.SeleniumConfigurationPropertiesFile;

public class AssignmentFiveNestedFrames {
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
		String url = "https://the-internet.herokuapp.com";
		driver.get(url);
		driver.manage().window().maximize();
		getMiddleTextOfTheNestedFrames(driver);
	}

	private static void getMiddleTextOfTheNestedFrames(WebDriver driver) {

		String linkTextForNestedFramesOption = "Nested Frames";
		String idForMiddleFrameContent = "content";
		String nameForTopFrame = "frame-top";
		String nameForMiddleFrame = "frame-middle";

		driver.findElement(By.linkText(linkTextForNestedFramesOption)).click();
		driver.switchTo().frame(nameForTopFrame);
		driver.switchTo().frame(nameForMiddleFrame);
		System.out.println(driver.findElement(By.id(idForMiddleFrameContent)).getText());

	}
}
