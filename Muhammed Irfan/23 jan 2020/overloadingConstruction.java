package demo;
class test3
{
	test3()
	{
		System.out.println("constructor 1");
	}
	test3(int a,int b)
	{
		System.out.println("constructor 2");
	}
}
public class overloadingConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		test3 obj1=new test3();
		test3 obj2=new test3(10,10);
		
	}

}
