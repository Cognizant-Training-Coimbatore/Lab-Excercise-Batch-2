interface myInterface{
	void add();
	int findGreatesr(int x,int y);
	int x=5;
	default void compareNum() {
		
	}
}
class test123 implements myInterface{
	public void add() {
		System.out.println(x);
		
	}
	
	
	@Override
	public int findGreatesr(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class pgm25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
