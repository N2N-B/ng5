package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesFile {

	static Properties properties = new Properties();

	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
	}

	public static void readPropertiesFile() {
		try {
			InputStream input = new FileInputStream(
					"F:\\Java Projects\\mavenseleniumproject\\src\\main\\java\\config\\config.properties");
			properties.load(input);
			HowToTakeScreenshotsInSelenium.browser = properties.getProperty("browser");
			System.out.println(HowToTakeScreenshotsInSelenium.browser);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream(
					"F:\\Java Projects\\ModularSeleniumTestCase\\src\\config\\config.properties");
			properties.setProperty("browser", "Chrome");
			properties.setProperty("result", "pass");
			System.out.println(properties.setProperty("browser", "Chrome"));
			properties.store(output, "I am so cool" );

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
