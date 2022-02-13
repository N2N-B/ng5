package htmlunitdriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlUnitDriverTest {
	public static void main(String[] args) throws Exception {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://www.google.co.in/");
		System.out.println("Title is: " + driver.getTitle());

		WebClient webClient = (WebClient) get(driver, "webClient");

		webClient.getBrowserVersion();
		System.out.println(webClient.getBrowserVersion());

		webClient.getBrowserVersion().isChrome();
		webClient.getBrowserVersion().isEdge();
		System.out.println(webClient.getBrowserVersion().isChrome());
		System.out.println(webClient.getBrowserVersion().isEdge());

		driver.quit();
	}

	private static Object get(Object object, String field) throws Exception {
		Field f = object.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(object);
	}
}