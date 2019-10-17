package webdriver_practice;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IDE_TO_WD {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://newtours.demoaut.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testBookFlight() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("demo");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.cssSelector("input[name=login][value=Login][alt=Sign-In]")).click();
		try {
			assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.cssSelector("input[value=\"oneway\"]")).click();
		new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
		driver.findElement(By.name("findFlights")).click();
		assertEquals("Select a Flight: Mercury Tours", driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
