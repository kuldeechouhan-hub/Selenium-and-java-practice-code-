package Frameworks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Data_Driven {

	WebDriver driver ; 
	
	@BeforeMethod
	public void start()
	{
	driver = new FirefoxDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void flightbook() throws BiffException, IOException 
	{
		File file = new File("H:\\Data_InExcel.xls"); 
		Workbook workbook = Workbook.getWorkbook(file); 
		Sheet sheet = workbook.getSheet(0);
 
		
		WebElement username = driver.findElement(By.name("userName")); 
		username.clear();
		username.sendKeys(sheet.getCell(0, 0).getContents());
		WebElement pass = driver.findElement(By.name("password")); 
		pass.clear();
		pass.sendKeys(sheet.getCell(1,0).getContents());
		
	}
	
	
	
}
