package demo;

interface myInterface{
	void add();
	int findGreatest(int x, int y);
	int x=5;
	
	default void compareNo() //can implement in interface only using "default"
	{
		
	}
}

class test123 implements myInterface
{
	public void add() 
	{
//		x=200;
		System.out.println(x);	
	}
	public int findGreatest(int x, int y) 
	{
		return 0;
	}

}

public class program51_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
