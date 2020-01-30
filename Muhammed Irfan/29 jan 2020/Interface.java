package demo_29_01_2020;

interface myinterface1
{
 void add();
 int findgreatest(int x , int y);
 int x=5;
 void comoarenumbers();
}

class test123 implements myinterface1
{

	@Override
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

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
