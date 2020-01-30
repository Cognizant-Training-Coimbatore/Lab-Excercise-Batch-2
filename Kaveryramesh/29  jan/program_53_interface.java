package demo;
interface myinterface
{
	void add();
	
	int findgreatest(int x,int y);
	int x=5;
	default void comaprenumber()//with default or static keyword method implementation is allowed in interface.
	{
		System.out.println(x);
	}
  }
class newclass1 implements myinterface
{


	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x);
		
	}

	@Override
	public int findgreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
public class program_53_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
