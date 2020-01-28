class parent
{
	void display()
	{
		System.out.println("This is parent class");
	}
	
}
class child extends parent
{
	void show()
	{
		System.out.println("This is child class");
		display();
	}
}
public class program_parent_child {

	public static void main(String[] args)
	{
		parent obj1=new parent();
		obj1.display();
		child obj2=new child();
		obj2.show();
		
		

	}

}
