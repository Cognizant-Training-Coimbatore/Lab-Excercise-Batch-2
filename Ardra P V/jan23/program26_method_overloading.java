class test3{
	void display() {
	System.out.println("display method without argument");	
	}
	void display(int x) {
		System.out.println("new display");
	}
}
public class program26_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 obj=new test3();
		obj.display();
		obj.display(10);

	}

}
