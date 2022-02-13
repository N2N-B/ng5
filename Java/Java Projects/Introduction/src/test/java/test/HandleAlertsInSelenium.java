package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author NAREN BAGAVATHY
 *
 */
public class HandleAlertsInSelenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();

		String name = "Naren Bagavathy";
		String name1 = "Naren";

        // To handle ok alerts in pop-up
		driver.findElement(By.id("name")).sendKeys(name);
		System.out.println(driver.findElement(By.id("name")).getText());
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// To handle cancel alerts in pop-up
		driver.findElement(By.id("name")).sendKeys(name1);
		System.out.println(driver.findElement(By.id("name")).getText());
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		//Radio buttons
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[value='radio3']")).click();

	}
}


