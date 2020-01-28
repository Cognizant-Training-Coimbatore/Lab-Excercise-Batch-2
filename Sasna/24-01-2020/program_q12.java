class X {
	int a=12;
}
class C extends X {
	int b = 15;
}
class D extends C {
	int c=a+b;
	void display() {
		System.out.println(c);
	}
}
public class program_q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob = new D();
		ob.display();

	}

}
