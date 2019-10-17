package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert; 

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://live.guru99.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"http://live.guru99.com/index.php/mobile.html\"]")).click();
		
		driver.findElement(By.cssSelector("a[title='Sony Xperia']"));
		
	    driver.findElement(By.xpath("//button[@class='button btn-cart'][@title='Add to Cart']")).click();
	    
	    WebElement qtybox=driver.findElement(By.cssSelector("input[class='input-text qty'][title='Qty']")); 
	    
	    qtybox.clear();
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    qtybox.sendKeys("1000");
	    
	    Thread.sleep(5000);
	    
	    //driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS); 
	    
	    driver.findElement(By.cssSelector("button[class='button btn-update'][name='update_cart_action'][type='submit']")).click();
	    		
	    WebElement obj= driver.findElement(By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div/div/ul/li/ul/li/span")); 
	    
	    
	    //String something = driver.findElement(By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div/div/ul/li/ul/li/span")).getText(); 

	    //why not String in place of Webelement 
	    
	    String actual_result = obj.getText(); 
	  
	    
	    System.out.println("Error message is generated: "+ actual_result); 
	    
	    String expected_result="Some of the products cannot be ordered in requested quantity."; 
	    
	   Assert.assertEquals(actual_result, expected_result);
		
	   System.out.println("Error message verified");

	   driver.findElement(By.id("empty_cart_button")).click();
	   
	   
	   
	}

}
