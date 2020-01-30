class test3
{
	test3()
	{
		System.out.println("constructor 1 ...!");
	}
	test3(int a, int b)
	{
		System.out.println("constructor 2 .....!");
	}
}

public class program33_overloading_constructors {

	public static void main(String[] args) {
		test3 obj=new test3();
		test3 obj1=new test3(1,1);// same as method overloading
		// if you want to create more than one constructors, then use different parameters -> constructor overloading
	}

}
