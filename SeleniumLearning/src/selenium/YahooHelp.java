package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		WebElement help = driver.findElement(By.xpath("//*[@id='login-body']/div/span[2]/a"));
		help.click();

		String url =driver.getCurrentUrl();


		WebElement title = driver.findElement(By.xpath("//*[@class='intro']/h1"));
		String header = title.getText();

		System.out.println("The Title is : "+header);
		System.out.println("Also the URL is : "+url);


//		WebElement faq = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[1]/a"));
//		String browse = faq.getText();
//
//		WebElement passSignIn = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[2]/a"));
//		String browse1 = passSignIn.getText();
//
//		WebElement accountKey = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[3]/a"));
//		String browse2 = accountKey.getText();
//
//		WebElement accountSecurity = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[4]/a"));
//		String browse3 = accountSecurity.getText();
//
//		WebElement createOrDeleteccount = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[5]/a"));
//		String browse4 = createOrDeleteccount.getText();
//
//		WebElement manageAccount = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[6]/a"));
//		String browse5 = manageAccount.getText();
//
//		WebElement accesibility = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[7]/a"));
//		String browse6 = accesibility.getText();
//
//		WebElement YahooPolicy = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li[8]/a"));
//		String browse7 = YahooPolicy.getText();
//		
//		System.out.println("The topics are : "+browse+", "+browse1+", "+browse2+", "+browse3+", "+browse4+", "+browse5+", "+browse6+",b"+browse7+".");
		
		List<WebElement> listOfTopic = driver.findElements(By.xpath("//*[@id='pltpcs']/ul/li"));
		System.out.println(listOfTopic.size());
		
		for(int i=1; i<=listOfTopic.size(); i++) {
		
		WebElement browseByTopic = driver.findElement(By.xpath("//*[@id='pltpcs']/ul/li["+i+"]/a"));
		String topicText = browseByTopic.getText();
		System.out.println(topicText);
		
		}
		
	}

}
