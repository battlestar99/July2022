package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(7000);
		
		//Locators
		//id, name, className, xpath, cssSelector, 
		//linkText, partialLinkText, tagName
		
		Thread.sleep(3000);
//		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
