interface myinterface1
{
	void add();
	int findGreatest(int x,int y);
	int x=5;
}
class test1 implements myinterface1
{

	@Override
	public void add() { 
		// TODO Auto-generated method stub
		System.out.println(x);
	}

	@Override
	public int findGreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class interface_
{

	public static void main(String[] args) 
	{
		
	}

}
