class shape
{
	void display1()
	{
		System.out.println("this is shape");
	}
}
class Rectangle extends shape
{
	void display2()
	{
		System.out.println("This is rectangular shape");
	}
}
	class square extends Rectangle
	{
		void display()
		{
			System.out.println("square is a rectangle");
		}
	}

class circle extends shape
{
	void display()
	{
		System.out.println("This is circular shape");
	}
}
public class pgm65_shape_cls {

	public static void main(String[] args) {
		square obj=new square();
		obj.display();
		obj.display1();
		obj.display2();
		
	}
		
		

	}


