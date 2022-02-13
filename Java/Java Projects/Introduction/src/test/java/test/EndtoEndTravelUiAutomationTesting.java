package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEndTravelUiAutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		driver.manage().window().maximize();

		// RadioButton Automation testing
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());

		// Dynamic dropdown from destination Automation testing
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// from destination in Dynamic dropdown
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='DEL']")).getAccessibleName());

		Thread.sleep(2000);

		// to destination in Dynamic dropdown using parent child relationship using
		// xPath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		System.out.println(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).getAccessibleName());

		// Calendar current date Automation testing
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).getAccessibleName());

		// Checking radiobutton one way if it's one way then the calendar future date
		// needs to be disabled
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		// Checkbox Automation testing

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Automating the update dropdown

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getAccessibleName());

		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();//4 times needs to be clicked.

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		// select keyword - Static dropdown
		Select selectDropdown = new Select(dropdown);

		// 3 ways to select the static select dropdown menu values

		// 1st way to select the static select dropdown menu values
		selectDropdown.selectByIndex(3);
		System.out.println(selectDropdown.getFirstSelectedOption().getText());

		// getFirstSelectedOption => Single selection
		// The first selected option in this select tag (or the currently selected
		// option in a normal select.
		// Used in Static dropdown
		// Used to check the text of the static dropdown

		// 2nd way to select the static select dropdown menu values
		selectDropdown.selectByValue("AED");
		System.out.println(selectDropdown.getFirstSelectedOption().getText());

		// 3rd way to select the static select dropdown menu values
		selectDropdown.selectByVisibleText("INR");
		System.out.println(selectDropdown.getFirstSelectedOption().getText());
		

		driver.findElement(By.cssSelector("input[value='Search']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[value='Search']")).getAccessibleName());

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}

}
