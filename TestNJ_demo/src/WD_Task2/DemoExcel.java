package WD_Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import org.testng.annotations.BeforeMethod;

public class DemoExcel 

{

	public static void main(String[] args) throws IOException {


		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("MyFirefoxProfile");
		WebDriver driver = new FirefoxDriver(myprofile);



		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 

		File file = new File("H:\\Login_DataCombination.xls"); 
		FileInputStream excel = new FileInputStream(file); 
		HSSFWorkbook wb = new HSSFWorkbook(excel); 
		HSSFSheet ws = wb.getSheet("Input");

		int rownum = ws.getLastRowNum()+1; 
		int columnnum = ws.getRow(0).getLastCellNum(); 


		String[][] data = new String[rownum][columnnum]; 

		for(int i=0 ; i<rownum; i++)
		{
			HSSFRow row = ws.getRow(i);

			for(int j=0; j<columnnum; j++)

			{

				HSSFCell cell = row.getCell(j); 

				String value = cellToString(cell); 

				data[i][j]= value;


				driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(value);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(value);
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				//driver.switchTo().alert().accept();

			}
		}

	}

	public static String cellToString(HSSFCell cell) {

		int type  ; 
		Object result; 
		type= cell.getCellType(); 

		switch(type)
		{
		case 0: 
			result = cell.getNumericCellValue(); 
			break;
		case 1:
			result = cell.getStringCellValue(); 
			break;

		default :
			throw new RuntimeException("There are no support for this type of cell");

		}

		return result.toString();


	}



}
