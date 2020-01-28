class one
{
	final void display()
	{
	System.out.println("Dis 1 is working");
}
}
class two extends one
{
	void display1()
	{
		System.out.println("Display 2 is working");
	}
}
public class finalmethod {

	public static void main(String[] args) {
	two ob=new two();
	ob.display();
	}

}
