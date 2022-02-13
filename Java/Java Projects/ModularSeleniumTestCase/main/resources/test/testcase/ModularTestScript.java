package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;
/*
 * Description : Test scripts or cases of selenium for chrome browser and mozilla firefox browser automation.
 * @author Naren Bagavathy
 * @date 30/10/2021
 * 
*/
public class ModularTestScript {
	// Class variables or global variables or instance variables.
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		//Calling seperate functionalities or methods 
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
	}

	@SuppressWarnings("unused")
	private static void setBrowser() {
		//Setting up the browser
		browser = "Chrome";
    }

	private static void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");
        //This condition block sets config for firefox browser 
		if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "/lib/geckodriver/geckodriver.exe");
			System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
        
		//This condition block sets config for chrome browser 
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	private static void runTest() {
		//Browser gets controlled by selenium and automation such as opening and closing browser is done.
		//Built-in logging that means you can put System.out.println("Chrome browser gets opened")
        //whereever you think it will be helpful to debug your code.
		System.out.println("Chrome browser gets opened");
        driver.get("https://www.google.co.in/");
		System.out.println("Chrome browser gets closed");
		driver.quit();
	}
	
}
