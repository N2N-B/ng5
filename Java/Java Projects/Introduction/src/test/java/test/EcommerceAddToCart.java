package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EcommerceAddToCart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// 1.Open url by initializing chrome web driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
		String url = "https://rahulshettyacademy.com/seleniumPractise/";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// veggies added to the cart
		String[] veggiesNeedsToBeAddedToCart = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		addItems(driver, veggiesNeedsToBeAddedToCart);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));

		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector(".promoBtn")).click();

		// explicit wait
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));

		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		WebElement dropdown = driver
				.findElement(By.xpath("//self::label[text()='Choose Country']//parent::div//select"));
		Select selectDropdown = new Select(dropdown);
		selectDropdown.selectByValue("India");
		System.out.println(selectDropdown.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[class='chkAgree']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[class='chkAgree']")).isSelected());
		/*
		 * driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
		 * Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[class='chkAgree']")).isSelected());
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[class='chkAgree']")).isSelected());
		 */
       driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}

	@SuppressWarnings("rawtypes")
	public static void addItems(WebDriver driver, String[] veggiesNeedsToBeAddedToCart) {

		// Adding int datatype with variable name j so as to check whether the
		// veggiesNeedsToBeAddedToCart is added 3 times to the cart
		int j = 0;

		// Getting Cucumber,Brocolli and adding to cart to cart in a generic way
		// i.e., if Cucumber needs to be added to the 24th or 7th place in the cart then
		// the below code is dynamic,you
		// don't have to change it everytime.
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// Iterating the items and gets the required items in the array list
		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1kg
			// format the name to get actual vegetable name
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// name[0]=> Cucumber
			// name[1]=> Brocolli

			// Convert array into array list for easy search
			List itemsList = Arrays.asList(veggiesNeedsToBeAddedToCart);

			// Check whether name you extracted is present in array or not
			if (itemsList.contains(formattedName)) {

				// click on add to cart
				j++;

				// Don't rely on the text //button[text()='ADD TO CART'] in creating locator
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == veggiesNeedsToBeAddedToCart.length) {
					break;
				}
			}
		}

	}

}
