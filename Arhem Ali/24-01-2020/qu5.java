class shape
{
	void display()
	{
		System.out.println("This is a shape");
	}
}
class rectangle extends shape
{
	void display1()
	{
		System.out.println("this is rectangle");
	}
}
class circle extends shape
{
	void display2()
	{
		System.out.println("thi is circle");
	}
}
class square extends rectangle
{
	void display3()
	{
		System.out.println("square is a rectangle");
	}
}

public class qu5 {

	public static void main(String[] args) {
		square ob= new square();
		ob.display();
		ob.display1();
		

	}

}
