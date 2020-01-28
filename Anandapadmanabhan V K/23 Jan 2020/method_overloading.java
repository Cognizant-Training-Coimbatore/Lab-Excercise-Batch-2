class test2
{
	void display()
	{
		System.out.println("Display without argument");
	}
	void display(int x)
	{
		System.out.println("New display method");
	}
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj=new test2();
		obj.display();
		obj.display(5);
	}

}
