abstract class shap
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class rect extends shap
{
	int area;
	void calculateArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("Rectangle "+(area));
	}
}
class circ extends shap
{
	double area;
	void calculateArea()
	{
		area=3.14*radius*radius;
	}
    void displayArea()
    {
	    System.out.println("circle "+(area));
    }
}

public class prog128_abstract_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect obj1=new rect();
		obj1.calculateArea();
		obj1.displayArea();
		circ obj2 =new circ();
		obj2.calculateArea();
		obj2.displayArea();

	}

}
