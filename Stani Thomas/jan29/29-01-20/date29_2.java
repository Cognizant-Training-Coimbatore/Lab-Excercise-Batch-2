package abc;
interface interfaceA
{
	void meth1();
	void meth2();
}
class MyClass implements interfaceA
{
	public void meth1()
	{
		System.out.println("meth1");
	}
	public void meth2()
	{
		System.out.println("meth2");
	}
}
public class date29_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass obj=new MyClass();
obj.meth1();
obj.meth2();
	}

}
