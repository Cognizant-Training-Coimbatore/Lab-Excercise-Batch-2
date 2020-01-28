class Shape
{
	void display()
	{
		System.out.println("This is This shape");
	}
}
class Rectangle extends Shape
{
	void displ()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape
{
	void displ()
	{
		System.out.println("This is circular shape");
	}
}
class Square extends Rectangle
{
	void disp()
	{
		System.out.println("Square is Rectangle");
	}
}
public class qstn_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj =new Square();
		obj.display();
		obj.displ();

	}

}
