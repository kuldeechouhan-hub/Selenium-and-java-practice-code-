package webdriver_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadingFiles {

	public static void main(String[] args) {

		FirefoxProfile fprofile = new FirefoxProfile();
		
		fprofile.setPreference("browser.download.dir", "E:\\MySeleniumDownloads");
		fprofile.setPreference("browser.download.folderList", 2); 
		fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
				  "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" 
                  + "application/pdf;" 
                  + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;"
                  + "text/plain;" 
                  + "text/csv;" ); 
		  fprofile.setPreference("browser.download.manager.showWhenStarting", false); 
		  fprofile.setPreference("pdfjs.disabled", true);
		
		FirefoxDriver driver = new FirefoxDriver(fprofile);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
		
		driver.findElement(By.linkText("Download Text File")).click();
		driver.findElement(By.linkText("Download PDF File")).click();
		driver.findElement(By.linkText("Download CSV File")).click();
		driver.findElement(By.linkText("Download Excel File")).click();
		driver.findElement(By.linkText("Download Doc File")).click();
		
		
       

		

		

	

		
		
		
		
		

	}

}
