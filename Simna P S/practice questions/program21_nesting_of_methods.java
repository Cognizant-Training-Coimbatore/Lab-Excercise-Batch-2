class sample5 
{
	void display1()
		{
			System.out.println("display1 is running.......");
			display2();//from display1, display2 will be called. methods can be called within the class.

		}
	void display2()
		{
		System.out.println("display2 is running.......");
		}
	}
	

public class program21_nesting_of_methods 
{

	public static void main(String[] args) 
	{
	   sample5 obj = new sample5();
	   obj.display1();
	  
	}

}
