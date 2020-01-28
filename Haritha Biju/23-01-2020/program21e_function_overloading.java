package demo;

class test2
{	
	void display()
	{
		System.out.println("Display without argument");
	}
	void display(int a)
	{
		System.out.println("Displaying with the integer argument "+a);
	}
	void display(double a)
	{
		System.out.println("Displaying with the argument "+a);
	}
	void display(int a,int b)
	{
		System.out.println("Displaying with the arguments "+a+" "+b );
	}
}
public class program21e_function_overloading 
{

	public static void main(String[] args) 
	{
		test2 obj=new test2();
		obj.display();
		obj.display(2);
		obj.display(2.10);
		obj.display(10, 20);

	}

}
