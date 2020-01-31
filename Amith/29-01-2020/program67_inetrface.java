interface myinterface
{
	void add();
	int findGreat(int x,int y);
	int x=5;
	default void sum()
	{
		
	}
}

class test123 implements myinterface 
{
	
	@Override
	public int findGreat(int x, int y) 
	{
		if(x>y)
		return x;
		else
			return y;
	}

	@Override
	public void add() 
	{
		
		System.out.println(x);
		
	}
}
public class program67_inetrface {

	public static void main(String[] args)
	{
		test123 obj=new test123();
		obj.findGreat(5, 7);
		
		obj.add();
		
	}

}
