package abstract_123;
abstract class shape
{
	int length=5,width=6,radius=6;
	abstract void area();
	abstract void display();
	void dummymodule()
	{
		System.out.println("dummy module");
	}
}
class rectangle extends shape
{
	int area;
	void  area()
	{
		area=length*width;
	}
	void display()
	{
		System.out.println("rectangle area = " +(area));
	}
}
class circle extends shape
{
	double area;
	void area() {
		area=3.14*radius*radius;
	}
	void display()
	{
		System.out.println("circle area = " +(area));
	}
	
}
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle obj=new rectangle();
obj.area();
obj.display();
circle obj1=new circle();
obj1.area();
obj1.display();
	}

}
