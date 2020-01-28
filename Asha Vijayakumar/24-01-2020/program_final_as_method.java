class one
{
	final void display()
	{
		System.out.println("display1 is working");
	}

}
class two extends one
{
	void display()
	{
		System.out.println("display2 is running");
		
	}
}
public class program_final_as_method {

	public static void main(String[] args) {
		two obj = new two();
		obj.display();
		// TODO Auto-generated method stub

	}

}
