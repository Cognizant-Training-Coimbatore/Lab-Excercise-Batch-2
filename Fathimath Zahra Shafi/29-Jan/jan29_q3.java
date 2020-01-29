package project1;

interface x
{
	int a=9;
	void add();
}

interface y
{ int b=7;
	void sub();
}

class maths implements  x,y
{
	
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("difference of 2 numbers: " +(a-b));
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("sum of 2 numbers: " +(a+b));
	}

	
}


public class jan29_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maths obj=new maths();
		obj.add();
		obj.sub();

	}

}
