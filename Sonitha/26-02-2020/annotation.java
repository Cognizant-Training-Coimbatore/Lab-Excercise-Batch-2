import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class annotation {

	@Test
	public void test() {
		System.out.println("Test 1 is running");
	}

	@Test
	public void test2() {
		System.out.println("Test 1 is running");
	}
	
	@BeforeClass
	public static void startApp()
	{
		System.out.println("Application launched");
	}
	
	@AfterClass
	public static void endApp()
	{
		System.out.println("Application has been closed");
	}
	
}
