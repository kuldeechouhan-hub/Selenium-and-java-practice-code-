package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login

{
	WebDriver driver ;
	@FindBy(name="uid")
	WebElement userGuruName;
	@FindBy(name="password")
	WebElement userGuruPass;
	@FindBy(name="btnLogin")
	WebElement loginClick;
	@FindBy(className="barone")
	WebElement titletext;
	
	public Login(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void setUserName(String strUserName)

	{
		userGuruName.sendKeys(strUserName); 
	}

	public void setPassword(String strPassword)

	{
		userGuruPass.sendKeys(strPassword);
	}
	
	public void clickLogin()
	{
		loginClick.click();
	}

	public String getLoginTitle()

	{
		return titletext.getText();
	}



}