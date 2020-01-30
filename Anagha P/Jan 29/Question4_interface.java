package project1;

interface test
{
	void square(int x);
}
class arithmetic implements test
{

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("Area...."+x*x);
	}
}
class TotestInt extends arithmetic
{
	arithmetic ar = new arithmetic();
	TotestInt(int y)
	{
		ar.square(y);
	}
}
public class Question4_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotestInt tti=new TotestInt(5);
	}

}
