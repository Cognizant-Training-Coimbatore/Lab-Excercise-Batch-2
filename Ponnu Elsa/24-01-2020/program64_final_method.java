class one
{
	final void display()
	{
		System.out.println("Display ");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("Displaying");
	}
}
public class program64_final_method {
	public static void main(String[] args)
	{
		two obj = new two();
		obj.display();
		
	}
}