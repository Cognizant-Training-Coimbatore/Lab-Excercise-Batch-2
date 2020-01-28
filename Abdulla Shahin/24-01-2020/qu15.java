class shape
{
	void display1()
	{
		System.out.println("this is shape");
	}
}
class rectangle extends shape
{
	void display2()
	{
		System.out.println("this is rectangular shape");
	}
}
class square1 extends rectangle
{
	void display3()
	{
		System.out.println("Square is a rectangle");
	}
}
class circle extends shape
{
	void display4()
	{
		System.out.println("this is circular shape");
	}
}

public class qu15 {

	public static void main(String[] args)
	{
		square1 obj = new square1();
		obj.display1();
		obj.display3();

	}

}
