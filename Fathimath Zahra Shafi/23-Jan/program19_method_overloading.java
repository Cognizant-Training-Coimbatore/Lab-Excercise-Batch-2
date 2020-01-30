class over {
	
	void display() {
		System.out.println("display1");
	}
	
	void display(int x)
	{
		System.out.println("display2");
	}
}




public class program19_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		over s = new over();
		s.display();
		s.display(2);

	}

}
