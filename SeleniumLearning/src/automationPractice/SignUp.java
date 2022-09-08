package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
//		WebElement getAQuoteButton = driver.findElement(By.xpath("//*[contains(text(),'Get a quote')]"));
//		getAQuoteButton.click();
//		
//		WebElement make = driver.findElement(By.id("make"));
//		Select select = new Select(make);
//		select.selectByVisibleText("BMW");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Implicite wait
		//Explicite wait
		//Fluent wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		signIn.click();
		WebElement createAccount = 	driver.findElement(By.id("email_create"));
		createAccount.sendKeys("rsahfkuhas@gmail.com");
		WebElement createAccountAdded = driver.findElement(By.id("SubmitCreate"));
		createAccountAdded.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("radio-inline")));
		
		WebElement goForMr = driver.findElement(By.className("radio-inline"));
		goForMr.click();
		
		
		WebElement FirstName = 	driver.findElement(By.id("customer_firstname"));
		FirstName.sendKeys("First Name");
		WebElement LastName = driver.findElement(By.id("customer_lastname"));
		LastName.sendKeys("Last Name");
		WebElement PasswordText = driver.findElement(By.id("passwd"));
		PasswordText.sendKeys("12345678910");
		WebElement UserDays = driver.findElement(By.id("days"));
		Select selectDay = new Select(UserDays);
//		UserDays.sendKeys("9  ");
		selectDay.selectByValue("9");
		List<WebElement> dayList = selectDay.getOptions();
		
		
		WebElement UserMonths = driver.findElement(By.id("months"));
		Select selectMonth = new Select(UserMonths);
//		UserMonths.sendKeys("October  ");
		selectMonth.selectByValue("10");
		
		WebElement UserYear = driver.findElement(By.id("years"));
		UserYear.sendKeys("1990  ");
		WebElement UserCompany = driver.findElement(By.id("company"));
		UserCompany.sendKeys("Agiletech");
		WebElement UserAddress = driver.findElement(By.id("address1"));
		UserAddress.sendKeys("lee highway");
		WebElement UserAddress2 = driver.findElement(By.id("address2"));
		UserAddress2.sendKeys("1111");
		WebElement UserCity = driver.findElement(By.id("city"));
		UserCity.sendKeys("Fairfax");
		WebElement UserState = driver.findElement(By.id("id_state"));
		UserState.sendKeys("Virginia ");
		WebElement UserZipcode = driver.findElement(By.id("postcode"));
		UserZipcode.sendKeys("22030");
		WebElement UserCountry = driver.findElement(By.id("id_country"));
		UserCountry.sendKeys("USA ");
		WebElement UserPhone = driver.findElement(By.id("phone_mobile"));
		UserPhone.sendKeys("1234567890");
		WebElement UserAliasAddress = driver.findElement(By.id("alias"));
		UserAliasAddress.sendKeys("");
		WebElement UserRegister = driver.findElement(By.id("submitAccount"));
		driver.navigate().back();
//		UserRegister.click();
		
	}

}
