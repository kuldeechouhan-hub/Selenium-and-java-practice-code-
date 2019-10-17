package parallel_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*; 


public class parallerbrowsertest {
           
	public WebDriver driver= null;   

    @BeforeClass
    @Parameters({"browser"})

	public void setup(String browser)
	{
        if(browser.equals("FFX"))
		{
           driver = new FirefoxDriver();
           System.out.println("Test starts running in Firefix browser");
		}

		else if(browser.equals("CRM"))
	{
     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		System.out.println("Test start runnin in Chrome browser"); 

	}

	driver.manage().window().maximize(); 

	driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");

}

@Test
public void verifyTitle()
{
       String expectedtitle = "Only Testing: LogIn"; 
        String actualtitle = driver.getTitle();
        Assert.assertEquals(expectedtitle, actualtitle); 
        System.out.println("Title of the page is verified"); 
}

@Test
public void getTextFromAlert()
{
	WebElement userId = driver.findElement(By.xpath("//input[@name='userid']")); 
	userId.clear();
	userId.sendKeys("kuldeep"); 
	WebElement userpass = driver.findElement(By.xpath("//input[@name='pswrd']")); 
	userpass.clear();
	userpass.sendKeys("chouhan"); 
	driver.findElement(By.xpath("//input[@value='Login']")).click(); 
	String alert = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept(); 
	Assert.assertEquals("UserId Is : kuldeep  Password Is : chouhan", alert); 
	System.out.println("Alert is verified"); 
}
@AfterClass
public void closebrowser() 
{
	driver.quit(); 
}
}