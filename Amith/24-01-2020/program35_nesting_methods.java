class sample5
{
	void display1()
	{
		System.out.println("display one is running");
		display2();
	}
	void display2()
	{
		System.out.println("display two is runnning");
	}
}
public class program35_nesting_methods {

	public static void main(String[] args)
	{
		
		sample5 obj = new sample5();
		obj.display1();
	
				
				
	}

}
