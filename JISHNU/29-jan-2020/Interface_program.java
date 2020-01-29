package day7;

interface myinterface1 {
	void add();

	int findGreatest(int a, int b);

	int x = 10;// will become static final variable

	default void sum() {
		System.out.println("Default method can be defined inside interface");

	}
}

class test1 implements myinterface1 {

	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x);

	}

	public int findGreatest(int a, int b) {
		// TODO Auto-generated method stub

		return x;
	}

}

public class Interface_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj = new test1();
		obj.sum();
		obj.add();

	}

}
