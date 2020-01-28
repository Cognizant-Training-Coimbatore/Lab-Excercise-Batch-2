class parent
{
	void display()
	{
		System.out.println("This is parent class...");
	}
}
class child  extends parent
{
	void display1()
	{
		System.out.println("This is child class....");
	}
}
public class pgm3_parentchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj1= new parent();
		child obj2 = new child();
		obj1.display();
		obj2.display1();
		obj2.display();
	}

}
