class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	void sumofnumber()
	{
		System.out.println(a+b);
	}
}
public class prog31_parametrized_constrctr {

	public static void main(String[] args) 
	{   calc obj=new calc(5,10);
	    obj.sumofnumber();
		// TODO Auto-generated method stub

	}

}
