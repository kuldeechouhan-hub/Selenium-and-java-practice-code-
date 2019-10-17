package Guru99;

import java.util.Set; 
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase4 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
	FirefoxDriver driver = new FirefoxDriver(); 

	driver.manage().window().maximize();
	
	driver.get("http://live.guru99.com/index.php/");
	
	//driver.findElement(By.linkText("Mobile")).click(); Why not working
	
	driver.findElement(By.xpath("//a[@href=\"http://live.guru99.com/index.php/mobile.html\"]")).click();
	
   WebElement sony = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")); 
	
   sony.click();
   String sonyparentwindowtitle = sony.getText(); 
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
   
   driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
   
   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
   
   driver.findElement(By.cssSelector("button[type=button][title=Compare]")).click();
	
	Thread.sleep(5000);
   
	String parentwindow = driver.getWindowHandle(); 
	
	String childwindow = null; 
	
	Set<String> handle = driver.getWindowHandles(); 
	
	Iterator<String> iterate = handle.iterator(); 
	
	while(iterate.hasNext())
	{
		
	  childwindow = iterate.next(); 
		
	}
	
	driver.switchTo().window(childwindow); 
	
	String text1 = driver.findElement(By.tagName("h1")).getText(); 
	
	String text2 = "COMPARE PRODUCTS"; 
	
	if(text1==text2)
	{
		
		System.out.println("Pop up window is opened correctly");
	}
	
	WebElement sony1 = driver.findElement(By.cssSelector("a[title=Sony Xperia]"));
	String sonypopupwindowtitle = sony1.getText(); 
	
    if (sonyparentwindowtitle==sonypopupwindowtitle)
    	
    {
    	System.out.println("Product is matching");
    	
    }
	
	//driver.findElement(By.cssSelector("a[title=IPhone]")); 
	
	 driver.close();
	
	 
	 driver.switchTo().window(parentwindow); 	 
	}}

		
		
     


