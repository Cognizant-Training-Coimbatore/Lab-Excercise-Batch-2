class Shape
{
	void display1()
	{
	System.out.println("This is Shape");
	}
}
class Rectangle extends Shape
{
	void display2()
	{
	System.out.println("This is Rectangular Shape");
	}
}
class Square extends Rectangle
{
	void display3()
	{
	System.out.println("Square is a Rectangle");
	}
}
class Circle extends Shape
{ void display4()
	{
	System.out.println("This is Circular Shape");
	}
}
public class Program62 {

	public static void main(String[] args) {
		Square obj1 = new Square();
		obj1.display1();
		Square obj2 = new Square();
		obj2.display2();
	}

}
