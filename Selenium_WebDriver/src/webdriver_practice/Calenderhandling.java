package webdriver_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calenderhandling {

	public static void main(String[] args) {

     
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.get("http://www.jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.cssSelector("a[title=Next]")).click(); 
		
		//driver.findElement(By.linkText("10")).click();  This is working then why need to write below code
		
		WebElement table= driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody")); 
		
		table.findElements(By.tagName("tr")); 
		
		List<WebElement> columns = table.findElements(By.tagName("td"));
		
		for(WebElement cell : columns)
		
		{
	       if(cell.getText().equals("13"))
	       {
	    	 
	    	   driver.findElement(By.linkText("13")).click();
	           break;  
	       }  
	       
			
		}
		
		
		
		
		
		
		
		

	}

}
