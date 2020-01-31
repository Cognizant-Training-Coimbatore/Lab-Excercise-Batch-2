class one
{
	final void display()
	{
		System.out.println("display1 is running");//error occur due to final
	}
	
}
class two extends one
{
	void display()
	{
		System.out.println("display2 is running");
	}
}
public class program27_final_method 
{

	public static void main(String[] args) 
	{
		two obj = new two();
		obj.display();

	}

}
