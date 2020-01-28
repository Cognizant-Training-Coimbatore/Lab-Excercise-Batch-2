package demo;
class sample1{
	void display1() {
		System.out.println("diplay1....");
		display();
	}
	void display() {
		System.out.println("display2...");
	}
}
public class nesting_of_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 obj=new sample1();
		obj.display1();
		

	}

}
