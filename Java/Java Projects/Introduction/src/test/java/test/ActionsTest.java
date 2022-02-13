package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
		// 1.Open url by initializing chrome web driver https://www.amazon.com/
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.get(url);
		driver.manage().window().maximize();
		doActions(driver);
	}

	public static void doActions(WebDriver driver) {
		Actions actions = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement type_Hello_In_Uppercase_And_DoubleClick_In_The_SearchBox = driver
				.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(move).contextClick().build().perform();
		actions.moveToElement(type_Hello_In_Uppercase_And_DoubleClick_In_The_SearchBox).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();

	}

}
