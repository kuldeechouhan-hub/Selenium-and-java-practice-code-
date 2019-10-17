package webdriver_practice;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FindElements {

	public static void main(String[] args) {

		

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/ajax.html");

		driver.manage().window().maximize();

		//List <WebElement> elements = driver.findElements(By.name("name"));

		List<WebElement> elements= driver.findElements(By.name("name")); 
		
		int size= elements.size(); 
		
		System.out.println("List of elements by name attributes are: " +size);  
		
		
		for(int i=0; i<size; i++)
		{
			
             System.out.println("Radio button text is :" +elements.get(i).getAttribute("value")); 
		}
		
		
		driver.quit(); 

	}

}
