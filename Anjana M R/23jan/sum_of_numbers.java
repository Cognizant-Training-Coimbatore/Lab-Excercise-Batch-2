class calc
{
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	void sumofnumbers()
	{
		System.out.println(a+b);
	}
}
public class sum_of_numbers {

	public static void main(String[] args) {
		calc obj=new calc(5,10);
		obj.sumofnumbers();
	}

}
