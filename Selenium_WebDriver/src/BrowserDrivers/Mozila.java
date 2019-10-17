package BrowserDrivers;

import org.openqa.selenium.firefox.FirefoxDriver; 

public class Mozila {

	public static void main(String[] args) {

     FirefoxDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("title is:"+title);
		driver.quit();

	}

}
