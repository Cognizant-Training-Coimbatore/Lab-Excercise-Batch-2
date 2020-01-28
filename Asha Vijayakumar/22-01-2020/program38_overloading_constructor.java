class test3
{
	test3()
	{
		System.out.println("test3 constructor1 is running");
		
	}
	test3(int a,int b)
	{
		System.out.println("test3 constructor2 is running");
		
	}
}
public class program38_overloading_constructor {

	public static void main(String[] args) 
	{
		test3 obj1=new test3();
		test3 obj2=new test3(10,10);
		// TODO Auto-generated method stub

	}

}
