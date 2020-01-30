abstract class shape
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	
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
		System.out.println("Area of rectangle"+area);
	}
}
class circle extends shape
{
	double area;
	void calculateArea()
	{
		area=3.14*(radius*radius);
	}
	void displayArea()
	{
		System.out.println("Area of circle"+(area));
	}
}
public class Program_1_Abstract_method {

	public static void main(String[] args) {
		rectangle obj1=new rectangle();
		
		obj1.calculateArea();
		obj1.displayArea();
		circle obj2=new circle();
		obj2.calculateArea();
		obj2.displayArea();

	}

}
