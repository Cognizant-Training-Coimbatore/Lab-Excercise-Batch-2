

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testcase2 {

	@Test
	public void Rooney() {
		System.out.println("Rooney is running");
	}
	@Test
	public void Ronaldo() {
		System.out.println("Ronaldo is running");
	}
	@Test
	public void neymar() {
		System.out.println("neymar is running");
	}
	@BeforeClass
	public static void startapp()
	{
		System.out.println("Application launched");
	}
	@AfterClass
	public static void endapp()
	{
		System.out.println("Application has been closed");
	}
}
