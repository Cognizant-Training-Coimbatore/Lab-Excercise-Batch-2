package demo;
abstract class shape1
{  int length=2,width=2,radius=10;
   abstract void calculateArea();
   abstract void displayArea();
   void dummymodule()
   {
	   System.out.println("Dummy module");
   }
	
	}
class rect extends shape1
{
	int area;
	void calculateArea()
	{
		area=length*width;
		
	}
	void displayArea()
	{
		System.out.println("Rectangle"+(area));
	}
   }
class circle1 extends shape1
{
	 double Area;
	 void calculateArea()
	 {
		 Area=3.14*radius*radius;
	 }
	 void displayArea()
		{
			System.out.println("circle"+(Area));
		}
	 
}


public class program_52_abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       rect r =new rect();
       r.calculateArea();
       r.displayArea();
	circle1 c=new circle1();
	c.calculateArea();
	c.displayArea();
	}
}
