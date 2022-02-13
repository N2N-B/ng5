package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HowToBypassSslCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//General Chrome Profile
		//DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		//desiredCapabilities.acceptInsecureCerts();
		
		//Belongs to a local  browser
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.merge(desiredCapabilities);
		chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		String url = "https://cacert.org/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}

}
