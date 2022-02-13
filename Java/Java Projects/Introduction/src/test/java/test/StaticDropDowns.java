package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		driver.manage().window().maximize();

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
		
		

	}

}
