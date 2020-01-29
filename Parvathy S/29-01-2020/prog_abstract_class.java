abstract class ap
{
	int length = 2, width = 2, radius =10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class bp extends ap
{
	int area;
	void calculateArea()
	{
	 area = length * width;
	}
	void displayArea()
	{
		System.out.println("Rectangle"+(area));
	}
}
class cp extends ap
{
	double area;
	void calculateArea()
	{
		area = 3.14*radius*radius;
	}
	void displayArea()
	{
		System.out.println("Circle"+(area));
	}
}

public class prog_abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bp obj1 = new bp();
		cp obj2 = new cp();
		obj1.calculateArea();
		obj1.displayArea();
		obj2.calculateArea();
		obj2.displayArea();
		

	}

}
