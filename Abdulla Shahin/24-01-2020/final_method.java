class one
{
	final void display()
	{
		System.out.println("dis1 is working");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("dis2 is working");
	}
}
public class final_method {

	public static void main(String[] args)
	{
		two obj = new two();
		obj.display();
		
	}

}
