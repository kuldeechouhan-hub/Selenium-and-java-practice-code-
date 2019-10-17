package Testing_Pack;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVReader;

public class CSVRead {

	
	String CSV_PATH ="H:\\CSV_Data.csv"; 
	WebDriver driver; 


	@Before
	public void start() throws Exception
	{
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
		
	}


	@Test
	public void formfillup() throws IOException 

	{
		CSVReader reader = new CSVReader(new FileReader(CSV_PATH)); 
		String [] Csvcell ;
		while((Csvcell = reader.readNext()) !=null)
		{

            String fname = Csvcell[0]; 
			String lname = Csvcell[1];
			String email = Csvcell[2];
			String mobile = Csvcell[3];
			String Company = Csvcell[4];
            driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/form/input[1]")).sendKeys(fname);
			driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/form/input[2]")).sendKeys(lname);
			driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/form/input[3]")).sendKeys(email);
			driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/form/input[4]")).sendKeys(mobile);
			driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/form/input[5]")).sendKeys(Company);
			driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/form/input[6]")).click();
			driver.switchTo().alert().accept();

		}
	}
}
