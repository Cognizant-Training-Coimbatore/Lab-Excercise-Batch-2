 abstract class Shape1
 {
	 int len=2, wid=2,rad=10;
	 abstract void calculateArea();
	 abstract void displayArea();
	 void dummymodule()
	 {
		 System.out.println("Dummy module");
	 }
 }
 class Rectangle1 extends Shape1
 {
	 int area;
	 void calculateArea()
	 {
		 area=len*wid;
	 }
	 void displayArea()
	 {
		 System.out.println("Area of reactangle: "+area);
	 }
 }
 class Circle1 extends Shape1
 {
	 double area;
	 void calculateArea()
	 {
		 area=3.14*rad*rad;
	 }
	 void displayArea()
	 {
		 System.out.println("Area of circle: "+area);
	 }
 }
public class program52_abstract_classes 
{

	public static void main(String[] args) 
	{
		Rectangle1 obj1 = new Rectangle1();
		obj1.calculateArea();
		obj1.displayArea();
		Circle1 obj2 = new Circle1();
		obj2.calculateArea();
		obj2.displayArea();
		
	}

}
