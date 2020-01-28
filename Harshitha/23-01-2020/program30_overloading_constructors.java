class test3
{
	test3()
	{
		System.out.println("test3 constructor 1 is running...");
	}
	test3(int a, int b)//same name but different parameters
	{
		System.out.println("test3 constructor 2 is running....");
	}
}
public class program30_overloading_constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test3 obj1 = new test3();
        test3 obj2 = new test3(10,10);
	}

}
