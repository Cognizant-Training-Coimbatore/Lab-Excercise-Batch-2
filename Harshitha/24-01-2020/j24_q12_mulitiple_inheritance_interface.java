interface a11{
	
	default void disp() {
		System.out.println("The interface a11");
	}
}
interface a12{
	default void disp() {
		System.out.println("The interface a12");
	}
	
}
class a33 implements a11,a12{
 
	
	public void disp() {
		// TODO Auto-generated method stub
		a11.super.disp();
		a12.super.disp();
	}
	
	}
	


public class j24_q12_mulitiple_inheritance_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 a33 objt = new a33();
 objt.disp();
	}

}
