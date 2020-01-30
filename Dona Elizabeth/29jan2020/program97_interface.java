interface i1
{
	void add();
	int findGreatest(int x,int y);
	int x=5;// the variables declaring in interface are static and final, it cannot be changed in other classes inheriting this interface
	default void compareNums()// also static keyword can be used instead of default
	{
		
	}
}

class c11 implements i1 // don't use extends keyword
{

	@Override
	public void add() {
		
	}

	@Override
	public int findGreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class program97_interface {

	public static void main(String[] args) {
		
	}

}
