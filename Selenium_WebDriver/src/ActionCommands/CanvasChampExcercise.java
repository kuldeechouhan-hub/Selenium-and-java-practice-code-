package ActionCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CanvasChampExcercise {

	public static void main(String[] args) {
		
		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(ffprofile);
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); 
		driver.get("https://www.canvaschamp.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu5']/div/a/span"))); 
		
		driver.findElement(By.id("esns_box_close")).click();
		
		Actions actions = new Actions(driver);
		
		WebElement mousehover = driver.findElement(By.xpath(".//*[@id='menu5']/div/a/span")); 
        WebElement walldisplay = driver.findElement(By.xpath(".//*[@id='popup5']/div/div[1]/div/div/ul/li[2]/a"));
	    actions.moveToElement(mousehover).moveToElement(walldisplay).click().perform(); 
        
	    
	    String productname = driver.findElement(By.xpath(".//*[@id='productTemplateForm']/div[3]/div[2]/div/div/h3")).getText(); 
	    String productprice= driver.findElement(By.xpath(".//*[@id='productTemplateForm']/div[3]/div[2]/div/div/div/span[3]/span")).getText();
	    System.out.println(productname+productprice);
	    driver.findElement(By.xpath(".//*[@id='productTemplateForm']/div[3]/div[2]/div/a")).click();
	    
	   
	    driver.findElement(By.xpath(".//*[@id='wall_display_dialog']/button")).click();
	    
	    /*String productprice1 = driver.findElement(By.xpath(".//*[@id='mCSB_6_container']/ul/li[3]/a/span[3]")).getText(); 
	
	    if(productprice==productprice1)
	    {
	    	System.out.println("Price is matching");
	    }*/
	    
	    driver.findElement(By.xpath(".//*[@id='next_tab']/span")).click();
	    WebElement hi = driver.findElement(By.cssSelector("input[type='file'][name='uploadart[]']")); 
	    //hi.click();
	    hi.sendKeys("C:\\Users\\kd\\Pictures\\bheem.jpeg");
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" .//*[@id='draggable']/li/a[2]"))); 
	    
	    WebElement image = driver.findElement(By.xpath(".//*[@id='draggable']/li/a[1]/img")); 
	    WebElement dragto = driver.findElement(By.xpath(".//*[@id='design_tool']/div[2]")); 
	    
	    actions.clickAndHold(image).moveToElement(dragto).release().build().perform(); 
	    
	     
	   
	
	}
	

}
