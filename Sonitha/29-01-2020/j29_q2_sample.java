package samplepackage;

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
		System.out.println("Method1");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
	}
	
}
public class j29_q2_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob =new MyClass();
		ob.meth1();
		ob.meth2();
	}

}
