package testngg_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeClass
	public static void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups = "REGRESSION")
	public static void Class1test1()
	{
		System.out.println("Q");
	}
	
	@Test
	public static void Class1test2()
	{
		System.out.println("W");
	}
	
	@Test(groups = "FUNCTIONAL")
	public static void test2()
	{
		System.out.println("E");
	}
	
	@AfterTest
	public static void test3()
	{
		System.out.println("test3");
	}

}
