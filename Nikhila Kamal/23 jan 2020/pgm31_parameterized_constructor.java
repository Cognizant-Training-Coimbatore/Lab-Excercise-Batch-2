class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	void SumofNumbers()
	{
		System.out.println(a+b);
	}
}
public class pgm31_parameterized_constructor {

	public static void main(String[] args)
	{
		calc obj=new calc(5,10);
		obj.SumofNumbers();
	

	}

}
