package webdriver_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements2 {

	public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        
		driver.get("https://www.facebook.com");

		List <WebElement> fbanchortags = driver.findElements(By.tagName("a"));
		
		System.out.println("value is:" +fbanchortags.size());
		
		for(int i=0; i<fbanchortags.size(); i++)
		{
			System.out.println("all anchor tags name is" +fbanchortags.get(i).getAttribute("title"));
			
		}
		

	}

}
