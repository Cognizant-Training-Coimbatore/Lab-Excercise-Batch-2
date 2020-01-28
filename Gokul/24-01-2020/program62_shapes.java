package gokul;
class shape
{
	void display()
	{
		System.out.println("This is shape");
	}
	
}
class rectangle extends shape
{
	void print_rectangle()
	{
		System.out.println("This is rectangular shape");
	}
}
class circle extends shape
{
	void print_circle()
	{
		System.out.println("This is circular shape");
	}
}

class square extends rectangle
{
	void print_square()
	{
		System.out.println("Square is a rectangle");
	}
}
public class program62_shapes {

	public static void main(String[] args) {
square sq=new square();
sq.display();
sq.print_rectangle();

	}

}
