class Shape
{
	void print()
	{
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape
{
	void printr()
	{
		System.out.println("This is Rectangular shape");
	}
}
class Square extends Rectangle
{
	void display()
	{
		System.out.println("square is a rectangle");
	}
}
class circle extends Shape
{
	void printc()
	{
		System.out.println("This is Circular shape");
	}
}
public class Question_15 {

	public static void main(String[] args)
	{
		Shape obj= new Shape();
		Rectangle obj2 = new Rectangle();
		Square obj3 =  new Square();
		obj3.print();
		obj3.printr();
		
		
		
				
		

	}

}
