class test3
{	
	test3()
	{
	System.out.println("test3 constructor 1 is running...");
	}
	test3(int a, int b)
	{
		System.out.println("test3 constructor 2 is running..");
	}
}
public class program20_overloading_constructors
{

	public static void main(String[] args) 
	{
		test3 obj1 = new test3();
		test3 obj2 = new test3(2,1);
	}

}
