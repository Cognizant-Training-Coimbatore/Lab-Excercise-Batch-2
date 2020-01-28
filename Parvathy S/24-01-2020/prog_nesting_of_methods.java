class map
{
	void display1()
	{
		System.out.println("Display1 is running....");
		display2();
	}
	void display2()
	{
		System.out.println("Display2 is running....");
	}
}
public class prog_nesting_of_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        map obj = new map();
        obj.display1();
	}

}
