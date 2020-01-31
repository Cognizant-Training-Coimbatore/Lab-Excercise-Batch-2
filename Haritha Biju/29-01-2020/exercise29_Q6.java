abstract class abs
{
	abstract void method1();
	abstract void method2();
	
}
class my extends abs
{
	public void method1()
	{
		System.out.println("Method 1 is running");
	}
	public void method2()
	{
		System.out.println("Method 2 is running");
	}
}
public class exercise29_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my ob = new my();
		ob.method1();
		ob.method2();
	}

}
