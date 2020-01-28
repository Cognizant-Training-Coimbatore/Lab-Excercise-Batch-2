class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=100;
		b=200;
	}
	void sumofNumbers()
	{
		System.out.println(a+b);
	}
}
public class program18_parameterised_constructor {

	public static void main(String[] args) {
		calc obj=new calc(10,20);
		obj.sumofNumbers();
		// TODO Auto-generated method stub

	}

}
