package demo;

abstract class shapes{
	int length = 2, breadth = 2, radius = 20;
	abstract void calculateArea();
	abstract void displayArea();
	void dummyModule()
	{
		System.out.println("Dummy Module");
	}
}
class rectangles extends shapes{
	int area;
	void calculateArea()
	{
		area = length * breadth;
	}
	void displayArea()
	{
		System.out.println("Rectangle: " + area);
	}
}
class circles extends shapes{
	int area;
	void calculateArea()
	{
		area = (int)3.14 * radius * radius;
	}
	void displayArea()
	{
		System.out.println("Circle: " + area);
	}
}

public class program50_abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangles obj1 = new rectangles();
		obj1.calculateArea();
		obj1.displayArea();
		
		circles obj2 = new circles();
		obj2.calculateArea();
		obj2.displayArea();
	}

}
