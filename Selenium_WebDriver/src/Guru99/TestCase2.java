package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestCase2 {

	public static void main(String[] args) {
		
	 
		FirefoxDriver driver = new FirefoxDriver(); 
		
        driver.get("http://live.guru99.com/"); 
        
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("a[href='http://live.guru99.com/index.php/mobile.html']")).click();
		
        driver.findElement(By.cssSelector("a[title='Sony Xperia']")); 
        
        System.out.println("Sony Xperia is found");
        
      WebElement price1 = driver.findElement(By.cssSelector("span[class='price']")); 
        
        String value1 = price1.getText(); 
        
        System.out.println("Price is:" +value1);
        
        driver.findElement(By.cssSelector("a[title='Sony Xperia']")).click();
        
		WebElement price2 = driver.findElement(By.cssSelector("span[class='price']"));
		
		String value2 = price2.getText();
		
		Assert.assertEquals(value1, value2);
		
		System.out.println("Price is matching for device");
		
		
	
		
	}

}
