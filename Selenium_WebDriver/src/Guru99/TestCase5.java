package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase5 {

	
	public static void main(String args[])
	
	{
		
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("http://live.guru99.com/index.php/");

		driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[3]/div/div[4]/ul/li[1]/a")).click();
		
		//Why Xpath , link text is not working even not css
		
		//driver.findElement(By.cssSelector("a[class='button'][title='Create an Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath(".//*[@id='login-form']/div/div[1]/div[2]/a")).click();
		
		
		driver.findElement(By.id("firstname")).sendKeys("Kuldeep");
		
		driver.findElement(By.id("middlename")).sendKeys("Singh");
		
		driver.findElement(By.id("lastname")).sendKeys("Chouhan");
		
		driver.findElement(By.id("email_address")).sendKeys("dedsdsdddt@abc.com");
	    
		driver.findElement(By.id("password")).sendKeys("asdf#123");
		
		driver.findElement(By.id("confirmation")).sendKeys("asdf#123");
		
		driver.findElement(By.cssSelector("button[title=Register]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		WebElement message = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span")); 
		
		String text = message.getText();
		
		//String text1 = "Thank you for registering with Main Website Store."; 

		if(text.contains("Thank you for registering with Main Website Store."))
		{
		System.out.println("Registration is Done");
		}
		else
		{
			System.out.println("Registration is not Done");
		}
		
		driver.findElement(By.linkText("TV")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.linkText("Add to Wishlist")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//driver.findElement(By.cssSelector("button[title=Share Wishlist][name=save_and_share]")).click();
		driver.findElement(By.xpath(".//*[@id='wishlist-view-form']/div/div/button[1]")).click(); 
		driver.findElement(By.id("email_address")).sendKeys("kuldeep@abc.com, demo@gail.com");
		driver.findElement(By.id("message")).sendKeys("This product is awesome you can purchase it");
	    driver.findElement(By.xpath(".//*[@id='form-validate']/div[2]/button")).click();
	    String sharedtext = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")).getText();
	    
	    if(sharedtext.contains("Your Wishlist has been shared."))
	    
	    {
	         System.out.println("LG LCD TV has been shared");
	    } 
	}
	
	
}
