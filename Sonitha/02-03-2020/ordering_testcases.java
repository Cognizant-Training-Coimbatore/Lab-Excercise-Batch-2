import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ordering_testcases 
{
	@Test
	public void test1() 
	{
		System.out.println("Apple");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Banana");
	}

	@Test
	public void test3() 
	{
		System.out.println("Cat");
	}
	
}
