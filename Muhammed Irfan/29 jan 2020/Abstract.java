package demo_29_01_2020;

abstract class shape
{
int length=2,width=2,radius=10;
abstract void calculateArea();
abstract void displayArea();
void dummymodule()
 {
	System.out.println("dummy module");
	
 }
}
class rectangle extends shape
 {
    int area;
    void calculateArea()
    {
    	area=length*width;
    }
    void displayArea()
    {
    	System.out.println("rectangle area = "+ area);
    }
 }

class circle extends shape
{
   double area;
   void calculateArea()
   {
   	area=3.14*radius*radius;
   }
   void displayArea()
   {
   	System.out.println("circle area = "+ area);
   }
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle obj=new rectangle();
		obj.calculateArea();
		obj.displayArea();
		circle obj1=new circle();
		obj1.calculateArea();
		obj1.displayArea();
		
	}

}
