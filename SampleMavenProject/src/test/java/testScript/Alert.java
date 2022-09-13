package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
//		WebElement clickMeButtonFirst = driver.findElement(By.xpath("//*[@id='alertButton']"));
//		clickMeButtonFirst.click();
//		
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println(alertText);
//		
//		driver.switchTo().alert().accept();
		
		
//		WebElement clickMeButtonThird = driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
//		clickMeButtonThird.click();
//		
//		String alertTextForThird = driver.switchTo().alert().getText();
//		System.out.println(alertTextForThird);
//		
//		driver.switchTo().alert().accept();
//		
//		WebElement text = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]"));
//		System.out.println(text.getText());
		

		
		WebElement clickMeButtonFourth = driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		clickMeButtonFourth.click();
		
		String alertTextForFourth = driver.switchTo().alert().getText();
		System.out.println(alertTextForFourth);
		
		driver.switchTo().alert().sendKeys("Zakir");
		
		driver.switchTo().alert().accept();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"promptResult\"]"));
		System.out.println(text.getText());
	}

}
