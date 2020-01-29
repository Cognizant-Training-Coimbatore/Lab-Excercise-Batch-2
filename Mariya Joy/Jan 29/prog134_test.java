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
		System.out.println("area...."+(x*x));
		
	}
	
}
class TotestInt extends arithmetic
{
	arithmetic ar=new arithmetic();
	TotestInt(int y)
	{
		ar.square(y);
	}
}
public class prog134_test {
public static void main(String[] args) {
	TotestInt tti=new TotestInt(5);
}
}
