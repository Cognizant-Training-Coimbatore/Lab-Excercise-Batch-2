package newjava;
interface interfaceA
{
	void meth1();
	void meth2();
}
class Myclass implements interfaceA
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
public class q2 {

	public static void main(String[] args) {
		Myclass ob=new Myclass();
		ob.meth1();
		ob.meth2();

	}

}
