package Project;
interface A{
	void meth1();
	void meth2();
}
class MyClass implements A{
	public void meth1() {
		System.out.println("Method 1");
	}
	public void meth2() {
		System.out.println("Method 2");
	}
}
public class pgm29_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MyClass ob=new MyClass();
 ob.meth1();
 ob.meth2();
	}

}
