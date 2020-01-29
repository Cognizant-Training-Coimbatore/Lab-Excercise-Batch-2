abstract class ab
{
	int length=100;
	int breadth=20;
	int side=10;
	abstract void area();
}
class Rect extends ab
{
	int area;
	void area()
	{
	 area=length*breadth;
	}
	void display()
	{
		System.out.println("Rectangle area:"+area);
	}
}
class circle extends ab
{
	int area;
	void area()
	{
		area=side*side;
		
	}
	void display()
	{
		System.out.println("Area Circle:"+area);
	}
}
public class question6_Abstract_class {

	public static void main(String[] args)
	{
		Rect r=new Rect();
		r.area();
		r.display();
		circle c=new circle();
		c.area();
		c.display();
		
		

	}

}
