class test {
	int x;
	void assign (int p) {
		x = p;
	}
	void display () {
		System.out.println(x);
		
	}
}
public class program25_define_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj = new test();
		obj.assign(10);
		obj.display();
	}

}
