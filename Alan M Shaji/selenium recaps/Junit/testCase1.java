import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCase1 {

	@Test
	public void test1() {
		System.out.println("Test 1 of testcase 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2 of testcase 2");
	}
	@BeforeClass
	public static void startapp()
	{
		System.out.println("Launched");
	}
	@AfterClass
	public static void endapp()
	{
		System.out.println("Closed");
	}
}
