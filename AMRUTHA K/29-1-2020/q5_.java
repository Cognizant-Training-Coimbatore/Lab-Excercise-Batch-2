package package1;
class outer{
	void display1() {
		System.out.println("display outer class");
	}
	void displayinner() {
		inner ob1=new inner();
		ob1.display2();
	}
	class inner{
		void display2() {
			System.out.println("display inner class");
		}
	}
}
public class q5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer ob=new outer();
		ob.display1();
		ob.displayinner();
		
	}

}
