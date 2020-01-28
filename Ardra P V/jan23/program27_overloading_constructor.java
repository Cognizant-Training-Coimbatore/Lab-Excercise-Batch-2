class test2{
	void test2() {
		System.out.println("constructor 1 running..");
	}
	void test2(int a ,int b) {
		System.out.println("constructor 2 is running");
	}
}
public class program27_overloading_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj=new test2();
		obj.test2();
		obj.test2(1, 2);

	}

}
