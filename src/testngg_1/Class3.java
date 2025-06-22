package testngg_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class3 {

	@Test(groups = "SMOKE")
	public static void test111()
	{
		System.out.println("test111");
	}
	
	@Test
	public static void test112()
	{
		System.out.println("test112");
	}
	
	
	@BeforeMethod
	public static void test1126()
	{
		System.out.println("B1");
	}
	
	
	@Test(groups = "REGRESSION")
	public static void test113()
	{
		System.out.println("test113");
	}
	
	@AfterMethod
	public static void test11433()
	{
		System.out.println("A4");
	}
	
}
