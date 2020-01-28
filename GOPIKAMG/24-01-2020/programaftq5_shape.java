class shape
{
	void display()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	void display1()
	{
		System.out.println("This is rectangular shape");
	}
}
class circle extends shape
{
	void display2()
	{
		System.out.println("This is circular shape");
	}
}
class square extends rectangle
{
	void display3()
	{
		System.out.println("Square is a rectangle");
	}
}
public class programaftq5_shape {

	public static void main(String[] args)
	{
		square obj=new square();
		obj.display();
        square obj2=new square();
        obj.display1();
	}

}
