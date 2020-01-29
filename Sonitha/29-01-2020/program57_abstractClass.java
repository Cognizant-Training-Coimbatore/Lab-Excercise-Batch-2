abstract class Shape1
{
	int len=2,bre =2,radius = 2;
	abstract void calcuArea();
	abstract void displayArea();
	void dummymodule() 
	{
		System.out.println("Dummy Module");
	}
}
class rectangle1 extends Shape1
{
	int area;
	void calcuArea() 
	{
	area = len * bre;
	
	}
	void displayArea() 
	{
		System.out.println("Rectangle :"+ area);
	}
}

class circle1 extends Shape1
{
	double area;
	void calcuArea() 
	{
		area =  ((3.14)* radius* radius);
		
	}
	void displayArea() 
	{
		System.out.println("Circle : "+ area);
	}
}

public class program57_abstractClass 
{

	public static void main(String[] args) 
	{
		rectangle1 ob = new rectangle1();
		ob.calcuArea();
		ob.displayArea();
		circle1 ob1 = new circle1();
		ob1.calcuArea();
		ob1.displayArea();

	}

}
