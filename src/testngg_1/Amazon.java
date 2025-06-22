package testngg_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Amazon {
	
//	@Parameters("URL")
//	@Test
//	public void bcreate(String b)
//	{
//		System.out.println("Successfully created");
//		System.out.println(b);
//	}
//	
	@Test(priority = 1, dataProvider = "data")
	public  void alogin(String user, String pass)
	{
		System.out.println("Successfully loggedin");
		System.out.println(user);
		System.out.println(pass);
		
	}
	
	@Test
	public void a()
	{
		System.out.println("as");
	}
	
	@Test(priority = 2)
	public  void homepage()
	{
		System.out.println("Successfully redirect to home page");
	}

	@DataProvider
	public Object[][] data()
	{
		Object[][] ob = new Object[3][2];
		ob[0][0]="Username1";
		ob[0][1]="Password1";
		ob[1][0]="Username2";
		ob[1][1]="Password2";
		ob[2][0]="Username3";
		ob[2][1]="Password3";
		return ob;
	}
}
