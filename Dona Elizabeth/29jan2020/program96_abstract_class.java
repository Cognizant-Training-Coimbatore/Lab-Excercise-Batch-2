abstract class shape1
{
	int length=2,width=2,radius=10;
	abstract void calcArea();
	abstract void displayArea();
	void dummyMod()
	{
		System.out.println("Dummy module");
	}
}
class rect extends shape1
{
	int area;
	void calcArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("Area of rectangle: "+area);
	}
}

class circle1 extends shape1
{
	double area;
	void calcArea()
	{
		area=3.14*radius*radius;
	}
	void displayArea()
	{
		System.out.println("Area of rectangle: "+area);
	}
}

public class program96_abstract_class {

	public static void main(String[] args) {
		rect obj=new rect();
		circle1 obj1=new circle1();
		obj.calcArea();
		obj.displayArea();
		obj1.calcArea();
		obj1.displayArea();
		
	}

}
