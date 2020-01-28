class Shape{
	void print1() {
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape{
	void print11()
	{
		System.out.println("This is Rectangular shape");
	}
}
class Square extends Rectangle{
	void print111()
	{
		System.out.println("Square is a rectangle");
	}
}
class Circle extends Shape{
	void print12()
	{
		System.out.println("This is circular shape");
	}
}
public class j24_q15_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square ob = new Square();
		ob.print1();
		ob.print11();

	}

}
