package testgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest {

	public static void main(String[] args) throws MalformedURLException {
		// DesiredCapabilities

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		desiredCapabilities.setPlatform(Platform.WINDOWS);

		// WebDriver Initialize in node machine
		WebDriver driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), desiredCapabilities);
		String url = "https://www.google.com/";
		driver.get(url);

	}

}
