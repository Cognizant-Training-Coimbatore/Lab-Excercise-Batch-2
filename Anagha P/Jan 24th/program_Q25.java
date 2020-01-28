package demo;
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
		System.out.println("this is a rectangular shape");
	}
}
class Circle extends shape
{
	void display3()
	{
		System.out.println("this is a circular shape");
	}
}
class Square extends Rectangle
{
	void display4()
	{
		System.out.println("square is  rectangle");
	}
}
public class program_Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.display1();
		s.display2();

	}

}
