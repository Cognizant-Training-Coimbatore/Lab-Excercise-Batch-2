package Exercise;

interface A{
	
	void method1();
	void method2();
}
class myClass implements A{
	public void method1()
	{
		System.out.println("hi");
	}
	public void method2()
	{
		System.out.println("hello");
	}
}
public class Interface_Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass obj = new myClass();
		obj.method1();
		obj.method2();
	}

}
