package apache;
interface A
{
	void meth1();
	void meth2();
}
class MyClass implements A
{
	public void meth1()
	{
		System.out.println("meth 1");
	}
	public void meth2()
	{
		System.out.println("meth 2");
	}
}
public class qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new MyClass();
		obj.meth1();
		obj.meth2();

	}

}
