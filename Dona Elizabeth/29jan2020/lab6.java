abstract class shape
{
	int length=2,width=2;
	abstract void calculatearea();
	abstract void displayarea();
	void dummymodule()
	{
		System.out.println("dummy module...");
	}
}
class rectangle1 extends shape
{
	int area;
	void calculatearea()
	{
		area=length*width;
	}
	void displayarea()
	{
		System.out.println("Area of Rectangle: "+area);
	}
}

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle1 obj1=new rectangle1();
		obj1.calculatearea();
		obj1.displayarea();

	}

}
