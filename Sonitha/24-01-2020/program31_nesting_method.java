class sample5{
	void display1()
	{
		System.out.println("Display1 is running..");
		display2();
	}
	void display2() {
		System.out.println("Display2 is running...");
	}
}
public class program31_nesting_method 
{

	public static void main(String[] args) 
	{
	
        sample5 ob =new sample5();
        ob.display1();
        
	}

}
