interface printable
{
	void display_Rectangle();
	void display_Sports_car();
	void display_Manager();
	
}

class Rectangle implements printable

{
	public void display_Rectangle()
	{
		int length=10;
		int width=5;
		int area=length*width;
		System.out.println("The area of the rectangle is "+(area));
	}
	
}
class SportCar implements printable
{
	public void display_Sports_car()
	{
		String carname="Ferrari";
		int engine_power=250;
		System.out.println("The name of the car: "+carname+" Horsepower: "+250+"cc");
		
	}
}

class Manager implements printable
{
	public void display_Manager()
	{
		String name="Binoosh";
		String department="Mechanical";
		System.out.println("Manager name: "+name+" Department "+department);
			
	}
}
public class question1_Rectangle_car_manager {

	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.display_Rectangle();
		SportCar s=new SportCar();
		s.display_Sports_car();
		Manager m=new Manager();
		m.display_Manager();
	}

}

