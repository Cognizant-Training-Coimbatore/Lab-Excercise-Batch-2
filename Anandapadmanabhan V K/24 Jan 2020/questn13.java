class parent
{
	void display()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	void dis()
	{
		System.out.println("This is child class");
	}
}
public class questn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj=new parent();
		child obj1=new child();
		obj.display();
		obj1.dis();
		obj1.display();
		
	}

}
