package testngg_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {

	@BeforeMethod
	public static void test11()
	{
		System.out.println("test11");
	}
	
	@Test(groups = "FUNCTIONAL")
	public static void class2Test1()
	{
		System.out.println("A");
	}
	@Test
	public static void class2Test2()
	{
		System.out.println("B");
	}
	
	@Test(groups = "SMOKE")
	public static void class2Test3()
	{
		System.out.println("C");
	}
	
	@AfterMethod
	public static void test13()
	{
		System.out.println("test13");
	}
	
	
}
