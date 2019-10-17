package ActionCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
		
		Actions actions = new Actions(driver);
		
		WebElement mousehover = driver.findElement(By.xpath(".//*[@id='menu1']/div[1]")); 
		
		
		actions.moveToElement(mousehover).moveToElement(driver.findElement(By.xpath(".//*[@id='menu1choices']/a[1]"))).click().perform(); 
		

	}

}
