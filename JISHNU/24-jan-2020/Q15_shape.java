package day3;
class Shape
{
	void print()
	{
		System.out.println("This is This is shape");
	}
}
class Rectangle extends Shape
{
	void print1()
	{
		System.out.println("This is rectangle shape");
	}
	
}
class Circle extends Shape
{
	void print2()
	{
		System.out.println("This is circular shape");
	}
	
}
class Square extends Rectangle
{
	void print3()
	{
		System.out.println("Square is a rectangle");
	}
}
public class Q15_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj=new Square();
		obj.print();
		obj.print1();

	}

}
