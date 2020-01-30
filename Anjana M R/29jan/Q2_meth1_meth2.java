interface interface2
{
	void meth1();
	void meth2();
	
}
class myclass implements interface2
{

	@Override
	public void meth1() {
		String name="Anjana";
		System.out.println("Employee name :"+name);
		
	}

	@Override
	public void meth2() {
		String id="844392";
		System.out.println("Employee id  :"+id);
		
	}
	
}
public class Q2_meth1_meth2 {

	public static void main(String[] args) {
		myclass obj=new myclass();
		obj.meth1();
		obj.meth2();
	}

}
