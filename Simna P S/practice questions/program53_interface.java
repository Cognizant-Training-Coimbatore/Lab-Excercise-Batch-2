interface myinterface1
{
	void add();
	int findGreatest(int x,int y);
	int x = 5;
	int y=2;
	default void compareNumbers()
	{
		if(x>y)
		{
			System.out.println("x greater than y");
		}
		
	}
}

class test123 implements myinterface1
{
	@Override
	public void add() 
	{
		
		System.out.println(x);
		
	}
	@Override
	public int findGreatest(int x, int y) 
	{
		
		return 0;
	}

	
	
}
public class program53_interface 
{

	public static void main(String[] args) 
	{
		test123 obj = new test123();
		obj.add();
		obj.compareNumbers();

	}

}
