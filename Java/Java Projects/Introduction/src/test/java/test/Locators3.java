package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      String url = "https://rahulshettyacademy.com/AutomationPractice/";
      
      //Selenium will pass until the page is fully loaded.By default, it will wait
      //Selenium will wait until all the components are fully loaded to 100%. 
      driver.get(url);
      
      //Selenium will continue once the page is loaded.But it will not wait in this step.
      //If the basic email is loaded, Selenium will continue. 
     // driver.navigate().to(url);
      
      //sibling to sibling and parent to child traverse using xpath
      driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
      System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
      
      //child to parent traverse using xpath
      System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
