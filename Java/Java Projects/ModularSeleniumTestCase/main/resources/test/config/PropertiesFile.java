package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import testcase.AutomationPracticeFormTest;
import testcase.FilterTheWebTableUsingJavaStreams;
import testcase.InvokingMultipleWindowsSelenium;
import testcase.ModularTestScript;
import testcase.RelativeLocators;
import testcase.StreamSortAndCompareAndFetchTheValueFromTheTablePagination;

public class PropertiesFile {

	static Properties properties = new Properties();

	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
	}

	public static void readPropertiesFile() {
		try {
			InputStream input = new FileInputStream(
					"F:\\Java Projects\\ModularSeleniumTestCase\\main\\resources\\test\\config\\config.properties");
			properties.load(input);
			ModularTestScript.browser = properties.getProperty("browser");
			StreamSortAndCompareAndFetchTheValueFromTheTablePagination.browser = properties.getProperty("browser");
			FilterTheWebTableUsingJavaStreams.browser = properties.getProperty("browser");
			AutomationPracticeFormTest.browser = properties.getProperty("browser");
			RelativeLocators.browser = properties.getProperty("browser");
			InvokingMultipleWindowsSelenium.browser = properties.getProperty("browser");
        	System.out.println(InvokingMultipleWindowsSelenium.browser);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream(
					"F:\\Java Projects\\ModularSeleniumTestCase\\main\\resources\\test\\config\\config.properties");
			properties.setProperty("browser", "Chrome");
			properties.setProperty("result", "pass");
			System.out.println(properties.setProperty("browser", "Chrome"));
			properties.store(output, "I am so cool" );

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
