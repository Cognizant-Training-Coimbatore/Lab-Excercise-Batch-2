abstract class shape
{
	int length=20, breadth=30;
	double rad=5;
	abstract void display();
}
class rectangle extends shape
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
class circle extends shape
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
public class EXAMPLE1 {

	public static void main(String[] args) {
		rectangle obj1 = new rectangle();
		obj1.calcArea();
		obj1.display();
		circle obj2 = new circle();
		obj2.calcArea();
		obj2.display();

	}

}
