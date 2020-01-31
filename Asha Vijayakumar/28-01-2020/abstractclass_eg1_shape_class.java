abstract class sha
{
	int length=5,width=2,radius=20;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
		
	}
	
}
class rect extends sha
{
	int area;
	void calculateArea()
	{
		area=length*width;
		
	}
	void displayArea()
	{
		System.out.println("Rectangle area:" + area);
		

	}
}
class circ extends sha
{
	double area;
	
	void calculateArea()
	{
		area=3.14*radius*radius;
		
	}
	void displayArea()
	{
		System.out.println("circle area:" + area);
		
	}
	
}
public class abstractclass_eg1_shape_class {

	public static void main(String[] args) {
		rect obj1 = new rect();
		obj1.calculateArea();
		obj1.displayArea();
		circ obj2 = new circ();
		obj2.calculateArea();
		obj2.displayArea();
		// TODO Auto-generated method stub

	}

}
