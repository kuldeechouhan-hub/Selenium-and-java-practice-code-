package webdriver_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class FirstWDScript {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebok.com");
		//driver.findElement(By.id("email")).sendKeys("Kuldeep");
		//driver.findElement(By.name("pass")).sendKeys("Chouhan");
		//driver.findElement(By.cssSelector("input[type='Submit'][value='Log In']")).click();
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Kuldeep");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Chouhan");
		
		
		Select obj = new Select(driver.findElement(By.id("day"))); 
		
		obj.selectByValue("8");
		
		
		
		
	}

}
