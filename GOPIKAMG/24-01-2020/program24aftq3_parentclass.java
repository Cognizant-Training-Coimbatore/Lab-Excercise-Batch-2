class parent
{
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("This is child class");
	}
}
public class program24aftq3_parentclass {

	public static void main(String[] args) 
	{
		parent obj1=new parent();
		obj1.display1();
		child obj2=new child();
		obj2.display();
		obj2.display1();
		

	}

}
