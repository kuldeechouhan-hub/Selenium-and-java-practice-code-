package junit;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class purchaseproduct
{
WebDriver driver;  

 
@Before 
public void setup() throws Exception 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kd\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://live.guru99.com/"); 
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
}


@Test
public void purchasingeproduct()
{

driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account'][contains(text(),'My Account')]")).click(); 

driver.findElement(By.cssSelector("input[id='email'][title='Email Address']")).sendKeys("jnk@gmail.com");

driver.findElement(By.cssSelector("input[id='pass'][title='Password']")).sendKeys("asdf#123");

driver.findElement(By.xpath("//button[@id='send2']")).click();

driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")).click();

driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click(); 

driver.findElement(By.xpath(".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label")).click(); 


driver.findElement(By.xpath("//li[@class='method-checkout-cart-methods-onepage-bottom']//button[@title='Proceed to Checkout']//span//span[contains(text(),'Proceed to Checkout')]")).click();


driver.findElement(By.xpath("//input[@id='billing:street1']")).sendKeys("ABC");

driver.findElement(By.xpath("//input[@id='billing:city']")).sendKeys("New York");


Select drpdown = new Select(driver.findElement(By.xpath("//select[@id='billing:region_id']"))); 

drpdown.selectByVisibleText("New York"); 

driver.findElement(By.xpath("//input[@id='billing:postcode']")).sendKeys("542896"); 

Select country = new Select(driver.findElement(By.xpath("//select[@id='billing:country_id']"))); 

country.selectByVisibleText("United States");


driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("123456789"); 


driver.findElement(By.xpath(".//*[@id='billing-buttons-container']/button")).click();

String Fixrate = "$5.00"; 
String Flatrate = driver.findElement(By.xpath(".//*[@id='checkout-shipping-method-load']/dl/dd/ul/li/label/span")).getText();

if(Flatrate==Fixrate)
{

	System.out.println("Flat rate of $15 is genrated");	
}

else
{
	System.out.println("ERROR");	
}
//Assert.assertEquals(Flatrate, Fixrate);  

//System.out.println("Flat rate of $15 is genrated");

driver.findElement(By.xpath(".//*[@id='shipping-method-buttons-container']/button")).click(); 

driver.findElement(By.xpath("//label[@for='p_method_checkmo']")).click(); 


String Subtotal = driver.findElement(By.xpath("//tr[@class='first']//span[@class='price'][contains(text(),'$615.00')]")).getText(); 

String Total =  Fixrate+Subtotal; 

String GrandTotal = driver.findElement(By.xpath("//span[contains(text(),'$620.00')]")).getText();

Assert.assertEquals(GrandTotal, Total);

System.out.println("Flat rate of $5 is added"); 

driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click(); 


}


@After
public void tearDown() throws Exception 
{
driver.close();
driver.quit();

}



}