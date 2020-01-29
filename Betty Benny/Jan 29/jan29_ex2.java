package project1;
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

public class jan29_ex2 {

	public static void main(String[] args) 
	{
		MyClass obj=new MyClass();
		obj.meth1();
		obj.meth2();
			}

		}

	