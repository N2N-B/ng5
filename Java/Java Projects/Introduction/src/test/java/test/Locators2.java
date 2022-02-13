package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Initialize string variable dynamically
		String name = "rahul";

		// Setting up the driver executable file and initializing the driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Implicit wait applied globally for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Get password dynamically from the method
		String password = getPassword(driver);

		// Open the url page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Id locator for username
		driver.findElement(By.id("inputUsername")).sendKeys(name);

		// name locator for password
		driver.findElement(By.name("inputPassword")).sendKeys(password);

		// Class Name Locator for sign in button
		driver.findElement(By.className("signInBtn")).click();

		// Explicit wait
		Thread.sleep(2000);

		// Tagname locator for getting the actual text "You are successfully logged in."
		System.out.println(driver.findElement(By.tagName("p")).getText());

		// Assertion class of TestNG to validate "You are successfully logged in."
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		// Assertion class of TestNG to validate "Hello rahul,"
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

		// xpath locator
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		// Closing the driver
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();

		// Please use temporary password 'rahulshettyacademy' to Login.
		// 0th index - Please use temporary password
		// 1st index - rahulshettyacademy' to Login.
		// 0th index - rahulshettyacademy
		// 1st index - to Login.
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}
}
