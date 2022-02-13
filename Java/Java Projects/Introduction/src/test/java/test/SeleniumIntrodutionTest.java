package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntrodutionTest {

	public static void main(String[] args) {
		// WebDriver driver = new ChromeDriver();
		// Driver has knowledge of the methods only which web driver implementation of
		// chrome driver.
		// driver object has access to the methods of the Chrome driver which are
		// defined in the WebInterface.

		// or
		// ChromeDriver driver = new ChromeDriver();
		// ChromeDriver is implementing web driver methods.
		// driver object has access to all the methods of the Chrome driver.

		// chromedriver.exe acts as a middle proxy invoking chrome browser => Chrome
		// Browser
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		// geckodriver.exe acts as a middle proxy invoking Firefox browser => Firefox
		// Browser
		System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

		// Chrome Browser Launch
		// WebDriver webdriver = new ChromeDriver();

		// Firefox Browser Launch
		//WebDriver webdriver = new FirefoxDriver();

		// open url page
		String url = "https://rahulshettyacademy.com";

		/*
		 * //Chrome Browser opening and checking current url. driver.get(url);
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); //driver.close();
		 *  driver.quit();
		 */

		/*
		 * // Firefox Browser opening and checking current url. webdriver.get(url);
		 * System.out.println(webdriver.getTitle());
		 * System.out.println(webdriver.getCurrentUrl()); 
		 *webdriver.quit();
		 */
		
		// Microsoft Edge Browser Launch
				WebDriver webdriver = new EdgeDriver();
		// Microsoft Edge Browser Browser opening and checking current url.
				webdriver.get(url);
				System.out.println(webdriver.getTitle());
				System.out.println(webdriver.getCurrentUrl()); 
				webdriver.manage().window().maximize();
				//webdriver.quit();
				

	}

}
