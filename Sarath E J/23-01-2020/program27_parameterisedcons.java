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
public class program28_parameterisedcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj = new calc(5,10);
		obj.sum();
	}

}
