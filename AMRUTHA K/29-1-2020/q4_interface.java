package package1;
interface test{
	
	void square(int x,int y);
}
class arithmetic implements test{

	int area;
	@Override
	public void square(int x, int y) {
		// TODO Auto-generated method stub
		area=x*y;
		System.out.println(area);
	}
	
}
class ToTestInt  {
	
	
	
	void display() {
		arithmetic ob=new arithmetic();
		ob.square(3, 4);
		//System.out.println("area of squre="+);
	}
}

public class q4_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToTestInt ob= new ToTestInt();
		//arithmetic ob2=new arithmetic();
		
		//ob2.square(0,0);
		ob.display();
	}

}
