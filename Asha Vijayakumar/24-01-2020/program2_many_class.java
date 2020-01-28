class x
{
	void  display1()
	{
		System.out.println("This is a parent class");
		
	}
}
class y extends x
{
	void display2()
	{
		System.out.println("This is a child class");
		
	}
}
public class program2_many_class {

	public static void main(String[] args)
	{
		x obj1 = new x();
		y obj2 = new y();
		obj1.display1();
		obj2.display2();
		obj2.display1();
		
		// TODO Auto-generated method stub

	}

}
