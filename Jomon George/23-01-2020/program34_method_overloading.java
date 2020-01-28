class test2
{
	void display()
	{
		System.out.println("Display without argument");
	}
	void display(int x)
	{
		System.out.println(x);
	}
}
public class program34_method_overloading 
{

	public static void main(String[] args) 
	{
		test2 ob=new test2();
		ob.display();
		ob.display(4);
		

	}

}
