package Package3;
abstract class shape
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class rectangle extends shape
{
	int area;
	void calculateArea()
	{
		area=length*width;
	}

void displayArea()
{
	System.out.println("Rectangle area is: "+(area));
}
}
class circle extends shape
{
	double area;
	void calculateArea()
	{
		area=3.14*radius*radius;
	}
	void displayArea() {
		System.out.println("Area of circle: "+(area));
	}
}
public class program121_Abstract_class {

	public static void main(String[] args) {
		
rectangle obj1=new rectangle();
circle obj2=new circle();
obj1.calculateArea();
obj1.displayArea();
obj2.calculateArea();
obj2.displayArea();
	}

}
