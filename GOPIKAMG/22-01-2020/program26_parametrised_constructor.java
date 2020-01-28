class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	void sumofNumbers()
	{
		System.out.println(a+b);
	}
}
public class program26_parametrised_constructor {

	public static void main(String[] args)
	{
		calc obj=new calc(5,10);
		obj.sumofNumbers();
		// TODO Auto-generated method stub

	}

}
