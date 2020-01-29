package packone;
interface A
{
	void meth1();
	void meth2();
}
class MyClass
{
	int a=2;
	int b=3;
	void meth1()
	{
		System.out.println("sum="+(a+b));
	}
	void meth2()
	{
		System.out.println("difference="+(a-b));
	}
}
public class p2_meth {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		ob.meth1();
		ob.meth2();
	}

}
