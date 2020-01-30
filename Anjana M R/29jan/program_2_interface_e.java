interface myinterface1
{
	void add();
	int findGreatest(int x,int y);
	int x=5;
	default void aa()//by using default method can be created inside interface without default not possible
	{
		
	}
	static void aa1()//bys using static also method can be written
	{
		
	}
}
class test123 implements myinterface1
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x);
		//x=200; is not possible.the value of x is fixed in interface
	}

	@Override
	public int findGreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class program_2_interface_e {

	public static void main(String[] args) {
		

	}

}
