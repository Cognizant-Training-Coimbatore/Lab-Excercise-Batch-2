package sample;

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
public class ques6
{

	public static void main(String[] args)
	{
		my ob = new my();
		ob.method1();
		ob.method2();

	}

}