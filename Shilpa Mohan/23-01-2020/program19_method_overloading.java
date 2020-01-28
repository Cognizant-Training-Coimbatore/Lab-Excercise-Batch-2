class test2
{
	void display()
	{
		System.out.println("Display method without argument");
	}
	void display(int x)
	{
		System.out.println("New display method");
	}
}
public class program19_method_overloading {

	public static void main(String[] args) 
	{
		test2 obj = new test2();
		obj.display();
		obj.display(5);
	}

}
