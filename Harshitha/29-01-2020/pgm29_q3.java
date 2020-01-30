package Project;
interface P{
	default void disp() {
		System.out.println("Welcome to interface P");
	}
}
interface B{
	default void disp() {
		System.out.println("Welcome to interface B");
	}
}
class C implements P,B{
	public void disp()
	{
		P.super.disp();
		B.super.disp();
		System.out.println("Welcome to interface C");
	}
}
public class pgm29_q3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     C ob=new C();
     ob.disp();
	}

}
