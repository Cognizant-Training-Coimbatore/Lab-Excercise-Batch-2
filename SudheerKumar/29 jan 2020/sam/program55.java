abstract class shape5
{
	int length=2,width=2,radius=2;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("dummy module");
	}
}
class rectangle2 extends shape5
{
	int area;
	void calculateArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("rectangle"+(area));
	}
}
	class circle1 extends shape5
	{
		double area;
		void calculateArea()
		{
			area=3.14*radius*radius;
		}
		void displayArea()
		{
			System.out.println("circle"+(area));
		}
	}
public class program55 {

	public static void main(String[] args) {
		rectangle2 obj1=new rectangle2();
		obj1.calculateArea();
		obj1.displayArea();
		circle1 obj2=new circle1();
		obj2.calculateArea();
		obj2.displayArea();

	}

}
