abstract class shape1
	{
		int length=2,width=2,radius=10;
		abstract void calculateArea();
		abstract void displayArea();
		void dummymodule() 
		{
			System.out.println("Dummy module");
		}
	}
class rectangle1 extends shape1
{
	int area;
	void calculateArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("Rectangle " + (area));
	}
}
class circle1 extends shape1
{
	double area;
	void calculateArea()
	{
		area=3.14*radius*radius;
	}
	void displayArea()
	{
		System.out.println("circle " + (area));
	}
}

public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			rectangle1 obj=new rectangle1();
			obj.calculateArea();
			obj.displayArea();
			circle1 obj1=new circle1();
			obj1.calculateArea();
			obj1.displayArea();			
	}

}
