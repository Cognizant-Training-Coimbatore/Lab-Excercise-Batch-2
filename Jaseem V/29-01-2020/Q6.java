package exercise;

abstract class shape
{
	int length =3, width = 5,radius = 10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class rectangle1 extends shape
{
	int area;
	void calculateArea()
	{
		area = length * width;
	}
	void displayArea()
	{
		System.out.println("Area of Rectangle :"+(area));
	}
}
class circle extends shape
{
	double area;
	void calculateArea()
	{
		area= 3.14 * radius * radius;
	}
	void displayArea()
	{
		System.out.println("Area of Circle :"+(area));
	}
}

public class Q6 {

	public static void main(String[] args) 
	{
		circle obj = new circle();
		obj.calculateArea();
		obj.displayArea();
		rectangle1 obj1 = new rectangle1();
		obj1.calculateArea();
		obj1.displayArea();
	}

}
