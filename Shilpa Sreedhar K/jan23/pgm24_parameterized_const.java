class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=100;
		b=200;
	}
	void sumOfNumbers()
	{
		System.out.println(a+b);
	}
}
public class pgm24_parameterized_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc(5,10);
		obj.sumOfNumbers();
	}

}
