class one
{
	 final void display()
	{
		System.out.println("Disply1 is working");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("display2 is working");
	}
}
public class prog41{

	public static void main(String[] args) {
		two ob=new two();
		ob.display();

	}

}
