package other;
interface a
{
	void meth1();
	void meth2();
}
class myclass implements a
{
	public void meth1() {
		System.out.println("meth 1");
	}
	public void meth2()
	{
		System.out.println("meth 2");
	}
}
public class qu_02_imterfaceclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a obj=new myclass();
obj.meth1();
obj.meth2();
	}

}
