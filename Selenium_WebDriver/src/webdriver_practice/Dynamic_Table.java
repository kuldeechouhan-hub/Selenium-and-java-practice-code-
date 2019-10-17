package webdriver_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Table {

	public static void main(String[] args) {


		FirefoxDriver driver = new FirefoxDriver (); 
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
		
		WebElement myTable = driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody")); 
		List<WebElement> table_row = myTable.findElements(By.tagName("tr")); 
		int row_count = table_row.size(); 
		
		for(int row=0; row<row_count; row++)
		{
			List<WebElement> table_column= table_row.get(row).findElements(By.tagName("td")); 
			int column_count = table_column.size(); 
			
			System.out.println("Number of cells in row" +row+"are"+column_count);
			
			
		for(int column=0; column<column_count; column++)
		{
			
			String cellvalue= table_column.get(column).getText(); 
			System.out.println("Cell value of row number" +row+"and column number"+column+ "is" +cellvalue);
			
			
		}
			
			
			System.out.println("-----------------------------------------------------");
			
		}
		
		driver.quit();

	}

}
