class cons
{
	int a,b;
	cons(int x,int y)
	{
		a=x;
		b=y;
	}
	void sumofNumbers()
	{
		System.out.println(a+b);
	}
}

public class program31_parameterized_constructor {

	public static void main(String[] args) {
		cons obj=new cons(3,4);// pass the parameters of constructor here.
		obj.sumofNumbers();
		
	}

}
