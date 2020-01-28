class one
{
	int a;
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class two extends one
{
	int b;
	void display2()
	{
		System.out.println("This is child class");
	}
}
public class question13_parent_and_subclass 
{
	one obj1 = new one();
	obj1.display1();


}
