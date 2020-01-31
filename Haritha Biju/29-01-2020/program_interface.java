
interface myinterface1
{
	void add();
	int findlargest(int x,int y);
	int x=5;
	
	static void compareNumbers()
	{
		
	}
}
class newclass implements myinterface1
{

	@Override
	public void add() 
	{
		System.out.println(x);		
	}

	@Override
	public int findlargest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class program_interface 
{
	public static void main(String[] args)
	{
		
	}

}
