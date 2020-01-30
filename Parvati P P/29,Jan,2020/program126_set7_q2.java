package Package4;

interface A {
  public void meth1(); // interface method (does not have a body)
  public void meth2(); // interface method (does not have a body)
}

class MyClass implements A {
  public void meth1() {
    System.out.println("Meth1");
  }
  public void meth2() {
    System.out.println("Meth2");
  }
}

public class program126_set7_q2 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
	    obj.meth1();
	    obj.meth2();
	}

}
