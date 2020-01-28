package Jishnu;
class test3
{
	test3()
	{
		System.out.println("first constructor");
	}
	test3(int a, int b)
	{
		System.out.println("overloading is running");
	}
}
public class overloading_constructor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		test3 obj1= new test3();
		test3 obj2=new test3(10,10);
	}

}
