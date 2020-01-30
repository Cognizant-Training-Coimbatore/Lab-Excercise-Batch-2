abstract class shape13
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("dummy module");
	}
}
class rect extends shape13
{
	int area;
	void calculateArea()
	{
		area=length*width;
		
	}
	void displayArea()
	{
		System.out.println("rectangle " +(area));
	}
}
class circle12 extends shape13
{
	float area;
	float pi=3.14f;
	void calculateArea()
	{
		area=pi*radius*radius;
		
	}
	void displayArea()
	{
		System.out.println("circle " +(area));
	}
}
public class pgm32_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect obj=new rect();
		obj.calculateArea();
		obj.displayArea();
		circle12 obj1=new circle12();
		obj1.calculateArea();
		obj1.displayArea();
		

	}

}
