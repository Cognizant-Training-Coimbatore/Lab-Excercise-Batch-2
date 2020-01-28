class A 
{
	void displayA() {
		System.out.println("this is parent class");
	}
}
	
	class B extends A {
		void displayB() {
			System.out.println("this is SUB class");
		}
	}

public class program_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		B objB = new B();
		objA.displayA();
		objB.displayB();
	}

}
