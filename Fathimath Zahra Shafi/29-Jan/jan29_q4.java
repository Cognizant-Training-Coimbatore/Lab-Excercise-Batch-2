package project1;

interface test
{
	void square(int a);
	
}

class arithmetic implements test
{

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println("area of square: " +(a*a));
	}
	
	
	
}

class ToTestInt  
{
	arithmetic obj1=new arithmetic();
	
	ToTestInt(int b)
	{
		obj1.square(b);
	}
	
}


public class jan29_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToTestInt obj2=new ToTestInt(7);

	}

}
