class sample4 {
	static int i;
	void display() {
		i++;
		System.out.println(i);
	}
}
public class program38_static_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample4 obj1 = new sample4();
		obj1.display();
		sample4 obj2 = new sample4();
		obj2.display();
	}

}
