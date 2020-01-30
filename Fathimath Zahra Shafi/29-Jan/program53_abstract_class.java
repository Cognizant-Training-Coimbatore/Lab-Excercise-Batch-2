abstract class shape1
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	
	void dummymodule()
	{
		System.out.println("dummy module");
	}
}


class rectangle1 extends shape1
{
	int area;
	void calculateArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("rectangle " +area);
	}
}



public class program53_abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle1 obj= new rectangle1();
		obj.calculateArea();
		obj.displayArea();
		

	}

}
