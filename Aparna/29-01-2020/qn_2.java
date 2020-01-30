package set_7;
interface A
{
	void meth1();
	void meth2();
}
class myclass implements A
{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("meth1");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("meth2");
	}
	
}
public class qn_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myclass obj=new myclass();
obj.meth1();
obj.meth2();
	}

}
