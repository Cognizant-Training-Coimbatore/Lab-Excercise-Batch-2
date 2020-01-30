class sample5
{
	void display1()
	{
		System.out.println("Display1 is running...");
		display2();
	}
	void display2()
	{
		System.out.println("Display2 is running...");
	}
}
public class Program43_nesting_of_methods {

	public static void main(String[] args) {
		sample5 obj = new sample5();
		obj.display1();
		

	}

}
