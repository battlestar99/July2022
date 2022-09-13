package testScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		// 2003 - they have extension - doc, xls
		// HSSF
		// 2007 - they have extension - docx, xlsx
		// XSSF
		
//		HSSF (Horrible SpreadSheet Format) 
//		XSSF (XML SpreadSheet Format)
		
		File file = new File("C:\\Users\\Agile1Tech\\Desktop\\signInData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		XSSFRow row = sheet1.getRow(1);
		XSSFCell cell = row.getCell(0);
		String userName = cell.toString();
		System.out.println(userName);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		//Locators
		//id, name, className, xpath, cssSelector, 
		//linkText, partialLinkText, tagName
		//xpath - Absolute  -  Relative 
		
		WebElement userNameTextbox = driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		userNameTextbox.sendKeys(userName);
		
		WebElement passwordTextbox = driver.findElement(By.name("password"));
		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
		loginButton.click();
		
		fis.close();
		wb.close();
		
	}

}
