package package1;
interface A{
	void method1();
	void method2();
}
class myclass implements A{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}
	
}
public class q2_interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass ob=new myclass();
		ob.method1();
		ob.method2();

	}

}
