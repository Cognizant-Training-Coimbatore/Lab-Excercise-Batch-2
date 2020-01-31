abstract class shape
{
	int length=2,width=2,radius=10;
	float area;
	abstract void calcArea();
	abstract void dispArea();
	void dummymodule()
	{
		System.out.println("Dummy module.");
	}
}
class rectangle extends shape
{
	
	void calcArea()
	{
		area=length*width;
	}
	void dispArea()
	{
		System.out.println("Rectangle Area : "+(area));
	}
}
class circle extends shape
{
	
	void calcArea()
	{
		area=(float) (3.14*radius*radius);
	}
	void dispArea()
	{
		System.out.println("Rectangle Area : "+(area));
	}
}
public class program_abstract
{
	public static void main(String[] args)
	{
		rectangle r1=new rectangle();
		r1.calcArea();
		r1.dispArea();
		circle c1=new circle();
		c1.calcArea();
		c1.dispArea();
	}

}
