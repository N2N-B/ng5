package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import test.HowToTakeScreenshotsInSelenium;

public class SeleniumConfigurationPropertiesFile {
	static Properties properties = new Properties();

	public static void main(String[] args) {
		readPropertiesFile();
	}

	public static void readPropertiesFile() {
		try {
			InputStream input = new FileInputStream(
					"F:\\Java Projects\\Intoduction\\src\\config\\config.properties");
			properties.load(input);
			HowToTakeScreenshotsInSelenium.browser = properties.getProperty("browser");
			System.out.println(HowToTakeScreenshotsInSelenium.browser);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
