interface test
{
	void square(int a);
}
class Arithmetic implements test
{
	public void square(int a)
	{
		System.out.println(a*a);
	}
}
public class pr4 {

	public static void main(String[] args)
	{		
		test obj=new Arithmetic();
		obj.square(34);

	}
}
