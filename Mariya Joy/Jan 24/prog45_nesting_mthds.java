class sample3
{
	void display1()
	{
		System.out.println("display1 is running...");
		display2();
	}
	void display2()
	{
		System.out.println("display2 is running...");
	}
}
public class prog45_nesting_mthds
{

	public static void main(String[] args)
	{
		sample3 obj=new sample3();
		obj.display1();
		// TODO Auto-generated method stub

	}

}
