package webdriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_From_Table {

	public static void main(String[] args) {


		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		
	int row_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr")).size(); 
	int column_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size(); 
			
	System.out.println("Row Count is:" +row_count +  "Column count is:" +column_count );
	
	String first = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr["; 
	String second = "]/td["; 
	String third = "]"; 
	
	for(int i=1; i<=row_count; i++)
	{
		for(int j = 1; j<=column_count; j++)
			
		{
			String final_path = first+i+second+j+third; 
			
			String table_data = driver.findElement(By.xpath(final_path)).getText(); 
			
			System.out.println(table_data +" "); 
		}
		
		
		System.out.println(""); 
		
		System.out.println("");
	}	
	
	
	
	

	}

}
