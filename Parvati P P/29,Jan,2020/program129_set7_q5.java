package Package4; /*
Create an outer class with a function display, again create another class inside the 
outer class named inner with a function called display and call the two functions in the main class. */
class outer
{
	void display()
	{
		System.out.println("This is outer class");
	}
	void displayInner()
	{
		inner obj=new inner();
		obj.display();
	}
		class inner 
		{
			void display()
			{
				System.out.println("This is inner class");
			}
		}
	}

public class program129_set7_q5 {

	public static void main(String[] args) {
		outer obj1=new outer();
		obj1.display();
		obj1.displayInner();
		
	}

}
