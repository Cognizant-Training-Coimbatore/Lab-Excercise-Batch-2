abstract class shape
{
	int length=2,width=2,radius=10;
	abstract void calculatearea();
	abstract void displayarea();
	void dummymodule()
	{
		System.out.println("dummy module...");
	}
}
class rectangle extends shape
{
	int area;
	void calculatearea()
	{
		area=length*width;
	}
	void displayarea()
	{
		System.out.println("Rectangle.."+area);
	}
}
class circle extends shape
{
	double area;
void calculatearea()
{
	area=3.14 * radius * radius;
	
}
void displayarea()
{
	System.out.println("Circle..."+area);
}
}
public class pgm1_29_abstractclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj1=new circle();
		rectangle obj2=new rectangle();
		obj1.calculatearea();
		obj1.displayarea();
		obj2.calculatearea();
		obj2.displayarea();
		obj1.dummymodule();
	}

}
