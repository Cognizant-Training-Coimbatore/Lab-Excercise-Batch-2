class test2
{
	void display()
	{
		System.out.println("display method without argument");
	}
	void display(int x)
	{
		System.out.println("new method");
	}
}
public class method_overloading {

	public static void main(String[] args) {
		test2 obj=new  test2();
		obj.display(10);
		obj.display();

	}

}
