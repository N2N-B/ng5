package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		driver.manage().window().maximize();

		//Finding the From destination Bangalore id locator in the dropdown menu
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		//Selecting the From destination Bangalore xpath locator in the dynamic dropDown menu
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);

		//Selecting the to destination Chennai xpath locator in the dynamic dropDown menu using parent child

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'MAA']"))
				.click();
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'MAA']

	}

}
