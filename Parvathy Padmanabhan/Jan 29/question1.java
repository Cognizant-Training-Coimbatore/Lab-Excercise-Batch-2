interface Printable
{
	String name = "Interface" , feature ="Value cannot be changed";
	void display();
	
}
class Rectangle implements Printable
{
	public void display()
	{
		String id = "Rectangle";
		System.out.println(name + feature + id);
	
	}
}
class SportCar implements Printable
{
	public void display()
	{
		String id = "SportCar";
		System.out.println(name + feature + id);
	
	}
}
class Manager implements Printable
{
	public void display()
	{
		String id = "Manager";
		System.out.println(name + feature + id);
	
	}
}
public class question1 {

	public static void main(String[] args) 
	{
		Rectangle obj = new Rectangle();
		SportCar obj1 = new SportCar();
		Manager obj2 = new Manager();
		obj1.display();
		obj.display();
		obj2.display();
	}

}
