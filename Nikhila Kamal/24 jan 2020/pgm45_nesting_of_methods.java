class samp5
{
	void display1()
	{
		System.out.println("display1 is running");
		display2();
	}
	void display2()
	{
		System.out.println("display2 is running");
	}
}
public class pgm45_nesting_of_methods {

	public static void main(String[] args) {
		samp5 obj=new samp5();
		obj.display1();
		
	}

}
