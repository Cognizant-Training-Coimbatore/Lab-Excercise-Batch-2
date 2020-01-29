package project1;
interface A
{
	void method1();
	void method2();
}
class MyClass implements A
{
	public void method1()
	{
		System.out.println("This is method1");
	}
	public void method2()
	{
		System.out.println("This is method2");
	}
}
public class prgd29_q2_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyClass obj=new MyClass();
       obj.method1();
       obj.method2();
	}

}
