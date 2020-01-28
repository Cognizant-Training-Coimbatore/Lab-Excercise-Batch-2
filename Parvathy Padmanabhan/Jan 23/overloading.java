class over1
	{
		over1(int a)
		{
			System.out.println(a);
		}
		over1(int a,int b)
		{
			System.out.println(a+""+b);
		}
	}
public class overloading {
	
	public static void main(String[] args)
	{
		over1 obj=new over1(5);
		over1 obj1=new over1(9,0);

	}
}
