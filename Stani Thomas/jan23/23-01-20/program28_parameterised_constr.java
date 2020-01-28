class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	void sum()
	{System.out.println(a+b);
}}
public class program28_parameterised_constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calc obj=new calc(10,20);
obj.sum();
	}
}
