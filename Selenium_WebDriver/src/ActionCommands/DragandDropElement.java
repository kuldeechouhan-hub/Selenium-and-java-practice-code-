package ActionCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropElement {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		
		WebElement dragElementFrom = driver.findElement(By.xpath(".//*[@id='dragdiv']"));
		
		WebElement dropElementTo = driver.findElement(By.xpath(".//*[@id='dropdiv']")); 
		
		Actions builder = new Actions(driver); 
		
		Action draganddrop = builder.clickAndHold(dragElementFrom)
		.moveToElement(dropElementTo)
		.release(dropElementTo)
		.build(); 
		
		draganddrop.perform(); 
	    
		

	}

}
