class test2
{
	void display()
	{
		System.out.println("Display without argument");
	}
	void display(int x)
	{
		System.out.println("New method with same name");
	}
}

public class program32_method_overloading {

	public static void main(String[] args) {
		test2 obj=new test2();
		obj.display(3);// if the second display method has no parameter and if we call obj.display(), the first method will be executed.
		
	}

}
