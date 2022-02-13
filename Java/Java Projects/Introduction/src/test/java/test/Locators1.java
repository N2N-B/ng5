package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author NAREN BAGAVATHY
 *
 */

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the driver executable file and initializing the driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		// Implicit wait applied globally for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open the url page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Id locator
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//name locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		//Class Name Locator
		driver.findElement(By.className("signInBtn")).click();
		
		// Getting text and printing the text => 
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        
    //Thread.sleep(1000)is used to resolve ElementClickInterceptedException
    //ElementClickInterceptedException When you click Forgot your password? sliding is happening menu and page goes to the
    //left and right hand sides, that means this is a single page application, so all react, angular frameworks providing
    //the single page application.Url will not change, page will get refreshed.Selenium is entering all the details.
    //You're running into the error because that's in the transition program and some other element is receiving click.
    //That's why selenium is not able to click on that particular button.Button is not clickable.That's why 
    //ElementClickInterceptedException is thrown on the console.
    //To fix this issue, Explicit wait needs to be used.
        Thread.sleep(1000);
		
		//Link text locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// xpath attribute and value
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		
		//customized css selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		
		//Indexing method in xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//Again point to the email text box or edit box 
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

        //Generating xpath with parent to child tags traverse techniques
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		
		//css selector => button.class name => button class name is optional => .reset-pwd-btn class name
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		 //Generating css with parent to child tags traverse techniques
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//customized xpath
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//Explicit Wait to handle ElementClickInterceptedException
		Thread.sleep(1000);
		
		//customized css selector constructing css from the id value
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		
		//Regular expression css selector customized css selector
		driver.findElement(By.cssSelector("input[type*=pass")).sendKeys("rahulshettyacademy");
		
		//checkbox using id locator
		driver.findElement(By.id("chkboxOne")).click();
		
		// Regular expression xpath customized xpath selector
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//Indexing method If you don't have the unique attributes, indexing method is used. 
		//For example: //input[@type='text'][2] =>Indexing method in xpath
		//For example: //input[@type='text']:nth-child(2) =>Indexing method in css

        // Different ways to add css selector
		// driver.findElement(By.cssSelector(".error")).getText();
		// driver.findElement(By.cssSelector("button.signInBtn")).click();
		// driver.findElement(By.cssSelector("input#inputUsername")).click();

	}

}
