interface interfaceA
{
	void meth1();
	void meth2();
}
class MyClass implements interfaceA
{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
}
public class exercise29_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
	}

}
