package Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TentngAnotationSequence
{

@Test
public void test1()
{
System.out.println("test 1"); 
}

@Test
public void test2()
{
System.out.println("test 1"); 
}

@BeforeMethod
public void beforeMethod()
{
System.out.println("beforeMethod"); 
}

@AfterMethod
public void afterMethod()
{
System.out.println("afterMethod"); 
}

@BeforeClass
public void beforeClass()
{
System.out.println("beforeClass"); 
}

@AfterClass
public void afterClass()
{
System.out.println("afterClass"); 
}

@BeforeTest
public void beforeTest()
{
System.out.println("beforeTest"); 
}

@AfterTest
public void afterTest()
{
System.out.println("afterTest"); 
}

@BeforeSuite
public void beforeSuite()
{
System.out.println("beforeSuite"); 
}

@AfterSuite
public void afterSuite()
{
System.out.println("afterSuite"); 
}

}
