import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class annotations {

	@Test
	public void test1() 
	{
		System.out.println("Test 1 is running....");	
	}
	@Test
	public void test2() 
	{
		System.out.println("Test 2 is running....");	
	}
	@BeforeClass
	public static void startApp()
	{
		System.out.println("Application has been launched");
	}
	@AfterClass
	public static void endApp()
	{
		System.out.println("Application has been closed");
	}


}
