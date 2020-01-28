class st
{
	static int x=100;
	static void method(int i)
	{
		
		x++;
		System.out.println(x);
	}
}
public class p68_q8 {

	public static void main(String[] args) 
	{
		st ob=new st();
		System.out.println(ob.x);
		ob.method(20);
		

	}

}
