class Shape
{
	void print()
	{
		System.out.println("This is Shape");
	}
}
class Rectangle extends Shape
{
	void printrect()
	{
		System.out.println("This is Rectangle");
	}
}
class Square extends Rectangle
{
	void printsq()
	{
		System.out.println("Square is rectangle");
	}
	
}
class Circle extends Shape
{
	void printcicr()
	{
		System.out.println("This is Circle");
	}
	
}
public class exercise5_Q5 {

	public static void main(String[] args) {
		Square obj = new Square();
		obj.print();
		obj.printrect();
		obj.printsq();

	}

}
