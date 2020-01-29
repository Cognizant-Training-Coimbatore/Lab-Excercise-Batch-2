import java.util.Scanner;

abstract class shape
{
	int l,b,r;
	abstract void calculateArea();
	abstract void displayArea();
	void dummy()
	{
		System.out.println("Dummy module");
	}
	
}
class rectangle extends shape

{
	int area;
	void calculateArea()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length");
		l=in.nextInt();
		System.out.println("Enter the breadth");
		b=in.nextInt();
		area=l*b;
	}
	void displayArea()
	{
		System.out.println("Area of rectangle is :"+area);
	}
}
class circle extends shape
{
	double area;
	void calculateArea()
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=in.nextInt();
		area=3.14*r*r;
	}
	void displayArea()
	{
		System.out.println("Area of reactangle is :"+area);
	}
}
public class Abstract_class {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		rectangle obj1=new rectangle();
		obj1.calculateArea();
		obj1.displayArea();
		circle obj2=new circle();
		obj2.calculateArea();
		obj2.displayArea();
		

	}

}
