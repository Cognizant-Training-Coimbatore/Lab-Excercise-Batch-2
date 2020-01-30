package jan29;
abstract class shape
{
	int l = 2,b= 2, r = 10;
	abstract void calcarea();
	abstract void disparea();
	void dummymodule()
	{
		System.out.println("Dummy Module");
	}
}
class rectangle extends shape
{
	int area;
	void calcarea()
	{
		area = l*b;
	}
	void disparea()
	{
		System.out.println("Rectangle : "+area);
	}	
}	
class circle extends shape
{
	
	double area;
	void calcarea()
	{
		area = 3.14*r*r;
	}
	void disparea()
	{
		System.out.println("Circle : "+area);
	}	
}

public class program1_abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		rectangle obj1 = new rectangle();
		obj1.dummymodule();
		obj1.calcarea();
		obj1.disparea();
		circle obj2 = new circle();
		obj2
		.dummymodule();
		obj2.calcarea();
		obj2.disparea();
		
		
		

	}

}
