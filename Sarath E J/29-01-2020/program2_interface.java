package jan29;

interface myinterface
{
	void add();
	int findGreatest(int x , int y);
	int x = 5;
	static void compare()
	{
		int a=100 ;
		if(a==x)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}

}
class test implements myinterface
{
	public void add()
	{
		System.out.println(x);
	}
	public int findGreatest(int x, int y)
	{
		return 0;
	}
}
public class program2_interface 
{

	public static void main(String[] args) 
	{
		test ob = new test();
		ob.add();
		myinterface.compare();
		
	}

}
