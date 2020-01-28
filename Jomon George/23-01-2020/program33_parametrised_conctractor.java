class calc
{
	int a,b;
	calc(int x, int y )
	{
		a=x;
		b=y;
	}
	void sumofNumber()
	{
		System.out.println(a+b);
	}
}
public class program33_parametrised_conctractor
{

	public static void main(String[] args) 
	{
		calc ob=new calc(5,10);
		ob.sumofNumber();
		

	}

}
