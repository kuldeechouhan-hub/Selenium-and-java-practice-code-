package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.HomePage;
import PageFactory.Login;

public class TestLoginWithPageFactroy {

	
	WebDriver driver ; 
	HomePage objHome ; 
	Login objLogin;  
	
	
	@BeforeTest
	
	public void start()
	{
		driver = new FirefoxDriver(); 
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	
	
  @Test(priority=0)
  public void verifyhomepagetitle() 
  {
  
  objLogin = new Login(driver);
  
  String logintitle = objLogin.getLoginTitle();
  Assert.assertTrue(logintitle.toLowerCase().contains("guru99 bank"));
  objLogin.setUserName("mngr192345");
  objLogin.setPassword("batugyr");
  objLogin.clickLogin();
  
  objHome = new HomePage(driver);
  
  String homepageuname =  objHome.getHomePageDashboardUserName();
  Assert.assertTrue(homepageuname.toLowerCase().contains("manger id : mngr192345"));
  
  }
  
  
  	
	
}
