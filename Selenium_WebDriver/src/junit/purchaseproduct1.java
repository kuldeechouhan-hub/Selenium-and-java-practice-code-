package junit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class purchaseproduct1 {

	WebDriver driver;  

	 
	@Before 
	public void setup() throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://live.guru99.com/"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	}
	
	
	@Test
	public void purchasingeproduct()
	{

	driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account'][contains(text(),'My Account')]")).click(); 

	driver.findElement(By.cssSelector("input[id='email'][title='Email Address']")).sendKeys("jnk@gmail.com");

	driver.findElement(By.cssSelector("input[id='pass'][title='Password']")).sendKeys("asdf#123");

	driver.findElement(By.xpath("//button[@id='send2']")).click();

	driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")).click();
     
	driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click(); 
	
	Select country = new Select(driver.findElement(By.xpath(".//*[@id='country']"))); 

	country.selectByVisibleText("United States");
	
	Select drpdown = new Select(driver.findElement(By.xpath(".//*[@id='region_id']"))); 

	drpdown.selectByVisibleText("New York");
	
	WebElement zip = driver.findElement(By.xpath(".//*[@id='postcode']"));  
	
	zip.clear();
	zip.sendKeys("345678");
	
	driver.findElement(By.xpath(".//*[@id='shipping-zip-form']/div/button")).click(); 
	
	WebElement fixrate = driver.findElement(By.xpath(".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label")); 
	
	String text = fixrate.getText(); 
	String text1= "Fixed - $5.00"; 
	
	if(text==text1)
	{
	System.out.println("Fixed - $5.00 is generated");
	}
	else
	{
		System.out.println("Error in finding fixed rate");
	}
	
	}
}


