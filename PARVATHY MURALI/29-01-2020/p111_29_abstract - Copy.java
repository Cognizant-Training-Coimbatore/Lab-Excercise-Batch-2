abstract class shape1
{
	int length=10, width=20, radius=30;
	double area;
	abstract void calculate_area();
	abstract void display_area();
	void dummy_method()
	{
		System.out.println("dummy module");
	}
		
}
class circle12 extends shape1
{
	void calculate_area()
	{
		area=radius*radius*3.14;
	}
	void display_area()
	{
		System.out.println("area of circle="+area);
	}
}
class rectangle12 extends shape1
{
	void calculate_area()
	{
		area=length*width;
	}
	void display_area()
	{
		System.out.println("area of rectangle="+area);
	}
}
class square12 extends shape1
{
	void calculate_area()
	{
		area=length*length;
	}
	void display_area()
	{
		System.out.println("area of square="+area);
	}
}
public class p111_29_abstract {

	public static void main(String[] args) 
	{
		circle12 ob=new circle12();
		ob.calculate_area();
		ob.display_area();
		rectangle12 obj=new rectangle12();
		obj.calculate_area();
		obj.display_area();
		square12 obje=new square12();
		obje.calculate_area();
		obje.display_area();
		ob.dummy_method();

	}

}
