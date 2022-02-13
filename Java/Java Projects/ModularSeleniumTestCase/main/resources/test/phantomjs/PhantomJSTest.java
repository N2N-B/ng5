package phantomjs;

import java.io.File;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
	public static void main(String[] args) {
		File path=new File("F:\\Java Projects\\ModularSeleniumTestCase\\lib\\phantomjs\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path",path.getAbsolutePath());
		PhantomJSDriver driver =  new PhantomJSDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Title of the web page is: " + driver.getTitle());
		driver.quit();
	}
}
