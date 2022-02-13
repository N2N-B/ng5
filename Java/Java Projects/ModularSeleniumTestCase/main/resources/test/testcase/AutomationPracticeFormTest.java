package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import config.PropertiesFile;

/**
 * @author NAREN BAGAVATHY
 * 17/11/2021 11:29 P.M.
 */


public class AutomationPracticeFormTest {
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
		String url = "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
		driver.get(url);
		driver.manage().window().maximize();
		driver.getTitle();
		automateForm(driver);
	}

	private static void automateForm(WebDriver driver) throws InterruptedException {
		// Put locators into a string variable
		String firstNameCssLocator = "input[name='firstname']";
		String first_Name = "Naren";
		String lastNameCssLocator = "input[name='lastname']";
		String last_Name = "Bagavathy";
		String genderIndiviualCssLocator = "input[value='Male']";
		String yearsOfExperienceCssLocator = "input[value='2']";
		String dateXpathLocator = "//tbody/tr[5]/td[2]/input[1]";
		String date = "21/06/1995";
		String professionCssLocator = "input[value='Automation Tester']";
		String profilePictureCssLocator = "input[type='file']";
		String fileUpload = "E:\\Selenium Problems\\Screenshot (10146).png";
		String flavorsOfSeleniumCssLocator = "input[value='Selenium Webdriver']";
		String continentsCssLocator = "select[name='continents']";
		String seleniumCommandsXpathLocator = "//select[@name='selenium_commands'] /option[5]";
		//String buttonXpathLocator = "//button[text()='Button']";
		String headerXpathLocator = "//h1[text()='Webdriver Commands Example']";
		String dynamicColorButtonIdLocator = "dynamicColor";
		String windowsScrollBottomLocator = "window.scrollBy(0,600)";
		String windowsScrollBottomLocator1 = "window.scrollBy(0,300)";
		String windowsScrollBottomLocator2 = "window.scrollBy(0,100)";
		//String selectScrollBottomLocator = "document.querySelector('select[name='selenium_commands']').scrollBy(0,50)";

		// Scroll windows to the bottom using JavascriptExecutor
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript(windowsScrollBottomLocator);

		// Enter First Name in the form
		WebElement firstName = driver.findElement(By.cssSelector(firstNameCssLocator));
		firstName.sendKeys(first_Name);

		// Enter Last Name in the form
		WebElement lastName = driver.findElement(By.cssSelector(lastNameCssLocator));
		lastName.sendKeys(last_Name);

		// Click Male Radio button in the form
		WebElement maleRadiobutton = driver.findElement(By.cssSelector(genderIndiviualCssLocator));
		maleRadiobutton.click();

		// Click Years Of Experience Radio button in the form
		WebElement yearsRadiobutton = driver.findElement(By.cssSelector(yearsOfExperienceCssLocator));
		yearsRadiobutton.click();

		// Enter Date in the form
		WebElement $date = driver.findElement(By.xpath(dateXpathLocator));
		$date.sendKeys(date);

		// Check the Automation Tester Checkbox in the form.
		WebElement checkBox = driver.findElement(By.cssSelector(professionCssLocator));
		checkBox.click();

		// Upload the file from the desktop
		WebElement uploadFile = driver.findElement(By.cssSelector(profilePictureCssLocator));
		uploadFile.sendKeys(fileUpload);

		// Scroll windows to the bottom using JavascriptExecutor
		javaScriptExecutor.executeScript(windowsScrollBottomLocator1);

		// Check the Selenium WebDriver Checkbox in the form.
		WebElement checkBox2 = driver.findElement(By.cssSelector(flavorsOfSeleniumCssLocator));
		checkBox2.click();

		// Select static dropdown value antartica
		WebElement dropDown = driver.findElement(By.cssSelector(continentsCssLocator));
		Select selectDropDown = new Select(dropDown);
		selectDropDown.selectByIndex(6);

		// Scroll to the bottom of the selenium commands and click WebElement commands
		//javaScriptExecutor.executeScript(selectScrollBottomLocator);
		WebElement $dropDown = driver.findElement(By.xpath(seleniumCommandsXpathLocator));
		$dropDown.click();

		// Click button
		//WebElement $button = driver.findElement(By.xpath(buttonXpathLocator));
		//$button.click();
		//System.out.println(driver.switchTo().alert().getText());
		//Thread.sleep(3000);	
		//driver.switchTo().alert().dismiss();

		// Get the header string split and trim the string and get the Webdriver from
		// the splitted string
		String splitString = driver.findElement(By.xpath(headerXpathLocator)).getText().split("Commands")[0];
		System.out.println(splitString);

		// Scroll to the bottom
		javaScriptExecutor.executeScript(windowsScrollBottomLocator2);

		// Click button
		WebElement $_dynamic_Button = driver.findElement(By.id(dynamicColorButtonIdLocator));
		$_dynamic_Button.click();
		

	}

}
