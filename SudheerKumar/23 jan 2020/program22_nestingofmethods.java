class sample3
{
	void display1()
	{
		System.out.println("display1 is running...");
	}
	void display2()
	{
		System.out.println("display2 is running...");
		display1();
	}
}
public class program22_nestingofmethods {

	public static void main(String[] args) {
		sample3 obj=new sample3();
		obj.display2();
		// TODO Auto-generated method stub

	}

}
