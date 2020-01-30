package project1;
interface InterfaceA
{   int a=10,b=20;
	void meth1();
	void meth2();
	
    }

class Myclass implements InterfaceA
{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("implementing myclass 1st method"+(a+b));
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("implementing myclass 2nd method"+(b-a));
		
	}
	  


       }

public class ex7_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m=new Myclass();
		m.meth1();
		m.meth2();

	}

}
