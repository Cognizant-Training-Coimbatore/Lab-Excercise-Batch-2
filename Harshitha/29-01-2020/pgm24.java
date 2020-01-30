abstract class Shape{
	int l=2,b=2,r=10;
	abstract void calArea();
	abstract void dispArea();
	
	}

class Rectangle extends Shape
{
	int area;
	void calArea() {
		area=l*b;
	}
	void dispArea() {
		System.out.println("Rectangle:"+area);
	}
}
class Circle extends Shape
{
	double area;
	void calArea() {
		area=3.14* r* r;
	}
	void dispArea() {
		System.out.println("Circle:"+area);
	}
}

public class pgm24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle ob=new Rectangle();
ob.calArea();
ob.dispArea();
Circle ob1=new Circle();
ob1.calArea();
ob1.dispArea();


	}

}
