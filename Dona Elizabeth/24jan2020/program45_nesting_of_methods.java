class samp
{
	void display1()
	{
		System.out.println("Display1 method is running");
		display2();
	}
	void display2()
	{
		System.out.println("Display2 method is running");
	}
	
}
public class program45_nesting_of_methods {

	public static void main(String[] args) {
		samp obj1=new samp();
		obj1.display1();
	}

}
