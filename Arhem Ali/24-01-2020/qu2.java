class mainn
{
	void display()
	{
		System.out.println("This is a parent class");
	}
	
}
class c extends mainn
{
	void display1()
	{
		System.out.println("This is child class");
	}
}
public class qu2 {

	public static void main(String[] args)
	{
		mainn ob = new mainn();
		c ob1 = new c();
		ob.display();
		ob1.display1();
		ob1.display();
		

	}

}
