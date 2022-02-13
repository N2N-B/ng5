package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://google.com";

		// Selenium will pass until the page is fully loaded.By default, it will wait
		// Selenium will wait until all the components are fully loaded to 100%.
		driver.get(url);

		// Selenium will continue once the page is loaded.But it will not wait in this
		// step.
		// If the basic email is loaded, Selenium will continue.
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		// Navigate back to google
		driver.navigate().back();

		// Navigate forward to google
		driver.navigate().forward();

	}

}
