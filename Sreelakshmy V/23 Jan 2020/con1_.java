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
public class con1_ {

	public static void main(String[] args) {
		calc ob=new calc(20,20);
		ob.sum();
	}

}
