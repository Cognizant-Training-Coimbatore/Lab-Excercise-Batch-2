final class one //final class cannot be extended
{
	final void display()   //final methods cannot be overridden
	{
		System.out.println("display is working");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("display 2 is working");
	}
}
public class program28_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		two obj=new two();
		obj.display();
		
	}

}
