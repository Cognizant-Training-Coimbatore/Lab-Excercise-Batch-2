package jan29;

import jan29.Question2;
import jan29.myclass1;

public interface Question2{
	public void meth1();
	public void meth2();
	int x=5, y=10;

}
class myclass1 implements Question2
{
	@Override
	public void meth1()
	{
		System.out.println("meth1 implemented");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("meth2 implemented");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 obj=new myclass1();
		obj.meth1();
		obj.meth2();

	}

}