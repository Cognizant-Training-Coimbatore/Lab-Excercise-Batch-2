class parent{
	void print1()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent{
	void print2() {
		System.out.println("This is child class");
	}
}
public class j24_q13_parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        parent ob1 = new parent();
        child ob2 = new child();
        ob1.print1();
        ob2.print2();
        ob2.print1();
	}

}
