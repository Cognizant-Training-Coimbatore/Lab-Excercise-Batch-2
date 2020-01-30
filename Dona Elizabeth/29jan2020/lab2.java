interface A
{
	void meth1(int a,int b);
	void meth2(int a,int b);
	
}

class myClass implements A
{

	@Override
	public void meth1(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sum: "+(a+b));
		
	}

	@Override
	public void meth2(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Product: "+(a*b));
		
	}
	
}

public class lab2 {

	public static void main(String[] args) {
		myClass obj=new myClass();
		obj.meth1(2,3);
		obj.meth2(4, 2);
		
	}

}
