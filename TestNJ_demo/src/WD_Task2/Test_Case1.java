package WD_Task2;

import org.testng.Assert;

public class Test_Case1 extends WD_Task2.Common_parameters

{



	public static void main(String[] args) {

		start();
		String title = "Guru99 Bank Manager HomePage"; 
		String title1 = driver.getTitle(); 

		Assert.assertEquals(title1, title);	

		System.out.println("Title is verified");


	}

}
