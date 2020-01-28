package PackA;

public class method1 {
	int x;
	protected void display()
	{
		System.out.println("Hello");
		x=100;
		System.out.println(x);
	}
	public static void main(String[] args) {
		method1 obj=new method1();
	}

}
