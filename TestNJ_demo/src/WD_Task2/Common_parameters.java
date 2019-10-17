package WD_Task2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Common_parameters {
	
	//static FirefoxDriver driver = new FirefoxDriver();
	
	static ProfilesIni profile = new ProfilesIni();
	
	static FirefoxProfile myprofile = profile.getProfile("MyFirefoxProfile");
	
	static WebDriver driver = new FirefoxDriver(myprofile);
	
	public static void start()
	{
		
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr192345");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("batugyr");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	}

}
