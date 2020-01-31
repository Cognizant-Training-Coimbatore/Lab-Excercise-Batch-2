class test3
{
	test3()
	{
		System.out.println("Constructor 1 is running");
	}
	test3(int x)
	{
		System.out.println("constructor 2 is running");
	}
}
public class pgm30_consoverloading {

	public static void main(String[] args) 
	{
		test3 obj1  = new test3();
		test3 obj2  = new test3(5);
	}

}
