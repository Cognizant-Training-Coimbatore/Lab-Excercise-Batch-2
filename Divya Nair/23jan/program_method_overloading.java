class random
{
	void display()
	{
		System.out.println(" Method without arguments");
		
	}
	void display(int x)
	{
		System.out.println(" Method with arguments");
		
	}
}
public class program_method_overloading {

	public static void main(String[] args)
	{
		
		random obj=new random();
		obj.display();
		obj.display(3);
	}

}
