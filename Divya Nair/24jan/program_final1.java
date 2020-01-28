class one
{
	final void display()
	{
		System.out.println("Display1 is working...");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("Display2 is working...");
	}
}
public class program_final1 {

	public static void main(String[] args) {
		two obj=new two();
		obj.display();

	}

}
