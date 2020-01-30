package sample;
interface A
{
	void method1();
	void method2();
	
}
class myClass implements A
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
public class ques2
{

	public static void main(String[] args)
	{
		myClass ob = new myClass();
		ob.method1();
		ob.method2();

	}

}
