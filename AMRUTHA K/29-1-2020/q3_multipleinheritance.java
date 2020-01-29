package package1;
interface P{
	int x=8;
	int y=7;
}
interface B{
	void add();
	void mult();
}
class abc implements P,B{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("SUM:"+(x+y));
		
	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		System.out.println("product:"+(x*y));
	}
	
}
public class q3_multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc ob=new abc();
		ob.add();
		ob.mult();
		

	}

}
