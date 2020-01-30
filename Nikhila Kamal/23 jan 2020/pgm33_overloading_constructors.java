class test3
{
	test3()
	{
		System.out.println("test constructor is running");
	}
	test3(int a,int b)
	{
		System.out.println("test constructor 2 is running");
	}
}
public class pgm33_overloading_constructors {

	public static void main(String[] args)
	{
		test3 obj=new test3();
		test3 obj1=new test3(10,10);
	
	}

}
