class test2
{
	void display()
	{
		System.out.println("Display method without argument");
	}
	void display(int x)
	{
		System.out.println("Display method with argument : "+x);
	}
}
public class pgm29_overloading {

	public static void main(String[] args)
	{
		test2 ts = new test2();
		ts.display();
		ts.display(5);
	}

}
