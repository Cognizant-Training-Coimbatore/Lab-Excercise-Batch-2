package demo;

class test
{
	int x=10;
	void assign(int p)
	{
		x=p;
	}
	void display()
	{
		System.out.println(x);
		// p cannot be used in other function
	}
}

public class program21_class
{

	public static void main(String[] args) 
	{
		test ob=new test(); //class_name object_name=new class_name()
		ob.assign(910);		//object_name.function()
		ob.display();

	}

}
