interface print
{
	void display_Rectangle();
	void display_Sports_car();
	void display_Manager();
	
}

class Rectangle1 implements print

{
	public void display_Rectangle()
	{
		int length=10;
		int width=5;
		int area=length*width;
		System.out.println("The area of the rectangle is "+(area));
	}
	
}
class SportsCar1 implements print
{
	public void display_Sports_car()
	{
		String carname="audi";
		int engine_power=250;
		System.out.println("The name of the car: "+carname+" Horsepower: "+250+"cc");
		
	}
}

class Manager1 implements print
{
	public void display_Manager()
	{
		String name="mohan";
		String department="Mechanical";
		System.out.println("Manager name: "+name+" Department: "+department);
			
	}
}
public class day29_Q1 
{

	public static void main(String[] args) 
	{
	
		Rectangle1 r=new Rectangle1();
		r.display_Rectangle();
		SportsCar1 s=new SportsCar1();
		s.display_Sports_car();
		Manager1 m=new Manager1();
		m.display_Manager();
	}

}
