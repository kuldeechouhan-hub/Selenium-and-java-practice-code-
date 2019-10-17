package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver; 
	By userGuruName = By.name("uid");
	By passwordGuru = By.name("password");
	By login = By.name("btnLogin");
	By titletext = By.className("barone");
	
	public Login(WebDriver driver)
	{
	this.driver = driver;
	}
	
	public void setUserName(String strUserName)
	{
		driver.findElement(userGuruName).sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword)
	{
		driver.findElement(passwordGuru).sendKeys(strPassword);
	}
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	
	public String getLoginTitle()
	{
		return driver.findElement(titletext).getText(); 
	}
	
	
}
