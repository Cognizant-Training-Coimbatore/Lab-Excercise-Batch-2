class sam{
	void display() {
		System.out.println("dis 1 is running");
		display2();
	}
	void display2() {
		System.out.println("dis 2 is running.");
	}
}
public class program29_nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		sam x=new sam();
		x.display();
		
	}

}
