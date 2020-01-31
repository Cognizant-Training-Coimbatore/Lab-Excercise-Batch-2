package pack;
interface A
{
	void meth1();
	void meth2();
	int x=100;
	
}
class Myclass implements A
{

	@Override
	public void meth1() {
		System.out.println(x);
		
	}

	@Override
	public void meth2() {
		System.out.println("The method 2 is working...");
		
	}
	
}
public class meth1_meth2 {

	public static void main(String[] args)
	{
		Myclass obj1=new Myclass();
		obj1.meth1();
		obj1.meth2();
		

	}

}
