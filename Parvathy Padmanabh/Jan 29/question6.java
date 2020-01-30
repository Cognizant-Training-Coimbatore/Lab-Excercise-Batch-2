abstract class shape1
{
	int length=20, breadth=30;
	double rad=5;
	abstract void display();
}
class rectangle1 extends shape1
{
	int area;
	void calcArea()
	{
		area=length*breadth;
	}
	void display()
	{
		System.out.println("Area : "+ area);
	}
}
class circle extends shape1
{
	double area;
	void calcArea()
	{
		area=Math.PI * rad * rad;
	}
	void display()
	{
		System.out.println("Area : "+ area);
	}
}
public class question6 {

	public static void main(String[] args) {
		rectangle1 obj1 = new rectangle1();
		obj1.calcArea();
		obj1.display();
		circle obj2 = new circle();
		obj2.calcArea();
		obj2.display();

	}

}
