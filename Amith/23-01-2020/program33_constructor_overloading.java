class test3
{
	test3()
	{
		System.out.println("hellooooo..");
	}
	test3(int x, int y)
	{
		System.out.println(x+","+y);
	}
}
public class program33_constructor_overloading {

	public static void main(String[] args) 
	{
		
		test3 obj = new test3();
		test3 obj1 = new test3(10,10);
		
	}

}
