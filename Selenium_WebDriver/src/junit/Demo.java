package junit;



import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static WebDriver driver;   
	
	@Before
	public void setUp() throws Exception {
       		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");	
		
	}

	@After
	public void tearDown() throws Exception
	{
		driver.close();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
