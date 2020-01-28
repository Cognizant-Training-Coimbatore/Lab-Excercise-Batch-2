class tes3
{
	void test3()
	{
		System.out.println("Test3 constructor1");
	}
	void test3(int a,int b)
	{
		System.out.println("Test3 constructor2");
	}
	
}
public class prog29_constructor_overloading {

	public static void main(String[] args) {
		tes3 obj1=new tes3();
		//tes3 obj2=new tes3();
		obj1.test3();
		obj1.test3(1,1);

	}

}
