package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

	@Test
	public void openSeleniumWebsite() {
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println("Chrome browser opening selenium site");

		driver.close();
		System.out.println("Chrome browser closed");

	}

}
