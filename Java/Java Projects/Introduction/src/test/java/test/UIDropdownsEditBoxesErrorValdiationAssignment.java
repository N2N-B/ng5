package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UIDropdownsEditBoxesErrorValdiationAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1.Open url by initializing chrome web driver https://www.cleartrip.com
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.cleartrip.com";
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		uiAutomation(driver);
	}

	public static void uiAutomation(WebDriver driver) {

		// 2.select the current date in the calendar
		driver.findElement(By.cssSelector("div[class*='homeCalender'] button")).click();
		driver.findElement(By.cssSelector("div[class*='DayPicker-Day--today']")).click();

		// 3.select the static dropdowns such as adults, children, and infants.
		WebElement dropdown = driver.findElement(By.xpath("//self::h4[text()='Adults']//parent::div//select"));

		// select keyword - Static dropdown
		Select selectDropdown = new Select(dropdown);
		selectDropdown.selectByIndex(1);
		System.out.println(selectDropdown.getFirstSelectedOption().getText());

		WebElement dropdown2 = driver.findElement(By.xpath("//self::h4[text()='Children']//parent::div//select"));
		Select selectDropdown2 = new Select(dropdown2);
		selectDropdown2.selectByIndex(3);
		System.out.println(selectDropdown2.getFirstSelectedOption().getText());

		WebElement dropdown3 = driver.findElement(By.xpath("//self::h4[text()='Infants']//parent::div//select"));
		Select selectDropdown3 = new Select(dropdown3);
		selectDropdown3.selectByIndex(1);
		System.out.println(selectDropdown3.getFirstSelectedOption().getText());

		// 4.select the More options link text.
		driver.findElement(By.cssSelector("a strong")).click();

		// 5.Type the preferred airline name in the preferred airline in the edit box.
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indigo");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("li p")).click();

		// 6.Click the search flights button and grab the error message using TestNG
		// assert class.

		WebElement element = driver.findElement(By.xpath("//button[text()='Search flights']"));
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].click()", element);

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='bg-error'] span")).getText(),
				"Select Departure and Arrival airports/cities.");
		System.out.println(driver.findElement(By.cssSelector("div[class*='bg-error'] span")).getText());

	}

}
