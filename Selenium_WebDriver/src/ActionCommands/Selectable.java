package ActionCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
	
		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']/span")); 
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(slider, 100, 0).build().perform();
		
	    actions.clickAndHold(slider).moveByOffset(100, 0).release().perform(); 
		
		

	}

}
