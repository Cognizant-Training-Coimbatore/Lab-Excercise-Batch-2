import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junit_testcase2 
{
	@Before
	public void startTest()
	{
		System.out.println("Test started,");
	}
	
	@Test
	public void test() 
	{
		System.out.println("Test is running");
	}
	
	@After
	public void endTest()
	{
		System.out.println("Test ended");
	}
}
