class  test3
{
	test3()
	{
		System.out.println("calling constructor");
	}
	test3(int x)
	{
		System.out.println("calling constructor by argument");
	}
}
public class overloading_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 obj=new test3();
		test3 obj2=new test3(10);
		

	}

}
