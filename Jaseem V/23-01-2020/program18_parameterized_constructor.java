class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=100;
		b=110;
	}
	void sumofNumbers()
	{
		System.out.println(a+b);
	}
	
}
public class program18_parameterized_constructor
{

	public static void main(String[] args)
	{
		calc obj = new calc(5,10);
		obj.sumofNumbers();
		

	}

}
