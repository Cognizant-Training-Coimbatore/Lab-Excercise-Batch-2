interface A
{
	void meth1();
	void meth2();
}
class MyClass implements A
{
	public void meth1()
	{
		System.out.println("This is meth1");
	}
	public void meth2()
	{
		System.out.println("This is meth2");
	}
}
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj=new MyClass();
		obj.meth1();
		obj.meth2();
	}

}
