package demo;

class calc
{
	int a,b;
	calc(int x, int y)	// paramaterized constructor definition
	{
		a=x;
		b=y;
	}
	void sumofNumbers()
	{
		System.out.println(a+b);
	}
}
public class program21d_paramaterized_constructor 
{

	public static void main(String[] args) 
	{
		calc obj=new calc(10,20); 	// constructor call
		obj.sumofNumbers();

	}

}
