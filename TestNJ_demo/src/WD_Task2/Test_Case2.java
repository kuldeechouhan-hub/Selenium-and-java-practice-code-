package WD_Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Test_Case2 
{

	ProfilesIni profile = new ProfilesIni();
	FirefoxProfile myprofile = profile.getProfile("MyFirefoxProfile");
	WebDriver driver = new FirefoxDriver(myprofile);

	@BeforeMethod
	public void start()
	{

		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 

	}


	@Test
	public static void login() throws FileNotFoundException  
	{


		File file = new File("H:\\Login_DataCombination.xls");
		FileInputStream excel = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet ws = wb.getSheet("Input"); 

		int rownum = ws.getLastRowNum()+1;
		int columnnum = ws.getRow(0).getLastCellNum(); 

		String[][] data = new String[rownum][columnnum]; 

		for(int i=0; i<rownum; i++)
		{
			HSSFRow row = ws.getRow(i); 

			for(int j=0; j<columnnum; j++)
			{

				HSSFCell cell = row.getCell(j); 

				String value = cell.getStringCellValue().toString(); 

				//data[i][j] = value; 
				
				System.out.println("value is " + value);

				//driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(value);
				//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(value);
				//driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				//driver.switchTo().alert().accept();
			}

		}


	}

	@AfterMethod

	public void terminate()
	{

		driver.close();
		driver.quit();
	}



}
