package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	WebDriver driver;
	
	@FindBy(xpath="//table//tr[@class='heading3']")
	WebElement homePageUserName; 
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver ; 
	}
	
	public String getHomePageDashboardUserName()
	{
		return homePageUserName.getText();
		
		
	}
	
	
	
}
