package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Tetscase1 
{

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.get("http://live.guru99.com/");
		
		driver.manage().window().maximize();
		
        String my_title=driver.getTitle();
		
		System.out.println("Title of the page is:" +my_title );
		
		//driver.findElement(By.linkText("Mobile")).click();  
		
		driver.findElement(By.cssSelector("a[href='http://live.guru99.com/index.php/mobile.html']")).click(); 
		
		String my_title1= driver.getTitle();
		
		System.out.println("Title of the page is:" +my_title1);
		
		//System.out.println("Title of the page is:" +driver.getTitle());
		
		Select obj =new Select(driver.findElement(By.cssSelector("select[title='Sort By']")));
		
		obj.selectByVisibleText("Name");
		
		String url = driver.getCurrentUrl();
		
	   Assert.assertEquals(url, "http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");
				
	   System.out.println("Yoo Mobile devices are sorted by name");
	}
	
}
