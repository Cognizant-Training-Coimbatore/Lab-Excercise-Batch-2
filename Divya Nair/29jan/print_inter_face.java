package pack;

	
interface printinterface
{
	void display();		// cannot create normal method
	
}
class Rect implements printinterface
{

	@Override
	public void display() {

		System.out.println("This is a rectangle..");
	}
	
}
class Sportcar implements printinterface
{

	@Override
	public void display() {
		System.out.println("This is a Sportcar..");
		
	}
	
}
class Manager implements printinterface
{

	@Override
	public void display() {
		System.out.println("This is for manager...");
		
	}
	
}

public class print_inter_face {

	public static void main(String[] args)
	{
		Rect obj1=new Rect();
		obj1.display();
		Sportcar obj2=new Sportcar();
		obj2.display();
		Manager obj3=new Manager();
		obj3.display();

	}

}
