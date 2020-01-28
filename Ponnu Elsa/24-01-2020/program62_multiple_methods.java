class parent
{
	void display1()
	{
		System.out.println("This is the parent class.....");
	}
}
class child extends parent
{
	void display2()
	{
		System.out.println("This is the child class.....");
	}
	
}
public class program62_multiple_methods  {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		parent obj = new parent();
		child obj2 = new child();
		obj.display1();
		obj2.display2();

	}

}
