package sample_pgms;

interface myinterface1
{
	void add();
	int findGreatest(int x,int y);
	int x=5;
}

class newclass implements myinterface1
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

public class pgm_interface {

	public static void main(String[] args) {
		
	}

}
