package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import config.SeleniumConfigurationPropertiesFile;

public class Assignment6 {

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
		// WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		checkTheCheckBoxNameMatchesWithTheNameInTheAlertPopUp(driver);
	}

	private static void checkTheCheckBoxNameMatchesWithTheNameInTheAlertPopUp(WebDriver driver)
			throws InterruptedException {
		// 1.Put the locators into a variable
		String xPathCheckBoxLocator = "//*[@id='checkbox-example']/fieldset/label[2]/input";
		String selectIdDropDownLocator = "dropdown-class-example";
		String editBoxNameLocator = "enter-name";
		String alertButtonIdlocator = "alertbtn";

		// 2.Select any checkbox

		driver.findElement(By.xpath(xPathCheckBoxLocator)).click();

		// 3.Grab the label of the checkbox and put it into a variable

		String opt = driver.findElement(By.xpath(xPathCheckBoxLocator)).getText();

		// 4.Select an option in dropdown. Here option to select should come from step2
		// //Do not hard code text. Drive it dynamically from step 2

//		// explicit wait
//		webDriverWait.until(ExpectedConditions.elementToBeSelected(By.id(selectIdDropDownLocator)));

		WebElement dropdown = driver.findElement(By.id(selectIdDropDownLocator));

		Select s = new Select(dropdown);

		s.selectByVisibleText(opt);

		// 5.Enter the step 3 grabbed label text in Editbox

		driver.findElement(By.name(editBoxNameLocator)).sendKeys(opt);

		// 6.Click Alert and then verify if text grabbed from step 3 is present in the
		// pop up message.

		driver.findElement(By.id(alertButtonIdlocator)).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(opt))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");
	}

}
