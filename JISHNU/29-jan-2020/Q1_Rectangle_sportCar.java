package javasersion8;
interface print
{
	void output();
}
class Rectangle implements print
{
	int length,width;
	int area=length*width;
	Rectangle (int a, int b)
	{
		length=a;
		width=b;
	}
	public void output()
	{
		System.out.println("Length = "+length+" Width = "+width);
	}
}
class SportCar implements print
{
	int power,maxspeed;
	SportCar(int a,int b)
	{
		power=a;
		maxspeed=b;
	}
	public void output()
	{
		System.out.println("Power = "+power+" Maximum Speed = "+maxspeed);
	}
	
}
class Manager implements print
{
	int salary,experience;
	Manager(int a, int b)
	{
		salary=a;
		experience=b;
	}
	public void output()
	{
		System.out.println("Salary = "+salary+" Experience = "+experience);
	}
	
}

public class Q1_Rectangle_sportCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj1=new Rectangle(120, 12);
		SportCar obj2=new SportCar(1000, 200);
		Manager obj3=new Manager(10000, 5);
		obj1.output();
		obj2.output();
		obj3.output();

	}

}
