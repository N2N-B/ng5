package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import config.PropertiesFile;

public class RelativeLocators {

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
		String url = "https://rahulshettyacademy.com/angularpractice/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.getTitle();
		relativeLocators(driver);
	}

	private static void relativeLocators(WebDriver driver) throws InterruptedException {
		// Put locators into a string variable
		String nameEditBoxXpathLocator = "(//input[@name='name'])[1]";
	//	String name = "Naren";
    	String labelName = "label";
    	String dateofBirthCssSelector = "for='dateofBirth']";
		String iceCreamLabelXpathLocator = "//label[text()='Check me out if you Love IceCreams!']";
    	String iceCreamLabelTagName = "label";
    	String inputTagName = "label";
    	String inlineRadioId = "inlineRadio1";

   		WebElement nameEditBox =driver.findElement(By.xpath(nameEditBoxXpathLocator));

		System.out.println(driver.findElement(with(By.tagName(labelName)).above(nameEditBox)).getText());

		WebElement dateofBirth = driver.findElement(By.cssSelector(dateofBirthCssSelector));

		driver.findElement(with(By.tagName(inputTagName)).below(dateofBirth)).click();

		WebElement iceCreamLabel =driver.findElement(By.xpath(iceCreamLabelXpathLocator));

		driver.findElement(with(By.tagName(iceCreamLabelTagName)).toLeftOf(iceCreamLabel)).click();

		WebElement rdb = driver.findElement(By.id(inlineRadioId));

		System.out.println(driver.findElement(with(By.tagName(labelName)).toRightOf(rdb)).getText());


	}

}
