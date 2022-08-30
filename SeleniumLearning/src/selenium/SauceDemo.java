package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		//Locators
		//id, name, className, xpath, cssSelector, 
		//linkText, partialLinkText, tagName
		//xpath - Absolute  -  Relative 
		
		WebElement userNameTextbox = driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		userNameTextbox.sendKeys("standard_user");
		
		WebElement passwordTextbox = driver.findElement(By.name("password"));
		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		
		String expectedUrl = "Https://Www.Saucedemo.Com/Inventory.Html";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		
		if(expectedUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("URL mathed - test passed");
		}else {
			System.out.println("URL didn't match - test failed");
		}
	}

}
