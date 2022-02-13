package test;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author NAREN BAGAVATHY
 *
 */
public class WindowHandlingLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.rahulshettyacademy.com/loginpagePractise/#";
		driver.get(url);
		driver.manage().window().maximize();
		switchWindowsAndCopyAndPasteTheEmailFromChildToParentWindow(driver);
}

	public static void switchWindowsAndCopyAndPasteTheEmailFromChildToParentWindow(WebDriver driver){
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>  iterate_Windows   = windows.iterator();
		String parentWindow = iterate_Windows.next();
		String ChildWindow = iterate_Windows.next();
		driver.switchTo().window(ChildWindow);
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentWindow);
        driver.findElement(By.cssSelector("input#username")).sendKeys(emailId);
	}
}
