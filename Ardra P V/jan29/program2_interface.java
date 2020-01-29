interface myinterface{
	void add();
	int fingGreatest(int x,int y);
	int x=5;
	default void compare() {
		
	}
}
class newclass1 implements myinterface{
	
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x);
		
		
	}
	@Override
	public int fingGreatest(int x, int y) {
		// TODO Auto-generated method stub
		x=200;
		
		return 0;
	}

	}
public class program2_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
