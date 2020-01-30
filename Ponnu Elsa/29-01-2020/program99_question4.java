interface test
{
	void square(int x);
}
class arithmetic implements test
{

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("Area: "+(x*x));
		
	}
	
}
class toTestInt extends arithmetic
{
	arithmetic obj=new arithmetic();
	void toTest(int y)
	{
		obj.square(y);
	}
	
}

public class lab4 {

	public static void main(String[] args) {
		toTestInt ti=new toTestInt();
		ti.toTest(3);
		
	}

}
