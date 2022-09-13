package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {
	WebDriver internalDriver;
	
	public SigninPage(WebDriver driver) {
		internalDriver = driver;
	}
	
	public void userNameTextBox(String userName) {
		WebElement userNameTextbox = internalDriver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		userNameTextbox.sendKeys(userName);
	}
	
	public WebElement passwordTextbox() {
		WebElement pwdTextbox = internalDriver.findElement(By.name("password"));
		return pwdTextbox;
	}
	
	public WebElement loginButton() {
		WebElement loginBtn = internalDriver.findElement(By.xpath("//input[@type = 'submit']"));
		return  loginBtn;
	}
	

}
