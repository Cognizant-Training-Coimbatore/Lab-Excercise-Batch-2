interface myInterface{
	void add() ;
	int findGreatest(int x,int y);
	int x=5;
	default void compareNumbers()
	{
		
	}
}


class test123 implements myInterface
{

	public void add() {
		
		System.out.println(x);
	}

	@Override
	public int findGreatest(int x, int y) {
		
		return 0;
	}
	
}
public class program58_interface_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
