package demo;
class first
{
	void method1()
	{
		System.out.println("this is parent class");
	}
}
class second extends first
{
	void method2()
	{
		System.out.println("this is child class");
	}
}

public class program_Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first o1=new first();
		second o2=new second();
		o1.method1();
		o2.method2();
		o2.method1();

	}

}
