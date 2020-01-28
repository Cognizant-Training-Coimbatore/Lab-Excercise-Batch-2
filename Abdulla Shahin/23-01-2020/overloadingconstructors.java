class test3
{
	test3()
	{
		System.out.println("tst3 constructor2 is runing");
		
	}
	test3(int a, int b)
	{
		System.out.println("test3 constructor2 is running");
	}
}
public class overloadingconstructors {

	public static void main(String[] args) 
	{
		test3 obj1 = new test3();
		test3 obj2 = new test3(2,3);
	}

}
