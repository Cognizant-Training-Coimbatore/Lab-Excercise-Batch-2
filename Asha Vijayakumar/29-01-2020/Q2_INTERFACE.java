package proje;
interface a
{
	void method1();
	void method2();
	
}
class myclass implements a
{
	public void method1()
	{
		System.out.println("This is first method");
		
	}
	public void method2()
	{
		System.out.println("This is second method");
		
	}
	
	
}


public class Q2_INTERFACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass obj = new myclass();
		obj.method1();
		obj.method2();
	}

}
