package BrowserDrivers;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kd\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
    ChromeDriver driver =new ChromeDriver();  
    driver.get("http://www.google.co.in");
    
	}

}
