package day3;
class sample1
{
	void display()
	{
		System.out.println("Display1 is running..");
		display2();
		
	}
	void display2()
	{
		System.out.println("Display2 is running..");
		
	}
}
public class nesting_of_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 obj=new sample1();
		obj.display();
	}

}
