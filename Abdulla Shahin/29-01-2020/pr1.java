interface printable
{
	void display();
	int area = 324;
	String name = "mustang";
	String dept = "finance";
}

class rectangle implements printable
{
	public void display()
	{
		System.out.println(area);
	}
}
class sportCar implements printable
{
	public void display()
	{
		System.out.println(name);
	}
}
class manager implements printable
{
	public void display()
	{
		System.out.println(dept);
	}
}
public class pr1 {

	public static void main(String[] args) 
	{
		rectangle obj1 = new rectangle();
		obj1.display();
		sportCar obj2 = new sportCar();
		obj2.display();
		manager obj3 = new manager();
		obj3.display();
		
	}

}
