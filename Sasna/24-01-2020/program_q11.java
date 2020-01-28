class A {
	int a = 2;
}
class B extends A {
	int b = 5;
}
class inherit extends B {
	int c = a+b;
	void display() {
		System.out.println(c);
	}
}
public class program_q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit ob = new inherit();
		ob.display();

	}

}
