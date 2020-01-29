interface myinterface1
{
	void add();
	int findGreatest(int x,int y);
	int x=5;
	default void compareNumbers()
	{
		
	}
}
class test123 implements myinterface1
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x);
		x =200;
		
	}

	@Override
	public int findGreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class prog_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
