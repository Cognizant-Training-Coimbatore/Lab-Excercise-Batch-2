class calc
{
	int a,b;
	calc(int x, int y)
	{
		a=x;
		b=y;
	}
	void sumofnumbers()
	{
		System.out.println(a+b);
	}
}
public class parameterised_constructor {

	public static void main(String[] args)
	{
		calc obj=new calc(100,150);
		obj.sumofnumbers();

	}

}
