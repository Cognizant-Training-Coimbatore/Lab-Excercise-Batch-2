interface myinterface  //cant write method in interface
{
	void add();
	int findGreatest(int x,int y); //signature
	int x=5;//automatically a final variable
}
class test123 implements myinterface
{

	@Override
	public void add() {
		System.out.println(x);
		
	}

	@Override
	public int findGreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

//public class pgm32_interface {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
