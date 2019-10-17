package junit;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class testCase7

{

	WebDriver driver ; 
	FirefoxProfile fprofile = new FirefoxProfile();
	//FirefoxProfile fprofile; 
	
	@Before

	public void setup()

	{

		
		
		driver = new FirefoxDriver(fprofile);

		driver.get("http://live.guru99.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  

	}

	@After
	public void teardown()
	{
		driver.close();
		driver.quit(); 
	}


	@Test 
	public void verifytest()
	{

		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account'][contains(text(),'My Account')]")).click();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yash@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("asdf#123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Orders')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'View Order')]")).click();



		String orderidandstateheader = "ORDER #100009164 - PENDING";  
		String OrderidandState = driver.findElement(By.xpath("//h1[contains(text(),'Order #100009164 - Pending')]")).getText(); 

        Assert.assertEquals(OrderidandState, orderidandstateheader); 

		System.out.println("Previously created order is displayed and status is pending"); 

			 
			
			
			fprofile.setPreference("browser.download.folderList", 2);
			fprofile.setPreference("browser.download.manager.showWhenStarting", false);
			fprofile.setPreference("browser.helperApps.alwaysAsk.force", false);
			fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
			fprofile.setPreference("browser.download.dir", "E:\\MySeleniumDownloads");
			fprofile.setPreference("pdfjs.disabled", true);
			driver.findElement(By.xpath("//a[@class='link-print']")).click();
	        
			System.out.println("Program completed"); 
	
			
		}
		
        
        
}         

	

