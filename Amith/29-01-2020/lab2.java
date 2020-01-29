package exercises;
interface A
{
	void meth1();
	void meth2();
}
class myclass implements A
{

	@Override
	public void meth1() {
		System.out.println("methode one is running");
	}

	@Override
	public void meth2() {
		System.out.println("methode two is running");
		
	}
	
}
public class lab2 {

	public static void main(String[] args) {
		myclass obj=new myclass();
		obj.meth1();
		obj.meth2();
	}

}
