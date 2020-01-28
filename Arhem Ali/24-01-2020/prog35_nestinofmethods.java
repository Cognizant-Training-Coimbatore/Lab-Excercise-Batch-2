class f
{
	void display1()
	{
		System.out.println("Display 1 is running");
		display2();
		
	}
	void display2()
	{
		System.out.println("Display 2 is running");
	}
}
public class prog35_nestinofmethods {

	public static void main(String[] args) 
	{
		f ob= new f();
		ob.display1();
		

	}

}
