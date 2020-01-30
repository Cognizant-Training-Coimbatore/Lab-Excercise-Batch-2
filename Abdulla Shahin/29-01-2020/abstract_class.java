abstract class shape4
{
	int l = 2, b = 4, radius = 10;
	abstract void calculateArea();
	abstract void display();
	void dummy()
	{
		System.out.println("dummy module");
	}
}
class rectangle4 extends shape4
{
	int area;
	void calculateArea()
	{
		area = l*b;
	}
	void display()
	{
		System.out.println("rectangle " + (area));
	}
}
class circle4 extends shape4
{
	double area;
	void calculateArea()
	{
		area = 3.14*radius*radius;
		
	}
	void display()
	{
		System.out.println("circle "+(area));
	}
	
}
class square4 extends shape4
{
	int area;
	void calculateArea()
	{
		area = l*l;
		
	}
	void display()
	{
		System.out.println("square "+(area));
	}
	
}

public class abstract_class {

	public static void main(String[] args)
	{
		rectangle4 obj1 = new rectangle4();
		obj1.calculateArea();
		obj1.display();
		circle4 obj2 = new circle4();
		obj2.calculateArea();
		obj2.display();
		square4 obj3 = new square4();
		obj3.calculateArea();
		obj3.display();
	}

}
