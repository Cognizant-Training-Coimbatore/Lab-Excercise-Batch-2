class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	void sum()
	{
		System.out.println(a+b);
	}
}
public class parametrized {

	public static void main(String[] args) {
		calc obj=new calc(5,10);
		obj.sum();

	}

}
