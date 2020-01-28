class st
{
	static int x;
	static void set()

	{
		 x=7;
		
	}
	static int  retrieve()
	{
		return x;
	}
	
}
public class Question_17 {

	public static void main(String[] args)
	{
		st obj = new st();
		obj.set();
		int y=obj.retrieve();
		System.out.println(y);

	}

}
