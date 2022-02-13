
package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import config.SeleniumConfigurationPropertiesFile;

public class GenericEcommerceAddToCartTest {

	// Class variables or global variables or instance variables.
	public static String browser;
	static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {
		SeleniumConfigurationPropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		addItems();

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
		String url = "https://rahulshettyacademy.com/seleniumPractise/";
		driver.get(url);
		driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	public static void addItems() {

		String cartIconCssSelector = "img[alt='Cart']";
		String xpathProceedToCheckOutButton = "//button[text()='PROCEED TO CHECKOUT']";
		String promoCodeCssSelector = ".promoCode";
		String promoCode = "rahulshettyacademy";
		String promoButtonSelector = ".promoBtn";
		String promoInfoCssSelector = ".promoInfo";
		String xpathPlaceOrderButton = "//button[text()='Place Order']";
		String xpathproceedButton = "//button[text()='Proceed']";
		String xpathSelectDropDown = "//self::label[text()='Choose Country']//parent::div//select";
		String countryCode = "India";
		String agreeCheckBox = "input[class='chkAgree']";
		String xpathAddToCartButton = "//div[@class='product-action']/button";
		String cssSelectorForProducts = "h4.product-name";

		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		// veggies added to the cart
		String[] veggiesNeedsToBeAddedToCart = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		
		driver.findElement(By.cssSelector(cartIconCssSelector)).click();
		driver.findElement(By.xpath(xpathProceedToCheckOutButton)).click();
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(promoCodeCssSelector)));
		driver.findElement(By.cssSelector(promoCodeCssSelector)).sendKeys(promoCode);
		driver.findElement(By.cssSelector(promoButtonSelector)).click();
		// explicit wait
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(promoInfoCssSelector)));
		System.out.println(driver.findElement(By.cssSelector(promoInfoCssSelector)).getText());
		driver.findElement(By.xpath(xpathPlaceOrderButton)).click();
		WebElement dropdown = driver.findElement(By.xpath(xpathSelectDropDown));
		Select selectDropdown = new Select(dropdown);
		selectDropdown.selectByValue(countryCode);
		System.out.println(selectDropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector(agreeCheckBox)).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(agreeCheckBox)).isSelected());
		System.out.println(driver.findElement(By.cssSelector(agreeCheckBox)).isSelected());
		driver.findElement(By.xpath(xpathproceedButton)).click();

		
          //Add Items To Cart
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector(cssSelectorForProducts));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemsList = Arrays.asList(veggiesNeedsToBeAddedToCart);

			if (itemsList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath(xpathAddToCartButton)).get(i).click();
				if (j == veggiesNeedsToBeAddedToCart.length) {
					break;
				}
			}
		}

	}

}
