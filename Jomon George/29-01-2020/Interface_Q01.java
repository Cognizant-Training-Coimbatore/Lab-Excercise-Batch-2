package Exercise;

interface printable
{
	void print();
}

class Rectangle implements printable{
	public void print()
	{
		System.out.println("This is a rectangle");
	}
}
class SportCar implements printable{
	public void print()
	{
		System.out.println("This is a SportCar");
	}
}
class Manager implements printable{
	public void print()
	{
		System.out.println("This is a Manager");
	}
}
public class Interface_Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle obj1 = new Rectangle();
		obj1.print();
		SportCar obj2 = new SportCar();
		obj2.print();
		Manager obj3 = new Manager();
		obj3.print();
		
		
	}

}
