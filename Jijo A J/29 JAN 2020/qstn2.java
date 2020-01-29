interface A
{ public void meth1();
public void meth2();
	}
class Myclass implements A
{
	public void meth1()
	{
		System.out.println("method1");
	};
	public void meth2()
	{
		System.out.println("method2");
	}
	};
public class qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A xx=new Myclass();
xx.meth1();
xx.meth2();
	}

}
